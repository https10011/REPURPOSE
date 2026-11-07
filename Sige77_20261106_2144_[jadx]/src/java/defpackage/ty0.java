package defpackage;

import android.widget.AbsListView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ty0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ vy0 a;

    public ty0(vy0 vy0Var) {
        this.a = vy0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        vy0 vy0Var = this.a;
        sy0 sy0Var = vy0Var.e0;
        s8 s8Var = vy0Var.m0;
        if (i != 1 || s8Var.getInputMethodMode() == 2 || s8Var.getContentView() == null) {
            return;
        }
        vy0Var.i0.removeCallbacks(sy0Var);
        sy0Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
