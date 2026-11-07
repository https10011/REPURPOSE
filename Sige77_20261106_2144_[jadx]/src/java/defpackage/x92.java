package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class x92 extends zi0 {
    public final WindowInsetsController f;
    public final ox1 g;
    public final Window h;

    public x92(Window window, ox1 ox1Var) {
        this.f = window.getInsetsController();
        this.g = ox1Var;
        this.h = window;
    }

    @Override // defpackage.zi0
    public final void A(int i) {
        if ((i & 8) != 0) {
            ((kj0) this.g.a).P();
        }
        this.f.show(i & (-9));
    }

    public final void H(int i) {
        View decorView = this.h.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.zi0
    public final void p(int i) {
        if ((i & 8) != 0) {
            ((kj0) this.g.a).M();
        }
        this.f.hide(i & (-9));
    }

    @Override // defpackage.zi0
    public void x(boolean z) {
        Window window = this.h;
        if (window != null) {
            if (!z) {
                H(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.zi0
    public void y(boolean z) {
        Window window = this.h;
        if (window != null) {
            if (!z) {
                H(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.f;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.zi0
    public void z() {
        Window window = this.h;
        if (window == null) {
            this.f.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        H(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }
}
