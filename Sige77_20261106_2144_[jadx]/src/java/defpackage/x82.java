package defpackage;

import android.view.WindowInsetsAnimation;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x82 extends y82 {
    public final WindowInsetsAnimation e;

    public x82(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    @Override // defpackage.y82
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.y82
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.y82
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.y82
    public final void d(float f) {
        this.e.setFraction(f);
    }
}
