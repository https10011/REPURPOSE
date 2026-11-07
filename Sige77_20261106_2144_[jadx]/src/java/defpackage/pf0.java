package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pf0 extends l5 {
    public final /* synthetic */ AtomicReference a;

    public pf0(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.l5
    public final void a(Object obj) {
        l5 l5Var = (l5) this.a.get();
        if (l5Var != null) {
            l5Var.a(obj);
        } else {
            uq1.q("Operation cannot be started before fragment is in created state");
        }
    }
}
