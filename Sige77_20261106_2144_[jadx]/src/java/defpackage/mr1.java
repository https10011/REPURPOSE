package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mr1 implements xb1 {
    public final u01 a;
    public int b;
    public Bitmap.Config c;

    public mr1(u01 u01Var) {
        this.a = u01Var;
    }

    @Override // defpackage.xb1
    public final void a() {
        this.a.q(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mr1) {
            mr1 mr1Var = (mr1) obj;
            if (this.b == mr1Var.b && d42.c(this.c, mr1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return nr1.c(this.b, this.c);
    }
}
