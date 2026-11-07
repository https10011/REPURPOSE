package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tx extends mv1 implements Function1 {
    public Object a;
    public int b;
    public final /* synthetic */ yx c;
    public final /* synthetic */ CoroutineContext d;
    public final /* synthetic */ Function2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx(yx yxVar, CoroutineContext coroutineContext, Function2 function2, fs fsVar) {
        super(1, fsVar);
        this.c = yxVar;
        this.d = coroutineContext;
        this.e = function2;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new tx(this.c, this.d, this.e, fsVar);
    }

    public final Object invoke(Object obj) {
        return ((tx) create((fs) obj)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws Throwable {
        dw dwVar;
        Object obj2;
        int iHashCode;
        ft ftVar = ft.a;
        int i = this.b;
        fs fsVar = null;
        yx yxVar = this.c;
        int i2 = 1;
        if (i == 0) {
            zi0.B(obj);
            this.b = 1;
            obj = yx.g(yxVar, true, this);
            if (obj != ftVar) {
            }
            return ftVar;
        }
        if (i == 1) {
            zi0.B(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Object obj3 = this.a;
                zi0.B(obj);
                return obj3;
            }
            dwVar = (dw) this.a;
            zi0.B(obj);
        }
        obj2 = dwVar.b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == dwVar.c) {
            uq1.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (!Intrinsics.areEqual(dwVar.b, obj)) {
            this.a = obj;
            this.b = 3;
            if (yxVar.k(obj, true, this) == ftVar) {
                return ftVar;
            }
        }
        return obj;
        dwVar = (dw) obj;
        pw pwVar = new pw(this.e, dwVar, fsVar, i2);
        this.a = dwVar;
        this.b = 2;
        obj = qt.E(this.d, pwVar, this);
        if (obj != ftVar) {
            obj2 = dwVar.b;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            if (iHashCode == dwVar.c) {
                uq1.q("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                return null;
            }
            if (!Intrinsics.areEqual(dwVar.b, obj)) {
                this.a = obj;
                this.b = 3;
                if (yxVar.k(obj, true, this) == ftVar) {
                }
            }
            return obj;
        }
        return ftVar;
    }
}
