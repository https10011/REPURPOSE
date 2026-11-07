package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s43 extends y43 {
    public final String a;

    public s43(String str) {
        this.a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y43 y43Var = (y43) obj;
        int iZza = y43Var.zza();
        int iC = y43.c((byte) 96);
        if (iC != iZza) {
            return iC - y43Var.zza();
        }
        String str = ((s43) y43Var).a;
        int length = str.length();
        String str2 = this.a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s43.class == obj.getClass()) {
            return this.a.equals(((s43) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y43.c((byte) 96)), this.a});
    }

    public final String toString() {
        return ts.l(new StringBuilder("\""), this.a, "\"");
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c((byte) 96);
    }
}
