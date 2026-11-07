package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q31 extends FrameLayout implements fo {
    public final CollapsibleActionView a;

    /* JADX WARN: Multi-variable type inference failed */
    public q31(View view) {
        super(view.getContext());
        this.a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.fo
    public final void onActionViewCollapsed() {
        this.a.onActionViewCollapsed();
    }

    @Override // defpackage.fo
    public final void onActionViewExpanded() {
        this.a.onActionViewExpanded();
    }
}
