package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class p {
    public abstract r a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return a().equals(((p) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
