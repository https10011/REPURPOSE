package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m43 extends y43 {
    public final long a;

    public m43(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y43 y43Var = (y43) obj;
        if (zza() != y43Var.zza()) {
            return zza() - y43Var.zza();
        }
        long jAbs = Math.abs(this.a);
        long jAbs2 = Math.abs(((m43) y43Var).a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m43.class == obj.getClass() && this.a == ((m43) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.a)});
    }

    public final String toString() {
        return Long.toString(this.a);
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c(this.a >= 0 ? (byte) 0 : (byte) 32);
    }
}
