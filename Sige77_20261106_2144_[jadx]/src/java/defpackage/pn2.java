package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pn2 implements yn2 {
    public final wk2 a;
    public final qh1 b;

    public pn2(qh1 qh1Var, wk2 wk2Var) {
        vl0 vl0Var = wl2.a;
        this.b = qh1Var;
        this.a = wk2Var;
    }

    @Override // defpackage.yn2
    public final void a(Object obj, wa waVar) {
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yn2
    public final void b(Object obj, Object obj2) {
        zn2.b(obj, obj2);
    }

    @Override // defpackage.yn2
    public final int c(wk2 wk2Var) {
        ho2 ho2Var = ((dm2) wk2Var).zzc;
        int i = ho2Var.d;
        if (i != -1) {
            return i;
        }
        int iN = 0;
        for (int i2 = 0; i2 < ho2Var.a; i2++) {
            int i3 = ho2Var.b[i2] >>> 3;
            hl2 hl2Var = (hl2) ho2Var.c[i2];
            int iA = tl2.a(8);
            int iA2 = tl2.a(i3) + tl2.a(16);
            int iA3 = tl2.a(24);
            int iB = hl2Var.b();
            iN += iA + iA + iA2 + ck1.n(iB, iB, iA3);
        }
        ho2Var.d = iN;
        return iN;
    }

    @Override // defpackage.yn2
    public final boolean d(dm2 dm2Var, dm2 dm2Var2) {
        return dm2Var.zzc.equals(dm2Var2.zzc);
    }

    @Override // defpackage.yn2
    public final void e(Object obj, we weVar, vl2 vl2Var) {
        this.b.getClass();
        qh1.v(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yn2
    public final void f(Object obj) {
        this.b.getClass();
        ho2 ho2Var = ((dm2) obj).zzc;
        if (ho2Var.e) {
            ho2Var.e = false;
        }
        vl0 vl0Var = wl2.a;
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yn2
    public final int g(dm2 dm2Var) {
        return dm2Var.zzc.hashCode();
    }

    @Override // defpackage.yn2
    public final void h(Object obj, byte[] bArr, int i, int i2, zk2 zk2Var) {
        dm2 dm2Var = (dm2) obj;
        if (dm2Var.zzc == ho2.f) {
            dm2Var.zzc = ho2.a();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yn2
    public final dm2 zza() {
        wk2 wk2Var = this.a;
        if (wk2Var instanceof dm2) {
            return ((dm2) wk2Var).i();
        }
        bm2 bm2Var = (bm2) ((dm2) wk2Var).s(5);
        boolean zG = bm2Var.b.g();
        dm2 dm2Var = bm2Var.b;
        if (!zG) {
            return dm2Var;
        }
        dm2Var.getClass();
        un2.c.a(dm2Var.getClass()).f(dm2Var);
        dm2Var.h();
        return bm2Var.b;
    }

    @Override // defpackage.yn2
    public final boolean zzl(Object obj) {
        obj.getClass();
        throw new ClassCastException();
    }
}
