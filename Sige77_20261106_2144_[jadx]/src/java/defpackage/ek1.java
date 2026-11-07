package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ek1 extends b1 implements RandomAccess {
    public final Object[] b;
    public final int c;
    public int d;
    public int e;

    public ek1(int i, Object[] objArr) {
        this.b = objArr;
        if (i < 0) {
            e.d(ck1.r(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.c = objArr.length;
            this.e = i;
        } else {
            StringBuilder sbU = ck1.u(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbU.append(objArr.length);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
    }

    @Override // defpackage.d0
    public final int a() {
        return this.e;
    }

    public final void b() {
        if (20 > this.e) {
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = 20, size = " + this.e).toString());
        }
        int i = this.d;
        int i2 = this.c;
        int i3 = (i + 20) % i2;
        Object[] objArr = this.b;
        if (i > i3) {
            Arrays.fill(objArr, i, i2, (Object) null);
            Arrays.fill(objArr, 0, i3, (Object) null);
        } else {
            Arrays.fill(objArr, i, i3, (Object) null);
        }
        this.d = i3;
        this.e -= 20;
    }

    @Override // defpackage.b1, java.util.List
    public final Object get(int i) {
        x0 x0Var = b1.a;
        int i2 = this.e;
        x0Var.getClass();
        x0.a(i, i2);
        return this.b[(this.d + i) % this.c];
    }

    @Override // defpackage.b1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new dk1(this);
    }

    @Override // defpackage.d0, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.e;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.e;
        int i3 = this.d;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.b;
            if (i5 >= i2 || i3 >= this.c) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.d0, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }
}
