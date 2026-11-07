package defpackage;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ei3 extends hi3 implements xh3 {
    public final File a;

    public ei3(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = file;
    }

    @Override // defpackage.xh3
    public final File zza() {
        return this.a;
    }
}
