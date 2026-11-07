package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xo0 extends vn0 {
    public final Comparator d;

    public xo0(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.d = comparator;
    }

    public final nh1 e() {
        nh1 nh1Var;
        Object[] objArrCopyOf = this.a;
        int i = this.b;
        Comparator comparator = this.d;
        if (i == 0) {
            int i2 = zo0.f;
            nh1Var = n61.a != comparator ? new nh1(gh1.e, comparator) : nh1.v;
        } else {
            int i3 = zo0.f;
            ga.e(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, comparator);
            int i4 = 1;
            for (int i5 = 1; i5 < i; i5++) {
                Object obj = objArrCopyOf[i5];
                if (comparator.compare(obj, objArrCopyOf[i4 - 1]) != 0) {
                    objArrCopyOf[i4] = obj;
                    i4++;
                }
            }
            Arrays.fill(objArrCopyOf, i4, i, (Object) null);
            if (i4 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
            }
            nh1Var = new nh1(ro0.h(i4, objArrCopyOf), comparator);
        }
        this.b = nh1Var.i.size();
        this.c = true;
        return nh1Var;
    }
}
