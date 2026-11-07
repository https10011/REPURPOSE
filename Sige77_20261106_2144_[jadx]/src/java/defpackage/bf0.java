package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bf0 extends WeakReference {
    public final Throwable a;
    public bf0 b;
    public final long c;
    public final int d;

    public bf0(df0 df0Var, Throwable th, bf0 bf0Var, ReferenceQueue referenceQueue) {
        super(df0Var, referenceQueue);
        this.a = th;
        this.b = bf0Var;
        this.c = Thread.currentThread().getId();
        this.d = System.identityHashCode(df0Var);
    }
}
