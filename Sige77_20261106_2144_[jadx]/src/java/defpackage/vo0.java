package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vo0 implements Serializable {
    public final Object[] a;

    public vo0(Object[] objArr) {
        this.a = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.a;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? wo0.i(objArr.length, (Object[]) objArr.clone()) : new jr1(objArr[0]);
        }
        return mh1.W;
    }
}
