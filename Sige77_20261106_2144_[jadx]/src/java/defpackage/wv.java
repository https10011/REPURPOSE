package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wv {
    public final je1 a;
    public final boolean b;

    public wv(je1 je1Var, boolean z) {
        this.a = je1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wv) {
            wv wvVar = (wv) obj;
            if (wvVar.a.equals(this.a) && wvVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
