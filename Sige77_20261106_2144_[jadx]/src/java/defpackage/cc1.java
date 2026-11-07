package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cc1 extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Function2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc1(Function2 function2, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.d = function2;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        Function2 function2 = this.d;
        switch (i) {
            case 0:
                cc1 cc1Var = new cc1(function2, fsVar, 0);
                cc1Var.c = obj;
                return cc1Var;
            default:
                cc1 cc1Var2 = new cc1(function2, fsVar, 1);
                cc1Var2.c = obj;
                return cc1Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        d61 d61Var = (d61) obj;
        fs fsVar = (fs) obj2;
        switch (this.a) {
            case 0:
                break;
        }
        return ((cc1) create(d61Var, fsVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Function2 function2 = this.d;
        switch (i) {
            case 0:
                ft ftVar = ft.a;
                int i2 = this.b;
                if (i2 == 0) {
                    zi0.B(obj);
                    d61 d61Var = (d61) this.c;
                    this.b = 1;
                    obj = function2.invoke(d61Var, this);
                    if (obj == ftVar) {
                        return ftVar;
                    }
                } else {
                    if (i2 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                d61 d61Var2 = (d61) obj;
                d61Var2.getClass();
                ((AtomicBoolean) d61Var2.b.a).set(true);
                return d61Var2;
            default:
                ft ftVar2 = ft.a;
                int i3 = this.b;
                if (i3 == 0) {
                    zi0.B(obj);
                    d61 d61Var3 = new d61(new LinkedHashMap(((d61) this.c).a()), false);
                    this.c = d61Var3;
                    this.b = 1;
                    return function2.invoke(d61Var3, this) == ftVar2 ? ftVar2 : d61Var3;
                }
                if (i3 != 1) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d61 d61Var4 = (d61) this.c;
                zi0.B(obj);
                return d61Var4;
        }
    }
}
