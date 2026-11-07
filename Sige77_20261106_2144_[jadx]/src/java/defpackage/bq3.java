package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bq3 extends g93 {
    public Object[] j;
    public int k;

    @Override // defpackage.g93
    public final int J() {
        return this.k;
    }

    @Override // defpackage.g93
    public final pq3 M(int i) {
        if (i < this.k) {
            return (pq3) this.j[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.g93
    public final Object N(int i) {
        if (i < this.k) {
            return this.j[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.g93
    public final Object Q(pq3 pq3Var) {
        int iU = U(pq3Var);
        if (iU == -1) {
            return null;
        }
        return pq3Var.b.cast(this.j[iU + iU + 1]);
    }

    public final void T(pq3 pq3Var, Object obj) {
        int iU;
        if (!pq3Var.c && (iU = U(pq3Var)) != -1) {
            qt.J(obj, "metadata value");
            this.j[iU + iU + 1] = obj;
            return;
        }
        int i = this.k + 1;
        Object[] objArr = this.j;
        int length = objArr.length;
        if (i + i > length) {
            this.j = Arrays.copyOf(objArr, length + length);
        }
        Object[] objArr2 = this.j;
        int i2 = this.k;
        int i3 = i2 + i2;
        objArr2[i3] = pq3Var;
        qt.J(obj, "metadata value");
        objArr2[i3 + 1] = obj;
        this.k++;
    }

    public final int U(pq3 pq3Var) {
        for (int i = 0; i < this.k; i++) {
            if (this.j[i + i].equals(pq3Var)) {
                return i;
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.k; i++) {
            sb.append(" '");
            sb.append(M(i));
            sb.append("': ");
            sb.append(N(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
