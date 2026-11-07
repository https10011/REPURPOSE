package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x60 implements hv0 {
    public final Object b;
    public final int c;
    public final int d;
    public final Class e;
    public final Class f;
    public final hv0 g;
    public final Map h;
    public final da1 i;
    public int j;

    public x60(Object obj, hv0 hv0Var, int i, int i2, Map map, Class cls, Class cls2, da1 da1Var) {
        am2.p(obj, "Argument must not be null");
        this.b = obj;
        this.g = hv0Var;
        this.c = i;
        this.d = i2;
        am2.p(map, "Argument must not be null");
        this.h = map;
        am2.p(cls, "Resource class must not be null");
        this.e = cls;
        am2.p(cls2, "Transcode class must not be null");
        this.f = cls2;
        am2.p(da1Var, "Argument must not be null");
        this.i = da1Var;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof x60) {
            x60 x60Var = (x60) obj;
            if (this.b.equals(x60Var.b) && this.g.equals(x60Var.g) && this.d == x60Var.d && this.c == x60Var.c && this.h.equals(x60Var.h) && this.e.equals(x60Var.e) && this.f.equals(x60Var.f) && this.i.equals(x60Var.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
            this.j = iHashCode2;
            int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
            this.j = iHashCode3;
            int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
            this.j = iHashCode4;
            int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
            this.j = iHashCode5;
            this.j = this.i.b.hashCode() + (iHashCode5 * 31);
        }
        return this.j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
