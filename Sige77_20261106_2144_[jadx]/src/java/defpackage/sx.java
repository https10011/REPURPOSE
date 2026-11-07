package defpackage;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sx extends mv1 implements Function1 {
    public Serializable a;
    public int b;
    public final /* synthetic */ Ref.ObjectRef c;
    public final /* synthetic */ yx d;
    public final /* synthetic */ Ref.IntRef e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx(Ref.ObjectRef objectRef, yx yxVar, Ref.IntRef intRef, fs fsVar) {
        super(1, fsVar);
        this.c = objectRef;
        this.d = yxVar;
        this.e = intRef;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new sx(this.c, this.d, this.e, fsVar);
    }

    public final Object invoke(Object obj) {
        return ((sx) create((fs) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r9 == r0) goto L29;
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
            kotlin.jvm.internal.Ref$IntRef r2 = r8.e
            kotlin.jvm.internal.Ref$ObjectRef r3 = r8.c
            r4 = 3
            r5 = 2
            yx r6 = r8.d
            r7 = 1
            if (r1 == 0) goto L35
            if (r1 == r7) goto L2d
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1e
            java.io.Serializable r8 = r8.a
            r2 = r8
            kotlin.jvm.internal.Ref$IntRef r2 = (kotlin.jvm.internal.Ref.IntRef) r2
            defpackage.zi0.B(r9)
            goto L6c
        L1e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r8)
            r8 = 0
            return r8
        L25:
            java.io.Serializable r1 = r8.a
            kotlin.jvm.internal.Ref$IntRef r1 = (kotlin.jvm.internal.Ref.IntRef) r1
            defpackage.zi0.B(r9)     // Catch: defpackage.kt -> L5f
            goto L56
        L2d:
            java.io.Serializable r1 = r8.a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            defpackage.zi0.B(r9)     // Catch: defpackage.kt -> L5f
            goto L44
        L35:
            defpackage.zi0.B(r9)
            r8.a = r3     // Catch: defpackage.kt -> L5f
            r8.b = r7     // Catch: defpackage.kt -> L5f
            java.lang.Object r9 = r6.j(r8)     // Catch: defpackage.kt -> L5f
            if (r9 != r0) goto L43
            goto L6b
        L43:
            r1 = r3
        L44:
            r1.element = r9     // Catch: defpackage.kt -> L5f
            dr1 r9 = r6.h()     // Catch: defpackage.kt -> L5f
            r8.a = r2     // Catch: defpackage.kt -> L5f
            r8.b = r5     // Catch: defpackage.kt -> L5f
            java.lang.Integer r9 = r9.a()     // Catch: defpackage.kt -> L5f
            if (r9 != r0) goto L55
            goto L6b
        L55:
            r1 = r2
        L56:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: defpackage.kt -> L5f
            int r9 = r9.intValue()     // Catch: defpackage.kt -> L5f
            r1.element = r9     // Catch: defpackage.kt -> L5f
            goto L74
        L5f:
            java.lang.Object r9 = r3.element
            r8.a = r2
            r8.b = r4
            java.lang.Object r9 = r6.k(r9, r7, r8)
            if (r9 != r0) goto L6c
        L6b:
            return r0
        L6c:
            java.lang.Number r9 = (java.lang.Number) r9
            int r8 = r9.intValue()
            r2.element = r8
        L74:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
