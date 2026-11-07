package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ae2 implements ce2 {
    public final Exception a;

    public ae2(Exception exc) {
        this.a = exc;
    }

    @Override // defpackage.ce2
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ce2
    public final String f() {
        return this.a.getMessage();
    }
}
