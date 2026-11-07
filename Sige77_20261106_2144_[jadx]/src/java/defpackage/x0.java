package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x0 {
    public x0(DefaultConstructorMarker defaultConstructorMarker) {
    }

    public static void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            e.c(ts.i("index: ", i, i2, ", size: "));
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            e.c(ts.i("index: ", i, i2, ", size: "));
        }
    }

    public static void c(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            e.g(ts.i("fromIndex: ", i, i2, " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static int d(int i, int i2) {
        int i3 = i + (i >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            return i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        return i3;
    }
}
