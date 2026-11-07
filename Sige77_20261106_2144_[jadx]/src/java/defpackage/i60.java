package defpackage;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i60 {
    public final String a;
    public pv1 b;
    public final StringBuilder c;
    public int d;
    public int e;
    public ov1 f;
    public int g;

    public i60(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                e.g("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = pv1.a;
        this.c = new StringBuilder(str.length());
        this.e = -1;
    }

    public final char a() {
        return this.a.charAt(this.d);
    }

    public final boolean b() {
        return this.d < this.a.length() - this.g;
    }

    public final void c(int i) {
        ov1 ov1Var = this.f;
        if (ov1Var == null || i > ov1Var.b) {
            this.f = ov1.e(i, this.b);
        }
    }

    public final void d(char c) {
        this.c.append(c);
    }
}
