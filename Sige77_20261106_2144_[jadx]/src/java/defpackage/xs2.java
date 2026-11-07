package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xs2 implements ct2 {
    public final yq2 a;

    public xs2(yq2 yq2Var) {
        this.a = yq2Var;
    }

    @Override // defpackage.ct2
    public final boolean a(cs2 cs2Var, cs2 cs2Var2) {
        return cs2Var.zzb.equals(cs2Var2.zzb);
    }

    @Override // defpackage.ct2
    public final boolean b(Object obj) {
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.ct2
    public final void c(Object obj, we weVar, wr2 wr2Var) {
        mo1.q(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ct2
    public final void d(Object obj, pv2 pv2Var) {
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.ct2
    public final int e(cs2 cs2Var) {
        return cs2Var.zzb.hashCode();
    }

    @Override // defpackage.ct2
    public final void f(Object obj) {
        jt2 jt2Var = ((cs2) obj).zzb;
        if (jt2Var.e) {
            jt2Var.e = false;
        }
        y00.n(obj);
        throw null;
    }

    @Override // defpackage.ct2
    public final void g(Object obj, Object obj2) {
        x91.W(obj, obj2);
    }

    @Override // defpackage.ct2
    public final int h(cs2 cs2Var) {
        jt2 jt2Var = cs2Var.zzb;
        int i = jt2Var.d;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < jt2Var.a; i2++) {
            int i3 = jt2Var.b[i2] >>> 3;
            iN += tr2.n(3, (jr2) jt2Var.c[i2]) + ck1.w(i3, tr2.t(16), tr2.t(8) << 1);
        }
        jt2Var.d = iN;
        return iN;
    }

    @Override // defpackage.ct2
    public final void i(Object obj, byte[] bArr, int i, int i2, zk2 zk2Var) {
        cs2 cs2Var = (cs2) obj;
        if (cs2Var.zzb == jt2.f) {
            cs2Var.zzb = jt2.e();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.ct2
    public final cs2 zza() {
        yq2 yq2Var = this.a;
        if (yq2Var instanceof cs2) {
            return ((cs2) yq2Var).p();
        }
        bs2 bs2Var = (bs2) ((cs2) yq2Var).d(5);
        boolean zS = bs2Var.b.s();
        cs2 cs2Var = bs2Var.b;
        if (!zS) {
            return cs2Var;
        }
        cs2Var.q();
        return bs2Var.b;
    }
}
