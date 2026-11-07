package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rt2 implements qt2 {
    public final String a;
    public final ArrayList b;

    public rt2(ArrayList arrayList, String str) {
        this.a = str;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt2)) {
            return false;
        }
        rt2 rt2Var = (rt2) obj;
        String str = rt2Var.a;
        String str2 = this.a;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.b.equals(rt2Var.b);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.qt2
    public final String zzc() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return null;
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        return this;
    }
}
