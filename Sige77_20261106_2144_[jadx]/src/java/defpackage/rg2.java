package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rg2 implements sj0, tj0 {
    public final nj0 b;
    public final j7 c;
    public final md2 d;
    public final int h;
    public final bh2 i;
    public boolean j;
    public final /* synthetic */ uj0 n;
    public final LinkedList a = new LinkedList();
    public final HashSet e = new HashSet();
    public final HashMap f = new HashMap();
    public final ArrayList k = new ArrayList();
    public ConnectionResult l = null;
    public int m = 0;

    public rg2(uj0 uj0Var, pj0 pj0Var) {
        this.n = uj0Var;
        Looper looper = uj0Var.n.getLooper();
        ac2 ac2VarA = pj0Var.a();
        uy1 uy1Var = new uy1((ob) ac2VarA.b, (String) ac2VarA.d, (String) ac2VarA.c);
        gb2 gb2Var = (gb2) pj0Var.d.b;
        gu2.o(gb2Var);
        nj0 nj0VarF = gb2Var.f(pj0Var.a, looper, uy1Var, pj0Var.e, this, this);
        gk1 gk1Var = pj0Var.c;
        if (gk1Var == null || !(nj0VarF instanceof jf)) {
            String str = pj0Var.b;
            if (str != null && (nj0VarF instanceof jf)) {
                nj0VarF.s = str;
            }
        } else {
            nj0VarF.t = gk1Var;
        }
        this.b = nj0VarF;
        this.c = pj0Var.f;
        this.d = new md2(8);
        this.h = pj0Var.h;
        if (!nj0VarF.r()) {
            this.i = null;
            return;
        }
        Context context = uj0Var.e;
        th2 th2Var = uj0Var.n;
        ac2 ac2VarA2 = pj0Var.a();
        this.i = new bh2(context, th2Var, new uy1((ob) ac2VarA2.b, (String) ac2VarA2.d, (String) ac2VarA2.c));
    }

    @Override // defpackage.tj0
    public final void a(ConnectionResult connectionResult) {
        o(connectionResult, null);
    }

    public final void b() {
        nj0 nj0Var = this.b;
        uj0 uj0Var = this.n;
        gu2.j(uj0Var.n);
        this.l = null;
        l(ConnectionResult.f);
        if (this.j) {
            th2 th2Var = uj0Var.n;
            j7 j7Var = this.c;
            th2Var.removeMessages(11, j7Var);
            uj0Var.n.removeMessages(9, j7Var);
            this.j = false;
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            nd2 nd2Var = ((ah2) it.next()).a;
            if (m((Feature[]) nd2Var.c) != null) {
                it.remove();
            } else {
                try {
                    ((u23) ((nx0) nd2Var.d).a).accept(nj0Var, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    d(3);
                    nj0Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void c(int i) {
        gu2.j(this.n.n);
        this.l = null;
        this.j = true;
        String str = this.b.a;
        md2 md2Var = this.d;
        md2Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        md2Var.k(true, new Status(20, sb.toString(), (PendingIntent) null, (ConnectionResult) null));
        j7 j7Var = this.c;
        uj0 uj0Var = this.n;
        th2 th2Var = uj0Var.n;
        th2Var.sendMessageDelayed(Message.obtain(th2Var, 9, j7Var), 5000L);
        th2 th2Var2 = uj0Var.n;
        th2Var2.sendMessageDelayed(Message.obtain(th2Var2, 11, j7Var), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) uj0Var.g.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            ((ah2) it.next()).getClass();
        }
    }

    @Override // defpackage.sj0
    public final void d(int i) {
        uj0 uj0Var = this.n;
        if (Looper.myLooper() == uj0Var.n.getLooper()) {
            c(i);
        } else {
            uj0Var.n.post(new hk(this, i, 3));
        }
    }

    @Override // defpackage.sj0
    public final void e() {
        uj0 uj0Var = this.n;
        if (Looper.myLooper() == uj0Var.n.getLooper()) {
            b();
        } else {
            uj0Var.n.post(new i4(this, 27));
        }
    }

    public final boolean f(ConnectionResult connectionResult) {
        synchronized (uj0.r) {
            try {
                uj0 uj0Var = this.n;
                if (uj0Var.k == null || !uj0Var.l.contains(this.c)) {
                    return false;
                }
                mg2 mg2Var = uj0Var.k;
                int i = this.h;
                mg2Var.getClass();
                sh2 sh2Var = new sh2(connectionResult, i);
                AtomicReference atomicReference = mg2Var.b;
                do {
                    if (atomicReference.compareAndSet(null, sh2Var)) {
                        mg2Var.c.post(new bh0(mg2Var, sh2Var));
                        break;
                    }
                } while (atomicReference.get() == null);
                uj0Var.f.h(uj0Var.e, connectionResult, true);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        LinkedList linkedList = this.a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mh2 mh2Var = (mh2) arrayList.get(i);
            if (!this.b.p()) {
                return;
            }
            if (h(mh2Var)) {
                linkedList.remove(mh2Var);
            }
        }
    }

    public final boolean h(mh2 mh2Var) {
        if (!(mh2Var instanceof xg2)) {
            md2 md2Var = this.d;
            nj0 nj0Var = this.b;
            mh2Var.c(md2Var, nj0Var.r());
            try {
                mh2Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                d(1);
                nj0Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        xg2 xg2Var = (xg2) mh2Var;
        Feature featureM = m(xg2Var.f(this));
        if (featureM == null) {
            md2 md2Var2 = this.d;
            nj0 nj0Var2 = this.b;
            mh2Var.c(md2Var2, nj0Var2.r());
            try {
                mh2Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                d(1);
                nj0Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.b.getClass().getName();
        String str = featureM.a;
        long jR = featureM.R();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jR).length() + 2);
        ts.r(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jR);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        uj0 uj0Var = this.n;
        if (!uj0Var.o || !xg2Var.g(this)) {
            xg2Var.b(new j32(featureM));
            return true;
        }
        int iH = xg2Var.h(this);
        sg2 sg2Var = new sg2(this.c, featureM);
        ArrayList arrayList = this.k;
        int iIndexOf = arrayList.indexOf(sg2Var);
        if (iIndexOf >= 0) {
            sg2 sg2Var2 = (sg2) arrayList.get(iIndexOf);
            uj0Var.n.removeMessages(15, sg2Var2);
            uj0Var.n.sendMessageDelayed(Message.obtain(uj0Var.n, 15, sg2Var2), 5000L);
            return false;
        }
        arrayList.add(sg2Var);
        uj0Var.n.sendMessageDelayed(Message.obtain(uj0Var.n, 15, sg2Var), 5000L);
        uj0Var.n.sendMessageDelayed(Message.obtain(uj0Var.n, 16, sg2Var), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, (PendingIntent) null, (String) null, Integer.valueOf(iH));
        if (f(connectionResult)) {
            String str2 = featureM.a;
            long jR2 = featureM.R();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jR2).length());
            ts.q(sb2, "A dialog should be displayed for missing feature: ", str2, ", version: ");
            sb2.append(jR2);
            Log.w("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!uj0Var.h(connectionResult, this.h)) {
            return false;
        }
        String str3 = featureM.a;
        long jR3 = featureM.R();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jR3).length());
        ts.q(sb3, "Notification displayed for missing feature: ", str3, ", version: ");
        sb3.append(jR3);
        Log.w("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void i(Status status, Exception exc, boolean z) {
        gu2.j(this.n.n);
        if ((status == null) == (exc == null)) {
            e.g("Status XOR exception should be null");
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            mh2 mh2Var = (mh2) it.next();
            if (!z || mh2Var.a == 2) {
                if (status != null) {
                    mh2Var.a(status);
                } else {
                    mh2Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        gu2.j(this.n.n);
        i(status, null, false);
    }

    public final void k() {
        uj0 uj0Var = this.n;
        th2 th2Var = uj0Var.n;
        j7 j7Var = this.c;
        th2Var.removeMessages(12, j7Var);
        th2 th2Var2 = uj0Var.n;
        th2Var2.sendMessageDelayed(th2Var2.obtainMessage(12, j7Var), uj0Var.a);
    }

    public final void l(ConnectionResult connectionResult) {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            ur.a();
            return;
        }
        if (jw.j(connectionResult, ConnectionResult.f)) {
            nj0 nj0Var = this.b;
            if (!nj0Var.p() || nj0Var.b == null) {
                uq1.m("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final Feature m(Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            zzj zzjVar = this.b.w;
            Feature[] featureArr2 = zzjVar == null ? null : zzjVar.b;
            if (featureArr2 == null) {
                featureArr2 = new Feature[0];
            }
            mb mbVar = new mb(featureArr2.length);
            for (Feature feature : featureArr2) {
                mbVar.put(feature.a, Long.valueOf(feature.R()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) mbVar.get(feature2.a);
                if (l == null || l.longValue() < feature2.R()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void n(ConnectionResult connectionResult) {
        gu2.j(this.n.n);
        nj0 nj0Var = this.b;
        String name = nj0Var.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        nj0Var.d(sb.toString());
        o(connectionResult, null);
    }

    public final void o(ConnectionResult connectionResult, RuntimeException runtimeException) {
        rq1 rq1Var;
        uj0 uj0Var = this.n;
        gu2.j(uj0Var.n);
        bh2 bh2Var = this.i;
        if (bh2Var != null && (rq1Var = bh2Var.h) != null) {
            rq1Var.c();
        }
        gu2.j(this.n.n);
        this.l = null;
        SparseIntArray sparseIntArray = (SparseIntArray) uj0Var.g.b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(connectionResult);
        if ((this.b instanceof vh2) && connectionResult.b != 24) {
            uj0Var.b = true;
            th2 th2Var = uj0Var.n;
            th2Var.sendMessageDelayed(th2Var.obtainMessage(19), 300000L);
        }
        int i = connectionResult.b;
        if (i == 4) {
            j(uj0.q);
            return;
        }
        if (i == 25) {
            j(uj0.d(this.c, connectionResult));
            return;
        }
        LinkedList linkedList = this.a;
        if (linkedList.isEmpty()) {
            this.l = connectionResult;
            return;
        }
        if (runtimeException != null) {
            gu2.j(uj0Var.n);
            i(null, runtimeException, false);
            return;
        }
        boolean z = uj0Var.o;
        j7 j7Var = this.c;
        if (!z) {
            j(uj0.d(j7Var, connectionResult));
            return;
        }
        i(uj0.d(j7Var, connectionResult), null, true);
        if (linkedList.isEmpty() || f(connectionResult) || uj0Var.h(connectionResult, this.h)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.j = true;
        }
        if (!this.j) {
            j(uj0.d(j7Var, connectionResult));
        } else {
            th2 th2Var2 = uj0Var.n;
            th2Var2.sendMessageDelayed(Message.obtain(th2Var2, 9, j7Var), 5000L);
        }
    }

    public final void p(mh2 mh2Var) {
        gu2.j(this.n.n);
        boolean zP = this.b.p();
        LinkedList linkedList = this.a;
        if (zP) {
            if (h(mh2Var)) {
                k();
                return;
            } else {
                linkedList.add(mh2Var);
                return;
            }
        }
        linkedList.add(mh2Var);
        ConnectionResult connectionResult = this.l;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            r();
        } else {
            o(connectionResult, null);
        }
    }

    public final void q() {
        uj0 uj0Var = this.n;
        gu2.j(uj0Var.n);
        Status status = uj0.p;
        j(status);
        this.d.k(false, status);
        for (yy0 yy0Var : (yy0[]) this.f.keySet().toArray(new yy0[0])) {
            p(new ih2(yy0Var, new TaskCompletionSource()));
        }
        l(new ConnectionResult(4, (PendingIntent) null, (String) null));
        if (this.b.p()) {
            uj0Var.n.post(new i4(new wa(this, 22), 28));
        }
    }

    public final void r() {
        uj0 uj0Var = this.n;
        gu2.j(uj0Var.n);
        nj0 nj0Var = this.b;
        if (nj0Var.p()) {
            return;
        }
        nj0 nj0Var2 = nj0Var;
        if (nj0Var2.q()) {
            return;
        }
        try {
            int iJ = uj0Var.g.j(uj0Var.e, nj0Var);
            if (iJ != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iJ, (PendingIntent) null, (String) null);
                String name = nj0Var.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                o(connectionResult, null);
                return;
            }
            tg2 tg2Var = new tg2();
            Objects.requireNonNull(uj0Var);
            tg2Var.f = uj0Var;
            tg2Var.d = null;
            tg2Var.e = null;
            tg2Var.a = false;
            tg2Var.b = nj0Var;
            tg2Var.c = this.c;
            if (nj0Var.r()) {
                bh2 bh2Var = this.i;
                gu2.o(bh2Var);
                rq1 rq1Var = bh2Var.h;
                if (rq1Var != null) {
                    rq1Var.c();
                }
                uy1 uy1Var = bh2Var.f;
                uy1Var.i = Integer.valueOf(System.identityHashCode(bh2Var));
                hr0 hr0Var = bh2Var.d;
                Context context = bh2Var.b;
                Handler handler = bh2Var.c;
                bh2Var.h = (rq1) hr0Var.f(context, handler.getLooper(), uy1Var, (sq1) uy1Var.f, bh2Var, bh2Var);
                bh2Var.i = tg2Var;
                Set set = bh2Var.e;
                if (set == null || set.isEmpty()) {
                    handler.post(new i4(bh2Var));
                } else {
                    rq1 rq1Var2 = bh2Var.h;
                    rq1Var2.getClass();
                    rq1Var2.j = new ox1((jf) rq1Var2);
                    rq1Var2.u(2, null);
                }
            }
            try {
                nj0Var2.j = tg2Var;
                nj0Var2.u(2, null);
            } catch (SecurityException e) {
                o(new ConnectionResult(10, (PendingIntent) null, (String) null), e);
            }
        } catch (IllegalStateException e2) {
            o(new ConnectionResult(10, (PendingIntent) null, (String) null), e2);
        }
    }
}
