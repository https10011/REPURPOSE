package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pl extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ql d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pl(ql qlVar, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.d = qlVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        ql qlVar = this.d;
        switch (i) {
            case 0:
                pl plVar = new pl(qlVar, fsVar, 0);
                plVar.c = obj;
                return plVar;
            default:
                pl plVar2 = new pl(qlVar, fsVar, 1);
                plVar2.c = obj;
                return plVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((pl) create((bd1) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((pl) create((id0) obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ql qlVar = this.d;
        switch (i) {
            case 0:
                ft ftVar = ft.a;
                int i2 = this.b;
                if (i2 == 0) {
                    zi0.B(obj);
                    bd1 bd1Var = (bd1) this.c;
                    this.b = 1;
                    Object objA = qlVar.d.A(new ko1(bd1Var), this);
                    if (objA != ftVar) {
                        objA = Unit.a;
                    }
                    if (objA != ftVar) {
                        objA = Unit.a;
                    }
                    if (objA == ftVar) {
                        return ftVar;
                    }
                } else {
                    if (i2 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                return Unit.a;
            default:
                ft ftVar2 = ft.a;
                int i3 = this.b;
                if (i3 == 0) {
                    zi0.B(obj);
                    id0 id0Var = (id0) this.c;
                    this.b = 1;
                    Object objA2 = qlVar.d.A(id0Var, this);
                    if (objA2 != ftVar2) {
                        objA2 = Unit.a;
                    }
                    if (objA2 == ftVar2) {
                        return ftVar2;
                    }
                } else {
                    if (i3 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                return Unit.a;
        }
    }
}
