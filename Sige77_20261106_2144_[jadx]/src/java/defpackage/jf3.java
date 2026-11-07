package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jf3 {
    public static final tr3 b = tr3.a(new byte[0]);
    public final HashMap a;

    public jf3(HashMap map) {
        this.a = map;
    }

    public final Iterable a(byte[] bArr) {
        List list;
        tr3 tr3Var = b;
        HashMap map = this.a;
        List list2 = (List) map.get(tr3Var);
        if (bArr.length >= 5) {
            list = (List) map.get(new tr3(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (list2 == null && list == null) {
            return new ArrayList();
        }
        if (list2 == null) {
            return list;
        }
        return list == null ? list2 : new qs1(this, list, list2);
    }
}
