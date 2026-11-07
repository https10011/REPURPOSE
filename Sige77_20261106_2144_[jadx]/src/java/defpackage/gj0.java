package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gj0 implements ThreadFactory {
    public final h4 a;
    public final String b;
    public final gp1 c;
    public final boolean d;
    public final AtomicInteger e;

    public gj0(h4 h4Var, String str, boolean z) {
        gp1 gp1Var = gp1.d;
        this.e = new AtomicInteger();
        this.a = h4Var;
        this.b = str;
        this.c = gp1Var;
        this.d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        bh0 bh0Var = new bh0(8, this, runnable, false);
        this.a.getClass();
        fj0 fj0Var = new fj0(bh0Var);
        fj0Var.setName("glide-" + this.b + "-thread-" + this.e.getAndIncrement());
        return fj0Var;
    }
}
