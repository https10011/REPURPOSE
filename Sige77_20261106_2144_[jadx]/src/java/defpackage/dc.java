package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dc extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                f6 f6Var = ec.h;
                ReentrantLock reentrantLock = ec.j;
                reentrantLock.lock();
                try {
                    ec ecVarF = gp1.f();
                    if (ecVarF == ec.i) {
                        ec.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        Unit unit = Unit.a;
                        reentrantLock.unlock();
                        if (ecVarF != null) {
                            ecVarF.k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
