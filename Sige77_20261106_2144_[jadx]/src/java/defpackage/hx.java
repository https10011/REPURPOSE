package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hx extends mv1 implements xg0 {
    public final /* synthetic */ int a = 1;
    public int b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx(yx yxVar, fs fsVar) {
        super(3, fsVar);
        this.c = yxVar;
    }

    @Override // defpackage.xg0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                return new hx((yx) this.c, (fs) obj3).invokeSuspend(Unit.a);
            default:
                ((Boolean) obj2).getClass();
                hx hxVar = new hx(3, (fs) obj3);
                hxVar.c = (cb0) obj;
                return hxVar.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                ft ftVar = ft.a;
                int i = this.b;
                if (i == 0) {
                    zi0.B(obj);
                    yx yxVar = (yx) this.c;
                    this.b = 1;
                    if (yx.b(yxVar, this) == ftVar) {
                        return ftVar;
                    }
                } else {
                    if (i != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                return Unit.a;
            default:
                ft ftVar2 = ft.a;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        zi0.B(obj);
                        return obj;
                    }
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(obj);
                cb0 cb0Var = (cb0) this.c;
                this.b = 1;
                cb0Var.getClass();
                Object objA = cb0.a(cb0Var, this);
                return objA == ftVar2 ? ftVar2 : objA;
        }
    }

    public /* synthetic */ hx(int i, fs fsVar) {
        super(i, fsVar);
    }
}
