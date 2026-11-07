package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gx extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx(r91 r91Var, nx0 nx0Var, fs fsVar) {
        super(2, fsVar);
        this.a = 3;
        this.b = r91Var;
        this.c = nx0Var;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                gx gxVar = new gx((kt1) obj2, fsVar, 0);
                gxVar.b = obj;
                return gxVar;
            case 1:
                gx gxVar2 = new gx((Function1) obj2, fsVar, 1);
                gxVar2.b = obj;
                return gxVar2;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                gx gxVar3 = new gx((x21) obj2, fsVar, 2);
                gxVar3.b = obj;
                return gxVar3;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new gx((r91) this.b, (nx0) obj2, fsVar);
            default:
                gx gxVar4 = new gx((Set) obj2, fsVar, 4);
                gxVar4.b = obj;
                return gxVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((gx) create((kt1) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case 1:
                return ((gx) create((d61) obj, (fs) obj2)).invokeSuspend(Unit.a);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((gx) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
                throw null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return ((gx) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((gx) create((d61) obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = true;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ft ftVar = ft.a;
                zi0.B(obj);
                kt1 kt1Var = (kt1) this.b;
                return Boolean.valueOf((kt1Var instanceof dw) && kt1Var.a <= ((kt1) obj2).a);
            case 1:
                ft ftVar2 = ft.a;
                zi0.B(obj);
                ((Function1) obj2).invoke((d61) this.b);
                return Unit.a;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ft ftVar3 = ft.a;
                zi0.B(obj);
                throw null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ft ftVar4 = ft.a;
                zi0.B(obj);
                return ((r91) this.b).e.b((nx0) obj2);
            default:
                ft ftVar5 = ft.a;
                zi0.B(obj);
                Set setKeySet = ((d61) this.b).a().keySet();
                ArrayList arrayList = new ArrayList(ko.h(setKeySet));
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    arrayList.add(((fc1) it.next()).a);
                }
                Set set = (Set) obj2;
                if (set != iq1.a) {
                    if (set == null || !set.isEmpty()) {
                        Iterator it2 = set.iterator();
                        while (it2.hasNext()) {
                            if (!arrayList.contains((String) it2.next())) {
                            }
                        }
                        z = false;
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gx(Object obj, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.c = obj;
    }
}
