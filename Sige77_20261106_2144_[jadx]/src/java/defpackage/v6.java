package defpackage;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v6 implements si1 {
    public final /* synthetic */ int a;
    public final hd2 b;

    public /* synthetic */ v6(hd2 hd2Var, int i) {
        this.a = i;
        this.b = hd2Var;
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        switch (this.a) {
            case 0:
                return hd2.f(ImageDecoder.createSource((ByteBuffer) obj), i, i2, da1Var);
            default:
                return hd2.f(ImageDecoder.createSource(kj.b((InputStream) obj)), i, i2, da1Var);
        }
    }

    @Override // defpackage.si1
    public final boolean b(Object obj, da1 da1Var) throws IOException {
        int i = this.a;
        hd2 hd2Var = this.b;
        switch (i) {
            case 0:
                ImageHeaderParser.ImageType imageTypeN = qt.n((ArrayList) hd2Var.b, (ByteBuffer) obj);
                if (imageTypeN != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageTypeN == ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                return true;
            default:
                ImageHeaderParser.ImageType imageTypeM = qt.m((ArrayList) hd2Var.b, (InputStream) obj, (v01) hd2Var.c);
                if (imageTypeM != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                    return Build.VERSION.SDK_INT >= 31 && imageTypeM == ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                return true;
        }
    }
}
