package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class wy {
    public static final h00 a;

    static {
        String property;
        jl0 jl0Var;
        h00 h00Var;
        int i = vv1.a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            sz szVar = i20.a;
            jl0Var = e11.a;
            jl0 jl0Var2 = jl0Var.e;
            if (jl0Var == null) {
                h00Var = jl0Var;
                h00Var = vy.Y;
            }
        } else {
            h00Var = vy.Y;
        }
        h00Var = jl0Var;
        a = h00Var;
    }
}
