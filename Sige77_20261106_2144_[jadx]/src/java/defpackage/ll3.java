package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ll3 implements ac {
    public static ll3 e;
    public int a;
    public final Object b;
    public final Object c;
    public Object d;

    public ll3(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = new xe3(this);
        this.a = 1;
        this.c = scheduledExecutorService;
        this.b = context.getApplicationContext();
    }

    public static synchronized ll3 a(Context context) {
        try {
            if (e == null) {
                e = new ll3(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new j61("MessengerIpcClient"))));
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public synchronized Task b(xg3 xg3Var) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(xg3Var.toString()));
            }
            if (!((xe3) this.d).d(xg3Var)) {
                xe3 xe3Var = new xe3(this);
                this.d = xe3Var;
                xe3Var.d(xg3Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return xg3Var.b.getTask();
    }

    @Override // defpackage.ac
    public ListenableFuture call() {
        bg3 bg3Var = (bg3) this.b;
        wk2 wk2Var = (wk2) this.c;
        int i = this.a;
        ArrayList arrayList = (ArrayList) this.d;
        ListenableFuture listenableFutureD = dh0.d(wk2Var);
        for (int i2 = 0; i2 < i; i2++) {
            if (((Boolean) dh0.b((Future) arrayList.get(i2))).booleanValue()) {
                if (((List) bg3Var.b).get(i2) != null) {
                    ur.a();
                    return null;
                }
                kb3 kb3Var = new kb3(1);
                int i3 = to3.a;
                listenableFutureD = dh0.g(listenableFutureD, new bg3(4, vm3.a(), kb3Var), t10.a);
            }
        }
        return listenableFutureD;
    }

    public /* synthetic */ ll3(bg3 bg3Var, wk2 wk2Var, int i, ArrayList arrayList) {
        this.b = bg3Var;
        this.c = wk2Var;
        this.a = i;
        this.d = arrayList;
    }
}
