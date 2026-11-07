package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tu1 extends i31 implements SubMenu {
    public final o31 A;
    public final i31 z;

    public tu1(Context context, i31 i31Var, o31 o31Var) {
        super(context);
        this.z = i31Var;
        this.A = o31Var;
    }

    @Override // defpackage.i31
    public final boolean d(o31 o31Var) {
        return this.z.d(o31Var);
    }

    @Override // defpackage.i31
    public final boolean e(i31 i31Var, MenuItem menuItem) {
        return super.e(i31Var, menuItem) || this.z.e(i31Var, menuItem);
    }

    @Override // defpackage.i31
    public final boolean f(o31 o31Var) {
        return this.z.f(o31Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.i31
    public final String j() {
        o31 o31Var = this.A;
        int i = o31Var != null ? o31Var.a : 0;
        if (i == 0) {
            return null;
        }
        return ck1.r(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.i31
    public final i31 k() {
        return this.z.k();
    }

    @Override // defpackage.i31
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.i31
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.i31
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.i31, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.i31, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
