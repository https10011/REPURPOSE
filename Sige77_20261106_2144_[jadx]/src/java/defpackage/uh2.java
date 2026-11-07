package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uh2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public uh2(md2 md2Var, BasePendingResult basePendingResult) {
        this.b = basePendingResult;
        Objects.requireNonNull(md2Var);
        this.c = md2Var;
    }

    public final void a(Status status) {
        sj1 sj1Var;
        switch (this.a) {
            case 0:
                if (!status.R()) {
                    ((TaskCompletionSource) this.c).setException(nj2.y(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                gu2.q("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.v);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.f);
                }
                gu2.q("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.a) {
                    gu2.q("Result has already been consumed.", !basePendingResult.g);
                    gu2.q("Result is not ready.", basePendingResult.d());
                    sj1Var = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                    break;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    ur.a();
                    return;
                } else {
                    gu2.o(sj1Var);
                    ((TaskCompletionSource) this.c).setResult((Object) null);
                    return;
                }
            default:
                ((Map) ((md2) this.c).a).remove(this.b);
                return;
        }
    }

    public uh2(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, k42 k42Var) {
        this.b = basePendingResult;
        this.c = taskCompletionSource;
    }
}
