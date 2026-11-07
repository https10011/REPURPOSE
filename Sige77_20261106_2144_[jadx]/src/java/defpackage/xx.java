package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xx extends mv1 implements Function2 {
    public Ref.IntRef a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Ref.IntRef d;
    public final /* synthetic */ yx e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(Ref.IntRef intRef, yx yxVar, Object obj, boolean z, fs fsVar) {
        super(2, fsVar);
        this.d = intRef;
        this.e = yxVar;
        this.f = obj;
        this.i = z;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        xx xxVar = new xx(this.d, this.e, this.f, this.i, fsVar);
        xxVar.c = obj;
        return xxVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xx) create((qb0) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        if (r7.b(r3, r8) == r0) goto L16;
     */
    @Override // defpackage.ze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            ft r0 = defpackage.ft.a
            int r1 = r8.b
            r2 = 0
            java.lang.Object r3 = r8.f
            yx r4 = r8.e
            kotlin.jvm.internal.Ref$IntRef r5 = r8.d
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L27
            if (r1 == r7) goto L1d
            if (r1 != r6) goto L17
            defpackage.zi0.B(r9)
            goto L63
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r8)
            return r2
        L1d:
            kotlin.jvm.internal.Ref$IntRef r1 = r8.a
            java.lang.Object r7 = r8.c
            qb0 r7 = (defpackage.qb0) r7
            defpackage.zi0.B(r9)
            goto L4e
        L27:
            defpackage.zi0.B(r9)
            java.lang.Object r9 = r8.c
            qb0 r9 = (defpackage.qb0) r9
            dr1 r1 = r4.h()
            r8.c = r9
            r8.a = r5
            r8.b = r7
            wa r1 = r1.b
            java.lang.Object r1 = r1.b
            java.util.concurrent.atomic.AtomicInteger r1 = (java.util.concurrent.atomic.AtomicInteger) r1
            int r1 = r1.incrementAndGet()
            java.lang.Integer r7 = new java.lang.Integer
            r7.<init>(r1)
            if (r7 != r0) goto L4a
            goto L62
        L4a:
            r1 = r7
            r7 = r9
            r9 = r1
            r1 = r5
        L4e:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.element = r9
            r8.c = r2
            r8.a = r2
            r8.b = r6
            java.lang.Object r9 = r7.b(r3, r8)
            if (r9 != r0) goto L63
        L62:
            return r0
        L63:
            boolean r8 = r8.i
            if (r8 == 0) goto L7b
            wa r8 = r4.v
            dw r9 = new dw
            if (r3 == 0) goto L72
            int r0 = r3.hashCode()
            goto L73
        L72:
            r0 = 0
        L73:
            int r1 = r5.element
            r9.<init>(r3, r0, r1)
            r8.o(r9)
        L7b:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
