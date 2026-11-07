package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j4 extends WeakReference {
    public final hv0 a;
    public final boolean b;
    public pi1 c;

    public j4(hv0 hv0Var, y60 y60Var, ReferenceQueue referenceQueue) {
        super(y60Var, referenceQueue);
        am2.p(hv0Var, "Argument must not be null");
        this.a = hv0Var;
        boolean z = y60Var.a;
        this.c = null;
        this.b = z;
    }
}
