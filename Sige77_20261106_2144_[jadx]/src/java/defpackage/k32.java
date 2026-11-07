package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k32 implements CoroutineContext.Element {
    public final k32 a;
    public final yx b;

    public k32(k32 k32Var, yx yxVar) {
        this.a = k32Var;
        this.b = yxVar;
    }

    public final void a(yx yxVar) {
        if (this.b == yxVar) {
            uq1.q("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
            return;
        }
        k32 k32Var = this.a;
        if (k32Var != null) {
            k32Var.a(yxVar);
        }
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    public final f getKey() {
        return ba0.w;
    }

    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }
}
