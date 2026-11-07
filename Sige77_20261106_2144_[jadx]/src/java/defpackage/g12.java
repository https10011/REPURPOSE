package defpackage;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class g12 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        boolean zT;
        BitSet bitSet = new BitSet();
        au0Var.a();
        int iR = au0Var.R();
        int i = 0;
        while (iR != 2) {
            int iV = ts.v(iR);
            if (iV == 5 || iV == 6) {
                int iX = au0Var.x();
                if (iX == 0) {
                    zT = false;
                } else {
                    if (iX != 1) {
                        StringBuilder sbU = ck1.u(iX, "Invalid bitset value ", ", expected 0 or 1; at path ");
                        sbU.append(au0Var.n(true));
                        throw new wt0(sbU.toString(), 4);
                    }
                    zT = true;
                }
            } else {
                if (iV != 7) {
                    throw new wt0("Invalid bitset value type: " + y00.p(iR) + "; at path " + au0Var.n(false), 4);
                }
                zT = au0Var.t();
            }
            if (zT) {
                bitSet.set(i);
            }
            i++;
            iR = au0Var.R();
        }
        au0Var.j();
        return bitSet;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        eu0Var.b();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            eu0Var.x(bitSet.get(i) ? 1L : 0L);
        }
        eu0Var.j();
    }
}
