package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yv0 {
    public final String a;

    public yv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yv0) {
            return this.a.equals(((yv0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ts.l(new StringBuilder("StringHeaderFactory{value='"), this.a, "'}");
    }
}
