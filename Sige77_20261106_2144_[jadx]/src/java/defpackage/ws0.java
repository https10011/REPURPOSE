package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface ws0 extends CoroutineContext.Element {
    hm attachChild(km kmVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    Sequence getChildren();

    n20 invokeOnCompletion(Function1 function1);

    n20 invokeOnCompletion(boolean z, boolean z2, Function1 function1);

    boolean isActive();

    Object join(fs fsVar);

    boolean start();
}
