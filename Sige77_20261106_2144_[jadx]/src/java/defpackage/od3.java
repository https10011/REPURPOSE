package defpackage;

import com.appsflyer.internal.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class od3 extends dx2 {
    public final String a;
    public final ip3 b;

    public od3(String str, ip3 ip3Var) {
        this.a = str;
        this.b = ip3Var;
    }

    @Override // defpackage.dx2
    public final boolean a() {
        return this.b != ip3.RAW;
    }

    public final String toString() {
        String str;
        int i = ud3.a[this.b.ordinal()];
        if (i == 1) {
            str = "TINK";
        } else if (i == 2) {
            str = "LEGACY";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        return d.a("(typeUrl=", this.a, ", outputPrefixType=", str, ")");
    }
}
