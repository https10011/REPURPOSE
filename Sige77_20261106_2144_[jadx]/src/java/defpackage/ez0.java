package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ez0 {
    public final yb1 a;
    public final List b;
    public final String c;

    public ez0(Class cls, Class cls2, Class cls3, List list, yb1 yb1Var) {
        this.a = yb1Var;
        if (list.isEmpty()) {
            e.g("Must not be empty.");
            throw null;
        }
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final pi1 a(int i, int i2, f6 f6Var, vw vwVar, da1 da1Var) {
        yb1 yb1Var = this.a;
        List list = (List) yb1Var.h();
        am2.p(list, "Argument must not be null");
        List list2 = list;
        try {
            List list3 = this.b;
            int size = list3.size();
            pi1 pi1VarA = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    pi1VarA = ((ky) list3.get(i3)).a(i, i2, f6Var, vwVar, da1Var);
                } catch (ej0 e) {
                    list2.add(e);
                }
                if (pi1VarA != null) {
                    break;
                }
            }
            if (pi1VarA == null) {
                throw new ej0(this.c, new ArrayList(list2));
            }
            yb1Var.b(list2);
            return pi1VarA;
        } catch (Throwable th) {
            yb1Var.b(list2);
            throw th;
        }
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.b.toArray()) + '}';
    }
}
