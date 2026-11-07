package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class g22 extends xi0 {
    public static final int[] h = {1, 1, 1};
    public static final int[] i = {1, 1, 1, 1, 1};
    public static final int[] j = {1, 1, 1, 1, 1, 1};
    public static final int[][] k;
    public static final int[][] l;

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        k = iArr;
        int[][] iArr2 = new int[20][];
        l = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i2 = 10; i2 < 20; i2++) {
            int[] iArr3 = k[i2 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i3 = 0; i3 < iArr3.length; i3++) {
                iArr4[i3] = iArr3[(iArr3.length - i3) - 1];
            }
            l[i2] = iArr4;
        }
    }

    public static boolean I(String str) {
        int length = str.length();
        if (length != 0) {
            int i2 = length - 1;
            if (J(str.subSequence(0, i2)) == Character.digit(str.charAt(i2), 10)) {
                return true;
            }
        }
        return false;
    }

    public static int J(CharSequence charSequence) throws hf0 {
        int length = charSequence.length();
        int i2 = 0;
        for (int i3 = length - 1; i3 >= 0; i3 -= 2) {
            int iCharAt = charSequence.charAt(i3) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                hf0 hf0Var = hf0.c;
                if (kf1.a) {
                    throw new hf0();
                }
                throw hf0.c;
            }
            i2 += iCharAt;
        }
        int i4 = i2 * 3;
        for (int i5 = length - 2; i5 >= 0; i5 -= 2) {
            int iCharAt2 = charSequence.charAt(i5) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                hf0 hf0Var2 = hf0.c;
                if (kf1.a) {
                    throw new hf0();
                }
                throw hf0.c;
            }
            i4 += iCharAt2;
        }
        return (1000 - i4) % 10;
    }
}
