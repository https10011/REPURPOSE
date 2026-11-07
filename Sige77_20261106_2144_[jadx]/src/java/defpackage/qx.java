package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qx extends mv1 implements Function2 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ yx d;
    public final /* synthetic */ int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx(yx yxVar, int i, fs fsVar, int i2) {
        super(2, fsVar);
        this.a = i2;
        this.d = yxVar;
        this.e = i;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        int i = this.a;
        int i2 = this.e;
        yx yxVar = this.d;
        switch (i) {
            case 0:
                qx qxVar = new qx(yxVar, i2, fsVar, 0);
                qxVar.c = ((Boolean) obj).booleanValue();
                return qxVar;
            default:
                qx qxVar2 = new qx(yxVar, i2, fsVar, 1);
                qxVar2.c = ((Boolean) obj).booleanValue();
                return qxVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        fs fsVar = (fs) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((qx) create(bool, fsVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        boolean z;
        kt1 jf1Var;
        boolean z2;
        Object obj2;
        int iHashCode;
        int i = this.a;
        int iIntValue = this.e;
        boolean z3 = false;
        yx yxVar = this.d;
        switch (i) {
            case 0:
                ft ftVar = ft.a;
                int i2 = this.b;
                try {
                    if (i2 == 0) {
                        zi0.B(obj);
                        z3 = this.c;
                        this.c = z3;
                        this.b = 1;
                        obj = yx.g(yxVar, z3, this);
                        if (obj == ftVar) {
                            return ftVar;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                uq1.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z = this.c;
                            th = (Throwable) this.f;
                            zi0.B(obj);
                            iIntValue = ((Number) obj).intValue();
                            th = th;
                            z3 = z;
                            jf1Var = new jf1(iIntValue, th);
                            return new Pair(jf1Var, Boolean.valueOf(z3));
                        }
                        z3 = this.c;
                        zi0.B(obj);
                    }
                    jf1Var = (kt1) obj;
                    break;
                } catch (Throwable th2) {
                    th = th2;
                    if (z3) {
                        dr1 dr1VarH = yxVar.h();
                        this.f = th;
                        this.c = z3;
                        this.b = 2;
                        Integer numA = dr1VarH.a();
                        if (numA != ftVar) {
                            obj = numA;
                            th = th;
                            z = z3;
                        }
                        return ftVar;
                    }
                }
                return new Pair(jf1Var, Boolean.valueOf(z3));
            default:
                ft ftVar2 = ft.a;
                int i3 = this.b;
                if (i3 == 0) {
                    zi0.B(obj);
                    z2 = this.c;
                    this.c = z2;
                    this.b = 1;
                    obj = yxVar.j(this);
                    if (obj != ftVar2) {
                    }
                    return ftVar2;
                }
                if (i3 == 1) {
                    z2 = this.c;
                    zi0.B(obj);
                } else {
                    if (i3 != 2) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.f;
                    zi0.B(obj);
                }
                iIntValue = ((Number) obj).intValue();
                obj = obj2;
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new dw(obj, iHashCode, iIntValue);
                if (z2) {
                    dr1 dr1VarH2 = yxVar.h();
                    this.f = obj;
                    this.b = 2;
                    Integer numA2 = dr1VarH2.a();
                    if (numA2 != ftVar2) {
                        Object obj3 = obj;
                        obj = numA2;
                        obj2 = obj3;
                        iIntValue = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    return ftVar2;
                }
                if (obj != null) {
                    iHashCode = obj.hashCode();
                } else {
                    iHashCode = 0;
                }
                return new dw(obj, iHashCode, iIntValue);
        }
    }
}
