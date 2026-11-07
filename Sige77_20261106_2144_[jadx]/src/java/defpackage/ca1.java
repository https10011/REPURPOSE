package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ca1 extends b1 implements RandomAccess {
    public static final /* synthetic */ int d = 0;
    public final rj[] b;
    public final int[] c;

    public ca1(rj[] rjVarArr, int[] iArr) {
        this.b = rjVarArr;
        this.c = iArr;
    }

    @Override // defpackage.d0
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.d0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof rj) {
            return super.contains((rj) obj);
        }
        return false;
    }

    @Override // defpackage.b1, java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // defpackage.b1, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof rj) {
            return super.indexOf((rj) obj);
        }
        return -1;
    }

    @Override // defpackage.b1, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof rj) {
            return super.lastIndexOf((rj) obj);
        }
        return -1;
    }
}
