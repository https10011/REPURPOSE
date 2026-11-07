package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.InlineMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class md0 implements gd0 {
    public final /* synthetic */ pv2 a;
    public final /* synthetic */ hx b;

    public md0(pv2 pv2Var, hx hxVar) {
        this.a = pv2Var;
        this.b = hxVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.gd0
    public final Object A(id0 id0Var, gs gsVar) throws Throwable {
        ld0 ld0Var;
        cl1 cl1Var;
        cl1 cl1Var2;
        if (gsVar instanceof ld0) {
            ld0Var = (ld0) gsVar;
            int i = ld0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                ld0Var.b = i - Integer.MIN_VALUE;
            } else {
                ld0Var = new ld0(this, gsVar);
            }
        } else {
            ld0Var = new ld0(this, gsVar);
        }
        Object obj = ld0Var.a;
        ft ftVar = ft.a;
        int i2 = ld0Var.b;
        try {
            try {
                if (i2 == 0) {
                    zi0.B(obj);
                    pv2 pv2Var = this.a;
                    ld0Var.d = this;
                    ld0Var.e = id0Var;
                    ld0Var.b = 1;
                    if (pv2Var.A(id0Var, ld0Var) != ftVar) {
                    }
                    return ftVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) ld0Var.d;
                        zi0.B(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        uq1.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cl1Var2 = (cl1) ld0Var.d;
                    try {
                        zi0.B(obj);
                        cl1Var2.releaseIntercepted();
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        cl1Var2.releaseIntercepted();
                        throw th;
                    }
                }
                id0Var = ld0Var.e;
                this = (md0) ld0Var.d;
                zi0.B(obj);
                hx hxVar = this.b;
                ld0Var.d = cl1Var;
                ld0Var.e = null;
                ld0Var.b = 3;
                InlineMarker.mark(6);
                Object objInvoke = hxVar.invoke(cl1Var, null, ld0Var);
                InlineMarker.mark(7);
                if (objInvoke != ftVar) {
                    cl1Var2 = cl1Var;
                    cl1Var2.releaseIntercepted();
                    return Unit.a;
                }
            } catch (Throwable th3) {
                th = th3;
                cl1Var2 = cl1Var;
                cl1Var2.releaseIntercepted();
                throw th;
            }
            cl1Var = new cl1(id0Var, ld0Var.getContext());
        } catch (Throwable th4) {
            md0 md0Var = this;
            nx1 nx1Var = new nx1(th4);
            hx hxVar2 = md0Var.b;
            ld0Var.d = th4;
            ld0Var.e = null;
            ld0Var.b = 2;
            if (od0.a(nx1Var, hxVar2, th4, ld0Var) != ftVar) {
                throw th4;
            }
        }
        return ftVar;
    }
}
