package defpackage;

import android.net.Uri;
import android.view.InputEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ol extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol(Object obj, Object obj2, Object obj3, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ol olVar = new ol((id0) this.d, (ql) obj2, fsVar, 0);
                olVar.c = obj;
                return olVar;
            case 1:
                ol olVar2 = new ol((yx) obj2, fsVar);
                olVar2.c = obj;
                return olVar2;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ol olVar3 = new ol((yx) this.d, (Function2) obj2, fsVar, 2);
                olVar3.c = obj;
                return olVar3;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new ol((ns0) this.c, (fc1) this.d, (Long) obj2, fsVar, 3);
            default:
                return new ol((v21) this.c, (Uri) this.d, (InputEvent) obj2, fsVar, 4);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((ol) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((ol) create((id0) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return ((ol) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((ol) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((ol) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x019e  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a7, code lost:
    
        if (r12 == r0) goto L77;
     */
    @Override // defpackage.ze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ol.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol(Object obj, Object obj2, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(yx yxVar, fs fsVar) {
        super(2, fsVar);
        this.a = 1;
        this.e = yxVar;
    }
}
