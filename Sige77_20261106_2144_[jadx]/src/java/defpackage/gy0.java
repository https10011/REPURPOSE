package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.jvm.internal.markers.KMutableListIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gy0 implements ListIterator, KMutableListIterator {
    public int b;
    public int d;
    public final f1 e;
    public final /* synthetic */ int a = 0;
    public int c = -1;

    public gy0(jy0 jy0Var, int i) {
        this.e = jy0Var;
        this.b = i;
        this.d = ((AbstractList) jy0Var).modCount;
    }

    public void a() {
        if (((AbstractList) ((hy0) this.e).e).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                a();
                hy0 hy0Var = (hy0) f1Var;
                int i2 = this.b;
                this.b = i2 + 1;
                hy0Var.add(i2, obj);
                this.c = -1;
                this.d = ((AbstractList) hy0Var).modCount;
                break;
            default:
                b();
                jy0 jy0Var = (jy0) f1Var;
                int i3 = this.b;
                this.b = i3 + 1;
                jy0Var.add(i3, obj);
                this.c = -1;
                this.d = ((AbstractList) jy0Var).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((jy0) this.e)).modCount != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                return this.b < ((hy0) f1Var).c;
            default:
                return this.b < ((jy0) f1Var).b;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                a();
                int i2 = this.b;
                hy0 hy0Var = (hy0) f1Var;
                if (i2 >= hy0Var.c) {
                    uq1.a();
                    return null;
                }
                this.b = i2 + 1;
                this.c = i2;
                return hy0Var.a[hy0Var.b + i2];
            default:
                b();
                int i3 = this.b;
                jy0 jy0Var = (jy0) f1Var;
                if (i3 >= jy0Var.b) {
                    uq1.a();
                    return null;
                }
                this.b = i3 + 1;
                this.c = i3;
                return jy0Var.a[i3];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                a();
                int i2 = this.b;
                if (i2 <= 0) {
                    uq1.a();
                    return null;
                }
                int i3 = i2 - 1;
                this.b = i3;
                this.c = i3;
                hy0 hy0Var = (hy0) f1Var;
                return hy0Var.a[hy0Var.b + i3];
            default:
                b();
                int i4 = this.b;
                if (i4 <= 0) {
                    uq1.a();
                    return null;
                }
                int i5 = i4 - 1;
                this.b = i5;
                this.c = i5;
                return ((jy0) f1Var).a[i5];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.a) {
            case 0:
                i = this.b;
                break;
            default:
                i = this.b;
                break;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                hy0 hy0Var = (hy0) f1Var;
                a();
                int i2 = this.c;
                if (i2 == -1) {
                    uq1.q("Call next() or previous() before removing element from the iterator.");
                } else {
                    hy0Var.b(i2);
                    this.b = this.c;
                    this.c = -1;
                    this.d = ((AbstractList) hy0Var).modCount;
                }
                break;
            default:
                jy0 jy0Var = (jy0) f1Var;
                b();
                int i3 = this.c;
                if (i3 == -1) {
                    uq1.q("Call next() or previous() before removing element from the iterator.");
                } else {
                    jy0Var.b(i3);
                    this.b = this.c;
                    this.c = -1;
                    this.d = ((AbstractList) jy0Var).modCount;
                }
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.a;
        f1 f1Var = this.e;
        switch (i) {
            case 0:
                a();
                int i2 = this.c;
                if (i2 == -1) {
                    uq1.q("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((hy0) f1Var).set(i2, obj);
                }
                break;
            default:
                b();
                int i3 = this.c;
                if (i3 == -1) {
                    uq1.q("Call next() or previous() before replacing element from the iterator.");
                } else {
                    ((jy0) f1Var).set(i3, obj);
                }
                break;
        }
    }

    public gy0(hy0 hy0Var, int i) {
        this.e = hy0Var;
        this.b = i;
        this.d = ((AbstractList) hy0Var).modCount;
    }
}
