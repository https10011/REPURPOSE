package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g10 {
    public final Executor a;
    public final gd1 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public k10[] g;
    public byte[] h;

    public g10(AssetManager assetManager, Executor executor, gd1 gd1Var, String str, File file) {
        this.a = executor;
        this.b = gd1Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 24:
                case 25:
                    bArr = qt.g;
                    break;
                case 26:
                    bArr = qt.f;
                    break;
                case 27:
                    bArr = qt.e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = qt.d;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = qt.c;
                    break;
            }
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.b.j();
            return null;
        }
    }

    public final void b(int i, Serializable serializable) {
        this.a.execute(new f10(this, i, 0, serializable));
    }
}
