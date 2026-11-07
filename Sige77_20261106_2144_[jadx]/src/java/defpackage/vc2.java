package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vc2 implements Cloneable {
    public final td2 a;
    public final xc2 b;

    public vc2(xc2 xc2Var, td2 td2Var) {
        this.a = td2Var;
        this.b = xc2Var;
    }

    public final byte[] c() {
        xc2 xc2Var = this.b;
        if (xc2Var == null) {
            return this.a.i;
        }
        ArrayList arrayList = xc2Var.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wc2 wc2Var = (wc2) obj;
            if (wc2Var.a.intValue() == 987894612) {
                byte[] bArr = (byte[]) wc2Var.b.a;
                int length = bArr.length - 12;
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 12, bArr2, 0, length);
                return bArr2;
            }
        }
        return null;
    }

    public final Object clone() {
        xc2 xc2Var = this.b;
        return new vc2(xc2Var == null ? null : xc2Var.clone(), this.a.clone());
    }
}
