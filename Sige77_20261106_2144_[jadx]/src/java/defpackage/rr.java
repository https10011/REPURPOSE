package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rr extends qr {
    public fl[] A0;
    public fl[] B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public WeakReference F0;
    public WeakReference G0;
    public WeakReference H0;
    public WeakReference I0;
    public final HashSet J0;
    public final ah K0;
    public ArrayList p0 = new ArrayList();
    public final ac2 q0 = new ac2(this);
    public final x00 r0;
    public int s0;
    public hr t0;
    public boolean u0;
    public final zx0 v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public rr() {
        x00 x00Var = new x00();
        x00Var.b = true;
        x00Var.c = true;
        x00Var.f = new ArrayList();
        new ArrayList();
        x00Var.h = null;
        x00Var.i = new ah();
        x00Var.g = new ArrayList();
        x00Var.d = this;
        x00Var.e = this;
        this.r0 = x00Var;
        this.t0 = null;
        this.u0 = false;
        this.v0 = new zx0();
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = new fl[4];
        this.B0 = new fl[4];
        this.C0 = 257;
        this.D0 = false;
        this.E0 = false;
        this.F0 = null;
        this.G0 = null;
        this.H0 = null;
        this.I0 = null;
        this.J0 = new HashSet();
        this.K0 = new ah();
    }

    public static void Q(qr qrVar, hr hrVar, ah ahVar) {
        int i;
        int i2;
        if (hrVar == null) {
            return;
        }
        int i3 = qrVar.f0;
        int[] iArr = qrVar.s;
        if (i3 == 8 || (qrVar instanceof cl0) || (qrVar instanceof ye)) {
            ahVar.e = 0;
            ahVar.f = 0;
            return;
        }
        int[] iArr2 = qrVar.o0;
        ahVar.a = iArr2[0];
        ahVar.b = iArr2[1];
        ahVar.c = qrVar.n();
        ahVar.d = qrVar.k();
        ahVar.i = false;
        ahVar.j = 0;
        boolean z = ahVar.a == 3;
        boolean z2 = ahVar.b == 3;
        boolean z3 = z && qrVar.V > 0.0f;
        boolean z4 = z2 && qrVar.V > 0.0f;
        if (z && qrVar.q(0) && qrVar.q == 0 && !z3) {
            ahVar.a = 2;
            if (z2 && qrVar.r == 0) {
                ahVar.a = 1;
            }
            z = false;
        }
        if (z2 && qrVar.q(1) && qrVar.r == 0 && !z4) {
            ahVar.b = 2;
            if (z && qrVar.q == 0) {
                ahVar.b = 1;
            }
            z2 = false;
        }
        if (qrVar.x()) {
            ahVar.a = 1;
            z = false;
        }
        if (qrVar.y()) {
            ahVar.b = 1;
            z2 = false;
        }
        if (z3) {
            if (iArr[0] == 4) {
                ahVar.a = 1;
            } else if (!z2) {
                if (ahVar.b == 1) {
                    i2 = ahVar.d;
                } else {
                    ahVar.a = 2;
                    hrVar.b(qrVar, ahVar);
                    i2 = ahVar.f;
                }
                ahVar.a = 1;
                ahVar.c = (int) (qrVar.V * i2);
            }
        }
        if (z4) {
            if (iArr[1] == 4) {
                ahVar.b = 1;
            } else if (!z) {
                if (ahVar.a == 1) {
                    i = ahVar.c;
                } else {
                    ahVar.b = 2;
                    hrVar.b(qrVar, ahVar);
                    i = ahVar.e;
                }
                ahVar.b = 1;
                int i4 = qrVar.W;
                float f = qrVar.V;
                if (i4 == -1) {
                    ahVar.d = (int) (i / f);
                } else {
                    ahVar.d = (int) (f * i);
                }
            }
        }
        hrVar.b(qrVar, ahVar);
        qrVar.J(ahVar.e);
        qrVar.G(ahVar.f);
        qrVar.D = ahVar.h;
        qrVar.D(ahVar.g);
        ahVar.j = 0;
    }

    @Override // defpackage.qr
    public final void C(ac2 ac2Var) {
        super.C(ac2Var);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((qr) this.p0.get(i)).C(ac2Var);
        }
    }

    @Override // defpackage.qr
    public final void K(boolean z, boolean z2) {
        super.K(z, z2);
        int size = this.p0.size();
        for (int i = 0; i < size; i++) {
            ((qr) this.p0.get(i)).K(z, z2);
        }
    }

    public final void M(qr qrVar, int i) {
        if (i == 0) {
            int i2 = this.y0 + 1;
            fl[] flVarArr = this.B0;
            if (i2 >= flVarArr.length) {
                this.B0 = (fl[]) Arrays.copyOf(flVarArr, flVarArr.length * 2);
            }
            fl[] flVarArr2 = this.B0;
            int i3 = this.y0;
            flVarArr2[i3] = new fl(qrVar, 0, this.u0);
            this.y0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.z0 + 1;
            fl[] flVarArr3 = this.A0;
            if (i4 >= flVarArr3.length) {
                this.A0 = (fl[]) Arrays.copyOf(flVarArr3, flVarArr3.length * 2);
            }
            fl[] flVarArr4 = this.A0;
            int i5 = this.z0;
            flVarArr4[i5] = new fl(qrVar, 1, this.u0);
            this.z0 = i5 + 1;
        }
    }

    public final void N(zx0 zx0Var) {
        rr rrVar;
        zx0 zx0Var2;
        boolean zR = R(64);
        b(zx0Var, zR);
        int size = this.p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            qr qrVar = (qr) this.p0.get(i);
            boolean[] zArr = qrVar.R;
            zArr[0] = false;
            zArr[1] = false;
            if (qrVar instanceof ye) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                qr qrVar2 = (qr) this.p0.get(i2);
                if (qrVar2 instanceof ye) {
                    ye yeVar = (ye) qrVar2;
                    for (int i3 = 0; i3 < yeVar.q0; i3++) {
                        qr qrVar3 = yeVar.p0[i3];
                        if (yeVar.s0 || qrVar3.c()) {
                            int i4 = yeVar.r0;
                            if (i4 == 0 || i4 == 1) {
                                qrVar3.R[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                qrVar3.R[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.J0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            qr qrVar4 = (qr) this.p0.get(i5);
            qrVar4.getClass();
            boolean z2 = qrVar4 instanceof hd0;
            if (z2 || (qrVar4 instanceof cl0)) {
                if (z2) {
                    hashSet.add(qrVar4);
                } else {
                    qrVar4.b(zx0Var, zR);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hd0 hd0Var = (hd0) ((qr) it.next());
                for (int i6 = 0; i6 < hd0Var.q0; i6++) {
                    if (hashSet.contains(hd0Var.p0[i6])) {
                        hd0Var.b(zx0Var, zR);
                        hashSet.remove(hd0Var);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((qr) it2.next()).b(zx0Var, zR);
                }
                hashSet.clear();
            }
        }
        if (zx0.p) {
            HashSet<qr> hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                qr qrVar5 = (qr) this.p0.get(i7);
                qrVar5.getClass();
                if (!(qrVar5 instanceof hd0) && !(qrVar5 instanceof cl0)) {
                    hashSet2.add(qrVar5);
                }
            }
            rrVar = this;
            zx0Var2 = zx0Var;
            rrVar.a(this, zx0Var2, hashSet2, this.o0[0] == 2 ? 0 : 1, false);
            for (qr qrVar6 : hashSet2) {
                d42.d(rrVar, zx0Var2, qrVar6);
                qrVar6.b(zx0Var2, zR);
            }
        } else {
            rrVar = this;
            zx0Var2 = zx0Var;
            for (int i8 = 0; i8 < size; i8++) {
                qr qrVar7 = (qr) rrVar.p0.get(i8);
                if (qrVar7 instanceof rr) {
                    int[] iArr = qrVar7.o0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        qrVar7.H(1);
                    }
                    if (i10 == 2) {
                        qrVar7.I(1);
                    }
                    qrVar7.b(zx0Var2, zR);
                    if (i9 == 2) {
                        qrVar7.H(i9);
                    }
                    if (i10 == 2) {
                        qrVar7.I(i10);
                    }
                } else {
                    d42.d(rrVar, zx0Var2, qrVar7);
                    if (!(qrVar7 instanceof hd0) && !(qrVar7 instanceof cl0)) {
                        qrVar7.b(zx0Var2, zR);
                    }
                }
            }
        }
        if (rrVar.y0 > 0) {
            rq0.k(rrVar, zx0Var2, null, 0);
        }
        if (rrVar.z0 > 0) {
            rq0.k(rrVar, zx0Var2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    public final boolean O(int i, boolean z) {
        boolean z2;
        x00 x00Var = this.r0;
        ArrayList arrayList = (ArrayList) x00Var.f;
        rr rrVar = (rr) x00Var.d;
        boolean z3 = false;
        int iJ = rrVar.j(0);
        int iJ2 = rrVar.j(1);
        int iO = rrVar.o();
        int iP = rrVar.p();
        if (z && (iJ == 2 || iJ2 == 2)) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                l82 l82Var = (l82) obj;
                if (l82Var.f == i && !l82Var.k()) {
                    z = false;
                    break;
                }
            }
            if (i == 0) {
                if (z && iJ == 2) {
                    rrVar.H(1);
                    rrVar.J(x00Var.d(rrVar, 0));
                    rrVar.d.e.d(rrVar.n());
                }
            } else if (z && iJ2 == 2) {
                rrVar.I(1);
                rrVar.G(x00Var.d(rrVar, 1));
                rrVar.e.e.d(rrVar.k());
            }
        }
        int[] iArr = rrVar.o0;
        if (i == 0) {
            int i3 = iArr[0];
            if (i3 == 1 || i3 == 4) {
                int iN = rrVar.n() + iO;
                rrVar.d.i.d(iN);
                rrVar.d.e.d(iN - iO);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            int i4 = iArr[1];
            if (i4 == 1 || i4 == 4) {
                int iK = rrVar.k() + iP;
                rrVar.e.i.d(iK);
                rrVar.e.e.d(iK - iP);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        x00Var.g();
        int size2 = arrayList.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            l82 l82Var2 = (l82) obj2;
            if (l82Var2.f == i && (l82Var2.b != rrVar || l82Var2.g)) {
                l82Var2.e();
            }
        }
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            l82 l82Var3 = (l82) obj3;
            if (l82Var3.f == i && (z2 || l82Var3.b != rrVar)) {
                if (!l82Var3.h.j || !l82Var3.i.j || (!(l82Var3 instanceof gl) && !l82Var3.e.j)) {
                    rrVar.H(iJ);
                    rrVar.I(iJ2);
                    return z3;
                }
            }
        }
        z3 = true;
        rrVar.H(iJ);
        rrVar.I(iJ2);
        return z3;
    }

    /* JADX WARN: Code duplicated, block: B:339:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:341:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:349:0x0603  */
    /* JADX WARN: Code duplicated, block: B:350:0x060a  */
    /* JADX WARN: Code duplicated, block: B:356:0x061e  */
    /* JADX WARN: Code duplicated, block: B:362:0x0637  */
    /* JADX WARN: Code duplicated, block: B:365:0x063d  */
    /* JADX WARN: Code duplicated, block: B:367:0x0645 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:369:0x064e  */
    /* JADX WARN: Code duplicated, block: B:370:0x0653  */
    /* JADX WARN: Code duplicated, block: B:375:0x0661  */
    /* JADX WARN: Code duplicated, block: B:379:0x066c  */
    /* JADX WARN: Code duplicated, block: B:382:0x0677 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:384:0x067d  */
    /* JADX WARN: Code duplicated, block: B:387:0x0685  */
    /* JADX WARN: Code duplicated, block: B:391:0x068c  */
    /* JADX WARN: Code duplicated, block: B:394:0x0696  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:400:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:403:0x06c5 A[Catch: Exception -> 0x06d3, LOOP:12: B:402:0x06c3->B:403:0x06c5, LOOP_END, TryCatch #6 {Exception -> 0x06d3, blocks: (B:401:0x06b7, B:403:0x06c5, B:406:0x06dc), top: B:540:0x06b7 }] */
    /* JADX WARN: Code duplicated, block: B:411:0x06e9 A[Catch: Exception -> 0x0712, TRY_LEAVE, TryCatch #7 {Exception -> 0x0712, blocks: (B:409:0x06e3, B:411:0x06e9), top: B:542:0x06e3 }] */
    /* JADX WARN: Code duplicated, block: B:427:0x0716  */
    /* JADX WARN: Code duplicated, block: B:430:0x071e A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0742 A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:446:0x076d A[Catch: Exception -> 0x0706, TryCatch #3 {Exception -> 0x0706, blocks: (B:416:0x06ff, B:428:0x071a, B:430:0x071e, B:432:0x0724, B:433:0x073e, B:435:0x0742, B:437:0x0748, B:441:0x075e, B:444:0x0769, B:446:0x076d, B:448:0x0773), top: B:534:0x06ff }] */
    /* JADX WARN: Code duplicated, block: B:460:0x0798  */
    /* JADX WARN: Code duplicated, block: B:467:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:469:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:471:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:473:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:476:0x0800  */
    /* JADX WARN: Code duplicated, block: B:478:0x0807 A[LOOP:15: B:477:0x0805->B:478:0x0807, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:482:0x081a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:487:0x0827 A[LOOP:14: B:486:0x0825->B:487:0x0827, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:490:0x085c  */
    /* JADX WARN: Code duplicated, block: B:494:0x086e  */
    /* JADX WARN: Code duplicated, block: B:499:0x088e  */
    /* JADX WARN: Code duplicated, block: B:500:0x089a  */
    /* JADX WARN: Code duplicated, block: B:503:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:504:0x08b5  */
    /* JADX WARN: Code duplicated, block: B:506:0x08b9  */
    /* JADX WARN: Code duplicated, block: B:508:0x08c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:511:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:514:0x08d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:519:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:521:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:525:0x0902  */
    /* JADX WARN: Code duplicated, block: B:542:0x06e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:0x06a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r32v0, types: [qr, rr] */
    /* JADX WARN: Type inference failed for: r3v67, types: [int] */
    /* JADX WARN: Type inference failed for: r5v53, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v77, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v52, types: [int] */
    public final void P() {
        ?? r21;
        int i;
        int i2;
        int i3;
        int i4;
        cr crVar;
        cr crVar2;
        boolean z;
        boolean z2;
        char c;
        boolean z3;
        int i5;
        int i6;
        boolean zR;
        ?? r12;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        cr crVar3;
        boolean z6;
        boolean z7;
        int i9;
        boolean z8;
        int iMax;
        ?? r8;
        ?? r17;
        boolean z9;
        int iMax2;
        ?? r0;
        boolean z10;
        boolean z11;
        ?? r1;
        int i10;
        boolean z12;
        ?? r2;
        boolean z13;
        ?? r3;
        ?? r4;
        int i11;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        boolean zR2;
        int size;
        int i12;
        boolean z14;
        qr qrVar;
        boolean z15;
        int i13;
        WeakReference weakReference;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        cr crVar4;
        qr qrVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        char c2;
        k82 k82Var;
        k82 k82Var2;
        int i18;
        int iN;
        int size2;
        int i19;
        int i20;
        k82 k82Var3;
        int iB;
        int iB2;
        k82 k82Var4;
        k82 k82Var5;
        int i21;
        boolean z16;
        boolean[] zArr = d42.j;
        this.X = 0;
        this.Y = 0;
        this.D0 = false;
        this.E0 = false;
        int size3 = this.p0.size();
        int iMax7 = Math.max(0, n());
        int iMax8 = Math.max(0, k());
        int[] iArr = this.o0;
        int i22 = iArr[1];
        int i23 = iArr[0];
        int i24 = this.s0;
        cr crVar5 = this.I;
        cr crVar6 = this.H;
        if (i24 == 0 && d42.i(this.C0, 1)) {
            hr hrVar = this.t0;
            int i25 = iArr[0];
            int i26 = iArr[1];
            B();
            ArrayList arrayList = this.p0;
            int size4 = arrayList.size();
            for (int i27 = 0; i27 < size4; i27++) {
                ((qr) arrayList.get(i27)).B();
            }
            boolean z17 = this.u0;
            if (i25 == 1) {
                E(0, n());
            } else {
                crVar6.l(0);
                this.X = 0;
            }
            int i28 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i28 < size4) {
                int i29 = i28;
                qr qrVar3 = (qr) arrayList.get(i28);
                int[] iArr2 = iArr;
                if (qrVar3 instanceof cl0) {
                    cl0 cl0Var = (cl0) qrVar3;
                    z16 = z18;
                    if (cl0Var.t0 == 1) {
                        int i30 = cl0Var.q0;
                        if (i30 != -1) {
                            cl0Var.M(i30);
                        } else if (cl0Var.r0 != -1 && x()) {
                            cl0Var.M(n() - cl0Var.r0);
                        } else if (x()) {
                            cl0Var.M((int) ((cl0Var.p0 * n()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((qrVar3 instanceof ye) && ((ye) qrVar3).P() == 0) {
                        z18 = z16;
                        z19 = true;
                    }
                    i28 = i29 + 1;
                    iArr = iArr2;
                }
                z18 = z16;
                i28 = i29 + 1;
                iArr = iArr2;
            }
            r21 = iArr;
            if (z18) {
                for (int i31 = 0; i31 < size4; i31 = i21 + 1) {
                    qr qrVar4 = (qr) arrayList.get(i31);
                    if (qrVar4 instanceof cl0) {
                        cl0 cl0Var2 = (cl0) qrVar4;
                        i21 = i31;
                        if (cl0Var2.t0 == 1) {
                            xi0.o(0, hrVar, cl0Var2, z17);
                        }
                    } else {
                        i21 = i31;
                    }
                }
            }
            xi0.o(0, hrVar, this, z17);
            if (z19) {
                for (int i32 = 0; i32 < size4; i32++) {
                    qr qrVar5 = (qr) arrayList.get(i32);
                    if (qrVar5 instanceof ye) {
                        ye yeVar = (ye) qrVar5;
                        if (yeVar.P() == 0 && yeVar.O()) {
                            xi0.o(1, hrVar, yeVar, z17);
                        }
                    }
                }
            }
            if (i26 == 1) {
                F(0, k());
            } else {
                crVar5.l(0);
                this.Y = 0;
            }
            int i33 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i33 < size4) {
                qr qrVar6 = (qr) arrayList.get(i33);
                int i34 = i33;
                if (qrVar6 instanceof cl0) {
                    cl0 cl0Var3 = (cl0) qrVar6;
                    if (cl0Var3.t0 == 0) {
                        int i35 = cl0Var3.q0;
                        if (i35 != -1) {
                            cl0Var3.M(i35);
                        } else if (cl0Var3.r0 != -1 && y()) {
                            cl0Var3.M(k() - cl0Var3.r0);
                        } else if (y()) {
                            cl0Var3.M((int) ((cl0Var3.p0 * k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((qrVar6 instanceof ye) && ((ye) qrVar6).P() == 1) {
                    z21 = true;
                }
                i33 = i34 + 1;
            }
            if (z20) {
                for (int i36 = 0; i36 < size4; i36++) {
                    qr qrVar7 = (qr) arrayList.get(i36);
                    if (qrVar7 instanceof cl0) {
                        cl0 cl0Var4 = (cl0) qrVar7;
                        if (cl0Var4.t0 == 0) {
                            xi0.B(1, hrVar, cl0Var4);
                        }
                    }
                }
            }
            xi0.B(0, hrVar, this);
            if (z21) {
                for (int i37 = 0; i37 < size4; i37++) {
                    qr qrVar8 = (qr) arrayList.get(i37);
                    if (qrVar8 instanceof ye) {
                        ye yeVar2 = (ye) qrVar8;
                        if (yeVar2.P() == 1 && yeVar2.O()) {
                            xi0.B(1, hrVar, yeVar2);
                        }
                    }
                }
            }
            for (int i38 = 0; i38 < size4; i38++) {
                qr qrVar9 = (qr) arrayList.get(i38);
                if (qrVar9.w() && xi0.b(qrVar9)) {
                    Q(qrVar9, hrVar, xi0.a);
                    if (!(qrVar9 instanceof cl0)) {
                        xi0.o(0, hrVar, qrVar9, z17);
                        xi0.B(0, hrVar, qrVar9);
                    } else if (((cl0) qrVar9).t0 == 0) {
                        xi0.B(0, hrVar, qrVar9);
                    } else {
                        xi0.o(0, hrVar, qrVar9, z17);
                    }
                }
            }
            for (int i39 = 0; i39 < size3; i39++) {
                qr qrVar10 = (qr) this.p0.get(i39);
                if (qrVar10.w() && !(qrVar10 instanceof cl0) && !(qrVar10 instanceof ye) && !(qrVar10 instanceof hd0) && !qrVar10.E) {
                    int iJ = qrVar10.j(0);
                    int iJ2 = qrVar10.j(1);
                    if (iJ != 3 || qrVar10.q == 1 || iJ2 != 3 || qrVar10.r == 1) {
                        Q(qrVar10, this.t0, new ah());
                    }
                }
            }
        } else {
            r21 = iArr;
        }
        zx0 zx0Var = this.v0;
        if (size3 <= 2 || !((i23 == 2 || i22 == 2) && d42.i(this.C0, 1024))) {
            i = iMax7;
            i2 = size3;
            i3 = i22;
            i4 = i23;
            crVar = crVar5;
            crVar2 = crVar6;
        } else {
            hr hrVar2 = this.t0;
            ArrayList arrayList2 = this.p0;
            int size5 = arrayList2.size();
            int i40 = 0;
            while (true) {
                if (i40 < size5) {
                    qr qrVar11 = (qr) arrayList2.get(i40);
                    ?? r5 = r21[0];
                    ?? r6 = r21[1];
                    int i41 = i40;
                    int[] iArr3 = qrVar11.o0;
                    crVar2 = crVar6;
                    if (dw0.D(r5, r6, iArr3[0], iArr3[1]) && !(qrVar11 instanceof hd0)) {
                        i40 = i41 + 1;
                        crVar6 = crVar2;
                    } else {
                        i14 = iMax7;
                        i2 = size3;
                        i15 = iMax8;
                        i16 = i22;
                        i17 = i23;
                        crVar = crVar5;
                    }
                } else {
                    crVar2 = crVar6;
                    i2 = size3;
                    crVar = crVar5;
                    int i42 = 0;
                    ArrayList arrayList3 = null;
                    ArrayList arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i42 < size5) {
                        int i43 = i42;
                        qr qrVar12 = (qr) arrayList2.get(i42);
                        int i44 = iMax8;
                        ?? r7 = r21[0];
                        int i45 = i22;
                        ?? r9 = r21[1];
                        int i46 = iMax7;
                        int[] iArr4 = qrVar12.o0;
                        int i47 = i23;
                        if (!dw0.D(r7, r9, iArr4[0], iArr4[1])) {
                            Q(qrVar12, hrVar2, this.K0);
                        }
                        boolean z22 = qrVar12 instanceof cl0;
                        if (z22) {
                            cl0 cl0Var5 = (cl0) qrVar12;
                            if (cl0Var5.t0 == 0) {
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                arrayList7.add(cl0Var5);
                            }
                            if (cl0Var5.t0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(cl0Var5);
                            }
                        }
                        if (qrVar12 instanceof bm0) {
                            if (qrVar12 instanceof ye) {
                                ye yeVar3 = (ye) qrVar12;
                                if (yeVar3.P() == 0) {
                                    if (arrayList5 == null) {
                                        arrayList5 = new ArrayList();
                                    }
                                    arrayList5.add(yeVar3);
                                }
                                if (yeVar3.P() == 1) {
                                    if (arrayList8 == null) {
                                        arrayList8 = new ArrayList();
                                    }
                                    arrayList8.add(yeVar3);
                                }
                            } else {
                                bm0 bm0Var = (bm0) qrVar12;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(bm0Var);
                                if (arrayList8 == null) {
                                    arrayList8 = new ArrayList();
                                }
                                arrayList8.add(bm0Var);
                            }
                        }
                        if (qrVar12.H.f == null && qrVar12.J.f == null && !z22 && !(qrVar12 instanceof ye)) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(qrVar12);
                        }
                        if (qrVar12.I.f == null && qrVar12.K.f == null && qrVar12.L.f == null && !z22 && !(qrVar12 instanceof ye)) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(qrVar12);
                        }
                        i42 = i43 + 1;
                        iMax8 = i44;
                        i22 = i45;
                        iMax7 = i46;
                        i23 = i47;
                    }
                    i14 = iMax7;
                    i15 = iMax8;
                    i16 = i22;
                    i17 = i23;
                    ArrayList arrayList9 = new ArrayList();
                    if (arrayList3 != null) {
                        int size6 = arrayList3.size();
                        int i48 = 0;
                        while (i48 < size6) {
                            Object obj = arrayList3.get(i48);
                            i48++;
                            dw0.d((cl0) obj, 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        int size7 = arrayList5.size();
                        int i49 = 0;
                        while (i49 < size7) {
                            Object obj2 = arrayList5.get(i49);
                            i49++;
                            bm0 bm0Var2 = (bm0) obj2;
                            k82 k82VarD = dw0.d(bm0Var2, 0, arrayList9, null);
                            bm0Var2.M(0, k82VarD, arrayList9);
                            k82VarD.a(arrayList9);
                        }
                    }
                    HashSet hashSet = i(2).a;
                    if (hashSet != null) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            dw0.d(((cr) it.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet2 = i(4).a;
                    if (hashSet2 != null) {
                        Iterator it2 = hashSet2.iterator();
                        while (it2.hasNext()) {
                            dw0.d(((cr) it2.next()).d, 0, arrayList9, null);
                        }
                    }
                    HashSet hashSet3 = i(7).a;
                    if (hashSet3 != null) {
                        Iterator it3 = hashSet3.iterator();
                        while (it3.hasNext()) {
                            dw0.d(((cr) it3.next()).d, 0, arrayList9, null);
                        }
                    }
                    if (arrayList6 != null) {
                        int size8 = arrayList6.size();
                        int i50 = 0;
                        while (i50 < size8) {
                            Object obj3 = arrayList6.get(i50);
                            i50++;
                            dw0.d((qr) obj3, 0, arrayList9, null);
                        }
                    }
                    if (arrayList7 != null) {
                        int size9 = arrayList7.size();
                        int i51 = 0;
                        while (i51 < size9) {
                            Object obj4 = arrayList7.get(i51);
                            i51++;
                            dw0.d((cl0) obj4, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        int size10 = arrayList8.size();
                        int i52 = 0;
                        while (i52 < size10) {
                            Object obj5 = arrayList8.get(i52);
                            i52++;
                            bm0 bm0Var3 = (bm0) obj5;
                            k82 k82VarD2 = dw0.d(bm0Var3, 1, arrayList9, null);
                            bm0Var3.M(1, k82VarD2, arrayList9);
                            k82VarD2.a(arrayList9);
                        }
                    }
                    HashSet hashSet4 = i(3).a;
                    if (hashSet4 != null) {
                        Iterator it4 = hashSet4.iterator();
                        while (it4.hasNext()) {
                            dw0.d(((cr) it4.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet5 = i(6).a;
                    if (hashSet5 != null) {
                        Iterator it5 = hashSet5.iterator();
                        while (it5.hasNext()) {
                            dw0.d(((cr) it5.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet6 = i(5).a;
                    if (hashSet6 != null) {
                        Iterator it6 = hashSet6.iterator();
                        while (it6.hasNext()) {
                            dw0.d(((cr) it6.next()).d, 1, arrayList9, null);
                        }
                    }
                    HashSet hashSet7 = i(7).a;
                    if (hashSet7 != null) {
                        Iterator it7 = hashSet7.iterator();
                        while (it7.hasNext()) {
                            dw0.d(((cr) it7.next()).d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList4 != null) {
                        int size11 = arrayList4.size();
                        int i53 = 0;
                        while (i53 < size11) {
                            Object obj6 = arrayList4.get(i53);
                            i53++;
                            dw0.d((qr) obj6, 1, arrayList9, null);
                        }
                    }
                    char c3 = 1;
                    int i54 = 0;
                    while (i54 < size5) {
                        qr qrVar13 = (qr) arrayList2.get(i54);
                        int[] iArr5 = qrVar13.o0;
                        if (iArr5[0] == 3 && iArr5[c3] == 3) {
                            int i55 = qrVar13.m0;
                            int size12 = arrayList9.size();
                            int i56 = 0;
                            while (true) {
                                if (i56 >= size12) {
                                    k82Var4 = null;
                                    break;
                                }
                                k82Var4 = (k82) arrayList9.get(i56);
                                if (i55 == k82Var4.b) {
                                    break;
                                } else {
                                    i56++;
                                }
                            }
                            int i57 = qrVar13.n0;
                            int size13 = arrayList9.size();
                            int i58 = 0;
                            while (true) {
                                if (i58 >= size13) {
                                    k82Var5 = null;
                                    break;
                                }
                                k82Var5 = (k82) arrayList9.get(i58);
                                if (i57 == k82Var5.b) {
                                    break;
                                } else {
                                    i58++;
                                }
                            }
                            if (k82Var4 != null && k82Var5 != null) {
                                k82Var4.c(0, k82Var5);
                                k82Var5.c = 2;
                                arrayList9.remove(k82Var4);
                            }
                        }
                        i54++;
                        c3 = 1;
                    }
                    if (arrayList9.size() > 1) {
                        if (r21[0] == 2) {
                            int size14 = arrayList9.size();
                            int i59 = 0;
                            int i60 = 0;
                            k82Var = null;
                            while (i60 < size14) {
                                Object obj7 = arrayList9.get(i60);
                                i60++;
                                k82 k82Var6 = (k82) obj7;
                                if (k82Var6.c != 1 && (iB2 = k82Var6.b(zx0Var, 0)) > i59) {
                                    k82Var = k82Var6;
                                    i59 = iB2;
                                }
                            }
                            c2 = 1;
                            if (k82Var != null) {
                                H(1);
                                J(i59);
                            }
                            if (r21[c2] == 2) {
                                size2 = arrayList9.size();
                                i19 = 0;
                                i20 = 0;
                                k82Var2 = null;
                                while (i20 < size2) {
                                    Object obj8 = arrayList9.get(i20);
                                    i20++;
                                    k82Var3 = (k82) obj8;
                                    if (k82Var3.c != 0 && (iB = k82Var3.b(zx0Var, 1)) > i19) {
                                        k82Var2 = k82Var3;
                                        i19 = iB;
                                    }
                                }
                                if (k82Var2 != null) {
                                    I(1);
                                    G(i19);
                                } else {
                                    k82Var2 = null;
                                }
                            } else {
                                k82Var2 = null;
                            }
                            if (k82Var == null || k82Var2 != null) {
                                i4 = i17;
                                if (i4 == 2) {
                                    i18 = i14;
                                    if (i18 < n() || i18 <= 0) {
                                        iN = n();
                                    } else {
                                        J(i18);
                                        this.D0 = true;
                                    }
                                    i3 = i16;
                                    if (i3 == 2) {
                                        iMax8 = i15;
                                        if (iMax8 < k() || iMax8 <= 0) {
                                            iMax8 = k();
                                        } else {
                                            G(iMax8);
                                            this.E0 = true;
                                        }
                                    } else {
                                        iMax8 = i15;
                                    }
                                    i = iN;
                                    z = true;
                                } else {
                                    i18 = i14;
                                }
                                iN = i18;
                                i3 = i16;
                                if (i3 == 2) {
                                    iMax8 = i15;
                                    if (iMax8 < k()) {
                                        iMax8 = k();
                                    } else {
                                        iMax8 = k();
                                    }
                                } else {
                                    iMax8 = i15;
                                }
                                i = iN;
                                z = true;
                            }
                            if (!R(64) || R(128)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zx0Var.getClass();
                            zx0Var.g = false;
                            if (this.C0 == 0 && z2) {
                                c = 1;
                                zx0Var.g = true;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList10 = this.p0;
                            if (r21[0] != 2 || r21[c] == 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i5 = i2;
                            for (i6 = 0; i6 < i5; i6++) {
                                qrVar2 = (qr) this.p0.get(i6);
                                if (qrVar2 instanceof rr) {
                                    ((rr) qrVar2).P();
                                }
                            }
                            zR = R(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                try {
                                    zx0Var.t();
                                    this.y0 = 0;
                                    this.z0 = 0;
                                    g(zx0Var);
                                    for (i13 = 0; i13 < i5; i13++) {
                                        ((qr) this.p0.get(i13)).g(zx0Var);
                                    }
                                    N(zx0Var);
                                    try {
                                        weakReference = this.F0;
                                        if (weakReference != null) {
                                            try {
                                                if (weakReference.get() != null) {
                                                    crVar3 = crVar;
                                                    try {
                                                        try {
                                                            z6 = z3;
                                                            try {
                                                                zx0Var.f(zx0Var.k((cr) this.F0.get()), zx0Var.k(crVar3), 0, 5);
                                                                this.F0 = null;
                                                            } catch (Exception e) {
                                                                e = e;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                                if (z7) {
                                                                    zArr[2] = false;
                                                                    zR2 = R(64);
                                                                    L(zx0Var, zR2);
                                                                    size = this.p0.size();
                                                                    i12 = 0;
                                                                    z14 = false;
                                                                    while (i12 < size) {
                                                                        qrVar = (qr) this.p0.get(i12);
                                                                        qrVar.L(zx0Var, zR2);
                                                                        boolean z23 = zR2;
                                                                        int i61 = size;
                                                                        if (qrVar.h == -1) {
                                                                            z14 = true;
                                                                        } else {
                                                                            z14 = true;
                                                                        }
                                                                        i12++;
                                                                        zR2 = z23;
                                                                        size = i61;
                                                                        z14 = z14;
                                                                    }
                                                                    z8 = z14;
                                                                } else {
                                                                    L(zx0Var, zR);
                                                                    for (i9 = 0; i9 < i5; i9++) {
                                                                        ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                                                    }
                                                                    z8 = false;
                                                                }
                                                                if (z6) {
                                                                    iMax3 = 0;
                                                                    iMax4 = 0;
                                                                    for (i11 = 0; i11 < i5; i11++) {
                                                                        qr qrVar14 = (qr) this.p0.get(i11);
                                                                        iMax4 = Math.max(iMax4, qrVar14.n() + qrVar14.X);
                                                                        iMax3 = Math.max(iMax3, qrVar14.k() + qrVar14.Y);
                                                                    }
                                                                    iMax5 = Math.max(this.a0, iMax4);
                                                                    iMax6 = Math.max(this.b0, iMax3);
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    if (i4 == 2) {
                                                                        z8 = z8;
                                                                        r12 = r12;
                                                                        J(iMax5);
                                                                        r21[0] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                    if (i3 == 2) {
                                                                        G(iMax6);
                                                                        r21[1] = 2;
                                                                        z8 = true;
                                                                        r12 = 1;
                                                                    }
                                                                }
                                                                iMax = Math.max(this.a0, n());
                                                                if (iMax > n()) {
                                                                    J(iMax);
                                                                    r8 = 1;
                                                                    r21[0] = 1;
                                                                    z9 = true;
                                                                    r17 = 1;
                                                                } else {
                                                                    r8 = 1;
                                                                    r17 = r12;
                                                                    z9 = z8;
                                                                }
                                                                iMax2 = Math.max(this.b0, k());
                                                                if (iMax2 > k()) {
                                                                    G(iMax2);
                                                                    r21[r8] = r8;
                                                                    r4 = r8;
                                                                    z10 = r4 == true ? 1 : 0;
                                                                } else {
                                                                    r0 = r17;
                                                                }
                                                                if (r0 == 0) {
                                                                    z10 = z9;
                                                                    if (r21[0] == 2) {
                                                                        r3 = r0;
                                                                        z13 = z10;
                                                                        if (n() > i) {
                                                                            this.D0 = r8;
                                                                            r21[0] = r8;
                                                                            J(i);
                                                                            ?? r10 = r8;
                                                                            z13 = r10 == true ? 1 : 0;
                                                                            r3 = r10;
                                                                        }
                                                                    }
                                                                    r0 = r4;
                                                                    r3 = r0;
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    z13 = z10;
                                                                    r1 = r3;
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z11 = z13;
                                                                    if (r21[r8] != 2) {
                                                                    }
                                                                    if (i8 > i10) {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                        z12 = false;
                                                                    } else {
                                                                        r1 = r3;
                                                                        z11 = z13;
                                                                    }
                                                                    r12 = r2;
                                                                    i7 = i8;
                                                                    z3 = z6;
                                                                    crVar = crVar3;
                                                                    z4 = z12;
                                                                } else {
                                                                    z10 = z9;
                                                                    r0 = r4;
                                                                    r1 = r0;
                                                                    z11 = z10;
                                                                }
                                                                r1 = r3;
                                                                z11 = z13;
                                                                i10 = 8;
                                                                r2 = r1;
                                                                z12 = z11;
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                crVar = crVar3;
                                                                z4 = z12;
                                                            }
                                                        } catch (Exception e2) {
                                                            e = e2;
                                                            z6 = z3;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zR2 = R(64);
                                                                L(zx0Var, zR2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    qrVar = (qr) this.p0.get(i12);
                                                                    qrVar.L(zx0Var, zR2);
                                                                    boolean z24 = zR2;
                                                                    int i62 = size;
                                                                    if (qrVar.h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zR2 = z24;
                                                                    size = i62;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                L(zx0Var, zR);
                                                                while (i9 < i5) {
                                                                    ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    qr qrVar15 = (qr) this.p0.get(i11);
                                                                    iMax4 = Math.max(iMax4, qrVar15.n() + qrVar15.X);
                                                                    iMax3 = Math.max(iMax3, qrVar15.k() + qrVar15.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax4);
                                                                iMax6 = Math.max(this.b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    J(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    G(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, n());
                                                            if (iMax > n()) {
                                                                J(iMax);
                                                                r8 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, k());
                                                            if (iMax2 > k()) {
                                                                G(iMax2);
                                                                r21[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (n() > i) {
                                                                        this.D0 = r8;
                                                                        r21[0] = r8;
                                                                        J(i);
                                                                        ?? r11 = r8;
                                                                        z13 = r11 == true ? 1 : 0;
                                                                        r3 = r11;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                crVar = crVar3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            crVar = crVar3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    crVar3 = crVar;
                                                    z6 = z3;
                                                }
                                                weakReference2 = this.H0;
                                                if (weakReference2 != null && weakReference2.get() != null) {
                                                    zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                                    this.H0 = null;
                                                }
                                                weakReference3 = this.G0;
                                                if (weakReference3 != null && weakReference3.get() != null) {
                                                    crVar4 = crVar2;
                                                    try {
                                                        crVar2 = crVar4;
                                                        zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                                        this.G0 = null;
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                        crVar2 = crVar4;
                                                        z15 = true;
                                                        e.printStackTrace();
                                                        System.out.println("EXCEPTION : " + e);
                                                        z7 = z15;
                                                        if (z7) {
                                                            zArr[2] = false;
                                                            zR2 = R(64);
                                                            L(zx0Var, zR2);
                                                            size = this.p0.size();
                                                            i12 = 0;
                                                            z14 = false;
                                                            while (i12 < size) {
                                                                qrVar = (qr) this.p0.get(i12);
                                                                qrVar.L(zx0Var, zR2);
                                                                boolean z25 = zR2;
                                                                int i63 = size;
                                                                if (qrVar.h == -1) {
                                                                    z14 = true;
                                                                } else {
                                                                    z14 = true;
                                                                }
                                                                i12++;
                                                                zR2 = z25;
                                                                size = i63;
                                                                z14 = z14;
                                                            }
                                                            z8 = z14;
                                                        } else {
                                                            L(zx0Var, zR);
                                                            while (i9 < i5) {
                                                                ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                                            }
                                                            z8 = false;
                                                        }
                                                        if (z6) {
                                                            iMax3 = 0;
                                                            iMax4 = 0;
                                                            while (i11 < i5) {
                                                                qr qrVar16 = (qr) this.p0.get(i11);
                                                                iMax4 = Math.max(iMax4, qrVar16.n() + qrVar16.X);
                                                                iMax3 = Math.max(iMax3, qrVar16.k() + qrVar16.Y);
                                                            }
                                                            iMax5 = Math.max(this.a0, iMax4);
                                                            iMax6 = Math.max(this.b0, iMax3);
                                                            z8 = z8;
                                                            r12 = r12;
                                                            if (i4 == 2) {
                                                                z8 = z8;
                                                                r12 = r12;
                                                                J(iMax5);
                                                                r21[0] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                            if (i3 == 2) {
                                                                G(iMax6);
                                                                r21[1] = 2;
                                                                z8 = true;
                                                                r12 = 1;
                                                            }
                                                        }
                                                        iMax = Math.max(this.a0, n());
                                                        if (iMax > n()) {
                                                            J(iMax);
                                                            r8 = 1;
                                                            r21[0] = 1;
                                                            z9 = true;
                                                            r17 = 1;
                                                        } else {
                                                            r8 = 1;
                                                            r17 = r12;
                                                            z9 = z8;
                                                        }
                                                        iMax2 = Math.max(this.b0, k());
                                                        if (iMax2 > k()) {
                                                            G(iMax2);
                                                            r21[r8] = r8;
                                                            r4 = r8;
                                                            z10 = r4 == true ? 1 : 0;
                                                        } else {
                                                            r0 = r17;
                                                        }
                                                        if (r0 == 0) {
                                                            z10 = z9;
                                                            if (r21[0] == 2) {
                                                                r3 = r0;
                                                                z13 = z10;
                                                                if (n() > i) {
                                                                    this.D0 = r8;
                                                                    r21[0] = r8;
                                                                    J(i);
                                                                    ?? r13 = r8;
                                                                    z13 = r13 == true ? 1 : 0;
                                                                    r3 = r13;
                                                                }
                                                            }
                                                            r0 = r4;
                                                            r3 = r0;
                                                            r3 = r0;
                                                            z13 = z10;
                                                            z13 = z10;
                                                            r1 = r3;
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z11 = z13;
                                                            if (r21[r8] != 2) {
                                                            }
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            crVar = crVar3;
                                                            z4 = z12;
                                                        } else {
                                                            z10 = z9;
                                                            r0 = r4;
                                                            r1 = r0;
                                                            z11 = z10;
                                                        }
                                                        r1 = r3;
                                                        z11 = z13;
                                                        i10 = 8;
                                                        r2 = r1;
                                                        z12 = z11;
                                                        if (i8 > i10) {
                                                            r1 = r3;
                                                            z11 = z13;
                                                            z12 = false;
                                                        } else {
                                                            r1 = r3;
                                                            z11 = z13;
                                                        }
                                                        r12 = r2;
                                                        i7 = i8;
                                                        z3 = z6;
                                                        crVar = crVar3;
                                                        z4 = z12;
                                                    }
                                                }
                                                weakReference4 = this.I0;
                                                if (weakReference4 == null && weakReference4.get() != null) {
                                                    try {
                                                        try {
                                                            zx0Var.f(zx0Var.k(this.J), zx0Var.k((cr) this.I0.get()), 0, 5);
                                                            try {
                                                                this.I0 = null;
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                                z15 = true;
                                                                e.printStackTrace();
                                                                System.out.println("EXCEPTION : " + e);
                                                                z7 = z15;
                                                            }
                                                        } catch (Exception e6) {
                                                            e = e6;
                                                            z15 = true;
                                                            e.printStackTrace();
                                                            System.out.println("EXCEPTION : " + e);
                                                            z7 = z15;
                                                            if (z7) {
                                                                zArr[2] = false;
                                                                zR2 = R(64);
                                                                L(zx0Var, zR2);
                                                                size = this.p0.size();
                                                                i12 = 0;
                                                                z14 = false;
                                                                while (i12 < size) {
                                                                    qrVar = (qr) this.p0.get(i12);
                                                                    qrVar.L(zx0Var, zR2);
                                                                    boolean z26 = zR2;
                                                                    int i64 = size;
                                                                    if (qrVar.h == -1) {
                                                                        z14 = true;
                                                                    } else {
                                                                        z14 = true;
                                                                    }
                                                                    i12++;
                                                                    zR2 = z26;
                                                                    size = i64;
                                                                    z14 = z14;
                                                                }
                                                                z8 = z14;
                                                            } else {
                                                                L(zx0Var, zR);
                                                                while (i9 < i5) {
                                                                    ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                                                }
                                                                z8 = false;
                                                            }
                                                            if (z6) {
                                                                iMax3 = 0;
                                                                iMax4 = 0;
                                                                while (i11 < i5) {
                                                                    qr qrVar17 = (qr) this.p0.get(i11);
                                                                    iMax4 = Math.max(iMax4, qrVar17.n() + qrVar17.X);
                                                                    iMax3 = Math.max(iMax3, qrVar17.k() + qrVar17.Y);
                                                                }
                                                                iMax5 = Math.max(this.a0, iMax4);
                                                                iMax6 = Math.max(this.b0, iMax3);
                                                                z8 = z8;
                                                                r12 = r12;
                                                                if (i4 == 2) {
                                                                    z8 = z8;
                                                                    r12 = r12;
                                                                    J(iMax5);
                                                                    r21[0] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                                if (i3 == 2) {
                                                                    G(iMax6);
                                                                    r21[1] = 2;
                                                                    z8 = true;
                                                                    r12 = 1;
                                                                }
                                                            }
                                                            iMax = Math.max(this.a0, n());
                                                            if (iMax > n()) {
                                                                J(iMax);
                                                                r8 = 1;
                                                                r21[0] = 1;
                                                                z9 = true;
                                                                r17 = 1;
                                                            } else {
                                                                r8 = 1;
                                                                r17 = r12;
                                                                z9 = z8;
                                                            }
                                                            iMax2 = Math.max(this.b0, k());
                                                            if (iMax2 > k()) {
                                                                G(iMax2);
                                                                r21[r8] = r8;
                                                                r4 = r8;
                                                                z10 = r4 == true ? 1 : 0;
                                                            } else {
                                                                r0 = r17;
                                                            }
                                                            if (r0 == 0) {
                                                                z10 = z9;
                                                                if (r21[0] == 2) {
                                                                    r3 = r0;
                                                                    z13 = z10;
                                                                    if (n() > i) {
                                                                        this.D0 = r8;
                                                                        r21[0] = r8;
                                                                        J(i);
                                                                        ?? r14 = r8;
                                                                        z13 = r14 == true ? 1 : 0;
                                                                        r3 = r14;
                                                                    }
                                                                }
                                                                r0 = r4;
                                                                r3 = r0;
                                                                r3 = r0;
                                                                z13 = z10;
                                                                z13 = z10;
                                                                r1 = r3;
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z11 = z13;
                                                                if (r21[r8] != 2) {
                                                                }
                                                                if (i8 > i10) {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                    z12 = false;
                                                                } else {
                                                                    r1 = r3;
                                                                    z11 = z13;
                                                                }
                                                                r12 = r2;
                                                                i7 = i8;
                                                                z3 = z6;
                                                                crVar = crVar3;
                                                                z4 = z12;
                                                            } else {
                                                                z10 = z9;
                                                                r0 = r4;
                                                                r1 = r0;
                                                                z11 = z10;
                                                            }
                                                            r1 = r3;
                                                            z11 = z13;
                                                            i10 = 8;
                                                            r2 = r1;
                                                            z12 = z11;
                                                            if (i8 > i10) {
                                                                r1 = r3;
                                                                z11 = z13;
                                                                z12 = false;
                                                            } else {
                                                                r1 = r3;
                                                                z11 = z13;
                                                            }
                                                            r12 = r2;
                                                            i7 = i8;
                                                            z3 = z6;
                                                            crVar = crVar3;
                                                            z4 = z12;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                    }
                                                }
                                                zx0Var.p();
                                                z7 = true;
                                            } catch (Exception e8) {
                                                e = e8;
                                                crVar3 = crVar;
                                            }
                                        } else {
                                            crVar3 = crVar;
                                            z6 = z3;
                                            weakReference2 = this.H0;
                                            if (weakReference2 != null) {
                                                zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                                this.H0 = null;
                                            }
                                            weakReference3 = this.G0;
                                            if (weakReference3 != null) {
                                                crVar4 = crVar2;
                                                crVar2 = crVar4;
                                                zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                                this.G0 = null;
                                            }
                                            weakReference4 = this.I0;
                                            if (weakReference4 == null) {
                                            }
                                            zx0Var.p();
                                            z7 = true;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        crVar3 = crVar;
                                        z6 = z3;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    crVar3 = crVar;
                                    z6 = z3;
                                    z15 = z4;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(zx0Var, zR2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        qrVar = (qr) this.p0.get(i12);
                                        qrVar.L(zx0Var, zR2);
                                        boolean z27 = zR2;
                                        int i65 = size;
                                        if (qrVar.h == -1 || qrVar.i != -1) {
                                            z14 = true;
                                        }
                                        i12++;
                                        zR2 = z27;
                                        size = i65;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    L(zx0Var, zR);
                                    while (i9 < i5) {
                                        ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                    }
                                    z8 = false;
                                }
                                if (z6 && i8 < 8 && zArr[2]) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        qr qrVar18 = (qr) this.p0.get(i11);
                                        iMax4 = Math.max(iMax4, qrVar18.n() + qrVar18.X);
                                        iMax3 = Math.max(iMax3, qrVar18.k() + qrVar18.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax4);
                                    iMax6 = Math.max(this.b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2 && n() < iMax5) {
                                        z8 = z8;
                                        r12 = r12;
                                        J(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2 && k() < iMax6) {
                                        G(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r8 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r8 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r21[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2 && i > 0) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (n() > i) {
                                            this.D0 = r8;
                                            r21[0] = r8;
                                            J(i);
                                            ?? r15 = r8;
                                            z13 = r15 == true ? 1 : 0;
                                            r3 = r15;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r8] != 2 && iMax8 > 0 && k() > iMax8) {
                                        this.E0 = r8;
                                        r21[r8] = r8;
                                        G(iMax8);
                                        r2 = 1;
                                        i10 = 8;
                                        z12 = true;
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    crVar = crVar3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                crVar = crVar3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList10;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            C(zx0Var.l);
                        }
                        c2 = 1;
                        k82Var = null;
                        if (r21[c2] == 2) {
                            size2 = arrayList9.size();
                            i19 = 0;
                            i20 = 0;
                            k82Var2 = null;
                            while (i20 < size2) {
                                Object obj9 = arrayList9.get(i20);
                                i20++;
                                k82Var3 = (k82) obj9;
                                if (k82Var3.c != 0) {
                                    k82Var2 = k82Var3;
                                    i19 = iB;
                                }
                            }
                            if (k82Var2 != null) {
                                I(1);
                                G(i19);
                            } else {
                                k82Var2 = null;
                            }
                        } else {
                            k82Var2 = null;
                        }
                        if (k82Var == null) {
                        }
                        i4 = i17;
                        if (i4 == 2) {
                            i18 = i14;
                            if (i18 < n()) {
                            }
                            iN = n();
                            i3 = i16;
                            if (i3 == 2) {
                                iMax8 = i15;
                                if (iMax8 < k()) {
                                    iMax8 = k();
                                } else {
                                    iMax8 = k();
                                }
                            } else {
                                iMax8 = i15;
                            }
                            i = iN;
                            z = true;
                            if (R(64)) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            zx0Var.getClass();
                            zx0Var.g = false;
                            if (this.C0 == 0) {
                                c = 1;
                            } else {
                                c = 1;
                            }
                            ArrayList arrayList11 = this.p0;
                            if (r21[0] != 2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            this.y0 = 0;
                            this.z0 = 0;
                            i5 = i2;
                            while (i6 < i5) {
                                qrVar2 = (qr) this.p0.get(i6);
                                if (qrVar2 instanceof rr) {
                                    ((rr) qrVar2).P();
                                }
                            }
                            zR = R(64);
                            r12 = z;
                            i7 = 0;
                            z4 = true;
                            while (z4) {
                                i8 = i7 + 1;
                                zx0Var.t();
                                this.y0 = 0;
                                this.z0 = 0;
                                g(zx0Var);
                                while (i13 < i5) {
                                    ((qr) this.p0.get(i13)).g(zx0Var);
                                }
                                N(zx0Var);
                                weakReference = this.F0;
                                if (weakReference != null) {
                                    if (weakReference.get() != null) {
                                        crVar3 = crVar;
                                        z6 = z3;
                                        zx0Var.f(zx0Var.k((cr) this.F0.get()), zx0Var.k(crVar3), 0, 5);
                                        this.F0 = null;
                                    } else {
                                        crVar3 = crVar;
                                        z6 = z3;
                                    }
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        crVar4 = crVar2;
                                        crVar2 = crVar4;
                                        zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    zx0Var.p();
                                    z7 = true;
                                } else {
                                    crVar3 = crVar;
                                    z6 = z3;
                                    weakReference2 = this.H0;
                                    if (weakReference2 != null) {
                                        zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                        this.H0 = null;
                                    }
                                    weakReference3 = this.G0;
                                    if (weakReference3 != null) {
                                        crVar4 = crVar2;
                                        crVar2 = crVar4;
                                        zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                        this.G0 = null;
                                    }
                                    weakReference4 = this.I0;
                                    if (weakReference4 == null) {
                                    }
                                    zx0Var.p();
                                    z7 = true;
                                }
                                if (z7) {
                                    zArr[2] = false;
                                    zR2 = R(64);
                                    L(zx0Var, zR2);
                                    size = this.p0.size();
                                    i12 = 0;
                                    z14 = false;
                                    while (i12 < size) {
                                        qrVar = (qr) this.p0.get(i12);
                                        qrVar.L(zx0Var, zR2);
                                        boolean z28 = zR2;
                                        int i66 = size;
                                        if (qrVar.h == -1) {
                                            z14 = true;
                                        } else {
                                            z14 = true;
                                        }
                                        i12++;
                                        zR2 = z28;
                                        size = i66;
                                        z14 = z14;
                                    }
                                    z8 = z14;
                                } else {
                                    L(zx0Var, zR);
                                    while (i9 < i5) {
                                        ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                    }
                                    z8 = false;
                                }
                                if (z6) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i11 < i5) {
                                        qr qrVar19 = (qr) this.p0.get(i11);
                                        iMax4 = Math.max(iMax4, qrVar19.n() + qrVar19.X);
                                        iMax3 = Math.max(iMax3, qrVar19.k() + qrVar19.Y);
                                    }
                                    iMax5 = Math.max(this.a0, iMax4);
                                    iMax6 = Math.max(this.b0, iMax3);
                                    z8 = z8;
                                    r12 = r12;
                                    if (i4 == 2) {
                                        z8 = z8;
                                        r12 = r12;
                                        J(iMax5);
                                        r21[0] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                    if (i3 == 2) {
                                        G(iMax6);
                                        r21[1] = 2;
                                        z8 = true;
                                        r12 = 1;
                                    }
                                }
                                iMax = Math.max(this.a0, n());
                                if (iMax > n()) {
                                    J(iMax);
                                    r8 = 1;
                                    r21[0] = 1;
                                    z9 = true;
                                    r17 = 1;
                                } else {
                                    r8 = 1;
                                    r17 = r12;
                                    z9 = z8;
                                }
                                iMax2 = Math.max(this.b0, k());
                                if (iMax2 > k()) {
                                    G(iMax2);
                                    r21[r8] = r8;
                                    r4 = r8;
                                    z10 = r4 == true ? 1 : 0;
                                } else {
                                    r0 = r17;
                                }
                                if (r0 == 0) {
                                    z10 = z9;
                                    if (r21[0] == 2) {
                                        r3 = r0;
                                        z13 = z10;
                                        if (n() > i) {
                                            this.D0 = r8;
                                            r21[0] = r8;
                                            J(i);
                                            ?? r16 = r8;
                                            z13 = r16 == true ? 1 : 0;
                                            r3 = r16;
                                        }
                                    }
                                    r0 = r4;
                                    r3 = r0;
                                    r3 = r0;
                                    z13 = z10;
                                    z13 = z10;
                                    r1 = r3;
                                    r1 = r3;
                                    z11 = z13;
                                    z11 = z13;
                                    if (r21[r8] != 2) {
                                    }
                                    if (i8 > i10) {
                                        r1 = r3;
                                        z11 = z13;
                                        z12 = false;
                                    } else {
                                        r1 = r3;
                                        z11 = z13;
                                    }
                                    r12 = r2;
                                    i7 = i8;
                                    z3 = z6;
                                    crVar = crVar3;
                                    z4 = z12;
                                } else {
                                    z10 = z9;
                                    r0 = r4;
                                    r1 = r0;
                                    z11 = z10;
                                }
                                r1 = r3;
                                z11 = z13;
                                i10 = 8;
                                r2 = r1;
                                z12 = z11;
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                crVar = crVar3;
                                z4 = z12;
                            }
                            z5 = r12 == true ? 1 : 0;
                            this.p0 = arrayList11;
                            if (z5) {
                                r21[0] = i4;
                                r21[1] = i3;
                            }
                            C(zx0Var.l);
                        }
                        i18 = i14;
                        iN = i18;
                        i3 = i16;
                        if (i3 == 2) {
                            iMax8 = i15;
                            if (iMax8 < k()) {
                                iMax8 = k();
                            } else {
                                iMax8 = k();
                            }
                        } else {
                            iMax8 = i15;
                        }
                        i = iN;
                        z = true;
                        if (R(64)) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        zx0Var.getClass();
                        zx0Var.g = false;
                        if (this.C0 == 0) {
                            c = 1;
                        } else {
                            c = 1;
                        }
                        ArrayList arrayList12 = this.p0;
                        if (r21[0] != 2) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        this.y0 = 0;
                        this.z0 = 0;
                        i5 = i2;
                        while (i6 < i5) {
                            qrVar2 = (qr) this.p0.get(i6);
                            if (qrVar2 instanceof rr) {
                                ((rr) qrVar2).P();
                            }
                        }
                        zR = R(64);
                        r12 = z;
                        i7 = 0;
                        z4 = true;
                        while (z4) {
                            i8 = i7 + 1;
                            zx0Var.t();
                            this.y0 = 0;
                            this.z0 = 0;
                            g(zx0Var);
                            while (i13 < i5) {
                                ((qr) this.p0.get(i13)).g(zx0Var);
                            }
                            N(zx0Var);
                            weakReference = this.F0;
                            if (weakReference != null) {
                                if (weakReference.get() != null) {
                                    crVar3 = crVar;
                                    z6 = z3;
                                    zx0Var.f(zx0Var.k((cr) this.F0.get()), zx0Var.k(crVar3), 0, 5);
                                    this.F0 = null;
                                } else {
                                    crVar3 = crVar;
                                    z6 = z3;
                                }
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    crVar4 = crVar2;
                                    crVar2 = crVar4;
                                    zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                zx0Var.p();
                                z7 = true;
                            } else {
                                crVar3 = crVar;
                                z6 = z3;
                                weakReference2 = this.H0;
                                if (weakReference2 != null) {
                                    zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                                    this.H0 = null;
                                }
                                weakReference3 = this.G0;
                                if (weakReference3 != null) {
                                    crVar4 = crVar2;
                                    crVar2 = crVar4;
                                    zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                                    this.G0 = null;
                                }
                                weakReference4 = this.I0;
                                if (weakReference4 == null) {
                                }
                                zx0Var.p();
                                z7 = true;
                            }
                            if (z7) {
                                zArr[2] = false;
                                zR2 = R(64);
                                L(zx0Var, zR2);
                                size = this.p0.size();
                                i12 = 0;
                                z14 = false;
                                while (i12 < size) {
                                    qrVar = (qr) this.p0.get(i12);
                                    qrVar.L(zx0Var, zR2);
                                    boolean z29 = zR2;
                                    int i67 = size;
                                    if (qrVar.h == -1) {
                                        z14 = true;
                                    } else {
                                        z14 = true;
                                    }
                                    i12++;
                                    zR2 = z29;
                                    size = i67;
                                    z14 = z14;
                                }
                                z8 = z14;
                            } else {
                                L(zx0Var, zR);
                                while (i9 < i5) {
                                    ((qr) this.p0.get(i9)).L(zx0Var, zR);
                                }
                                z8 = false;
                            }
                            if (z6) {
                                iMax3 = 0;
                                iMax4 = 0;
                                while (i11 < i5) {
                                    qr qrVar110 = (qr) this.p0.get(i11);
                                    iMax4 = Math.max(iMax4, qrVar110.n() + qrVar110.X);
                                    iMax3 = Math.max(iMax3, qrVar110.k() + qrVar110.Y);
                                }
                                iMax5 = Math.max(this.a0, iMax4);
                                iMax6 = Math.max(this.b0, iMax3);
                                z8 = z8;
                                r12 = r12;
                                if (i4 == 2) {
                                    z8 = z8;
                                    r12 = r12;
                                    J(iMax5);
                                    r21[0] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                                if (i3 == 2) {
                                    G(iMax6);
                                    r21[1] = 2;
                                    z8 = true;
                                    r12 = 1;
                                }
                            }
                            iMax = Math.max(this.a0, n());
                            if (iMax > n()) {
                                J(iMax);
                                r8 = 1;
                                r21[0] = 1;
                                z9 = true;
                                r17 = 1;
                            } else {
                                r8 = 1;
                                r17 = r12;
                                z9 = z8;
                            }
                            iMax2 = Math.max(this.b0, k());
                            if (iMax2 > k()) {
                                G(iMax2);
                                r21[r8] = r8;
                                r4 = r8;
                                z10 = r4 == true ? 1 : 0;
                            } else {
                                r0 = r17;
                            }
                            if (r0 == 0) {
                                z10 = z9;
                                if (r21[0] == 2) {
                                    r3 = r0;
                                    z13 = z10;
                                    if (n() > i) {
                                        this.D0 = r8;
                                        r21[0] = r8;
                                        J(i);
                                        ?? r18 = r8;
                                        z13 = r18 == true ? 1 : 0;
                                        r3 = r18;
                                    }
                                }
                                r0 = r4;
                                r3 = r0;
                                r3 = r0;
                                z13 = z10;
                                z13 = z10;
                                r1 = r3;
                                r1 = r3;
                                z11 = z13;
                                z11 = z13;
                                if (r21[r8] != 2) {
                                }
                                if (i8 > i10) {
                                    r1 = r3;
                                    z11 = z13;
                                    z12 = false;
                                } else {
                                    r1 = r3;
                                    z11 = z13;
                                }
                                r12 = r2;
                                i7 = i8;
                                z3 = z6;
                                crVar = crVar3;
                                z4 = z12;
                            } else {
                                z10 = z9;
                                r0 = r4;
                                r1 = r0;
                                z11 = z10;
                            }
                            r1 = r3;
                            z11 = z13;
                            i10 = 8;
                            r2 = r1;
                            z12 = z11;
                            if (i8 > i10) {
                                r1 = r3;
                                z11 = z13;
                                z12 = false;
                            } else {
                                r1 = r3;
                                z11 = z13;
                            }
                            r12 = r2;
                            i7 = i8;
                            z3 = z6;
                            crVar = crVar3;
                            z4 = z12;
                        }
                        z5 = r12 == true ? 1 : 0;
                        this.p0 = arrayList12;
                        if (z5) {
                            r21[0] = i4;
                            r21[1] = i3;
                        }
                        C(zx0Var.l);
                    }
                }
                iMax8 = i15;
                i3 = i16;
                i = i14;
                i4 = i17;
            }
        }
        z = false;
        if (R(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        zx0Var.getClass();
        zx0Var.g = false;
        if (this.C0 == 0) {
            c = 1;
        } else {
            c = 1;
        }
        ArrayList arrayList13 = this.p0;
        if (r21[0] != 2) {
            z3 = true;
        } else {
            z3 = true;
        }
        this.y0 = 0;
        this.z0 = 0;
        i5 = i2;
        while (i6 < i5) {
            qrVar2 = (qr) this.p0.get(i6);
            if (qrVar2 instanceof rr) {
                ((rr) qrVar2).P();
            }
        }
        zR = R(64);
        r12 = z;
        i7 = 0;
        z4 = true;
        while (z4) {
            i8 = i7 + 1;
            zx0Var.t();
            this.y0 = 0;
            this.z0 = 0;
            g(zx0Var);
            while (i13 < i5) {
                ((qr) this.p0.get(i13)).g(zx0Var);
            }
            N(zx0Var);
            weakReference = this.F0;
            if (weakReference != null) {
                if (weakReference.get() != null) {
                    crVar3 = crVar;
                    z6 = z3;
                    zx0Var.f(zx0Var.k((cr) this.F0.get()), zx0Var.k(crVar3), 0, 5);
                    this.F0 = null;
                } else {
                    crVar3 = crVar;
                    z6 = z3;
                }
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    crVar4 = crVar2;
                    crVar2 = crVar4;
                    zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                zx0Var.p();
                z7 = true;
            } else {
                crVar3 = crVar;
                z6 = z3;
                weakReference2 = this.H0;
                if (weakReference2 != null) {
                    zx0Var.f(zx0Var.k(this.K), zx0Var.k((cr) this.H0.get()), 0, 5);
                    this.H0 = null;
                }
                weakReference3 = this.G0;
                if (weakReference3 != null) {
                    crVar4 = crVar2;
                    crVar2 = crVar4;
                    zx0Var.f(zx0Var.k((cr) this.G0.get()), zx0Var.k(crVar4), 0, 5);
                    this.G0 = null;
                }
                weakReference4 = this.I0;
                if (weakReference4 == null) {
                }
                zx0Var.p();
                z7 = true;
            }
            if (z7) {
                zArr[2] = false;
                zR2 = R(64);
                L(zx0Var, zR2);
                size = this.p0.size();
                i12 = 0;
                z14 = false;
                while (i12 < size) {
                    qrVar = (qr) this.p0.get(i12);
                    qrVar.L(zx0Var, zR2);
                    boolean z210 = zR2;
                    int i68 = size;
                    if (qrVar.h == -1) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    i12++;
                    zR2 = z210;
                    size = i68;
                    z14 = z14;
                }
                z8 = z14;
            } else {
                L(zx0Var, zR);
                while (i9 < i5) {
                    ((qr) this.p0.get(i9)).L(zx0Var, zR);
                }
                z8 = false;
            }
            if (z6) {
                iMax3 = 0;
                iMax4 = 0;
                while (i11 < i5) {
                    qr qrVar111 = (qr) this.p0.get(i11);
                    iMax4 = Math.max(iMax4, qrVar111.n() + qrVar111.X);
                    iMax3 = Math.max(iMax3, qrVar111.k() + qrVar111.Y);
                }
                iMax5 = Math.max(this.a0, iMax4);
                iMax6 = Math.max(this.b0, iMax3);
                z8 = z8;
                r12 = r12;
                if (i4 == 2) {
                    z8 = z8;
                    r12 = r12;
                    J(iMax5);
                    r21[0] = 2;
                    z8 = true;
                    r12 = 1;
                }
                if (i3 == 2) {
                    G(iMax6);
                    r21[1] = 2;
                    z8 = true;
                    r12 = 1;
                }
            }
            iMax = Math.max(this.a0, n());
            if (iMax > n()) {
                J(iMax);
                r8 = 1;
                r21[0] = 1;
                z9 = true;
                r17 = 1;
            } else {
                r8 = 1;
                r17 = r12;
                z9 = z8;
            }
            iMax2 = Math.max(this.b0, k());
            if (iMax2 > k()) {
                G(iMax2);
                r21[r8] = r8;
                r4 = r8;
                z10 = r4 == true ? 1 : 0;
            } else {
                r0 = r17;
            }
            if (r0 == 0) {
                z10 = z9;
                if (r21[0] == 2) {
                    r3 = r0;
                    z13 = z10;
                    if (n() > i) {
                        this.D0 = r8;
                        r21[0] = r8;
                        J(i);
                        ?? r19 = r8;
                        z13 = r19 == true ? 1 : 0;
                        r3 = r19;
                    }
                }
                r0 = r4;
                r3 = r0;
                r3 = r0;
                z13 = z10;
                z13 = z10;
                r1 = r3;
                r1 = r3;
                z11 = z13;
                z11 = z13;
                if (r21[r8] != 2) {
                }
                if (i8 > i10) {
                    r1 = r3;
                    z11 = z13;
                    z12 = false;
                } else {
                    r1 = r3;
                    z11 = z13;
                }
                r12 = r2;
                i7 = i8;
                z3 = z6;
                crVar = crVar3;
                z4 = z12;
            } else {
                z10 = z9;
                r0 = r4;
                r1 = r0;
                z11 = z10;
            }
            r1 = r3;
            z11 = z13;
            i10 = 8;
            r2 = r1;
            z12 = z11;
            if (i8 > i10) {
                r1 = r3;
                z11 = z13;
                z12 = false;
            } else {
                r1 = r3;
                z11 = z13;
            }
            r12 = r2;
            i7 = i8;
            z3 = z6;
            crVar = crVar3;
            z4 = z12;
        }
        z5 = r12 == true ? 1 : 0;
        this.p0 = arrayList13;
        if (z5) {
            r21[0] = i4;
            r21[1] = i3;
        }
        C(zx0Var.l);
    }

    public final boolean R(int i) {
        return (this.C0 & i) == i;
    }

    @Override // defpackage.qr
    public final void z() {
        this.v0.t();
        this.w0 = 0;
        this.x0 = 0;
        this.p0.clear();
        super.z();
    }
}
