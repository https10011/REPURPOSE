package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ci0 extends ku {
    public final Context d;
    public cu e;
    public Executor f;
    public CancellationSignal g;
    public final GetCredentialController.resultReceiver.1 h;

    public ci0(Context context) {
        context.getClass();
        this.d = context;
        this.h = new GetCredentialController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }
}
