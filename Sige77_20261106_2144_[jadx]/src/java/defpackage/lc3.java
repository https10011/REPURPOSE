package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lc3 extends k13 {
    public final mb3 W;
    public final gc3 c;
    public n13 d;
    public volatile Boolean e;
    public final mb3 f;
    public ScheduledExecutorService i;
    public final jm v;
    public final ArrayList w;

    public lc3(y53 y53Var) {
        super(y53Var);
        this.w = new ArrayList();
        this.v = new jm(y53Var.X);
        this.c = new gc3(this);
        this.f = new mb3(this, y53Var, 0);
        this.W = new mb3(this, y53Var, 1);
    }

    @Override // defpackage.k13
    public final boolean H() {
        return false;
    }

    public final void I(AtomicReference atomicReference) {
        D();
        F();
        S(new gc(this, atomicReference, U(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void J(Bundle bundle) {
        boolean z;
        boolean zL;
        D();
        F();
        zzbf zzbfVar = new zzbf(bundle);
        Q();
        y53 y53Var = (y53) this.a;
        if (y53Var.d.P(null, h13.W0)) {
            m23 m23VarN = y53Var.n();
            y53 y53Var2 = (y53) m23VarN.a;
            qf3 qf3Var = y53Var2.w;
            c33 c33Var = y53Var2.f;
            y53.j(qf3Var);
            byte[] bArrN0 = qf3.n0(zzbfVar);
            if (bArrN0 == null) {
                y53.l(c33Var);
                c33Var.i.a("Null default event parameters; not writing to database");
            } else {
                if (bArrN0.length > 131072) {
                    y53.l(c33Var);
                    c33Var.i.a("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zL = m23VarN.L(bArrN0, 4);
                }
                if (zL) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zL = false;
            if (zL) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        S(new d83(this, U(false), z, zzbfVar, bundle));
    }

    public final void K() {
        D();
        F();
        if (V()) {
            return;
        }
        if (L()) {
            gc3 gc3Var = this.c;
            lc3 lc3Var = gc3Var.c;
            lc3Var.D();
            Context context = ((y53) lc3Var.a).a;
            synchronized (gc3Var) {
                try {
                    if (gc3Var.a) {
                        c33 c33Var = ((y53) gc3Var.c.a).f;
                        y53.l(c33Var);
                        c33Var.a0.a("Connection attempt already in progress");
                        return;
                    } else {
                        if (gc3Var.b != null && (gc3Var.b.q() || gc3Var.b.p())) {
                            c33 c33Var2 = ((y53) gc3Var.c.a).f;
                            y53.l(c33Var2);
                            c33Var2.a0.a("Already awaiting connection attempt");
                            return;
                        }
                        gc3Var.b = new r23(context, Looper.getMainLooper(), yf3.a(context), rj0.b, 93, gc3Var, gc3Var, null);
                        c33 c33Var3 = ((y53) gc3Var.c.a).f;
                        y53.l(c33Var3);
                        c33Var3.a0.a("Connecting to remote service");
                        gc3Var.a = true;
                        gu2.o(gc3Var.b);
                        gc3Var.b.a();
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        y53 y53Var = (y53) this.a;
        if (y53Var.d.H()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = y53Var.a.getPackageManager().queryIntentServices(new Intent().setClassName(y53Var.a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c33 c33Var4 = y53Var.f;
            y53.l(c33Var4);
            c33Var4.f.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(y53Var.a, "com.google.android.gms.measurement.AppMeasurementService"));
        gc3 gc3Var2 = this.c;
        lc3 lc3Var2 = gc3Var2.c;
        lc3Var2.D();
        Context context2 = ((y53) lc3Var2.a).a;
        yq yqVarB = yq.b();
        synchronized (gc3Var2) {
            try {
                boolean z = gc3Var2.a;
                lc3 lc3Var3 = gc3Var2.c;
                if (z) {
                    c33 c33Var5 = ((y53) lc3Var3.a).f;
                    y53.l(c33Var5);
                    c33Var5.a0.a("Connection attempt already in progress");
                } else {
                    c33 c33Var6 = ((y53) lc3Var3.a).f;
                    y53.l(c33Var6);
                    c33Var6.a0.a("Using local app measurement service");
                    gc3Var2.a = true;
                    yqVarB.a(context2, intent, lc3Var3.c, 129);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.GooglePlayServicesMissingManifestValueException */
    public final boolean L() throws GooglePlayServicesMissingManifestValueException, GooglePlayServicesIncorrectManifestValueException {
        D();
        F();
        if (this.e == null) {
            D();
            F();
            y53 y53Var = (y53) this.a;
            h43 h43Var = y53Var.e;
            y53.j(h43Var);
            h43Var.D();
            boolean z = false;
            Boolean boolValueOf = !h43Var.I().contains("use_service") ? null : Boolean.valueOf(h43Var.I().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                e23 e23VarQ = ((y53) this.a).q();
                e23VarQ.F();
                if (e23VarQ.a0 == 1) {
                    z = true;
                } else {
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.a0.a("Checking service availability");
                    qf3 qf3Var = y53Var.w;
                    y53.j(qf3Var);
                    int iC = rj0.b.c(((y53) qf3Var.a).a, 12451000);
                    if (iC == 0) {
                        c33 c33Var2 = y53Var.f;
                        y53.l(c33Var2);
                        c33Var2.a0.a("Service available");
                    } else if (iC == 1) {
                        c33 c33Var3 = y53Var.f;
                        y53.l(c33Var3);
                        c33Var3.a0.a("Service missing");
                    } else if (iC != 2) {
                        if (iC != 3) {
                            c33 c33Var4 = y53Var.f;
                            if (iC == 9) {
                                y53.l(c33Var4);
                                c33Var4.w.a("Service invalid");
                            } else if (iC != 18) {
                                y53.l(c33Var4);
                                c33Var4.w.b(Integer.valueOf(iC), "Unexpected service status");
                            } else {
                                y53.l(c33Var4);
                                c33Var4.w.a("Service updating");
                            }
                        } else {
                            c33 c33Var5 = y53Var.f;
                            y53.l(c33Var5);
                            c33Var5.w.a("Service disabled");
                        }
                        z2 = false;
                    } else {
                        c33 c33Var6 = y53Var.f;
                        y53.l(c33Var6);
                        c33Var6.Z.a("Service container out of date");
                        qf3 qf3Var2 = y53Var.w;
                        y53.j(qf3Var2);
                        if (qf3Var2.p0() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && y53Var.d.H()) {
                    c33 c33Var7 = y53Var.f;
                    y53.l(c33Var7);
                    c33Var7.f.a("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    h43 h43Var2 = y53Var.e;
                    y53.j(h43Var2);
                    h43Var2.D();
                    SharedPreferences.Editor editorEdit = h43Var2.I().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.e = Boolean.valueOf(z2);
        }
        return this.e.booleanValue();
    }

    public final void M() {
        D();
        F();
        gc3 gc3Var = this.c;
        if (gc3Var.b != null && (gc3Var.b.p() || gc3Var.b.q())) {
            gc3Var.b.c();
        }
        gc3Var.b = null;
        try {
            yq.b().c(((y53) this.a).a, gc3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.d = null;
    }

    public final boolean N() {
        D();
        F();
        if (!L()) {
            return true;
        }
        qf3 qf3Var = ((y53) this.a).w;
        y53.j(qf3Var);
        return qf3Var.p0() >= ((Integer) h13.J0.a(null)).intValue();
    }

    public final boolean O() {
        D();
        F();
        if (!L()) {
            return true;
        }
        qf3 qf3Var = ((y53) this.a).w;
        y53.j(qf3Var);
        return qf3Var.p0() >= 241200;
    }

    public final void P(ComponentName componentName) {
        D();
        if (this.d != null) {
            this.d = null;
            c33 c33Var = ((y53) this.a).f;
            y53.l(c33Var);
            c33Var.a0.b(componentName, "Disconnected from device MeasurementService");
            D();
            K();
        }
    }

    public final void Q() {
        ((y53) this.a).getClass();
    }

    public final void R() {
        D();
        jm jmVar = this.v;
        ((r41) jmVar.c).getClass();
        jmVar.b = SystemClock.elapsedRealtime();
        ((y53) this.a).getClass();
        this.f.b(((Long) h13.Y.a(null)).longValue());
    }

    public final void S(Runnable runnable) {
        D();
        if (V()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.w;
        long size = arrayList.size();
        y53 y53Var = (y53) this.a;
        y53Var.getClass();
        if (size >= 1000) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            c33Var.f.a("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.W.b(60000L);
            K();
        }
    }

    public final void T() {
        D();
        y53 y53Var = (y53) this.a;
        c33 c33Var = y53Var.f;
        y53.l(c33Var);
        z23 z23Var = c33Var.a0;
        ArrayList arrayList = this.w;
        z23Var.b(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e) {
                c33 c33Var2 = y53Var.f;
                y53.l(c33Var2);
                c33Var2.f.b(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.W.c();
    }

    public final zzr U(boolean z) {
        long jAbs;
        Pair pair;
        y53 y53Var = (y53) this.a;
        y53Var.getClass();
        e23 e23VarQ = y53Var.q();
        String strL = null;
        if (z) {
            c33 c33Var = y53Var.f;
            y53.l(c33Var);
            y53 y53Var2 = (y53) c33Var.a;
            h43 h43Var = y53Var2.e;
            y53.j(h43Var);
            if (h43Var.e != null) {
                h43 h43Var2 = y53Var2.e;
                y53.j(h43Var2);
                e20 e20Var = h43Var2.e;
                h43 h43Var3 = (h43) e20Var.e;
                h43Var3.D();
                h43Var3.D();
                long j = ((h43) e20Var.e).I().getLong((String) e20Var.b, 0L);
                if (j == 0) {
                    e20Var.e();
                    jAbs = 0;
                } else {
                    ((y53) h43Var3.a).X.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = e20Var.a;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    e20Var.e();
                    pair = null;
                } else {
                    String string = h43Var3.I().getString((String) e20Var.d, null);
                    long j3 = h43Var3.I().getLong((String) e20Var.c, 0L);
                    e20Var.e();
                    pair = (string == null || j3 <= 0) ? h43.m0 : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != h43.m0) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strL = y00.l(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return e23VarQ.I(strL);
    }

    public final boolean V() {
        D();
        F();
        return this.d != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #50 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:393:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0452  */
    /* JADX WARN: Code duplicated, block: B:271:0x046d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0472 A[PHI: r4 r6 r23 r24 r26 r36 r37
      0x0472: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
      (r4v12 android.database.sqlite.SQLiteDatabase)
      (r4v13 android.database.sqlite.SQLiteDatabase)
      (r4v16 android.database.sqlite.SQLiteDatabase)
     binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
      0x0472: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0496  */
    /* JADX WARN: Code duplicated, block: B:285:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:287:0x04af  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:304:0x0505  */
    /* JADX WARN: Code duplicated, block: B:305:0x058f  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bc A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #42 {RemoteException -> 0x05ea, blocks: (B:314:0x05b1, B:316:0x05bc), top: B:385:0x05b1 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:337:0x0626  */
    /* JADX WARN: Code duplicated, block: B:339:0x062a  */
    /* JADX WARN: Code duplicated, block: B:341:0x064b  */
    /* JADX WARN: Code duplicated, block: B:347:0x066a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0682  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:379:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049c A[SYNTHETIC] */
    public final void W(n13 n13Var, AbstractSafeParcelable abstractSafeParcelable, zzr zzrVar) throws Throwable {
        ArrayList arrayList;
        y53 y53Var;
        Context context;
        c33 c33Var;
        int i;
        SQLiteDatabase sQLiteDatabaseK;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        zzbf zzbfVar;
        int i5;
        zzah zzahVar;
        zzpl zzplVar;
        int size;
        int size2;
        int i6;
        j23 j23Var;
        zzbf zzbfVar2;
        f13 f13Var;
        y53 y53Var2;
        Context context2;
        c33 c33Var2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        D();
        F();
        Q();
        y53 y53Var3 = (y53) this.a;
        y53Var3.getClass();
        Context context3 = y53Var3.a;
        is2 is2Var = y53Var3.d;
        c33 c33Var3 = y53Var3.f;
        r41 r41Var = y53Var3.X;
        int i7 = 100;
        zzr zzrVar2 = zzrVar;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            m23 m23VarN = y53Var3.n();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            r41 r41Var2 = r41Var;
            y53 y53Var4 = (y53) m23VarN.a;
            m23VarN.D();
            int i11 = i8;
            if (m23VarN.d) {
                y53Var = y53Var3;
                context = context3;
                c33Var = c33Var3;
            } else {
                arrayList = new ArrayList();
                y53Var = y53Var3;
                if (((y53) m23VarN.a).a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    c33Var = c33Var3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseK = m23VarN.K();
                                if (sQLiteDatabaseK == null) {
                                    try {
                                        try {
                                            m23VarN.d = true;
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabaseK = sQLiteDatabaseK;
                                            cursor = null;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseK != null) {
                                                sQLiteDatabaseK.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        try {
                                            SystemClock.sleep(i14);
                                            i14 += 20;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseK != null) {
                                                sQLiteDatabaseK.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursorQuery;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseK != null) {
                                                sQLiteDatabaseK.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        c33 c33Var4 = y53Var4.f;
                                        y53.l(c33Var4);
                                        c33Var4.f.b(e, "Error reading entries from local database");
                                        m23VarN.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        i2 = i13;
                                        str5 = str5;
                                        i3 = 5;
                                        str4 = str4;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.endTransaction();
                                        }
                                        c33 c33Var5 = y53Var4.f;
                                        y53.l(c33Var5);
                                        c33Var5.f.b(e, "Error reading entries from local database");
                                        m23VarN.d = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseK != null) {
                                            sQLiteDatabaseK.close();
                                        }
                                        i13 = i2 + 1;
                                        i12 = i3;
                                        str4 = str4;
                                        str3 = str3;
                                        str5 = str5;
                                    }
                                } else {
                                    sQLiteDatabaseK.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseK.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseK != null) {
                                                            sQLiteDatabaseK.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        c33 c33Var6 = y53Var4.f;
                                                        y53.l(c33Var6);
                                                        c33Var6.f.b(e, "Error reading entries from local database");
                                                        m23VarN.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseK != null) {
                                                            sQLiteDatabaseK.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseK != null && sQLiteDatabaseK.inTransaction()) {
                                                            sQLiteDatabaseK.endTransaction();
                                                        }
                                                        c33 c33Var7 = y53Var4.f;
                                                        y53.l(c33Var7);
                                                        c33Var7.f.b(e, "Error reading entries from local database");
                                                        m23VarN.d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseK != null) {
                                                            sQLiteDatabaseK.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            c33 c33Var8 = y53Var4.f;
                                                            y53.l(c33Var8);
                                                            c33Var8.f.b(e, "Error reading entries from local database");
                                                            m23VarN.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.endTransaction();
                                                            }
                                                            c33 c33Var9 = y53Var4.f;
                                                            y53.l(c33Var9);
                                                            c33Var9.f.b(e, "Error reading entries from local database");
                                                            m23VarN.d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                is2 is2Var2 = y53Var4.d;
                                                f13 f13Var2 = h13.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (is2Var2.P(null, f13Var2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                c33 c33Var10 = y53Var4.f;
                                                                y53.l(c33Var10);
                                                                c33Var10.f.b(e, "Error reading entries from local database");
                                                                m23VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.endTransaction();
                                                                }
                                                                c33 c33Var11 = y53Var4.f;
                                                                y53.l(c33Var11);
                                                                c33Var11.f.b(e, "Error reading entries from local database");
                                                                m23VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseK.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (y53Var4.d.P(null, f13Var2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                c33 c33Var12 = y53Var4.f;
                                                                                                y53.l(c33Var12);
                                                                                                c33Var12.f.b(e, "Error reading entries from local database");
                                                                                                m23VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.endTransaction();
                                                                                                }
                                                                                                c33 c33Var13 = y53Var4.f;
                                                                                                y53.l(c33Var13);
                                                                                                c33Var13.f.b(e, "Error reading entries from local database");
                                                                                                m23VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            zzbh zzbhVar = (zzbh) zzbh.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (zzbhVar != null) {
                                                                                                                arrayList.add(new j23(zzbhVar, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (ml1 unused6) {
                                                                                                        c33 c33Var14 = y53Var4.f;
                                                                                                        y53.l(c33Var14);
                                                                                                        c33Var14.f.a("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (Throwable th6) {
                                                                                                    th = th6;
                                                                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                    cursor = cursorQuery;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseK != null) {
                                                                                                        sQLiteDatabaseK.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e11) {
                                                                                                e = e11;
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                c33 c33Var15 = y53Var4.f;
                                                                                                y53.l(c33Var15);
                                                                                                c33Var15.f.b(e, "Error reading entries from local database");
                                                                                                m23VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.endTransaction();
                                                                                                }
                                                                                                c33 c33Var16 = y53Var4.f;
                                                                                                y53.l(c33Var16);
                                                                                                c33Var16.f.b(e, "Error reading entries from local database");
                                                                                                m23VarN.d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseK != null) {
                                                                                                    sQLiteDatabaseK.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        zzplVar = (zzpl) zzpl.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (Throwable th7) {
                                                                                                        parcelObtain2.recycle();
                                                                                                        throw th7;
                                                                                                    }
                                                                                                } catch (ml1 unused8) {
                                                                                                    c33 c33Var17 = y53Var4.f;
                                                                                                    y53.l(c33Var17);
                                                                                                    c33Var17.f.a("Failed to load user property from local database");
                                                                                                    parcelObtain2.recycle();
                                                                                                    zzplVar = null;
                                                                                                }
                                                                                                if (zzplVar != null) {
                                                                                                    arrayList.add(new j23(zzplVar, string, j2));
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            zzahVar = (zzah) zzah.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th8) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th8;
                                                                                                        }
                                                                                                    } catch (ml1 unused9) {
                                                                                                        c33 c33Var18 = y53Var4.f;
                                                                                                        y53.l(c33Var18);
                                                                                                        c33Var18.f.a("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        zzahVar = null;
                                                                                                    }
                                                                                                    if (zzahVar != null) {
                                                                                                        arrayList.add(new j23(zzahVar, string, j2));
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    zzbfVar = (zzbf) zzbf.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                        if (zzbfVar != null) {
                                                                                                                            arrayList.add(new j23(zzbfVar, string, j2));
                                                                                                                        }
                                                                                                                        i5 = 3;
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                                            sQLiteDatabaseK.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                                        i3 = 5;
                                                                                                                        c33 c33Var19 = y53Var4.f;
                                                                                                                        y53.l(c33Var19);
                                                                                                                        c33Var19.f.b(e, "Error reading entries from local database");
                                                                                                                        m23VarN.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                                            sQLiteDatabaseK.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                                            sQLiteDatabaseK.endTransaction();
                                                                                                                        }
                                                                                                                        c33 c33Var110 = y53Var4.f;
                                                                                                                        y53.l(c33Var110);
                                                                                                                        c33Var110.f.b(e, "Error reading entries from local database");
                                                                                                                        m23VarN.d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                                            sQLiteDatabaseK.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (Throwable th9) {
                                                                                                                    th = th9;
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (ml1 unused11) {
                                                                                                                c33 c33Var20 = y53Var4.f;
                                                                                                                y53.l(c33Var20);
                                                                                                                c33Var20.f.a("Failed to load default event parameters from local database");
                                                                                                                parcelObtain4.recycle();
                                                                                                                zzbfVar = null;
                                                                                                            }
                                                                                                        } catch (ml1 unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                            sQLiteDatabaseK.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                        i3 = 5;
                                                                                                        c33 c33Var111 = y53Var4.f;
                                                                                                        y53.l(c33Var111);
                                                                                                        c33Var111.f.b(e, "Error reading entries from local database");
                                                                                                        m23VarN.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                            sQLiteDatabaseK.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                            sQLiteDatabaseK.endTransaction();
                                                                                                        }
                                                                                                        c33 c33Var112 = y53Var4.f;
                                                                                                        y53.l(c33Var112);
                                                                                                        c33Var112.f.b(e, "Error reading entries from local database");
                                                                                                        m23VarN.d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseK != null) {
                                                                                                            sQLiteDatabaseK.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    c33 c33Var21 = y53Var4.f;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        y53.l(c33Var21);
                                                                                                        c33Var21.a0.a("Skipping app launch break");
                                                                                                    } else {
                                                                                                        y53.l(c33Var21);
                                                                                                        c33Var21.f.a("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                f13Var2 = f13Var2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        f13Var2 = f13Var2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseK != null) {
                                                                                        sQLiteDatabaseK.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                    i3 = 5;
                                                                                    c33 c33Var113 = y53Var4.f;
                                                                                    y53.l(c33Var113);
                                                                                    c33Var113.f.b(e, "Error reading entries from local database");
                                                                                    m23VarN.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseK != null) {
                                                                                        sQLiteDatabaseK.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseK != null) {
                                                                                        sQLiteDatabaseK.endTransaction();
                                                                                    }
                                                                                    c33 c33Var114 = y53Var4.f;
                                                                                    y53.l(c33Var114);
                                                                                    c33Var114.f.b(e, "Error reading entries from local database");
                                                                                    m23VarN.d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseK != null) {
                                                                                        sQLiteDatabaseK.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (Throwable th11) {
                                                                        th = th11;
                                                                        cursorQuery = cursorQuery;
                                                                    }
                                                                } catch (SQLiteDatabaseLockedException unused18) {
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteFullException e25) {
                                                                    e = e25;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                } catch (SQLiteException e26) {
                                                                    e = e26;
                                                                    cursorQuery = cursorQuery;
                                                                    str4 = str4;
                                                                    str3 = str3;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseK = sQLiteDatabaseK;
                                                            try {
                                                                if (sQLiteDatabaseK.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    c33 c33Var22 = y53Var4.f;
                                                                    y53.l(c33Var22);
                                                                    c33Var22.f.a("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseK.setTransactionSuccessful();
                                                                sQLiteDatabaseK.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseK.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                c33 c33Var115 = y53Var4.f;
                                                                y53.l(c33Var115);
                                                                c33Var115.f.b(e, "Error reading entries from local database");
                                                                m23VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.endTransaction();
                                                                }
                                                                c33 c33Var116 = y53Var4.f;
                                                                y53.l(c33Var116);
                                                                c33Var116.f.b(e, "Error reading entries from local database");
                                                                m23VarN.d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseK != null) {
                                                                    sQLiteDatabaseK.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseK = sQLiteDatabaseK;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseK != null) {
                                                                sQLiteDatabaseK.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteDatabaseLockedException unused21) {
                                                        str3 = str3;
                                                        sQLiteDatabaseK = sQLiteDatabaseK;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseK != null) {
                                                            sQLiteDatabaseK.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteFullException e29) {
                                                    e = e29;
                                                    str3 = str3;
                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    c33 c33Var117 = y53Var4.f;
                                                    y53.l(c33Var117);
                                                    c33Var117.f.b(e, "Error reading entries from local database");
                                                    m23VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseK != null) {
                                                        sQLiteDatabaseK.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                } catch (SQLiteException e30) {
                                                    e = e30;
                                                    str3 = str3;
                                                    sQLiteDatabaseK = sQLiteDatabaseK;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    if (sQLiteDatabaseK != null) {
                                                        sQLiteDatabaseK.endTransaction();
                                                    }
                                                    c33 c33Var118 = y53Var4.f;
                                                    y53.l(c33Var118);
                                                    c33Var118.f.b(e, "Error reading entries from local database");
                                                    m23VarN.d = true;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseK != null) {
                                                        sQLiteDatabaseK.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseK = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseK = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseK = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseK = null;
                            }
                        } else {
                            i = 0;
                            c33 c33Var23 = y53Var4.f;
                            y53.l(c33Var23);
                            c33Var23.w.a("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    c33Var = c33Var3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractSafeParcelable != null && size < i10) {
                    arrayList2.add(new j23(abstractSafeParcelable, zzrVar2.c, zzrVar2.W));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    j23Var = (j23) arrayList2.get(i6);
                    zzbfVar2 = j23Var.a;
                    f13Var = h13.W0;
                    if (is2Var.P(null, f13Var)) {
                        str2 = j23Var.b;
                        if (!TextUtils.isEmpty(str2)) {
                            zzrVar2 = new zzr(zzrVar2.a, zzrVar2.b, str2, j23Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.i, zzrVar2.v, zzrVar2.w, zzrVar2.X, zzrVar2.Y, zzrVar2.Z, zzrVar2.a0, zzrVar2.b0, zzrVar2.c0, zzrVar2.d0, zzrVar2.e0, zzrVar2.f0, zzrVar2.g0, zzrVar2.h0, zzrVar2.i0, zzrVar2.j0, zzrVar2.k0, zzrVar2.l0, zzrVar2.m0, zzrVar2.n0, zzrVar2.o0, zzrVar2.p0, zzrVar2.q0, zzrVar2.r0, zzrVar2.s0);
                        }
                    }
                    if (zzbfVar2 instanceof zzbh) {
                        try {
                            r41Var2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                r41Var2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        n13Var.w((zzbh) zzbfVar2, zzrVar2);
                                        y53.l(c33Var);
                                        c33Var2 = c33Var;
                                        try {
                                            c33Var2.a0.a("Logging telemetry for logEvent from database");
                                            if (u23.e == null) {
                                                y53Var2 = y53Var;
                                                context2 = context;
                                                try {
                                                    u23.e = new u23(context2, y53Var2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    y53.l(c33Var2);
                                                    c33Var2.f.b(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (u23.e == null) {
                                                            u23.e = new u23(context2, y53Var2);
                                                        }
                                                        u23 u23Var = u23.e;
                                                        r41Var2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        r41Var2.getClass();
                                                        u23Var.l(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                y53Var2 = y53Var;
                                                context2 = context;
                                            }
                                            u23 u23Var2 = u23.e;
                                            r41Var2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            r41Var2.getClass();
                                            u23Var2.l(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            y53Var2 = y53Var;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        y53Var2 = y53Var;
                                        context2 = context;
                                        c33Var2 = c33Var;
                                        j3 = jCurrentTimeMillis;
                                        y53.l(c33Var2);
                                        c33Var2.f.b(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (u23.e == null) {
                                                u23.e = new u23(context2, y53Var2);
                                            }
                                            u23 u23Var3 = u23.e;
                                            r41Var2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            r41Var2.getClass();
                                            u23Var3.l(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        c33Var = c33Var2;
                                        y53Var = y53Var2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                y53Var2 = y53Var;
                                context2 = context;
                                c33Var2 = c33Var;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            y53Var2 = y53Var;
                            context2 = context;
                            c33Var2 = c33Var;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        y53Var2 = y53Var;
                        context2 = context;
                        c33Var2 = c33Var;
                        if (zzbfVar2 instanceof zzpl) {
                            try {
                                n13Var.g((zzpl) zzbfVar2, zzrVar2);
                            } catch (RemoteException e41) {
                                y53.l(c33Var2);
                                c33Var2.f.b(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (zzbfVar2 instanceof zzah) {
                                try {
                                    n13Var.f((zzah) zzbfVar2, zzrVar2);
                                } catch (RemoteException e42) {
                                    y53.l(c33Var2);
                                    c33Var2.f.b(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (is2Var.P(null, f13Var) || !(zzbfVar2 instanceof zzbf)) {
                                y53.l(c33Var2);
                                c33Var2.f.a("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    n13Var.j(zzbfVar2.U(), zzrVar2);
                                } catch (RemoteException e43) {
                                    y53.l(c33Var2);
                                    c33Var2.f.b(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            c33Var = c33Var2;
                            y53Var = y53Var2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    c33Var = c33Var2;
                    y53Var = y53Var2;
                    context = context2;
                    size = size;
                }
                c33Var3 = c33Var;
                y53Var3 = y53Var;
                context3 = context;
                r41Var = r41Var2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractSafeParcelable != null) {
                arrayList2.add(new j23(abstractSafeParcelable, zzrVar2.c, zzrVar2.W));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                j23Var = (j23) arrayList2.get(i6);
                zzbfVar2 = j23Var.a;
                f13Var = h13.W0;
                if (is2Var.P(null, f13Var)) {
                    str2 = j23Var.b;
                    if (!TextUtils.isEmpty(str2)) {
                        zzrVar2 = new zzr(zzrVar2.a, zzrVar2.b, str2, j23Var.c, zzrVar2.d, zzrVar2.e, zzrVar2.f, zzrVar2.i, zzrVar2.v, zzrVar2.w, zzrVar2.X, zzrVar2.Y, zzrVar2.Z, zzrVar2.a0, zzrVar2.b0, zzrVar2.c0, zzrVar2.d0, zzrVar2.e0, zzrVar2.f0, zzrVar2.g0, zzrVar2.h0, zzrVar2.i0, zzrVar2.j0, zzrVar2.k0, zzrVar2.l0, zzrVar2.m0, zzrVar2.n0, zzrVar2.o0, zzrVar2.p0, zzrVar2.q0, zzrVar2.r0, zzrVar2.s0);
                    }
                }
                if (zzbfVar2 instanceof zzbh) {
                    r41Var2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    r41Var2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    n13Var.w((zzbh) zzbfVar2, zzrVar2);
                    y53.l(c33Var);
                    c33Var2 = c33Var;
                    c33Var2.a0.a("Logging telemetry for logEvent from database");
                    if (u23.e == null) {
                        y53Var2 = y53Var;
                        context2 = context;
                        u23.e = new u23(context2, y53Var2);
                    } else {
                        y53Var2 = y53Var;
                        context2 = context;
                    }
                    u23 u23Var4 = u23.e;
                    r41Var2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    r41Var2.getClass();
                    u23Var4.l(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    y53Var2 = y53Var;
                    context2 = context;
                    c33Var2 = c33Var;
                    if (zzbfVar2 instanceof zzpl) {
                        n13Var.g((zzpl) zzbfVar2, zzrVar2);
                    } else {
                        if (zzbfVar2 instanceof zzah) {
                            n13Var.f((zzah) zzbfVar2, zzrVar2);
                        } else if (is2Var.P(null, f13Var)) {
                            y53.l(c33Var2);
                            c33Var2.f.a("Discarding data. Unrecognized parcel type.");
                        } else {
                            y53.l(c33Var2);
                            c33Var2.f.a("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        c33Var = c33Var2;
                        y53Var = y53Var2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                c33Var = c33Var2;
                y53Var = y53Var2;
                context = context2;
                size = size;
            }
            c33Var3 = c33Var;
            y53Var3 = y53Var;
            context3 = context;
            r41Var = r41Var2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    public final void X(zzah zzahVar) {
        boolean zL;
        D();
        F();
        y53 y53Var = (y53) this.a;
        y53Var.getClass();
        m23 m23VarN = y53Var.n();
        y53 y53Var2 = (y53) m23VarN.a;
        y53.j(y53Var2.w);
        byte[] bArrN0 = qf3.n0(zzahVar);
        if (bArrN0.length > 131072) {
            c33 c33Var = y53Var2.f;
            y53.l(c33Var);
            c33Var.i.a("Conditional user property too long for local database. Sending directly to service");
            zL = false;
        } else {
            zL = m23VarN.L(bArrN0, 2);
        }
        S(new r33(this, U(true), zL, new zzah(zzahVar)));
    }
}
