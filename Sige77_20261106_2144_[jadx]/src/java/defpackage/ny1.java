package defpackage;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ny1 extends j3 {
    public final qy1 a;
    public final Window.Callback b;
    public final kj0 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final i4 h = new i4(this, 17);

    public ny1(Toolbar toolbar, CharSequence charSequence, f8 f8Var) {
        wa waVar = new wa(this, 20);
        qy1 qy1Var = new qy1(toolbar, false);
        this.a = qy1Var;
        f8Var.getClass();
        this.b = f8Var;
        qy1Var.k = f8Var;
        toolbar.setOnMenuItemClickListener(waVar);
        boolean z = qy1Var.g;
        if (!z) {
            qy1Var.h = charSequence;
            if ((qy1Var.b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (z) {
                    x52.o(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.c = new kj0(this, 22);
    }

    @Override // defpackage.j3
    public final boolean a() {
        z3 z3Var;
        ActionMenuView actionMenuView = this.a.a.a;
        return (actionMenuView == null || (z3Var = actionMenuView.j0) == null || !z3Var.c()) ? false : true;
    }

    @Override // defpackage.j3
    public final boolean b() {
        o31 o31Var;
        ky1 ky1Var = this.a.a.C0;
        if (ky1Var == null || (o31Var = ky1Var.b) == null) {
            return false;
        }
        if (ky1Var == null) {
            o31Var = null;
        }
        if (o31Var == null) {
            return true;
        }
        o31Var.collapseActionView();
        return true;
    }

    @Override // defpackage.j3
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ur.a();
    }

    @Override // defpackage.j3
    public final int d() {
        return this.a.b;
    }

    @Override // defpackage.j3
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // defpackage.j3
    public final boolean f() {
        qy1 qy1Var = this.a;
        Toolbar toolbar = qy1Var.a;
        i4 i4Var = this.h;
        toolbar.removeCallbacks(i4Var);
        Toolbar toolbar2 = qy1Var.a;
        WeakHashMap weakHashMap = x52.a;
        toolbar2.postOnAnimation(i4Var);
        return true;
    }

    @Override // defpackage.j3
    public final void h() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // defpackage.j3
    public final boolean i(int i, KeyEvent keyEvent) {
        Menu menuP = p();
        if (menuP == null) {
            return false;
        }
        menuP.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuP.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.j3
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // defpackage.j3
    public final boolean k() {
        return this.a.a.v();
    }

    @Override // defpackage.j3
    public final void n(CharSequence charSequence) {
        qy1 qy1Var = this.a;
        if (qy1Var.g) {
            return;
        }
        Toolbar toolbar = qy1Var.a;
        qy1Var.h = charSequence;
        if ((qy1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (qy1Var.g) {
                x52.o(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z = this.e;
        qy1 qy1Var = this.a;
        if (!z) {
            ci ciVar = new ci(this);
            gk1 gk1Var = new gk1(this, 19);
            Toolbar toolbar = qy1Var.a;
            toolbar.D0 = ciVar;
            toolbar.E0 = gk1Var;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.k0 = ciVar;
                actionMenuView.l0 = gk1Var;
            }
            this.e = true;
        }
        return qy1Var.a.getMenu();
    }

    @Override // defpackage.j3
    public final void g() {
    }

    @Override // defpackage.j3
    public final void l(boolean z) {
    }

    @Override // defpackage.j3
    public final void m(boolean z) {
    }
}
