package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n22 implements CoroutineContext.Element, f {
    public static final n22 a = new n22();

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(f fVar) {
        return e.a(this, fVar);
    }

    public final CoroutineContext minusKey(f fVar) {
        return e.b(this, fVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.c(this, coroutineContext);
    }

    public final f getKey() {
        return this;
    }
}
