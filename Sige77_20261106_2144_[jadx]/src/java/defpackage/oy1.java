package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oy1 implements View.OnClickListener {
    public final t3 a;
    public final /* synthetic */ qy1 b;

    public oy1(qy1 qy1Var) {
        this.b = qy1Var;
        Context context = qy1Var.a.getContext();
        CharSequence charSequence = qy1Var.h;
        t3 t3Var = new t3();
        t3Var.e = 4096;
        t3Var.g = 4096;
        t3Var.l = null;
        t3Var.m = null;
        t3Var.n = false;
        t3Var.o = false;
        t3Var.p = 16;
        t3Var.i = context;
        t3Var.a = charSequence;
        this.a = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        qy1 qy1Var = this.b;
        Window.Callback callback = qy1Var.k;
        if (callback == null || !qy1Var.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
