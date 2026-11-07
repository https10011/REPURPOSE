package defpackage;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pw0 {
    protected final tw0 mLifecycleFragment;

    public pw0(tw0 tw0Var) {
        this.mLifecycleFragment = tw0Var;
    }

    public static tw0 getFragment(ow0 ow0Var) {
        cj2 cj2Var;
        ay2 ay2Var;
        c cVar = ow0Var.a;
        if (!(cVar instanceof c)) {
            if (cVar == null) {
                e.g("Can't get fragment for unexpected activity.");
                return null;
            }
            WeakHashMap weakHashMap = cj2.b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(cVar);
            if (weakReference != null && (cj2Var = (cj2) weakReference.get()) != null) {
                return cj2Var;
            }
            try {
                cj2 cj2Var2 = (cj2) cVar.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (cj2Var2 == null || cj2Var2.isRemoving()) {
                    cj2Var2 = new cj2();
                    cVar.getFragmentManager().beginTransaction().add(cj2Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(cVar, new WeakReference(cj2Var2));
                return cj2Var2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        c cVar2 = cVar;
        WeakHashMap weakHashMap2 = ay2.L0;
        e supportFragmentManager = cVar2.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = ay2.L0;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(cVar2);
        if (weakReference2 != null && (ay2Var = (ay2) weakReference2.get()) != null) {
            return ay2Var;
        }
        try {
            ay2 ay2Var2 = (ay2) supportFragmentManager.C("SLifecycleFragmentImpl");
            if (ay2Var2 == null || ((Fragment) ay2Var2).Y) {
                ay2Var2 = new ay2();
                pe peVar = new pe(supportFragmentManager);
                peVar.e(0, ay2Var2, "SLifecycleFragmentImpl", 1);
                peVar.d(true);
            }
            weakHashMap3.put(cVar2, new WeakReference(ay2Var2));
            return ay2Var2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    public Activity getActivity() {
        Activity activityC = this.mLifecycleFragment.c();
        gu2.o(activityC);
        return activityC;
    }

    public abstract void onStop();

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public static tw0 getFragment(Activity activity) {
        return getFragment(new ow0(activity));
    }

    public static tw0 getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
