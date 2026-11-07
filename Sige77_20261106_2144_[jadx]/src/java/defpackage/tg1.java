package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tg1 {
    public final String a;
    public final Field b;
    public final String c;
    public final /* synthetic */ Method d;
    public final /* synthetic */ l02 e;
    public final /* synthetic */ l02 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;

    public tg1(String str, Field field, Method method, l02 l02Var, l02 l02Var2, boolean z, boolean z2) {
        this.d = method;
        this.e = l02Var;
        this.f = l02Var2;
        this.g = z;
        this.h = z2;
        this.a = str;
        this.b = field;
        this.c = field.getName();
    }

    public final void a(eu0 eu0Var, Object obj) throws IllegalAccessException {
        Object objInvoke;
        Method method = this.d;
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e) {
                throw new wt0(4, ts.k("Accessor ", rg1.d(method, false), " threw exception"), e.getCause());
            }
        } else {
            objInvoke = this.b.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        eu0Var.m(this.a);
        this.e.c(eu0Var, objInvoke);
    }
}
