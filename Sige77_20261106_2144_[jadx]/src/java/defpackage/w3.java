package defpackage;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w3 extends v31 {
    public final /* synthetic */ int l = 1;
    public final /* synthetic */ z3 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z3 z3Var, Context context, tu1 tu1Var, View view) {
        super(context, tu1Var, view, false, 2130968611, 0);
        this.m = z3Var;
        if ((tu1Var.A.x & 32) != 32) {
            AppCompatImageView appCompatImageView = z3Var.w;
            this.e = appCompatImageView == null ? (View) z3Var.v : appCompatImageView;
        }
        pv2 pv2Var = z3Var.j0;
        this.h = pv2Var;
        t31 t31Var = this.i;
        if (t31Var != null) {
            t31Var.d(pv2Var);
        }
    }

    @Override // defpackage.v31
    public final void c() {
        int i = this.l;
        z3 z3Var = this.m;
        switch (i) {
            case 0:
                z3Var.g0 = null;
                super.c();
                break;
            default:
                i31 i31Var = z3Var.c;
                if (i31Var != null) {
                    i31Var.c(true);
                }
                z3Var.f0 = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(z3 z3Var, Context context, i31 i31Var, View view) {
        super(context, i31Var, view, true, 2130968611, 0);
        this.m = z3Var;
        this.f = 8388613;
        pv2 pv2Var = z3Var.j0;
        this.h = pv2Var;
        t31 t31Var = this.i;
        if (t31Var != null) {
            t31Var.d(pv2Var);
        }
    }
}
