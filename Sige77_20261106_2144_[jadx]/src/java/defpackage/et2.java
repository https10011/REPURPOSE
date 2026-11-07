package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class et2 extends dq2 {
    public final ArrayList c;
    public final ArrayList d;
    public final ep1 e;

    public et2(String str, ArrayList arrayList, List list, ep1 ep1Var) {
        super(str);
        this.c = new ArrayList();
        this.e = ep1Var;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                this.c.add(((qt2) obj).zzc());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // defpackage.dq2, defpackage.qt2
    public final qt2 f() {
        return new et2(this);
    }

    @Override // defpackage.dq2
    public final qt2 g(ep1 ep1Var, List list) {
        xt2 xt2Var;
        ep1 ep1VarK = this.e.K();
        f91 f91Var = (f91) ep1VarK.c;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            xt2Var = qt2.O;
            if (i2 >= size) {
                break;
            }
            if (i2 < list.size()) {
                ep1VarK.P((String) arrayList.get(i2), ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(i2)));
            } else {
                ep1VarK.P((String) arrayList.get(i2), xt2Var);
            }
            i2++;
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj = arrayList2.get(i);
            i++;
            qt2 qt2Var = (qt2) obj;
            qt2 qt2VarT = f91Var.t(ep1VarK, qt2Var);
            if (qt2VarT instanceof rt2) {
                qt2VarT = f91Var.t(ep1VarK, qt2Var);
            }
            if (qt2VarT instanceof go2) {
                return ((go2) qt2VarT).a;
            }
        }
        return xt2Var;
    }

    public et2(et2 et2Var) {
        super(et2Var.a);
        ArrayList arrayList = new ArrayList(et2Var.c.size());
        this.c = arrayList;
        arrayList.addAll(et2Var.c);
        ArrayList arrayList2 = new ArrayList(et2Var.d.size());
        this.d = arrayList2;
        arrayList2.addAll(et2Var.d);
        this.e = et2Var.e;
    }
}
