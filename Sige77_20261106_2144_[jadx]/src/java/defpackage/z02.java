package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class z02 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() != 9) {
            return new StringBuffer(au0Var.M());
        }
        au0Var.D();
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        StringBuffer stringBuffer = (StringBuffer) obj;
        eu0Var.B(stringBuffer == null ? null : stringBuffer.toString());
    }
}
