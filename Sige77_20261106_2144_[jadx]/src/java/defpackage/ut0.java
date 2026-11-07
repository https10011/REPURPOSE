package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ut0 {
    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            eu0 eu0Var = new eu0(new g01(sb));
            eu0Var.v = 1;
            vt0.a.getClass();
            vt0.e(eu0Var, this);
            return sb.toString();
        } catch (IOException e) {
            e.b(e);
            return null;
        }
    }
}
