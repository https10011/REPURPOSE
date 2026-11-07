package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fg3 {
    public final Class a;
    public final tr3 b;

    public fg3(Class cls, tr3 tr3Var) {
        this.a = cls;
        this.b = tr3Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fg3)) {
            return false;
        }
        fg3 fg3Var = (fg3) obj;
        return fg3Var.a.equals(this.a) && fg3Var.b.equals(this.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(this.b);
    }
}
