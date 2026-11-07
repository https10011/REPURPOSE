package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a90 extends d90 {
    public final int b;
    public final String c;

    public a90(String str, int i, String str2) {
        super(str);
        this.b = i;
        this.c = str2;
    }

    @Override // defpackage.d90, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb.append(this.b);
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        return ts.l(sb, this.c, "}");
    }
}
