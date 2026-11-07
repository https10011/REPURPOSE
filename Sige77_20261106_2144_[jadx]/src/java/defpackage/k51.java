package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k51 extends FutureTask {
    public final /* synthetic */ cc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k51(cc ccVar, a20 a20Var) {
        super(a20Var);
        this.a = ccVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        cc ccVar = this.a;
        AtomicBoolean atomicBoolean = ccVar.d;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            ccVar.a(obj);
        } catch (InterruptedException e) {
            Log.w("AsyncTask", e);
        } catch (CancellationException unused) {
            if (atomicBoolean.get()) {
                return;
            }
            ccVar.a(null);
        } catch (ExecutionException e2) {
            sm0.m("An error occurred while executing doInBackground()", e2.getCause());
        } catch (Throwable th) {
            sm0.m("An error occurred while executing doInBackground()", th);
        }
    }
}
