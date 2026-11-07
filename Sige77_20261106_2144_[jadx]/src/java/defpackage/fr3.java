package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public enum fr3 {
    /* JADX INFO: Fake field, exist only in values array */
    STRING('s', 1, "-#", true),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN('b', 2, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR('c', 3, "-", true),
    /* JADX INFO: Fake field, exist only in values array */
    DECIMAL('d', 4, "-0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    OCTAL('o', 4, "-#0(", false),
    HEX('x', 4, "-#0(", true),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT('f', 5, "-#0+ ,(", false),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT('e', 5, "-#0+ (", true),
    /* JADX INFO: Fake field, exist only in values array */
    GENERAL('g', 5, "-0+ ,(", true),
    /* JADX INFO: Fake field, exist only in values array */
    EXPONENT_HEX('a', 5, "-#0+ ", true);

    public static final fr3[] f = new fr3[26];
    public final char a;
    public final int b;
    public final int c;
    public final String d;

    static {
        for (fr3 fr3Var : values()) {
            f[(fr3Var.a | ' ') - 97] = fr3Var;
        }
    }

    fr3(char c, int i2, String str, boolean z) {
        this.a = c;
        this.b = i2;
        jr3 jr3Var = jr3.e;
        int i3 = true != z ? 0 : 128;
        for (int i4 = 0; i4 < str.length(); i4++) {
            int iCharAt = ((int) ((jr3.d >>> ((str.charAt(i4) - ' ') * 3)) & 7)) - 1;
            if (iCharAt < 0) {
                e.g("invalid flags: ".concat(str));
                throw null;
            }
            i3 |= 1 << iCharAt;
        }
        this.c = i3;
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1);
        sb.append("%");
        sb.append(c);
        this.d = sb.toString();
    }
}
