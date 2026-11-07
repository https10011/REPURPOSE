package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q82 extends e4 implements g31 {
    public final Context c;
    public final i31 d;
    public f91 e;
    public WeakReference f;
    public final /* synthetic */ r82 i;

    public q82(r82 r82Var, Context context, f91 f91Var) {
        this.i = r82Var;
        this.c = context;
        this.e = f91Var;
        i31 i31Var = new i31(context);
        i31Var.l = 1;
        this.d = i31Var;
        i31Var.e = this;
    }

    @Override // defpackage.e4
    public final void a() {
        r82 r82Var = this.i;
        if (r82Var.i != this) {
            return;
        }
        if (r82Var.p) {
            r82Var.j = this;
            r82Var.k = this.e;
        } else {
            this.e.f(this);
        }
        this.e = null;
        r82Var.p(false);
        ActionBarContextView actionBarContextView = r82Var.f;
        if (actionBarContextView.a0 == null) {
            actionBarContextView.e();
        }
        r82Var.c.setHideOnContentScrollEnabled(r82Var.u);
        r82Var.i = null;
    }

    @Override // defpackage.e4
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.g31
    public final boolean c(i31 i31Var, MenuItem menuItem) {
        f91 f91Var = this.e;
        if (f91Var != null) {
            return ((d4) f91Var.b).d(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.e4
    public final i31 d() {
        return this.d;
    }

    @Override // defpackage.e4
    public final MenuInflater e() {
        return new kv1(this.c);
    }

    @Override // defpackage.e4
    public final CharSequence f() {
        return this.i.f.getSubtitle();
    }

    @Override // defpackage.g31
    public final void g(i31 i31Var) {
        if (this.e == null) {
            return;
        }
        i();
        z3 z3Var = this.i.f.d;
        if (z3Var != null) {
            z3Var.l();
        }
    }

    @Override // defpackage.e4
    public final CharSequence h() {
        return this.i.f.getTitle();
    }

    @Override // defpackage.e4
    public final void i() {
        if (this.i.i != this) {
            return;
        }
        i31 i31Var = this.d;
        i31Var.w();
        try {
            this.e.e(this, i31Var);
        } finally {
            i31Var.v();
        }
    }

    @Override // defpackage.e4
    public final boolean j() {
        return this.i.f.i0;
    }

    @Override // defpackage.e4
    public final void k(View view) {
        this.i.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.e4
    public final void l(int i) {
        m(this.i.a.getResources().getString(i));
    }

    @Override // defpackage.e4
    public final void m(CharSequence charSequence) {
        this.i.f.setSubtitle(charSequence);
    }

    @Override // defpackage.e4
    public final void n(int i) {
        o(this.i.a.getResources().getString(i));
    }

    @Override // defpackage.e4
    public final void o(CharSequence charSequence) {
        this.i.f.setTitle(charSequence);
    }

    @Override // defpackage.e4
    public final void p(boolean z) {
        this.b = z;
        this.i.f.setTitleOptional(z);
    }
}
