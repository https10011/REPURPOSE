package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eg0 {
    public static final wq1 b = new wq1(0);
    public final /* synthetic */ e a;

    public eg0(e eVar) {
        this.a = eVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        wq1 wq1Var = b;
        wq1 wq1Var2 = (wq1) wq1Var.get(classLoader);
        if (wq1Var2 == null) {
            wq1Var2 = new wq1(0);
            wq1Var.put(classLoader, wq1Var2);
        }
        Class cls = (Class) wq1Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        wq1Var2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final Fragment a(String str) {
        try {
            return (Fragment) c(this.a.u.Y.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new xp(2, ts.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
