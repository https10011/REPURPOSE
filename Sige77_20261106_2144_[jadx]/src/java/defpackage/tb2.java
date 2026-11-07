package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tb2 {
    public static final int[] b;
    public static final int[] c;
    public static final tb2 d;
    public static final tb2 e;
    public final boolean a;

    static {
        int[] iArr = new int[256];
        b = iArr;
        Arrays.fill(iArr, -1);
        for (int i = 0; i < 64; i++) {
            b[ub2.c[i]] = i;
        }
        b[61] = -2;
        int[] iArr2 = new int[256];
        c = iArr2;
        Arrays.fill(iArr2, -1);
        for (int i2 = 0; i2 < 64; i2++) {
            c[ub2.d[i2]] = i2;
        }
        c[61] = -2;
        d = new tb2(false);
        e = new tb2(true);
    }

    public tb2(boolean z) {
        this.a = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        if (r11 != 18) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb2.a(java.lang.String):byte[]");
    }
}
