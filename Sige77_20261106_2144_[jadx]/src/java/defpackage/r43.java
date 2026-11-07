package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class r43 extends y43 {
    public final int a;
    public final uw2 b;

    public r43(uw2 uw2Var) throws tn {
        uw2Var.getClass();
        this.b = uw2Var;
        bs0 bs0VarG = uw2Var.entrySet().g();
        int i = 0;
        while (bs0VarG.hasNext()) {
            Map.Entry entry = (Map.Entry) bs0VarG.next();
            int iA = ((y43) entry.getKey()).a();
            i = i < iA ? iA : i;
            int iA2 = ((y43) entry.getValue()).a();
            if (i < iA2) {
                i = iA2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new tn("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.y43
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompareTo;
        y43 y43Var = (y43) obj;
        int iZza = y43Var.zza();
        int iC = y43.c((byte) -96);
        if (iC != iZza) {
            return iC - y43Var.zza();
        }
        uw2 uw2Var = ((r43) y43Var).b;
        uw2 uw2Var2 = this.b;
        if (uw2Var2.d.size() != uw2Var.d.size()) {
            return uw2Var2.d.size() - uw2Var.d.size();
        }
        bs0 bs0VarG = uw2Var2.entrySet().g();
        bs0 bs0VarG2 = uw2Var.entrySet().g();
        do {
            if (!bs0VarG.hasNext() && !bs0VarG2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) bs0VarG.next();
            Map.Entry entry2 = (Map.Entry) bs0VarG2.next();
            int iCompareTo2 = ((y43) entry.getKey()).compareTo((y43) entry2.getKey());
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            iCompareTo = ((y43) entry.getValue()).compareTo((y43) entry2.getValue());
        } while (iCompareTo == 0);
        return iCompareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r43.class == obj.getClass()) {
            return this.b.equals(((r43) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y43.c((byte) -96)), this.b});
    }

    public final String toString() {
        uw2 uw2Var = this.b;
        if (uw2Var.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bs0 bs0VarG = uw2Var.entrySet().g();
        while (bs0VarG.hasNext()) {
            Map.Entry entry = (Map.Entry) bs0VarG.next();
            linkedHashMap.put(((y43) entry.getKey()).toString().replace("\n", "\n  "), ((y43) entry.getValue()).toString().replace("\n", "\n  "));
        }
        sh1 sh1Var = new sh1(11);
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            ga.C(sb, linkedHashMap.entrySet().iterator(), sh1Var);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            e.b(e);
            return null;
        }
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c((byte) -96);
    }
}
