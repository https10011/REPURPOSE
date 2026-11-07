package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class z5 extends o0 {
    public static final x91 W;
    public static final Logger X = Logger.getLogger(z5.class.getName());
    public volatile Set v;
    public volatile int w;

    static {
        x91 y5Var;
        try {
            y5Var = new x5(AtomicReferenceFieldUpdater.newUpdater(z5.class, Set.class, "v"), AtomicIntegerFieldUpdater.newUpdater(z5.class, "w"));
            th = null;
        } catch (Throwable th) {
            th = th;
            y5Var = new y5();
        }
        W = y5Var;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
