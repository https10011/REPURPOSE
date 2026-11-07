package defpackage;

import android.animation.ValueAnimator;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.util.concurrent.ListenableFuture;
import com.hjq.toast.BuildConfig;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gc implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    public gc(lc3 lc3Var, AtomicReference atomicReference, zzr zzrVar) {
        this.a = 12;
        this.b = atomicReference;
        this.c = zzrVar;
        Objects.requireNonNull(lc3Var);
        this.d = lc3Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:110:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x034e A[Catch: SQLiteException -> 0x0359, TRY_LEAVE, TryCatch #2 {SQLiteException -> 0x0359, blocks: (B:114:0x032f, B:116:0x034e), top: B:269:0x032f }] */
    /* JADX WARN: Code duplicated, block: B:123:0x037d  */
    /* JADX WARN: Code duplicated, block: B:124:0x037f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0387  */
    /* JADX WARN: Code duplicated, block: B:127:0x0390  */
    /* JADX WARN: Code duplicated, block: B:132:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        OverScroller overScroller;
        Object objCall;
        int i;
        Task taskB;
        zzbf zzbfVar;
        Cursor cursor;
        long j;
        Cursor cursorQuery;
        kf3 kf3Var;
        String str;
        int i2;
        ef3 ef3Var;
        bu2 bu2Var;
        Long lValueOf;
        ContentValues contentValues;
        c33 c33Var;
        AtomicReference atomicReference;
        qf3 qf3Var;
        int i3 = 0;
        Cursor cursor2 = null;
        strX = null;
        String strX = null;
        switch (this.a) {
            case 0:
                if (hc.g > 0) {
                    if (rq0.p(hc.h)) {
                        if (((SimpleDateFormat) this.c) == null) {
                            this.c = new SimpleDateFormat("yyyy/MM/dd", Locale.ENGLISH);
                        }
                        String str2 = ((SimpleDateFormat) this.c).format(new Date());
                        if (!str2.equals((String) this.d)) {
                            for (Integer num : qd2.b) {
                                if (num.intValue() != 9999) {
                                    hc.g(num.intValue()).i("app_heartbeat", null, num.intValue());
                                }
                            }
                            this.d = str2;
                        }
                    }
                    ((Handler) this.b).postDelayed(this, 3600000L);
                    return;
                }
                return;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.b;
                AppBarLayout.BaseBehavior baseBehavior = (ql0) this.d;
                AppBarLayout appBarLayout = (View) this.c;
                if (appBarLayout == null || (overScroller = baseBehavior.d) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    baseBehavior.w(coordinatorLayout, appBarLayout, baseBehavior.d.getCurrY());
                    appBarLayout.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout2 = appBarLayout;
                baseBehavior.C(coordinatorLayout, appBarLayout2);
                if (appBarLayout2.a0) {
                    appBarLayout2.e(appBarLayout2.f(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                    return;
                }
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                try {
                    objCall = ((ee0) this.c).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.b).post(new bh0(13, (fe0) this.d, objCall));
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                u82.h((View) this.b, (vf3) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((en2) this.c).d((TaskCompletionSource) this.d, (gm2) ((md2) this.b).a);
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                pw0 pw0Var = (pw0) this.b;
                q8 q8Var = (q8) this.c;
                if (q8Var.a > 0) {
                    Bundle bundle = (Bundle) q8Var.c;
                    pw0Var.onCreate(bundle != null ? bundle.getBundle((String) this.d) : null);
                }
                if (q8Var.a >= 2) {
                    pw0Var.onStart();
                }
                if (q8Var.a >= 3) {
                    pw0Var.onResume();
                }
                if (q8Var.a >= 4) {
                    pw0Var.onStop();
                }
                if (q8Var.a >= 5) {
                    pw0Var.onDestroy();
                    return;
                }
                return;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                CloudMessage cloudMessage = (CloudMessage) this.c;
                Intent intent = cloudMessage.a;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    taskB = Tasks.forResult((Object) null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = cloudMessage.a;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = cloudMessage.a;
                    Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
                    if (numValueOf != null) {
                        bundle2.putInt("google.product_id", numValueOf.intValue());
                    }
                    Context context = (Context) this.b;
                    bundle2.putBoolean("supports_message_handled", true);
                    ll3 ll3VarA = ll3.a(context);
                    synchronized (ll3VarA) {
                        i = ll3VarA.a;
                        ll3VarA.a = i + 1;
                    }
                    taskB = ll3VarA.b(new xg3(i, 2, bundle2, 0));
                }
                taskB.addOnCompleteListener(iz2.b, new wa((CountDownLatch) this.d, 28));
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                if3 if3Var = ((g73) this.d).a;
                if3Var.V();
                zzah zzahVar = (zzah) this.b;
                Object objZza = zzahVar.c.zza();
                zzr zzrVar = (zzr) this.c;
                if (objZza == null) {
                    if3Var.a0(zzahVar, zzrVar);
                    return;
                } else {
                    if3Var.Z(zzahVar, zzrVar);
                    return;
                }
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                zzbh zzbhVar = (zzbh) this.b;
                zzr zzrVar2 = (zzr) this.c;
                g73 g73Var = (g73) this.d;
                g73Var.getClass();
                if3 if3Var2 = g73Var.a;
                if ("_cmp".equals(zzbhVar.a) && (zzbfVar = zzbhVar.b) != null) {
                    Bundle bundle3 = zzbfVar.a;
                    if (bundle3.size() != 0) {
                        String string = bundle3.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            if3Var2.d().Y.b(zzbhVar.toString(), "Event has been filtered ");
                            zzbhVar = new zzbh("_cmpx", zzbfVar, zzbhVar.c, zzbhVar.d, zzbhVar.e);
                        }
                    }
                }
                String str3 = zzbhVar.a;
                f53 f53Var = if3Var2.a;
                lf3 lf3Var = if3Var2.i;
                if3.T(f53Var);
                String str4 = zzrVar2.a;
                aw2 aw2Var = TextUtils.isEmpty(str4) ? null : (aw2) f53Var.X.b(str4);
                if (aw2Var == null) {
                    if3Var2.d().a0.b(zzrVar2.a, "EES not loaded for");
                    if3Var2.V();
                    if3Var2.j(zzbhVar, zzrVar2);
                    return;
                }
                try {
                    p11 p11Var = aw2Var.c;
                    if3.T(lf3Var);
                    HashMap mapS0 = lf3.s0(zzbhVar.b.U(), true);
                    String strH = ia.H(str3, gu2.l, gu2.g);
                    if (strH == null) {
                        strH = str3;
                    }
                    if (aw2Var.a(new fj2(strH, zzbhVar.d, mapS0))) {
                        if (((fj2) p11Var.c).equals((fj2) p11Var.b)) {
                            if3Var2.V();
                            if3Var2.j(zzbhVar, zzrVar2);
                        } else {
                            if3Var2.d().a0.b(str3, "EES edited event");
                            if3.T(lf3Var);
                            zzbh zzbhVarI = lf3.I((fj2) p11Var.c);
                            if3Var2.V();
                            if3Var2.j(zzbhVarI, zzrVar2);
                        }
                        if (((ArrayList) p11Var.d).isEmpty()) {
                            return;
                        }
                        ArrayList arrayList = (ArrayList) p11Var.d;
                        int size = arrayList.size();
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            fj2 fj2Var = (fj2) obj;
                            if3Var2.d().a0.b(fj2Var.a, "EES logging created event");
                            if3.T(lf3Var);
                            zzbh zzbhVarI2 = lf3.I(fj2Var);
                            if3Var2.V();
                            if3Var2.j(zzbhVarI2, zzrVar2);
                        }
                        return;
                    }
                } catch (ey2 unused2) {
                    if3Var2.d().f.c(zzrVar2.b, str3, "EES error. appId, eventName");
                }
                if3Var2.d().a0.b(str3, "EES was not applied to event");
                if3Var2.V();
                if3Var2.j(zzbhVar, zzrVar2);
                return;
            case 9:
                g73 g73Var2 = (g73) this.c;
                g73Var2.a.V();
                g73Var2.a.h((zzbh) this.b, (String) this.d);
                return;
            case 10:
                if3 if3Var3 = ((g73) this.d).a;
                if3Var3.V();
                zzpl zzplVar = (zzpl) this.b;
                Object objZza2 = zzplVar.zza();
                zzr zzrVar3 = (zzr) this.c;
                if (objZza2 == null) {
                    if3Var3.X(zzplVar.b, zzrVar3);
                    return;
                } else {
                    if3Var3.W(zzplVar, zzrVar3);
                    return;
                }
            case 11:
                g73 g73Var3 = (g73) this.b;
                zzr zzrVar4 = (zzr) this.c;
                zzaf zzafVar = (zzaf) this.d;
                if3 if3Var4 = g73Var3.a;
                if3Var4.V();
                String str5 = zzrVar4.a;
                gu2.o(str5);
                HashMap map = if3Var4.r0;
                if3Var4.e().D();
                if3Var4.l0();
                bu2 bu2Var2 = if3Var4.c;
                if3.T(bu2Var2);
                long j2 = zzafVar.a;
                long j3 = zzafVar.c;
                bu2Var2.D();
                bu2Var2.F();
                try {
                    try {
                        cursor = null;
                        try {
                            cursorQuery = bu2Var2.v0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    j = j2;
                                    try {
                                        String string2 = cursorQuery.getString(1);
                                        gu2.o(string2);
                                        kf3 kf3VarH0 = bu2Var2.h0(string2, j, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                        cursorQuery.close();
                                        kf3Var = kf3VarH0;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        c33 c33Var2 = ((y53) bu2Var2.a).f;
                                        y53.l(c33Var2);
                                        c33Var2.f.c(Long.valueOf(j), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        kf3Var = cursor;
                                    }
                                } else {
                                    j = j2;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    kf3Var = cursor;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                j = j2;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            j = j2;
                            cursorQuery = cursor;
                            c33 c33Var3 = ((y53) bu2Var2.a).f;
                            y53.l(c33Var3);
                            c33Var3.f.c(Long.valueOf(j), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            kf3Var = cursor;
                            if (kf3Var == null) {
                                if3Var4.d().w.c(str5, Long.valueOf(j), "[sgtm] Queued batch doesn't exist. appId, rowId");
                                return;
                            }
                            str = kf3Var.c;
                            i2 = zzafVar.b;
                            if (i2 == 1) {
                                if (i2 == 3) {
                                    ef3Var = (ef3) map.get(str);
                                    if (ef3Var == null) {
                                        ef3Var = new ef3(if3Var4);
                                        map.put(str, ef3Var);
                                    } else {
                                        ef3Var.b++;
                                        ef3Var.c = ef3Var.a();
                                    }
                                    if3Var4.g().getClass();
                                    if3Var4.d().a0.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str5, str, Long.valueOf((ef3Var.c - System.currentTimeMillis()) / 1000));
                                }
                                bu2 bu2Var3 = if3Var4.c;
                                if3.T(bu2Var3);
                                Long lValueOf2 = Long.valueOf(zzafVar.a);
                                bu2Var3.Q(lValueOf2);
                                if3Var4.d().a0.c(str5, lValueOf2, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                                return;
                            }
                            if (map.containsKey(str)) {
                                map.remove(str);
                            }
                            bu2 bu2Var4 = if3Var4.c;
                            if3.T(bu2Var4);
                            Long lValueOf3 = Long.valueOf(j);
                            bu2Var4.L(lValueOf3);
                            if3Var4.d().a0.c(str5, lValueOf3, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                            if (j3 > 0) {
                                bu2Var = if3Var4.c;
                                if3.T(bu2Var);
                                y53 y53Var = (y53) bu2Var.a;
                                bu2Var.D();
                                bu2Var.F();
                                lValueOf = Long.valueOf(j3);
                                contentValues = new ContentValues();
                                contentValues.put("upload_type", (Integer) 1);
                                r41 r41Var = y53Var.X;
                                c33Var = y53Var.f;
                                r41Var.getClass();
                                contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                                try {
                                    if (bu2Var.v0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str5, String.valueOf(4)}) != 1) {
                                        y53.l(c33Var);
                                        c33Var.w.c(str5, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                                        break;
                                    }
                                    if3Var4.d().a0.c(str5, Long.valueOf(j3), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                                    if3Var4.t(str5);
                                    return;
                                } catch (SQLiteException e4) {
                                    y53.l(c33Var);
                                    c33Var.f.d("Failed to update google Signal pending batch. appid, rowId", str5, Long.valueOf(j3), e4);
                                    throw e4;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
                if (kf3Var == null) {
                    if3Var4.d().w.c(str5, Long.valueOf(j), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                str = kf3Var.c;
                i2 = zzafVar.b;
                if (i2 == 1) {
                    if (i2 == 3) {
                        ef3Var = (ef3) map.get(str);
                        if (ef3Var == null) {
                            ef3Var = new ef3(if3Var4);
                            map.put(str, ef3Var);
                        } else {
                            ef3Var.b++;
                            ef3Var.c = ef3Var.a();
                        }
                        if3Var4.g().getClass();
                        if3Var4.d().a0.d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str5, str, Long.valueOf((ef3Var.c - System.currentTimeMillis()) / 1000));
                    }
                    bu2 bu2Var5 = if3Var4.c;
                    if3.T(bu2Var5);
                    Long lValueOf4 = Long.valueOf(zzafVar.a);
                    bu2Var5.Q(lValueOf4);
                    if3Var4.d().a0.c(str5, lValueOf4, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str)) {
                    map.remove(str);
                }
                bu2 bu2Var6 = if3Var4.c;
                if3.T(bu2Var6);
                Long lValueOf5 = Long.valueOf(j);
                bu2Var6.L(lValueOf5);
                if3Var4.d().a0.c(str5, lValueOf5, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j3 > 0) {
                    bu2Var = if3Var4.c;
                    if3.T(bu2Var);
                    y53 y53Var2 = (y53) bu2Var.a;
                    bu2Var.D();
                    bu2Var.F();
                    lValueOf = Long.valueOf(j3);
                    contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    r41 r41Var2 = y53Var2.X;
                    c33Var = y53Var2.f;
                    r41Var2.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    if (bu2Var.v0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j3), str5, String.valueOf(4)}) != 1) {
                        y53.l(c33Var);
                        c33Var.w.c(str5, lValueOf, "Google Signal pending batch not updated. appId, rowId");
                        break;
                    }
                    if3Var4.d().a0.c(str5, Long.valueOf(j3), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                    if3Var4.t(str5);
                    return;
                }
                return;
            case 12:
                AtomicReference atomicReference2 = (AtomicReference) this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            lc3 lc3Var = (lc3) this.d;
                            y53 y53Var3 = (y53) lc3Var.a;
                            h43 h43Var = y53Var3.e;
                            y53.j(h43Var);
                            if (h43Var.L().i(n73.ANALYTICS_STORAGE)) {
                                n13 n13Var = lc3Var.d;
                                if (n13Var != null) {
                                    atomicReference2.set(n13Var.x((zzr) this.c));
                                    String str6 = (String) atomicReference2.get();
                                    if (str6 != null) {
                                        w93 w93Var = ((y53) lc3Var.a).Z;
                                        y53.k(w93Var);
                                        w93Var.i.set(str6);
                                        h43 h43Var2 = y53Var3.e;
                                        y53.j(h43Var2);
                                        h43Var2.i.k(str6);
                                    }
                                    lc3Var.R();
                                    atomicReference = (AtomicReference) this.b;
                                    atomicReference.notify();
                                    return;
                                }
                                c33 c33Var4 = y53Var3.f;
                                y53.l(c33Var4);
                                c33Var4.f.a("Failed to get app instance id");
                            } else {
                                c33 c33Var5 = y53Var3.f;
                                y53.l(c33Var5);
                                c33Var5.X.a("Analytics storage consent denied; will not get app instance id");
                                w93 w93Var2 = ((y53) lc3Var.a).Z;
                                y53.k(w93Var2);
                                w93Var2.i.set(null);
                                h43 h43Var3 = y53Var3.e;
                                y53.j(h43Var3);
                                h43Var3.i.k(null);
                                atomicReference2.set(null);
                            }
                            atomicReference2.notify();
                            return;
                        } catch (RemoteException e6) {
                            c33 c33Var6 = ((y53) ((lc3) this.d).a).f;
                            y53.l(c33Var6);
                            c33Var6.f.b(e6, "Failed to get app instance id");
                            atomicReference = (AtomicReference) this.b;
                        }
                    } catch (Throwable th4) {
                        ((AtomicReference) this.b).notify();
                        throw th4;
                    }
                }
                break;
            case 13:
                hx2 hx2Var = (hx2) this.c;
                lc3 lc3Var2 = (lc3) this.d;
                try {
                    try {
                        y53 y53Var4 = (y53) lc3Var2.a;
                        h43 h43Var4 = y53Var4.e;
                        c33 c33Var7 = y53Var4.f;
                        y53.j(h43Var4);
                        if (h43Var4.L().i(n73.ANALYTICS_STORAGE)) {
                            n13 n13Var2 = lc3Var2.d;
                            if (n13Var2 != null) {
                                strX = n13Var2.x((zzr) this.b);
                                if (strX != null) {
                                    w93 w93Var3 = y53Var4.Z;
                                    y53.k(w93Var3);
                                    w93Var3.i.set(strX);
                                    y53.j(h43Var4);
                                    h43Var4.i.k(strX);
                                }
                                lc3Var2.R();
                                qf3Var = ((y53) lc3Var2.a).w;
                                y53.j(qf3Var);
                                qf3Var.r0(strX, hx2Var);
                                return;
                            }
                            y53.l(c33Var7);
                            c33Var7.f.a("Failed to get app instance id");
                        } else {
                            y53.l(c33Var7);
                            c33Var7.X.a("Analytics storage consent denied; will not get app instance id");
                            w93 w93Var4 = y53Var4.Z;
                            y53.k(w93Var4);
                            w93Var4.i.set(null);
                            y53.j(h43Var4);
                            h43Var4.i.k(null);
                        }
                        qf3Var = y53Var4.w;
                    } catch (Throwable th5) {
                        qf3 qf3Var2 = ((y53) lc3Var2.a).w;
                        y53.j(qf3Var2);
                        qf3Var2.r0(null, hx2Var);
                        throw th5;
                    }
                } catch (RemoteException e7) {
                    c33 c33Var8 = ((y53) lc3Var2.a).f;
                    y53.l(c33Var8);
                    c33Var8.f.b(e7, "Failed to get app instance id");
                }
                y53.j(qf3Var);
                qf3Var.r0(strX, hx2Var);
                return;
            case 14:
                lc3 lc3Var3 = (lc3) this.b;
                zzr zzrVar5 = (zzr) this.c;
                zzaf zzafVar2 = (zzaf) this.d;
                y53 y53Var5 = (y53) lc3Var3.a;
                n13 n13Var3 = lc3Var3.d;
                if (n13Var3 == null) {
                    c33 c33Var9 = y53Var5.f;
                    y53.l(c33Var9);
                    c33Var9.f.a("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    n13Var3.b(zzrVar5, zzafVar2);
                    lc3Var3.R();
                    return;
                } catch (RemoteException e8) {
                    c33 c33Var10 = y53Var5.f;
                    y53.l(c33Var10);
                    c33Var10.f.c(Long.valueOf(zzafVar2.a), e8, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 15:
                ox1 ox1Var = (ox1) this.b;
                c33 c33Var11 = (c33) this.c;
                JobParameters jobParameters = (JobParameters) this.d;
                c33Var11.a0.a("AppMeasurementJobService processed last upload request.");
                ((sc3) ((Service) ox1Var.a)).b(jobParameters);
                return;
            default:
                qp0 qp0Var = (qp0) this.b;
                ListenableFuture listenableFuture = (mp1) this.c;
                am3 am3Var = (am3) this.d;
                try {
                    Object objB = dh0.b(listenableFuture);
                    mp1 mp1Var = (mp1) qp0Var.f;
                    mp1Var.l(objB);
                    am3Var.n(mp1Var);
                    return;
                } catch (Throwable unused3) {
                    am3Var.n(listenableFuture);
                    return;
                }
        }
    }

    public /* synthetic */ gc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public /* synthetic */ gc(Object obj, Object obj2, Object obj3, int i, boolean z) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ gc(Object obj, Object obj2, String str, int i) {
        this.a = i;
        this.b = obj2;
        this.d = str;
        this.c = obj;
    }

    public /* synthetic */ gc(int i) {
        this.a = i;
    }

    public gc(Handler handler) {
        this.a = 0;
        this.d = BuildConfig.FLAVOR;
        this.b = handler;
    }

    public gc(View view, z82 z82Var, vf3 vf3Var, ValueAnimator valueAnimator) {
        this.a = 3;
        this.b = view;
        this.c = vf3Var;
        this.d = valueAnimator;
    }
}
