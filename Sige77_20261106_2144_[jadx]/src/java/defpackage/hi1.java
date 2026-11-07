package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hi1 implements zq {
    public final ir1 a;
    public final /* synthetic */ ii1 b;

    public hi1(ii1 ii1Var, ir1 ir1Var) {
        this.b = ii1Var;
        this.a = ir1Var;
    }

    @Override // defpackage.zq
    public final void a(boolean z) {
        if (z) {
            synchronized (this.b) {
                ir1 ir1Var = this.a;
                ArrayList arrayListR = d42.r((Set) ir1Var.c);
                int size = arrayListR.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListR.get(i);
                    i++;
                    xh1 xh1Var = (xh1) obj;
                    if (!xh1Var.k() && !xh1Var.h()) {
                        xh1Var.clear();
                        if (ir1Var.b) {
                            ((HashSet) ir1Var.d).add(xh1Var);
                        } else {
                            xh1Var.j();
                        }
                    }
                }
            }
        }
    }
}
