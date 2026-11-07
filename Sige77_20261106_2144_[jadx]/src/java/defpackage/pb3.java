package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pb3 implements mv2 {
    public final jf3 a;

    public pb3(jf3 jf3Var) {
        this.a = jf3Var;
    }

    @Override // defpackage.mv2
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        Iterator it = this.a.a(bArr).iterator();
        while (it.hasNext()) {
            try {
                return ((rb3) it.next()).a.zza(bArr);
            } catch (GeneralSecurityException unused) {
            }
        }
        tv2.f("decryption failed");
        return null;
    }
}
