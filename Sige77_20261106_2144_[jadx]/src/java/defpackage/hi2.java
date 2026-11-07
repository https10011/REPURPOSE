package defpackage;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hi2 {
    public hz0 a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile cc g;
    public volatile cc h;
    public final Semaphore i;
    public final Set j;

    public hi2(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            boolean z = this.b;
            if (!z) {
                if (z) {
                    c();
                } else {
                    this.e = true;
                }
            }
            cc ccVar = this.h;
            cc ccVar2 = this.g;
            if (ccVar != null) {
                ccVar2.getClass();
                this.g = null;
                return;
            }
            ccVar2.getClass();
            cc ccVar3 = this.g;
            ccVar3.c.set(true);
            if (ccVar3.a.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        cc ccVar = this.g;
        Executor executor = this.f;
        if (ccVar.b == 1) {
            ccVar.b = 2;
            executor.execute(ccVar.a);
            return;
        }
        int iV = ts.v(ccVar.b);
        if (iV == 1) {
            uq1.q("Cannot execute task: the task is already running.");
        } else if (iV != 2) {
            uq1.q("We should never reach this state");
        } else {
            uq1.q("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void c() {
        a();
        this.g = new cc(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((ug2) it.next()).getClass();
            uq1.k();
            return;
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
