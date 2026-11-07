package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mu2 extends th2 {
    public final /* synthetic */ jf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu2(jf jfVar, Looper looper) {
        super(looper, 4);
        this.a = jfVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        dj2 dj2Var;
        jf jfVar = this.a;
        int i = jfVar.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (dj2Var = (dj2) message.obj) != null) {
                synchronized (dj2Var) {
                    dj2Var.a = null;
                }
                jf jfVar2 = dj2Var.c;
                synchronized (jfVar2.l) {
                    jfVar2.l.remove(dj2Var);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !jfVar.q()) {
            dj2 dj2Var2 = (dj2) message.obj;
            if (dj2Var2 != null) {
                synchronized (dj2Var2) {
                    dj2Var2.a = null;
                }
                jf jfVar3 = dj2Var2.c;
                synchronized (jfVar3.l) {
                    jfVar3.l.remove(dj2Var2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            jfVar.u = new ConnectionResult(message.arg2, (PendingIntent) null, (String) null);
            if (!jfVar.v && !TextUtils.isEmpty(jfVar.m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(jfVar.m());
                    if (!jfVar.v) {
                        jfVar.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = jfVar.u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, (PendingIntent) null, (String) null);
            }
            jfVar.j.c(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = jfVar.u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, (PendingIntent) null, (String) null);
            }
            jfVar.j.c(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            jfVar.j.c(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, (String) null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            jfVar.u(5, null);
            ff ffVar = jfVar.o;
            if (ffVar != null) {
                ffVar.d(message.arg2);
            }
            System.currentTimeMillis();
            jfVar.t(5, 1, null);
            return;
        }
        if (i4 == 2 && !jfVar.p()) {
            dj2 dj2Var3 = (dj2) message.obj;
            if (dj2Var3 != null) {
                synchronized (dj2Var3) {
                    dj2Var3.a = null;
                }
                jf jfVar4 = dj2Var3.c;
                synchronized (jfVar4.l) {
                    jfVar4.l.remove(dj2Var3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            Log.wtf("GmsClient", ck1.s(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        dj2 dj2Var4 = (dj2) message.obj;
        synchronized (dj2Var4) {
            try {
                bool = dj2Var4.a;
                if (dj2Var4.b) {
                    String string = dj2Var4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            jf jfVar5 = dj2Var4.f;
            int i6 = dj2Var4.d;
            if (i6 != 0) {
                jfVar5.u(1, null);
                Bundle bundle = dj2Var4.e;
                dj2Var4.b(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, (String) null));
            } else if (!dj2Var4.a()) {
                jfVar5.u(1, null);
                dj2Var4.b(new ConnectionResult(8, (PendingIntent) null, (String) null));
            }
        }
        synchronized (dj2Var4) {
            dj2Var4.b = true;
        }
        synchronized (dj2Var4) {
            dj2Var4.a = null;
        }
        jf jfVar6 = dj2Var4.c;
        synchronized (jfVar6.l) {
            jfVar6.l.remove(dj2Var4);
        }
    }
}
