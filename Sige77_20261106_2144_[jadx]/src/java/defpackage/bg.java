package defpackage;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class bg implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bg(yg ygVar, Object obj, int i) {
        this.a = i;
        this.b = ygVar;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        Object obj = this.c;
        yg ygVar = this.b;
        switch (i2) {
            case 0:
                String str = (String) obj;
                if (i != 0) {
                    int i3 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                } else {
                    ygVar.u0.execute(new zf(ygVar, str, 4));
                }
                break;
            default:
                boolean z = X5_Activity.V0;
                new Handler(Looper.getMainLooper()).postDelayed(new zs0(9, (X5_Activity) ygVar, (CountDownLatch) obj), 500L);
                break;
        }
    }
}
