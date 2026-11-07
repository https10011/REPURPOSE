package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class et1 extends e4 implements g31 {
    public Context c;
    public ActionBarContextView d;
    public f91 e;
    public WeakReference f;
    public boolean i;
    public i31 v;

    @Override // defpackage.e4
    public final void a() {
        if (this.i) {
            return;
        }
        this.i = true;
        this.e.f(this);
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
        return ((d4) this.e.b).d(this, menuItem);
    }

    @Override // defpackage.e4
    public final i31 d() {
        return this.v;
    }

    @Override // defpackage.e4
    public final MenuInflater e() {
        return new kv1(this.d.getContext());
    }

    @Override // defpackage.e4
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.g31
    public final void g(i31 i31Var) {
        i();
        z3 z3Var = this.d.d;
        if (z3Var != null) {
            z3Var.l();
        }
    }

    @Override // defpackage.e4
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // defpackage.e4
    public final void i() {
        this.e.e(this, this.v);
    }

    @Override // defpackage.e4
    public final boolean j() {
        return this.d.i0;
    }

    @Override // defpackage.e4
    public final void k(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.e4
    public final void l(int i) {
        m(this.c.getString(i));
    }

    @Override // defpackage.e4
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.e4
    public final void n(int i) {
        o(this.c.getString(i));
    }

    @Override // defpackage.e4
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.e4
    public final void p(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
