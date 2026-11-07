package defpackage;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jm3 {
    public final gh1 a;
    public final gh1 b;
    public final UUID c;

    public jm3(gh1 gh1Var, gh1 gh1Var2, UUID uuid) {
        this.a = gh1Var;
        this.b = gh1Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jm3)) {
            return false;
        }
        jm3 jm3Var = (jm3) obj;
        return this.a.equals(jm3Var.a) && this.b.equals(jm3Var.b) && this.c.equals(jm3Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.a);
    }
}
