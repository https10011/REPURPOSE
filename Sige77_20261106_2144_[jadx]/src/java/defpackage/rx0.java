package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rx0 {
    public boolean a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && rx0.class == obj.getClass() && this.a == ((rx0) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1 : 0;
    }

    public final String toString() {
        return "LineFriendshipStatus{friendFlag=" + this.a + '}';
    }
}
