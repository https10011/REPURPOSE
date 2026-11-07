package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kh implements si1 {
    public final /* synthetic */ int a;
    public final mh b;

    public kh() {
        this.a = 0;
        this.b = new nk1(3);
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        switch (this.a) {
            case 0:
                return c(l2.f(obj), i, i2, da1Var);
            default:
                return nh.c(this.b, ((gt1) obj).b());
        }
    }

    @Override // defpackage.si1
    public final /* bridge */ /* synthetic */ boolean b(Object obj, da1 da1Var) {
        switch (this.a) {
            case 0:
                l2.u(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public nh c(ImageDecoder.Source source, int i, int i2, da1 da1Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new qz(i, i2, da1Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new nh((nk1) this.b, bitmapDecodeBitmap);
    }

    public kh(mh mhVar) {
        this.a = 1;
        this.b = mhVar;
    }
}
