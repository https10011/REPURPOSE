package defpackage;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qp3 implements np3, nq3 {
    public static final String i = new String();
    public final Level a;
    public final long b;
    public bq3 c;
    public iq3 d;
    public vq3 e;
    public mj2 f;
    public Object[] g;
    public final /* synthetic */ wa h;

    public qp3(wa waVar, Level level) {
        Objects.requireNonNull(waVar);
        this.h = waVar;
        jj2.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        qt.J(level, "level");
        this.a = level;
        this.b = nanos;
    }

    @Override // defpackage.nq3
    public final nq3 a(Throwable th) {
        pq3 pq3Var = aq3.a;
        qt.J(pq3Var, "metadata key");
        if (th != null) {
            d(pq3Var, th);
        }
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [vq3] */
    /* JADX WARN: Type inference failed for: r10v22, types: [yq3] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r18v0, types: [qp3] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [vq3] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24, types: [vq3] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    @Override // defpackage.nq3
    public final void b(String str, Object[] objArr) {
        boolean z;
        bq3 bq3Var;
        StackTraceElement[] stackTraceElementArr;
        int iU;
        int i2;
        gp3 gp3Var;
        ?? sq3Var;
        ?? r10;
        qq3 qq3Var;
        iq3 iq3Var = this.d;
        fq3 fq3Var = iq3.a;
        if (iq3Var == null) {
            ((oj2) jj2.a).getClass();
            oj2.b.getClass();
            this.d = fq3Var;
        }
        kq3 ar3Var = this.d;
        if (ar3Var != fq3Var) {
            bq3 bq3Var2 = this.c;
            if (bq3Var2 != null && bq3Var2.k > 0) {
                qt.J(ar3Var, "logSiteKey");
                int i3 = bq3Var2.k;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (aq3.f.equals(bq3Var2.M(i4))) {
                        ar3Var = new ar3(ar3Var, bq3Var2.N(i4));
                    }
                }
            }
        } else {
            ar3Var = null;
        }
        g93 g93VarC = c();
        int iJ = g93VarC.J();
        for (int i5 = 0; i5 < iJ; i5++) {
            if (g93VarC.M(i5).a == "eye3tag") {
                if (g93VarC.Q(aq3.a) != null) {
                    break;
                }
                pq3 pq3Var = aq3.i;
                if (g93VarC.Q(pq3Var) != null) {
                    break;
                }
                d(pq3Var, br3.SMALL);
                break;
            }
        }
        bq3 bq3Var3 = this.c;
        int i6 = -1;
        qq3 qq3Var2 = vq3.a;
        if (bq3Var3 != null) {
            if (ar3Var != null) {
                int i7 = lp3.d;
                if (bq3Var3.Q(aq3.d) != null) {
                    ur.a();
                    return;
                }
                bq3 bq3Var4 = this.c;
                fp3 fp3Var = gp3.d;
                Integer num = (Integer) bq3Var4.Q(aq3.b);
                if (num == null) {
                    sq3Var = 0;
                } else {
                    gp3Var = (gp3) gp3.d.u(ar3Var, bq3Var4);
                    if (gp3Var.c.incrementAndGet() < num.intValue()) {
                        sq3Var = gp3Var;
                        sq3Var = qq3Var2;
                    }
                }
                sq3Var = gp3Var;
                bq3 bq3Var5 = this.c;
                fp3 fp3Var2 = yq3.d;
                Integer num2 = (Integer) bq3Var5.Q(aq3.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r10 = 0;
                } else {
                    r10 = (yq3) yq3.d.u(ar3Var, bq3Var5);
                    int iNextInt = ((Random) yq3.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r10.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r10 = qq3Var2;
                    }
                }
                if (sq3Var == 0) {
                    sq3Var = r10;
                } else if (r10 != 0 && sq3Var != qq3Var2 && r10 != (qq3Var = vq3.b)) {
                    if (r10 == qq3Var2 || sq3Var == qq3Var) {
                        sq3Var = r10;
                    } else {
                        sq3Var = new sq3(sq3Var, r10);
                    }
                }
                this.e = sq3Var;
                z = sq3Var != qq3Var2;
            }
            bq3 bq3Var6 = this.c;
            pq3 pq3Var2 = aq3.i;
            br3 br3Var = (br3) bq3Var6.Q(pq3Var2);
            if (br3Var != null) {
                bq3 bq3Var7 = this.c;
                if (bq3Var7 != null && (iU = bq3Var7.U(pq3Var2)) >= 0) {
                    int i8 = iU + iU;
                    int i9 = i8 + 2;
                    while (true) {
                        i2 = bq3Var7.k;
                        if (i9 >= i2 + i2) {
                            break;
                        }
                        Object obj = bq3Var7.j[i9];
                        if (!obj.equals(pq3Var2)) {
                            Object[] objArr2 = bq3Var7.j;
                            objArr2[i8] = obj;
                            objArr2[i8 + 1] = objArr2[i9 + 1];
                            i8 += 2;
                        }
                        i9 += 2;
                    }
                    bq3Var7.k = i2 - ((i9 - i8) >> 1);
                    while (i8 < i9) {
                        bq3Var7.j[i8] = null;
                        i8++;
                    }
                }
                g93 g93VarC2 = c();
                pq3 pq3Var3 = aq3.a;
                Throwable th = (Throwable) g93VarC2.Q(pq3Var3);
                int i10 = br3Var.a;
                String[] strArr = lk2.a;
                if (i10 <= 0 && i10 != -1) {
                    e.g("invalid maximum depth: 0");
                    return;
                }
                lk2.b.getClass();
                if (!(i10 == -1 || i10 > 0)) {
                    e.g("maxDepth must be > 0 or -1");
                    return;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = qp3.class.getName();
                int i11 = 3;
                boolean z2 = false;
                while (true) {
                    if (i11 >= stackTrace.length) {
                        i11 = -1;
                        break;
                    }
                    if (!stackTrace[i11].getClassName().equals(name)) {
                        if (z2) {
                            break;
                        }
                    } else {
                        z2 = true;
                    }
                    i11++;
                }
                if (i11 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i11;
                    if (i10 <= 0 || i10 >= length) {
                        i10 = length;
                    }
                    stackTraceElementArr = new StackTraceElement[i10];
                    System.arraycopy(stackTrace, i11, stackTraceElementArr, 0, i10);
                }
                mq3 mq3Var = new mq3(br3Var.toString(), th);
                mq3Var.setStackTrace(stackTraceElementArr);
                d(pq3Var3, mq3Var);
            }
        }
        vq3 vq3Var = this.e;
        if (vq3Var != null) {
            uq3 uq3Var = (uq3) uq3.c.u(ar3Var, this.c);
            AtomicInteger atomicInteger2 = uq3Var.b;
            AtomicBoolean atomicBoolean = uq3Var.a;
            int iIncrementAndGet = atomicInteger2.incrementAndGet();
            if (vq3Var != qq3Var2 && atomicBoolean.compareAndSet(false, true)) {
                try {
                    vq3Var.a();
                    atomicBoolean.set(false);
                    atomicInteger2.addAndGet(-iIncrementAndGet);
                    i6 = (-1) + iIncrementAndGet;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    throw th2;
                }
            }
            if (z && i6 > 0 && (bq3Var = this.c) != null) {
                bq3Var.T(aq3.e, Integer.valueOf(i6));
            }
            z &= i6 >= 0;
        }
        if (z) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (Object obj2 : objArrCopyOf) {
            }
            if (str != i) {
                jk2 jk2Var = jk2.b;
                this.f = new mj2(str);
            }
            ((oj2) jj2.a).getClass();
            ek2 ek2VarB = tj2.b.b();
            if (!ek2VarB.a.isEmpty()) {
                g93 g93VarC3 = c();
                wp3 wp3Var = aq3.h;
                ek2 ek2Var = (ek2) g93VarC3.Q(wp3Var);
                if (ek2Var != null) {
                    dk2 dk2Var = ek2Var.a;
                    if (!dk2Var.isEmpty()) {
                        dk2 dk2Var2 = ek2VarB.a;
                        if (!dk2Var2.isEmpty()) {
                            ek2Var = new ek2(new dk2(dk2Var2, dk2Var));
                        }
                        ek2VarB = ek2Var;
                    }
                }
                d(wp3Var, ek2VarB);
            }
            lo2 lo2Var = (lo2) this.h.b;
            try {
                mk2 mk2Var = (mk2) mk2.b.get();
                int i12 = mk2Var.a + 1;
                mk2Var.a = i12;
                if (i12 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i12 <= 100) {
                        lo2Var.y(this);
                    } else {
                        wa.q("unbounded recursion in log statement", this);
                    }
                    mk2Var.close();
                } catch (Throwable th3) {
                    try {
                        mk2Var.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (RuntimeException e) {
                try {
                    lo2Var.A(e, this);
                } catch (RuntimeException e2) {
                    String name2 = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name2.length() + 2 + String.valueOf(message).length());
                    sb.append(name2);
                    sb.append(": ");
                    sb.append(message);
                    wa.q(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public final g93 c() {
        bq3 bq3Var = this.c;
        return bq3Var != null ? bq3Var : nr3.j;
    }

    public final void d(pq3 pq3Var, Object obj) {
        if (this.c == null) {
            bq3 bq3Var = new bq3();
            bq3Var.j = new Object[8];
            bq3Var.k = 0;
            this.c = bq3Var;
        }
        this.c.T(pq3Var, obj);
    }

    @Override // defpackage.nq3
    public final nq3 zzn() {
        gq3 gq3Var = new gq3();
        gq3Var.b = 0;
        if (this.d == null) {
            this.d = gq3Var;
        }
        return this;
    }
}
