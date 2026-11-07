package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ke implements kk {
    public final je[] a;

    public ke(je[] jeVarArr) {
        this.a = jeVarArr;
    }

    @Override // defpackage.kk
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (je jeVar : this.a) {
            n20 n20Var = jeVar.w;
            if (n20Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("handle");
                n20Var = null;
            }
            n20Var.a();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
