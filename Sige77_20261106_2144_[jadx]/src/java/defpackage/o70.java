package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o70 implements uu1, de1 {
    public final HashMap a;
    public ArrayDeque b;
    public final h22 c;

    public o70() {
        h22 h22Var = h22.a;
        this.a = new HashMap();
        this.b = new ArrayDeque();
        this.c = h22Var;
    }

    public final synchronized void a(Executor executor, r70 r70Var) {
        try {
            executor.getClass();
            if (!this.a.containsKey(jw.class)) {
                this.a.put(jw.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.a.get(jw.class)).put(r70Var, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
