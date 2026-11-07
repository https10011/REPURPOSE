package defpackage;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k93 implements OnCompleteListener, cv1, ac, gr3 {
    public final Object a;

    public k93() {
        this.a = new AtomicInteger();
    }

    public fd3 a(String str, boolean z) {
        return new fd3(str, (bk0) this.a, z);
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        rk3 rk3Var = (rk3) this.a;
        fk3 fk3Var = new fk3(rk3Var, 3);
        int i = to3.a;
        return dh0.e(dh0.g(rk3Var.b, new bg3(4, vm3.a(), fk3Var), rk3Var.d));
    }

    @Override // defpackage.cv1
    public /* synthetic */ Object get() {
        Object obj = y93.j;
        return (mg3) ((aa1) ((cv1) this.a).get()).c();
    }

    public /* synthetic */ void onComplete(Task task) {
        h93 h93Var = (h93) this.a;
        if (task.isCanceled()) {
            h93Var.cancel(false);
            return;
        }
        if (task.isSuccessful()) {
            h93Var.l(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            h93Var.m(exception);
        } else {
            uq1.n();
        }
    }

    @Override // defpackage.gr3
    public Object zza(String str) {
        kr3 kr3Var = (kr3) this.a;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 2; i2++) {
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
                return kr3Var.a(str, (Provider) obj);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return kr3Var.a(str, null);
    }

    public /* synthetic */ k93(Object obj) {
        this.a = obj;
    }
}
