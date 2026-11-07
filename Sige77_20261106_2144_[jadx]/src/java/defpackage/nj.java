package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nj implements Iterator {
    public final /* synthetic */ int a = 3;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Object d;

    public nj(hl2 hl2Var) {
        this.d = hl2Var;
        this.c = hl2Var.b();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < this.c;
            case 1:
                return this.b < this.c;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return this.b < this.c;
            default:
                return this.b < this.c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.d;
        int i2 = this.c;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 < i2) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((qj) obj).f(i3));
                }
                uq1.a();
                return null;
            case 1:
                int i4 = this.b;
                if (i4 < i2) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((hl2) obj).a(i4));
                }
                uq1.a();
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                int i5 = this.b;
                if (i5 < i2) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((jr2) obj).a(i5));
                }
                uq1.a();
                return null;
            default:
                int i6 = this.b;
                if (i6 < i2) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((d33) obj).b(i6));
                }
                uq1.a();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public nj(d33 d33Var) {
        this.d = d33Var;
        this.c = d33Var.d();
    }

    public nj(jr2 jr2Var) {
        this.d = jr2Var;
        this.c = jr2Var.b();
    }

    public nj(qj qjVar) {
        this.d = qjVar;
        this.c = qjVar.size();
    }
}
