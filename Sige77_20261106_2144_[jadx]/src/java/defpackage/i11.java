package defpackage;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i11 extends k11 implements Iterator, KMutableIterator {
    public final /* synthetic */ int e;

    public i11(l11 l11Var, int i) {
        this.e = i;
        l11Var.getClass();
        this.d = l11Var;
        this.b = -1;
        this.c = l11Var.v;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                b();
                int i = this.a;
                l11 l11Var = (l11) this.d;
                if (i >= l11Var.f) {
                    uq1.a();
                    return null;
                }
                this.a = i + 1;
                this.b = i;
                j11 j11Var = new j11(l11Var, i);
                e();
                return j11Var;
            case 1:
                b();
                int i2 = this.a;
                l11 l11Var2 = (l11) this.d;
                if (i2 >= l11Var2.f) {
                    uq1.a();
                    return null;
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = l11Var2.a[i2];
                e();
                return obj;
            default:
                b();
                int i3 = this.a;
                l11 l11Var3 = (l11) this.d;
                if (i3 >= l11Var3.f) {
                    uq1.a();
                    return null;
                }
                this.a = i3 + 1;
                this.b = i3;
                Object[] objArr = l11Var3.b;
                objArr.getClass();
                Object obj2 = objArr[this.b];
                e();
                return obj2;
        }
    }
}
