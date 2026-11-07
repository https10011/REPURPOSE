package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class dq2 implements qt2, qr2 {
    public final String a;
    public final HashMap b = new HashMap();

    public dq2(String str) {
        this.a = str;
    }

    @Override // defpackage.qr2
    public final void a(String str, qt2 qt2Var) {
        HashMap map = this.b;
        if (qt2Var == null) {
            map.remove(str);
        } else {
            map.put(str, qt2Var);
        }
    }

    @Override // defpackage.qt2
    public final qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        return "toString".equals(str) ? new vt2(this.a) : qr2.b(this, new vt2(str), ep1Var, arrayList);
    }

    @Override // defpackage.qr2
    public final qt2 d(String str) {
        HashMap map = this.b;
        return map.containsKey(str) ? (qt2) map.get(str) : qt2.O;
    }

    @Override // defpackage.qr2
    public final boolean e(String str) {
        return this.b.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq2)) {
            return false;
        }
        dq2 dq2Var = (dq2) obj;
        String str = this.a;
        if (str != null) {
            return str.equals(dq2Var.a);
        }
        return false;
    }

    public abstract qt2 g(ep1 ep1Var, List list);

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // defpackage.qt2
    public final String zzc() {
        return this.a;
    }

    @Override // defpackage.qt2
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.qt2
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // defpackage.qt2
    public final Iterator zzf() {
        return new dr2(this.b.keySet().iterator());
    }

    @Override // defpackage.qt2
    public qt2 f() {
        return this;
    }
}
