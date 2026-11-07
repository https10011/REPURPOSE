package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class po0 implements Serializable {
    public final Object[] a;

    public po0(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        no0 no0Var = ro0.b;
        Object[] objArr = this.a;
        if (objArr.length == 0) {
            return gh1.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        ga.e(objArr2.length, objArr2);
        return ro0.h(objArr2.length, objArr2);
    }
}
