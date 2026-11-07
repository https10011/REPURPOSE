package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ny0 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ oy0 b;

    public ny0(oy0 oy0Var) {
        this.b = oy0Var;
        a();
    }

    public final void a() {
        i31 i31Var = this.b.c;
        o31 o31Var = i31Var.v;
        if (o31Var != null) {
            i31Var.i();
            ArrayList arrayList = i31Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o31) arrayList.get(i)) == o31Var) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o31 getItem(int i) {
        oy0 oy0Var = this.b;
        i31 i31Var = oy0Var.c;
        i31Var.i();
        ArrayList arrayList = i31Var.j;
        oy0Var.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o31) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        oy0 oy0Var = this.b;
        i31 i31Var = oy0Var.c;
        i31Var.i();
        int size = i31Var.j.size();
        oy0Var.getClass();
        return this.a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.b.inflate(2131492880, viewGroup, false);
        }
        ((d41) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
