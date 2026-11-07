package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ex extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex(yx yxVar, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.c = yxVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        yx yxVar = this.c;
        switch (i) {
            case 0:
                return new ex(yxVar, fsVar, 0);
            case 1:
                return new ex(yxVar, fsVar, 1);
            default:
                return new ex(yxVar, fsVar, 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((ex) create((id0) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ex) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ex) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r10 == r7) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a9, code lost:
    
        if (r10.A(r1, r9) == r0) goto L44;
     */
    @Override // defpackage.ze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
