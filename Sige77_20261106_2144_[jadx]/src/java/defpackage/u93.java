package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class u93 implements cv1, ac, gr3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ u93(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ac
    public /* synthetic */ ListenableFuture call() {
        return (v0) this.b;
    }

    @Override // defpackage.cv1
    public Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((qp0) obj).a;
                Object obj2 = y93.j;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 0);
                    applicationInfo.getClass();
                    return new sc1(applicationInfo);
                } catch (PackageManager.NameNotFoundException unused) {
                    return x.a;
                }
            default:
                q51 q51Var = (q51) ((cv1) obj).get();
                q51Var.getClass();
                h02 h02Var = new h02(hz2.c);
                return new o51(h02Var, q51Var.b.schedule(h02Var, 10000L, TimeUnit.MILLISECONDS));
        }
    }

    @Override // defpackage.gr3
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            Provider provider = Security.getProvider(strArr[i2]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        int size = arrayList.size();
        Exception exc = null;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                return ((kr3) this.b).a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
