package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qe2 {
    public final String a;
    public String b;
    public final xd2 c;
    public Class d;
    public final Field e;
    public Method f;
    public Method g;
    public final HashMap h = new HashMap();

    public qe2(String str, xd2 xd2Var) {
        Field declaredField;
        this.b = str;
        this.a = str;
        this.c = xd2Var;
        try {
            declaredField = xd2Var.a.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        this.e = declaredField;
        if (declaredField == null || !declaredField.isAnnotationPresent(i02.class)) {
            return;
        }
        a((i02) declaredField.getAnnotation(i02.class));
    }

    public final void a(i02 i02Var) {
        this.b = i02Var.name().length() > 0 ? i02Var.name() : this.a;
        if (i02Var.transformer() != xf2.class) {
            i02Var.transformer();
        }
        if (i02Var.objectFactory() != jb2.class) {
            i02Var.objectFactory();
        }
        i02Var.include();
    }

    public final void b(Method method) {
        if (this.d == null) {
            this.d = method.getReturnType();
            this.f = method;
            method.setAccessible(true);
        } else if (method.getReturnType().isAssignableFrom(this.d)) {
            this.f = method;
            method.setAccessible(true);
        }
        Method method2 = this.f;
        if (method2 == null || !method2.isAnnotationPresent(i02.class)) {
            return;
        }
        a((i02) this.f.getAnnotation(i02.class));
    }

    public final Method c() {
        xd2 xd2Var;
        xd2 xd2Var2;
        qe2 qe2Var;
        if (this.f == null && (xd2Var2 = (xd2Var = this.c).b) != null) {
            String str = this.a;
            if (xd2Var2.c(str)) {
                xd2 xd2Var3 = xd2Var.b;
                xd2Var3.getClass();
                while (xd2Var3 != null) {
                    qe2Var = (qe2) xd2Var3.c.get(str);
                    if (qe2Var != null) {
                        return qe2Var.c();
                    }
                    xd2Var3 = xd2Var3.b;
                }
                qe2Var = null;
                return qe2Var.c();
            }
        }
        return this.f;
    }

    public final Method d() {
        xd2 xd2Var;
        xd2 xd2Var2;
        qe2 qe2Var;
        if (this.g == null) {
            Method method = (Method) this.h.get(this.d);
            this.g = method;
            if (method == null && (xd2Var2 = (xd2Var = this.c).b) != null) {
                String str = this.a;
                if (xd2Var2.c(str)) {
                    xd2 xd2Var3 = xd2Var.b;
                    xd2Var3.getClass();
                    while (xd2Var3 != null) {
                        qe2Var = (qe2) xd2Var3.c.get(str);
                        if (qe2Var != null) {
                            return qe2Var.d();
                        }
                        xd2Var3 = xd2Var3.b;
                    }
                    qe2Var = null;
                    return qe2Var.d();
                }
            }
        }
        return this.g;
    }

    public qe2(Field field, xd2 xd2Var) {
        String name = field.getName();
        this.b = name;
        this.a = name;
        this.c = xd2Var;
        this.e = field;
        this.d = field.getType();
        if (field.isAnnotationPresent(i02.class)) {
            a((i02) field.getAnnotation(i02.class));
        }
    }
}
