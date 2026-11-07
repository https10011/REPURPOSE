package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class uf1 {
    public kj0 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(kg1 kg1Var) {
        RecyclerView recyclerView;
        int i = kg1Var.j;
        if (kg1Var.f() || (i & 4) != 0 || (recyclerView = kg1Var.r) == null) {
            return;
        }
        recyclerView.F(kg1Var);
    }

    public abstract boolean a(kg1 kg1Var, kg1 kg1Var2, u61 u61Var, u61 u61Var2);

    public final void c(kg1 kg1Var) {
        kj0 kj0Var = this.a;
        if (kj0Var != null) {
            RecyclerView recyclerView = (RecyclerView) kj0Var.b;
            boolean z = true;
            kg1Var.n(true);
            View view = kg1Var.a;
            if (kg1Var.h != null && kg1Var.i == null) {
                kg1Var.h = null;
            }
            kg1Var.i = null;
            if ((kg1Var.j & 16) != 0) {
                return;
            }
            dg1 dg1Var = recyclerView.b;
            recyclerView.b0();
            ac2 ac2Var = recyclerView.e;
            jm jmVar = (jm) ac2Var.c;
            wa waVar = (wa) ac2Var.b;
            int iIndexOfChild = ((RecyclerView) waVar.b).indexOfChild(view);
            if (iIndexOfChild == -1) {
                ac2Var.T(view);
            } else if (jmVar.d(iIndexOfChild)) {
                jmVar.f(iIndexOfChild);
                ac2Var.T(view);
                waVar.m(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                kg1 kg1VarI = RecyclerView.I(view);
                dg1Var.k(kg1VarI);
                dg1Var.h(kg1VarI);
            }
            recyclerView.c0(!z);
            if (z || !kg1Var.j()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(kg1 kg1Var);

    public abstract void e();

    public abstract boolean f();
}
