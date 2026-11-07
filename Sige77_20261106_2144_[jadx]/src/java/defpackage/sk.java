package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sk extends vp {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(sk.class, "_resumed$volatile");
    private volatile /* synthetic */ int _resumed$volatile;

    public sk(pk pkVar, Throwable th, boolean z) {
        if (th == null) {
            th = new CancellationException("Continuation " + pkVar + " was cancelled normally");
        }
        super(th, z);
        this._resumed$volatile = 0;
    }
}
