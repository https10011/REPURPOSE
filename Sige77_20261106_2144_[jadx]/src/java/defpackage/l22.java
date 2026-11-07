package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l22 implements id0 {
    public final CoroutineContext a;
    public final Object b;
    public final pw c;

    public l22(id0 id0Var, CoroutineContext coroutineContext) {
        this.a = coroutineContext;
        this.b = ix1.b(coroutineContext);
        this.c = new pw(id0Var, null, 8);
    }

    @Override // defpackage.id0
    public final Object a(Object obj, fs fsVar) {
        Object objW = y21.w(this.a, obj, this.b, this.c, fsVar);
        return objW == ft.a ? objW : Unit.a;
    }
}
