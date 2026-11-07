package defpackage;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zd0 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd0)) {
            return false;
        }
        zd0 zd0Var = (zd0) obj;
        return Objects.equals(this.a, zd0Var.a) && Objects.equals(this.b, zd0Var.b) && Objects.equals(this.c, zd0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
