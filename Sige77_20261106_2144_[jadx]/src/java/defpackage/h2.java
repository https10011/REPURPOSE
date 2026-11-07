package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h2 {
    public final String a;
    public final long b;
    public final List c;

    public h2(String str, long j, List list) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2.class != obj.getClass()) {
            return false;
        }
        h2 h2Var = (h2) obj;
        if (this.b == h2Var.b && this.a.equals(h2Var.a)) {
            return this.c.equals(h2Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.c.hashCode() + ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        return "AccessTokenVerificationResult{channelId='" + this.a + "', expiresInMillis=" + this.b + ", scopes=" + this.c + '}';
    }
}
