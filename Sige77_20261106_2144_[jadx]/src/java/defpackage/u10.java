package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u10 implements f51 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ u10(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return new zb(context, this);
            case 1:
                return new zb(context, this);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new zb(context, this);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new a31(context, 0);
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new a31(context, 1);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return new a31(context, 2);
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return new zb(context, ep1Var.i(Integer.class, AssetFileDescriptor.class));
            default:
                return new zb(context, ep1Var.i(Integer.class, InputStream.class));
        }
    }
}
