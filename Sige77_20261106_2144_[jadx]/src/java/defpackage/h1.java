package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class h1 extends df1 {
    @Override // defpackage.df1
    public final int a(int i) {
        return (d().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // defpackage.df1
    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
