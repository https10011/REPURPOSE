package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cv extends t40 {
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(m40 m40Var, r93 r93Var, r93 r93Var2, r93[] r93VarArr, boolean z, int i) {
        super(m40Var, r93Var, r93Var2, r93VarArr, 1);
        this.h = i;
        switch (i) {
            case 1:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 9:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 10:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 11:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 12:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 13:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            case 14:
                super(m40Var, r93Var, r93Var2, r93VarArr, 1);
                this.e = z;
                break;
            default:
                this.e = z;
                break;
        }
    }

    private final t40 n(t40 t40Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (f()) {
            return t40Var;
        }
        if (t40Var.f()) {
            return this;
        }
        if (this == t40Var) {
            return m();
        }
        en1 en1Var = (en1) this.b;
        en1 en1Var2 = (en1) this.c;
        en1 en1Var3 = (en1) t40Var.b;
        en1 en1Var4 = (en1) t40Var.d();
        en1 en1Var5 = (en1) this.d[0];
        en1 en1Var6 = (en1) t40Var.e();
        int[] iArr5 = new int[14];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        int[] iArr8 = new int[7];
        int[] iArr9 = en1Var5.k;
        boolean zV = g93.v(iArr9);
        if (zV) {
            iArr = en1Var3.k;
            iArr2 = en1Var4.k;
        } else {
            nj2.T(iArr9, iArr7);
            nj2.L(iArr7, en1Var3.k, iArr6);
            nj2.L(iArr7, iArr9, iArr7);
            nj2.L(iArr7, en1Var4.k, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = en1Var6.k;
        boolean zV2 = g93.v(iArr10);
        if (zV2) {
            iArr3 = en1Var.k;
            iArr4 = en1Var2.k;
        } else {
            nj2.T(iArr10, iArr8);
            nj2.L(iArr8, en1Var.k, iArr5);
            nj2.L(iArr8, iArr10, iArr8);
            nj2.L(iArr8, en1Var2.k, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[7];
        nj2.W(iArr3, iArr, iArr11);
        nj2.W(iArr4, iArr2, iArr6);
        boolean zW = g93.w(iArr11);
        m40 m40Var = this.a;
        if (zW) {
            return g93.w(iArr6) ? m() : m40Var.h();
        }
        nj2.T(iArr11, iArr7);
        int[] iArr12 = new int[7];
        nj2.L(iArr7, iArr11, iArr12);
        nj2.L(iArr7, iArr3, iArr7);
        if (g93.w(iArr12)) {
            iArr12[0] = 0;
            iArr12[1] = 0;
            iArr12[2] = 0;
            iArr12[3] = 0;
            iArr12[4] = 0;
            iArr12[5] = 0;
            iArr12[6] = 0;
        } else {
            g93.G(nj2.b, iArr12, iArr12);
        }
        g93.x(iArr4, iArr12, iArr5);
        nj2.P(iArr12, g93.e(iArr7, iArr7, iArr12));
        en1 en1Var7 = new en1(iArr8);
        nj2.T(iArr6, iArr8);
        nj2.W(iArr8, iArr12, iArr8);
        en1 en1Var8 = new en1(iArr12);
        nj2.W(iArr7, iArr8, iArr12);
        if ((g93.y(iArr12, iArr6, iArr5) != 0 || (iArr5[13] == -1 && kv.C(14, iArr5, nj2.c))) && kv.h(11, nj2.d, iArr5) != 0) {
            kv.K(14, 11, iArr5);
        }
        nj2.N(iArr5, iArr12);
        en1 en1Var9 = new en1(iArr11);
        if (!zV) {
            nj2.L(iArr11, iArr9, iArr11);
        }
        if (!zV2) {
            nj2.L(iArr11, iArr10, iArr11);
        }
        return new cv(m40Var, en1Var7, en1Var8, new r93[]{en1Var9}, this.e, 10);
    }

    private final t40 o(t40 t40Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (f()) {
            return t40Var;
        }
        if (t40Var.f()) {
            return this;
        }
        if (this == t40Var) {
            return m();
        }
        gn1 gn1Var = (gn1) this.b;
        gn1 gn1Var2 = (gn1) this.c;
        gn1 gn1Var3 = (gn1) t40Var.b;
        gn1 gn1Var4 = (gn1) t40Var.d();
        gn1 gn1Var5 = (gn1) this.d[0];
        gn1 gn1Var6 = (gn1) t40Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = gn1Var5.k;
        boolean zG = r93.G(iArr9);
        if (zG) {
            iArr = gn1Var3.k;
            iArr2 = gn1Var4.k;
        } else {
            am2.R(iArr9, iArr7);
            am2.J(iArr7, gn1Var3.k, iArr6);
            am2.J(iArr7, iArr9, iArr7);
            am2.J(iArr7, gn1Var4.k, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = gn1Var6.k;
        boolean zG2 = r93.G(iArr10);
        if (zG2) {
            iArr3 = gn1Var.k;
            iArr4 = gn1Var2.k;
        } else {
            am2.R(iArr10, iArr8);
            am2.J(iArr8, gn1Var.k, iArr5);
            am2.J(iArr8, iArr10, iArr8);
            am2.J(iArr8, gn1Var2.k, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        am2.W(iArr3, iArr, iArr11);
        am2.W(iArr4, iArr2, iArr6);
        boolean zJ = r93.J(iArr11);
        m40 m40Var = this.a;
        if (zJ) {
            return r93.J(iArr6) ? m() : m40Var.h();
        }
        am2.R(iArr11, iArr7);
        int[] iArr12 = new int[8];
        am2.J(iArr7, iArr11, iArr12);
        am2.J(iArr7, iArr3, iArr7);
        if (r93.J(iArr12)) {
            r93.l0(iArr12);
        } else {
            r93.b0(am2.b, iArr12, iArr12);
        }
        r93.L(iArr4, iArr12, iArr5);
        am2.P(iArr12, r93.e(iArr7, iArr7, iArr12));
        gn1 gn1Var7 = new gn1(iArr8);
        am2.R(iArr6, iArr8);
        am2.W(iArr8, iArr12, iArr8);
        gn1 gn1Var8 = new gn1(iArr12);
        am2.W(iArr7, iArr8, iArr12);
        if ((r93.M(iArr12, iArr6, iArr5) != 0 || (iArr5[15] == -1 && kv.C(16, iArr5, am2.c))) && kv.h(10, am2.d, iArr5) != 0) {
            kv.K(16, 10, iArr5);
        }
        am2.N(iArr5, iArr12);
        gn1 gn1Var9 = new gn1(iArr11);
        if (!zG) {
            am2.J(iArr11, iArr9, iArr11);
        }
        if (!zG2) {
            am2.J(iArr11, iArr10, iArr11);
        }
        return new cv(m40Var, gn1Var7, gn1Var8, new r93[]{gn1Var9}, this.e, 11);
    }

    private final t40 p(t40 t40Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (f()) {
            return t40Var;
        }
        if (t40Var.f()) {
            return this;
        }
        if (this == t40Var) {
            return m();
        }
        in1 in1Var = (in1) this.b;
        in1 in1Var2 = (in1) this.c;
        in1 in1Var3 = (in1) t40Var.b;
        in1 in1Var4 = (in1) t40Var.d();
        in1 in1Var5 = (in1) this.d[0];
        in1 in1Var6 = (in1) t40Var.e();
        int[] iArr5 = new int[16];
        int[] iArr6 = new int[8];
        int[] iArr7 = new int[8];
        int[] iArr8 = new int[8];
        int[] iArr9 = in1Var5.k;
        boolean zG = r93.G(iArr9);
        if (zG) {
            iArr = in1Var3.k;
            iArr2 = in1Var4.k;
        } else {
            gu2.G(iArr9, iArr7);
            gu2.D(iArr7, in1Var3.k, iArr6);
            gu2.D(iArr7, iArr9, iArr7);
            gu2.D(iArr7, in1Var4.k, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        int[] iArr10 = in1Var6.k;
        boolean zG2 = r93.G(iArr10);
        if (zG2) {
            iArr3 = in1Var.k;
            iArr4 = in1Var2.k;
        } else {
            gu2.G(iArr10, iArr8);
            gu2.D(iArr8, in1Var.k, iArr5);
            gu2.D(iArr8, iArr10, iArr8);
            gu2.D(iArr8, in1Var2.k, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[8];
        gu2.L(iArr3, iArr, iArr11);
        gu2.L(iArr4, iArr2, iArr6);
        boolean zJ = r93.J(iArr11);
        m40 m40Var = this.a;
        if (zJ) {
            return r93.J(iArr6) ? m() : m40Var.h();
        }
        gu2.G(iArr11, iArr7);
        int[] iArr12 = new int[8];
        gu2.D(iArr7, iArr11, iArr12);
        gu2.D(iArr7, iArr3, iArr7);
        if (r93.J(iArr12)) {
            r93.l0(iArr12);
        } else {
            r93.b0(gu2.e, iArr12, iArr12);
        }
        r93.L(iArr4, iArr12, iArr5);
        gu2.F(iArr12, r93.e(iArr7, iArr7, iArr12));
        in1 in1Var7 = new in1(iArr8);
        gu2.G(iArr6, iArr8);
        gu2.L(iArr8, iArr12, iArr8);
        in1 in1Var8 = new in1(iArr12);
        gu2.L(iArr7, iArr8, iArr12);
        int[] iArr13 = gu2.f;
        if (r93.M(iArr12, iArr6, iArr5) != 0 || ((iArr5[15] >>> 1) >= Integer.MAX_VALUE && kv.C(16, iArr5, iArr13))) {
            kv.i0(16, iArr13, iArr5);
        }
        gu2.E(iArr5, iArr12);
        in1 in1Var9 = new in1(iArr11);
        if (!zG) {
            gu2.D(iArr11, iArr9, iArr11);
        }
        if (!zG2) {
            gu2.D(iArr11, iArr10, iArr11);
        }
        return new cv(m40Var, in1Var7, in1Var8, new r93[]{in1Var9}, this.e, 12);
    }

    private final t40 q(t40 t40Var) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (f()) {
            return t40Var;
        }
        if (t40Var.f()) {
            return this;
        }
        if (this == t40Var) {
            return m();
        }
        kn1 kn1Var = (kn1) this.b;
        kn1 kn1Var2 = (kn1) this.c;
        kn1 kn1Var3 = (kn1) t40Var.b;
        kn1 kn1Var4 = (kn1) t40Var.d();
        kn1 kn1Var5 = (kn1) this.d[0];
        kn1 kn1Var6 = (kn1) t40Var.e();
        int[] iArr5 = new int[24];
        int[] iArr6 = new int[24];
        int[] iArr7 = new int[12];
        int[] iArr8 = new int[12];
        boolean zF = kn1Var5.F();
        int[] iArr9 = kn1Var5.k;
        if (zF) {
            iArr = kn1Var3.k;
            iArr2 = kn1Var4.k;
        } else {
            yv2.M(iArr9, iArr7);
            yv2.J(iArr7, kn1Var3.k, iArr6);
            yv2.J(iArr7, iArr9, iArr7);
            yv2.J(iArr7, kn1Var4.k, iArr7);
            iArr = iArr6;
            iArr2 = iArr7;
        }
        boolean zF2 = kn1Var6.F();
        int[] iArr10 = kn1Var6.k;
        if (zF2) {
            iArr3 = kn1Var.k;
            iArr4 = kn1Var2.k;
        } else {
            yv2.M(iArr10, iArr8);
            yv2.J(iArr8, kn1Var.k, iArr5);
            yv2.J(iArr8, iArr10, iArr8);
            yv2.J(iArr8, kn1Var2.k, iArr8);
            iArr3 = iArr5;
            iArr4 = iArr8;
        }
        int[] iArr11 = new int[12];
        yv2.T(iArr3, iArr, iArr11);
        int[] iArr12 = new int[12];
        yv2.T(iArr4, iArr2, iArr12);
        boolean zQ = kv.Q(iArr11, 12);
        m40 m40Var = this.a;
        if (zQ) {
            return kv.Q(iArr12, 12) ? m() : m40Var.h();
        }
        yv2.M(iArr11, iArr7);
        int[] iArr13 = new int[12];
        yv2.J(iArr7, iArr11, iArr13);
        yv2.J(iArr7, iArr3, iArr7);
        if (kv.Q(iArr13, 12)) {
            for (int i = 0; i < 12; i++) {
                iArr13[i] = 0;
            }
        } else {
            kv.f0(12, yv2.h, iArr13, iArr13);
        }
        z32.x(iArr4, iArr13, iArr5);
        yv2.L(iArr13, kv.e(12, iArr7, iArr7, iArr13));
        kn1 kn1Var7 = new kn1(iArr8);
        yv2.M(iArr12, iArr8);
        yv2.T(iArr8, iArr13, iArr8);
        kn1 kn1Var8 = new kn1(iArr13);
        yv2.T(iArr7, iArr8, iArr13);
        z32.x(iArr13, iArr12, iArr6);
        if ((kv.b(24, iArr5, iArr6, iArr5) != 0 || (iArr5[23] == -1 && kv.C(24, iArr5, yv2.i))) && kv.h(17, yv2.j, iArr5) != 0) {
            kv.K(24, 17, iArr5);
        }
        yv2.K(iArr5, iArr13);
        kn1 kn1Var9 = new kn1(iArr11);
        if (!zF) {
            yv2.J(iArr11, iArr9, iArr11);
        }
        if (!zF2) {
            yv2.J(iArr11, iArr10, iArr11);
        }
        return new cv(m40Var, kn1Var7, kn1Var8, new r93[]{kn1Var9}, this.e, 13);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 37941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
        */
    @Override // defpackage.t40
    public final defpackage.t40 a(defpackage.t40 r45) {
        /*
            Method dump skipped, instruction units count: 3794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv.a(t40):t40");
    }

    @Override // defpackage.t40
    public final t40 h() {
        int i = this.h;
        r93 r93Var = this.c;
        switch (i) {
            case 0:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 0);
            case 1:
                if (f()) {
                    return this;
                }
                m40 m40Var = this.a;
                int i2 = m40Var.f;
                r93 r93Var2 = this.b;
                if (i2 == 0) {
                    return new cv(m40Var, r93Var2, r93Var.R(), this.e);
                }
                return new cv(m40Var, r93Var2, r93Var.R(), this.d, this.e, 1);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 3);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 4);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 5);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 6);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 7);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 8);
            case 9:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 9);
            case 10:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 10);
            case 11:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 11);
            case 12:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 12);
            case 13:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 13);
            default:
                if (f()) {
                    return this;
                }
                return new cv(this.a, this.b, r93Var.R(), this.d, this.e, 14);
        }
    }

    @Override // defpackage.t40
    public final t40 m() {
        cv cvVar;
        r93 r93VarE0;
        r93 r93VarD;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int i;
        int[] iArr4;
        int i2;
        int[] iArr5;
        int[] iArr6;
        int[] iArr7;
        int[] iArr8;
        int[] iArr9;
        int i3 = this.h;
        r93[] r93VarArr = this.d;
        r93 r93Var = this.b;
        r93 r93Var2 = this.c;
        switch (i3) {
            case 0:
                if (f()) {
                    return this;
                }
                if (r93Var2.I()) {
                    return this.a.h();
                }
                bv bvVar = (bv) r93Var;
                int[] iArr10 = ((bv) r93Var2).k;
                r93 r93Var3 = r93VarArr[0];
                bv bvVar2 = (bv) r93Var3;
                bv bvVarR = (bv) r93VarArr[1];
                if (bvVarR == null) {
                    bvVarR = r((bv) r93Var3, null);
                    r93VarArr[1] = bvVarR;
                }
                int[] iArr11 = {(int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j, (int) j};
                qt.x(bvVar.k, iArr11);
                int iE = r93.e(iArr11, iArr11, iArr11);
                int[] iArr12 = bvVarR.k;
                long j = (((long) iArr12[0]) & 4294967295L) + (((long) iArr11[0]) & 4294967295L);
                long j2 = (((long) iArr12[1]) & 4294967295L) + (((long) iArr11[1]) & 4294967295L) + (j >>> 32);
                long j3 = (((long) iArr12[2]) & 4294967295L) + (((long) iArr11[2]) & 4294967295L) + (j2 >>> 32);
                long j4 = (((long) iArr12[3]) & 4294967295L) + (((long) iArr11[3]) & 4294967295L) + (j3 >>> 32);
                long j5 = (((long) iArr12[4]) & 4294967295L) + (((long) iArr11[4]) & 4294967295L) + (j4 >>> 32);
                long j6 = (((long) iArr12[5]) & 4294967295L) + (((long) iArr11[5]) & 4294967295L) + (j5 >>> 32);
                long j7 = (((long) iArr12[6]) & 4294967295L) + (((long) iArr11[6]) & 4294967295L) + (j6 >>> 32);
                long j8 = (((long) iArr12[7]) & 4294967295L) + (((long) iArr11[7]) & 4294967295L) + (j7 >>> 32);
                qt.u(iArr11, iE + ((int) (j8 >>> 32)));
                int[] iArr13 = new int[8];
                qt.D(iArr10, iArr13);
                int[] iArr14 = new int[8];
                qt.r(iArr13, iArr10, iArr14);
                int[] iArr15 = new int[8];
                qt.r(iArr14, bvVar.k, iArr15);
                qt.D(iArr15, iArr15);
                int[] iArr16 = new int[8];
                qt.x(iArr14, iArr16);
                qt.D(iArr16, iArr16);
                bv bvVar3 = new bv(iArr14);
                qt.x(iArr11, iArr14);
                qt.B(iArr14, iArr15, iArr14);
                qt.B(iArr14, iArr15, iArr14);
                bv bvVar4 = new bv(iArr15);
                qt.B(iArr15, iArr14, iArr15);
                qt.r(iArr15, iArr11, iArr15);
                qt.B(iArr15, iArr16, iArr15);
                bv bvVar5 = new bv(iArr13);
                if (!r93.G(bvVar2.k)) {
                    qt.r(iArr13, bvVar2.k, iArr13);
                }
                bv bvVar6 = new bv(iArr16);
                qt.r(iArr16, bvVarR.k, iArr16);
                qt.D(iArr16, iArr16);
                return new cv(this.a, bvVar3, bvVar4, new r93[]{bvVar5, bvVar6}, this.e, 0);
            case 1:
                if (f()) {
                    return this;
                }
                boolean zI = r93Var2.I();
                m40 m40Var = this.a;
                if (zI) {
                    return m40Var.h();
                }
                int i4 = m40Var.f;
                if (i4 == 0) {
                    r93 r93VarX = r93Var.X();
                    r93 r93VarP = r93VarX.d(r93VarX).d(r93VarX).d(m40Var.b).p(r93Var2.d(r93Var2));
                    r93 r93VarE1 = r93VarP.X().e0(r93Var.d(r93Var));
                    return new cv(m40Var, r93VarE1, r93VarP.N(r93Var.e0(r93VarE1)).e0(r93Var2), this.e);
                }
                if (i4 == 1) {
                    r93 r93Var4 = r93VarArr[0];
                    boolean zF = r93Var4.F();
                    r93 r93VarN = m40Var.b;
                    if (!r93VarN.I() && !zF) {
                        r93VarN = r93VarN.N(r93Var4.X());
                    }
                    r93 r93VarX2 = r93Var.X();
                    r93 r93VarD2 = r93VarN.d(r93VarX2.d(r93VarX2).d(r93VarX2));
                    r93 r93VarN2 = zF ? r93Var2 : r93Var2.N(r93Var4);
                    r93 r93VarX3 = zF ? r93Var2.X() : r93VarN2.N(r93Var2);
                    r93 r93VarN3 = r93Var.N(r93VarX3);
                    r93 r93VarD3 = r93VarN3.d(r93VarN3);
                    r93 r93VarD4 = r93VarD3.d(r93VarD3);
                    r93 r93VarE2 = r93VarD2.X().e0(r93VarD4.d(r93VarD4));
                    r93 r93VarD5 = r93VarN2.d(r93VarN2);
                    r93 r93VarN4 = r93VarE2.N(r93VarD5);
                    r93 r93VarD6 = r93VarX3.d(r93VarX3);
                    r93 r93VarN5 = r93VarD4.e0(r93VarE2).N(r93VarD2);
                    r93 r93VarX4 = r93VarD6.X();
                    r93 r93VarE3 = r93VarN5.e0(r93VarX4.d(r93VarX4));
                    r93 r93VarD7 = zF ? r93VarD6.d(r93VarD6) : r93VarD5.X();
                    cvVar = new cv(m40Var, r93VarN4, r93VarE3, new r93[]{r93VarD7.d(r93VarD7).N(r93VarN2)}, this.e, 1);
                } else {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            uq1.q("unsupported coordinate system");
                            return null;
                        }
                        r93 r93Var5 = r93VarArr[0];
                        r93 r93VarS = r93VarArr[1];
                        if (r93VarS == null) {
                            r93VarS = s(r93VarArr[0], null);
                            r93VarArr[1] = r93VarS;
                        }
                        r93 r93VarX5 = r93Var.X();
                        r93 r93VarD8 = r93VarX5.d(r93VarX5).d(r93VarX5).d(r93VarS);
                        r93 r93VarD9 = r93Var2.d(r93Var2);
                        r93 r93VarN6 = r93VarD9.N(r93Var2);
                        r93 r93VarN7 = r93Var.N(r93VarN6);
                        r93 r93VarD10 = r93VarN7.d(r93VarN7);
                        r93 r93VarE4 = r93VarD8.X().e0(r93VarD10.d(r93VarD10));
                        r93 r93VarX6 = r93VarN6.X();
                        r93 r93VarD11 = r93VarX6.d(r93VarX6);
                        r93 r93VarE5 = r93VarD8.N(r93VarD10.e0(r93VarE4)).e0(r93VarD11);
                        r93 r93VarN8 = r93VarD11.N(r93VarS);
                        r93 r93VarD12 = r93VarN8.d(r93VarN8);
                        if (!r93Var5.F()) {
                            r93VarD9 = r93VarD9.N(r93Var5);
                        }
                        return new cv(this.a, r93VarE4, r93VarE5, new r93[]{r93VarD9, r93VarD12}, this.e, 1);
                    }
                    r93 r93Var6 = r93VarArr[0];
                    boolean zF2 = r93Var6.F();
                    r93 r93VarX7 = r93Var2.X();
                    r93 r93VarX8 = r93VarX7.X();
                    r93 r93Var7 = m40Var.b;
                    r93 r93VarR = r93Var7.R();
                    if (r93VarR.g0().equals(BigInteger.valueOf(3L))) {
                        r93 r93VarX9 = zF2 ? r93Var6 : r93Var6.X();
                        r93 r93VarN9 = r93Var.d(r93VarX9).N(r93Var.e0(r93VarX9));
                        r93VarE0 = r93VarN9.d(r93VarN9).d(r93VarN9);
                        r93 r93VarN10 = r93VarX7.N(r93Var);
                        r93 r93VarD13 = r93VarN10.d(r93VarN10);
                        r93VarD = r93VarD13.d(r93VarD13);
                    } else {
                        r93 r93VarX10 = r93Var.X();
                        r93 r93VarD14 = r93VarX10.d(r93VarX10).d(r93VarX10);
                        if (zF2) {
                            r93VarE0 = r93VarD14.d(r93Var7);
                        } else if (r93Var7.I()) {
                            r93VarE0 = r93VarD14;
                        } else {
                            r93 r93VarX11 = r93Var6.X().X();
                            r93VarE0 = r93VarR.k() < r93Var7.k() ? r93VarD14.e0(r93VarX11.N(r93VarR)) : r93VarD14.d(r93VarX11.N(r93Var7));
                        }
                        r93 r93VarN11 = r93Var.N(r93VarX7);
                        r93 r93VarD15 = r93VarN11.d(r93VarN11);
                        r93VarD = r93VarD15.d(r93VarD15);
                    }
                    r93 r93VarE6 = r93VarE0.X().e0(r93VarD.d(r93VarD));
                    r93 r93VarN12 = r93VarD.e0(r93VarE6).N(r93VarE0);
                    r93 r93VarD16 = r93VarX8.d(r93VarX8);
                    r93 r93VarD17 = r93VarD16.d(r93VarD16);
                    r93 r93VarE7 = r93VarN12.e0(r93VarD17.d(r93VarD17));
                    r93 r93VarD18 = r93Var2.d(r93Var2);
                    if (!zF2) {
                        r93VarD18 = r93VarD18.N(r93Var6);
                    }
                    cvVar = new cv(m40Var, r93VarE6, r93VarE7, new r93[]{r93VarD18}, this.e, 1);
                }
                return cvVar;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                if (f()) {
                    return this;
                }
                int[] iArr17 = ((vk1) r93Var2).k;
                boolean zJ = r93.J(iArr17);
                m40 m40Var2 = this.a;
                if (zJ) {
                    return m40Var2.h();
                }
                vk1 vk1Var = (vk1) r93Var;
                vk1 vk1Var2 = (vk1) r93VarArr[0];
                int[] iArr18 = new int[8];
                int[] iArr19 = new int[8];
                int[] iArr20 = new int[8];
                aj0.Q(iArr17, iArr20);
                int[] iArr21 = new int[8];
                aj0.Q(iArr20, iArr21);
                int[] iArr22 = vk1Var2.k;
                boolean zG = r93.G(iArr22);
                if (zG) {
                    iArr = iArr22;
                } else {
                    aj0.Q(iArr22, iArr19);
                    iArr = iArr19;
                }
                int[] iArr23 = vk1Var.k;
                aj0.S(iArr23, iArr, iArr18);
                aj0.b(iArr23, iArr, iArr19);
                aj0.z(iArr19, iArr18, iArr19);
                aj0.M(iArr19, r93.e(iArr19, iArr19, iArr19));
                aj0.z(iArr20, iArr23, iArr20);
                aj0.M(iArr20, kv.c0(iArr20, 8));
                aj0.M(iArr18, kv.b0(8, iArr21, iArr18));
                vk1 vk1Var3 = new vk1(iArr21);
                aj0.Q(iArr19, iArr21);
                aj0.S(iArr21, iArr20, iArr21);
                aj0.S(iArr21, iArr20, iArr21);
                vk1 vk1Var4 = new vk1(iArr20);
                aj0.S(iArr20, iArr21, iArr20);
                aj0.z(iArr20, iArr19, iArr20);
                aj0.S(iArr20, iArr18, iArr20);
                vk1 vk1Var5 = new vk1(iArr19);
                if (kv.a0(8, 0, iArr17, iArr19) != 0 || ((iArr19[7] >>> 1) >= Integer.MAX_VALUE && r93.x(iArr19, aj0.b))) {
                    aj0.c(iArr19);
                }
                if (!zG) {
                    aj0.z(iArr19, iArr22, iArr19);
                }
                return new cv(m40Var2, vk1Var3, vk1Var4, new r93[]{vk1Var5}, this.e, 2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (f()) {
                    return this;
                }
                int[] iArr24 = ((rm1) r93Var2).k;
                boolean zG2 = am2.G(iArr24);
                m40 m40Var3 = this.a;
                if (zG2) {
                    return m40Var3.h();
                }
                rm1 rm1Var = (rm1) r93Var;
                rm1 rm1Var2 = (rm1) r93VarArr[0];
                int[] iArr25 = new int[4];
                int[] iArr26 = new int[4];
                int[] iArr27 = new int[4];
                sp0.F(iArr24, iArr27);
                int[] iArr28 = new int[4];
                sp0.F(iArr27, iArr28);
                int[] iArr29 = rm1Var2.k;
                boolean zF3 = am2.F(iArr29);
                if (zF3) {
                    iArr2 = iArr29;
                } else {
                    sp0.F(iArr29, iArr26);
                    iArr2 = iArr26;
                }
                int[] iArr30 = rm1Var.k;
                sp0.I(iArr30, iArr2, iArr25);
                sp0.b(iArr30, iArr2, iArr26);
                sp0.w(iArr26, iArr25, iArr26);
                sp0.y(iArr26, am2.h(iArr26, iArr26, iArr26));
                sp0.w(iArr27, iArr30, iArr27);
                sp0.y(iArr27, kv.c0(iArr27, 4));
                sp0.y(iArr25, kv.b0(4, iArr28, iArr25));
                rm1 rm1Var3 = new rm1(iArr28);
                sp0.F(iArr26, iArr28);
                sp0.I(iArr28, iArr27, iArr28);
                sp0.I(iArr28, iArr27, iArr28);
                rm1 rm1Var4 = new rm1(iArr27);
                sp0.I(iArr27, iArr28, iArr27);
                sp0.w(iArr27, iArr26, iArr27);
                sp0.I(iArr27, iArr25, iArr27);
                rm1 rm1Var5 = new rm1(iArr26);
                if (kv.a0(4, 0, iArr24, iArr26) != 0 || ((iArr26[3] >>> 1) >= 2147483646 && am2.B(iArr26, sp0.b))) {
                    sp0.c(iArr26);
                }
                if (!zF3) {
                    sp0.w(iArr26, iArr29, iArr26);
                }
                return new cv(m40Var3, rm1Var3, rm1Var4, new r93[]{rm1Var5}, this.e, 3);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (f()) {
                    return this;
                }
                int[] iArr31 = ((wm1) r93Var2).k;
                boolean zA = gu2.A(iArr31);
                m40 m40Var4 = this.a;
                if (zA) {
                    return m40Var4.h();
                }
                wm1 wm1Var = (wm1) r93Var;
                wm1 wm1Var2 = (wm1) r93VarArr[0];
                int[] iArr32 = new int[5];
                y21.r(iArr31, iArr32);
                int[] iArr33 = new int[5];
                y21.r(iArr32, iArr33);
                int[] iArr34 = new int[5];
                y21.r(wm1Var.k, iArr34);
                y21.q(iArr34, gu2.d(iArr34, iArr34, iArr34));
                y21.m(iArr32, wm1Var.k, iArr32);
                y21.q(iArr32, kv.c0(iArr32, 5));
                int[] iArr35 = new int[5];
                y21.q(iArr35, kv.b0(5, iArr33, iArr35));
                wm1 wm1Var3 = new wm1(iArr33);
                y21.r(iArr34, iArr33);
                y21.t(iArr33, iArr32, iArr33);
                y21.t(iArr33, iArr32, iArr33);
                wm1 wm1Var4 = new wm1(iArr32);
                y21.t(iArr32, iArr33, iArr32);
                y21.m(iArr32, iArr34, iArr32);
                y21.t(iArr32, iArr35, iArr32);
                wm1 wm1Var5 = new wm1(iArr34);
                y21.v(iArr31, iArr34);
                if (!gu2.z(wm1Var2.k)) {
                    y21.m(iArr34, wm1Var2.k, iArr34);
                }
                return new cv(m40Var4, wm1Var3, wm1Var4, new r93[]{wm1Var5}, this.e, 4);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                int[] iArr36 = rq0.d;
                if (f()) {
                    return this;
                }
                int[] iArr37 = ((um1) r93Var2).k;
                boolean zA2 = gu2.A(iArr37);
                m40 m40Var5 = this.a;
                if (zA2) {
                    return m40Var5.h();
                }
                um1 um1Var = (um1) r93Var;
                um1 um1Var2 = (um1) r93VarArr[0];
                int[] iArr38 = new int[5];
                int[] iArr39 = new int[5];
                int[] iArr40 = new int[5];
                rq0.C(iArr37, iArr40);
                int[] iArr41 = new int[5];
                rq0.C(iArr40, iArr41);
                int[] iArr42 = um1Var2.k;
                boolean z = gu2.z(iArr42);
                if (z) {
                    iArr3 = iArr42;
                } else {
                    rq0.C(iArr42, iArr39);
                    iArr3 = iArr39;
                }
                int[] iArr43 = um1Var.k;
                rq0.E(iArr43, iArr3, iArr38);
                if (gu2.c(iArr43, iArr3, iArr39) != 0 || (iArr39[4] == -1 && gu2.w(iArr39, iArr36))) {
                    i = 5;
                    kv.j(5, -2147483647, iArr39);
                } else {
                    i = 5;
                }
                rq0.y(iArr39, iArr38, iArr39);
                rq0.B(iArr39, gu2.d(iArr39, iArr39, iArr39));
                rq0.y(iArr40, iArr43, iArr40);
                rq0.B(iArr40, kv.c0(iArr40, i));
                rq0.B(iArr38, kv.b0(i, iArr41, iArr38));
                um1 um1Var3 = new um1(iArr41);
                rq0.C(iArr39, iArr41);
                rq0.E(iArr41, iArr40, iArr41);
                rq0.E(iArr41, iArr40, iArr41);
                um1 um1Var4 = new um1(iArr40);
                rq0.E(iArr40, iArr41, iArr40);
                rq0.y(iArr40, iArr39, iArr40);
                rq0.E(iArr40, iArr38, iArr40);
                um1 um1Var5 = new um1(iArr39);
                if (kv.a0(5, 0, iArr37, iArr39) != 0 || (iArr39[4] == -1 && gu2.w(iArr39, iArr36))) {
                    kv.j(5, -2147483647, iArr39);
                }
                if (!z) {
                    rq0.y(iArr39, iArr42, iArr39);
                }
                return new cv(m40Var5, um1Var3, um1Var4, new r93[]{um1Var5}, this.e, 5);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                if (f()) {
                    return this;
                }
                int[] iArr44 = ((wm1) r93Var2).k;
                boolean zA3 = gu2.A(iArr44);
                m40 m40Var6 = this.a;
                if (zA3) {
                    return m40Var6.h();
                }
                wm1 wm1Var6 = (wm1) r93Var;
                wm1 wm1Var7 = (wm1) r93VarArr[0];
                int[] iArr45 = new int[5];
                int[] iArr46 = new int[5];
                int[] iArr47 = new int[5];
                y21.r(iArr44, iArr47);
                int[] iArr48 = new int[5];
                y21.r(iArr47, iArr48);
                int[] iArr49 = wm1Var7.k;
                boolean z2 = gu2.z(iArr49);
                if (z2) {
                    iArr4 = iArr49;
                } else {
                    y21.r(iArr49, iArr46);
                    iArr4 = iArr46;
                }
                int[] iArr50 = wm1Var6.k;
                y21.t(iArr50, iArr4, iArr45);
                if (gu2.c(iArr50, iArr4, iArr46) != 0 || (iArr46[4] == -1 && gu2.w(iArr46, y21.c))) {
                    i2 = 5;
                    kv.d(5, 21389, iArr46);
                } else {
                    i2 = 5;
                }
                y21.m(iArr46, iArr45, iArr46);
                y21.q(iArr46, gu2.d(iArr46, iArr46, iArr46));
                y21.m(iArr47, iArr50, iArr47);
                y21.q(iArr47, kv.c0(iArr47, i2));
                y21.q(iArr45, kv.b0(i2, iArr48, iArr45));
                wm1 wm1Var8 = new wm1(iArr48);
                y21.r(iArr46, iArr48);
                y21.t(iArr48, iArr47, iArr48);
                y21.t(iArr48, iArr47, iArr48);
                wm1 wm1Var9 = new wm1(iArr47);
                y21.t(iArr47, iArr48, iArr47);
                y21.m(iArr47, iArr46, iArr47);
                y21.t(iArr47, iArr45, iArr47);
                wm1 wm1Var10 = new wm1(iArr46);
                y21.v(iArr44, iArr46);
                if (!z2) {
                    y21.m(iArr46, iArr49, iArr46);
                }
                return new cv(m40Var6, wm1Var8, wm1Var9, new r93[]{wm1Var10}, this.e, 6);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if (f()) {
                    return this;
                }
                int[] iArr51 = ((ym1) r93Var2).k;
                boolean zD = yv2.D(iArr51);
                m40 m40Var7 = this.a;
                if (zD) {
                    return m40Var7.h();
                }
                ym1 ym1Var = (ym1) r93Var;
                ym1 ym1Var2 = (ym1) r93VarArr[0];
                int[] iArr52 = new int[6];
                x91.N(iArr51, iArr52);
                int[] iArr53 = new int[6];
                x91.N(iArr52, iArr53);
                int[] iArr54 = new int[6];
                x91.N(ym1Var.k, iArr54);
                x91.J(iArr54, yv2.c(iArr54, iArr54, iArr54));
                x91.D(iArr52, ym1Var.k, iArr52);
                x91.J(iArr52, kv.c0(iArr52, 6));
                int[] iArr55 = new int[6];
                x91.J(iArr55, kv.b0(6, iArr53, iArr55));
                ym1 ym1Var3 = new ym1(iArr53);
                x91.N(iArr54, iArr53);
                x91.Q(iArr53, iArr52, iArr53);
                x91.Q(iArr53, iArr52, iArr53);
                ym1 ym1Var4 = new ym1(iArr52);
                x91.Q(iArr52, iArr53, iArr52);
                x91.D(iArr52, iArr54, iArr52);
                x91.Q(iArr52, iArr55, iArr52);
                ym1 ym1Var5 = new ym1(iArr54);
                if (kv.a0(6, 0, iArr51, iArr54) != 0 || (iArr54[5] == -1 && yv2.B(iArr54, x91.b))) {
                    kv.d(6, 4553, iArr54);
                }
                if (!yv2.C(ym1Var2.k)) {
                    x91.D(iArr54, ym1Var2.k, iArr54);
                }
                return new cv(m40Var7, ym1Var3, ym1Var4, new r93[]{ym1Var5}, this.e, 7);
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int[] iArr56 = ye1.c;
                if (f()) {
                    return this;
                }
                int[] iArr57 = ((an1) r93Var2).k;
                boolean zD2 = yv2.D(iArr57);
                m40 m40Var8 = this.a;
                if (zD2) {
                    return m40Var8.h();
                }
                an1 an1Var = (an1) r93Var;
                an1 an1Var2 = (an1) r93VarArr[0];
                int[] iArr58 = new int[6];
                int[] iArr59 = new int[6];
                int[] iArr60 = new int[6];
                ye1.z(iArr57, iArr60);
                int[] iArr61 = new int[6];
                ye1.z(iArr60, iArr61);
                int[] iArr62 = an1Var2.k;
                boolean zC = yv2.C(iArr62);
                if (zC) {
                    iArr5 = iArr62;
                } else {
                    ye1.z(iArr62, iArr59);
                    iArr5 = iArr59;
                }
                int[] iArr63 = an1Var.k;
                ye1.C(iArr63, iArr5, iArr58);
                if (yv2.b(iArr63, iArr5, iArr59) != 0 || (iArr59[5] == -1 && yv2.B(iArr59, iArr56))) {
                    ye1.f(iArr59);
                }
                ye1.r(iArr59, iArr58, iArr59);
                ye1.w(iArr59, yv2.c(iArr59, iArr59, iArr59));
                ye1.r(iArr60, iArr63, iArr60);
                ye1.w(iArr60, kv.c0(iArr60, 6));
                ye1.w(iArr58, kv.b0(6, iArr61, iArr58));
                an1 an1Var3 = new an1(iArr61);
                ye1.z(iArr59, iArr61);
                ye1.C(iArr61, iArr60, iArr61);
                ye1.C(iArr61, iArr60, iArr61);
                an1 an1Var4 = new an1(iArr60);
                ye1.C(iArr60, iArr61, iArr60);
                ye1.r(iArr60, iArr59, iArr60);
                ye1.C(iArr60, iArr58, iArr60);
                an1 an1Var5 = new an1(iArr59);
                if (kv.a0(6, 0, iArr57, iArr59) != 0 || (iArr59[5] == -1 && yv2.B(iArr59, iArr56))) {
                    ye1.f(iArr59);
                }
                if (!zC) {
                    ye1.r(iArr59, iArr62, iArr59);
                }
                return new cv(m40Var8, an1Var3, an1Var4, new r93[]{an1Var5}, this.e, 8);
            case 9:
                if (f()) {
                    return this;
                }
                int[] iArr64 = ((cn1) r93Var2).k;
                boolean zW = g93.w(iArr64);
                m40 m40Var9 = this.a;
                if (zW) {
                    return m40Var9.h();
                }
                cn1 cn1Var = (cn1) r93Var;
                cn1 cn1Var2 = (cn1) r93VarArr[0];
                int[] iArr65 = new int[7];
                gb2.D(iArr64, iArr65);
                int[] iArr66 = new int[7];
                gb2.D(iArr65, iArr66);
                int[] iArr67 = new int[7];
                gb2.D(cn1Var.k, iArr67);
                gb2.B(iArr67, g93.e(iArr67, iArr67, iArr67));
                gb2.v(iArr65, cn1Var.k, iArr65);
                gb2.B(iArr65, kv.c0(iArr65, 7));
                int[] iArr68 = new int[7];
                gb2.B(iArr68, kv.b0(7, iArr66, iArr68));
                cn1 cn1Var3 = new cn1(iArr66);
                gb2.D(iArr67, iArr66);
                gb2.H(iArr66, iArr65, iArr66);
                gb2.H(iArr66, iArr65, iArr66);
                cn1 cn1Var4 = new cn1(iArr65);
                gb2.H(iArr65, iArr66, iArr65);
                gb2.v(iArr65, iArr67, iArr65);
                gb2.H(iArr65, iArr68, iArr65);
                cn1 cn1Var5 = new cn1(iArr67);
                if (kv.a0(7, 0, iArr64, iArr67) != 0 || (iArr67[6] == -1 && g93.s(iArr67, gb2.b))) {
                    kv.d(7, 6803, iArr67);
                }
                if (!g93.v(cn1Var2.k)) {
                    gb2.v(iArr67, cn1Var2.k, iArr67);
                }
                return new cv(m40Var9, cn1Var3, cn1Var4, new r93[]{cn1Var5}, this.e, 9);
            case 10:
                if (f()) {
                    return this;
                }
                int[] iArr69 = ((en1) r93Var2).k;
                boolean zW2 = g93.w(iArr69);
                m40 m40Var10 = this.a;
                if (zW2) {
                    return m40Var10.h();
                }
                en1 en1Var = (en1) r93Var;
                en1 en1Var2 = (en1) r93VarArr[0];
                int[] iArr70 = new int[7];
                int[] iArr71 = new int[7];
                int[] iArr72 = new int[7];
                nj2.T(iArr69, iArr72);
                int[] iArr73 = new int[7];
                nj2.T(iArr72, iArr73);
                int[] iArr74 = en1Var2.k;
                boolean zV = g93.v(iArr74);
                if (zV) {
                    iArr6 = iArr74;
                } else {
                    nj2.T(iArr74, iArr71);
                    iArr6 = iArr71;
                }
                int[] iArr75 = en1Var.k;
                nj2.W(iArr75, iArr6, iArr70);
                nj2.h(iArr75, iArr6, iArr71);
                nj2.L(iArr71, iArr70, iArr71);
                nj2.P(iArr71, g93.e(iArr71, iArr71, iArr71));
                nj2.L(iArr72, iArr75, iArr72);
                nj2.P(iArr72, kv.c0(iArr72, 7));
                nj2.P(iArr70, kv.b0(7, iArr73, iArr70));
                en1 en1Var3 = new en1(iArr73);
                nj2.T(iArr71, iArr73);
                nj2.W(iArr73, iArr72, iArr73);
                nj2.W(iArr73, iArr72, iArr73);
                en1 en1Var4 = new en1(iArr72);
                nj2.W(iArr72, iArr73, iArr72);
                nj2.L(iArr72, iArr71, iArr72);
                nj2.W(iArr72, iArr70, iArr72);
                en1 en1Var5 = new en1(iArr71);
                nj2.X(iArr69, iArr71);
                if (!zV) {
                    nj2.L(iArr71, iArr74, iArr71);
                }
                return new cv(m40Var10, en1Var3, en1Var4, new r93[]{en1Var5}, this.e, 10);
            case 11:
                if (f()) {
                    return this;
                }
                int[] iArr76 = ((gn1) r93Var2).k;
                boolean zJ2 = r93.J(iArr76);
                m40 m40Var11 = this.a;
                if (zJ2) {
                    return m40Var11.h();
                }
                gn1 gn1Var = (gn1) r93Var;
                gn1 gn1Var2 = (gn1) r93VarArr[0];
                int[] iArr77 = new int[8];
                am2.R(iArr76, iArr77);
                int[] iArr78 = new int[8];
                am2.R(iArr77, iArr78);
                int[] iArr79 = new int[8];
                am2.R(gn1Var.k, iArr79);
                am2.P(iArr79, r93.e(iArr79, iArr79, iArr79));
                am2.J(iArr77, gn1Var.k, iArr77);
                am2.P(iArr77, kv.c0(iArr77, 8));
                int[] iArr80 = new int[8];
                am2.P(iArr80, kv.b0(8, iArr78, iArr80));
                gn1 gn1Var3 = new gn1(iArr78);
                am2.R(iArr79, iArr78);
                am2.W(iArr78, iArr77, iArr78);
                am2.W(iArr78, iArr77, iArr78);
                gn1 gn1Var4 = new gn1(iArr77);
                am2.W(iArr77, iArr78, iArr77);
                am2.J(iArr77, iArr79, iArr77);
                am2.W(iArr77, iArr80, iArr77);
                gn1 gn1Var5 = new gn1(iArr79);
                if (kv.a0(8, 0, iArr76, iArr79) != 0 || (iArr79[7] == -1 && r93.x(iArr79, am2.b))) {
                    kv.d(8, 977, iArr79);
                }
                if (!r93.G(gn1Var2.k)) {
                    am2.J(iArr79, gn1Var2.k, iArr79);
                }
                return new cv(m40Var11, gn1Var3, gn1Var4, new r93[]{gn1Var5}, this.e, 11);
            case 12:
                int[] iArr81 = gu2.e;
                if (f()) {
                    return this;
                }
                int[] iArr82 = ((in1) r93Var2).k;
                boolean zJ3 = r93.J(iArr82);
                m40 m40Var12 = this.a;
                if (zJ3) {
                    return m40Var12.h();
                }
                in1 in1Var = (in1) r93Var;
                in1 in1Var2 = (in1) r93VarArr[0];
                int[] iArr83 = new int[8];
                int[] iArr84 = new int[8];
                int[] iArr85 = new int[8];
                gu2.G(iArr82, iArr85);
                int[] iArr86 = new int[8];
                gu2.G(iArr85, iArr86);
                int[] iArr87 = in1Var2.k;
                boolean zG3 = r93.G(iArr87);
                if (zG3) {
                    iArr7 = iArr87;
                } else {
                    gu2.G(iArr87, iArr84);
                    iArr7 = iArr84;
                }
                int[] iArr88 = in1Var.k;
                gu2.L(iArr88, iArr7, iArr83);
                if (r93.c(iArr88, iArr7, iArr84) != 0 || (iArr84[7] == -1 && r93.x(iArr84, iArr81))) {
                    gu2.e(iArr84);
                }
                gu2.D(iArr84, iArr83, iArr84);
                gu2.F(iArr84, r93.e(iArr84, iArr84, iArr84));
                gu2.D(iArr85, iArr88, iArr85);
                gu2.F(iArr85, kv.c0(iArr85, 8));
                gu2.F(iArr83, kv.b0(8, iArr86, iArr83));
                in1 in1Var3 = new in1(iArr86);
                gu2.G(iArr84, iArr86);
                gu2.L(iArr86, iArr85, iArr86);
                gu2.L(iArr86, iArr85, iArr86);
                in1 in1Var4 = new in1(iArr85);
                gu2.L(iArr85, iArr86, iArr85);
                gu2.D(iArr85, iArr84, iArr85);
                gu2.L(iArr85, iArr83, iArr85);
                in1 in1Var5 = new in1(iArr84);
                if (kv.a0(8, 0, iArr82, iArr84) != 0 || (iArr84[7] == -1 && r93.x(iArr84, iArr81))) {
                    gu2.e(iArr84);
                }
                if (!zG3) {
                    gu2.D(iArr84, iArr87, iArr84);
                }
                return new cv(m40Var12, in1Var3, in1Var4, new r93[]{in1Var5}, this.e, 12);
            case 13:
                int[] iArr89 = yv2.h;
                if (f()) {
                    return this;
                }
                kn1 kn1Var = (kn1) r93Var2;
                boolean zI2 = kn1Var.I();
                int[] iArr90 = kn1Var.k;
                m40 m40Var13 = this.a;
                if (zI2) {
                    return m40Var13.h();
                }
                kn1 kn1Var2 = (kn1) r93Var;
                kn1 kn1Var3 = (kn1) r93VarArr[0];
                int[] iArr91 = new int[12];
                int[] iArr92 = new int[12];
                int[] iArr93 = new int[12];
                yv2.M(iArr90, iArr93);
                int[] iArr94 = new int[12];
                yv2.M(iArr93, iArr94);
                boolean zF4 = kn1Var3.F();
                int[] iArr95 = kn1Var3.k;
                if (zF4) {
                    iArr8 = iArr95;
                } else {
                    yv2.M(iArr95, iArr92);
                    iArr8 = iArr92;
                }
                int[] iArr96 = kn1Var2.k;
                yv2.T(iArr96, iArr8, iArr91);
                if (kv.b(12, iArr96, iArr8, iArr92) != 0 || (iArr92[11] == -1 && kv.C(12, iArr92, iArr89))) {
                    yv2.d(iArr92);
                }
                yv2.J(iArr92, iArr91, iArr92);
                yv2.L(iArr92, kv.e(12, iArr92, iArr92, iArr92));
                yv2.J(iArr93, iArr96, iArr93);
                yv2.L(iArr93, kv.c0(iArr93, 12));
                yv2.L(iArr91, kv.b0(12, iArr94, iArr91));
                kn1 kn1Var4 = new kn1(iArr94);
                yv2.M(iArr92, iArr94);
                yv2.T(iArr94, iArr93, iArr94);
                yv2.T(iArr94, iArr93, iArr94);
                kn1 kn1Var5 = new kn1(iArr93);
                yv2.T(iArr93, iArr94, iArr93);
                yv2.J(iArr93, iArr92, iArr93);
                yv2.T(iArr93, iArr91, iArr93);
                kn1 kn1Var6 = new kn1(iArr92);
                if (kv.a0(12, 0, iArr90, iArr92) != 0 || (iArr92[11] == -1 && kv.C(12, iArr92, iArr89))) {
                    yv2.d(iArr92);
                }
                if (!zF4) {
                    yv2.J(iArr92, iArr95, iArr92);
                }
                return new cv(m40Var13, kn1Var4, kn1Var5, new r93[]{kn1Var6}, this.e, 13);
            default:
                if (f()) {
                    return this;
                }
                mn1 mn1Var = (mn1) r93Var2;
                boolean zI3 = mn1Var.I();
                int[] iArr97 = mn1Var.k;
                m40 m40Var14 = this.a;
                if (zI3) {
                    return m40Var14.h();
                }
                mn1 mn1Var2 = (mn1) r93Var;
                mn1 mn1Var3 = (mn1) r93VarArr[0];
                int[] iArr98 = new int[17];
                int[] iArr99 = new int[17];
                int[] iArr100 = new int[17];
                g93.E(iArr97, iArr100);
                int[] iArr101 = new int[17];
                g93.E(iArr100, iArr101);
                boolean zF5 = mn1Var3.F();
                int[] iArr102 = mn1Var3.k;
                if (zF5) {
                    iArr9 = iArr102;
                } else {
                    g93.E(iArr102, iArr99);
                    iArr9 = iArr99;
                }
                int[] iArr103 = mn1Var2.k;
                g93.H(iArr103, iArr9, iArr98);
                g93.d(iArr103, iArr9, iArr99);
                g93.z(iArr99, iArr98, iArr99);
                kv.e(17, iArr99, iArr99, iArr99);
                g93.C(iArr99);
                g93.z(iArr100, iArr103, iArr100);
                kv.c0(iArr100, 17);
                g93.C(iArr100);
                kv.b0(17, iArr101, iArr98);
                g93.C(iArr98);
                mn1 mn1Var4 = new mn1(iArr101);
                g93.E(iArr99, iArr101);
                g93.H(iArr101, iArr100, iArr101);
                g93.H(iArr101, iArr100, iArr101);
                mn1 mn1Var5 = new mn1(iArr100);
                g93.H(iArr100, iArr101, iArr100);
                g93.z(iArr100, iArr99, iArr100);
                g93.H(iArr100, iArr98, iArr100);
                mn1 mn1Var6 = new mn1(iArr99);
                int i5 = iArr97[16];
                iArr99[16] = (kv.a0(16, i5 << 23, iArr97, iArr99) | (i5 << 1)) & 511;
                if (!zF5) {
                    g93.z(iArr99, iArr102, iArr99);
                }
                return new cv(m40Var14, mn1Var4, mn1Var5, new r93[]{mn1Var6}, this.e, 14);
        }
    }

    public bv r(bv bvVar, int[] iArr) {
        bv bvVar2 = (bv) this.a.b;
        if (r93.G(bvVar.k)) {
            return bvVar2;
        }
        bv bvVar3 = new bv();
        int[] iArr2 = new int[8];
        bvVar3.k = iArr2;
        if (iArr == null) {
            qt.x(bvVar.k, iArr2);
            iArr = iArr2;
        }
        qt.x(iArr, iArr2);
        qt.r(iArr2, bvVar2.k, iArr2);
        return bvVar3;
    }

    public r93 s(r93 r93Var, r93 r93Var2) {
        r93 r93Var3 = this.a.b;
        if (r93Var3.I() || r93Var.F()) {
            return r93Var3;
        }
        if (r93Var2 == null) {
            r93Var2 = r93Var.X();
        }
        r93 r93VarX = r93Var2.X();
        r93 r93VarR = r93Var3.R();
        return r93VarR.k() < r93Var3.k() ? r93VarX.N(r93VarR).R() : r93VarX.N(r93Var3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(m40 m40Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(m40Var, r93Var, r93Var2, 1);
        this.h = 1;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(uk1 uk1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(uk1Var, r93Var, r93Var2, 1);
        this.h = 2;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(qm1 qm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(qm1Var, r93Var, r93Var2, 1);
        this.h = 3;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(sm1 sm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(sm1Var, r93Var, r93Var2, 1);
        this.h = 4;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(tm1 tm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(tm1Var, r93Var, r93Var2, 1);
        this.h = 5;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(vm1 vm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(vm1Var, r93Var, r93Var2, 1);
        this.h = 6;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(xm1 xm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(xm1Var, r93Var, r93Var2, 1);
        this.h = 7;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(zm1 zm1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(zm1Var, r93Var, r93Var2, 1);
        this.h = 8;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(bn1 bn1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(bn1Var, r93Var, r93Var2, 1);
        this.h = 9;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(dn1 dn1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(dn1Var, r93Var, r93Var2, 1);
        this.h = 10;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(fn1 fn1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(fn1Var, r93Var, r93Var2, 1);
        this.h = 11;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(hn1 hn1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(hn1Var, r93Var, r93Var2, 1);
        this.h = 12;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(jn1 jn1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(jn1Var, r93Var, r93Var2, 1);
        this.h = 13;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(ln1 ln1Var, r93 r93Var, r93 r93Var2, boolean z) {
        super(ln1Var, r93Var, r93Var2, 1);
        this.h = 14;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(av avVar, r93 r93Var, r93 r93Var2, boolean z) {
        super(avVar, r93Var, r93Var2, 1);
        this.h = 0;
        if ((r93Var == null) == (r93Var2 == null)) {
            this.e = z;
        } else {
            e.g("Exactly one of the field elements is null");
            throw null;
        }
    }
}
