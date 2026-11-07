package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yb2 {
    public static final HashMap o = new HashMap();
    public final Context a;
    public final eg2 b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final lg2 i;
    public wb2 m;
    public IInterface n;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final ig2 k = new IBinder.DeathRecipient() { // from class: ig2
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            yb2 yb2Var = this.a;
            int i = 0;
            yb2Var.b.b("reportBinderDeath", new Object[0]);
            if (yb2Var.j.get() != null) {
                ur.a();
                return;
            }
            yb2Var.b.b("%s : Binder has died.", yb2Var.c);
            ArrayList arrayList = yb2Var.d;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((fg2) obj).a(new RemoteException(String.valueOf(yb2Var.c).concat(" : Binder has died.")));
            }
            yb2Var.d.clear();
            synchronized (yb2Var.f) {
                yb2Var.e();
            }
        }
    };
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [ig2] */
    public yb2(Context context, eg2 eg2Var, String str, Intent intent, lg2 lg2Var) {
        this.a = context;
        this.b = eg2Var;
        this.c = str;
        this.h = intent;
        this.i = lg2Var;
    }

    public static void b(yb2 yb2Var, fg2 fg2Var) {
        IInterface iInterface = yb2Var.n;
        eg2 eg2Var = yb2Var.b;
        ArrayList arrayList = yb2Var.d;
        int i = 0;
        if (iInterface != null || yb2Var.g) {
            if (!yb2Var.g) {
                fg2Var.run();
                return;
            } else {
                eg2Var.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(fg2Var);
                return;
            }
        }
        eg2Var.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(fg2Var);
        wb2 wb2Var = new wb2(yb2Var, i);
        yb2Var.m = wb2Var;
        yb2Var.g = true;
        if (yb2Var.a.bindService(yb2Var.h, wb2Var, 1)) {
            return;
        }
        eg2Var.b("Failed to bind to the service.", new Object[0]);
        yb2Var.g = false;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((fg2) obj).a(new ec2("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(fg2 fg2Var, TaskCompletionSource taskCompletionSource) {
        a().post(new jg2(this, fg2Var.c(), taskCompletionSource, fg2Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        a().post(new sb2(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
