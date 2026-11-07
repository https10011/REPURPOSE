package defpackage;

import android.os.IInterface;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ir0 extends pg2 implements IInterface {
    public final /* synthetic */ TaskCompletionSource b;

    public ir0(TaskCompletionSource taskCompletionSource) {
        this.b = taskCompletionSource;
        attachInterface(this, "com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks");
    }
}
