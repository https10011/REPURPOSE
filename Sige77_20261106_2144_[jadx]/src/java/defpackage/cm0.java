package defpackage;

import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class cm0 {
    public static final hs1 a = new hs1(5);

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.i(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e) {
            ly lyVar = new ly("exception decoding Hex string: " + e.getMessage(), 0);
            lyVar.b = e;
            throw lyVar;
        }
    }
}
