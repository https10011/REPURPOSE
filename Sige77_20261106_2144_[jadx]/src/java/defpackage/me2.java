package defpackage;

import android.content.Context;
import com.fm.openinstall.listener.ResultCallback;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class me2 extends je2 {
    public final ResultCallback c;

    public me2(qp0 qp0Var, ResultCallback resultCallback) {
        super(qp0Var, 1);
        this.c = resultCallback;
    }

    @Override // defpackage.je2
    public final de2 F() {
        Context context = ue2.j.a;
        String str = context.getApplicationInfo().sourceDir;
        String str2 = context.getFilesDir() + File.separator + context.getPackageName() + ".apk";
        try {
            ye1.b(new File(str), new File(str2));
            return de2.b(str2);
        } catch (IOException e) {
            if (g93.i) {
                e.printStackTrace();
            }
            return ck1.b(3, e.getMessage());
        }
    }

    @Override // defpackage.lo2
    public final void i(de2 de2Var) {
        ResultCallback resultCallback = this.c;
        if (resultCallback != null) {
            resultCallback.onResult(new File(de2Var.a), de2Var.b);
        }
    }
}
