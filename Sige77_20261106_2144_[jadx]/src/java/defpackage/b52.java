package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class b52 {
    public final mb a;
    public final mb b;
    public final mb c;

    public b52(mb mbVar, mb mbVar2, mb mbVar3) {
        this.a = mbVar;
        this.b = mbVar2;
        this.c = mbVar3;
    }

    public abstract c52 a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        mb mbVar = this.c;
        Class cls2 = (Class) mbVar.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        mbVar.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException {
        mb mbVar = this.a;
        Method method = (Method) mbVar.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b52.class.getClassLoader()).getDeclaredMethod("read", b52.class);
        mbVar.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        mb mbVar = this.b;
        Method method = (Method) mbVar.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b52.class);
        mbVar.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i);

    public final int f(int i, int i2) {
        return !e(i2) ? i : ((c52) this).e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((c52) this).e.readParcelable(c52.class.getClassLoader());
    }

    public final d52 h() {
        String string = ((c52) this).e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (d52) c(string).invoke(null, a());
        } catch (ClassNotFoundException e) {
            sm0.m("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            sm0.m("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            sm0.m("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            sm0.m("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void i(int i);

    public final void j(int i, int i2) {
        i(i2);
        ((c52) this).e.writeInt(i);
    }

    public final void k(d52 d52Var) {
        if (d52Var == null) {
            ((c52) this).e.writeString(null);
            return;
        }
        try {
            ((c52) this).e.writeString(b(d52Var.getClass()).getName());
            c52 c52VarA = a();
            try {
                d(d52Var.getClass()).invoke(null, d52Var, c52VarA);
                Parcel parcel = c52VarA.e;
                int i = c52VarA.i;
                if (i >= 0) {
                    int i2 = c52VarA.d.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                sm0.m("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                sm0.m("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                sm0.m("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                sm0.m("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            sm0.m(d52Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
