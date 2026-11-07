package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ks1 implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public ks1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.a = new int[i4];
        this.b = new Object[i4];
    }

    public final void c(int i, ColorStateList colorStateList) {
        int i2 = this.c;
        if (i2 != 0 && i <= this.a[i2 - 1]) {
            f(i, colorStateList);
            return;
        }
        if (i2 >= this.a.length) {
            int i3 = (i2 + 1) * 4;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 4;
            this.a = Arrays.copyOf(this.a, i6);
            this.b = Arrays.copyOf(this.b, i6);
        }
        this.a[i2] = i;
        this.b[i2] = colorStateList;
        this.c = i2 + 1;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ks1 ks1Var = (ks1) objClone;
        ks1Var.a = (int[]) this.a.clone();
        ks1Var.b = (Object[]) this.b.clone();
        return ks1Var;
    }

    public final Object d(int i) {
        Object obj;
        int iD = jw.d(this.c, i, this.a);
        if (iD < 0 || (obj = this.b[iD]) == d42.k) {
            return null;
        }
        return obj;
    }

    public final void f(int i, Object obj) {
        int iD = jw.d(this.c, i, this.a);
        if (iD >= 0) {
            this.b[iD] = obj;
            return;
        }
        int i2 = ~iD;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == d42.k) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.a = Arrays.copyOf(this.a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            ub.c(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            ub.d(i9, i2, this.c, objArr2, objArr2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append('=');
            Object obj = this.b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
