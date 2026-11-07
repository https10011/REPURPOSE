package defpackage;

import android.view.View;
import com.hjq.toast.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class qr {
    public float A;
    public final int[] B;
    public float C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public final cr H;
    public final cr I;
    public final cr J;
    public final cr K;
    public final cr L;
    public final cr M;
    public final cr N;
    public final cr O;
    public final cr[] P;
    public final ArrayList Q;
    public final boolean[] R;
    public qr S;
    public int T;
    public int U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public int a0;
    public gl b;
    public int b0;
    public gl c;
    public float c0;
    public float d0;
    public View e0;
    public int f0;
    public String g0;
    public int h0;
    public int i0;
    public boolean j;
    public final float[] j0;
    public boolean k;
    public final qr[] k0;
    public boolean l;
    public final qr[] l0;
    public boolean m;
    public int m0;
    public int n;
    public int n0;
    public int o;
    public final int[] o0;
    public int p;
    public int q;
    public int r;
    public final int[] s;
    public int t;
    public int u;
    public float v;
    public int w;
    public int x;
    public float y;
    public int z;
    public boolean a = false;
    public gm0 d = null;
    public e52 e = null;
    public final boolean[] f = {true, true};
    public boolean g = true;
    public int h = -1;
    public int i = -1;

    public qr() {
        new HashMap();
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        this.n = -1;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = new int[2];
        this.t = 0;
        this.u = 0;
        this.v = 1.0f;
        this.w = 0;
        this.x = 0;
        this.y = 1.0f;
        this.z = -1;
        this.A = 1.0f;
        this.B = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.C = 0.0f;
        this.D = false;
        this.E = false;
        this.F = 0;
        this.G = 0;
        cr crVar = new cr(this, 2);
        this.H = crVar;
        cr crVar2 = new cr(this, 3);
        this.I = crVar2;
        cr crVar3 = new cr(this, 4);
        this.J = crVar3;
        cr crVar4 = new cr(this, 5);
        this.K = crVar4;
        cr crVar5 = new cr(this, 6);
        this.L = crVar5;
        cr crVar6 = new cr(this, 8);
        this.M = crVar6;
        cr crVar7 = new cr(this, 9);
        this.N = crVar7;
        cr crVar8 = new cr(this, 7);
        this.O = crVar8;
        this.P = new cr[]{crVar, crVar3, crVar2, crVar4, crVar5, crVar8};
        ArrayList arrayList = new ArrayList();
        this.Q = arrayList;
        this.R = new boolean[2];
        this.o0 = new int[]{1, 1};
        this.S = null;
        this.T = 0;
        this.U = 0;
        this.V = 0.0f;
        this.W = -1;
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.c0 = 0.5f;
        this.d0 = 0.5f;
        this.f0 = 0;
        this.g0 = null;
        this.h0 = 0;
        this.i0 = 0;
        this.j0 = new float[]{-1.0f, -1.0f};
        this.k0 = new qr[]{null, null};
        this.l0 = new qr[]{null, null};
        this.m0 = -1;
        this.n0 = -1;
        arrayList.add(crVar);
        arrayList.add(crVar2);
        arrayList.add(crVar3);
        arrayList.add(crVar4);
        arrayList.add(crVar6);
        arrayList.add(crVar7);
        arrayList.add(crVar8);
        arrayList.add(crVar5);
    }

    public final void A() {
        qr qrVar = this.S;
        if (qrVar != null && (qrVar instanceof rr)) {
            ((rr) qrVar).getClass();
        }
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cr) arrayList.get(i)).j();
        }
    }

    public final void B() {
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = false;
        ArrayList arrayList = this.Q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cr crVar = (cr) arrayList.get(i);
            crVar.c = false;
            crVar.b = 0;
        }
    }

    public void C(ac2 ac2Var) {
        this.H.k();
        this.I.k();
        this.J.k();
        this.K.k();
        this.L.k();
        this.O.k();
        this.M.k();
        this.N.k();
    }

    public final void D(int i) {
        this.Z = i;
        this.D = i > 0;
    }

    public final void E(int i, int i2) {
        if (this.j) {
            return;
        }
        this.H.l(i);
        this.J.l(i2);
        this.X = i;
        this.T = i2 - i;
        this.j = true;
    }

    public final void F(int i, int i2) {
        if (this.k) {
            return;
        }
        this.I.l(i);
        this.K.l(i2);
        this.Y = i;
        this.U = i2 - i;
        if (this.D) {
            this.L.l(i + this.Z);
        }
        this.k = true;
    }

    public final void G(int i) {
        this.U = i;
        int i2 = this.b0;
        if (i < i2) {
            this.U = i2;
        }
    }

    public final void H(int i) {
        this.o0[0] = i;
    }

    public final void I(int i) {
        this.o0[1] = i;
    }

    public final void J(int i) {
        this.T = i;
        int i2 = this.a0;
        if (i < i2) {
            this.T = i2;
        }
    }

    public void K(boolean z, boolean z2) {
        int i;
        int i2;
        gm0 gm0Var = this.d;
        boolean z3 = z & gm0Var.g;
        e52 e52Var = this.e;
        boolean z4 = z2 & e52Var.g;
        int i3 = gm0Var.h.g;
        int i4 = e52Var.h.g;
        int i5 = gm0Var.i.g;
        int i6 = e52Var.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.X = i3;
        }
        if (z4) {
            this.Y = i4;
        }
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.T)) {
                i8 = i2;
            }
            this.T = i8;
            int i10 = this.a0;
            if (i8 < i10) {
                this.T = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.U)) {
                i9 = i;
            }
            this.U = i9;
            int i11 = this.b0;
            if (i9 < i11) {
                this.U = i11;
            }
        }
    }

    public void L(zx0 zx0Var, boolean z) {
        int i;
        int i2;
        e52 e52Var;
        gm0 gm0Var;
        zx0Var.getClass();
        int iN = zx0.n(this.H);
        int iN2 = zx0.n(this.I);
        int iN3 = zx0.n(this.J);
        int iN4 = zx0.n(this.K);
        if (z && (gm0Var = this.d) != null) {
            z00 z00Var = gm0Var.h;
            if (z00Var.j) {
                z00 z00Var2 = gm0Var.i;
                if (z00Var2.j) {
                    iN = z00Var.g;
                    iN3 = z00Var2.g;
                }
            }
        }
        if (z && (e52Var = this.e) != null) {
            z00 z00Var3 = e52Var.h;
            if (z00Var3.j) {
                z00 z00Var4 = e52Var.i;
                if (z00Var4.j) {
                    iN2 = z00Var3.g;
                    iN4 = z00Var4.g;
                }
            }
        }
        int i3 = iN4 - iN2;
        if (iN3 - iN < 0 || i3 < 0 || iN == Integer.MIN_VALUE || iN == Integer.MAX_VALUE || iN2 == Integer.MIN_VALUE || iN2 == Integer.MAX_VALUE || iN3 == Integer.MIN_VALUE || iN3 == Integer.MAX_VALUE || iN4 == Integer.MIN_VALUE || iN4 == Integer.MAX_VALUE) {
            iN = 0;
            iN2 = 0;
            iN3 = 0;
            iN4 = 0;
        }
        int i4 = iN3 - iN;
        int i5 = iN4 - iN2;
        this.X = iN;
        this.Y = iN2;
        if (this.f0 == 8) {
            this.T = 0;
            this.U = 0;
            return;
        }
        int[] iArr = this.o0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.T)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.U)) {
            i5 = i;
        }
        this.T = i4;
        this.U = i5;
        int i7 = this.b0;
        if (i5 < i7) {
            this.U = i7;
        }
        int i8 = this.a0;
        if (i4 < i8) {
            this.T = i8;
        }
        int i9 = this.u;
        if (i9 > 0 && i6 == 3) {
            this.T = Math.min(this.T, i9);
        }
        int i10 = this.x;
        if (i10 > 0 && iArr[1] == 3) {
            this.U = Math.min(this.U, i10);
        }
        int i11 = this.T;
        if (i4 != i11) {
            this.h = i11;
        }
        int i12 = this.U;
        if (i5 != i12) {
            this.i = i12;
        }
    }

    public final void a(rr rrVar, zx0 zx0Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            d42.d(rrVar, zx0Var, this);
            hashSet.remove(this);
            b(zx0Var, rrVar.R(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.H.a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((cr) it.next()).d.a(rrVar, zx0Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.J.a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((cr) it2.next()).d.a(rrVar, zx0Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.I.a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((cr) it3.next()).d.a(rrVar, zx0Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.K.a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((cr) it4.next()).d.a(rrVar, zx0Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.L.a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((cr) it5.next()).d.a(rrVar, zx0Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0204  */
    /* JADX WARN: Code duplicated, block: B:125:0x020c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0215  */
    /* JADX WARN: Code duplicated, block: B:130:0x021b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0226  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:135:0x023b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0261  */
    /* JADX WARN: Code duplicated, block: B:157:0x028b  */
    /* JADX WARN: Code duplicated, block: B:161:0x029a  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:168:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:170:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:179:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:249:0x03ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:250:0x03b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:255:0x03c7 A[PHI: r13
      0x03c7: PHI (r13v37 int) = (r13v22 int), (r13v22 int), (r13v34 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int), (r13v22 int) binds: [B:257:0x03cf, B:258:0x03d1, B:252:0x03bb, B:239:0x0390, B:245:0x039e, B:247:0x03a2, B:248:0x03a4, B:244:0x039a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:257:0x03cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x03d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:268:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    /* JADX WARN: Code duplicated, block: B:274:0x0412 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:276:0x0416  */
    /* JADX WARN: Code duplicated, block: B:279:0x041a  */
    /* JADX WARN: Code duplicated, block: B:284:0x0426  */
    /* JADX WARN: Code duplicated, block: B:287:0x042e  */
    /* JADX WARN: Code duplicated, block: B:290:0x0434  */
    /* JADX WARN: Code duplicated, block: B:292:0x0437  */
    /* JADX WARN: Code duplicated, block: B:295:0x0453  */
    /* JADX WARN: Code duplicated, block: B:314:0x049a  */
    /* JADX WARN: Code duplicated, block: B:330:0x0537  */
    /* JADX WARN: Code duplicated, block: B:346:0x058a  */
    /* JADX WARN: Code duplicated, block: B:349:0x059c  */
    /* JADX WARN: Code duplicated, block: B:352:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:389:0x0661  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:391:0x0667  */
    /* JADX WARN: Code duplicated, block: B:393:0x0670  */
    /* JADX WARN: Code duplicated, block: B:394:0x0697  */
    /* JADX WARN: Code duplicated, block: B:397:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:400:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:67:0x010f  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0129  */
    /* JADX WARN: Code duplicated, block: B:79:0x0141  */
    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r4v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r58v0, types: [qr] */
    public void b(zx0 zx0Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean[] zArr;
        int i5;
        int i6;
        boolean z2;
        HashSet hashSet;
        qr qrVar;
        rr rrVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        qr qrVar2;
        rr rrVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr2;
        cr crVar;
        boolean[] zArr3;
        boolean z3;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        boolean z5;
        int i13;
        boolean z6;
        float f;
        int i14;
        int i15;
        cr crVar2;
        int i16;
        int i17;
        int i18;
        boolean z7;
        int i19;
        boolean z8;
        boolean z9;
        cr crVar3;
        int i20;
        cr crVar4;
        as1 as1Var;
        as1 as1Var2;
        as1 as1Var3;
        boolean z10;
        ?? r3;
        ?? r4;
        int i21;
        as1 as1Var4;
        as1 as1Var5;
        as1 as1Var6;
        int i22;
        int i23;
        boolean z11;
        int i24;
        as1 as1Var7;
        int i25;
        float f2;
        ?? r27;
        e52 e52Var;
        boolean z12;
        gm0 gm0Var;
        int i26;
        int i27;
        boolean zU;
        int i28;
        boolean zV;
        gm0 gm0Var2;
        e52 e52Var2;
        boolean z13;
        ArrayList arrayList;
        int size;
        int i29;
        HashSet hashSet2;
        zx0 zx0Var2 = zx0Var;
        cr crVar5 = this.H;
        as1 as1VarK = zx0Var2.k(crVar5);
        cr crVar6 = this.J;
        as1 as1VarK2 = zx0Var2.k(crVar6);
        cr crVar7 = this.I;
        as1 as1VarK3 = zx0Var2.k(crVar7);
        cr crVar8 = this.K;
        as1 as1VarK4 = zx0Var2.k(crVar8);
        cr crVar9 = this.L;
        as1 as1VarK5 = zx0Var2.k(crVar9);
        qr qrVar3 = this.S;
        if (qrVar3 != null) {
            int[] iArr2 = qrVar3.o0;
            i = 0;
            i3 = iArr2[0] == 2 ? 1 : 0;
            int i30 = iArr2[1] == 2 ? 1 : 0;
            int i31 = this.p;
            if (i31 != 1) {
                if (i31 == 2) {
                    i3 = 0;
                } else if (i31 != 3) {
                }
                i2 = i30;
            } else {
                i2 = 0;
            }
            i4 = this.f0;
            zArr = this.R;
            i5 = i2;
            if (i4 == 8) {
                arrayList = this.Q;
                size = arrayList.size();
                i6 = i3;
                i29 = i;
                while (true) {
                    if (i29 < size) {
                        if (!zArr[i] || zArr[1]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i32 = size;
                    hashSet2 = ((cr) arrayList.get(i29)).a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i32;
                }
            } else {
                i6 = i3;
            }
            z2 = this.j;
            if (z2 || this.k) {
                if (z2) {
                    zx0Var2.d(as1VarK, this.X);
                    zx0Var2.d(as1VarK2, this.X + this.T);
                    if (i6 != 0 && (qrVar2 = this.S) != null) {
                        rrVar2 = (rr) qrVar2;
                        weakReference3 = rrVar2.G0;
                        if (weakReference3 != null || weakReference3.get() == null || crVar5.d() > ((cr) rrVar2.G0.get()).d()) {
                            rrVar2.G0 = new WeakReference(crVar5);
                        }
                        weakReference4 = rrVar2.I0;
                        if (weakReference4 != null || weakReference4.get() == null || crVar6.d() > ((cr) rrVar2.I0.get()).d()) {
                            rrVar2.I0 = new WeakReference(crVar6);
                        }
                    }
                }
                if (this.k) {
                    zx0Var2.d(as1VarK3, this.Y);
                    zx0Var2.d(as1VarK4, this.Y + this.U);
                    hashSet = crVar9.a;
                    if (hashSet != null && hashSet.size() > 0) {
                        zx0Var2.d(as1VarK5, this.Y + this.Z);
                    }
                    if (i5 != 0 && (qrVar = this.S) != null) {
                        rrVar = (rr) qrVar;
                        weakReference = rrVar.F0;
                        if (weakReference != null || weakReference.get() == null || crVar7.d() > ((cr) rrVar.F0.get()).d()) {
                            rrVar.F0 = new WeakReference(crVar7);
                        }
                        weakReference2 = rrVar.H0;
                        if (weakReference2 != null || weakReference2.get() == null || crVar8.d() > ((cr) rrVar.H0.get()).d()) {
                            rrVar.H0 = new WeakReference(crVar8);
                        }
                    }
                }
                if (this.j && this.k) {
                    ?? r12 = i;
                    this.j = r12;
                    this.k = r12;
                    return;
                }
            }
            zArr2 = this.f;
            if (z || (gm0Var2 = this.d) == null || (e52Var2 = this.e) == null) {
                crVar = crVar9;
                zArr3 = zArr2;
            } else {
                crVar = crVar9;
                z00 z00Var = gm0Var2.h;
                zArr3 = zArr2;
                if (z00Var.j && gm0Var2.i.j && e52Var2.h.j && e52Var2.i.j) {
                    zx0Var2.d(as1VarK, z00Var.g);
                    zx0Var2.d(as1VarK2, this.d.i.g);
                    zx0Var2.d(as1VarK3, this.e.h.g);
                    zx0Var2.d(as1VarK4, this.e.i.g);
                    zx0Var2.d(as1VarK5, this.e.k.g);
                    if (this.S == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr3[0] && !u()) {
                            zx0Var2.f(zx0Var2.k(this.S.J), as1VarK2, 0, 8);
                        }
                        if (i5 == 0 || !zArr3[1] || v()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            zx0Var2.f(zx0Var2.k(this.S.K), as1VarK4, 0, 8);
                        }
                    }
                    this.j = z13;
                    this.k = z13;
                    return;
                }
            }
            if (this.S != null) {
                if (t(0)) {
                    ((rr) this.S).M(this, 0);
                    zU = true;
                    i28 = 1;
                } else {
                    zU = u();
                    i28 = 1;
                }
                if (t(i28)) {
                    ((rr) this.S).M(this, i28);
                    zV = true;
                } else {
                    zV = v();
                }
                if (zU && i6 != 0 && this.f0 != 8 && crVar5.f == null && crVar6.f == null) {
                    zx0Var2.f(zx0Var2.k(this.S.J), as1VarK2, 0, 1);
                }
                if (!zV && i5 != 0 && this.f0 != 8 && crVar7.f == null && crVar8.f == null && crVar == null) {
                    zx0Var2.f(zx0Var2.k(this.S.K), as1VarK4, 0, 1);
                }
                z4 = zV;
                z3 = zU;
            } else {
                crVar5 = crVar5;
                z3 = false;
                z4 = false;
            }
            i7 = this.T;
            i8 = this.a0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.U;
            i10 = this.b0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            iArr = this.o0;
            i12 = iArr[0];
            if (i12 != 3) {
                z5 = true;
            } else {
                z5 = false;
            }
            i13 = iArr[1];
            if (i13 != 3) {
                z6 = true;
            } else {
                z6 = false;
            }
            int i33 = this.W;
            this.z = i33;
            f = this.V;
            this.A = f;
            i14 = this.q;
            i15 = this.r;
            if (f > 0.0f) {
                crVar2 = crVar8;
                if (this.f0 != 8) {
                    if (i12 == 3 || i14 != 0) {
                        i17 = i14;
                    } else {
                        i17 = 3;
                    }
                    if (i13 == 3 || i15 != 0) {
                        i27 = i15;
                    } else {
                        i27 = 3;
                    }
                    if (i12 == 3 || i13 != 3 || i17 != 3 || i27 != 3) {
                        if (i12 != 3 && i17 == 3) {
                            this.z = 0;
                            i8 = (int) (f * i9);
                            if (i13 != 3) {
                                crVar = crVar;
                                i16 = i11;
                                i17 = 4;
                                z7 = false;
                            }
                            i18 = i27;
                            int[] iArr3 = this.s;
                            iArr3[0] = i17;
                            iArr3[1] = i18;
                            if (z7) {
                                int i34 = this.z;
                                i19 = -1;
                                if (i34 != 0) {
                                }
                                if (z7) {
                                    z8 = false;
                                } else {
                                    z8 = false;
                                }
                                if (iArr[0] == 2) {
                                    z9 = false;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    i8 = 0;
                                }
                                crVar3 = this.O;
                                boolean z14 = !crVar3.h();
                                char c = '\b';
                                boolean z15 = zArr[0];
                                boolean z16 = zArr[1];
                                i20 = this.n;
                                int[] iArr4 = this.B;
                                if (i20 != 2) {
                                    crVar4 = crVar;
                                    as1Var = as1VarK;
                                    as1Var2 = as1VarK2;
                                    as1Var3 = as1VarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                } else {
                                    crVar4 = crVar;
                                    as1Var = as1VarK;
                                    as1Var2 = as1VarK2;
                                    as1Var3 = as1VarK5;
                                    z10 = z3;
                                    r3 = i6;
                                    r4 = i5;
                                    i21 = i17;
                                }
                                if (z) {
                                    as1Var4 = 
                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x058a: MOVE (r5v1 'as1Var4' as1) = (r33v0 as1) (LINE:1419) in method: qr.b(zx0, boolean):void, file: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex
                                        	at jadx.core.codegen.InsnGen.makeInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:126)
                                        	at jadx.core.codegen.InsnGen.makeInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:130)
                                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:38)
                                        	at jadx.core.dex.nodes.IBlock.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeRegionIndent(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.RegionGen.makeIf(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:92)
                                        	at jadx.core.dex.regions.conditions.IfRegion.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.dex.regions.Region.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:19)
                                        	at jadx.core.codegen.RegionGen.makeRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
                                        	at jadx.core.codegen.MethodGen.addRegionInsns(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
                                        	at jadx.core.codegen.MethodGen.addInstructions(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:88)
                                        	at jadx.core.codegen.ClassGen.addMethodCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:81)
                                        	at jadx.core.codegen.ClassGen.addMethod(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:23)
                                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
                                        	at jadx.core.codegen.ClassGen.b(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
                                        	at qx.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:18)
                                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                        	at java.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0.accept(D8$$SyntheticClass:0)
                                        	at java.util.ArrayList.forEach(ArrayList.java:1621)
                                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:263)
                                        	at java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:301)
                                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:575)
                                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:564)
                                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:135)
                                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:267)
                                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:657)
                                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:66)
                                        	at jadx.core.codegen.ClassGen.addClassBody(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:61)
                                        	at jadx.core.codegen.ClassGen.addClassBody(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:78)
                                        	at jadx.core.codegen.ClassGen.addClassCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:15)
                                        	at jadx.core.codegen.ClassGen.makeClass(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:26)
                                        	at py.call(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:155)
                                        	at jadx.core.codegen.CodeGen.wrapCodeGen(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
                                        	at jadx.core.codegen.CodeGen.generateJavaCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
                                        	at jadx.core.codegen.CodeGen.generate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:50)
                                        	at jadx.core.ProcessClass.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:164)
                                        	at jadx.core.ProcessClass.generateCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:93)
                                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:7)
                                        	at jadx.core.dex.nodes.ClassNode.decompile(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:38)
                                        	at jadx.core.dex.nodes.ClassNode.getCode(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:2)
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r33v0 as1
                                        	at p61.o(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
                                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:16)
                                        */
                                    /*
                                        Method dump skipped, instruction units count: 1910
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.qr.b(zx0, boolean):void");
                                }

                                public boolean c() {
                                    return this.f0 != 8;
                                }

                                /* JADX WARN: Code duplicated, block: B:220:0x03c5  */
                                /* JADX WARN: Code duplicated, block: B:222:0x03c9  */
                                /* JADX WARN: Code duplicated, block: B:229:0x03dd  */
                                /* JADX WARN: Code duplicated, block: B:231:0x0402  */
                                /* JADX WARN: Code duplicated, block: B:240:0x041f  */
                                /* JADX WARN: Code duplicated, block: B:257:0x0452  */
                                /* JADX WARN: Code duplicated, block: B:259:0x0458  */
                                /* JADX WARN: Code duplicated, block: B:270:0x046d  */
                                /* JADX WARN: Code duplicated, block: B:275:0x0477  */
                                /* JADX WARN: Code duplicated, block: B:277:0x047b  */
                                /* JADX WARN: Code duplicated, block: B:278:0x047d  */
                                /* JADX WARN: Code duplicated, block: B:281:0x0485  */
                                /* JADX WARN: Code duplicated, block: B:287:0x0493 A[PHI: r0
                                  0x0493: PHI (r0v15 int) = (r0v14 int), (r0v19 int), (r0v19 int), (r0v19 int) binds: [B:280:0x0483, B:282:0x0489, B:283:0x048b, B:285:0x048f] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Code duplicated, block: B:290:0x04a5 A[DONT_INVERT] */
                                /* JADX WARN: Code duplicated, block: B:291:0x04a7  */
                                /* JADX WARN: Code duplicated, block: B:292:0x04ac  */
                                /* JADX WARN: Code duplicated, block: B:294:0x04af  */
                                /* JADX WARN: Code duplicated, block: B:303:0x04c6  */
                                /* JADX WARN: Code duplicated, block: B:337:0x0521  */
                                public final void d(zx0 zx0Var, boolean z, boolean z2, boolean z3, boolean z4, as1 as1Var, as1 as1Var2, int i, boolean z5, cr crVar, cr crVar2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
                                    boolean z12;
                                    boolean z13;
                                    int iMin;
                                    boolean z14;
                                    int i10;
                                    int i11;
                                    boolean z15;
                                    as1 as1VarK;
                                    as1 as1VarK2;
                                    cr crVar3;
                                    as1 as1Var3;
                                    int i12;
                                    int i13;
                                    boolean z16;
                                    boolean z17;
                                    boolean z18;
                                    boolean z19;
                                    qr qrVar;
                                    boolean z20;
                                    int iMin2;
                                    boolean z21;
                                    int i14;
                                    int iE;
                                    int i15;
                                    int i16;
                                    HashSet hashSet;
                                    boolean z22;
                                    int i17;
                                    int i18;
                                    int i19;
                                    int i20;
                                    int i21;
                                    boolean z23;
                                    boolean z24;
                                    int i22;
                                    zx0Var = zx0Var;
                                    int i23 = i8;
                                    int i24 = i9;
                                    as1 as1VarK3 = zx0Var.k(crVar);
                                    as1 as1VarK4 = zx0Var.k(crVar2);
                                    as1 as1VarK5 = zx0Var.k(crVar.f);
                                    as1 as1VarK6 = zx0Var.k(crVar2.f);
                                    boolean zH = crVar.h();
                                    boolean zH2 = crVar2.h();
                                    boolean zH3 = this.O.h();
                                    int i25 = zH2 ? (zH ? 1 : 0) + 1 : zH ? 1 : 0;
                                    if (zH3) {
                                        i25++;
                                    }
                                    int i26 = i25;
                                    int i27 = z6 ? 3 : i6;
                                    int iV = ts.v(i);
                                    boolean z25 = (iV == 0 || iV == 1 || iV != 2 || i27 == 4) ? false : true;
                                    int i28 = this.h;
                                    if (i28 == -1 || !z) {
                                        i28 = i3;
                                        z12 = z25;
                                    } else {
                                        this.h = -1;
                                        z12 = false;
                                    }
                                    int i29 = this.i;
                                    if (i29 == -1 || z) {
                                        z13 = z12;
                                    } else {
                                        this.i = -1;
                                        i28 = i29;
                                        z13 = false;
                                    }
                                    boolean z26 = z13;
                                    if (this.f0 == 8) {
                                        z14 = false;
                                        iMin = 0;
                                    } else {
                                        iMin = i28;
                                        z14 = z26;
                                    }
                                    if (z11) {
                                        if (!zH && !zH2 && !zH3) {
                                            zx0Var.d(as1VarK3, i2);
                                        } else if (zH && !zH2) {
                                            i10 = 8;
                                            zx0Var.e(as1VarK3, as1VarK5, crVar.e(), 8);
                                        }
                                        i10 = 8;
                                    } else {
                                        i10 = 8;
                                    }
                                    if (z14 != 0) {
                                        if (i26 == 2 || z6 || !(i27 == 1 || i27 == 0)) {
                                            if (i23 == -2) {
                                                i23 = iMin;
                                            }
                                            if (i24 == -2) {
                                                i24 = iMin;
                                            }
                                            if (iMin > 0 && i27 != 1) {
                                                iMin = 0;
                                            }
                                            if (i23 > 0) {
                                                zx0Var.f(as1VarK4, as1VarK3, i23, 8);
                                                iMin = Math.max(iMin, i23);
                                            }
                                            if (i24 > 0) {
                                                if (!z2 || i27 != 1) {
                                                    zx0Var.g(as1VarK4, as1VarK3, i24, 8);
                                                }
                                                iMin = Math.min(iMin, i24);
                                            }
                                            if (i27 == 1) {
                                                if (z2) {
                                                    zx0Var.e(as1VarK4, as1VarK3, iMin, 8);
                                                } else if (z8) {
                                                    zx0Var.e(as1VarK4, as1VarK3, iMin, 5);
                                                    zx0Var.g(as1VarK4, as1VarK3, iMin, 8);
                                                } else {
                                                    zx0Var.e(as1VarK4, as1VarK3, iMin, 5);
                                                    zx0Var.g(as1VarK4, as1VarK3, iMin, 8);
                                                }
                                            } else if (i27 == 2) {
                                                int i30 = crVar.e;
                                                if (i30 == 3 || i30 == 5) {
                                                    as1VarK = zx0Var.k(this.S.i(3));
                                                    as1VarK2 = zx0Var.k(this.S.i(5));
                                                } else {
                                                    as1VarK = zx0Var.k(this.S.i(2));
                                                    as1VarK2 = zx0Var.k(this.S.i(4));
                                                }
                                                nb nbVarL = zx0Var.l();
                                                int i31 = i23;
                                                nbVarL.d.g(as1VarK4, -1.0f);
                                                nbVarL.d.g(as1VarK3, 1.0f);
                                                nbVarL.d.g(as1VarK2, f2);
                                                nbVarL.d.g(as1VarK, -f2);
                                                zx0Var.c(nbVarL);
                                                if (z2) {
                                                    z14 = false;
                                                }
                                                z15 = z4;
                                                i11 = i31;
                                            } else {
                                                i11 = i23;
                                                z15 = true;
                                            }
                                        } else {
                                            int iMax = Math.max(i23, iMin);
                                            if (i24 > 0) {
                                                iMax = Math.min(i24, iMax);
                                            }
                                            zx0Var.e(as1VarK4, as1VarK3, iMax, 8);
                                            z15 = z4;
                                            i11 = i23;
                                            z14 = false;
                                        }
                                        if (z11 || z8) {
                                            boolean z27 = z15;
                                            if (i26 >= 2 && z2 && z27) {
                                                zx0Var.f(as1VarK3, as1Var, 0, 8);
                                                cr crVar4 = this.L;
                                                boolean z28 = z || crVar4.f == null;
                                                if (!z && (crVar3 = crVar4.f) != null) {
                                                    qr qrVar2 = crVar3.d;
                                                    if (qrVar2.V != 0.0f) {
                                                        int[] iArr = qrVar2.o0;
                                                        if (iArr[0] == 3 && iArr[1] == 3) {
                                                            z28 = true;
                                                        } else {
                                                            z28 = false;
                                                        }
                                                    } else {
                                                        z28 = false;
                                                    }
                                                }
                                                if (z28) {
                                                    zx0Var.f(as1Var2, as1VarK4, 0, 8);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        if (zH || zH2 || zH3) {
                                            if (zH && !zH2) {
                                                crVar2 = crVar2;
                                                as1VarK4 = as1VarK4;
                                                z15 = z15;
                                                as1Var3 = as1VarK6;
                                                z20 = z2;
                                                i22 = (z2 && (crVar.f.d instanceof ye)) ? 8 : 5;
                                            } else if (zH || !zH2) {
                                                as1Var3 = as1VarK6;
                                                if (zH && zH2) {
                                                    qr qrVar3 = crVar.f.d;
                                                    qr qrVar4 = crVar2.f.d;
                                                    z15 = z15;
                                                    qr qrVar5 = this.S;
                                                    int i32 = 6;
                                                    if (z14) {
                                                        if (i27 == 0) {
                                                            if (i24 != 0 || i11 != 0) {
                                                                i20 = 5;
                                                                i21 = 5;
                                                                z23 = true;
                                                                z24 = false;
                                                                z17 = true;
                                                            } else if (as1VarK5.f && as1Var3.f) {
                                                                zx0Var.e(as1VarK3, as1VarK5, crVar.e(), 8);
                                                                zx0Var.e(as1VarK4, as1Var3, -crVar2.e(), 8);
                                                                return;
                                                            } else {
                                                                i20 = 8;
                                                                i21 = 8;
                                                                z23 = false;
                                                                z24 = true;
                                                                z17 = false;
                                                            }
                                                            if ((qrVar3 instanceof ye) || (qrVar4 instanceof ye)) {
                                                                zx0Var = zx0Var;
                                                                i27 = i27;
                                                                as1VarK3 = as1VarK3;
                                                                as1VarK4 = as1VarK4;
                                                                z18 = z24;
                                                                as1Var2 = as1Var2;
                                                                i12 = i20;
                                                                as1VarK5 = as1VarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = 4;
                                                            } else {
                                                                zx0Var = zx0Var;
                                                                as1VarK3 = as1VarK3;
                                                                as1VarK4 = as1VarK4;
                                                                z18 = z24;
                                                                i12 = i20;
                                                                as1VarK5 = as1VarK5;
                                                                i32 = 6;
                                                                z16 = z23;
                                                                i13 = i21;
                                                                i27 = i27;
                                                                as1Var2 = as1Var2;
                                                            }
                                                        } else {
                                                            if (i27 == 2) {
                                                                if ((qrVar3 instanceof ye) || (qrVar4 instanceof ye)) {
                                                                    i12 = 5;
                                                                } else {
                                                                    zx0Var = zx0Var;
                                                                    i27 = i27;
                                                                    as1VarK3 = as1VarK3;
                                                                    as1VarK4 = as1VarK4;
                                                                    as1VarK5 = as1VarK5;
                                                                    i32 = 6;
                                                                    i12 = 5;
                                                                    i13 = 5;
                                                                }
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = false;
                                                                as1Var2 = as1Var2;
                                                            } else if (i27 == 1) {
                                                                i12 = 8;
                                                            } else if (i27 == 3) {
                                                                i27 = i27;
                                                                if (this.z != -1) {
                                                                    if (z6) {
                                                                        if (i7 == 2 || i7 == 1) {
                                                                            i18 = 5;
                                                                            i19 = 4;
                                                                        } else {
                                                                            i18 = 8;
                                                                            i19 = 5;
                                                                        }
                                                                        i13 = i19;
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    } else {
                                                                        if (i24 > 0) {
                                                                            zx0Var = zx0Var;
                                                                            as1Var2 = as1Var2;
                                                                            as1VarK3 = as1VarK3;
                                                                            as1VarK4 = as1VarK4;
                                                                            as1VarK5 = as1VarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                        } else if (i24 != 0 || i11 != 0) {
                                                                            zx0Var = zx0Var;
                                                                            as1Var2 = as1Var2;
                                                                            as1VarK3 = as1VarK3;
                                                                            as1VarK4 = as1VarK4;
                                                                            as1VarK5 = as1VarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 4;
                                                                        } else if (z9) {
                                                                            i18 = (qrVar3 == qrVar5 || qrVar4 == qrVar5) ? 5 : 4;
                                                                            i13 = 4;
                                                                            z16 = true;
                                                                            z17 = true;
                                                                            z18 = true;
                                                                        } else {
                                                                            zx0Var = zx0Var;
                                                                            as1Var2 = as1Var2;
                                                                            as1VarK3 = as1VarK3;
                                                                            as1VarK4 = as1VarK4;
                                                                            as1VarK5 = as1VarK5;
                                                                            i32 = 6;
                                                                            i12 = 5;
                                                                            i13 = 8;
                                                                        }
                                                                        z16 = true;
                                                                        z17 = true;
                                                                        z18 = true;
                                                                    }
                                                                    i12 = i18;
                                                                    zx0Var = zx0Var;
                                                                } else if (z9) {
                                                                    zx0Var = zx0Var;
                                                                    as1Var2 = as1Var2;
                                                                    as1VarK3 = as1VarK3;
                                                                    as1VarK4 = as1VarK4;
                                                                    as1VarK5 = as1VarK5;
                                                                    i12 = 8;
                                                                    i32 = z2 ? 5 : 4;
                                                                } else {
                                                                    zx0Var = zx0Var;
                                                                    as1Var2 = as1Var2;
                                                                    as1VarK3 = as1VarK3;
                                                                    as1VarK4 = as1VarK4;
                                                                    as1VarK5 = as1VarK5;
                                                                    i12 = 8;
                                                                    i32 = 8;
                                                                }
                                                                i13 = 5;
                                                                z16 = true;
                                                                z17 = true;
                                                                z18 = true;
                                                            } else {
                                                                i12 = 5;
                                                                i13 = 4;
                                                                z16 = false;
                                                                z17 = false;
                                                            }
                                                            i13 = 4;
                                                            z16 = true;
                                                            z17 = true;
                                                            z18 = false;
                                                            as1Var2 = as1Var2;
                                                        }
                                                        if (z17 || as1VarK5 != as1Var3 || qrVar3 == qrVar5) {
                                                            z19 = true;
                                                        } else {
                                                            z17 = false;
                                                            z19 = false;
                                                        }
                                                        if (z16) {
                                                            if (z14 && !z7 && !z9 && as1VarK5 == as1Var && as1Var3 == as1Var2) {
                                                                i32 = 8;
                                                                z20 = false;
                                                                i17 = 8;
                                                                z22 = false;
                                                            } else {
                                                                z20 = z2;
                                                                z22 = z19;
                                                                i17 = i12;
                                                            }
                                                            as1 as1Var4 = as1VarK5;
                                                            qrVar = qrVar4;
                                                            zx0Var.b(as1VarK3, as1Var4, crVar.e(), f, as1Var3, as1VarK4, crVar2.e(), i32);
                                                            as1VarK5 = as1Var4;
                                                            i12 = i17;
                                                            z19 = z22;
                                                        } else {
                                                            qrVar = qrVar4;
                                                            z20 = z2;
                                                        }
                                                        if (this.f0 != 8 && ((hashSet = crVar2.a) == null || hashSet.size() <= 0)) {
                                                            return;
                                                        }
                                                        if (z17) {
                                                            if (z20 && as1VarK5 != as1Var3 && !z14 && ((qrVar3 instanceof ye) || (qrVar instanceof ye))) {
                                                                i12 = 6;
                                                            }
                                                            zx0Var.f(as1VarK3, as1VarK5, crVar.e(), i12);
                                                            zx0Var.g(as1VarK4, as1Var3, -crVar2.e(), i12);
                                                        }
                                                        if (z20 || !z10 || (qrVar3 instanceof ye) || (qrVar instanceof ye) || qrVar == qrVar5) {
                                                            iMin2 = i13;
                                                            z21 = z19;
                                                        } else {
                                                            iMin2 = 6;
                                                            i12 = 6;
                                                            z21 = true;
                                                        }
                                                        if (z21) {
                                                            if (z18 && (!z9 || z3)) {
                                                                if (qrVar3 != qrVar5 && qrVar != qrVar5) {
                                                                    i32 = iMin2;
                                                                }
                                                                if ((qrVar3 instanceof cl0) || (qrVar instanceof cl0)) {
                                                                    i32 = 5;
                                                                }
                                                                if ((qrVar3 instanceof ye) || (qrVar instanceof ye)) {
                                                                    i32 = 5;
                                                                }
                                                                if (z9) {
                                                                    i16 = 5;
                                                                } else {
                                                                    i16 = i32;
                                                                }
                                                                iMin2 = Math.max(i16, iMin2);
                                                            }
                                                            if (z20) {
                                                                iMin2 = Math.min(i12, iMin2);
                                                                if (z6 || z9 || !(qrVar3 == qrVar5 || qrVar == qrVar5)) {
                                                                    i15 = iMin2;
                                                                } else {
                                                                    i15 = 4;
                                                                }
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                            zx0Var.e(as1VarK3, as1VarK5, crVar.e(), i15);
                                                            zx0Var.e(as1VarK4, as1Var3, -crVar2.e(), i15);
                                                        }
                                                        if (z20) {
                                                            if (as1Var == as1VarK5) {
                                                                iE = crVar.e();
                                                            } else {
                                                                iE = 0;
                                                            }
                                                            if (as1VarK5 != as1Var) {
                                                                zx0Var.f(as1VarK3, as1Var, iE, 5);
                                                            }
                                                        }
                                                        if (z20 || !z14 || i4 != 0 || i11 != 0) {
                                                            i14 = 5;
                                                        } else if (z14 && i27 == 3) {
                                                            zx0Var.f(as1VarK4, as1VarK3, 0, 8);
                                                            i14 = 5;
                                                        } else {
                                                            i14 = 5;
                                                            zx0Var.f(as1VarK4, as1VarK3, 0, 5);
                                                        }
                                                    } else {
                                                        if (as1VarK5.f && as1Var3.f) {
                                                            zx0Var.b(as1VarK3, as1VarK5, crVar.e(), f, as1Var3, as1VarK4, crVar2.e(), 8);
                                                            if (z2 && z15) {
                                                                int iE2 = crVar2.f != null ? crVar2.e() : 0;
                                                                if (as1Var3 != as1Var2) {
                                                                    zx0Var.f(as1Var2, as1VarK4, iE2, 5);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        i12 = 5;
                                                        i13 = 4;
                                                        z16 = true;
                                                        z17 = true;
                                                    }
                                                    z18 = false;
                                                    if (z17) {
                                                        z19 = true;
                                                    } else {
                                                        z19 = true;
                                                    }
                                                    if (z16) {
                                                        if (z14) {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        } else {
                                                            z20 = z2;
                                                            z22 = z19;
                                                            i17 = i12;
                                                        }
                                                        as1 as1Var5 = as1VarK5;
                                                        qrVar = qrVar4;
                                                        zx0Var.b(as1VarK3, as1Var5, crVar.e(), f, as1Var3, as1VarK4, crVar2.e(), i32);
                                                        as1VarK5 = as1Var5;
                                                        i12 = i17;
                                                        z19 = z22;
                                                    } else {
                                                        qrVar = qrVar4;
                                                        z20 = z2;
                                                    }
                                                    if (this.f0 != 8) {
                                                    }
                                                    if (z17) {
                                                        if (z20) {
                                                            i12 = 6;
                                                        }
                                                        zx0Var.f(as1VarK3, as1VarK5, crVar.e(), i12);
                                                        zx0Var.g(as1VarK4, as1Var3, -crVar2.e(), i12);
                                                    }
                                                    if (z20) {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    } else {
                                                        iMin2 = i13;
                                                        z21 = z19;
                                                    }
                                                    if (z21) {
                                                        if (z18) {
                                                            if (qrVar3 != qrVar5) {
                                                                i32 = iMin2;
                                                            }
                                                            if (qrVar3 instanceof cl0) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (qrVar3 instanceof ye) {
                                                                i32 = 5;
                                                            } else {
                                                                i32 = 5;
                                                            }
                                                            if (z9) {
                                                                i16 = 5;
                                                            } else {
                                                                i16 = i32;
                                                            }
                                                            iMin2 = Math.max(i16, iMin2);
                                                        }
                                                        if (z20) {
                                                            iMin2 = Math.min(i12, iMin2);
                                                            if (z6) {
                                                                i15 = iMin2;
                                                            } else {
                                                                i15 = iMin2;
                                                            }
                                                        } else {
                                                            i15 = iMin2;
                                                        }
                                                        zx0Var.e(as1VarK3, as1VarK5, crVar.e(), i15);
                                                        zx0Var.e(as1VarK4, as1Var3, -crVar2.e(), i15);
                                                    }
                                                    if (z20) {
                                                        if (as1Var == as1VarK5) {
                                                            iE = crVar.e();
                                                        } else {
                                                            iE = 0;
                                                        }
                                                        if (as1VarK5 != as1Var) {
                                                            zx0Var.f(as1VarK3, as1Var, iE, 5);
                                                        }
                                                    }
                                                    if (z20) {
                                                        i14 = 5;
                                                    } else {
                                                        i14 = 5;
                                                    }
                                                }
                                                i22 = i14;
                                            } else {
                                                as1Var3 = as1VarK6;
                                                zx0Var.e(as1VarK4, as1Var3, -crVar2.e(), 8);
                                                if (z2) {
                                                    zx0Var.f(as1VarK3, as1Var, 0, 5);
                                                    crVar2 = crVar2;
                                                    i14 = 5;
                                                    as1VarK4 = as1VarK4;
                                                    z15 = z15;
                                                }
                                                z20 = z2;
                                                i22 = i14;
                                            }
                                            if (z20 || !z15) {
                                                return;
                                            }
                                            int iE3 = crVar2.f != null ? crVar2.e() : 0;
                                            if (as1Var3 != as1Var2) {
                                                zx0Var.f(as1Var2, as1VarK4, iE3, i22);
                                                return;
                                            }
                                            return;
                                        }
                                        as1Var3 = as1VarK6;
                                        i14 = 5;
                                        z20 = z2;
                                        i22 = i14;
                                        if (z20) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (z5) {
                                        zx0Var.e(as1VarK4, as1VarK3, 0, 3);
                                        if (i4 > 0) {
                                            zx0Var.f(as1VarK4, as1VarK3, i4, i10);
                                        }
                                        if (i5 < Integer.MAX_VALUE) {
                                            zx0Var.g(as1VarK4, as1VarK3, i5, i10);
                                        }
                                    } else {
                                        zx0Var.e(as1VarK4, as1VarK3, iMin, i10);
                                    }
                                    z15 = z4;
                                    i11 = i23;
                                    if (z11) {
                                    }
                                    boolean z29 = z15;
                                    if (i26 >= 2) {
                                    }
                                }

                                public final void e(int i, qr qrVar, int i2, int i3) {
                                    boolean z;
                                    if (i == 7) {
                                        if (i2 != 7) {
                                            if (i2 == 2 || i2 == 4) {
                                                e(2, qrVar, i2, 0);
                                                e(4, qrVar, i2, 0);
                                                i(7).a(qrVar.i(i2), 0);
                                                return;
                                            } else {
                                                if (i2 == 3 || i2 == 5) {
                                                    e(3, qrVar, i2, 0);
                                                    e(5, qrVar, i2, 0);
                                                    i(7).a(qrVar.i(i2), 0);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        cr crVarI = i(2);
                                        cr crVarI2 = i(4);
                                        cr crVarI3 = i(3);
                                        cr crVarI4 = i(5);
                                        boolean z2 = true;
                                        if ((crVarI == null || !crVarI.h()) && (crVarI2 == null || !crVarI2.h())) {
                                            e(2, qrVar, 2, 0);
                                            e(4, qrVar, 4, 0);
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if ((crVarI3 == null || !crVarI3.h()) && (crVarI4 == null || !crVarI4.h())) {
                                            e(3, qrVar, 3, 0);
                                            e(5, qrVar, 5, 0);
                                        } else {
                                            z2 = false;
                                        }
                                        if (z && z2) {
                                            i(7).a(qrVar.i(7), 0);
                                            return;
                                        } else if (z) {
                                            i(8).a(qrVar.i(8), 0);
                                            return;
                                        } else {
                                            if (z2) {
                                                i(9).a(qrVar.i(9), 0);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                    if (i == 8 && (i2 == 2 || i2 == 4)) {
                                        cr crVarI5 = i(2);
                                        cr crVarI6 = qrVar.i(i2);
                                        cr crVarI7 = i(4);
                                        crVarI5.a(crVarI6, 0);
                                        crVarI7.a(crVarI6, 0);
                                        i(8).a(crVarI6, 0);
                                        return;
                                    }
                                    if (i == 9 && (i2 == 3 || i2 == 5)) {
                                        cr crVarI8 = qrVar.i(i2);
                                        i(3).a(crVarI8, 0);
                                        i(5).a(crVarI8, 0);
                                        i(9).a(crVarI8, 0);
                                        return;
                                    }
                                    if (i == 8 && i2 == 8) {
                                        i(2).a(qrVar.i(2), 0);
                                        i(4).a(qrVar.i(4), 0);
                                        i(8).a(qrVar.i(i2), 0);
                                        return;
                                    }
                                    if (i == 9 && i2 == 9) {
                                        i(3).a(qrVar.i(3), 0);
                                        i(5).a(qrVar.i(5), 0);
                                        i(9).a(qrVar.i(i2), 0);
                                        return;
                                    }
                                    cr crVarI9 = i(i);
                                    cr crVarI10 = qrVar.i(i2);
                                    if (crVarI9.i(crVarI10)) {
                                        if (i == 6) {
                                            cr crVarI11 = i(3);
                                            cr crVarI12 = i(5);
                                            if (crVarI11 != null) {
                                                crVarI11.j();
                                            }
                                            if (crVarI12 != null) {
                                                crVarI12.j();
                                            }
                                        } else if (i == 3 || i == 5) {
                                            cr crVarI13 = i(6);
                                            if (crVarI13 != null) {
                                                crVarI13.j();
                                            }
                                            cr crVarI14 = i(7);
                                            if (crVarI14.f != crVarI10) {
                                                crVarI14.j();
                                            }
                                            cr crVarF = i(i).f();
                                            cr crVarI15 = i(9);
                                            if (crVarI15.h()) {
                                                crVarF.j();
                                                crVarI15.j();
                                            }
                                        } else if (i == 2 || i == 4) {
                                            cr crVarI16 = i(7);
                                            if (crVarI16.f != crVarI10) {
                                                crVarI16.j();
                                            }
                                            cr crVarF2 = i(i).f();
                                            cr crVarI17 = i(8);
                                            if (crVarI17.h()) {
                                                crVarF2.j();
                                                crVarI17.j();
                                            }
                                        }
                                        crVarI9.a(crVarI10, i3);
                                    }
                                }

                                public final void f(cr crVar, cr crVar2, int i) {
                                    if (crVar.d == this) {
                                        e(crVar.e, crVar2.d, crVar2.e, i);
                                    }
                                }

                                public final void g(zx0 zx0Var) {
                                    zx0Var.k(this.H);
                                    zx0Var.k(this.I);
                                    zx0Var.k(this.J);
                                    zx0Var.k(this.K);
                                    if (this.Z > 0) {
                                        zx0Var.k(this.L);
                                    }
                                }

                                public final void h() {
                                    if (this.d == null) {
                                        gm0 gm0Var = new gm0(this);
                                        gm0Var.h.e = 4;
                                        gm0Var.i.e = 5;
                                        gm0Var.f = 0;
                                        this.d = gm0Var;
                                    }
                                    if (this.e == null) {
                                        e52 e52Var = new e52(this);
                                        z00 z00Var = new z00(e52Var);
                                        e52Var.k = z00Var;
                                        e52Var.l = null;
                                        e52Var.h.e = 6;
                                        e52Var.i.e = 7;
                                        z00Var.e = 8;
                                        e52Var.f = 1;
                                        this.e = e52Var;
                                    }
                                }

                                public cr i(int i) {
                                    switch (ts.v(i)) {
                                        case 0:
                                            return null;
                                        case 1:
                                            return this.H;
                                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                            return this.I;
                                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                            return this.J;
                                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                                            return this.K;
                                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                                            return this.L;
                                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                            return this.O;
                                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                            return this.M;
                                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                            return this.N;
                                        default:
                                            e.b(ts.t(i));
                                            return null;
                                    }
                                }

                                public final int j(int i) {
                                    int[] iArr = this.o0;
                                    if (i == 0) {
                                        return iArr[0];
                                    }
                                    if (i == 1) {
                                        return iArr[1];
                                    }
                                    return 0;
                                }

                                public final int k() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.U;
                                }

                                public final qr l(int i) {
                                    cr crVar;
                                    cr crVar2;
                                    if (i != 0) {
                                        if (i == 1 && (crVar2 = (crVar = this.K).f) != null && crVar2.f == crVar) {
                                            return crVar2.d;
                                        }
                                        return null;
                                    }
                                    cr crVar3 = this.J;
                                    cr crVar4 = crVar3.f;
                                    if (crVar4 == null || crVar4.f != crVar3) {
                                        return null;
                                    }
                                    return crVar4.d;
                                }

                                public final qr m(int i) {
                                    cr crVar;
                                    cr crVar2;
                                    if (i != 0) {
                                        if (i == 1 && (crVar2 = (crVar = this.I).f) != null && crVar2.f == crVar) {
                                            return crVar2.d;
                                        }
                                        return null;
                                    }
                                    cr crVar3 = this.H;
                                    cr crVar4 = crVar3.f;
                                    if (crVar4 == null || crVar4.f != crVar3) {
                                        return null;
                                    }
                                    return crVar4.d;
                                }

                                public final int n() {
                                    if (this.f0 == 8) {
                                        return 0;
                                    }
                                    return this.T;
                                }

                                public final int o() {
                                    qr qrVar = this.S;
                                    return (qrVar == null || !(qrVar instanceof rr)) ? this.X : ((rr) qrVar).w0 + this.X;
                                }

                                public final int p() {
                                    qr qrVar = this.S;
                                    return (qrVar == null || !(qrVar instanceof rr)) ? this.Y : ((rr) qrVar).x0 + this.Y;
                                }

                                /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
                                /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
                                public final boolean q(int i) {
                                    if (i == 0) {
                                        if ((this.H.f != null ? 1 : 0) + (this.J.f != null ? 1 : 0) < 2) {
                                            return true;
                                        }
                                        return false;
                                    }
                                    if ((this.I.f != null ? 1 : 0) + (this.K.f != null ? 1 : 0) + (this.L.f != null ? 1 : 0) < 2) {
                                        return true;
                                    }
                                    return false;
                                }

                                public final boolean r(int i, int i2) {
                                    cr crVar;
                                    cr crVar2;
                                    cr crVar3;
                                    cr crVar4;
                                    if (i == 0) {
                                        cr crVar5 = this.H;
                                        cr crVar6 = crVar5.f;
                                        if (crVar6 == null || !crVar6.c || (crVar4 = (crVar3 = this.J).f) == null || !crVar4.c) {
                                            return false;
                                        }
                                        return (crVar4.d() - crVar3.e()) - (crVar5.e() + crVar5.f.d()) >= i2;
                                    }
                                    cr crVar7 = this.I;
                                    cr crVar8 = crVar7.f;
                                    if (crVar8 == null || !crVar8.c || (crVar2 = (crVar = this.K).f) == null || !crVar2.c) {
                                        return false;
                                    }
                                    return (crVar2.d() - crVar.e()) - (crVar7.e() + crVar7.f.d()) >= i2;
                                }

                                public final void s(int i, int i2, int i3, int i4, qr qrVar) {
                                    i(i).b(qrVar.i(i2), i3, i4, true);
                                }

                                public final boolean t(int i) {
                                    cr crVar;
                                    cr crVar2;
                                    int i2 = i * 2;
                                    cr[] crVarArr = this.P;
                                    cr crVar3 = crVarArr[i2];
                                    cr crVar4 = crVar3.f;
                                    return (crVar4 == null || crVar4.f == crVar3 || (crVar2 = (crVar = crVarArr[i2 + 1]).f) == null || crVar2.f != crVar) ? false : true;
                                }

                                public String toString() {
                                    String strL = BuildConfig.FLAVOR;
                                    StringBuilder sbM = ts.m(BuildConfig.FLAVOR);
                                    if (this.g0 != null) {
                                        strL = ts.l(new StringBuilder("id: "), this.g0, " ");
                                    }
                                    sbM.append(strL);
                                    sbM.append("(");
                                    sbM.append(this.X);
                                    sbM.append(", ");
                                    sbM.append(this.Y);
                                    sbM.append(") - (");
                                    sbM.append(this.T);
                                    sbM.append(" x ");
                                    return ts.h(this.U, ")", sbM);
                                }

                                public final boolean u() {
                                    cr crVar = this.H;
                                    cr crVar2 = crVar.f;
                                    if (crVar2 != null && crVar2.f == crVar) {
                                        return true;
                                    }
                                    cr crVar3 = this.J;
                                    cr crVar4 = crVar3.f;
                                    return crVar4 != null && crVar4.f == crVar3;
                                }

                                public final boolean v() {
                                    cr crVar = this.I;
                                    cr crVar2 = crVar.f;
                                    if (crVar2 != null && crVar2.f == crVar) {
                                        return true;
                                    }
                                    cr crVar3 = this.K;
                                    cr crVar4 = crVar3.f;
                                    return crVar4 != null && crVar4.f == crVar3;
                                }

                                public final boolean w() {
                                    return this.g && this.f0 != 8;
                                }

                                public boolean x() {
                                    if (this.j) {
                                        return true;
                                    }
                                    return this.H.c && this.J.c;
                                }

                                public boolean y() {
                                    if (this.k) {
                                        return true;
                                    }
                                    return this.I.c && this.K.c;
                                }

                                public void z() {
                                    this.H.j();
                                    this.I.j();
                                    this.J.j();
                                    this.K.j();
                                    this.L.j();
                                    this.M.j();
                                    this.N.j();
                                    this.O.j();
                                    this.S = null;
                                    this.C = 0.0f;
                                    this.T = 0;
                                    this.U = 0;
                                    this.V = 0.0f;
                                    this.W = -1;
                                    this.X = 0;
                                    this.Y = 0;
                                    this.Z = 0;
                                    this.a0 = 0;
                                    this.b0 = 0;
                                    this.c0 = 0.5f;
                                    this.d0 = 0.5f;
                                    int[] iArr = this.o0;
                                    iArr[0] = 1;
                                    iArr[1] = 1;
                                    this.e0 = null;
                                    this.f0 = 0;
                                    this.h0 = 0;
                                    this.i0 = 0;
                                    float[] fArr = this.j0;
                                    fArr[0] = -1.0f;
                                    fArr[1] = -1.0f;
                                    this.n = -1;
                                    this.o = -1;
                                    int[] iArr2 = this.B;
                                    iArr2[0] = Integer.MAX_VALUE;
                                    iArr2[1] = Integer.MAX_VALUE;
                                    this.q = 0;
                                    this.r = 0;
                                    this.v = 1.0f;
                                    this.y = 1.0f;
                                    this.u = Integer.MAX_VALUE;
                                    this.x = Integer.MAX_VALUE;
                                    this.t = 0;
                                    this.w = 0;
                                    this.z = -1;
                                    this.A = 1.0f;
                                    boolean[] zArr = this.f;
                                    zArr[0] = true;
                                    zArr[1] = true;
                                    this.E = false;
                                    boolean[] zArr2 = this.R;
                                    zArr2[0] = false;
                                    zArr2[1] = false;
                                    this.g = true;
                                    int[] iArr3 = this.s;
                                    iArr3[0] = 0;
                                    iArr3[1] = 0;
                                    this.h = -1;
                                    this.i = -1;
                                }
                            }
