package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c6 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c6(ServiceConnection serviceConnection, int i) {
        this.a = i;
        this.b = serviceConnection;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int size;
        rc2[] rc2VarArr;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                    return;
                } else {
                    if (i != 1) {
                        return;
                    }
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
            case 1:
                super.handleMessage(message);
                yg ygVar = (yg) this.b;
                int i2 = yg.MODE_SONIC_WITH_OFFLINE_CACHE;
                ygVar.A();
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                ((mz0) this.b).a();
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                co coVar = (co) this.b;
                while (true) {
                    synchronized (((HashMap) coVar.e)) {
                        try {
                            size = ((ArrayList) coVar.c).size();
                            if (size <= 0) {
                                return;
                            }
                            rc2VarArr = new rc2[size];
                            ((ArrayList) coVar.c).toArray(rc2VarArr);
                            ((ArrayList) coVar.c).clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i3 = 0; i3 < size; i3++) {
                        rc2 rc2Var = rc2VarArr[i3];
                        int size2 = ((ArrayList) rc2Var.c).size();
                        for (int i4 = 0; i4 < size2; i4++) {
                            oz0 oz0Var = (oz0) ((ArrayList) rc2Var.c).get(i4);
                            if (!oz0Var.d) {
                                oz0Var.b.onReceive((Context) coVar.a, (Intent) rc2Var.b);
                            }
                        }
                    }
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                if (mt.a.contains(this)) {
                    return;
                }
                try {
                    message.getClass();
                    vb1 vb1Var = (vb1) this.b;
                    if (message.what == vb1Var.i) {
                        Bundle data = message.getData();
                        if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            vb1Var.a(null);
                        } else {
                            vb1Var.a(data);
                        }
                        try {
                            vb1Var.a.unbindService(vb1Var);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    mt.a(this, th2);
                    return;
                }
            default:
                am2.g("ReplyMessenger msg.what = " + message.what);
                te2 te2Var = (te2) this.b;
                Handler.Callback callback = te2Var.b;
                if (callback != null) {
                    callback.handleMessage(message);
                }
                try {
                    if (te2Var.c != null) {
                        te2Var.c = null;
                        te2Var.a.unbindService(te2Var);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    am2.l(Log.getStackTraceString(e));
                    return;
                }
        }
    }

    public /* synthetic */ c6(int i) {
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}
