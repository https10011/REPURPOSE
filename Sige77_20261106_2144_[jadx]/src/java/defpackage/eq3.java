package defpackage;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eq3 {
    public final String a;
    public final boolean b;
    public final i63 c;
    public final BitSet d;
    public final BitSet e;
    public final mb f;
    public final mb g;
    public final /* synthetic */ rl2 h;

    public eq3(rl2 rl2Var, String str, i63 i63Var, BitSet bitSet, BitSet bitSet2, mb mbVar, mb mbVar2) {
        this.h = rl2Var;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f = mbVar;
        this.g = new mb(0);
        for (Integer num : (jb) mbVar2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) mbVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.b = false;
        this.c = i63Var;
    }

    public final void a(gj2 gj2Var) {
        int iU;
        switch (gj2Var.g) {
            case 0:
                iU = ((n03) gj2Var.i).u();
                break;
            default:
                iU = ((w03) gj2Var.i).u();
                break;
        }
        boolean z = true;
        if (gj2Var.c != null) {
            this.e.set(iU, true);
        }
        Boolean bool = gj2Var.d;
        if (bool != null) {
            this.d.set(iU, bool.booleanValue());
        }
        if (gj2Var.e != null) {
            Integer numValueOf = Integer.valueOf(iU);
            mb mbVar = this.f;
            Long l = (Long) mbVar.get(numValueOf);
            long jLongValue = gj2Var.e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                mbVar.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (gj2Var.f != null) {
            Integer numValueOf2 = Integer.valueOf(iU);
            mb mbVar2 = this.g;
            List arrayList = (List) mbVar2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                mbVar2.put(numValueOf2, arrayList);
            }
            boolean z2 = false;
            switch (gj2Var.g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            sp2.a();
            y53 y53Var = (y53) this.h.a;
            is2 is2Var = y53Var.d;
            f13 f13Var = h13.F0;
            String str = this.a;
            if (is2Var.P(str, f13Var)) {
                switch (gj2Var.g) {
                    case 0:
                        z2 = ((n03) gj2Var.i).z();
                        break;
                }
                if (z2) {
                    arrayList.clear();
                }
            }
            sp2.a();
            boolean zP = y53Var.d.P(str, f13Var);
            Long l2 = gj2Var.f;
            if (!zP) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    public final e43 b(int i) {
        ArrayList arrayList;
        List list;
        d43 d43VarA = e43.A();
        d43VarA.d();
        ((e43) d43VarA.b).B(i);
        d43VarA.d();
        ((e43) d43VarA.b).E(this.b);
        i63 i63Var = this.c;
        if (i63Var != null) {
            d43VarA.d();
            ((e43) d43VarA.b).D(i63Var);
        }
        g63 g63VarB = i63.B();
        ArrayList arrayListK0 = lf3.k0(this.d);
        g63VarB.d();
        ((i63) g63VarB.b).F(arrayListK0);
        ArrayList arrayListK1 = lf3.k0(this.e);
        g63VarB.d();
        ((i63) g63VarB.b).D(arrayListK1);
        mb mbVar = this.f;
        if (mbVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(mbVar.c);
            for (Integer num : (jb) mbVar.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) mbVar.get(num);
                if (l != null) {
                    w43 w43VarX = z43.x();
                    w43VarX.d();
                    ((z43) w43VarX.b).y(iIntValue);
                    long jLongValue = l.longValue();
                    w43VarX.d();
                    ((z43) w43VarX.b).z(jLongValue);
                    arrayList2.add((z43) w43VarX.g());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            g63VarB.d();
            ((i63) g63VarB.b).H(arrayList);
        }
        mb mbVar2 = this.g;
        if (mbVar2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(mbVar2.c);
            for (Integer num2 : (jb) mbVar2.keySet()) {
                k63 k63VarY = m63.y();
                int iIntValue2 = num2.intValue();
                k63VarY.d();
                ((m63) k63VarY.b).z(iIntValue2);
                List list2 = (List) mbVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    k63VarY.d();
                    ((m63) k63VarY.b).A(list2);
                }
                arrayList3.add((m63) k63VarY.g());
            }
            list = arrayList3;
        }
        g63VarB.d();
        ((i63) g63VarB.b).J(list);
        d43VarA.d();
        ((e43) d43VarA.b).C((i63) g63VarB.g());
        return (e43) d43VarA.g();
    }

    public eq3(rl2 rl2Var, String str) {
        this.h = rl2Var;
        this.a = str;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new mb(0);
        this.g = new mb(0);
    }
}
