package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yx implements yw {
    public final uv1 W;
    public final uv1 X;
    public final ud2 Y;
    public final db0 a;
    public final wa b;
    public final et c;
    public final kj0 d;
    public final h61 e;
    public int f;
    public ft1 i;
    public final wa v;
    public final ud2 w;

    public yx(db0 db0Var, List list, wa waVar, et etVar) {
        list.getClass();
        this.a = db0Var;
        this.b = waVar;
        this.c = etVar;
        this.d = new kj0(new ol(this, null), 19);
        this.e = new h61();
        this.v = new wa(9);
        ud2 ud2Var = new ud2();
        list.getClass();
        ud2Var.d = this;
        ud2Var.a = new h61();
        ud2Var.b = g93.a();
        ud2Var.c = CollectionsKt.B(list);
        this.w = ud2Var;
        this.W = aw0.a(new dx(this, 1));
        int i = 0;
        this.X = aw0.a(new dx(this, i));
        ux uxVar = new ux(this, i);
        pw pwVar = new pw(this, null, 2);
        vx vxVar = vx.a;
        vxVar.getClass();
        ud2 ud2Var2 = new ud2();
        ud2Var2.a = etVar;
        ud2Var2.b = pwVar;
        ud2Var2.c = x91.a(Integer.MAX_VALUE, null, 6);
        ud2Var2.d = new wa(5);
        ws0 ws0Var = (ws0) etVar.b().get(k42.c);
        if (ws0Var != null) {
            ws0Var.invokeOnCompletion(new vq1(uxVar, ud2Var2, vxVar));
        }
        this.Y = ud2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(yx yxVar, gs gsVar) {
        kx kxVar;
        h61 h61Var;
        if (gsVar instanceof kx) {
            kxVar = (kx) gsVar;
            int i = kxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                kxVar.e = i - Integer.MIN_VALUE;
            } else {
                kxVar = new kx(yxVar, gsVar);
            }
        } else {
            kxVar = new kx(yxVar, gsVar);
        }
        Object obj = kxVar.c;
        ft ftVar = ft.a;
        int i2 = kxVar.e;
        if (i2 == 0) {
            zi0.B(obj);
            h61Var = yxVar.e;
            kxVar.a = yxVar;
            kxVar.b = h61Var;
            kxVar.e = 1;
            if (h61Var.d(kxVar) == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h61 h61Var2 = kxVar.b;
            yx yxVar2 = kxVar.a;
            zi0.B(obj);
            h61Var = h61Var2;
            yxVar = yxVar2;
        }
        try {
            int i3 = yxVar.f - 1;
            yxVar.f = i3;
            if (i3 == 0) {
                ft1 ft1Var = yxVar.i;
                if (ft1Var != null) {
                    ft1Var.cancel(null);
                }
                yxVar.i = null;
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            h61Var.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [yx] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [yx] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(defpackage.yx r9, defpackage.g41 r10, defpackage.gs r11) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.c(yx, g41, gs):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(yx yxVar, gs gsVar) {
        mx mxVar;
        h61 h61Var;
        if (gsVar instanceof mx) {
            mxVar = (mx) gsVar;
            int i = mxVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                mxVar.e = i - Integer.MIN_VALUE;
            } else {
                mxVar = new mx(yxVar, gsVar);
            }
        } else {
            mxVar = new mx(yxVar, gsVar);
        }
        Object obj = mxVar.c;
        ft ftVar = ft.a;
        int i2 = mxVar.e;
        int i3 = 1;
        fs fsVar = null;
        if (i2 == 0) {
            zi0.B(obj);
            h61Var = yxVar.e;
            mxVar.a = yxVar;
            mxVar.b = h61Var;
            mxVar.e = 1;
            if (h61Var.d(mxVar) == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h61 h61Var2 = mxVar.b;
            yx yxVar2 = mxVar.a;
            zi0.B(obj);
            h61Var = h61Var2;
            yxVar = yxVar2;
        }
        try {
            int i4 = yxVar.f + 1;
            yxVar.f = i4;
            if (i4 == 1) {
                yxVar.i = qt.o(yxVar.c, new ex(yxVar, fsVar, i3));
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            h61Var.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(yx yxVar, boolean z, fs fsVar) throws Throwable {
        ox oxVar;
        yx yxVar2;
        kt1 kt1Var;
        yx yxVar3;
        Pair pair;
        kt1 kt1Var2;
        if (fsVar instanceof ox) {
            oxVar = (ox) fsVar;
            int i = oxVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                oxVar.f = i - Integer.MIN_VALUE;
            } else {
                oxVar = new ox(yxVar, fsVar);
            }
        } else {
            oxVar = new ox(yxVar, fsVar);
        }
        Object objC = oxVar.d;
        ft ftVar = ft.a;
        int i2 = oxVar.f;
        fs fsVar2 = null;
        if (i2 == 0) {
            zi0.B(objC);
            kt1 kt1VarA = yxVar.v.a();
            if (kt1VarA instanceof j22) {
                uq1.q("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            dr1 dr1VarH = yxVar.h();
            oxVar.a = yxVar;
            oxVar.b = kt1VarA;
            oxVar.c = z;
            oxVar.f = 1;
            Integer numA = dr1VarH.a();
            if (numA != ftVar) {
                yxVar2 = yxVar;
                kt1Var = kt1VarA;
                objC = numA;
            }
            return ftVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                yxVar3 = oxVar.a;
                zi0.B(objC);
                pair = (Pair) objC;
                kt1Var2 = (kt1) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yxVar3.v.o(kt1Var2);
                }
                return kt1Var2;
            }
            if (i2 != 3) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yxVar3 = oxVar.a;
            zi0.B(objC);
            pair = (Pair) objC;
            kt1Var2 = (kt1) pair.a;
            if (((Boolean) pair.b).booleanValue()) {
                yxVar3.v.o(kt1Var2);
            }
            return kt1Var2;
        }
        z = oxVar.c;
        kt1Var = oxVar.b;
        yxVar2 = oxVar.a;
        zi0.B(objC);
        int iIntValue = ((Number) objC).intValue();
        boolean z2 = kt1Var instanceof dw;
        int i3 = z2 ? kt1Var.a : -1;
        if (z2 && iIntValue == i3) {
            return kt1Var;
        }
        if (z) {
            dr1 dr1VarH2 = yxVar2.h();
            px pxVar = new px(yxVar2, null);
            oxVar.a = yxVar2;
            oxVar.b = null;
            oxVar.f = 2;
            objC = dr1VarH2.b(pxVar, oxVar);
            if (objC != ftVar) {
                yxVar3 = yxVar2;
                pair = (Pair) objC;
                kt1Var2 = (kt1) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yxVar3.v.o(kt1Var2);
                }
                return kt1Var2;
            }
        } else {
            dr1 dr1VarH3 = yxVar2.h();
            qx qxVar = new qx(yxVar2, i3, fsVar2, 0);
            oxVar.a = yxVar2;
            oxVar.b = null;
            oxVar.f = 3;
            objC = dr1VarH3.c(qxVar, oxVar);
            if (objC != ftVar) {
                yxVar3 = yxVar2;
                pair = (Pair) objC;
                kt1Var2 = (kt1) pair.a;
                if (((Boolean) pair.b).booleanValue()) {
                    yxVar3.v.o(kt1Var2);
                }
                return kt1Var2;
            }
        }
        return ftVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009d A[Catch: kt -> 0x005e, TryCatch #1 {kt -> 0x005e, blocks: (B:19:0x0059, B:54:0x00fc, B:24:0x0067, B:51:0x00de, B:32:0x0084, B:40:0x009d, B:42:0x00a3, B:36:0x008d, B:48:0x00cb), top: B:80:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x013d A[Catch: all -> 0x0169, TryCatch #2 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:81:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[Catch: all -> 0x0169, TRY_LEAVE, TryCatch #2 {all -> 0x0169, blocks: (B:61:0x012b, B:63:0x013d, B:64:0x0145), top: B:81:0x012b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object g(yx yxVar, boolean z, gs gsVar) {
        rx rxVar;
        Ref.ObjectRef objectRef;
        kt ktVar;
        yx yxVar2;
        boolean z2;
        Ref.ObjectRef objectRef2;
        Ref.IntRef intRef;
        kt ktVar2;
        sx sxVar;
        Object objB;
        Ref.IntRef intRef2;
        Ref.ObjectRef objectRef3;
        int iHashCode;
        Integer numA;
        yx yxVar3;
        int i;
        Object obj;
        if (gsVar instanceof rx) {
            rxVar = (rx) gsVar;
            int i2 = rxVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rxVar.w = i2 - Integer.MIN_VALUE;
            } else {
                rxVar = new rx(yxVar, gsVar);
            }
        } else {
            rxVar = new rx(yxVar, gsVar);
        }
        Object objA = rxVar.i;
        Object dwVar = ft.a;
        int i3 = 1;
        fs fsVar = null;
        try {
            switch (rxVar.w) {
                case 0:
                    zi0.B(objA);
                    if (z) {
                        rxVar.a = yxVar;
                        rxVar.e = z;
                        rxVar.w = 1;
                        objA = yxVar.j(rxVar);
                        if (objA != dwVar) {
                            if (objA != null) {
                                iHashCode = objA.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            dr1 dr1VarH = yxVar.h();
                            rxVar.a = yxVar;
                            rxVar.b = objA;
                            rxVar.e = z;
                            rxVar.f = iHashCode;
                            rxVar.w = 2;
                            numA = dr1VarH.a();
                            if (numA != dwVar) {
                                yxVar3 = yxVar;
                                i = iHashCode;
                                obj = objA;
                                objA = numA;
                                return new dw(obj, i, ((Number) objA).intValue());
                            }
                        }
                    } else {
                        dr1 dr1VarH2 = yxVar.h();
                        rxVar.a = yxVar;
                        rxVar.e = z;
                        rxVar.w = 3;
                        objA = dr1VarH2.a();
                        if (objA != dwVar) {
                            int iIntValue = ((Number) objA).intValue();
                            dr1 dr1VarH3 = yxVar.h();
                            qx qxVar = new qx(yxVar, iIntValue, fsVar, i3);
                            rxVar.a = yxVar;
                            rxVar.e = z;
                            rxVar.w = 4;
                            objA = dr1VarH3.c(qxVar, rxVar);
                            if (objA == dwVar) {
                            }
                            return (dw) objA;
                        }
                    }
                    return dwVar;
                case 1:
                    z = rxVar.e;
                    yxVar = (yx) rxVar.a;
                    zi0.B(objA);
                    if (objA != null) {
                        iHashCode = objA.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    dr1 dr1VarH4 = yxVar.h();
                    rxVar.a = yxVar;
                    rxVar.b = objA;
                    rxVar.e = z;
                    rxVar.f = iHashCode;
                    rxVar.w = 2;
                    numA = dr1VarH4.a();
                    if (numA != dwVar) {
                        yxVar3 = yxVar;
                        i = iHashCode;
                        obj = objA;
                        objA = numA;
                        return new dw(obj, i, ((Number) objA).intValue());
                    }
                    return dwVar;
                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    i = rxVar.f;
                    z = rxVar.e;
                    obj = rxVar.b;
                    yxVar3 = (yx) rxVar.a;
                    try {
                        zi0.B(objA);
                        return new dw(obj, i, ((Number) objA).intValue());
                    } catch (kt e) {
                        e = e;
                        yxVar = yxVar3;
                        objectRef = new Ref.ObjectRef();
                        wa waVar = yxVar.b;
                        rxVar.a = yxVar;
                        rxVar.b = e;
                        rxVar.c = objectRef;
                        rxVar.d = objectRef;
                        rxVar.e = z;
                        rxVar.w = 5;
                        Object objInvoke = ((ls0) waVar.b).invoke(e);
                        if (objInvoke != dwVar) {
                            ktVar = e;
                            objA = objInvoke;
                            yxVar2 = yxVar;
                            z2 = z;
                            objectRef2 = objectRef;
                            objectRef2.element = objA;
                            intRef = new Ref.IntRef();
                            try {
                                sxVar = new sx(objectRef, yxVar2, intRef, null);
                                rxVar.a = ktVar;
                                rxVar.b = objectRef;
                                rxVar.c = intRef;
                                rxVar.d = null;
                                rxVar.w = 6;
                                if (z2) {
                                    yxVar2.getClass();
                                    objB = sxVar.invoke(rxVar);
                                } else {
                                    objB = yxVar2.h().b(new rw(sxVar, fsVar, i3), rxVar);
                                }
                                if (objB != dwVar) {
                                    intRef2 = intRef;
                                    objectRef3 = objectRef;
                                    Object obj2 = objectRef3.element;
                                    dwVar = new dw(obj2, obj2 != null ? obj2.hashCode() : 0, intRef2.element);
                                }
                            } catch (Throwable th) {
                                th = th;
                                ktVar2 = ktVar;
                                a80.a(ktVar2, th);
                                throw ktVar2;
                            }
                        }
                        return dwVar;
                    }
                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    z = rxVar.e;
                    yxVar = (yx) rxVar.a;
                    zi0.B(objA);
                    int iIntValue2 = ((Number) objA).intValue();
                    dr1 dr1VarH5 = yxVar.h();
                    qx qxVar2 = new qx(yxVar, iIntValue2, fsVar, i3);
                    rxVar.a = yxVar;
                    rxVar.e = z;
                    rxVar.w = 4;
                    objA = dr1VarH5.c(qxVar2, rxVar);
                    if (objA == dwVar) {
                        return dwVar;
                    }
                    return (dw) objA;
                case oc1.LONG_FIELD_NUMBER /* 4 */:
                    boolean z3 = rxVar.e;
                    zi0.B(objA);
                    return (dw) objA;
                case oc1.STRING_FIELD_NUMBER /* 5 */:
                    z2 = rxVar.e;
                    objectRef2 = rxVar.d;
                    objectRef = (Ref.ObjectRef) rxVar.c;
                    ktVar = (kt) rxVar.b;
                    yxVar2 = (yx) rxVar.a;
                    zi0.B(objA);
                    objectRef2.element = objA;
                    intRef = new Ref.IntRef();
                    sxVar = new sx(objectRef, yxVar2, intRef, null);
                    rxVar.a = ktVar;
                    rxVar.b = objectRef;
                    rxVar.c = intRef;
                    rxVar.d = null;
                    rxVar.w = 6;
                    if (z2) {
                        yxVar2.getClass();
                        objB = sxVar.invoke(rxVar);
                    } else {
                        objB = yxVar2.h().b(new rw(sxVar, fsVar, i3), rxVar);
                    }
                    if (objB != dwVar) {
                        intRef2 = intRef;
                        objectRef3 = objectRef;
                        Object obj3 = objectRef3.element;
                        dwVar = new dw(obj3, obj3 != null ? obj3.hashCode() : 0, intRef2.element);
                    }
                    return dwVar;
                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    intRef2 = (Ref.IntRef) rxVar.c;
                    objectRef3 = (Ref.ObjectRef) rxVar.b;
                    ktVar2 = (kt) rxVar.a;
                    try {
                        zi0.B(objA);
                        Object obj4 = objectRef3.element;
                        dwVar = new dw(obj4, obj4 != null ? obj4.hashCode() : 0, intRef2.element);
                        return dwVar;
                    } catch (Throwable th2) {
                        th = th2;
                        a80.a(ktVar2, th);
                        throw ktVar2;
                    }
                default:
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (kt e2) {
            e = e2;
        }
    }

    @Override // defpackage.yw
    public final Object a(Function2 function2, mv1 mv1Var) {
        k32 k32Var = (k32) mv1Var.getContext().get(ba0.w);
        if (k32Var != null) {
            k32Var.a(this);
        }
        return qt.E(new k32(k32Var, this), new ol(this, function2, null, 2), mv1Var);
    }

    @Override // defpackage.yw
    public final gd0 f() {
        return this.d;
    }

    public final dr1 h() {
        return (dr1) this.X.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        if (r2.j(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.gs r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.nx
            if (r0 == 0) goto L13
            r0 = r7
            nx r0 = (defpackage.nx) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            nx r0 = new nx
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            ft r1 = defpackage.ft.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            int r6 = r0.b
            yx r0 = r0.a
            defpackage.zi0.B(r7)     // Catch: java.lang.Throwable -> L2e
            goto L64
        L2e:
            r7 = move-exception
            goto L6c
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r6)
            r6 = 0
            return r6
        L37:
            yx r6 = r0.a
            defpackage.zi0.B(r7)
            goto L4f
        L3d:
            defpackage.zi0.B(r7)
            dr1 r7 = r6.h()
            r0.a = r6
            r0.e = r4
            java.lang.Integer r7 = r7.a()
            if (r7 != r1) goto L4f
            goto L63
        L4f:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ud2 r2 = r6.w     // Catch: java.lang.Throwable -> L67
            r0.a = r6     // Catch: java.lang.Throwable -> L67
            r0.b = r7     // Catch: java.lang.Throwable -> L67
            r0.e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r2.j(r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L67:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6c:
            wa r0 = r0.v
            jf1 r1 = new jf1
            r1.<init>(r6, r7)
            r0.o(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx.i(gs):java.lang.Object");
    }

    public final Object j(gs gsVar) {
        return ((gb0) this.W.getValue()).a(new hx(3, (fs) null), gsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Object obj, boolean z, gs gsVar) {
        wx wxVar;
        Ref.IntRef intRef;
        if (gsVar instanceof wx) {
            wxVar = (wx) gsVar;
            int i = wxVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wxVar.d = i - Integer.MIN_VALUE;
            } else {
                wxVar = new wx(this, gsVar);
            }
        } else {
            wxVar = new wx(this, gsVar);
        }
        Object obj2 = wxVar.b;
        ft ftVar = ft.a;
        int i2 = wxVar.d;
        if (i2 == 0) {
            zi0.B(obj2);
            Ref.IntRef intRef2 = new Ref.IntRef();
            gb0 gb0Var = (gb0) this.W.getValue();
            xx xxVar = new xx(intRef2, this, obj, z, null);
            wxVar.a = intRef2;
            wxVar.d = 1;
            if (gb0Var.b(xxVar, wxVar) == ftVar) {
                return ftVar;
            }
            intRef = intRef2;
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            intRef = wxVar.a;
            zi0.B(obj2);
        }
        return new Integer(intRef.element);
    }
}
