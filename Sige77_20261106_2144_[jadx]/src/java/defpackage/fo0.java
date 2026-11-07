package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fo0 extends bs0 {
    public final /* synthetic */ int b = 0;
    public int c;
    public int d;
    public final /* synthetic */ Serializable e;

    public fo0(go0 go0Var) {
        super(0);
        this.e = go0Var;
        this.c = go0Var.b;
        this.d = ((int) ((lo0.a * ((long) (go0Var.a.length >> 1))) >>> 32)) << 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.b) {
            case 0:
                return this.c > 0;
            default:
                return this.c > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object[] objArr;
        int length;
        Object obj;
        Object obj2;
        int i = this.b;
        Serializable serializable = this.e;
        switch (i) {
            case 0:
                if (this.c <= 0) {
                    uq1.a();
                    return null;
                }
                do {
                    objArr = ((go0) serializable).a;
                    int i2 = this.d;
                    if (lo0.b) {
                        length = i2 + 2;
                        if (length >= objArr.length) {
                            length = 0;
                        }
                    } else {
                        length = i2 - 2;
                        if (length < 0) {
                            length = objArr.length - 2;
                        }
                    }
                    this.d = length;
                    obj = objArr[length];
                } while (obj == null);
                jv0 jv0Var = new jv0(obj, objArr[length + 1]);
                this.c--;
                return jv0Var;
            default:
                Object[] objArr2 = ((jo0) serializable).a;
                if (this.c <= 0) {
                    uq1.a();
                    return null;
                }
                int i3 = this.d;
                int length2 = objArr2.length;
                do {
                    if (lo0.b) {
                        i3++;
                        if (i3 >= length2) {
                            i3 = 0;
                        }
                    } else {
                        i3--;
                        if (i3 < 0) {
                            i3 = length2 - 1;
                        }
                    }
                    obj2 = objArr2[i3];
                } while (obj2 == null);
                this.d = i3;
                this.c--;
                return obj2;
        }
    }

    public fo0(jo0 jo0Var) {
        super(0);
        this.e = jo0Var;
        this.c = jo0Var.b;
        this.d = (int) ((lo0.a * ((long) jo0Var.a.length)) >>> 32);
    }
}
