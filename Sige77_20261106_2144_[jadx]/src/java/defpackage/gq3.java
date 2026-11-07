package defpackage;

import io.jsonwebtoken.JwtParser;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gq3 extends iq3 {
    public int b;

    @Override // defpackage.iq3
    public final String a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', JwtParser.SEPARATOR_CHAR);
    }

    @Override // defpackage.iq3
    public final String b() {
        return "logInternal";
    }

    @Override // defpackage.iq3
    public final int c() {
        return 44;
    }

    @Override // defpackage.iq3
    public final String d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // defpackage.iq3
    public final String e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof gq3;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        this.b = -1391114360;
        return -1391114360;
    }
}
