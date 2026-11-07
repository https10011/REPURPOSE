package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u31 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ v31 a;

    public u31(v31 v31Var) {
        this.a = v31Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
