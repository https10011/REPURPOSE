package defpackage;

import okhttp3.Call;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class r81 implements e51 {
    public final Call.Factory a;

    public r81(Call.Factory factory) {
        this.a = factory;
    }

    @Override // defpackage.e51
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.e51
    public final d51 b(Object obj, int i, int i2, da1 da1Var) {
        jj0 jj0Var = (jj0) obj;
        return new d51(jj0Var, new p81(this.a, jj0Var));
    }
}
