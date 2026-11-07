package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e81 extends pg2 implements en0 {
    public final Object b;

    public e81(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.b = obj;
    }

    public static en0 H(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof en0 ? (en0) iInterfaceQueryLocalInterface : new nu2(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object I(en0 en0Var) {
        if (en0Var instanceof e81) {
            return ((e81) en0Var).b;
        }
        IBinder iBinderAsBinder = en0Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            e.g(ck1.s(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        gu2.o(field);
        if (field.isAccessible()) {
            e.g("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
