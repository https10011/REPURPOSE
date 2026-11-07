package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rk {
    public boolean a;
    public qk b;
    public boolean c;

    public final void a(qk qkVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.b == qkVar) {
                return;
            }
            this.b = qkVar;
            if (this.a) {
                qkVar.onCancel();
            }
        }
    }
}
