package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q22 implements f51 {
    public static final q22 b = new q22(0);
    public final /* synthetic */ int a;

    public /* synthetic */ q22(int i) {
        this.a = i;
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        int i = 4;
        int i2 = 0;
        switch (this.a) {
            case 0:
                return r22.b;
            case 1:
                return new cj(new xn(4), i2);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new cj(new ba0(i), i2);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new r22(1);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new hu1(ep1Var.i(Uri.class, AssetFileDescriptor.class), 0);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new hu1(ep1Var.i(Uri.class, ParcelFileDescriptor.class), 0);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new hu1(ep1Var.i(Uri.class, InputStream.class), 0);
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return new hu1(ep1Var.i(jj0.class, InputStream.class), 1);
            default:
                return new s32(ep1Var.i(jj0.class, InputStream.class));
        }
    }
}
