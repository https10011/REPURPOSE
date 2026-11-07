package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ic2 implements mc2 {
    public static final Object c = new Object();
    public volatile mc2 a;
    public volatile Object b;

    /* JADX WARN: Multi-variable type inference failed */
    public static ic2 b(kc2 kc2Var) {
        if (kc2Var instanceof ic2) {
            return (ic2) kc2Var;
        }
        ic2 ic2Var = new ic2();
        ic2Var.b = c;
        ic2Var.a = kc2Var;
        return ic2Var;
    }

    @Override // defpackage.mc2
    public final Object a() {
        Object objA;
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objA = this.b;
                if (objA == obj2) {
                    objA = this.a.a();
                    Object obj3 = this.b;
                    if (obj3 != obj2 && obj3 != objA) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objA + ". This is likely due to a circular dependency.");
                    }
                    this.b = objA;
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objA;
    }
}
