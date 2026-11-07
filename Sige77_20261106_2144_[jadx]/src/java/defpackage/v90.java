package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v90 extends ag1 {
    public final /* synthetic */ x90 a;

    public v90(x90 x90Var) {
        this.a = x90Var;
    }

    @Override // defpackage.ag1
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        x90 x90Var = this.a;
        int i3 = x90Var.a;
        int iComputeVerticalScrollRange = x90Var.s.computeVerticalScrollRange();
        int i4 = x90Var.r;
        x90Var.t = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = x90Var.s.computeHorizontalScrollRange();
        int i5 = x90Var.q;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        x90Var.u = z;
        boolean z2 = x90Var.t;
        if (!z2 && !z) {
            if (x90Var.v != 0) {
                x90Var.f(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            x90Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            x90Var.k = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (x90Var.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            x90Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            x90Var.n = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = x90Var.v;
        if (i6 == 0 || i6 == 1) {
            x90Var.f(1);
        }
    }
}
