package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f32 extends h32 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f32(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.h32
    public final boolean c(Object obj, long j) {
        switch (this.b) {
            case 0:
                return i32.g ? i32.b(obj, j) : i32.c(obj, j);
            default:
                return i32.g ? i32.b(obj, j) : i32.c(obj, j);
        }
    }

    @Override // defpackage.h32
    public final double d(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(g(obj, j));
    }

    @Override // defpackage.h32
    public final float e(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(f(obj, j));
    }

    @Override // defpackage.h32
    public final void j(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!i32.g) {
                    i32.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    i32.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!i32.g) {
                    i32.l(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    i32.k(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.h32
    public final void k(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!i32.g) {
                    i32.l(obj, j, b);
                } else {
                    i32.k(obj, j, b);
                }
                break;
            default:
                if (!i32.g) {
                    i32.l(obj, j, b);
                } else {
                    i32.k(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.h32
    public final void l(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                o(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                o(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.h32
    public final void m(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                n(obj, j, Float.floatToIntBits(f));
                break;
            default:
                n(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.h32
    public final boolean r() {
        switch (this.b) {
        }
        return false;
    }
}
