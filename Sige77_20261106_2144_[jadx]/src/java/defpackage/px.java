package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class px extends mv1 implements Function1 {
    public Throwable a;
    public int b;
    public final /* synthetic */ yx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public px(yx yxVar, fs fsVar) {
        super(1, fsVar);
        this.c = yxVar;
    }

    @Override // defpackage.ze
    public final fs create(fs fsVar) {
        return new px(this.c, fsVar);
    }

    public final Object invoke(Object obj) {
        return ((px) create((fs) obj)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        kt1 jf1Var;
        ft ftVar = ft.a;
        int i = this.b;
        yx yxVar = this.c;
        try {
            if (i == 0) {
                zi0.B(obj);
                this.b = 1;
                obj = yx.g(yxVar, true, this);
                if (obj == ftVar) {
                    return ftVar;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = this.a;
                    zi0.B(obj);
                    jf1Var = new jf1(((Number) obj).intValue(), th);
                    return new Pair(jf1Var, Boolean.TRUE);
                }
                zi0.B(obj);
            }
            jf1Var = (kt1) obj;
        } catch (Throwable th2) {
            dr1 dr1VarH = yxVar.h();
            this.a = th2;
            this.b = 2;
            Integer numA = dr1VarH.a();
            if (numA != ftVar) {
                obj = numA;
                th = th2;
            }
            return ftVar;
        }
        return new Pair(jf1Var, Boolean.TRUE);
    }
}
