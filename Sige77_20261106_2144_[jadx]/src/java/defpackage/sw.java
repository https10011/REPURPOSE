package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sw extends mv1 implements Function2 {
    public Iterator a;
    public gq1 b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ List f;
    public final /* synthetic */ ArrayList i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(List list, ArrayList arrayList, fs fsVar) {
        super(2, fsVar);
        this.f = list;
        this.i = arrayList;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        sw swVar = new sw(this.f, this.i, fsVar);
        swVar.e = obj;
        return swVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sw) create(obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x009c  */
    /* JADX WARN: Code duplicated, block: B:23:0x009e  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:52)
        	at jadx.core.utils.ErrorsCounter.error(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        */
    @Override // defpackage.ze
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            ft r0 = defpackage.ft.a
            int r1 = r11.d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L32
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.util.Iterator r1 = r11.a
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r5 = r11.e
            java.util.List r5 = (java.util.List) r5
            defpackage.zi0.B(r12)
            goto L41
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.uq1.q(r11)
            return r4
        L1f:
            java.lang.Object r1 = r11.c
            gq1 r5 = r11.b
            java.util.Iterator r6 = r11.a
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.e
            java.util.List r7 = (java.util.List) r7
            defpackage.zi0.B(r12)
            r10 = r7
            r7 = r5
            r5 = r10
            goto L66
        L32:
            defpackage.zi0.B(r12)
            java.lang.Object r12 = r11.e
            java.util.List r1 = r11.f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r5 = r11.i
        L41:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto La0
            java.lang.Object r6 = r1.next()
            gq1 r6 = (defpackage.gq1) r6
            r11.e = r5
            r7 = r1
            java.util.Iterator r7 = (java.util.Iterator) r7
            r11.a = r7
            r11.b = r6
            r11.c = r12
            r11.d = r3
            java.lang.Object r7 = r6.a(r12, r11)
            if (r7 != r0) goto L61
            goto L9b
        L61:
            r10 = r1
            r1 = r12
            r12 = r7
            r7 = r6
            r6 = r10
        L66:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            rw r12 = new rw
            r8 = 0
            r12.<init>(r7, r4, r8)
            r5.add(r12)
            r11.e = r5
            r12 = r6
            java.util.Iterator r12 = (java.util.Iterator) r12
            r11.a = r12
            r11.b = r4
            r11.c = r4
            r11.d = r2
            hq1 r12 = r7.b
            lq1 r8 = new lq1
            uv1 r9 = r7.e
            java.lang.Object r9 = r9.getValue()
            android.content.SharedPreferences r9 = (android.content.SharedPreferences) r9
            java.util.LinkedHashSet r7 = r7.f
            r8.<init>(r9, r7)
            java.lang.Object r12 = r12.invoke(r8, r1, r11)
            if (r12 != r0) goto L9c
        L9b:
            return r0
        L9c:
            r1 = r6
            goto L41
        L9e:
            r12 = r1
            goto L9c
        La0:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
