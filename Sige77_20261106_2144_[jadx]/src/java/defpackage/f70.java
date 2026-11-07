package defpackage;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f70 extends l02 {
    public static final e70 d = new e70();
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;

    public f70(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            int iCeil = (int) Math.ceil(i / 0.75f);
            this.a = new HashMap(iCeil);
            this.b = new HashMap(iCeil);
            this.c = new HashMap(iCeil);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r5 = (Enum) field2.get(null);
                String strName = r5.name();
                String string = r5.toString();
                cp1 cp1Var = (cp1) field2.getAnnotation(cp1.class);
                if (cp1Var != null) {
                    strName = cp1Var.value();
                    for (String str : cp1Var.alternate()) {
                        this.a.put(str, r5);
                    }
                }
                this.a.put(strName, r5);
                this.b.put(string, r5);
                this.c.put(r5, strName);
            }
        } catch (IllegalAccessException e) {
            e.b(e);
            throw null;
        }
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() == 9) {
            au0Var.D();
            return null;
        }
        String strM = au0Var.M();
        Enum r0 = (Enum) this.a.get(strM);
        return r0 == null ? (Enum) this.b.get(strM) : r0;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        eu0Var.B(r2 == null ? null : (String) this.c.get(r2));
    }
}
