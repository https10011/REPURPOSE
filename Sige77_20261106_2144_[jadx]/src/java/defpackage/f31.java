package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f31 extends BaseAdapter {
    public final i31 a;
    public int b = -1;
    public boolean c;
    public final boolean d;
    public final LayoutInflater e;
    public final int f;

    public f31(i31 i31Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = i31Var;
        this.f = i;
        a();
    }

    public final void a() {
        i31 i31Var = this.a;
        o31 o31Var = i31Var.v;
        if (o31Var != null) {
            i31Var.i();
            ArrayList arrayList = i31Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o31) arrayList.get(i)) == o31Var) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o31 getItem(int i) {
        ArrayList arrayListL;
        boolean z = this.d;
        i31 i31Var = this.a;
        if (z) {
            i31Var.i();
            arrayListL = i31Var.j;
        } else {
            arrayListL = i31Var.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o31) arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z = this.d;
        i31 i31Var = this.a;
        if (z) {
            i31Var.i();
            arrayListL = i31Var.j;
        } else {
            arrayListL = i31Var.l();
        }
        return this.b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        d41 d41Var = (d41) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        d41Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
