package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.Binder;
import android.os.Process;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class na1 implements ij0, cv1 {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ na1(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public ApplicationInfo a(int i, String str) {
        return this.b.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo b(int i, String str) {
        return this.b.getPackageManager().getPackageInfo(str, i);
    }

    public boolean c() {
        String nameForUid;
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.b;
        if (callingUid == iMyUid) {
            return rq0.x(context);
        }
        if (!nj2.H() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return context.getPackageManager().isInstantApp(nameForUid);
    }

    @Override // defpackage.ij0
    public Object get() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 1:
                return (ConnectivityManager) context.getSystemService("connectivity");
            default:
                Object obj = ka3.a;
                return r93.m0(context);
        }
    }
}
