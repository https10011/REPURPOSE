package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m10 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ q10 a;

    public m10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        q10 q10Var = this.a;
        Dialog dialog = q10Var.V0;
        if (dialog != null) {
            q10Var.onCancel(dialog);
        }
    }
}
