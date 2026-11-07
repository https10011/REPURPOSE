package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y71 implements hv0 {
    public final Object b;

    public y71(Object obj) {
        am2.p(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(hv0.a));
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof y71) {
            return this.b.equals(((y71) obj).b);
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
