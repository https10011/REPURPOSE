package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hw implements hv0 {
    public final hv0 b;
    public final hv0 c;

    public hw(hv0 hv0Var, hv0 hv0Var2) {
        this.b = hv0Var;
        this.c = hv0Var2;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof hw) {
            hw hwVar = (hw) obj;
            if (this.b.equals(hwVar.b) && this.c.equals(hwVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
