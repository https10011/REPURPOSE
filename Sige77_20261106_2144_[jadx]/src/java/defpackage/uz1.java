package defpackage;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class uz1 {
    public static final hd a;
    public static final ThreadLocal b;
    public static final ArrayList c;

    static {
        hd hdVar = new hd();
        hdVar.n0 = new ArrayList();
        hdVar.q0 = false;
        hdVar.r0 = 0;
        hdVar.o0 = false;
        hdVar.M(new r90(2));
        hdVar.M(new ll());
        hdVar.M(new r90(1));
        a = hdVar;
        b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, pz1 pz1Var) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (pz1Var == null) {
            pz1Var = a;
        }
        pz1 pz1VarClone = pz1Var.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((pz1) obj).A(frameLayout);
            }
        }
        pz1VarClone.j(frameLayout, true);
        if (frameLayout.getTag(2131296833) != null) {
            ur.a();
            return;
        }
        frameLayout.setTag(2131296833, null);
        tz1 tz1Var = new tz1();
        tz1Var.a = pz1VarClone;
        tz1Var.b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(tz1Var);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(tz1Var);
    }

    public static mb b() {
        mb mbVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (mbVar = (mb) weakReference.get()) != null) {
            return mbVar;
        }
        mb mbVar2 = new mb(0);
        threadLocal.set(new WeakReference(mbVar2));
        return mbVar2;
    }
}
