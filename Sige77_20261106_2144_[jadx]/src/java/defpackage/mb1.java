package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mb1 implements ds1 {
    public final ri a;
    public final ji b;
    public yn1 c;
    public int d;
    public boolean e;
    public long f;

    public mb1(ri riVar) {
        this.a = riVar;
        ji jiVarC = riVar.c();
        this.b = jiVarC;
        yn1 yn1Var = jiVarC.a;
        this.c = yn1Var;
        this.d = yn1Var != null ? yn1Var.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.ds1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long F(defpackage.ji r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.e
            if (r3 != 0) goto L5f
            yn1 r3 = r8.c
            ji r4 = r8.b
            if (r3 == 0) goto L27
            yn1 r5 = r4.a
            if (r3 != r5) goto L21
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.uq1.q(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            ri r2 = r8.a
            boolean r0 = r2.o(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            yn1 r0 = r8.c
            if (r0 != 0) goto L48
            yn1 r0 = r4.a
            if (r0 == 0) goto L48
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L48:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            ji r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.m(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.uq1.q(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.ck1.t(r8, r10)
            defpackage.e.d(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mb1.F(ji, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return this.a.d();
    }
}
