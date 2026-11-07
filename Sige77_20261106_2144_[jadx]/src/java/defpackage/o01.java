package defpackage;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o01 {
    public final AccessToken a;
    public final AuthenticationToken b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public o01(AccessToken accessToken, AuthenticationToken authenticationToken, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2) {
        this.a = accessToken;
        this.b = authenticationToken;
        this.c = linkedHashSet;
        this.d = linkedHashSet2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o01)) {
            return false;
        }
        o01 o01Var = (o01) obj;
        return Intrinsics.areEqual(this.a, o01Var.a) && Intrinsics.areEqual(this.b, o01Var.b) && Intrinsics.areEqual(this.c, o01Var.c) && Intrinsics.areEqual(this.d, o01Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.a + ", authenticationToken=" + this.b + ", recentlyGrantedPermissions=" + this.c + ", recentlyDeniedPermissions=" + this.d + ')';
    }
}
