package defpackage;

import java.io.File;
import kotlin.io.FileWalkDirection;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public class ub0 extends tb0 {
    public static boolean d(File file) {
        file.getClass();
        mb0 mb0Var = new mb0(new ob0(file, FileWalkDirection.b, null, null, null, 0, 32, null));
        while (true) {
            boolean z = true;
            while (mb0Var.hasNext()) {
                File file2 = (File) mb0Var.next();
                if (file2.delete() || !file2.exists()) {
                    if (z) {
                    }
                }
                z = false;
            }
            return z;
        }
    }
}
