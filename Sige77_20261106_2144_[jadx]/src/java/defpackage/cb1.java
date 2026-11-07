package defpackage;

import kotlin.jvm.internal.Reflection;
import okhttp3.Request;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cb1 extends rq0 {
    public final Class W;

    public cb1(Class cls) {
        this.W = cls;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        Request.Builder builder = ai1Var.e;
        builder.getClass();
        Class cls = this.W;
        cls.getClass();
        ju0 orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        orCreateKotlinClass.getClass();
        builder.e = builder.e.b(orCreateKotlinClass, obj);
    }
}
