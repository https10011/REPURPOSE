package defpackage;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gi3 extends ki3 implements xh3 {
    public final FileOutputStream a;
    public final File b;

    public gi3(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.xh3
    public final File zza() {
        return this.b;
    }
}
