package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class go2 implements qt2 {
    public final qt2 a;
    public final String b;

    public go2(String str) {
        this.a = qt2.O;
        this.b = str;
    }

    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof go2)) {
            return false;
        }
        go2 go2Var = (go2) obj;
        return this.b.equals(go2Var.b) && this.a.equals(go2Var.a);
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        return new go2(this.b, this.a.f());
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.qt2
    public final String zzc() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return null;
    }

    public go2(String str, qt2 qt2Var) {
        this.a = qt2Var;
        this.b = str;
    }
}
