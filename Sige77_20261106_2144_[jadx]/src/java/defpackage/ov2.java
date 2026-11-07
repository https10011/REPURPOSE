package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ov2 implements Serializable {
    public final Object a;

    public ov2(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ov2) {
            return jw.E(this.a, ((ov2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return ts.k("Suppliers.ofInstance(", this.a.toString(), ")");
    }
}
