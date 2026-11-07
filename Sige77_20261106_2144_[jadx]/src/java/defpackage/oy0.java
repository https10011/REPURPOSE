package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oy0 implements b41, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public i31 c;
    public ExpandedMenuView d;
    public a41 e;
    public ny0 f;

    public oy0(ContextWrapper contextWrapper) {
        this.a = contextWrapper;
        this.b = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.b41
    public final boolean b(o31 o31Var) {
        return false;
    }

    @Override // defpackage.b41
    public final void d(a41 a41Var) {
        throw null;
    }

    @Override // defpackage.b41
    public final boolean e(o31 o31Var) {
        return false;
    }

    @Override // defpackage.b41
    public final void f(i31 i31Var, boolean z) {
        a41 a41Var = this.e;
        if (a41Var != null) {
            a41Var.f(i31Var, z);
        }
    }

    @Override // defpackage.b41
    public final void g() {
        ny0 ny0Var = this.f;
        if (ny0Var != null) {
            ny0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.b41
    public final void i(Context context, i31 i31Var) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = i31Var;
        ny0 ny0Var = this.f;
        if (ny0Var != null) {
            ny0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.b41
    public final boolean j(tu1 tu1Var) {
        boolean zHasVisibleItems = tu1Var.hasVisibleItems();
        Context context = tu1Var.a;
        if (!zHasVisibleItems) {
            return false;
        }
        j31 j31Var = new j31();
        j31Var.a = tu1Var;
        f6 f6Var = new f6(context);
        b6 b6Var = (b6) f6Var.c;
        oy0 oy0Var = new oy0(b6Var.a);
        j31Var.c = oy0Var;
        oy0Var.e = j31Var;
        tu1Var.b(oy0Var, context);
        oy0 oy0Var2 = j31Var.c;
        if (oy0Var2.f == null) {
            oy0Var2.f = new ny0(oy0Var2);
        }
        b6Var.s = oy0Var2.f;
        b6Var.t = j31Var;
        View view = tu1Var.o;
        if (view != null) {
            b6Var.f = view;
        } else {
            b6Var.d = tu1Var.n;
            b6Var.e = tu1Var.m;
        }
        b6Var.q = j31Var;
        g6 g6VarA = f6Var.a();
        j31Var.b = g6VarA;
        g6VarA.setOnDismissListener(j31Var);
        WindowManager.LayoutParams attributes = j31Var.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        j31Var.b.show();
        a41 a41Var = this.e;
        if (a41Var == null) {
            return true;
        }
        a41Var.y(tu1Var);
        return true;
    }

    @Override // defpackage.b41
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.f.getItem(i), this, 0);
    }
}
