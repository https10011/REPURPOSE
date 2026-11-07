package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k60 {
    public final String a;

    public k60(String str) {
        if (str != null) {
            this.a = str;
        } else {
            uq1.h("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k60)) {
            return false;
        }
        return this.a.equals(((k60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return ts.l(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
