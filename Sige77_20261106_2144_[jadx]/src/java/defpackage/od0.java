package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract /* synthetic */ class od0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(nx1 nx1Var, hx hxVar, Throwable th, gs gsVar) {
        kd0 kd0Var;
        if (gsVar instanceof kd0) {
            kd0Var = (kd0) gsVar;
            int i = kd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kd0Var.c = i - Integer.MIN_VALUE;
            } else {
                kd0Var = new kd0(gsVar);
            }
        } else {
            kd0Var = new kd0(gsVar);
        }
        Object obj = kd0Var.b;
        Object obj2 = ft.a;
        int i2 = kd0Var.c;
        try {
            if (i2 == 0) {
                zi0.B(obj);
                kd0Var.a = th;
                kd0Var.c = 1;
                if (hxVar.invoke(nx1Var, th, kd0Var) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = kd0Var.a;
                zi0.B(obj);
            }
            return Unit.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                a80.a(th2, th);
            }
            throw th2;
        }
    }
}
