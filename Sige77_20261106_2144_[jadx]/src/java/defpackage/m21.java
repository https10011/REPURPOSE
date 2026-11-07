package defpackage;

import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m21 implements s81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public m21(View view, int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = view;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @Override // defpackage.s81
    public final u92 k(View view, u92 u92Var) {
        nq0 nq0VarH = u92Var.a.h(519);
        View view2 = this.b;
        int i = this.a;
        if (i >= 0) {
            view2.getLayoutParams().height = i + nq0VarH.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.c + nq0VarH.a, this.d + nq0VarH.b, this.e + nq0VarH.c, view2.getPaddingBottom());
        return u92Var;
    }
}
