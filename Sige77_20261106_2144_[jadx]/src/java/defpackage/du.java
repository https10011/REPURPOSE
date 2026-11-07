package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface du {
    boolean isAvailableOnDevice();

    void onGetCredential(Context context, ei0 ei0Var, CancellationSignal cancellationSignal, Executor executor, cu cuVar);
}
