package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class hs2 implements qt2, qr2 {
    public final HashMap a = new HashMap();

    @Override // defpackage.qr2
    public final void a(String str, qt2 qt2Var) {
        HashMap map = this.a;
        if (qt2Var == null) {
            map.remove(str);
        } else {
            map.put(str, qt2Var);
        }
    }

    @Override // defpackage.qt2
    public qt2 c(String str, ep1 ep1Var, ArrayList arrayList) {
        return "toString".equals(str) ? new vt2(toString()) : qr2.b(this, new vt2(str), ep1Var, arrayList);
    }

    @Override // defpackage.qr2
    public final qt2 d(String str) {
        HashMap map = this.a;
        return map.containsKey(str) ? (qt2) map.get(str) : qt2.O;
    }

    @Override // defpackage.qr2
    public final boolean e(String str) {
        return this.a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hs2) {
            return this.a.equals(((hs2) obj).a);
        }
        return false;
    }

    @Override // defpackage.qt2
    public final qt2 f() {
        hs2 hs2Var = new hs2();
        for (Map.Entry entry : this.a.entrySet()) {
            boolean z = entry.getValue() instanceof qr2;
            HashMap map = hs2Var.a;
            if (z) {
                map.put((String) entry.getKey(), (qt2) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((qt2) entry.getValue()).f());
            }
        }
        return hs2Var;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.a;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.qt2
    public final String zzc() {
        return "[object Object]";
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
        return new dr2(this.a.keySet().iterator());
    }
}
