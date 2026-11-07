package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dj implements si1 {
    public final /* synthetic */ int a;
    public final b30 b;

    public /* synthetic */ dj(b30 b30Var, int i) {
        this.a = i;
        this.b = b30Var;
    }

    @Override // defpackage.si1
    public final pi1 a(Object obj, int i, int i2, da1 da1Var) {
        switch (this.a) {
            case 0:
                b30 b30Var = this.b;
                return b30Var.a(new ac2((ByteBuffer) obj, b30Var.d, b30Var.c, 25), i, i2, da1Var, b30.j);
            default:
                b30 b30Var2 = this.b;
                return b30Var2.a(new ac2((ParcelFileDescriptor) obj, b30Var2.d, b30Var2.c), i, i2, da1Var, b30.j);
        }
    }

    @Override // defpackage.si1
    public final boolean b(Object obj, da1 da1Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}
