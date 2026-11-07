package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.hjq.toast.ToastUtils;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class v20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x20 b;

    public /* synthetic */ v20(x20 x20Var, int i) {
        this.a = i;
        this.b = x20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        x20 x20Var = this.b;
        switch (i) {
            case 0:
                x20Var.a.setIndeterminate(true);
                break;
            case 1:
                Context context = x20Var.b;
                if (Build.VERSION.SDK_INT >= 26 && !context.getPackageManager().canRequestPackageInstalls()) {
                    try {
                        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName()));
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                        break;
                    } catch (Exception unused) {
                    }
                    ToastUtils.show((CharSequence) context.getResources().getString(2131886119));
                } else {
                    File file = new File(context.getExternalFilesDir(null), "update.apk");
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.addFlags(1);
                    intent2.addFlags(268435456);
                    intent2.setDataAndType(FileProvider.d(context, context.getPackageName() + ".fileprovider", file), "application/vnd.android.package-archive");
                    try {
                        context.startActivity(intent2);
                    } catch (Exception e) {
                        kv.o("start installer failed", e);
                        ToastUtils.show((CharSequence) context.getResources().getString(2131886119));
                    }
                }
                break;
            default:
                try {
                    x20Var.a.dismiss();
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
