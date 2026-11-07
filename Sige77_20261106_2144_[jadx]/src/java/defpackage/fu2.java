package defpackage;

import android.os.Handler;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class fu2 {
    public static volatile th2 d;
    public final j73 a;
    public final bh0 b;
    public volatile long c;

    public fu2(j73 j73Var) {
        gu2.o(j73Var);
        this.a = j73Var;
        this.b = new bh0(24, this, j73Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            j73 j73Var = this.a;
            j73Var.g().getClass();
            this.c = System.currentTimeMillis();
            if (d().postDelayed(this.b, j)) {
                return;
            }
            j73Var.d().f.b(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        th2 th2Var;
        if (d != null) {
            return d;
        }
        synchronized (fu2.class) {
            try {
                if (d == null) {
                    d = new th2(this.a.f().getMainLooper(), 1);
                }
                th2Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return th2Var;
    }
}
