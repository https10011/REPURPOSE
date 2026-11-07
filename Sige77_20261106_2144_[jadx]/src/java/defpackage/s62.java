package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class s62 extends ns {
    public we a;
    public int b = 0;

    public s62() {
    }

    @Override // defpackage.ns
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        t(coordinatorLayout, view, i);
        if (this.a == null) {
            we weVar = new we();
            weVar.d = view;
            this.a = weVar;
        }
        we weVar2 = this.a;
        View view2 = (View) weVar2.d;
        weVar2.a = view2.getTop();
        weVar2.b = view2.getLeft();
        this.a.b();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        we weVar3 = this.a;
        if (weVar3.c != i2) {
            weVar3.c = i2;
            weVar3.b();
        }
        this.b = 0;
        return true;
    }

    public final int s() {
        we weVar = this.a;
        if (weVar != null) {
            return weVar.c;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public s62(int i) {
    }
}
