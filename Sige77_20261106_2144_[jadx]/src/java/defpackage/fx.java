package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fx extends mv1 implements Function2 {
    public final /* synthetic */ int a = 0;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(r91 r91Var, fs fsVar) {
        super(2, fsVar);
        this.b = r91Var;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        switch (this.a) {
            case 0:
                fx fxVar = new fx(2, fsVar);
                fxVar.b = obj;
                return fxVar;
            default:
                return new fx((r91) this.b, fsVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((fx) create((kt1) obj, (fs) obj2)).invokeSuspend(Unit.a);
            default:
                return ((fx) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ft ftVar = ft.a;
                zi0.B(obj);
                return Boolean.valueOf(!(((kt1) this.b) instanceof xb0));
            default:
                ft ftVar2 = ft.a;
                zi0.B(obj);
                return ((r91) this.b).e.a();
        }
    }

    public /* synthetic */ fx(int i, fs fsVar) {
        super(i, fsVar);
    }
}
