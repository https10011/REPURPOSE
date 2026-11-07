package defpackage;

import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qd0 implements id0 {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ id0 b;
    public final /* synthetic */ gx c;

    public qd0(Ref.BooleanRef booleanRef, id0 id0Var, gx gxVar) {
        this.a = booleanRef;
        this.b = id0Var;
        this.c = gxVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r7.b.a(r8, r0) == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        if (r7.a(r8, r0) == r1) goto L32;
     */
    @Override // defpackage.id0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r8, defpackage.fs r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pd0
            if (r0 == 0) goto L13
            r0 = r9
            pd0 r0 = (defpackage.pd0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pd0 r0 = new pd0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ft r1 = defpackage.ft.a
            int r2 = r0.e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L40
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.zi0.B(r9)
            goto L81
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r7)
            return r3
        L34:
            java.lang.Object r8 = r0.b
            qd0 r7 = r0.a
            defpackage.zi0.B(r9)
            goto L66
        L3c:
            defpackage.zi0.B(r9)
            goto L54
        L40:
            defpackage.zi0.B(r9)
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.a
            boolean r9 = r9.element
            if (r9 == 0) goto L57
            r0.e = r6
            id0 r7 = r7.b
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L54
            goto L80
        L54:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L57:
            r0.a = r7
            r0.b = r8
            r0.e = r5
            gx r9 = r7.c
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L66
            goto L80
        L66:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L84
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.a
            r9.element = r6
            id0 r7 = r7.b
            r0.a = r3
            r0.b = r3
            r0.e = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L81
        L80:
            return r1
        L81:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L84:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qd0.a(java.lang.Object, fs):java.lang.Object");
    }
}
