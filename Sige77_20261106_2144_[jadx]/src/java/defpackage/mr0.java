package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mr0 extends AbstractOwnableSynchronizer implements Runnable {
    public final nr0 a;

    public mr0(nr0 nr0Var) {
        this.a = nr0Var;
    }

    public static void a(mr0 mr0Var, Thread thread) {
        mr0Var.setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
