package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jo2 extends lo2 {
    @Override // defpackage.lo2
    public final void B(Object obj, long j, float f) {
        ((Unsafe) this.a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.lo2
    public final double C(Object obj, long j) {
        return Double.longBitsToDouble(((Unsafe) this.a).getLong(obj, j));
    }

    @Override // defpackage.lo2
    public final void E(Object obj, long j, double d) {
        ((Unsafe) this.a).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.lo2
    public final void t(Object obj, long j, byte b) {
        if (no2.f) {
            no2.b(obj, j, b);
        } else {
            no2.c(obj, j, b);
        }
    }

    @Override // defpackage.lo2
    public final boolean v(Object obj, long j) {
        return no2.f ? no2.n(obj, j) : no2.o(obj, j);
    }

    @Override // defpackage.lo2
    public final void x(Object obj, long j, boolean z) {
        if (no2.f) {
            no2.b(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            no2.c(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.lo2
    public final float z(Object obj, long j) {
        return Float.intBitsToFloat(((Unsafe) this.a).getInt(obj, j));
    }
}
