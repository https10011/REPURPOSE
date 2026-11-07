package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zo3 extends bj0 {
    public final /* synthetic */ int j;

    public /* synthetic */ zo3(int i) {
        this.j = i;
    }

    @Override // defpackage.bj0
    public final long q() {
        switch (this.j) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
