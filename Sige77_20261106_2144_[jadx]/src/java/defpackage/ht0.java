package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ht0 extends mj1 implements Function2 {
    public sz0 b;
    public im c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ lt0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(fs fsVar, lt0 lt0Var) {
        super(fsVar);
        this.f = lt0Var;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        ht0 ht0Var = new ht0(fsVar, this.f);
        ht0Var.e = obj;
        return ht0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ht0) create((oo1) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:25:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        */
    @Override // defpackage.ze
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            ft r0 = defpackage.ft.a
            int r1 = r5.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L18
            im r1 = r5.c
            sz0 r3 = r5.b
            java.lang.Object r4 = r5.e
            oo1 r4 = (defpackage.oo1) r4
            defpackage.zi0.B(r6)
            goto L73
        L18:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r5)
            r5 = 0
            return r5
        L1f:
            defpackage.zi0.B(r6)
            goto L78
        L23:
            defpackage.zi0.B(r6)
            java.lang.Object r6 = r5.e
            oo1 r6 = (defpackage.oo1) r6
            lt0 r1 = r5.f
            java.lang.Object r1 = r1.x()
            boolean r4 = r1 instanceof defpackage.im
            if (r4 == 0) goto L3e
            im r1 = (defpackage.im) r1
            km r1 = r1.v
            r5.d = r3
            r6.a(r1, r5)
            return r0
        L3e:
            boolean r3 = r1 instanceof defpackage.up0
            if (r3 == 0) goto L78
            up0 r1 = (defpackage.up0) r1
            f71 r1 = r1.c()
            if (r1 == 0) goto L78
            java.lang.Object r3 = r1.j()
            r3.getClass()
            uz0 r3 = (defpackage.uz0) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L57:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r6 != 0) goto L78
            boolean r6 = r1 instanceof defpackage.im
            if (r6 == 0) goto L73
            im r1 = (defpackage.im) r1
            km r6 = r1.v
            r5.e = r4
            r5.b = r3
            r5.c = r1
            r5.d = r2
            r4.a(r6, r5)
            ft r5 = defpackage.ft.a
            return r0
        L73:
            uz0 r1 = r1.k()
            goto L57
        L78:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
