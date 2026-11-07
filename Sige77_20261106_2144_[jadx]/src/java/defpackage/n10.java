package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n10 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ q10 a;

    public n10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        q10 q10Var = this.a;
        Dialog dialog = q10Var.V0;
        if (dialog != null) {
            q10Var.onDismiss(dialog);
        }
    }
}
