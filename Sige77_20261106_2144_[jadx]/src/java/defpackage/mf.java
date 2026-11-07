package defpackage;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mf extends th2 {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("BasePendingResult", ck1.s(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.v);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            ur.a();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            xv1 xv1Var = BasePendingResult.j;
            throw e;
        }
    }
}
