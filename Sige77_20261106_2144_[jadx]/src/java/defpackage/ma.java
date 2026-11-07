package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ma {
    public final String a;
    public final String b;
    public final String c;

    public ma(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ma)) {
            return false;
        }
        ma maVar = (ma) obj;
        return Intrinsics.areEqual(this.a, maVar.a) && Intrinsics.areEqual(this.b, maVar.b) && Intrinsics.areEqual(this.c, maVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ts.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CloudBridgeCredentials(datasetID=" + this.a + ", cloudBridgeURL=" + this.b + ", accessKey=" + this.c + ')';
    }
}
