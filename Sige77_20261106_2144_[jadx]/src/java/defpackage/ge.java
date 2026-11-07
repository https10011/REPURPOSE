package defpackage;

import android.util.Base64;
import com.hjq.toast.BuildConfig;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ge {
    public final String a;
    public final byte[] b;
    public final uc1 c;

    public ge(String str, byte[] bArr, uc1 uc1Var) {
        this.a = str;
        this.b = bArr;
        this.c = uc1Var;
    }

    public static ac2 a() {
        ac2 ac2Var = new ac2(7);
        ac2Var.c = uc1.a;
        return ac2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ge) {
            ge geVar = (ge) obj;
            if (this.a.equals(geVar.a) && Arrays.equals(this.b, geVar.b) && this.c.equals(geVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? BuildConfig.FLAVOR : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return ts.l(sb, strEncodeToString, ")");
    }
}
