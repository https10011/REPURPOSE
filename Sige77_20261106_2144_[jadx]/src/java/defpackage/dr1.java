package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dr1 {
    public final h61 a = new h61();
    public final wa b = new wa(5);
    public final kj0 c = new kj0(new cr1(2, null), 19);

    public dr1(String str) {
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.b).get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [dr1] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v6, types: [h61] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r7, defpackage.gs r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ar1
            if (r0 == 0) goto L13
            r0 = r8
            ar1 r0 = (defpackage.ar1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ar1 r0 = new ar1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            ft r1 = defpackage.ft.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r6 = r0.a
            f61 r6 = (defpackage.f61) r6
            defpackage.zi0.B(r8)     // Catch: java.lang.Throwable -> L2f
            goto L60
        L2f:
            r7 = move-exception
            goto L66
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r6)
            return r5
        L37:
            h61 r6 = r0.b
            java.lang.Object r7 = r0.a
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            defpackage.zi0.B(r8)
            goto L53
        L41:
            defpackage.zi0.B(r8)
            r0.a = r7
            h61 r6 = r6.a
            r0.b = r6
            r0.e = r4
            java.lang.Object r8 = r6.d(r0)
            if (r8 != r1) goto L53
            goto L5f
        L53:
            r0.a = r6     // Catch: java.lang.Throwable -> L2f
            r0.b = r5     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            h61 r6 = (defpackage.h61) r6
            r6.g(r5)
            return r8
        L66:
            h61 r6 = (defpackage.h61) r6
            r6.g(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr1.b(kotlin.jvm.functions.Function1, gs):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Function2 function2, gs gsVar) throws Throwable {
        br1 br1Var;
        h61 h61Var;
        boolean z;
        Throwable th;
        if (gsVar instanceof br1) {
            br1Var = (br1) gsVar;
            int i = br1Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                br1Var.e = i - Integer.MIN_VALUE;
            } else {
                br1Var = new br1(this, gsVar);
            }
        } else {
            br1Var = new br1(this, gsVar);
        }
        Object obj = br1Var.c;
        ft ftVar = ft.a;
        int i2 = br1Var.e;
        if (i2 != 0) {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = br1Var.b;
            h61Var = br1Var.a;
            try {
                zi0.B(obj);
                if (z) {
                    h61Var.g(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    h61Var.g(null);
                }
                throw th;
            }
        }
        zi0.B(obj);
        h61 h61Var2 = this.a;
        boolean zE = h61Var2.e();
        try {
            Boolean boolValueOf = Boolean.valueOf(zE);
            br1Var.a = h61Var2;
            br1Var.b = zE;
            br1Var.e = 1;
            Object objInvoke = function2.invoke(boolValueOf, br1Var);
            if (objInvoke == ftVar) {
                return ftVar;
            }
            h61Var = h61Var2;
            z = zE;
            obj = objInvoke;
            if (z) {
                h61Var.g(null);
            }
            return obj;
        } catch (Throwable th3) {
            h61Var = h61Var2;
            z = zE;
            th = th3;
            if (z) {
                h61Var.g(null);
            }
            throw th;
        }
    }
}
