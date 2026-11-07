package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.zzj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jf {
    public static final Feature[] y = new Feature[0];
    public es1 b;
    public final Context c;
    public final yf3 d;
    public final rj0 e;
    public final mu2 f;
    public ej2 i;
    public hf j;
    public IInterface k;
    public kz2 m;
    public final ff o;
    public final gf p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile gk1 t;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public ConnectionResult u = null;
    public boolean v = false;
    public volatile zzj w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    public jf(Context context, Looper looper, yf3 yf3Var, rj0 rj0Var, int i, ff ffVar, gf gfVar, String str) {
        gu2.p(context, "Context must not be null");
        this.c = context;
        gu2.p(looper, "Looper must not be null");
        gu2.p(yf3Var, "Supervisor must not be null");
        this.d = yf3Var;
        gu2.p(rj0Var, "API availability must not be null");
        this.e = rj0Var;
        this.f = new mu2(this, looper);
        this.q = i;
        this.o = ffVar;
        this.p = gfVar;
        this.r = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    public final void a() throws GooglePlayServicesMissingManifestValueException, GooglePlayServicesIncorrectManifestValueException {
        int iC = this.e.c(this.c, i());
        if (iC == 0) {
            this.j = new ox1(this);
            u(2, null);
            return;
        }
        u(1, null);
        this.j = new ox1(this);
        int i = this.x.get();
        mu2 mu2Var = this.f;
        mu2Var.sendMessage(mu2Var.obtainMessage(3, i, iC, null));
    }

    public abstract IInterface b(IBinder iBinder);

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    dj2 dj2Var = (dj2) arrayList.get(i);
                    synchronized (dj2Var) {
                        dj2Var.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        u(1, null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public Feature[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public abstract int i();

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(um0 um0Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.t == null || (attributionSource = (AttributionSource) this.t.b) == null || attributionSource.getAttributionTag() == null) ? this.s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.q;
        int i2 = rj0.a;
        Scope[] scopeArr = GetServiceRequest.b0;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.c0;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, (String) null, (IBinder) null, scopeArr, bundle, (Account) null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.d = this.c.getPackageName();
        getServiceRequest.i = bundleH;
        if (set != null) {
            getServiceRequest.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r()) {
            Account accountE = e();
            if (accountE == null) {
                accountE = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.v = accountE;
            if (um0Var != 0) {
                getServiceRequest.e = ((lb2) um0Var).b;
            }
        }
        getServiceRequest.w = y;
        getServiceRequest.W = f();
        if (s()) {
            getServiceRequest.Z = true;
        }
        try {
            synchronized (this.h) {
                try {
                    ej2 ej2Var = this.i;
                    if (ej2Var != null) {
                        ej2Var.a(new by2(this, this.x.get()), getServiceRequest);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.x.get();
            mu2 mu2Var = this.f;
            mu2Var.sendMessage(mu2Var.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.x.get();
            d03 d03Var = new d03(this, 8, null, null);
            mu2 mu2Var2 = this.f;
            mu2Var2.sendMessage(mu2Var2.obtainMessage(1, i4, -1, d03Var));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.x.get();
            d03 d03Var2 = new d03(this, 8, null, null);
            mu2 mu2Var3 = this.f;
            mu2Var3.sendMessage(mu2Var3.obtainMessage(1, i5, -1, d03Var2));
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                gu2.p(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        return i() >= 211700000;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof jj1;
    }

    public final /* synthetic */ boolean t(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                u(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i, IInterface iInterface) {
        es1 es1Var;
        gu2.i((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    kz2 kz2Var = this.m;
                    if (kz2Var != null) {
                        yf3 yf3Var = this.d;
                        String str = this.b.b;
                        gu2.o(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        yf3Var.c(str, kz2Var, this.b.c);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    kz2 kz2Var2 = this.m;
                    if (kz2Var2 != null && (es1Var = this.b) != null) {
                        String str2 = es1Var.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        Log.e("GmsClient", sb.toString());
                        yf3 yf3Var2 = this.d;
                        String str3 = this.b.b;
                        gu2.o(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        yf3Var2.c(str3, kz2Var2, this.b.c);
                        this.x.incrementAndGet();
                    }
                    kz2 kz2Var3 = new kz2(this, this.x.get());
                    this.m = kz2Var3;
                    String strN = n();
                    boolean zO = o();
                    this.b = new es1(2, strN, zO);
                    if (zO && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    yf3 yf3Var3 = this.d;
                    String str4 = this.b.b;
                    gu2.o(str4);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    ConnectionResult connectionResultB = yf3Var3.b(new yb3(str4, this.b.c), kz2Var3, name, g());
                    if (!(connectionResultB.b == 0)) {
                        String str5 = this.b.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        Log.w("GmsClient", sb2.toString());
                        int i2 = connectionResultB.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultB.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultB.c);
                        }
                        int i3 = this.x.get();
                        j13 j13Var = new j13(this, i2, bundle);
                        mu2 mu2Var = this.f;
                        mu2Var.sendMessage(mu2Var.obtainMessage(7, i3, -1, j13Var));
                    }
                } else if (i == 4) {
                    gu2.o(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
