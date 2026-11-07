package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u50 implements up0 {
    public final boolean a;

    public u50(boolean z) {
        this.a = z;
    }

    @Override // defpackage.up0
    public final f71 c() {
        return null;
    }

    @Override // defpackage.up0
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
