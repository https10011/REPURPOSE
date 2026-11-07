package defpackage;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class of implements Handler.Callback {
    public final /* synthetic */ int a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 0 || i == 1) {
                    message.obj.getClass();
                    ur.a();
                }
                return false;
            case 1:
                if (message.what != 1) {
                    return false;
                }
                qc1 qc1Var = (qc1) message.obj;
                qc1Var.d.l(qc1Var);
                return true;
            default:
                if (message.what != 1) {
                    return false;
                }
                ((pi1) message.obj).e();
                return true;
        }
    }
}
