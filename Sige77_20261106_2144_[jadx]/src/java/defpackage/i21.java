package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.l;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i21 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i21(l lVar, int i, int i2) {
        super(i);
        this.F = lVar;
        this.E = i2;
    }

    public final void B0(hg1 hg1Var, int[] iArr) {
        l lVar = this.F;
        RecyclerView recyclerView = lVar.T0;
        if (this.E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = lVar.T0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = lVar.T0.getHeight();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y0(RecyclerView recyclerView, int i) {
        uk ukVar = new uk(recyclerView.getContext());
        ukVar.a = i;
        z0(ukVar);
    }
}
