package defpackage;

import android.graphics.Insets;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class o2 {
    public static /* synthetic */ CloseGuard g() {
        return new CloseGuard();
    }

    public static /* bridge */ /* synthetic */ CloseGuard h(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* synthetic */ void n() {
    }
}
