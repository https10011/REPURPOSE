package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ps1 implements Iterator {
    public String b;
    public final String c;
    public final yl d;
    public final boolean e;
    public int i;
    public final /* synthetic */ ri2 v;
    public int a = 2;
    public int f = 0;

    public ps1(ri2 ri2Var, ei eiVar, String str) {
        this.v = ri2Var;
        this.d = (yl) eiVar.d;
        this.e = eiVar.c;
        this.i = eiVar.b;
        this.c = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i = this.a;
        if (i == 4) {
            uq1.n();
            return false;
        }
        int iV = ts.v(i);
        if (iV == 0) {
            return true;
        }
        if (iV != 2) {
            this.a = 4;
            int i2 = this.f;
            while (true) {
                int length = this.f;
                if (length == -1) {
                    this.a = 3;
                    string = null;
                    break;
                }
                xl xlVar = (xl) this.v.a;
                String str = this.c;
                int length2 = str.length();
                yv2.m(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == xlVar.i) {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f = -1;
                } else {
                    this.f = length + 1;
                }
                int i3 = this.f;
                if (i3 == i2) {
                    int i4 = i3 + 1;
                    this.f = i4;
                    if (i4 > str.length()) {
                        this.f = -1;
                    }
                } else {
                    yl ylVar = this.d;
                    if (i2 < length) {
                        str.charAt(i2);
                        ylVar.getClass();
                    }
                    if (length > i2) {
                        str.charAt(length - 1);
                        ylVar.getClass();
                    }
                    if (!this.e || i2 != length) {
                        int i5 = this.i;
                        if (i5 == 1) {
                            length = str.length();
                            this.f = -1;
                            if (length > i2) {
                                str.charAt(length - 1);
                                ylVar.getClass();
                            }
                        } else {
                            this.i = i5 - 1;
                        }
                        string = str.subSequence(i2, length).toString();
                        break;
                    }
                    i2 = this.f;
                }
            }
            this.b = string;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            uq1.a();
            return null;
        }
        this.a = 2;
        String str = this.b;
        this.b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
