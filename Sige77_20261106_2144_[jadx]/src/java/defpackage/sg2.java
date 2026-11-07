package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sg2 {
    public final j7 a;
    public final Feature b;

    public /* synthetic */ sg2(j7 j7Var, Feature feature) {
        this.a = j7Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sg2)) {
            return false;
        }
        sg2 sg2Var = (sg2) obj;
        return jw.j(this.a, sg2Var.a) && jw.j(this.b, sg2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        hs1 hs1Var = new hs1(this);
        hs1Var.e(this.a, "key");
        hs1Var.e(this.b, "feature");
        return hs1Var.toString();
    }
}
