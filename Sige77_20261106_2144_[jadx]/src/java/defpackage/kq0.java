package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kq0 implements uw {
    public final v01 a;

    public kq0(v01 v01Var) {
        this.a = v01Var;
    }

    @Override // defpackage.uw
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.uw
    public final vw b(Object obj) {
        return new wa((InputStream) obj, this.a);
    }
}
