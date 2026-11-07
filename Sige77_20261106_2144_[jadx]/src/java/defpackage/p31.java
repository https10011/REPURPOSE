package defpackage;

import android.view.ActionProvider;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p31 implements ActionProvider.VisibilityListener {
    public ri2 a;
    public final ActionProvider b;

    public p31(s31 s31Var, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ri2 ri2Var = this.a;
        if (ri2Var != null) {
            i31 i31Var = ((o31) ri2Var.a).n;
            i31Var.h = true;
            i31Var.p(true);
        }
    }
}
