package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gi1 implements kw1 {
    public final rv a;
    public final View b;

    public gi1(View view) {
        am2.p(view, "Argument must not be null");
        this.b = view;
        this.a = new rv(view);
    }

    @Override // defpackage.kw1
    public final void c(er1 er1Var) {
        this.a.b.remove(er1Var);
    }

    @Override // defpackage.kw1
    public final void e(er1 er1Var) {
        rv rvVar = this.a;
        ArrayList arrayList = rvVar.b;
        View view = rvVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = rvVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = rvVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            er1Var.m(iA, iA2);
            return;
        }
        if (!arrayList.contains(er1Var)) {
            arrayList.add(er1Var);
        }
        if (rvVar.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            qv qvVar = new qv(rvVar);
            rvVar.c = qvVar;
            viewTreeObserver.addOnPreDrawListener(qvVar);
        }
    }

    @Override // defpackage.kw1
    public final void f(xh1 xh1Var) {
        this.b.setTag(2131296512, xh1Var);
    }

    @Override // defpackage.kw1
    public final xh1 h() {
        Object tag = this.b.getTag(2131296512);
        if (tag != null) {
            if (tag instanceof xh1) {
                return (xh1) tag;
            }
            e.g("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.kw1
    public final void i(Drawable drawable) {
        rv rvVar = this.a;
        ViewTreeObserver viewTreeObserver = rvVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(rvVar.c);
        }
        rvVar.c = null;
        rvVar.b.clear();
    }

    public final String toString() {
        return "Target for: " + this.b;
    }

    @Override // defpackage.uw0
    public final void b() {
    }

    @Override // defpackage.uw0
    public final void j() {
    }

    @Override // defpackage.uw0
    public final void k() {
    }

    @Override // defpackage.kw1
    public final void a(Drawable drawable) {
    }

    @Override // defpackage.kw1
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.kw1
    public final void d(Object obj, oz1 oz1Var) {
    }
}
