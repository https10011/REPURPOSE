package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class aj2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public aj2(t33 t33Var, boolean z) {
        this.a = 3;
        this.b = t33Var;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0274  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        switch (this.a) {
            case 0:
                u72 u72Var = (u72) this.b;
                synchronized (u72Var.a) {
                    try {
                        if (u72Var.b()) {
                            Log.e("WakeLock", String.valueOf(u72Var.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            u72Var.d();
                            if (u72Var.b()) {
                                u72Var.c = 1;
                                u72Var.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 1:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                bu2 bu2Var = (bu2) this.b;
                try {
                    SQLiteDatabase sQLiteDatabaseV0 = bu2Var.v0();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseV0.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    c33 c33Var = ((y53) bu2Var.a).f;
                    y53.l(c33Var);
                    c33Var.f.b(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((t33) this.b).a.N();
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                lc3 lc3Var = ((gc3) this.b).c;
                lc3Var.P(new ComponentName(((y53) lc3Var.a).a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                lc3 lc3Var2 = ((gc3) ((z83) this.b).b).c;
                t53 t53Var = ((y53) lc3Var2.a).i;
                y53.l(t53Var);
                t53Var.N(new ec3(lc3Var2, i2));
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                gd3 gd3Var = (gd3) this.b;
                td3 td3Var = (td3) gd3Var.c.b;
                td3Var.D();
                y53 y53Var = (y53) td3Var.a;
                c33 c33Var2 = y53Var.f;
                Context context = y53Var.a;
                y53.l(c33Var2);
                c33Var2.Z.a("Application going to the background");
                h43 h43Var = y53Var.e;
                y53.j(h43Var);
                h43Var.f0.b(true);
                td3Var.D();
                td3Var.d = true;
                is2 is2Var = y53Var.d;
                if (!is2Var.T()) {
                    long j = gd3Var.b;
                    pd3 pd3Var = td3Var.f;
                    pd3Var.a(false, false, j);
                    pd3Var.c.c();
                }
                long j2 = gd3Var.a;
                y53.l(c33Var2);
                c33Var2.Y.b(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                w93 w93Var = y53Var.Z;
                y53.k(w93Var);
                w93Var.D();
                y53 y53Var2 = (y53) w93Var.a;
                w93Var.F();
                lc3 lc3VarO = y53Var2.o();
                lc3VarO.D();
                lc3VarO.F();
                if (lc3VarO.L()) {
                    qf3 qf3Var = ((y53) lc3VarO.a).w;
                    y53.j(qf3Var);
                    if (qf3Var.p0() >= 242600) {
                        lc3 lc3VarO2 = y53Var2.o();
                        lc3VarO2.D();
                        lc3VarO2.F();
                        lc3VarO2.S(new gb3(lc3VarO2, lc3VarO2.U(true), 2));
                    }
                } else {
                    lc3 lc3VarO3 = y53Var2.o();
                    lc3VarO3.D();
                    lc3VarO3.F();
                    lc3VarO3.S(new gb3(lc3VarO3, lc3VarO3.U(true), 2));
                }
                if (is2Var.P(null, h13.N0)) {
                    qf3 qf3Var2 = y53Var.w;
                    y53.j(qf3Var2);
                    long jM = qf3Var2.j0(context.getPackageName(), is2Var.c) ? 1000L : is2Var.M(context.getPackageName(), h13.E);
                    y53.l(c33Var2);
                    c33Var2.a0.b(Long.valueOf(jM), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    y53.i(y53Var.h0);
                    y53Var.h0.I(jM);
                    return;
                }
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if3 if3Var = (if3) this.b;
                if3Var.e().D();
                if3Var.X = new gk1(if3Var);
                bu2 bu2Var2 = new bu2(if3Var);
                bu2Var2.G();
                if3Var.c = bu2Var2;
                f53 f53Var = if3Var.a;
                is2 is2VarE0 = if3Var.e0();
                gu2.o(f53Var);
                is2VarE0.d = f53Var;
                qc3 qc3Var = new qc3(if3Var);
                qc3Var.G();
                if3Var.w = qc3Var;
                rl2 rl2Var = new rl2(if3Var);
                rl2Var.G();
                if3Var.f = rl2Var;
                o33 o33Var = new o33(if3Var, i3);
                o33Var.G();
                if3Var.v = o33Var;
                de3 de3Var = new de3(if3Var);
                de3Var.G();
                if3Var.e = de3Var;
                if3Var.d = new t33(if3Var);
                if (if3Var.e0 != if3Var.f0) {
                    if3Var.d().f.c(Integer.valueOf(if3Var.e0), Integer.valueOf(if3Var.f0), "Not all upload components initialized");
                }
                if3Var.Z.set(true);
                if3Var.d().a0.a("UploadController is now fully initialized");
                if3Var.e().D();
                bu2 bu2Var3 = if3Var.c;
                if3.T(bu2Var3);
                bu2Var3.O();
                bu2 bu2Var4 = if3Var.c;
                if3.T(bu2Var4);
                bu2Var4.D();
                bu2Var4.F();
                if (bu2Var4.p0()) {
                    f13 f13Var = h13.u0;
                    if (((Long) f13Var.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseV1 = bu2Var4.v0();
                        y53 y53Var3 = (y53) bu2Var4.a;
                        y53Var3.X.getClass();
                        int iDelete = sQLiteDatabaseV1.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(f13Var.a(null))});
                        if (iDelete > 0) {
                            c33 c33Var3 = y53Var3.f;
                            y53.l(c33Var3);
                            c33Var3.a0.b(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (if3Var.w.v.a() == 0) {
                    b43 b43Var = if3Var.w.v;
                    if3Var.g().getClass();
                    b43Var.b(System.currentTimeMillis());
                }
                if3Var.N();
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                throw new RuntimeException(((ExecutionException) this.b).getCause());
            case 9:
                try {
                    dh0.b((ListenableFuture) this.b);
                    return;
                } catch (ExecutionException e2) {
                    ta.O().post(new aj2(e2, 8));
                    return;
                }
            case 10:
                try {
                    dh0.b((vd0) this.b);
                    return;
                } catch (Exception e3) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e3);
                    return;
                }
            case 11:
                if (((Boolean) ((ig3) this.b).c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case 12:
                try {
                    dh0.b((wd0) this.b);
                    return;
                } catch (Exception e4) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e4);
                        return;
                    }
                    return;
                }
            case 13:
                y53 y53Var4 = (y53) ((xh) this.b).b;
                y53.i(y53Var4.h0);
                y53Var4.h0.I(((Long) h13.D.a(null)).longValue());
                return;
            default:
                y53 y53Var5 = (y53) this.b;
                qf3 qf3Var3 = y53Var5.w;
                w93 w93Var2 = y53Var5.Z;
                y53.j(qf3Var3);
                qf3Var3.D();
                if (qf3Var3.b0() != 1) {
                    c33 c33Var4 = y53Var5.f;
                    y53.l(c33Var4);
                    c33Var4.w.a("registerTrigger called but app not eligible");
                    return;
                }
                y53.k(w93Var2);
                w93Var2.D();
                x73 x73Var = w93Var2.Y;
                if (x73Var != null) {
                    x73Var.c();
                }
                y53.k(w93Var2);
                new Thread(new v73(w93Var2, i)).start();
                return;
        }
    }

    public /* synthetic */ aj2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public aj2(if3 if3Var, gr0 gr0Var) {
        this.a = 7;
        this.b = if3Var;
    }
}
