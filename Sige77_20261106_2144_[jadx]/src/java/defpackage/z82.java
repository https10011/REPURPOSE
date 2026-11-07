package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z82 {
    public y82 a;

    public z82(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new x82(o2.j(i, interpolator, j));
        } else {
            this.a = new u82(i, interpolator, j);
        }
    }
}
