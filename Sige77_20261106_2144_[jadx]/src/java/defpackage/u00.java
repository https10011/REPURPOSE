package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u00 {
    public final je1 a;
    public final int b;
    public final int c;

    public u00(je1 je1Var, int i, int i2) {
        this.a = je1Var;
        this.b = i;
        this.c = i2;
    }

    public static u00 a(Class cls) {
        return new u00(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u00)) {
            return false;
        }
        u00 u00Var = (u00) obj;
        return this.a.equals(u00Var.a) && this.b == u00Var.b && this.c == u00Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "direct";
        } else if (i2 == 1) {
            str2 = "provider";
        } else {
            if (i2 != 2) {
                e.b(ck1.r(i2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return ts.l(sb, str2, "}");
    }

    public u00(int i, int i2, Class cls) {
        this(je1.a(cls), i, i2);
    }
}
