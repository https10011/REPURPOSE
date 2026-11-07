package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ql implements ah0 {
    public final CoroutineContext a;
    public final int b;
    public final ki c;
    public final gd0 d;

    public ql(gd0 gd0Var, CoroutineContext coroutineContext, int i, ki kiVar) {
        this.a = coroutineContext;
        this.b = i;
        this.c = kiVar;
        this.d = gd0Var;
    }

    @Override // defpackage.gd0
    public final Object A(id0 id0Var, gs gsVar) throws Throwable {
        int i = 0;
        fs fsVar = null;
        if (this.b == -3) {
            CoroutineContext context = gsVar.getContext();
            Boolean bool = Boolean.FALSE;
            uo uoVar = new uo(2);
            CoroutineContext coroutineContext = this.a;
            CoroutineContext coroutineContextPlus = !((Boolean) coroutineContext.fold(bool, uoVar)).booleanValue() ? context.plus(coroutineContext) : vs.a(context, coroutineContext, false);
            if (Intrinsics.areEqual(coroutineContextPlus, context)) {
                Object objA = this.d.A(id0Var, gsVar);
                ft ftVar = ft.a;
                if (objA != ftVar) {
                    objA = Unit.a;
                }
                return objA == ftVar ? objA : Unit.a;
            }
            hs hsVar = d.M;
            if (Intrinsics.areEqual(coroutineContextPlus.get(hsVar), context.get(hsVar))) {
                CoroutineContext context2 = gsVar.getContext();
                if (!(id0Var instanceof ko1)) {
                    id0Var = new l22(id0Var, context2);
                }
                Object objW = y21.w(coroutineContextPlus, id0Var, ix1.b(coroutineContextPlus), new pl(this, fsVar, 1), gsVar);
                return objW == ft.a ? objW : Unit.a;
            }
        }
        Object objE = ta.e(new ol(id0Var, this, fsVar, i), gsVar);
        ft ftVar2 = ft.a;
        if (objE != ftVar2) {
            objE = Unit.a;
        }
        return objE == ftVar2 ? objE : Unit.a;
    }

    public final String a() {
        ArrayList arrayList = new ArrayList(4);
        CoroutineContext coroutineContext = g.a;
        CoroutineContext coroutineContext2 = this.a;
        if (coroutineContext2 != coroutineContext) {
            arrayList.add("context=" + coroutineContext2);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        ki kiVar = ki.a;
        ki kiVar2 = this.c;
        if (kiVar2 != kiVar) {
            arrayList.add("onBufferOverflow=" + kiVar2);
        }
        return getClass().getSimpleName() + '[' + CollectionsKt.s(arrayList, ", ", (String) null, (String) null, (Function1) null, 62) + ']';
    }

    public final String toString() {
        return this.d + " -> " + a();
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.ah0
    public final gd0 u(CoroutineContext coroutineContext, int i, ki kiVar) {
        CoroutineContext coroutineContext2 = this.a;
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        ki kiVar2 = ki.a;
        ki kiVar3 = this.c;
        int i2 = this.b;
        if (kiVar == kiVar2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            kiVar = kiVar3;
        }
        return (Intrinsics.areEqual(coroutineContextPlus, coroutineContext2) && i == i2 && kiVar == kiVar3) ? this : new ql(this.d, coroutineContextPlus, i, kiVar);
    }
}
