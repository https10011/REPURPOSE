package defpackage;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gv2 extends bv2 {
    public final PublicKeyCredentialParameters a;

    public gv2(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.a = publicKeyCredentialParameters;
    }

    @Override // defpackage.bv2
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.bv2
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gv2) {
            return this.a.equals(((gv2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return ts.k("Optional.of(", this.a.toString(), ")");
    }
}
