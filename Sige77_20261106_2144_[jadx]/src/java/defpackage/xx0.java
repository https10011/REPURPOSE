package defpackage;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xx0 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((kg1) this.k.get(i2)).a;
            yf1 yf1Var = (yf1) view3.getLayoutParams();
            if (view3 != view && !yf1Var.a.h() && (iB = (yf1Var.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((yf1) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(dg1 dg1Var) {
        List list = this.k;
        if (list == null) {
            View viewD = dg1Var.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((kg1) this.k.get(i)).a;
            yf1 yf1Var = (yf1) view.getLayoutParams();
            if (!yf1Var.a.h() && this.d == yf1Var.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
