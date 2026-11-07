package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ot0 implements m02 {
    public static final nt0 c;
    public final ir1 a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    static {
        int i = 0;
        c = new nt0(i);
        new nt0(i);
    }

    public ot0(ir1 ir1Var) {
        this.a = ir1Var;
    }

    public final l02 a(ir1 ir1Var, uk0 uk0Var, s12 s12Var, mt0 mt0Var, boolean z) {
        l02 l02VarC;
        Object objE = ir1Var.c(new s12(mt0Var.value()), true).e();
        boolean zNullSafe = mt0Var.nullSafe();
        if (objE instanceof l02) {
            l02VarC = (l02) objE;
        } else {
            if (!(objE instanceof m02)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objE.getClass().getName() + " as a @JsonAdapter for " + am2.Y(s12Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            m02 m02Var = (m02) objE;
            if (z) {
                m02 m02Var2 = (m02) this.b.putIfAbsent(s12Var.a, m02Var);
                if (m02Var2 != null) {
                    m02Var = m02Var2;
                }
            }
            l02VarC = m02Var.c(uk0Var, s12Var);
        }
        return (l02VarC == null || !zNullSafe) ? l02VarC : l02VarC.a();
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        mt0 mt0Var = (mt0) s12Var.a.getAnnotation(mt0.class);
        if (mt0Var == null) {
            return null;
        }
        return a(this.a, uk0Var, s12Var, mt0Var, true);
    }
}
