package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class is extends AtomicBoolean implements OutcomeReceiver {
    private final fs<Object> a;

    public is(pk pkVar) {
        super(false);
        this.a = pkVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            fs<Object> fsVar = this.a;
            pj1 pj1Var = rj1.b;
            fsVar.resumeWith(zi0.i(th));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            fs<Object> fsVar = this.a;
            pj1 pj1Var = rj1.b;
            fsVar.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
