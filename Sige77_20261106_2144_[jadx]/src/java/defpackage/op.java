package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class op extends np {
    public boolean X;
    public long v;
    public final long w;
    public volatile Thread Y = Thread.currentThread();
    public final boolean W = true;

    public op(long j, long j2) {
        this.v = j;
        this.w = j2;
    }

    @Override // defpackage.np
    public final boolean o() {
        return this.Y != null;
    }

    @Override // defpackage.np
    public final qp p(int i) {
        Thread thread = this.Y;
        if (thread != null) {
            this.Y = null;
            LockSupport.unpark(thread);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f A[RETURN] */
    public final boolean q() {
        if (Thread.interrupted()) {
            this.X = true;
        }
        if (!this.X || !this.W) {
            long j = this.w;
            if (j == 0) {
                if (this.Y == null) {
                    return false;
                }
            } else if (this.v > 0) {
                long jNanoTime = j - System.nanoTime();
                this.v = jNanoTime;
                if (jNanoTime > 0) {
                    if (this.Y == null) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
