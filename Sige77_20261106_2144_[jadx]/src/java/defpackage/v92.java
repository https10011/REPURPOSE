package defpackage;

import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class v92 extends zi0 {
    public final Window f;
    public final ox1 g;

    public v92(Window window, ox1 ox1Var) {
        this.f = window;
        this.g = ox1Var;
    }

    @Override // defpackage.zi0
    public final void A(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    I(4);
                    this.f.clearFlags(1024);
                } else if (i2 == 2) {
                    I(2);
                } else if (i2 == 8) {
                    ((kj0) this.g.a).P();
                }
            }
        }
    }

    public final void H(int i) {
        View decorView = this.f.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void I(int i) {
        View decorView = this.f.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.zi0
    public final void p(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    H(4);
                } else if (i2 == 2) {
                    H(2);
                } else if (i2 == 8) {
                    ((kj0) this.g.a).M();
                }
            }
        }
    }

    @Override // defpackage.zi0
    public final void y(boolean z) {
        if (!z) {
            I(8192);
            return;
        }
        Window window = this.f;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        H(8192);
    }

    @Override // defpackage.zi0
    public final void z() {
        this.f.getDecorView().setTag(356039078, 2);
        I(2048);
        H(4096);
    }
}
