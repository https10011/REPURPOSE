package defpackage;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r53 extends h8 {
    public final /* synthetic */ int c;

    public r53(byte[] bArr, int i) throws GeneralSecurityException {
        this.c = i;
        if (!ck1.i(1)) {
            tv2.f("Can not use ChaCha20Poly1305 in FIPS-mode.");
            throw null;
        }
        this.a = p(bArr, 1);
        this.b = p(bArr, 0);
    }

    @Override // defpackage.h8
    public final sn p(byte[] bArr, int i) {
        switch (this.c) {
            case 0:
                return new k53(bArr, i, 0);
            default:
                return new k53(bArr, i, 1);
        }
    }
}
