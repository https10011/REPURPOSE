package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yt0 extends ut0 {
    public final fy0 a;

    public yt0() {
        rs rsVar = fy0.w;
        this.a = new fy0(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof yt0) && ((yt0) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
