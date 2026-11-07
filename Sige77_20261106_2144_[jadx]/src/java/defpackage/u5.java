package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u5 implements ss {
    public final ss a;
    public final float b;

    public u5(float f, ss ssVar) {
        while (ssVar instanceof u5) {
            ssVar = ((u5) ssVar).a;
            f += ((u5) ssVar).b;
        }
        this.a = ssVar;
        this.b = f;
    }

    @Override // defpackage.ss
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.a.equals(u5Var.a) && this.b == u5Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
