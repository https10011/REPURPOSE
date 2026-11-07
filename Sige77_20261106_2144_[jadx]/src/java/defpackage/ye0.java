package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ye0 extends df0 implements RunnableFuture {
    public final Callable i;
    public Object v;

    public ye0(Callable callable) {
        callable.getClass();
        this.i = callable;
    }

    @Override // defpackage.df0
    public final boolean e() {
        try {
            this.v = this.i.call();
            return true;
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e2) {
            sm0.n(e2);
            return false;
        }
    }

    @Override // defpackage.df0
    public final Object i() {
        return this.v;
    }

    public final String toString() {
        return super.toString() + "[Wrapped task = " + this.i + "]";
    }
}
