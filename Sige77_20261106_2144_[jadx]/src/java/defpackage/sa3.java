package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class sa3 {
    public static final mb a = new mb(0);

    public static synchronized void a() {
        mb mbVar = a;
        Iterator it = ((lb) mbVar.values()).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            throw null;
        }
        mbVar.clear();
    }
}
