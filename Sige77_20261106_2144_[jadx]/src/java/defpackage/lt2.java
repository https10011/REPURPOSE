package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lt2 extends mt2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt2(Unsafe unsafe, int i) {
        super(unsafe);
        this.b = i;
    }

    @Override // defpackage.mt2
    public final double a(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Double.longBitsToDouble(k(obj, j));
    }

    @Override // defpackage.mt2
    public final void b(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (!nt2.f) {
                    nt2.k(obj, j, b);
                } else {
                    nt2.i(obj, j, b);
                }
                break;
            default:
                if (!nt2.f) {
                    nt2.k(obj, j, b);
                } else {
                    nt2.i(obj, j, b);
                }
                break;
        }
    }

    @Override // defpackage.mt2
    public final void c(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                f(obj, j, Double.doubleToLongBits(d));
                break;
            default:
                f(obj, j, Double.doubleToLongBits(d));
                break;
        }
    }

    @Override // defpackage.mt2
    public final void d(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                e(obj, j, Float.floatToIntBits(f));
                break;
            default:
                e(obj, j, Float.floatToIntBits(f));
                break;
        }
    }

    @Override // defpackage.mt2
    public final void g(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (!nt2.f) {
                    nt2.k(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    nt2.i(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!nt2.f) {
                    nt2.k(obj, j, z ? (byte) 1 : (byte) 0);
                } else {
                    nt2.i(obj, j, z ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // defpackage.mt2
    public final float h(Object obj, long j) {
        switch (this.b) {
            case 0:
                break;
        }
        return Float.intBitsToFloat(j(obj, j));
    }

    @Override // defpackage.mt2
    public final boolean i(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (nt2.f) {
                    if (((byte) (nt2.c.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (nt2.c.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
            default:
                if (nt2.f) {
                    if (((byte) (nt2.c.j(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3)))) == 0) {
                        return false;
                    }
                } else {
                    if (((byte) (nt2.c.j(obj, (-4) & j) >>> ((int) ((j & 3) << 3)))) == 0) {
                        return false;
                    }
                }
                return true;
        }
    }
}
