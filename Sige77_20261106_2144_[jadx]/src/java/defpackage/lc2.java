package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lc2 implements Delayed {
    public final long a;
    public final boolean b;

    public lc2(long j, boolean z) {
        this.a = SystemClock.elapsedRealtime() + j;
        this.b = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        long j = this.a;
        long j2 = ((lc2) delayed).a;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.a - SystemClock.elapsedRealtime(), TimeUnit.MILLISECONDS);
    }
}
