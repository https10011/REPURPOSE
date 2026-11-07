package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b9 implements g9, DialogInterface.OnClickListener {
    public g6 a;
    public c9 b;
    public CharSequence c;
    public final /* synthetic */ b d;

    public b9(b bVar) {
        this.d = bVar;
    }

    @Override // defpackage.g9
    public final boolean a() {
        g6 g6Var = this.a;
        if (g6Var != null) {
            return g6Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.g9
    public final int b() {
        return 0;
    }

    @Override // defpackage.g9
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.g9
    public final void dismiss() {
        g6 g6Var = this.a;
        if (g6Var != null) {
            g6Var.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.g9
    public final void f(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.g9
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g9
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g9
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g9
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.g9
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        b bVar = this.d;
        f6 f6Var = new f6(bVar.getPopupContext());
        b6 b6Var = (b6) f6Var.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            b6Var.e = charSequence;
        }
        c9 c9Var = this.b;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        b6Var.s = c9Var;
        b6Var.t = this;
        b6Var.v = selectedItemPosition;
        b6Var.u = true;
        g6 g6VarA = f6Var.a();
        this.a = g6VarA;
        AlertController.RecycleListView recycleListView = g6VarA.f.f;
        recycleListView.setTextDirection(i);
        recycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.g9
    public final int n() {
        return 0;
    }

    @Override // defpackage.g9
    public final CharSequence o() {
        return this.c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        b bVar = this.d;
        bVar.setSelection(i);
        if (bVar.getOnItemClickListener() != null) {
            bVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.g9
    public final void p(ListAdapter listAdapter) {
        this.b = (c9) listAdapter;
    }
}
