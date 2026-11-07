package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vq1 extends Lambda implements Function1 {
    public final /* synthetic */ ux a;
    public final /* synthetic */ ud2 b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(ux uxVar, ud2 ud2Var, Function2 function2) {
        super(1);
        this.a = uxVar;
        this.b = ud2Var;
        this.c = function2;
    }

    public final Object invoke(Object obj) {
        Unit unit;
        Throwable th = (Throwable) obj;
        this.a.invoke(th);
        mi miVar = (mi) this.b.c;
        miVar.g(th, false);
        do {
            Object objD = miVar.D();
            unit = null;
            if (objD instanceof tl) {
                objD = null;
            }
            if (objD != null) {
                this.c.invoke(objD, th);
                unit = Unit.a;
            }
        } while (unit != null);
        return Unit.a;
    }
}
