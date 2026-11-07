package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u extends CancellationException {
    public final transient Object a;

    public u(id0 id0Var) {
        super("Flow was aborted, no more elements needed");
        this.a = id0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
