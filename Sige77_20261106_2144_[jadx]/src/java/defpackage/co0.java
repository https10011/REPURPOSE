package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class co0 implements ListIterator {
    public final yn0 a;
    public final int b;
    public final boolean c;
    public int d;

    public co0(yn0 yn0Var, int i) {
        this.a = yn0Var;
        this.b = i;
        this.d = 0;
        this.c = false;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.d != this.b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.c) {
            return this.d != 0;
        }
        boolean z = lo0.b;
        uq1.k();
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        try {
            int i = this.d;
            Object obj = this.a.get(i);
            this.d = i + 1;
            return obj;
        } catch (IndexOutOfBoundsException unused) {
            uq1.a();
            return null;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        if (this.c) {
            return this.d;
        }
        boolean z = lo0.b;
        uq1.k();
        return 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!this.c) {
            boolean z = lo0.b;
            uq1.k();
            return null;
        }
        try {
            int i = this.d - 1;
            Object obj = this.a.get(i);
            this.d = i;
            return obj;
        } catch (IndexOutOfBoundsException unused) {
            uq1.a();
            return null;
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        if (this.c) {
            return this.d - 1;
        }
        boolean z = lo0.b;
        uq1.k();
        return 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        boolean z = lo0.b;
        throw new UnsupportedOperationException();
    }

    public co0(yn0 yn0Var, int i, int i2) {
        this.a = yn0Var;
        this.b = i;
        this.d = i2;
        this.c = true;
    }
}
