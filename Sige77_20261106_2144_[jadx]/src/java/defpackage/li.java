package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class li implements s72 {
    public Object a = oi.p;
    public pk b;
    public final /* synthetic */ mi c;

    public li(mi miVar) {
        this.c = miVar;
    }

    @Override // defpackage.s72
    public final void a(zn1 zn1Var, int i) {
        pk pkVar = this.b;
        if (pkVar != null) {
            pkVar.a(zn1Var, i);
        }
    }

    public final Object b(jd0 jd0Var) throws Throwable {
        ul ulVar;
        ul ulVar2;
        Object obj = this.a;
        boolean z = true;
        if (obj == oi.p || obj == oi.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mi.i;
            mi miVar = this.c;
            ul ulVar3 = (ul) atomicReferenceFieldUpdater.get(miVar);
            while (!miVar.v(mi.b.get(miVar), true)) {
                long andIncrement = mi.c.getAndIncrement(miVar);
                long j = oi.b;
                long j2 = andIncrement / j;
                int i = (int) (andIncrement % j);
                if (ulVar3.e != j2) {
                    ul ulVarM = miVar.m(j2, ulVar3);
                    if (ulVarM == null) {
                        continue;
                    } else {
                        ulVar = ulVarM;
                    }
                } else {
                    ulVar = ulVar3;
                }
                Object objH = miVar.H(ulVar, i, andIncrement, null);
                vy2 vy2Var = oi.m;
                if (objH == vy2Var) {
                    uq1.q("unreachable");
                    return null;
                }
                vy2 vy2Var2 = oi.o;
                if (objH == vy2Var2) {
                    if (andIncrement < miVar.r()) {
                        ulVar.b();
                    }
                    ulVar3 = ulVar;
                } else {
                    if (objH == oi.n) {
                        pk pkVarU = aj0.u(sr0.b(jd0Var));
                        try {
                            this.b = pkVarU;
                            Object objH2 = miVar.H(ulVar, i, andIncrement, this);
                            if (objH2 == vy2Var) {
                                a(ulVar, i);
                            } else {
                                if (objH2 == vy2Var2) {
                                    if (andIncrement < miVar.r()) {
                                        ulVar.b();
                                    }
                                    ul ulVar4 = (ul) mi.i.get(miVar);
                                    while (true) {
                                        if (miVar.v(mi.b.get(miVar), true)) {
                                            pk pkVar = this.b;
                                            pkVar.getClass();
                                            this.b = null;
                                            this.a = oi.l;
                                            Throwable thO = miVar.o();
                                            if (thO == null) {
                                                pj1 pj1Var = rj1.b;
                                                pkVar.resumeWith(Boolean.FALSE);
                                            } else {
                                                pj1 pj1Var2 = rj1.b;
                                                pkVar.resumeWith(new qj1(thO));
                                            }
                                        } else {
                                            long andIncrement2 = mi.c.getAndIncrement(miVar);
                                            long j3 = oi.b;
                                            long j4 = andIncrement2 / j3;
                                            int i2 = (int) (andIncrement2 % j3);
                                            if (ulVar4.e != j4) {
                                                ul ulVarM2 = miVar.m(j4, ulVar4);
                                                if (ulVarM2 != null) {
                                                    ulVar2 = ulVarM2;
                                                }
                                            } else {
                                                ulVar2 = ulVar4;
                                            }
                                            Object objH3 = miVar.H(ulVar2, i2, andIncrement2, this);
                                            ul ulVar5 = ulVar2;
                                            if (objH3 == oi.m) {
                                                a(ulVar5, i2);
                                            } else {
                                                if (objH3 != oi.o) {
                                                    if (objH3 == oi.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    ulVar5.b();
                                                    this.a = objH3;
                                                    this.b = null;
                                                    break;
                                                }
                                                if (andIncrement2 < miVar.r()) {
                                                    ulVar5.b();
                                                }
                                                ulVar4 = ulVar5;
                                            }
                                        }
                                    }
                                } else {
                                    ulVar.b();
                                    this.a = objH2;
                                    this.b = null;
                                }
                                pkVarU.c(Boolean.TRUE, null);
                            }
                            Object objS = pkVarU.s();
                            ft ftVar = ft.a;
                            return objS;
                        } catch (Throwable th) {
                            pkVarU.B();
                            throw th;
                        }
                    }
                    ulVar.b();
                    this.a = objH;
                }
            }
            this.a = oi.l;
            Throwable thO2 = miVar.o();
            if (thO2 != null) {
                int i3 = at1.a;
                throw thO2;
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
