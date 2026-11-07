package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class is0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public is0(uy1 uy1Var) {
        this.a = (String) uy1Var.a;
        this.b = (String) uy1Var.b;
        this.c = (String) uy1Var.c;
        this.d = (String) uy1Var.d;
        this.e = (String) uy1Var.e;
        this.f = (String) uy1Var.f;
        this.g = (String) uy1Var.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JWK{keyType='");
        sb.append(this.a);
        sb.append("', algorithm='");
        sb.append(this.b);
        sb.append("', use='");
        sb.append(this.c);
        sb.append("', keyId='");
        sb.append(this.d);
        sb.append("', curve='");
        sb.append(this.e);
        sb.append("', x='");
        sb.append(this.f);
        sb.append("', y='");
        return ts.l(sb, this.g, "'}");
    }
}
