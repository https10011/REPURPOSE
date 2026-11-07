package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rb implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final Object c;

    public /* synthetic */ rb(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return this.b < ((Object[]) obj).length;
            case 1:
                ck2 ck2Var = (ck2) obj;
                return this.b < ck2Var.b() - ck2Var.a();
            default:
                return this.b < ((wr3) ((hb) obj).b).e;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                Object[] objArr = (Object[]) obj;
                if (i2 != objArr.length) {
                    this.b = i2 + 1;
                    return objArr[i2];
                }
                throw new NoSuchElementException("Out of elements: " + this.b);
            case 1:
                int i3 = this.b;
                ck2 ck2Var = (ck2) obj;
                if (i3 >= ck2Var.b() - ck2Var.a()) {
                    uq1.a();
                    return null;
                }
                Object obj2 = ck2Var.b.a[ck2Var.a() + i3];
                this.b = i3 + 1;
                return obj2;
            default:
                int i4 = this.b;
                this.b = i4 + 1;
                wr3 wr3Var = (wr3) ((hb) obj).b;
                return wr3Var.d(wr3Var.d[i4] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
