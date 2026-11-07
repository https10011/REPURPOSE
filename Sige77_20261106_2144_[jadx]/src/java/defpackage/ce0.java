package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ce0 implements e50 {
    public final Context a;
    public final be0 b;
    public final qh1 c;
    public final Object d = new Object();
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor i;
    public kv v;

    public ce0(Context context, be0 be0Var) {
        r93.n(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = be0Var;
        this.c = de0.d;
    }

    public final void a() {
        synchronized (this.d) {
            try {
                this.v = null;
                Handler handler = this.e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.e = null;
                ThreadPoolExecutor threadPoolExecutor = this.i;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f = null;
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final me0 b() {
        try {
            qh1 qh1Var = this.c;
            Context context = this.a;
            be0 be0Var = this.b;
            qh1Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{be0Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            f6 f6VarA = ae0.a(context, Collections.unmodifiableList(arrayList));
            int i = f6VarA.b;
            if (i != 0) {
                uq1.m(ts.g(i, "fetchFonts failed (", ")"));
                return null;
            }
            me0[] me0VarArr = (me0[]) ((List) f6VarA.c).get(0);
            if (me0VarArr != null && me0VarArr.length != 0) {
                return me0VarArr[0];
            }
            uq1.m("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            sm0.m("provider not found", e);
            return null;
        }
    }

    @Override // defpackage.e50
    public final void d(kv kvVar) {
        synchronized (this.d) {
            this.v = kvVar;
        }
        synchronized (this.d) {
            try {
                if (this.v == null) {
                    return;
                }
                if (this.f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new rq("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.i = threadPoolExecutor;
                    this.f = threadPoolExecutor;
                }
                this.f.execute(new y1(this, 18));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
