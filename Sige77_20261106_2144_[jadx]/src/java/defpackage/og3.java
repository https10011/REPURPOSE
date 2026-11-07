package defpackage;

import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class og3 {
    public final boolean a;
    public final List b;
    public final hl2 c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final fc3 k;

    public og3(boolean z, ro0 ro0Var, hl2 hl2Var, String str, String str2, ro0 ro0Var2, ro0 ro0Var3, boolean z2, boolean z3, boolean z4, fc3 fc3Var) {
        ro0Var.getClass();
        hl2Var.getClass();
        str.getClass();
        str2.getClass();
        ro0Var2.getClass();
        ro0Var3.getClass();
        fc3Var.getClass();
        this.a = z;
        this.b = ro0Var;
        this.c = hl2Var;
        this.d = str;
        this.e = str2;
        this.f = ro0Var2;
        this.g = ro0Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = fc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og3)) {
            return false;
        }
        og3 og3Var = (og3) obj;
        return this.a == og3Var.a && Intrinsics.areEqual(this.b, og3Var.b) && Intrinsics.areEqual(this.c, og3Var.c) && Intrinsics.areEqual(this.d, og3Var.d) && Intrinsics.areEqual(this.e, og3Var.e) && Intrinsics.areEqual(this.f, og3Var.f) && Intrinsics.areEqual(this.g, og3Var.g) && this.h == og3Var.h && this.i == og3Var.i && this.j == og3Var.j && Intrinsics.areEqual(this.k, og3Var.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        hl2 hl2Var = this.c;
        int length3 = String.valueOf(hl2Var).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        fc3 fc3Var = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(fc3Var).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(hl2Var);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(fc3Var);
        sb.append(")");
        return sb.toString();
    }
}
