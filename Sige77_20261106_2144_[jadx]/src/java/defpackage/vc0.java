package defpackage;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class vc0 implements OnSuccessListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ vc0(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        boolean z;
        int i = this.a;
        FirebaseMessaging firebaseMessaging = this.b;
        switch (i) {
            case 0:
                yy1 yy1Var = (yy1) obj;
                if (!firebaseMessaging.e.f() || yy1Var.h.a() == null) {
                    return;
                }
                synchronized (yy1Var) {
                    z = yy1Var.g;
                }
                if (z) {
                    return;
                }
                yy1Var.f(0L);
                return;
            default:
                CloudMessage cloudMessage = (CloudMessage) obj;
                if (cloudMessage != null) {
                    sp0.t(cloudMessage.a);
                    firebaseMessaging.e();
                    return;
                }
                return;
        }
    }
}
