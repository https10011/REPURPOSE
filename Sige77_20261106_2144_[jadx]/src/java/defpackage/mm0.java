package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mm0 implements e51 {
    public static final z91 b = z91.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final pv2 a;

    public mm0(pv2 pv2Var) {
        this.a = pv2Var;
    }

    @Override // defpackage.e51
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        jj0 jj0Var = (jj0) obj;
        pv2 pv2Var = this.a;
        if (pv2Var != null) {
            b51 b51Var = (b51) pv2Var.a;
            c51 c51VarA = c51.a(jj0Var);
            Object objA = b51Var.a(c51VarA);
            ArrayDeque arrayDeque = c51.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(c51VarA);
            }
            jj0 jj0Var2 = (jj0) objA;
            if (jj0Var2 == null) {
                b51Var.d(c51.a(jj0Var), jj0Var);
            } else {
                jj0Var = jj0Var2;
            }
        }
        return new d51(jj0Var, new tm0(jj0Var, ((Integer) da1Var.c(b)).intValue()));
    }
}
