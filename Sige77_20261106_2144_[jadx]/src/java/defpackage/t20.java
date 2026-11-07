package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t20 implements yd1 {
    public static final Object c = new Object();
    public volatile m90 a;
    public volatile Object b;

    public static yd1 a(m90 m90Var) {
        if (m90Var instanceof t20) {
            return m90Var;
        }
        t20 t20Var = new t20();
        t20Var.b = c;
        t20Var.a = m90Var;
        return t20Var;
    }

    @Override // defpackage.yd1
    public final Object get() {
        Object obj;
        Object obj2 = this.b;
        Object obj3 = c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.b;
                if (obj == obj3) {
                    obj = this.a.get();
                    Object obj4 = this.b;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.b = obj;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
