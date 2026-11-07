package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class xc1 {
    public static final SparseArray a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(uc1.a, 0);
        map.put(uc1.b, 1);
        map.put(uc1.c, 2);
        for (uc1 uc1Var : map.keySet()) {
            a.append(((Integer) b.get(uc1Var)).intValue(), uc1Var);
        }
    }

    public static int a(uc1 uc1Var) {
        Integer num = (Integer) b.get(uc1Var);
        if (num != null) {
            return num.intValue();
        }
        ur.c(uc1Var, "PriorityMapping is missing known Priority value ");
        return 0;
    }

    public static uc1 b(int i) {
        uc1 uc1Var = (uc1) a.get(i);
        if (uc1Var != null) {
            return uc1Var;
        }
        e.g(ck1.r(i, "Unknown Priority for value "));
        return null;
    }
}
