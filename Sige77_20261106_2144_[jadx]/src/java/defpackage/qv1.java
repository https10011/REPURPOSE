package defpackage;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qv1 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public Context b;
    public Object c;

    public qv1(rd2 rd2Var) {
        this.c = rd2Var;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        rv1 rv1Var = (rv1) this.c;
        if (rv1Var != null) {
            Context context = rv1Var.c.b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                rv1 rv1Var = (rv1) this.c;
                if (rv1Var != null && rv1Var.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    rv1 rv1Var2 = (rv1) this.c;
                    rv1Var2.c.getClass();
                    FirebaseMessaging.b(rv1Var2, 0L);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    rd2 rd2Var = (rd2) this.c;
                    mg2 mg2Var = (mg2) ((bh0) rd2Var.c).c;
                    mg2Var.b.set(null);
                    th2 th2Var = mg2Var.f.n;
                    th2Var.sendMessage(th2Var.obtainMessage(3));
                    AlertDialog alertDialog = (AlertDialog) rd2Var.b;
                    if (alertDialog.isShowing()) {
                        alertDialog.dismiss();
                    }
                    synchronized (this) {
                        try {
                            Context context3 = this.b;
                            if (context3 != null) {
                                context3.unregisterReceiver(this);
                            }
                            this.b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ qv1() {
    }
}
