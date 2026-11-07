package defpackage;

import java.security.SecureRandom;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class iu1 {
    public static final String a;
    public static final SecureRandom b;

    static {
        String strB = b('a', 'z');
        String strB2 = b('A', 'Z');
        a = strB.concat(strB2).concat(b('0', '9'));
        b = new SecureRandom();
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            SecureRandom secureRandom = b;
            String str = a;
            sb.append(str.charAt(secureRandom.nextInt(str.length())));
        }
        return sb.toString();
    }

    public static String b(char c, char c2) {
        StringBuilder sb = new StringBuilder();
        while (c <= c2) {
            sb.append(c);
            c = (char) (c + 1);
        }
        return sb.toString();
    }
}
