package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xu extends DataSetObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xu(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yu1 yu1Var = (yu1) obj;
                yu1Var.a = true;
                yu1Var.notifyDataSetChanged();
                break;
            default:
                vy0 vy0Var = (vy0) obj;
                if (vy0Var.m0.isShowing()) {
                    vy0Var.c();
                }
                break;
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                yu1 yu1Var = (yu1) obj;
                yu1Var.a = false;
                yu1Var.notifyDataSetInvalidated();
                break;
            default:
                ((vy0) obj).dismiss();
                break;
        }
    }
}
