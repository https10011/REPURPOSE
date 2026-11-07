package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vh3 implements xi3 {
    @Override // defpackage.xi3
    public final ei3 a(Uri uri) throws tn {
        File fileL = bj0.L(uri);
        return new ei3(new FileInputStream(fileL), fileL);
    }

    @Override // defpackage.xi3
    public final boolean b(Uri uri) {
        return bj0.L(uri).exists();
    }

    @Override // defpackage.xi3
    public final OutputStream c(Uri uri) throws IOException {
        File fileL = bj0.L(uri);
        aj0.l(fileL);
        return new gi3(new FileOutputStream(fileL), fileL);
    }

    @Override // defpackage.xi3
    public final void d(Uri uri) throws IOException {
        File fileL = bj0.L(uri);
        if (fileL.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileL.delete()) {
            return;
        }
        if (!fileL.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.xi3
    public final void e(Uri uri, Uri uri2) throws IOException {
        File fileL = bj0.L(uri);
        File fileL2 = bj0.L(uri2);
        aj0.l(fileL2);
        if (!fileL.renameTo(fileL2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }

    @Override // defpackage.xi3
    public final File f(Uri uri) {
        return bj0.L(uri);
    }

    @Override // defpackage.xi3
    public final String zzc() {
        return "file";
    }
}
