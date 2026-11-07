package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ej implements si1 {
    public final /* synthetic */ int a;
    public final kh b;

    public ej(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new kh();
                break;
            default:
                this.b = new kh();
                break;
        }
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        int i3 = this.a;
        kh khVar = this.b;
        switch (i3) {
            case 0:
                return khVar.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, da1Var);
            default:
                return khVar.c(ImageDecoder.createSource(kj.b((InputStream) obj)), i, i2, da1Var);
        }
    }

    @Override // defpackage.si1
    public final /* bridge */ /* synthetic */ boolean b(Object obj, da1 da1Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
