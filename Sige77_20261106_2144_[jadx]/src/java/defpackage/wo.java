package defpackage;

import java.io.Serializable;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wo implements Serializable {
    public static final vo b = new vo(null);
    public final CoroutineContext[] a;

    public wo(CoroutineContext[] coroutineContextArr) {
        this.a = coroutineContextArr;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContextPlus = g.a;
        for (CoroutineContext coroutineContext : this.a) {
            coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
        }
        return coroutineContextPlus;
    }
}
