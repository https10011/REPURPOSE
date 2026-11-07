package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a6 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ e6 a;
    public final /* synthetic */ b6 b;

    public a6(b6 b6Var, e6 e6Var) {
        this.b = b6Var;
        this.a = e6Var;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        b6 b6Var = this.b;
        DialogInterface.OnClickListener onClickListener = b6Var.t;
        e6 e6Var = this.a;
        onClickListener.onClick(e6Var.b, i);
        if (b6Var.u) {
            return;
        }
        e6Var.b.dismiss();
    }
}
