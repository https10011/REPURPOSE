package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class hv1 extends q10 {
    public Dialog a1;
    public DialogInterface.OnCancelListener b1;
    public AlertDialog c1;

    @Override // defpackage.q10
    public final Dialog Q(Bundle bundle) {
        Dialog dialog = this.a1;
        if (dialog != null) {
            return dialog;
        }
        this.R0 = false;
        if (this.c1 == null) {
            Context contextI = i();
            gu2.o(contextI);
            this.c1 = new AlertDialog.Builder(contextI).create();
        }
        return this.c1;
    }

    @Override // defpackage.q10, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.b1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
