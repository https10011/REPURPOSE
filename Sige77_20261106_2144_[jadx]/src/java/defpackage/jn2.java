package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jn2 implements qt2 {
    public final boolean a;

    public jn2(Boolean bool) {
        this.a = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.a;
        if (zEquals) {
            return new vt2(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jn2) && this.a == ((jn2) obj).a;
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        return new jn2(Boolean.valueOf(this.a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.a).hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a);
    }

    @Override // defpackage.qt2
    public final String zzc() {
        return Boolean.toString(this.a);
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        return Double.valueOf(true != this.a ? 0.0d : 1.0d);
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return null;
    }
}
