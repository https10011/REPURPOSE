package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ta0 implements lw {
    public final String a;
    public final AssetManager b;
    public Object c;
    public final /* synthetic */ int d;

    public ta0(AssetManager assetManager, String str, int i) {
        this.d = i;
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.lw
    public final Class a() {
        switch (this.d) {
            case 0:
                return AssetFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.lw
    public final void h() {
        Object obj = this.c;
        if (obj == null) {
            return;
        }
        try {
            switch (this.d) {
                case 0:
                    ((AssetFileDescriptor) obj).close();
                    break;
                default:
                    ((InputStream) obj).close();
                    break;
            }
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        Object objOpenFd;
        try {
            AssetManager assetManager = this.b;
            String str = this.a;
            switch (this.d) {
                case 0:
                    objOpenFd = assetManager.openFd(str);
                    break;
                default:
                    objOpenFd = assetManager.open(str);
                    break;
            }
            this.c = objOpenFd;
            kwVar.c(objOpenFd);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            kwVar.b(e);
        }
    }

    @Override // defpackage.lw
    public final int j() {
        return 1;
    }

    @Override // defpackage.lw
    public final void cancel() {
    }
}
