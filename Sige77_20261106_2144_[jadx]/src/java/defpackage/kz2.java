package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kz2 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ jf b;

    public kz2(jf jfVar, int i) {
        this.b = jfVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        jf jfVar = this.b;
        if (iBinder == null) {
            synchronized (jfVar.g) {
                i = jfVar.n;
            }
            if (i == 3) {
                jfVar.v = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            mu2 mu2Var = jfVar.f;
            mu2Var.sendMessage(mu2Var.obtainMessage(i2, jfVar.x.get(), 16));
            return;
        }
        synchronized (jfVar.h) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                jfVar.i = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ej2)) ? new ej2(iBinder) : (ej2) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        jf jfVar2 = this.b;
        int i3 = this.a;
        jfVar2.getClass();
        j13 j13Var = new j13(jfVar2, 0, null);
        mu2 mu2Var2 = jfVar2.f;
        mu2Var2.sendMessage(mu2Var2.obtainMessage(7, i3, -1, j13Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        jf jfVar = this.b;
        synchronized (jfVar.h) {
            jfVar.i = null;
        }
        jf jfVar2 = this.b;
        int i = this.a;
        mu2 mu2Var = jfVar2.f;
        mu2Var.sendMessage(mu2Var.obtainMessage(6, i, 1));
    }
}
