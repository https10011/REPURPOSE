package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class am3 extends v0 {
    public qp0 v;
    public final int w;

    public am3(qp0 qp0Var, int i) {
        this.v = qp0Var;
        this.w = i;
    }

    @Override // defpackage.v0
    public final void c() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        qp0 qp0Var = this.v;
        this.v = null;
        if (qp0Var == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) qp0Var.c;
        do {
            atomicLong = (AtomicLong) qp0Var.b;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (((long) i2) << 32) | (4294967295L & ((long) (i - 1)))));
        if (z) {
            while (true) {
                cm3 cm3Var = (cm3) atomicReference.get();
                if (cm3Var != null) {
                    if (cm3Var.v <= this.w) {
                        cm3Var.cancel(true);
                        while (!atomicReference.compareAndSet(cm3Var, null)) {
                            if (atomicReference.get() != cm3Var) {
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // defpackage.v0
    public final String j() {
        ac acVar;
        qp0 qp0Var = this.v;
        if (qp0Var == null || (acVar = (ac) ((z83) qp0Var.a).c) == null) {
            return null;
        }
        String string = acVar.toString();
        String strL = y00.l(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        cm3 cm3Var = (cm3) ((AtomicReference) this.v.c).get();
        if (cm3Var == null) {
            return strL;
        }
        int length = strL.length();
        String string2 = cm3Var.toString();
        StringBuilder sb = new StringBuilder(string2.length() + length + 9 + 1);
        sb.append(strL);
        sb.append(", trial=[");
        sb.append(string2);
        sb.append("]");
        return sb.toString();
    }
}
