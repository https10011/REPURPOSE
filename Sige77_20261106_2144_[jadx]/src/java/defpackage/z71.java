package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z71 {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;

    public final String toString() {
        StringBuilder sb = new StringBuilder("switch: false");
        String str = a81.c;
        ts.r(sb, str, "console: true", str, "tag: ");
        ts.q(sb, this.b ? "null" : this.a, str, "head: ");
        sb.append(this.c);
        sb.append(str);
        sb.append("file: false");
        sb.append(str);
        sb.append("dir: ");
        ts.q(sb, null, str, "border: ");
        sb.append(this.d);
        sb.append(str);
        sb.append("consoleFilter: ");
        char[] cArr = a81.b;
        sb.append(cArr[0]);
        sb.append(str);
        sb.append("fileFilter: ");
        sb.append(cArr[0]);
        return sb.toString();
    }
}
