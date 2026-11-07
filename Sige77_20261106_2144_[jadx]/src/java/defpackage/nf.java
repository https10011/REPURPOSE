package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nf implements Cloneable {
    public boolean W;
    public int a;
    public boolean b0;
    public boolean c0;
    public int d;
    public int e;
    public boolean e0;
    public x10 b = x10.d;
    public vc1 c = vc1.c;
    public boolean f = true;
    public int i = -1;
    public int v = -1;
    public hv0 w = b60.b;
    public boolean X = true;
    public da1 Y = new da1();
    public uj Z = new uj(0);
    public Class a0 = Object.class;
    public boolean d0 = true;

    public static boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    public nf c(nf nfVar) {
        if (this.c0) {
            return clone().c(nfVar);
        }
        int i = nfVar.a;
        if (k(nfVar.a, 1048576)) {
            this.e0 = nfVar.e0;
        }
        if (k(nfVar.a, 4)) {
            this.b = nfVar.b;
        }
        if (k(nfVar.a, 8)) {
            this.c = nfVar.c;
        }
        if (k(nfVar.a, 16)) {
            this.d = 0;
            this.a &= -33;
        }
        if (k(nfVar.a, 32)) {
            this.d = nfVar.d;
            this.a &= -17;
        }
        if (k(nfVar.a, 64)) {
            this.e = 0;
            this.a &= -129;
        }
        if (k(nfVar.a, 128)) {
            this.e = nfVar.e;
            this.a &= -65;
        }
        if (k(nfVar.a, 256)) {
            this.f = nfVar.f;
        }
        if (k(nfVar.a, 512)) {
            this.v = nfVar.v;
            this.i = nfVar.i;
        }
        if (k(nfVar.a, 1024)) {
            this.w = nfVar.w;
        }
        if (k(nfVar.a, 4096)) {
            this.a0 = nfVar.a0;
        }
        if (k(nfVar.a, 8192)) {
            this.a &= -16385;
        }
        if (k(nfVar.a, 16384)) {
            this.a &= -8193;
        }
        if (k(nfVar.a, 65536)) {
            this.X = nfVar.X;
        }
        if (k(nfVar.a, 131072)) {
            this.W = nfVar.W;
        }
        if (k(nfVar.a, 2048)) {
            this.Z.putAll(nfVar.Z);
            this.d0 = nfVar.d0;
        }
        if (!this.X) {
            this.Z.clear();
            int i2 = this.a;
            this.W = false;
            this.a = i2 & (-133121);
            this.d0 = true;
        }
        this.a |= nfVar.a;
        this.Y.b.g(nfVar.Y.b);
        p();
        return this;
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public nf clone() {
        try {
            nf nfVar = (nf) super.clone();
            da1 da1Var = new da1();
            nfVar.Y = da1Var;
            da1Var.b.g(this.Y.b);
            uj ujVar = new uj(0);
            nfVar.Z = ujVar;
            ujVar.putAll(this.Z);
            nfVar.b0 = false;
            nfVar.c0 = false;
            return nfVar;
        } catch (CloneNotSupportedException e) {
            sm0.n(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof nf) {
            return j((nf) obj);
        }
        return false;
    }

    public final nf f(Class cls) {
        if (this.c0) {
            return clone().f(cls);
        }
        this.a0 = cls;
        this.a |= 4096;
        p();
        return this;
    }

    public final nf g(x10 x10Var) {
        if (this.c0) {
            return clone().g(x10Var);
        }
        this.b = x10Var;
        this.a |= 4;
        p();
        return this;
    }

    public final nf h() {
        if (this.c0) {
            return clone().h();
        }
        this.Z.clear();
        int i = this.a;
        this.W = false;
        this.X = false;
        this.a = (i & (-133121)) | 65536;
        this.d0 = true;
        p();
        return this;
    }

    public int hashCode() {
        return d42.x(d42.x(d42.x(d42.x(d42.x(d42.x(d42.x(d42.w(0, d42.w(0, d42.w(this.X ? 1 : 0, d42.w(this.W ? 1 : 0, d42.w(this.v, d42.w(this.i, d42.w(this.f ? 1 : 0, d42.x(d42.w(0, d42.x(d42.w(this.e, d42.x(d42.w(this.d, d42.w(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.b), this.c), this.Y), this.Z), this.a0), this.w), null);
    }

    public final nf i() {
        if (this.c0) {
            return clone().i();
        }
        this.d = 2131230932;
        this.a = (this.a | 32) & (-17);
        p();
        return this;
    }

    public final boolean j(nf nfVar) {
        nfVar.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.d == nfVar.d && this.e == nfVar.e && this.f == nfVar.f && this.i == nfVar.i && this.v == nfVar.v && this.W == nfVar.W && this.X == nfVar.X && this.b.equals(nfVar.b) && this.c == nfVar.c && this.Y.equals(nfVar.Y) && this.Z.equals(nfVar.Z) && this.a0.equals(nfVar.a0) && this.w.equals(nfVar.w);
    }

    public final nf l(y20 y20Var, oh ohVar) {
        if (this.c0) {
            return clone().l(y20Var, ohVar);
        }
        q(y20.g, y20Var);
        return u(ohVar, false);
    }

    public final nf m(int i, int i2) {
        if (this.c0) {
            return clone().m(i, i2);
        }
        this.v = i;
        this.i = i2;
        this.a |= 512;
        p();
        return this;
    }

    public final nf n() {
        if (this.c0) {
            return clone().n();
        }
        this.e = 2131231012;
        this.a = (this.a | 128) & (-65);
        p();
        return this;
    }

    public final nf o() {
        if (this.c0) {
            return clone().o();
        }
        this.c = vc1.d;
        this.a |= 8;
        p();
        return this;
    }

    public final void p() {
        if (this.b0) {
            uq1.q("You cannot modify locked T, consider clone()");
        }
    }

    public final nf q(z91 z91Var, y20 y20Var) {
        if (this.c0) {
            return clone().q(z91Var, y20Var);
        }
        am2.o(z91Var);
        this.Y.b.put(z91Var, y20Var);
        p();
        return this;
    }

    public final nf r(y71 y71Var) {
        if (this.c0) {
            return clone().r(y71Var);
        }
        this.w = y71Var;
        this.a |= 1024;
        p();
        return this;
    }

    public final nf t() {
        if (this.c0) {
            return clone().t();
        }
        this.f = false;
        this.a |= 256;
        p();
        return this;
    }

    public final nf u(fz1 fz1Var, boolean z) {
        if (this.c0) {
            return clone().u(fz1Var, z);
        }
        e30 e30Var = new e30(fz1Var, z);
        v(Bitmap.class, fz1Var, z);
        v(Drawable.class, e30Var, z);
        v(BitmapDrawable.class, e30Var, z);
        v(li0.class, new ni0(fz1Var), z);
        p();
        return this;
    }

    public final nf v(Class cls, fz1 fz1Var, boolean z) {
        if (this.c0) {
            return clone().v(cls, fz1Var, z);
        }
        am2.o(fz1Var);
        this.Z.put(cls, fz1Var);
        int i = this.a;
        this.X = true;
        this.a = 67584 | i;
        this.d0 = false;
        if (z) {
            this.a = i | 198656;
            this.W = true;
        }
        p();
        return this;
    }

    public final nf x() {
        if (this.c0) {
            return clone().x();
        }
        this.e0 = true;
        this.a |= 1048576;
        p();
        return this;
    }
}
