package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzom;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzoq;
import com.google.android.gms.measurement.internal.zzr;
import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public yk(w93 w93Var, AtomicReference atomicReference, String str, String str2) {
        this.a = 4;
        this.b = atomicReference;
        this.c = str;
        this.d = str2;
        Objects.requireNonNull(w93Var);
        this.e = w93Var;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0445  */
    /* JADX WARN: Code duplicated, block: B:127:0x045a A[LOOP:1: B:125:0x0454->B:127:0x045a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:132:0x04aa A[Catch: xm2 -> 0x0513, LOOP:2: B:130:0x04a0->B:132:0x04aa, LOOP_END, TryCatch #0 {xm2 -> 0x0513, blocks: (B:129:0x0493, B:130:0x04a0, B:132:0x04aa, B:133:0x04e0, B:135:0x04fb), top: B:155:0x0493 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x04fb A[Catch: xm2 -> 0x0513, TRY_LEAVE, TryCatch #0 {xm2 -> 0x0513, blocks: (B:129:0x0493, B:130:0x04a0, B:132:0x04aa, B:133:0x04e0, B:135:0x04fb), top: B:155:0x0493 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        zzom zzomVar;
        s53 s53Var;
        int i;
        long jElapsedRealtime;
        byte[] bArrU = null;
        switch (this.a) {
            case 0:
                al alVar = (al) ((pv2) this.e).a;
                o31 o31Var = (o31) this.c;
                zk zkVar = (zk) this.b;
                if (zkVar != null) {
                    alVar.m0 = true;
                    zkVar.b.c(false);
                    alVar.m0 = false;
                }
                if (o31Var.isEnabled() && o31Var.hasSubMenu()) {
                    ((i31) this.d).q(o31Var, null, 4);
                    return;
                }
                return;
            case 1:
                g73 g73Var = (g73) this.b;
                String str = (String) this.c;
                zzoo zzooVar = (zzoo) this.d;
                c23 c23Var = (c23) this.e;
                if3 if3Var = g73Var.a;
                if3Var.V();
                if3Var.e().D();
                if3Var.l0();
                bu2 bu2Var = if3Var.c;
                if3.T(bu2Var);
                List<kf3> listJ = bu2Var.J(str, zzooVar, ((Integer) h13.B.a(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (kf3 kf3Var : listJ) {
                    String str2 = kf3Var.c;
                    long j = kf3Var.h;
                    long j2 = kf3Var.a;
                    if (if3Var.s(str, str2)) {
                        int i2 = kf3Var.i;
                        if (i2 > 0) {
                            if (i2 <= ((Integer) h13.z.a(bArrU)).intValue()) {
                                long jMin = Math.min(((Long) h13.x.a(bArrU)).longValue() * (1 << (i2 - 1)), ((Long) h13.y.a(bArrU)).longValue());
                                if3Var.g().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : kf3Var.d.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    zzomVar = new zzom(kf3Var.a, kf3Var.b.a(), kf3Var.c, bundle, kf3Var.e.a, kf3Var.g, BuildConfig.FLAVOR);
                                    try {
                                        s53Var = (s53) lf3.p0(w53.A(), zzomVar.b);
                                        for (i = 0; i < ((w53) s53Var.b).u(); i++) {
                                            x53 x53Var = (x53) ((w53) s53Var.b).v(i).k();
                                            if3Var.g().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            x53Var.d();
                                            ((a63) x53Var.b).j0(jCurrentTimeMillis);
                                            s53Var.d();
                                            ((w53) s53Var.b).C(i, (a63) x53Var.g());
                                        }
                                        zzomVar.b = ((w53) s53Var.g()).a();
                                        if (Log.isLoggable(if3Var.d().O(), 2)) {
                                            lf3 lf3Var = if3Var.i;
                                            if3.T(lf3Var);
                                            zzomVar.i = lf3Var.f0((w53) s53Var.g());
                                        }
                                        arrayList.add(zzomVar);
                                    } catch (xm2 unused) {
                                        if3Var.d().w.b(str, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            if3Var.d().a0.d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r6.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            zzomVar = new zzom(kf3Var.a, kf3Var.b.a(), kf3Var.c, bundle, kf3Var.e.a, kf3Var.g, BuildConfig.FLAVOR);
                            s53Var = (s53) lf3.p0(w53.A(), zzomVar.b);
                            while (i < ((w53) s53Var.b).u()) {
                                x53 x53Var2 = (x53) ((w53) s53Var.b).v(i).k();
                                if3Var.g().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                x53Var2.d();
                                ((a63) x53Var2.b).j0(jCurrentTimeMillis2);
                                s53Var.d();
                                ((w53) s53Var.b).C(i, (a63) x53Var2.g());
                            }
                            zzomVar.b = ((w53) s53Var.g()).a();
                            if (Log.isLoggable(if3Var.d().O(), 2)) {
                                lf3 lf3Var2 = if3Var.i;
                                if3.T(lf3Var2);
                                zzomVar.i = lf3Var2.f0((w53) s53Var.g());
                            }
                            arrayList.add(zzomVar);
                        }
                        bArrU = null;
                    } else {
                        if3Var.d().a0.d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(j2), kf3Var.c);
                    }
                }
                try {
                    c23Var.o(new zzoq(arrayList));
                    if3Var.d().a0.c(str, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    if3Var.d().f.c(str, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                lc3 lc3VarO = ((AppMeasurementDynamiteService) this.e).a.o();
                hx2 hx2Var = (hx2) this.b;
                zzbh zzbhVar = (zzbh) this.c;
                String str3 = (String) this.d;
                lc3VarO.D();
                lc3VarO.F();
                y53 y53Var = (y53) lc3VarO.a;
                qf3 qf3Var = y53Var.w;
                y53.j(qf3Var);
                if (rj0.b.c(((y53) qf3Var.a).a, 12451000) == 0) {
                    lc3VarO.S(new yk(8, lc3VarO, zzbhVar, str3, hx2Var));
                    return;
                }
                c33 c33Var = y53Var.f;
                y53.l(c33Var);
                c33Var.w.a("Not bundling data. Service unavailable or out of date");
                qf3 qf3Var2 = y53Var.w;
                y53.j(qf3Var2);
                qf3Var2.u0(hx2Var, new byte[0]);
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                g73 g73Var2 = (g73) this.b;
                Bundle bundle2 = (Bundle) this.c;
                String str4 = (String) this.d;
                zzr zzrVar = (zzr) this.e;
                boolean zIsEmpty = bundle2.isEmpty();
                if3 if3Var2 = g73Var2.a;
                if (zIsEmpty) {
                    bu2 bu2Var2 = if3Var2.c;
                    if3.T(bu2Var2);
                    bu2Var2.D();
                    bu2Var2.F();
                    try {
                        bu2Var2.v0().execSQL("delete from default_event_params where app_id=?", new String[]{str4});
                        return;
                    } catch (SQLiteException e2) {
                        c33 c33Var2 = ((y53) bu2Var2.a).f;
                        y53.l(c33Var2);
                        c33Var2.f.b(e2, "Error clearing default event params");
                        return;
                    }
                }
                bu2 bu2Var3 = if3Var2.c;
                if3.T(bu2Var3);
                y53 y53Var2 = (y53) bu2Var3.a;
                bu2Var3.D();
                bu2Var3.F();
                ru2 ru2Var = new ru2((y53) bu2Var3.a, BuildConfig.FLAVOR, str4, "dep", 0L, 0L, 0L, bundle2);
                lf3 lf3Var3 = bu2Var3.b.i;
                if3.T(lf3Var3);
                byte[] bArrA = lf3Var3.e0(ru2Var).a();
                c33 c33Var3 = y53Var2.f;
                y53.l(c33Var3);
                c33Var3.a0.c(str4, Integer.valueOf(bArrA.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", bArrA);
                try {
                    if (bu2Var3.v0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        y53.l(c33Var3);
                        c33Var3.f.b(c33.M(str4), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    y53.l(c33Var3);
                    c33Var3.f.c(c33.M(str4), e3, "Error storing default event parameters. appId");
                }
                bu2 bu2Var4 = if3Var2.c;
                if3.T(bu2Var4);
                long j3 = zzrVar.q0;
                try {
                    if (bu2Var4.b0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) <= 0 && bu2Var4.b0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str4, String.valueOf(j3)}, 0L) > 0) {
                        bu2 bu2Var5 = if3Var2.c;
                        if3.T(bu2Var5);
                        bu2Var5.X(str4, Long.valueOf(j3), null, bundle2);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    c33 c33Var4 = ((y53) bu2Var4.a).f;
                    y53.l(c33Var4);
                    c33Var4.f.b(e4, "Error checking backfill conditions");
                    return;
                }
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                String str5 = (String) this.c;
                String str6 = (String) this.d;
                lc3 lc3VarO2 = ((y53) ((w93) this.e).a).o();
                AtomicReference atomicReference = (AtomicReference) this.b;
                lc3VarO2.D();
                lc3VarO2.F();
                lc3VarO2.S(new a73(lc3VarO2, atomicReference, str5, str6, lc3VarO2.U(false)));
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                mp1 mp1Var = (mp1) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                Context context = (Context) this.d;
                e93 e93Var = (e93) this.e;
                if ((mp1Var.a instanceof g0) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(e93Var);
                        return;
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                }
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                wa waVar = ma3.a;
                Level level = (Level) this.b;
                lo2 lo2Var = (lo2) waVar.b;
                boolean zW = lo2Var.w(level);
                String str7 = (String) lo2Var.a;
                ((oj2) jj2.a).getClass();
                tj2.b.a(str7, level, zW);
                ((np3) ((np3) (!zW ? wa.f : new qp3(waVar, level)).a((Throwable) this.c)).zzn()).b((String) this.d, (Object[]) this.e);
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                lc3 lc3VarO3 = ((AppMeasurementDynamiteService) this.e).a.o();
                hx2 hx2Var2 = (hx2) this.b;
                String str8 = (String) this.c;
                String str9 = (String) this.d;
                lc3VarO3.D();
                lc3VarO3.F();
                lc3VarO3.S(new a73(lc3VarO3, str8, str9, lc3VarO3.U(false), hx2Var2));
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                hx2 hx2Var3 = (hx2) this.d;
                lc3 lc3Var = (lc3) this.e;
                try {
                    try {
                        n13 n13Var = lc3Var.d;
                        if (n13Var != null) {
                            bArrU = n13Var.u((zzbh) this.b, (String) this.c);
                            lc3Var.R();
                            qf3 qf3Var3 = ((y53) lc3Var.a).w;
                            y53.j(qf3Var3);
                            qf3Var3.u0(hx2Var3, bArrU);
                            return;
                        }
                        y53 y53Var3 = (y53) lc3Var.a;
                        c33 c33Var5 = y53Var3.f;
                        y53.l(c33Var5);
                        c33Var5.f.a("Discarding data. Failed to send event to service to bundle");
                        qf3 qf3Var4 = y53Var3.w;
                        y53.j(qf3Var4);
                        qf3Var4.u0(hx2Var3, null);
                        return;
                    } catch (RemoteException e6) {
                        c33 c33Var6 = ((y53) lc3Var.a).f;
                        y53.l(c33Var6);
                        c33Var6.f.b(e6, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th) {
                    qf3 qf3Var5 = ((y53) lc3Var.a).w;
                    y53.j(qf3Var5);
                    qf3Var5.u0(hx2Var3, null);
                    throw th;
                }
                break;
            case 9:
                lc3 lc3Var2 = (lc3) this.b;
                AtomicReference atomicReference2 = (AtomicReference) this.c;
                zzr zzrVar2 = (zzr) this.d;
                Bundle bundle3 = (Bundle) this.e;
                synchronized (atomicReference2) {
                    try {
                        n13 n13Var2 = lc3Var2.d;
                        if (n13Var2 != null) {
                            n13Var2.z(zzrVar2, bundle3, new bb3(lc3Var2, atomicReference2));
                            lc3Var2.R();
                            return;
                        } else {
                            c33 c33Var7 = ((y53) lc3Var2.a).f;
                            y53.l(c33Var7);
                            c33Var7.f.a("Failed to request trigger URIs; not connected to service");
                            return;
                        }
                    } catch (RemoteException e7) {
                        c33 c33Var8 = ((y53) lc3Var2.a).f;
                        y53.l(c33Var8);
                        c33Var8.f.b(e7, "Failed to request trigger URIs; remote exception");
                        atomicReference2.notifyAll();
                    }
                }
                break;
            case 10:
                lc3 lc3Var3 = (lc3) this.b;
                AtomicReference atomicReference3 = (AtomicReference) this.c;
                zzr zzrVar3 = (zzr) this.d;
                zzoo zzooVar2 = (zzoo) this.e;
                synchronized (atomicReference3) {
                    try {
                        n13 n13Var3 = lc3Var3.d;
                        if (n13Var3 != null) {
                            n13Var3.h(zzrVar3, zzooVar2, new db3(lc3Var3, atomicReference3));
                            lc3Var3.R();
                            return;
                        } else {
                            c33 c33Var9 = ((y53) lc3Var3.a).f;
                            y53.l(c33Var9);
                            c33Var9.f.a("[sgtm] Failed to get upload batches; not connected to service");
                            return;
                        }
                    } catch (RemoteException e8) {
                        c33 c33Var10 = ((y53) lc3Var3.a).f;
                        y53.l(c33Var10);
                        c33Var10.f.b(e8, "[sgtm] Failed to get upload batches; remote exception");
                        atomicReference3.notifyAll();
                    }
                }
                break;
            default:
                if3 if3Var3 = (if3) ((bf3) this.e).a;
                qf3 qf3VarK0 = if3Var3.k0();
                if3Var3.g().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (if3Var3.e0().P(null, h13.e1)) {
                    if3Var3.g().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                Bundle bundle4 = (Bundle) this.d;
                String str10 = (String) this.c;
                String str11 = (String) this.b;
                zzbh zzbhVarL0 = qf3VarK0.l0(str10, bundle4, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                gu2.o(zzbhVarL0);
                if3Var3.h(zzbhVarL0, str11);
                return;
        }
    }

    public /* synthetic */ yk(Object obj, Object obj2, Object obj3, Object obj4, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ yk(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = i;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }
}
