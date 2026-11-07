package defpackage;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q92 extends o92 {
    public q92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
    }

    @Override // defpackage.i92, defpackage.r92
    public List<Rect> e(int i) {
        return this.c.getBoundingRects(t92.a(i));
    }

    @Override // defpackage.i92, defpackage.r92
    public List<Rect> f(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(t92.a(i));
    }

    @Override // defpackage.i92, defpackage.r92
    public void o() {
    }
}
