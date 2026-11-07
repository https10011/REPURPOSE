package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k00 implements o00 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ k00(n00 n00Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = n00Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.o00
    public final ScheduledFuture b(ox1 ox1Var) {
        int i = this.a;
        Runnable runnable = this.c;
        n00 n00Var = this.b;
        switch (i) {
            case 0:
                return n00Var.b.scheduleAtFixedRate(new l00(n00Var, runnable, ox1Var, 0), this.d, this.e, this.f);
            default:
                return n00Var.b.scheduleWithFixedDelay(new l00(n00Var, runnable, ox1Var, 2), this.d, this.e, this.f);
        }
    }
}
