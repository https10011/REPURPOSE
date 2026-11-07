package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u3 extends lf0 {
    public final /* synthetic */ int W = 0;
    public final /* synthetic */ View X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.X = actionMenuItemView;
    }

    @Override // defpackage.lf0
    public final oq1 b() {
        w3 w3Var;
        int i = this.W;
        ActionMenuItemView actionMenuItemView = this.X;
        switch (i) {
            case 0:
                v3 v3Var = actionMenuItemView.f;
                if (v3Var == null || (w3Var = ((x3) v3Var).a.g0) == null) {
                    return null;
                }
                return w3Var.a();
            default:
                w3 w3Var2 = ((y3) actionMenuItemView).d.f0;
                if (w3Var2 == null) {
                    return null;
                }
                return w3Var2.a();
        }
    }

    @Override // defpackage.lf0
    public final boolean c() {
        oq1 oq1VarB;
        int i = this.W;
        ActionMenuItemView actionMenuItemView = this.X;
        switch (i) {
            case 0:
                ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
                h31 h31Var = actionMenuItemView2.d;
                return h31Var != null && h31Var.a(actionMenuItemView2.a) && (oq1VarB = b()) != null && oq1VarB.a();
            default:
                ((y3) actionMenuItemView).d.l();
                return true;
        }
    }

    @Override // defpackage.lf0
    public boolean d() {
        switch (this.W) {
            case 1:
                z3 z3Var = ((y3) this.X).d;
                if (z3Var.h0 != null) {
                    return false;
                }
                z3Var.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u3(y3 y3Var, y3 y3Var2) {
        super(y3Var2);
        this.X = y3Var;
    }
}
