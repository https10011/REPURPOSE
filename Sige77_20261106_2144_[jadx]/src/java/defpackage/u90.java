package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u90 extends kl1 {
    public final HashMap e = new HashMap();

    @Override // defpackage.kl1
    public final hl1 a(Object obj) {
        return (hl1) this.e.get(obj);
    }

    @Override // defpackage.kl1
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.e.remove(obj);
        return objB;
    }
}
