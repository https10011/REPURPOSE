package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hk implements Runnable {
    public final /* synthetic */ int a;
    public final int b;
    public final Object c;

    public hk(List list, int i, Throwable th) {
        this.a = 1;
        r93.n(list, "initCallbacks cannot be null");
        this.c = new ArrayList(list);
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                xi0 xi0Var = (xi0) ((ri2) obj).a;
                if (xi0Var != null) {
                    xi0Var.q(i2);
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i3 = 0;
                if (i2 == 1) {
                    while (i3 < size) {
                        ((d50) arrayList.get(i3)).a();
                        i3++;
                    }
                } else {
                    while (i3 < size) {
                        ((d50) arrayList.get(i3)).getClass();
                        i3++;
                    }
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                RecyclerView recyclerView = ((l) obj).T0;
                if (!recyclerView.l0) {
                    xf1 xf1Var = recyclerView.b0;
                    if (xf1Var != null) {
                        xf1Var.y0(recyclerView, i2);
                    } else {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    }
                    break;
                }
                break;
            default:
                ((rg2) obj).c(i2);
                break;
        }
    }

    public /* synthetic */ hk(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
