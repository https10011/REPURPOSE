package defpackage;

import io.jsonwebtoken.JwtParser;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class hf1 extends gf1 {
    public static a a(IntRange intRange, int i) {
        intRange.getClass();
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + JwtParser.SEPARATOR_CHAR);
        }
        yq0 yq0Var = a.d;
        int i2 = ((a) intRange).a;
        int i3 = ((a) intRange).b;
        if (((a) intRange).c <= 0) {
            i = -i;
        }
        yq0Var.getClass();
        return new a(i2, i3, i);
    }

    public static IntRange b(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.e.getClass();
        return IntRange.f;
    }
}
