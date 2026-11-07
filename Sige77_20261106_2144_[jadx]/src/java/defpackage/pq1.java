package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class pq1 implements h3 {
    public final /* synthetic */ SideSheetBehavior a;
    public final /* synthetic */ int b;

    public /* synthetic */ pq1(SideSheetBehavior sideSheetBehavior, int i) {
        this.a = sideSheetBehavior;
        this.b = i;
    }

    @Override // defpackage.h3
    public final boolean l(View view) {
        int i = this.b;
        if (i == 1 || i == 2) {
            throw new IllegalArgumentException(ts.l(new StringBuilder("STATE_"), i == 1 ? "DRAGGING" : "SETTLING", " should not be set externally."));
        }
        SideSheetBehavior sideSheetBehavior = this.a;
        WeakReference weakReference = sideSheetBehavior.p;
        if (weakReference == null || weakReference.get() == null) {
            sideSheetBehavior.s(i);
            return true;
        }
        View view2 = (View) sideSheetBehavior.p.get();
        w20 w20Var = new w20(sideSheetBehavior, i, 2);
        ViewParent parent = view2.getParent();
        if (parent != null && parent.isLayoutRequested() && view2.isAttachedToWindow()) {
            view2.post(w20Var);
            return true;
        }
        w20Var.run();
        return true;
    }
}
