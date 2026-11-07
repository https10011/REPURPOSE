package defpackage;

import com.linecorp.linesdk.LineIdToken;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zr0 {
    public final er0 a;
    public final List b;
    public final LineIdToken c;

    public zr0(er0 er0Var, List list, LineIdToken lineIdToken) {
        this.a = er0Var;
        this.b = Collections.unmodifiableList(list);
        this.c = lineIdToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zr0.class != obj.getClass()) {
            return false;
        }
        zr0 zr0Var = (zr0) obj;
        if (!this.a.equals(zr0Var.a) || !this.b.equals(zr0Var.b)) {
            return false;
        }
        LineIdToken lineIdToken = zr0Var.c;
        LineIdToken lineIdToken2 = this.c;
        if (lineIdToken2 != null) {
            return lineIdToken2.equals(lineIdToken);
        }
        return lineIdToken == null;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        LineIdToken lineIdToken = this.c;
        return iHashCode + (lineIdToken != null ? lineIdToken.hashCode() : 0);
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=#####, scopes=" + this.b + ", idToken=" + this.c + '}';
    }
}
