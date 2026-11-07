package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class uz2 implements Runnable {
    public final long a;
    public final long b;
    public final boolean c;
    public final /* synthetic */ b03 d;

    public uz2(b03 b03Var, boolean z) {
        Objects.requireNonNull(b03Var);
        this.d = b03Var;
        this.a = System.currentTimeMillis();
        this.b = SystemClock.elapsedRealtime();
        this.c = z;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        b03 b03Var = this.d;
        if (b03Var.d) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e) {
            b03Var.b(e, false, this.c);
            b();
        }
    }

    public void b() {
    }
}
