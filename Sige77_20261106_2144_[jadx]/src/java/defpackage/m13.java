package defpackage;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m13 extends x91 implements Serializable {
    public final MessageDigest e;
    public final int f;
    public final boolean i;
    public final String v;

    public m13() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.e = messageDigest;
            this.f = messageDigest.getDigestLength();
            this.v = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.i = z;
        } catch (NoSuchAlgorithmException e) {
            e.b(e);
            throw null;
        }
    }

    public final String toString() {
        return this.v;
    }
}
