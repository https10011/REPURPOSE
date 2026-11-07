package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r00 extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r00(Object obj, fs fsVar, int i) {
        super(2, fsVar);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return new r00((nl1) obj2, fsVar, 0);
            case 1:
                return new r00((ns0) obj2, fsVar, 1);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new r00((v21) obj2, fsVar, 2);
            default:
                return new r00((r91) obj2, fsVar, 3);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        et etVar = (et) obj;
        fs fsVar = (fs) obj2;
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                break;
        }
        return ((r00) create(etVar, fsVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.a;
        boolean z = false;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                nl1 nl1Var = (nl1) obj2;
                ft ftVar = ft.a;
                int i2 = this.b;
                if (i2 == 0) {
                    zi0.B(obj);
                    File file = new File((String) nl1Var.b);
                    if (file.exists() && file.delete()) {
                        z = true;
                    }
                    sz szVar = i20.a;
                    jl0 jl0Var = e11.a;
                    q00 q00Var = new q00(nl1Var, z, null);
                    this.b = 1;
                    if (qt.E(jl0Var, q00Var, this) == ftVar) {
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
            case 1:
                ft ftVar2 = ft.a;
                int i3 = this.b;
                if (i3 == 0) {
                    zi0.B(obj);
                    gd0 gd0VarF = ((yw) ((ns0) obj2).c.b).f();
                    this.b = 1;
                    obj = sp0.h(gd0VarF, this);
                    if (obj == ftVar2) {
                        return ftVar2;
                    }
                } else {
                    if (i3 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                d61 d61Var = (d61) obj;
                if (d61Var != null) {
                    return d61Var.a();
                }
                y50 y50Var = y50.a;
                y50Var.getClass();
                return y50Var;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ft ftVar3 = ft.a;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        zi0.B(obj);
                        return obj;
                    }
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(obj);
                x21 x21Var = ((v21) obj2).a;
                this.b = 1;
                Object objC = x21Var.c(this);
                return objC == ftVar3 ? ftVar3 : objC;
            default:
                r91 r91Var = (r91) obj2;
                ft ftVar4 = ft.a;
                int i5 = this.b;
                if (i5 == 0) {
                    zi0.B(obj);
                    this.b = 1;
                    obj = r91.d(r91Var, this);
                    if (obj == ftVar4) {
                        return ftVar4;
                    }
                } else {
                    if (i5 != 1) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zi0.B(obj);
                }
                ix0 ix0Var = (ix0) obj;
                r91Var.n.j(Boolean.valueOf((ix0Var.d() && ((Boolean) ix0Var.c()).booleanValue()) ? false : true));
                return Unit.a;
        }
    }
}
