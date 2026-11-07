package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yo0 implements Serializable {
    public final Comparator a;
    public final Object[] b;

    public yo0(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    public Object readResolve() {
        xo0 xo0Var = new xo0(this.a);
        xo0Var.b(this.b);
        return xo0Var.e();
    }
}
