package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class f43 extends y43 {
    public final kw2 a;
    public final int b;

    public f43(lx2 lx2Var) throws tn {
        lx2Var.getClass();
        this.a = lx2Var;
        int i = 0;
        int i2 = 0;
        while (true) {
            kw2 kw2Var = this.a;
            if (i >= kw2Var.size()) {
                break;
            }
            int iA = ((y43) kw2Var.get(i)).a();
            if (i2 < iA) {
                i2 = iA;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new tn("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.y43
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        y43 y43Var = (y43) obj;
        int iZza = y43Var.zza();
        int iC = y43.c((byte) -128);
        if (iC != iZza) {
            return iC - y43Var.zza();
        }
        kw2 kw2Var = ((f43) y43Var).a;
        kw2 kw2Var2 = this.a;
        if (kw2Var2.size() != kw2Var.size()) {
            return kw2Var2.size() - kw2Var.size();
        }
        for (int i = 0; i < kw2Var2.size(); i++) {
            int iCompareTo = ((y43) kw2Var2.get(i)).compareTo((y43) kw2Var.get(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f43.class == obj.getClass()) {
            return this.a.equals(((f43) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(y43.c((byte) -128)), this.a});
    }

    public final String toString() {
        kw2 kw2Var = this.a;
        if (kw2Var.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = kw2Var.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((y43) kw2Var.get(i)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb.append(sh1.i(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) ",\n  ");
                    sb.append(sh1.i(it.next()));
                }
            }
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e) {
            e.b(e);
            return null;
        }
    }

    @Override // defpackage.y43
    public final int zza() {
        return y43.c((byte) -128);
    }
}
