package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o53 extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ t53 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o53(t53 t53Var, Callable callable, boolean z) {
        super(callable);
        this.d = t53Var;
        long andIncrement = t53.X.getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c33 c33Var = ((y53) t53Var.a).f;
            y53.l(c33Var);
            c33Var.f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o53 o53Var = (o53) obj;
        boolean z = o53Var.b;
        boolean z2 = this.b;
        if (z2 != z) {
            return !z2 ? 1 : -1;
        }
        long j = o53Var.a;
        long j2 = this.a;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        c33 c33Var = ((y53) this.d.a).f;
        y53.l(c33Var);
        c33Var.i.b(Long.valueOf(j2), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        c33 c33Var = ((y53) this.d.a).f;
        y53.l(c33Var);
        c33Var.f.b(th, this.c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o53(t53 t53Var, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.d = t53Var;
        long andIncrement = t53.X.getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            c33 c33Var = ((y53) t53Var.a).f;
            y53.l(c33Var);
            c33Var.f.a("Tasks index overflow");
        }
    }
}
