package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gd3 implements Runnable {
    public final long a;
    public final long b;
    public final /* synthetic */ md2 c;

    public gd3(md2 md2Var, long j, long j2) {
        Objects.requireNonNull(md2Var);
        this.c = md2Var;
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t53 t53Var = ((y53) ((td3) this.c.b).a).i;
        y53.l(t53Var);
        t53Var.N(new aj2(this, 6));
    }
}
