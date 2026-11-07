package defpackage;

import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zg1 {
    public final String a;
    public final long b;
    public final String c;
    public final List d;

    public zg1(String str, long j, String str2, List list) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zg1.class != obj.getClass()) {
            return false;
        }
        zg1 zg1Var = (zg1) obj;
        if (this.b == zg1Var.b && this.a.equals(zg1Var.a) && this.c.equals(zg1Var.c)) {
            return this.d.equals(zg1Var.d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return this.d.hashCode() + ts.f((iHashCode + ((int) (j ^ (j >>> 32)))) * 31, 31, this.c);
    }

    public final String toString() {
        return "RefreshTokenResult{accessToken='#####', expiresInMillis=" + this.b + ", refreshToken='#####', scopes=" + this.d + '}';
    }
}
