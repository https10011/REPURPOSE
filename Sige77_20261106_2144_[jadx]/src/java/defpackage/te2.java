package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class te2 implements ServiceConnection {
    public final Context a;
    public final Handler.Callback b;
    public Messenger c;
    public final Messenger d = new Messenger(new c6(this, 5));

    public te2(Context context, Handler.Callback callback) {
        this.a = context;
        this.b = callback;
    }

    public final void a() {
        try {
            Intent intent = new Intent();
            intent.setClassName("com.hoffnung", "com.transsion.dataservice.binder.DCService");
            this.a.bindService(intent, this, 1);
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        am2.g("onServiceConnected");
        try {
            Message messageObtain = Message.obtain((Handler) null, 100);
            Bundle bundle = new Bundle();
            bundle.putString("key", "oneid");
            messageObtain.setData(bundle);
            messageObtain.replyTo = this.d;
            Messenger messenger = new Messenger(iBinder);
            this.c = messenger;
            messenger.send(messageObtain);
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        am2.g("onServiceDisconnected");
    }
}
