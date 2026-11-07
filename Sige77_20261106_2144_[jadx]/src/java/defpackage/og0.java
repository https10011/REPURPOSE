package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class og0 {
    public static final ng0 a = ng0.c;

    public static ng0 a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.p()) {
                fragment.k();
            }
            fragment = fragment.h0;
        }
        return a;
    }

    public static void b(ng0 ng0Var, n72 n72Var) {
        Fragment fragment = n72Var.a;
        String name = fragment.getClass().getName();
        Set set = ng0Var.a;
        if (set.contains(mg0.a)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), n72Var);
        }
        if (set.contains(mg0.b)) {
            x4 x4Var = new x4(27, name, n72Var);
            if (!fragment.p()) {
                x4Var.run();
                throw null;
            }
            Handler handler = fragment.k().u.Z;
            handler.getClass();
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                x4Var.run();
                throw null;
            }
            handler.post(x4Var);
        }
    }

    public static void c(n72 n72Var) {
        if (e.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(n72Var.a.getClass().getName()), n72Var);
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        lg0 lg0Var = new lg0(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(lg0Var);
        ng0 ng0VarA = a(fragment);
        if (ng0VarA.a.contains(mg0.c) && e(ng0VarA, fragment.getClass(), lg0.class)) {
            b(ng0VarA, lg0Var);
        }
    }

    public static boolean e(ng0 ng0Var, Class cls, Class cls2) {
        Set set = (Set) ng0Var.b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), n72.class) || !CollectionsKt.n(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
