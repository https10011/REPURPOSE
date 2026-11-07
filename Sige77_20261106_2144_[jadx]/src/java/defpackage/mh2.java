package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mh2 {
    public final int a;

    public mh2(int i) {
        this.a = i;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (ConnectionResult) null);
    }

    public abstract void a(Status status);

    public abstract void b(Exception exc);

    public abstract void c(md2 md2Var, boolean z);

    public abstract void d(rg2 rg2Var);
}
