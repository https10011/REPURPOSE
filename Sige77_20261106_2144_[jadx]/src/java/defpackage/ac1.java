package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ac1 extends zb1 {
    public final Object c;

    public ac1(int i) {
        super(i);
        this.c = new Object();
    }

    @Override // defpackage.zb1, defpackage.yb1
    public final boolean b(Object obj) {
        boolean zB;
        obj.getClass();
        synchronized (this.c) {
            zB = super.b(obj);
        }
        return zB;
    }

    @Override // defpackage.zb1, defpackage.yb1
    public final Object h() {
        Object objH;
        synchronized (this.c) {
            objH = super.h();
        }
        return objH;
    }
}
