package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nm extends ViewOutlineProvider {
    public final /* synthetic */ Chip a;

    public nm(Chip chip) {
        this.a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        pm pmVar = this.a.e;
        if (pmVar != null) {
            pmVar.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
