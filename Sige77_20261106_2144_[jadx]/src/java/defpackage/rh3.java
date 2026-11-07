package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rh3 extends dq2 {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ c83 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh3(c83 c83Var, boolean z, boolean z2) {
        super("log");
        this.e = c83Var;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // defpackage.dq2
    public final qt2 g(ep1 ep1Var, List list) {
        int i;
        int i2;
        String strZzc;
        ArrayList arrayList;
        gu2.Y("log", list, 1);
        int size = list.size();
        xt2 xt2Var = qt2.O;
        c83 c83Var = this.e;
        if (size == 1) {
            ((ox1) c83Var.d).v(3, ((f91) ep1Var.c).t(ep1Var, (qt2) list.get(0)).zzc(), Collections.EMPTY_LIST, this.c, this.d);
            return xt2Var;
        }
        qt2 qt2Var = (qt2) list.get(0);
        f91 f91Var = (f91) ep1Var.c;
        f91 f91Var2 = (f91) ep1Var.c;
        int iH0 = gu2.h0(f91Var.t(ep1Var, qt2Var).zzd().doubleValue());
        if (iH0 != 2) {
            i = 3;
            if (iH0 == 3) {
                i2 = 1;
            } else if (iH0 == 5) {
                i2 = 5;
            } else if (iH0 == 6) {
                i2 = 2;
            }
            strZzc = f91Var2.t(ep1Var, (qt2) list.get(1)).zzc();
            if (list.size() == 2) {
                ((ox1) c83Var.d).v(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
                return xt2Var;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(f91Var2.t(ep1Var, (qt2) list.get(i3)).zzc());
            }
            ((ox1) c83Var.d).v(i2, strZzc, arrayList, this.c, this.d);
            return xt2Var;
        }
        i = 4;
        i2 = i;
        strZzc = f91Var2.t(ep1Var, (qt2) list.get(1)).zzc();
        if (list.size() == 2) {
            ((ox1) c83Var.d).v(i2, strZzc, Collections.EMPTY_LIST, this.c, this.d);
            return xt2Var;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(f91Var2.t(ep1Var, (qt2) list.get(i3)).zzc());
        }
        ((ox1) c83Var.d).v(i2, strZzc, arrayList, this.c, this.d);
        return xt2Var;
    }
}
