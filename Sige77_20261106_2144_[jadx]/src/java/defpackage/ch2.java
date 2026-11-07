package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ch2 extends th2 {
    public final Context a;
    public final /* synthetic */ qj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch2(qj0 qj0Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = qj0Var;
        this.a = context.getApplicationContext();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws GooglePlayServicesMissingManifestValueException, GooglePlayServicesIncorrectManifestValueException {
        int i = message.what;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 39);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int i2 = rj0.a;
        qj0 qj0Var = this.b;
        Context context = this.a;
        int iC = qj0Var.c(context, i2);
        int i3 = xj0.e;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = qj0Var.a(iC, context, "n");
            qj0Var.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
