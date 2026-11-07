package defpackage;

import androidx.activity.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y81 implements mk {
    public final cg0 a;
    public final /* synthetic */ a b;

    public y81(a aVar, cg0 cg0Var) {
        cg0Var.getClass();
        this.b = aVar;
        this.a = cg0Var;
    }

    @Override // defpackage.mk
    public final void cancel() {
        a aVar = this.b;
        fb fbVar = aVar.b;
        cg0 cg0Var = this.a;
        fbVar.remove(cg0Var);
        if (Intrinsics.areEqual(aVar.c, cg0Var)) {
            cg0Var.getClass();
            aVar.c = null;
        }
        cg0Var.getClass();
        cg0Var.b.remove(this);
        Function0 function0 = cg0Var.c;
        if (function0 != null) {
            function0.invoke();
        }
        cg0Var.c = null;
    }
}
