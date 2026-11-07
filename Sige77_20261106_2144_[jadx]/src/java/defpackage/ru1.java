package defpackage;

import kotlin.text.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ru1 extends g {
    public static String r(int i, String str) {
        str.getClass();
        if (i < 0) {
            e.d(ts.g(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }
}
