package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class st2 implements Iterator {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ st2(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.b < ((vt2) this.c).a.length();
            case 1:
                return this.b < ((vt2) this.c).a.length();
            default:
                return this.b < ((lm2) this.c).i();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                String str = ((vt2) obj).a;
                int i2 = this.b;
                if (i2 < str.length()) {
                    this.b = i2 + 1;
                    return new vt2(String.valueOf(i2));
                }
                uq1.a();
                return null;
            case 1:
                vt2 vt2Var = (vt2) obj;
                String str2 = vt2Var.a;
                int i3 = this.b;
                if (i3 < str2.length()) {
                    this.b = i3 + 1;
                    return new vt2(String.valueOf(vt2Var.a.charAt(i3)));
                }
                uq1.a();
                return null;
            default:
                lm2 lm2Var = (lm2) obj;
                int i4 = this.b;
                int i5 = lm2Var.i();
                int i6 = this.b;
                if (i4 >= i5) {
                    throw new NoSuchElementException(ck1.s(i6, "Out of bounds index: ", new StringBuilder(String.valueOf(i6).length() + 21)));
                }
                this.b = i6 + 1;
                return lm2Var.k(i6);
        }
    }
}
