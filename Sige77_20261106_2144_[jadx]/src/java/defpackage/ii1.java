package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ii1 implements ComponentCallbacks2, uw0 {
    public static final ki1 X;
    public final ki1 W;
    public final a a;
    public final Context b;
    public final mw0 c;
    public final ir1 d;
    public final ji1 e;
    public final lw1 f;
    public final i4 i;
    public final ar v;
    public final CopyOnWriteArrayList w;

    static {
        ki1 ki1Var = (ki1) new ki1().f(Bitmap.class);
        ki1Var.b0 = true;
        X = ki1Var;
        ((ki1) new ki1().f(li0.class)).b0 = true;
    }

    public ii1(a aVar, mw0 mw0Var, ji1 ji1Var, Context context) {
        ki1 ki1Var;
        ir1 ir1Var = new ir1(5);
        nk1 nk1Var = aVar.f;
        this.f = new lw1();
        i4 i4Var = new i4(this, 13);
        this.i = i4Var;
        this.a = aVar;
        this.c = mw0Var;
        this.e = ji1Var;
        this.d = ir1Var;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        hi1 hi1Var = new hi1(this, ir1Var);
        nk1Var.getClass();
        boolean z = sp0.d(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ar pyVar = z ? new py(applicationContext, hi1Var) : new q71();
        this.v = pyVar;
        synchronized (aVar.i) {
            if (aVar.i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.i.add(this);
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            mw0Var.e(this);
        } else {
            d42.t().post(i4Var);
        }
        mw0Var.e(pyVar);
        this.w = new CopyOnWriteArrayList(aVar.c.e);
        cj0 cj0Var = aVar.c;
        synchronized (cj0Var) {
            try {
                if (cj0Var.j == null) {
                    cj0Var.d.getClass();
                    ki1 ki1Var2 = new ki1();
                    ki1Var2.b0 = true;
                    cj0Var.j = ki1Var2;
                }
                ki1Var = cj0Var.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this) {
            ki1 ki1Var3 = (ki1) ki1Var.clone();
            if (ki1Var3.b0 && !ki1Var3.c0) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            ki1Var3.c0 = true;
            ki1Var3.b0 = true;
            this.W = ki1Var3;
        }
    }

    @Override // defpackage.uw0
    public final synchronized void b() {
        this.f.b();
        m();
    }

    @Override // defpackage.uw0
    public final synchronized void j() {
        n();
        this.f.j();
    }

    @Override // defpackage.uw0
    public final synchronized void k() {
        int i;
        this.f.k();
        synchronized (this) {
            try {
                ArrayList arrayListR = d42.r(this.f.a);
                int size = arrayListR.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListR.get(i2);
                    i2++;
                    l((kw1) obj);
                }
                this.f.a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        ir1 ir1Var = this.d;
        ArrayList arrayListR2 = d42.r((Set) ir1Var.c);
        int size2 = arrayListR2.size();
        while (i < size2) {
            Object obj2 = arrayListR2.get(i);
            i++;
            ir1Var.b((xh1) obj2);
        }
        ((HashSet) ir1Var.d).clear();
        this.c.c(this);
        this.c.c(this.v);
        d42.t().removeCallbacks(this.i);
        a aVar = this.a;
        synchronized (aVar.i) {
            if (!aVar.i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.i.remove(this);
        }
    }

    public final void l(kw1 kw1Var) {
        if (kw1Var == null) {
            return;
        }
        boolean zO = o(kw1Var);
        xh1 xh1VarH = kw1Var.h();
        if (zO) {
            return;
        }
        a aVar = this.a;
        synchronized (aVar.i) {
            try {
                ArrayList arrayList = aVar.i;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((ii1) obj).o(kw1Var)) {
                        return;
                    }
                }
                if (xh1VarH != null) {
                    kw1Var.f(null);
                    xh1VarH.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        ir1 ir1Var = this.d;
        ir1Var.b = true;
        ArrayList arrayListR = d42.r((Set) ir1Var.c);
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            xh1 xh1Var = (xh1) obj;
            if (xh1Var.isRunning()) {
                xh1Var.i();
                ((HashSet) ir1Var.d).add(xh1Var);
            }
        }
    }

    public final synchronized void n() {
        ir1 ir1Var = this.d;
        int i = 0;
        ir1Var.b = false;
        ArrayList arrayListR = d42.r((Set) ir1Var.c);
        int size = arrayListR.size();
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            xh1 xh1Var = (xh1) obj;
            if (!xh1Var.k() && !xh1Var.isRunning()) {
                xh1Var.j();
            }
        }
        ((HashSet) ir1Var.d).clear();
    }

    public final synchronized boolean o(kw1 kw1Var) {
        xh1 xh1VarH = kw1Var.h();
        if (xh1VarH == null) {
            return true;
        }
        if (!this.d.b(xh1VarH)) {
            return false;
        }
        this.f.a.remove(kw1Var);
        kw1Var.f(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.e + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
