package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ld extends fn {
    public final id a;

    public ld(id idVar) {
        this.a = idVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        Object obj2 = en.a;
        if (obj2.equals(obj2)) {
            return this.a.equals(((ld) fnVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((en.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + en.a + ", androidClientInfo=" + this.a + "}";
    }
}
