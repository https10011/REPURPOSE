package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dr0 {
    public static final Charset a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new qn(bArr, 0, 0, false).e(0);
        } catch (ur0 e) {
            sm0.s(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
