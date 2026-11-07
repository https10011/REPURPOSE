package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p80 implements rn0 {
    @Override // defpackage.rn0
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // defpackage.rn0
    public final int b(InputStream inputStream, v01 v01Var) throws Throwable {
        int iE;
        o80 o80Var = new o80(inputStream);
        k80 k80VarC = o80Var.c("Orientation");
        if (k80VarC == null) {
            iE = 1;
        } else {
            try {
                iE = k80VarC.e(o80Var.f);
            } catch (NumberFormatException unused) {
                iE = 1;
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // defpackage.rn0
    public final boolean c(ByteBuffer byteBuffer, v01 v01Var) {
        return false;
    }

    @Override // defpackage.rn0
    public final int d(ByteBuffer byteBuffer, v01 v01Var) {
        AtomicReference atomicReference = kj.a;
        return b(new ij(byteBuffer), v01Var);
    }

    @Override // defpackage.rn0
    public final boolean e(InputStream inputStream, v01 v01Var) {
        return false;
    }

    @Override // defpackage.rn0
    public final ImageHeaderParser.ImageType f(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
