package defpackage;

import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d11 {
    public int[] a;
    public int b;
    public float[] c;

    public d11(int[] iArr) {
        int i;
        this.a = iArr;
        if (iArr.length == 0) {
            sm0.h("Empty array can't be reduced.");
            throw null;
        }
        int i2 = iArr[0];
        IntRange intRange = new IntRange(1, iArr.length - 1, 1);
        int i3 = ((a) intRange).b;
        int i4 = ((a) intRange).c;
        boolean z = i4 <= 0 ? 1 >= i3 : 1 <= i3;
        int i5 = z ? 1 : i3;
        while (z) {
            if (i5 != i3) {
                i = i5 + i4;
            } else {
                if (!z) {
                    uq1.a();
                    throw null;
                }
                z = false;
                i = i5;
            }
            i2 *= iArr[i5];
            i5 = i;
        }
        this.b = i2;
        this.c = new float[i2];
    }
}
