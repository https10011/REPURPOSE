package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class d73 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xe3 b;

    public /* synthetic */ d73(xe3 xe3Var, int i) {
        this.a = i;
        this.b = xe3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                xe3 xe3Var = this.b;
                synchronized (xe3Var) {
                    if (xe3Var.a == 1) {
                        xe3Var.a("Timed out while binding");
                    }
                    break;
                }
                return;
            default:
                this.b.a("Service disconnected");
                return;
        }
        while (true) {
            xe3 xe3Var2 = this.b;
            synchronized (xe3Var2) {
                try {
                    if (xe3Var2.a != 2) {
                        return;
                    }
                    if (xe3Var2.d.isEmpty()) {
                        xe3Var2.c();
                        return;
                    }
                    xg3 xg3Var = (xg3) xe3Var2.d.poll();
                    xe3Var2.e.put(xg3Var.a, xg3Var);
                    ((ScheduledExecutorService) xe3Var2.f.c).schedule(new z83(7, xe3Var2, xg3Var, false), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(xg3Var)));
                    }
                    ll3 ll3Var = xe3Var2.f;
                    Messenger messenger = xe3Var2.b;
                    int i = xg3Var.c;
                    Context context = (Context) ll3Var.b;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i;
                    messageObtain.arg1 = xg3Var.a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", xg3Var.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", xg3Var.d);
                    messageObtain.setData(bundle);
                    try {
                        f91 f91Var = xe3Var2.c;
                        Messenger messenger2 = (Messenger) f91Var.b;
                        if (messenger2 != null) {
                            messenger2.send(messageObtain);
                        } else {
                            zzd zzdVar = (zzd) f91Var.c;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.a;
                            messenger3.getClass();
                            messenger3.send(messageObtain);
                        }
                    } catch (RemoteException e) {
                        xe3Var2.a(e.getMessage());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
