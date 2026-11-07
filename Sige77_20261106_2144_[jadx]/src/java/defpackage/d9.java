package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d9 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d9(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                f9 f9Var = (f9) obj;
                b bVar = f9Var.t0;
                bVar.setSelection(i);
                if (bVar.getOnItemClickListener() != null) {
                    bVar.performItemClick(view, i, f9Var.q0.getItemId(i));
                }
                f9Var.dismiss();
                break;
            case 1:
                b21 b21Var = (b21) obj;
                vy0 vy0Var = b21Var.e;
                if (i < 0) {
                    item = !vy0Var.m0.isShowing() ? null : vy0Var.c.getSelectedItem();
                } else {
                    item = b21Var.getAdapter().getItem(i);
                }
                b21Var.setText(b21Var.convertSelectionToString(item), false);
                AdapterView.OnItemClickListener onItemClickListener = b21Var.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !vy0Var.m0.isShowing() ? null : vy0Var.c.getSelectedView();
                        i = !vy0Var.m0.isShowing() ? -1 : vy0Var.c.getSelectedItemPosition();
                        j = !vy0Var.m0.isShowing() ? Long.MIN_VALUE : vy0Var.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(vy0Var.c, view, i, j);
                }
                vy0Var.dismiss();
                break;
            default:
                ((SearchView) obj).n(i);
                break;
        }
    }
}
