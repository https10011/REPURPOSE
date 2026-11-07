package defpackage;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nz0 extends AlertDialog {
    public final TextView a;

    /* JADX WARN: Multi-variable type inference failed */
    public nz0(yg ygVar) {
        super(ygVar);
        View viewInflate = LayoutInflater.from(getContext()).inflate(2131492998, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(2131296598);
        this.a = textView;
        textView.setText(getContext().getResources().getString(2131886364));
        setView(viewInflate);
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
