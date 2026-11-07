package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class k92 extends j92 {
    public k92(u92 u92Var, WindowInsets windowInsets) {
        super(u92Var, windowInsets);
    }

    @Override // defpackage.r92
    public u92 a() {
        return u92.h(null, this.c.consumeDisplayCutout());
    }

    @Override // defpackage.i92, defpackage.r92
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k92)) {
            return false;
        }
        k92 k92Var = (k92) obj;
        return Objects.equals(this.c, k92Var.c) && Objects.equals(this.g, k92Var.g) && i92.J(this.h, k92Var.h);
    }

    @Override // defpackage.r92
    public j20 g() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j20(displayCutout);
    }

    @Override // defpackage.r92
    public int hashCode() {
        return this.c.hashCode();
    }
}
