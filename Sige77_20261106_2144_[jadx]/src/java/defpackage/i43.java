package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i43 extends y43 {
    public final boolean a;

    public i43(boolean z) {
        this.a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y43 y43Var = (y43) obj;
        int iZza = y43Var.zza();
        int iC = y43.c((byte) -32);
        if (iC != iZza) {
            return iC - y43Var.zza();
        }
        return (true != this.a ? 20 : 21) - (true != ((i43) y43Var).a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i43.class == obj.getClass() && this.a == ((i43) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y43.c((byte) -32)), Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c((byte) -32);
    }
}
