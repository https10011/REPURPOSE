package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yi1 implements f51 {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ yi1(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        int i = this.a;
        Resources resources = this.b;
        switch (i) {
            case 0:
                return new zb(resources, ep1Var.i(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new zb(resources, ep1Var.i(Uri.class, InputStream.class));
            default:
                return new zb(resources, r22.b);
        }
    }
}
