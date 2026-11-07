package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class lj1 extends ze {
    public lj1(fs fsVar) {
        super(fsVar);
        if (fsVar == null || fsVar.getContext() == g.a) {
            return;
        }
        e.g("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return g.a;
    }
}
