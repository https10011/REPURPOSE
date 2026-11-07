package defpackage;

import android.R;
import android.content.res.ColorStateList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o21 extends t8 {
    public static final int[][] i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iH = qt.h(this, 2130968836);
            int iH2 = qt.h(this, 2130968856);
            int iH3 = qt.h(this, 2130968879);
            this.e = new ColorStateList(i, new int[]{qt.p(1.0f, iH3, iH), qt.p(0.54f, iH3, iH2), qt.p(0.38f, iH3, iH2), qt.p(0.38f, iH3, iH2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
