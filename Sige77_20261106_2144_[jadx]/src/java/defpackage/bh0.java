package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.internal.measurement.zzdb;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.signin.internal.zak;
import com.google.android.gms.tasks.Task;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bh0 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public bh0(wt2 wt2Var, String str) {
        this.a = 23;
        this.c = wt2Var;
        gu2.l(str);
        this.b = str;
    }

    private final void a() {
        try {
            e();
        } catch (Error e) {
            synchronized (((wo1) this.c).b) {
                ((wo1) this.c).c = 1;
                throw e;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae A[Catch: all -> 0x00ac, TryCatch #0 {all -> 0x00ac, blocks: (B:33:0x008e, B:35:0x0092, B:37:0x0096, B:42:0x00a3, B:47:0x00ae, B:48:0x00ba), top: B:59:0x008e }] */
    private final void b() {
        boolean z;
        boolean z2;
        bk0 bk0Var = (bk0) this.b;
        ri2 ri2Var = (ri2) this.c;
        yy0 yy0Var = (yy0) bk0Var.b;
        if (yy0Var == null) {
            return;
        }
        nl1 nl1Var = yy0Var.a;
        try {
            byte[] bArr = (byte[]) ri2Var.a;
            vl2 vl2Var = vl2.b;
            int i = yk2.a;
            mf3 mf3VarU = mf3.u(bArr, vl2.c);
            boolean z3 = false;
            for (re3 re3Var : ((gg3) nl1Var.a).f) {
                List listT = mf3VarU.t();
                re3Var.getClass();
                m83 m83Var = hf3.i;
                m83Var.getClass();
                if (listT == null || listT.isEmpty()) {
                    z = false;
                } else {
                    Iterator it = listT.iterator();
                    z = false;
                    while (it.hasNext()) {
                        je3 je3Var = (je3) ((ConcurrentHashMap) m83Var.a).get((String) it.next());
                        if (je3Var != null) {
                            hf3 hf3Var = je3Var.a;
                            if (hf3Var.e) {
                                nx0 nx0Var = hf3Var.a;
                                if (nx0Var != null && (nx0Var.b || ((u61) nx0Var.e).a == 3 || hf3Var.h.m())) {
                                    synchronized (hf3Var) {
                                        try {
                                            nx0 nx0Var2 = hf3Var.a;
                                            if (nx0Var2 != null) {
                                                if (nx0Var2.b) {
                                                    hf3Var.a = null;
                                                    ((AtomicInteger) hf3Var.g.a).incrementAndGet();
                                                } else if ((((u61) nx0Var2.e).a == 3) || hf3Var.h.m()) {
                                                    hf3Var.a = null;
                                                    ((AtomicInteger) hf3Var.g.a).incrementAndGet();
                                                }
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            z |= z2;
                        }
                    }
                }
                if (z && !z3) {
                    ((mg3) nl1Var.b).zza();
                    z3 = true;
                }
            }
        } catch (xm2 unused) {
        }
    }

    private final void c() {
        xe3 xe3Var = (xe3) this.b;
        IBinder iBinder = (IBinder) this.c;
        synchronized (xe3Var) {
            if (iBinder == null) {
                xe3Var.a("Null service connection");
                return;
            }
            try {
                xe3Var.c = new f91(iBinder);
                xe3Var.a = 2;
                ((ScheduledExecutorService) xe3Var.f.c).execute(new d73(xe3Var, 0));
            } catch (RemoteException e) {
                xe3Var.a(e.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d6 A[Catch: NotFoundException -> 0x02db, TRY_LEAVE, TryCatch #4 {NotFoundException -> 0x02db, blocks: (B:104:0x02c4, B:107:0x02d6), top: B:296:0x02c4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:119:0x0307  */
    /* JADX WARN: Code duplicated, block: B:122:0x031b A[EDGE_INSN: B:122:0x031b->B:123:0x031d BREAK  A[LOOP:0: B:117:0x0301->B:304:?]] */
    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0326  */
    /* JADX WARN: Code duplicated, block: B:128:0x0343  */
    /* JADX WARN: Code duplicated, block: B:130:0x038f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0398  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x040c  */
    /* JADX WARN: Code duplicated, block: B:146:0x040d A[PHI: r12
      0x040d: PHI (r12v18 boolean) = (r12v10 boolean), (r12v9 boolean) binds: [B:145:0x040c, B:142:0x0407] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0439  */
    /* JADX WARN: Code duplicated, block: B:151:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0479  */
    /* JADX WARN: Code duplicated, block: B:156:0x049b  */
    /* JADX WARN: Code duplicated, block: B:157:0x04ae A[PHI: r25 r26 r27
      0x04ae: PHI (r25v2 y53) = (r25v0 y53), (r25v3 y53) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r26v2 z23) = (r26v0 z23), (r26v3 z23) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r27v2 qf3) = (r27v0 qf3), (r27v3 qf3) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x04de  */
    /* JADX WARN: Code duplicated, block: B:171:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:174:0x0510  */
    /* JADX WARN: Code duplicated, block: B:177:0x0520  */
    /* JADX WARN: Code duplicated, block: B:180:0x053f  */
    /* JADX WARN: Code duplicated, block: B:182:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x056a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0570  */
    /* JADX WARN: Code duplicated, block: B:192:0x058e  */
    /* JADX WARN: Code duplicated, block: B:196:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:199:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:204:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:206:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:208:0x0600  */
    /* JADX WARN: Code duplicated, block: B:209:0x060b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0615  */
    /* JADX WARN: Code duplicated, block: B:215:0x062b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0637  */
    /* JADX WARN: Code duplicated, block: B:222:0x0645  */
    /* JADX WARN: Code duplicated, block: B:225:0x0659  */
    /* JADX WARN: Code duplicated, block: B:226:0x065e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0670  */
    /* JADX WARN: Code duplicated, block: B:230:0x0690 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0706  */
    /* JADX WARN: Code duplicated, block: B:243:0x0722  */
    /* JADX WARN: Code duplicated, block: B:246:0x072e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0778  */
    /* JADX WARN: Code duplicated, block: B:257:0x0780  */
    /* JADX WARN: Code duplicated, block: B:258:0x0782  */
    /* JADX WARN: Code duplicated, block: B:260:0x078a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0797  */
    /* JADX WARN: Code duplicated, block: B:268:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:270:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:272:0x0808  */
    /* JADX WARN: Code duplicated, block: B:275:0x081e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0832  */
    /* JADX WARN: Code duplicated, block: B:296:0x02c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0198 A[Catch: NameNotFoundException -> 0x01b7, TryCatch #1 {NameNotFoundException -> 0x01b7, blocks: (B:45:0x018d, B:47:0x0198, B:49:0x01a4), top: B:290:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4 A[Catch: NameNotFoundException -> 0x01b7, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x01b7, blocks: (B:45:0x018d, B:47:0x0198, B:49:0x01a4), top: B:290:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x021f  */
    /* JADX WARN: Code duplicated, block: B:76:0x022a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0235  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:79:0x024b  */
    /* JADX WARN: Code duplicated, block: B:83:0x025f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0260 A[Catch: IllegalStateException -> 0x0282, TryCatch #2 {IllegalStateException -> 0x0282, blocks: (B:81:0x0257, B:85:0x0266, B:89:0x026e, B:91:0x0272, B:84:0x0260), top: B:292:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x026c  */
    /* JADX WARN: Code duplicated, block: B:88:0x026d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0272 A[Catch: IllegalStateException -> 0x0282, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0282, blocks: (B:81:0x0257, B:85:0x0266, B:89:0x026e, B:91:0x0272, B:84:0x0260), top: B:292:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b3  */
    /* JADX WARN: Type inference failed for: r0v55, types: [p93] */
    private final void d() {
        String string;
        String str;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int i;
        String str2;
        int iC;
        y53 y53Var;
        Bundle bundleQ;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        fa3 fa3Var;
        z23 z23Var;
        z23 z23Var2;
        z23 z23Var3;
        z23 z23Var4;
        String strK;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final w93 w93Var;
        int iJ;
        boolean zP;
        boolean z;
        hc hcVar;
        p73 p73VarL;
        l73 l73VarU;
        l73 l73VarU2;
        n73 n73Var;
        l73 l73Var;
        y53 y53Var2;
        z23 z23Var5;
        qf3 qf3Var;
        p73 p73Var;
        p73 p73Var2;
        y53 y53Var3;
        l73 l73VarU3;
        l73 l73VarU4;
        Boolean boolR;
        b43 b43Var;
        t73 t73Var;
        y53 y53Var4;
        qf3 qf3Var2;
        hc hcVar2;
        c33 c33Var;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        z23 z23Var6;
        Context context;
        boolean z2;
        Iterator it;
        String str3;
        qf3 qf3Var3;
        String strW;
        Bundle bundle;
        y53 y53Var5 = (y53) this.c;
        u73 u73Var = (u73) this.b;
        t53 t53Var = y53Var5.i;
        c33 c33Var2 = y53Var5.f;
        h43 h43Var = y53Var5.e;
        qf3 qf3Var4 = y53Var5.w;
        y53.l(t53Var);
        t53Var.D();
        is2 is2Var = y53Var5.d;
        ((y53) is2Var.a).getClass();
        qu2 qu2Var = new qu2(y53Var5);
        qu2Var.H();
        y53Var5.f0 = qu2Var;
        zzdb zzdbVar = u73Var.d;
        long j2 = zzdbVar == null ? 0L : zzdbVar.a;
        String str4 = BuildConfig.FLAVOR;
        e23 e23Var = new e23(y53Var5, u73Var.c, j2, (zzdbVar == null || (bundle = zzdbVar.d) == null) ? BuildConfig.FLAVOR : bundle.getString("runtime_google_app_id", BuildConfig.FLAVOR));
        e23Var.G();
        y53Var5.g0 = e23Var;
        m23 m23Var = new m23(y53Var5);
        m23Var.G();
        y53Var5.d0 = m23Var;
        lc3 lc3Var = new lc3(y53Var5);
        lc3Var.G();
        y53Var5.e0 = lc3Var;
        boolean z3 = qf3Var4.b;
        y53 y53Var6 = (y53) qf3Var4.a;
        if (z3) {
            uq1.q("Can't initialize twice");
            return;
        }
        qf3Var4.D();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                c33 c33Var3 = ((y53) qf3Var4.a).f;
                y53.l(c33Var3);
                c33Var3.w.a("Utils falling back to Random for random id");
            }
        }
        qf3Var4.d.set(jNextLong);
        y53Var6.p0.incrementAndGet();
        qf3Var4.b = true;
        if (h43Var.b) {
            uq1.q("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((y53) h43Var.a).a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        h43Var.c = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        h43Var.e0 = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = h43Var.c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        long jMax2 = Math.max(0L, ((Long) h13.d.a(null)).longValue());
        e20 e20Var = new e20();
        e20Var.e = h43Var;
        gu2.l("health_monitor");
        gu2.i(jMax2 > 0);
        e20Var.b = "health_monitor:start";
        e20Var.c = "health_monitor:count";
        e20Var.d = "health_monitor:value";
        e20Var.a = jMax2;
        h43Var.e = e20Var;
        ((y53) h43Var.a).p0.incrementAndGet();
        h43Var.b = true;
        e23 e23Var2 = y53Var5.g0;
        if (e23Var2.b) {
            uq1.q("Can't initialize twice");
            return;
        }
        y53 y53Var7 = (y53) e23Var2.a;
        c33 c33Var4 = y53Var7.f;
        c33 c33Var5 = y53Var7.f;
        y53.l(c33Var4);
        c33Var4.a0.c(Long.valueOf(e23Var2.W), Long.valueOf(e23Var2.w), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = y53Var7.a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    y53.l(c33Var5);
                    c33Var5.f.b(c33.M(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = BuildConfig.FLAVOR;
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    e23Var = e23Var;
                                    str2 = installerPackageName;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str;
                                    y53.l(c33Var5);
                                    c33Var5.f.c(c33.M(packageName), string, "Error retrieving package info. appId, appName");
                                    str = str5;
                                    str2 = installerPackageName;
                                    i = Integer.MIN_VALUE;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        e23Var2.c = packageName;
                        e23Var2.f = str2;
                        e23Var2.d = str;
                        e23Var2.e = i;
                        e23Var2.i = string;
                        e23Var2.v = 0L;
                        iC = y53Var7.c();
                        if (iC == 0) {
                            y53.l(c33Var5);
                            c33Var5.a0.a("App measurement collection enabled");
                        } else if (iC == 1) {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement deactivated via the manifest");
                        } else if (iC == 3) {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iC == 4) {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement disabled via the manifest");
                        } else if (iC == 6) {
                            y53.l(c33Var5);
                            c33Var5.X.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iC == 7) {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement disabled via the global data collection setting");
                        } else if (iC != 8) {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement disabled");
                            y53.l(c33Var5);
                            c33Var5.i.a("Invalid scion state in identity");
                        } else {
                            y53.l(c33Var5);
                            c33Var5.Y.a("App measurement disabled due to denied storage consent");
                        }
                        e23Var2.b0 = BuildConfig.FLAVOR;
                        strW = e23Var2.Z;
                        if (TextUtils.isEmpty(strW)) {
                            strW = ia.w(context2, y53Var7.c0);
                        }
                        if (!TextUtils.isEmpty(strW)) {
                            str4 = strW;
                        }
                        e23Var2.b0 = str4;
                        if (iC == 0) {
                            y53.l(c33Var5);
                            c33Var5.a0.c(e23Var2.c, e23Var2.b0, "App measurement enabled for app package, google app id");
                        }
                        e23Var2.X = null;
                        is2 is2Var2 = y53Var7.d;
                        y53Var = (y53) is2Var2.a;
                        gu2.l("analytics.safelisted_events");
                        bundleQ = is2Var2.Q();
                        if (bundleQ != null) {
                            if (bundleQ.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleQ.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    c33 c33Var6 = y53Var.f;
                                    y53.l(c33Var6);
                                    c33Var6.f.b(e, "Failed to load string array from metadata: resource not found");
                                }
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                e23Var2.X = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        e23Var2.X = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        qf3Var3 = y53Var7.w;
                                        y53.j(qf3Var3);
                                    }
                                } while (qf3Var3.I0("safelisted event", str3));
                            } else {
                                y53.l(c33Var5);
                                c33Var5.X.a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                e23Var2.a0 = rq0.x(context2) ? 1 : 0;
                            } else {
                                e23Var2.a0 = 0;
                            }
                            ((y53) e23Var2.a).p0.incrementAndGet();
                            e23Var2.b = true;
                            fa3Var = new fa3(y53Var5);
                            fa3Var.G();
                            y53Var5.h0 = fa3Var;
                            if (!fa3Var.b) {
                                uq1.q("Can't initialize twice");
                                return;
                            }
                            fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
                            ((y53) fa3Var.a).p0.incrementAndGet();
                            fa3Var.b = true;
                            y53.l(c33Var2);
                            z23Var = c33Var2.Z;
                            z23Var2 = c33Var2.Y;
                            z23Var3 = c33Var2.a0;
                            z23Var4 = c33Var2.f;
                            is2Var.K();
                            z23Var2.b(161000L, "App measurement initialized, version");
                            y53.l(c33Var2);
                            z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strK = e23Var.K();
                            if (qf3Var4.j0(strK, is2Var.c)) {
                                y53.l(c33Var2);
                                z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                y53.l(c33Var2);
                                z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
                            }
                            y53.l(c33Var2);
                            z23Var.a("Debug-level message logging enabled");
                            i2 = y53Var5.n0;
                            atomicInteger = y53Var5.p0;
                            if (i2 != atomicInteger.get()) {
                                y53.l(c33Var2);
                                z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            y53Var5.i0 = true;
                            j = y53Var5.q0;
                            w93Var = y53Var5.Z;
                            t53 t53Var2 = y53Var5.i;
                            y53.l(t53Var2);
                            t53Var2.D();
                            y53.i(y53Var5.h0);
                            iJ = y53Var5.h0.J();
                            hq2.a();
                            zP = is2Var.P(null, h13.P0);
                            if (iJ == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zP) {
                                qf3Var4.D();
                                if (qf3Var4.b0() == 1) {
                                    qf3Var4.D();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    sp0.z(y53Var6.a, new xh(y53Var6), intentFilter);
                                    c33 c33Var7 = y53Var6.f;
                                    y53.l(c33Var7);
                                    c33Var7.Z.a("Registered app receiver");
                                    if (z2) {
                                        y53.i(y53Var5.h0);
                                        y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    qf3Var4.D();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    sp0.z(y53Var6.a, new xh(y53Var6), intentFilter2);
                                    c33 c33Var8 = y53Var6.f;
                                    y53.l(c33Var8);
                                    c33Var8.Z.a("Registered app receiver");
                                    if (z2) {
                                        y53.i(y53Var5.h0);
                                        y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                                    }
                                }
                            } else if (z) {
                                z = true;
                                qf3Var4.D();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter3);
                                c33 c33Var9 = y53Var6.f;
                                y53.l(c33Var9);
                                c33Var9.Z.a("Registered app receiver");
                                if (z2) {
                                    y53.i(y53Var5.h0);
                                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                                }
                            }
                            hcVar = h43Var.i;
                            p73VarL = h43Var.L();
                            int i3 = p73VarL.b;
                            l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
                            l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
                            n73Var = n73.ANALYTICS_STORAGE;
                            l73Var = l73.UNINITIALIZED;
                            if (l73VarU == l73Var || l73VarU2 != l73Var) {
                                y53Var2 = y53Var5;
                                z23Var5 = z23Var4;
                                qf3Var = qf3Var4;
                                if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(n73.class);
                                    enumMap.put(n73.AD_STORAGE, l73VarU);
                                    enumMap.put(n73Var, l73VarU2);
                                    p73Var = new p73(enumMap, -10);
                                }
                                if (p73Var != null) {
                                    y53.k(w93Var);
                                    w93Var.a0(p73Var, true);
                                    p73Var2 = p73Var;
                                } else {
                                    p73Var2 = p73VarL;
                                }
                                y53.k(w93Var);
                                y53Var3 = (y53) w93Var.a;
                                w93Var.e0(p73Var2);
                                h43Var.D();
                                int i4 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
                                l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
                                if (l73VarU3 != l73Var) {
                                    y53.l(c33Var2);
                                    z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
                                }
                                l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
                                if (l73VarU4 == l73Var && p73.l(-10, i4)) {
                                    y53.k(w93Var);
                                    EnumMap enumMap2 = new EnumMap(n73.class);
                                    enumMap2.put(n73.AD_USER_DATA, l73VarU4);
                                    w93Var.Z(new pu2(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(y53Var2.q().L()) && (i4 == 0 || i4 == 30)) {
                                    y53.k(w93Var);
                                    w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolR = is2Var.R("google_analytics_tcf_data_enabled");
                                if (boolR != null || boolR.booleanValue()) {
                                    y53.l(c33Var2);
                                    z23Var.a("TCF client enabled.");
                                    y53.k(w93Var);
                                    w93Var.D();
                                    c33 c33Var10 = y53Var3.f;
                                    y53.l(c33Var10);
                                    c33Var10.Z.a("Register tcfPrefChangeListener.");
                                    if (w93Var.g0 == null) {
                                        w93Var.h0 = new x73(w93Var, y53Var3, 2);
                                        w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                w93 w93Var2 = w93Var;
                                                w93Var2.getClass();
                                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    c33 c33Var11 = ((y53) w93Var2.a).f;
                                                    y53.l(c33Var11);
                                                    c33Var11.a0.a("IABTCF_TCString change picked up in listener.");
                                                    x73 x73Var = w93Var2.h0;
                                                    gu2.o(x73Var);
                                                    x73Var.b(500L);
                                                }
                                            }
                                        };
                                    }
                                    h43 h43Var2 = y53Var3.e;
                                    y53.j(h43Var2);
                                    h43Var2.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                                    y53.k(w93Var);
                                    w93Var.K();
                                }
                                b43Var = h43Var.f;
                                if (b43Var.a() == 0) {
                                    y53.l(c33Var2);
                                    z23Var3.b(Long.valueOf(j), "Persisting first open");
                                    b43Var.b(j);
                                }
                                y53.k(w93Var);
                                t73Var = w93Var.d0;
                                if (t73Var.d() && t73Var.c()) {
                                    h43 h43Var3 = t73Var.a.e;
                                    y53.j(h43Var3);
                                    h43Var3.j0.k(null);
                                }
                                if (y53Var2.h()) {
                                    y53Var4 = y53Var2;
                                    qf3Var2 = qf3Var;
                                    if (TextUtils.isEmpty(y53Var4.q().L())) {
                                        hcVar2 = hcVar;
                                    } else {
                                        String strL = y53Var4.q().L();
                                        h43Var.D();
                                        String string2 = h43Var.I().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strL);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            hcVar2 = hcVar;
                                        } else {
                                            gu2.o(strL);
                                            if (strL.equals(string2)) {
                                                hcVar2 = hcVar;
                                            } else {
                                                y53.l(c33Var2);
                                                z23Var2.a("Rechecking which service to use due to a GMP App Id change");
                                                h43Var.D();
                                                h43Var.D();
                                                Boolean boolValueOf = h43Var.I().contains("measurement_enabled") ? Boolean.valueOf(h43Var.I().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = h43Var.I().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    h43Var.D();
                                                    SharedPreferences.Editor editorEdit3 = h43Var.I().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                y53Var4.n().I();
                                                y53Var4.e0.M();
                                                y53Var4.e0.K();
                                                b43Var.b(j);
                                                hcVar2 = hcVar;
                                                hcVar2.k(null);
                                            }
                                        }
                                        String strL2 = y53Var4.q().L();
                                        h43Var.D();
                                        SharedPreferences.Editor editorEdit4 = h43Var.I().edit();
                                        editorEdit4.putString("gmp_app_id", strL2);
                                        editorEdit4.apply();
                                    }
                                    if (!h43Var.L().i(n73Var)) {
                                        hcVar2.k(null);
                                    }
                                    y53.k(w93Var);
                                    w93Var.i.set(hcVar2.j());
                                    try {
                                        y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        hc hcVar3 = h43Var.i0;
                                        if (!TextUtils.isEmpty(hcVar3.j())) {
                                            y53.l(c33Var2);
                                            c33Var = c33Var2;
                                            c33Var.w.a("Remote config removed with active feature rollouts");
                                            hcVar3.k(null);
                                        }
                                        if (!TextUtils.isEmpty(y53Var4.q().L())) {
                                            zA = y53Var4.a();
                                            sharedPreferences = h43Var.c;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                h43Var.M(!zA);
                                            }
                                            if (zA) {
                                                y53.k(w93Var);
                                                w93Var.Q();
                                            }
                                            td3 td3Var = y53Var4.v;
                                            y53.k(td3Var);
                                            td3Var.e.y();
                                            y53Var4.o().I(new AtomicReference());
                                            y53Var4.o().J(h43Var.l0.k());
                                        }
                                        hq2.a();
                                        if (is2Var.P(null, h13.P0)) {
                                            qf3Var2.D();
                                            if (qf3Var2.b0() == 1) {
                                                long jIntValue = ((Integer) h13.w0.a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                y53Var4.X.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    y53.l(c33Var);
                                                    z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                y53.k(w93Var);
                                                w93Var.D();
                                                if (w93Var.Y == null) {
                                                    w93Var.Y = new x73(w93Var, y53Var3, 0);
                                                }
                                                w93Var.Y.b(jMax);
                                            }
                                        }
                                        h43Var.b0.b(true);
                                    }
                                    c33Var = c33Var2;
                                    if (!TextUtils.isEmpty(y53Var4.q().L())) {
                                        zA = y53Var4.a();
                                        sharedPreferences = h43Var.c;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !is2Var.S()) {
                                            h43Var.M(!zA);
                                        }
                                        if (zA) {
                                            y53.k(w93Var);
                                            w93Var.Q();
                                        }
                                        td3 td3Var2 = y53Var4.v;
                                        y53.k(td3Var2);
                                        td3Var2.e.y();
                                        y53Var4.o().I(new AtomicReference());
                                        y53Var4.o().J(h43Var.l0.k());
                                    }
                                } else {
                                    if (y53Var2.a()) {
                                        qf3Var2 = qf3Var;
                                        if (qf3Var2.h0("android.permission.INTERNET")) {
                                            z23Var6 = z23Var5;
                                        } else {
                                            y53.l(c33Var2);
                                            z23Var6 = z23Var5;
                                            z23Var6.a("App is missing INTERNET permission");
                                        }
                                        if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                                            y53.l(c33Var2);
                                            z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        y53Var4 = y53Var2;
                                        context = y53Var4.a;
                                        if (!la2.a(context).c() && !is2Var.H()) {
                                            if (!qf3.z0(context)) {
                                                y53.l(c33Var2);
                                                z23Var6.a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!qf3.Z(context)) {
                                                y53.l(c33Var2);
                                                z23Var6.a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        y53.l(c33Var2);
                                        z23Var6.a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        y53Var4 = y53Var2;
                                        qf3Var2 = qf3Var;
                                    }
                                    c33Var = c33Var2;
                                }
                                hq2.a();
                                if (is2Var.P(null, h13.P0)) {
                                    qf3Var2.D();
                                    if (qf3Var2.b0() == 1) {
                                        long jIntValue2 = ((Integer) h13.w0.a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        y53Var4.X.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            y53.l(c33Var);
                                            z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        y53.k(w93Var);
                                        w93Var.D();
                                        if (w93Var.Y == null) {
                                            w93Var.Y = new x73(w93Var, y53Var3, 0);
                                        }
                                        w93Var.Y.b(jMax);
                                    }
                                }
                                h43Var.b0.b(true);
                            }
                            y53Var2 = y53Var5;
                            z23Var5 = z23Var4;
                            qf3Var = qf3Var4;
                            if (!TextUtils.isEmpty(y53Var2.q().L()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                                y53.k(w93Var);
                                w93Var.a0(new p73(-10), false);
                            }
                            p73Var = null;
                            if (p73Var != null) {
                                y53.k(w93Var);
                                w93Var.a0(p73Var, true);
                                p73Var2 = p73Var;
                            } else {
                                p73Var2 = p73VarL;
                            }
                            y53.k(w93Var);
                            y53Var3 = (y53) w93Var.a;
                            w93Var.e0(p73Var2);
                            h43Var.D();
                            int i5 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
                            l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
                            if (l73VarU3 != l73Var) {
                                y53.l(c33Var2);
                                z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
                            }
                            l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
                            if (l73VarU4 == l73Var) {
                                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                    y53.k(w93Var);
                                    w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                y53.k(w93Var);
                                w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolR = is2Var.R("google_analytics_tcf_data_enabled");
                            if (boolR != null) {
                                y53.l(c33Var2);
                                z23Var.a("TCF client enabled.");
                                y53.k(w93Var);
                                w93Var.D();
                                c33 c33Var11 = y53Var3.f;
                                y53.l(c33Var11);
                                c33Var11.Z.a("Register tcfPrefChangeListener.");
                                if (w93Var.g0 == null) {
                                    w93Var.h0 = new x73(w93Var, y53Var3, 2);
                                    w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            w93 w93Var2 = w93Var;
                                            w93Var2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                c33 c33Var12 = ((y53) w93Var2.a).f;
                                                y53.l(c33Var12);
                                                c33Var12.a0.a("IABTCF_TCString change picked up in listener.");
                                                x73 x73Var = w93Var2.h0;
                                                gu2.o(x73Var);
                                                x73Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                h43 h43Var4 = y53Var3.e;
                                y53.j(h43Var4);
                                h43Var4.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                                y53.k(w93Var);
                                w93Var.K();
                            } else {
                                y53.l(c33Var2);
                                z23Var.a("TCF client enabled.");
                                y53.k(w93Var);
                                w93Var.D();
                                c33 c33Var12 = y53Var3.f;
                                y53.l(c33Var12);
                                c33Var12.Z.a("Register tcfPrefChangeListener.");
                                if (w93Var.g0 == null) {
                                    w93Var.h0 = new x73(w93Var, y53Var3, 2);
                                    w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            w93 w93Var2 = w93Var;
                                            w93Var2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                c33 c33Var13 = ((y53) w93Var2.a).f;
                                                y53.l(c33Var13);
                                                c33Var13.a0.a("IABTCF_TCString change picked up in listener.");
                                                x73 x73Var = w93Var2.h0;
                                                gu2.o(x73Var);
                                                x73Var.b(500L);
                                            }
                                        }
                                    };
                                }
                                h43 h43Var5 = y53Var3.e;
                                y53.j(h43Var5);
                                h43Var5.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                                y53.k(w93Var);
                                w93Var.K();
                            }
                            b43Var = h43Var.f;
                            if (b43Var.a() == 0) {
                                y53.l(c33Var2);
                                z23Var3.b(Long.valueOf(j), "Persisting first open");
                                b43Var.b(j);
                            }
                            y53.k(w93Var);
                            t73Var = w93Var.d0;
                            if (t73Var.d()) {
                                h43 h43Var6 = t73Var.a.e;
                                y53.j(h43Var6);
                                h43Var6.j0.k(null);
                            }
                            if (y53Var2.h()) {
                                if (y53Var2.a()) {
                                    qf3Var2 = qf3Var;
                                    if (qf3Var2.h0("android.permission.INTERNET")) {
                                        y53.l(c33Var2);
                                        z23Var6 = z23Var5;
                                        z23Var6.a("App is missing INTERNET permission");
                                    } else {
                                        z23Var6 = z23Var5;
                                    }
                                    if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                                        y53.l(c33Var2);
                                        z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    y53Var4 = y53Var2;
                                    context = y53Var4.a;
                                    if (!la2.a(context).c()) {
                                        if (!qf3.z0(context)) {
                                            y53.l(c33Var2);
                                            z23Var6.a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!qf3.Z(context)) {
                                            y53.l(c33Var2);
                                            z23Var6.a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    y53.l(c33Var2);
                                    z23Var6.a("Uploading is not possible. App measurement disabled");
                                } else {
                                    y53Var4 = y53Var2;
                                    qf3Var2 = qf3Var;
                                }
                                c33Var = c33Var2;
                            } else {
                                y53Var4 = y53Var2;
                                qf3Var2 = qf3Var;
                                if (TextUtils.isEmpty(y53Var4.q().L())) {
                                    String strL3 = y53Var4.q().L();
                                    h43Var.D();
                                    String string3 = h43Var.I().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strL3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                    if (zIsEmpty) {
                                        hcVar2 = hcVar;
                                    } else {
                                        hcVar2 = hcVar;
                                    }
                                    String strL4 = y53Var4.q().L();
                                    h43Var.D();
                                    SharedPreferences.Editor editorEdit5 = h43Var.I().edit();
                                    editorEdit5.putString("gmp_app_id", strL4);
                                    editorEdit5.apply();
                                } else {
                                    hcVar2 = hcVar;
                                }
                                if (!h43Var.L().i(n73Var)) {
                                    hcVar2.k(null);
                                }
                                y53.k(w93Var);
                                w93Var.i.set(hcVar2.j());
                                y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                c33Var = c33Var2;
                                if (!TextUtils.isEmpty(y53Var4.q().L())) {
                                    zA = y53Var4.a();
                                    sharedPreferences = h43Var.c;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        h43Var.M(!zA);
                                    }
                                    if (zA) {
                                        y53.k(w93Var);
                                        w93Var.Q();
                                    }
                                    td3 td3Var3 = y53Var4.v;
                                    y53.k(td3Var3);
                                    td3Var3.e.y();
                                    y53Var4.o().I(new AtomicReference());
                                    y53Var4.o().J(h43Var.l0.k());
                                }
                            }
                            hq2.a();
                            if (is2Var.P(null, h13.P0)) {
                                qf3Var2.D();
                                if (qf3Var2.b0() == 1) {
                                    long jIntValue3 = ((Integer) h13.w0.a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    y53Var4.X.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        y53.l(c33Var);
                                        z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    y53.k(w93Var);
                                    w93Var.D();
                                    if (w93Var.Y == null) {
                                        w93Var.Y = new x73(w93Var, y53Var3, 0);
                                    }
                                    w93Var.Y.b(jMax);
                                }
                            }
                            h43Var.b0.b(true);
                        }
                        c33 c33Var13 = y53Var.f;
                        y53.l(c33Var13);
                        c33Var13.f.a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            e23Var2.X = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    e23Var2.X = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    qf3Var3 = y53Var7.w;
                                    y53.j(qf3Var3);
                                }
                            } while (qf3Var3.I0("safelisted event", str3));
                        } else {
                            y53.l(c33Var5);
                            c33Var5.X.a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            e23Var2.a0 = rq0.x(context2) ? 1 : 0;
                        } else {
                            e23Var2.a0 = 0;
                        }
                        ((y53) e23Var2.a).p0.incrementAndGet();
                        e23Var2.b = true;
                        fa3Var = new fa3(y53Var5);
                        fa3Var.G();
                        y53Var5.h0 = fa3Var;
                        if (!fa3Var.b) {
                            uq1.q("Can't initialize twice");
                            return;
                        }
                        fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
                        ((y53) fa3Var.a).p0.incrementAndGet();
                        fa3Var.b = true;
                        y53.l(c33Var2);
                        z23Var = c33Var2.Z;
                        z23Var2 = c33Var2.Y;
                        z23Var3 = c33Var2.a0;
                        z23Var4 = c33Var2.f;
                        is2Var.K();
                        z23Var2.b(161000L, "App measurement initialized, version");
                        y53.l(c33Var2);
                        z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strK = e23Var.K();
                        if (qf3Var4.j0(strK, is2Var.c)) {
                            y53.l(c33Var2);
                            z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            y53.l(c33Var2);
                            z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
                        }
                        y53.l(c33Var2);
                        z23Var.a("Debug-level message logging enabled");
                        i2 = y53Var5.n0;
                        atomicInteger = y53Var5.p0;
                        if (i2 != atomicInteger.get()) {
                            y53.l(c33Var2);
                            z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        y53Var5.i0 = true;
                        j = y53Var5.q0;
                        w93Var = y53Var5.Z;
                        t53 t53Var3 = y53Var5.i;
                        y53.l(t53Var3);
                        t53Var3.D();
                        y53.i(y53Var5.h0);
                        iJ = y53Var5.h0.J();
                        hq2.a();
                        zP = is2Var.P(null, h13.P0);
                        if (iJ == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zP) {
                            qf3Var4.D();
                            if (qf3Var4.b0() == 1) {
                                qf3Var4.D();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter4);
                                c33 c33Var14 = y53Var6.f;
                                y53.l(c33Var14);
                                c33Var14.Z.a("Registered app receiver");
                                if (z2) {
                                    y53.i(y53Var5.h0);
                                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                qf3Var4.D();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter5);
                                c33 c33Var15 = y53Var6.f;
                                y53.l(c33Var15);
                                c33Var15.Z.a("Registered app receiver");
                                if (z2) {
                                    y53.i(y53Var5.h0);
                                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                                }
                            }
                        } else if (z) {
                            z = true;
                            qf3Var4.D();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            sp0.z(y53Var6.a, new xh(y53Var6), intentFilter6);
                            c33 c33Var16 = y53Var6.f;
                            y53.l(c33Var16);
                            c33Var16.Z.a("Registered app receiver");
                            if (z2) {
                                y53.i(y53Var5.h0);
                                y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                            }
                        }
                        hcVar = h43Var.i;
                        p73VarL = h43Var.L();
                        int i6 = p73VarL.b;
                        l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
                        l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
                        n73Var = n73.ANALYTICS_STORAGE;
                        l73Var = l73.UNINITIALIZED;
                        if (l73VarU == l73Var) {
                            y53Var2 = y53Var5;
                            z23Var5 = z23Var4;
                            qf3Var = qf3Var4;
                            if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(n73.class);
                                enumMap3.put(n73.AD_STORAGE, l73VarU);
                                enumMap3.put(n73Var, l73VarU2);
                                p73Var = new p73(enumMap3, -10);
                            } else {
                                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                    y53.k(w93Var);
                                    w93Var.a0(new p73(-10), false);
                                }
                                p73Var = null;
                            }
                        } else {
                            y53Var2 = y53Var5;
                            z23Var5 = z23Var4;
                            qf3Var = qf3Var4;
                            if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(n73.class);
                                enumMap4.put(n73.AD_STORAGE, l73VarU);
                                enumMap4.put(n73Var, l73VarU2);
                                p73Var = new p73(enumMap4, -10);
                            } else {
                                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                    y53.k(w93Var);
                                    w93Var.a0(new p73(-10), false);
                                }
                                p73Var = null;
                            }
                        }
                        if (p73Var != null) {
                            y53.k(w93Var);
                            w93Var.a0(p73Var, true);
                            p73Var2 = p73Var;
                        } else {
                            p73Var2 = p73VarL;
                        }
                        y53.k(w93Var);
                        y53Var3 = (y53) w93Var.a;
                        w93Var.e0(p73Var2);
                        h43Var.D();
                        int i7 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
                        l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
                        if (l73VarU3 != l73Var) {
                            y53.l(c33Var2);
                            z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
                        }
                        l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
                        if (l73VarU4 == l73Var) {
                            if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                y53.k(w93Var);
                                w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
                            y53.k(w93Var);
                            w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolR = is2Var.R("google_analytics_tcf_data_enabled");
                        if (boolR != null) {
                            y53.l(c33Var2);
                            z23Var.a("TCF client enabled.");
                            y53.k(w93Var);
                            w93Var.D();
                            c33 c33Var17 = y53Var3.f;
                            y53.l(c33Var17);
                            c33Var17.Z.a("Register tcfPrefChangeListener.");
                            if (w93Var.g0 == null) {
                                w93Var.h0 = new x73(w93Var, y53Var3, 2);
                                w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        w93 w93Var2 = w93Var;
                                        w93Var2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            c33 c33Var18 = ((y53) w93Var2.a).f;
                                            y53.l(c33Var18);
                                            c33Var18.a0.a("IABTCF_TCString change picked up in listener.");
                                            x73 x73Var = w93Var2.h0;
                                            gu2.o(x73Var);
                                            x73Var.b(500L);
                                        }
                                    }
                                };
                            }
                            h43 h43Var7 = y53Var3.e;
                            y53.j(h43Var7);
                            h43Var7.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                            y53.k(w93Var);
                            w93Var.K();
                        } else {
                            y53.l(c33Var2);
                            z23Var.a("TCF client enabled.");
                            y53.k(w93Var);
                            w93Var.D();
                            c33 c33Var18 = y53Var3.f;
                            y53.l(c33Var18);
                            c33Var18.Z.a("Register tcfPrefChangeListener.");
                            if (w93Var.g0 == null) {
                                w93Var.h0 = new x73(w93Var, y53Var3, 2);
                                w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        w93 w93Var2 = w93Var;
                                        w93Var2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            c33 c33Var19 = ((y53) w93Var2.a).f;
                                            y53.l(c33Var19);
                                            c33Var19.a0.a("IABTCF_TCString change picked up in listener.");
                                            x73 x73Var = w93Var2.h0;
                                            gu2.o(x73Var);
                                            x73Var.b(500L);
                                        }
                                    }
                                };
                            }
                            h43 h43Var8 = y53Var3.e;
                            y53.j(h43Var8);
                            h43Var8.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                            y53.k(w93Var);
                            w93Var.K();
                        }
                        b43Var = h43Var.f;
                        if (b43Var.a() == 0) {
                            y53.l(c33Var2);
                            z23Var3.b(Long.valueOf(j), "Persisting first open");
                            b43Var.b(j);
                        }
                        y53.k(w93Var);
                        t73Var = w93Var.d0;
                        if (t73Var.d()) {
                            h43 h43Var9 = t73Var.a.e;
                            y53.j(h43Var9);
                            h43Var9.j0.k(null);
                        }
                        if (y53Var2.h()) {
                            if (y53Var2.a()) {
                                qf3Var2 = qf3Var;
                                if (qf3Var2.h0("android.permission.INTERNET")) {
                                    y53.l(c33Var2);
                                    z23Var6 = z23Var5;
                                    z23Var6.a("App is missing INTERNET permission");
                                } else {
                                    z23Var6 = z23Var5;
                                }
                                if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                                    y53.l(c33Var2);
                                    z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                y53Var4 = y53Var2;
                                context = y53Var4.a;
                                if (!la2.a(context).c()) {
                                    if (!qf3.z0(context)) {
                                        y53.l(c33Var2);
                                        z23Var6.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!qf3.Z(context)) {
                                        y53.l(c33Var2);
                                        z23Var6.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                y53.l(c33Var2);
                                z23Var6.a("Uploading is not possible. App measurement disabled");
                            } else {
                                y53Var4 = y53Var2;
                                qf3Var2 = qf3Var;
                            }
                            c33Var = c33Var2;
                        } else {
                            y53Var4 = y53Var2;
                            qf3Var2 = qf3Var;
                            if (TextUtils.isEmpty(y53Var4.q().L())) {
                                String strL5 = y53Var4.q().L();
                                h43Var.D();
                                String string4 = h43Var.I().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strL5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                if (zIsEmpty) {
                                    hcVar2 = hcVar;
                                } else {
                                    hcVar2 = hcVar;
                                }
                                String strL6 = y53Var4.q().L();
                                h43Var.D();
                                SharedPreferences.Editor editorEdit6 = h43Var.I().edit();
                                editorEdit6.putString("gmp_app_id", strL6);
                                editorEdit6.apply();
                            } else {
                                hcVar2 = hcVar;
                            }
                            if (!h43Var.L().i(n73Var)) {
                                hcVar2.k(null);
                            }
                            y53.k(w93Var);
                            w93Var.i.set(hcVar2.j());
                            y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            c33Var = c33Var2;
                            if (!TextUtils.isEmpty(y53Var4.q().L())) {
                                zA = y53Var4.a();
                                sharedPreferences = h43Var.c;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    h43Var.M(!zA);
                                }
                                if (zA) {
                                    y53.k(w93Var);
                                    w93Var.Q();
                                }
                                td3 td3Var4 = y53Var4.v;
                                y53.k(td3Var4);
                                td3Var4.e.y();
                                y53Var4.o().I(new AtomicReference());
                                y53Var4.o().J(h43Var.l0.k());
                            }
                        }
                        hq2.a();
                        if (is2Var.P(null, h13.P0)) {
                            qf3Var2.D();
                            if (qf3Var2.b0() == 1) {
                                long jIntValue4 = ((Integer) h13.w0.a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                y53Var4.X.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    y53.l(c33Var);
                                    z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                y53.k(w93Var);
                                w93Var.D();
                                if (w93Var.Y == null) {
                                    w93Var.Y = new x73(w93Var, y53Var3, 0);
                                }
                                w93Var.Y.b(jMax);
                            }
                        }
                        h43Var.b0.b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str = packageInfo.versionName;
                        i = packageInfo.versionCode;
                        e23Var = e23Var;
                        str2 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                e23Var2.c = packageName;
                e23Var2.f = str2;
                e23Var2.d = str;
                e23Var2.e = i;
                e23Var2.i = string;
                e23Var2.v = 0L;
                iC = y53Var7.c();
                if (iC == 0) {
                    y53.l(c33Var5);
                    c33Var5.a0.a("App measurement collection enabled");
                } else if (iC == 1) {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement deactivated via the manifest");
                } else if (iC == 3) {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iC == 4) {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement disabled via the manifest");
                } else if (iC == 6) {
                    y53.l(c33Var5);
                    c33Var5.X.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iC == 7) {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement disabled via the global data collection setting");
                } else if (iC != 8) {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement disabled");
                    y53.l(c33Var5);
                    c33Var5.i.a("Invalid scion state in identity");
                } else {
                    y53.l(c33Var5);
                    c33Var5.Y.a("App measurement disabled due to denied storage consent");
                }
                e23Var2.b0 = BuildConfig.FLAVOR;
                strW = e23Var2.Z;
                if (TextUtils.isEmpty(strW)) {
                    strW = ia.w(context2, y53Var7.c0);
                }
                if (!TextUtils.isEmpty(strW)) {
                    str4 = strW;
                }
                e23Var2.b0 = str4;
                if (iC == 0) {
                    y53.l(c33Var5);
                    c33Var5.a0.c(e23Var2.c, e23Var2.b0, "App measurement enabled for app package, google app id");
                }
                e23Var2.X = null;
                is2 is2Var3 = y53Var7.d;
                y53Var = (y53) is2Var3.a;
                gu2.l("analytics.safelisted_events");
                bundleQ = is2Var3.Q();
                if (bundleQ != null) {
                    if (bundleQ.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleQ.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = null;
                        } else {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        e23Var2.X = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                e23Var2.X = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                qf3Var3 = y53Var7.w;
                                y53.j(qf3Var3);
                            }
                        } while (qf3Var3.I0("safelisted event", str3));
                    } else {
                        y53.l(c33Var5);
                        c33Var5.X.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        e23Var2.a0 = rq0.x(context2) ? 1 : 0;
                    } else {
                        e23Var2.a0 = 0;
                    }
                    ((y53) e23Var2.a).p0.incrementAndGet();
                    e23Var2.b = true;
                    fa3Var = new fa3(y53Var5);
                    fa3Var.G();
                    y53Var5.h0 = fa3Var;
                    if (!fa3Var.b) {
                        uq1.q("Can't initialize twice");
                        return;
                    }
                    fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
                    ((y53) fa3Var.a).p0.incrementAndGet();
                    fa3Var.b = true;
                    y53.l(c33Var2);
                    z23Var = c33Var2.Z;
                    z23Var2 = c33Var2.Y;
                    z23Var3 = c33Var2.a0;
                    z23Var4 = c33Var2.f;
                    is2Var.K();
                    z23Var2.b(161000L, "App measurement initialized, version");
                    y53.l(c33Var2);
                    z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strK = e23Var.K();
                    if (qf3Var4.j0(strK, is2Var.c)) {
                        y53.l(c33Var2);
                        z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        y53.l(c33Var2);
                        z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
                    }
                    y53.l(c33Var2);
                    z23Var.a("Debug-level message logging enabled");
                    i2 = y53Var5.n0;
                    atomicInteger = y53Var5.p0;
                    if (i2 != atomicInteger.get()) {
                        y53.l(c33Var2);
                        z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    y53Var5.i0 = true;
                    j = y53Var5.q0;
                    w93Var = y53Var5.Z;
                    t53 t53Var4 = y53Var5.i;
                    y53.l(t53Var4);
                    t53Var4.D();
                    y53.i(y53Var5.h0);
                    iJ = y53Var5.h0.J();
                    hq2.a();
                    zP = is2Var.P(null, h13.P0);
                    if (iJ == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zP) {
                        qf3Var4.D();
                        if (qf3Var4.b0() == 1) {
                            qf3Var4.D();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            sp0.z(y53Var6.a, new xh(y53Var6), intentFilter7);
                            c33 c33Var19 = y53Var6.f;
                            y53.l(c33Var19);
                            c33Var19.Z.a("Registered app receiver");
                            if (z2) {
                                y53.i(y53Var5.h0);
                                y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            qf3Var4.D();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            sp0.z(y53Var6.a, new xh(y53Var6), intentFilter8);
                            c33 c33Var110 = y53Var6.f;
                            y53.l(c33Var110);
                            c33Var110.Z.a("Registered app receiver");
                            if (z2) {
                                y53.i(y53Var5.h0);
                                y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                            }
                        }
                    } else if (z) {
                        z = true;
                        qf3Var4.D();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        sp0.z(y53Var6.a, new xh(y53Var6), intentFilter9);
                        c33 c33Var111 = y53Var6.f;
                        y53.l(c33Var111);
                        c33Var111.Z.a("Registered app receiver");
                        if (z2) {
                            y53.i(y53Var5.h0);
                            y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                        }
                    }
                    hcVar = h43Var.i;
                    p73VarL = h43Var.L();
                    int i8 = p73VarL.b;
                    l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
                    l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
                    n73Var = n73.ANALYTICS_STORAGE;
                    l73Var = l73.UNINITIALIZED;
                    if (l73VarU == l73Var) {
                        y53Var2 = y53Var5;
                        z23Var5 = z23Var4;
                        qf3Var = qf3Var4;
                        if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(n73.class);
                            enumMap5.put(n73.AD_STORAGE, l73VarU);
                            enumMap5.put(n73Var, l73VarU2);
                            p73Var = new p73(enumMap5, -10);
                        } else {
                            if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                y53.k(w93Var);
                                w93Var.a0(new p73(-10), false);
                            }
                            p73Var = null;
                        }
                    } else {
                        y53Var2 = y53Var5;
                        z23Var5 = z23Var4;
                        qf3Var = qf3Var4;
                        if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(n73.class);
                            enumMap6.put(n73.AD_STORAGE, l73VarU);
                            enumMap6.put(n73Var, l73VarU2);
                            p73Var = new p73(enumMap6, -10);
                        } else {
                            if (!TextUtils.isEmpty(y53Var2.q().L())) {
                                y53.k(w93Var);
                                w93Var.a0(new p73(-10), false);
                            }
                            p73Var = null;
                        }
                    }
                    if (p73Var != null) {
                        y53.k(w93Var);
                        w93Var.a0(p73Var, true);
                        p73Var2 = p73Var;
                    } else {
                        p73Var2 = p73VarL;
                    }
                    y53.k(w93Var);
                    y53Var3 = (y53) w93Var.a;
                    w93Var.e0(p73Var2);
                    h43Var.D();
                    int i9 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
                    l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
                    if (l73VarU3 != l73Var) {
                        y53.l(c33Var2);
                        z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
                    }
                    l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
                    if (l73VarU4 == l73Var) {
                        if (!TextUtils.isEmpty(y53Var2.q().L())) {
                            y53.k(w93Var);
                            w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
                        y53.k(w93Var);
                        w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolR = is2Var.R("google_analytics_tcf_data_enabled");
                    if (boolR != null) {
                        y53.l(c33Var2);
                        z23Var.a("TCF client enabled.");
                        y53.k(w93Var);
                        w93Var.D();
                        c33 c33Var112 = y53Var3.f;
                        y53.l(c33Var112);
                        c33Var112.Z.a("Register tcfPrefChangeListener.");
                        if (w93Var.g0 == null) {
                            w93Var.h0 = new x73(w93Var, y53Var3, 2);
                            w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    w93 w93Var2 = w93Var;
                                    w93Var2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        c33 c33Var113 = ((y53) w93Var2.a).f;
                                        y53.l(c33Var113);
                                        c33Var113.a0.a("IABTCF_TCString change picked up in listener.");
                                        x73 x73Var = w93Var2.h0;
                                        gu2.o(x73Var);
                                        x73Var.b(500L);
                                    }
                                }
                            };
                        }
                        h43 h43Var10 = y53Var3.e;
                        y53.j(h43Var10);
                        h43Var10.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                        y53.k(w93Var);
                        w93Var.K();
                    } else {
                        y53.l(c33Var2);
                        z23Var.a("TCF client enabled.");
                        y53.k(w93Var);
                        w93Var.D();
                        c33 c33Var113 = y53Var3.f;
                        y53.l(c33Var113);
                        c33Var113.Z.a("Register tcfPrefChangeListener.");
                        if (w93Var.g0 == null) {
                            w93Var.h0 = new x73(w93Var, y53Var3, 2);
                            w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    w93 w93Var2 = w93Var;
                                    w93Var2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        c33 c33Var114 = ((y53) w93Var2.a).f;
                                        y53.l(c33Var114);
                                        c33Var114.a0.a("IABTCF_TCString change picked up in listener.");
                                        x73 x73Var = w93Var2.h0;
                                        gu2.o(x73Var);
                                        x73Var.b(500L);
                                    }
                                }
                            };
                        }
                        h43 h43Var11 = y53Var3.e;
                        y53.j(h43Var11);
                        h43Var11.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                        y53.k(w93Var);
                        w93Var.K();
                    }
                    b43Var = h43Var.f;
                    if (b43Var.a() == 0) {
                        y53.l(c33Var2);
                        z23Var3.b(Long.valueOf(j), "Persisting first open");
                        b43Var.b(j);
                    }
                    y53.k(w93Var);
                    t73Var = w93Var.d0;
                    if (t73Var.d()) {
                        h43 h43Var12 = t73Var.a.e;
                        y53.j(h43Var12);
                        h43Var12.j0.k(null);
                    }
                    if (y53Var2.h()) {
                        if (y53Var2.a()) {
                            qf3Var2 = qf3Var;
                            if (qf3Var2.h0("android.permission.INTERNET")) {
                                y53.l(c33Var2);
                                z23Var6 = z23Var5;
                                z23Var6.a("App is missing INTERNET permission");
                            } else {
                                z23Var6 = z23Var5;
                            }
                            if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                                y53.l(c33Var2);
                                z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            y53Var4 = y53Var2;
                            context = y53Var4.a;
                            if (!la2.a(context).c()) {
                                if (!qf3.z0(context)) {
                                    y53.l(c33Var2);
                                    z23Var6.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!qf3.Z(context)) {
                                    y53.l(c33Var2);
                                    z23Var6.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            y53.l(c33Var2);
                            z23Var6.a("Uploading is not possible. App measurement disabled");
                        } else {
                            y53Var4 = y53Var2;
                            qf3Var2 = qf3Var;
                        }
                        c33Var = c33Var2;
                    } else {
                        y53Var4 = y53Var2;
                        qf3Var2 = qf3Var;
                        if (TextUtils.isEmpty(y53Var4.q().L())) {
                            String strL7 = y53Var4.q().L();
                            h43Var.D();
                            String string5 = h43Var.I().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strL7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                            if (zIsEmpty) {
                                hcVar2 = hcVar;
                            } else {
                                hcVar2 = hcVar;
                            }
                            String strL8 = y53Var4.q().L();
                            h43Var.D();
                            SharedPreferences.Editor editorEdit7 = h43Var.I().edit();
                            editorEdit7.putString("gmp_app_id", strL8);
                            editorEdit7.apply();
                        } else {
                            hcVar2 = hcVar;
                        }
                        if (!h43Var.L().i(n73Var)) {
                            hcVar2.k(null);
                        }
                        y53.k(w93Var);
                        w93Var.i.set(hcVar2.j());
                        y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        c33Var = c33Var2;
                        if (!TextUtils.isEmpty(y53Var4.q().L())) {
                            zA = y53Var4.a();
                            sharedPreferences = h43Var.c;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                h43Var.M(!zA);
                            }
                            if (zA) {
                                y53.k(w93Var);
                                w93Var.Q();
                            }
                            td3 td3Var5 = y53Var4.v;
                            y53.k(td3Var5);
                            td3Var5.e.y();
                            y53Var4.o().I(new AtomicReference());
                            y53Var4.o().J(h43Var.l0.k());
                        }
                    }
                    hq2.a();
                    if (is2Var.P(null, h13.P0)) {
                        qf3Var2.D();
                        if (qf3Var2.b0() == 1) {
                            long jIntValue5 = ((Integer) h13.w0.a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            y53Var4.X.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                y53.l(c33Var);
                                z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            y53.k(w93Var);
                            w93Var.D();
                            if (w93Var.Y == null) {
                                w93Var.Y = new x73(w93Var, y53Var3, 0);
                            }
                            w93Var.Y.b(jMax);
                        }
                    }
                    h43Var.b0.b(true);
                }
                c33 c33Var114 = y53Var.f;
                y53.l(c33Var114);
                c33Var114.f.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    e23Var2.X = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            e23Var2.X = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            qf3Var3 = y53Var7.w;
                            y53.j(qf3Var3);
                        }
                    } while (qf3Var3.I0("safelisted event", str3));
                } else {
                    y53.l(c33Var5);
                    c33Var5.X.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    e23Var2.a0 = rq0.x(context2) ? 1 : 0;
                } else {
                    e23Var2.a0 = 0;
                }
                ((y53) e23Var2.a).p0.incrementAndGet();
                e23Var2.b = true;
                fa3Var = new fa3(y53Var5);
                fa3Var.G();
                y53Var5.h0 = fa3Var;
                if (!fa3Var.b) {
                    uq1.q("Can't initialize twice");
                    return;
                }
                fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
                ((y53) fa3Var.a).p0.incrementAndGet();
                fa3Var.b = true;
                y53.l(c33Var2);
                z23Var = c33Var2.Z;
                z23Var2 = c33Var2.Y;
                z23Var3 = c33Var2.a0;
                z23Var4 = c33Var2.f;
                is2Var.K();
                z23Var2.b(161000L, "App measurement initialized, version");
                y53.l(c33Var2);
                z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strK = e23Var.K();
                if (qf3Var4.j0(strK, is2Var.c)) {
                    y53.l(c33Var2);
                    z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    y53.l(c33Var2);
                    z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
                }
                y53.l(c33Var2);
                z23Var.a("Debug-level message logging enabled");
                i2 = y53Var5.n0;
                atomicInteger = y53Var5.p0;
                if (i2 != atomicInteger.get()) {
                    y53.l(c33Var2);
                    z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                y53Var5.i0 = true;
                j = y53Var5.q0;
                w93Var = y53Var5.Z;
                t53 t53Var5 = y53Var5.i;
                y53.l(t53Var5);
                t53Var5.D();
                y53.i(y53Var5.h0);
                iJ = y53Var5.h0.J();
                hq2.a();
                zP = is2Var.P(null, h13.P0);
                if (iJ == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zP) {
                    qf3Var4.D();
                    if (qf3Var4.b0() == 1) {
                        qf3Var4.D();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        sp0.z(y53Var6.a, new xh(y53Var6), intentFilter10);
                        c33 c33Var115 = y53Var6.f;
                        y53.l(c33Var115);
                        c33Var115.Z.a("Registered app receiver");
                        if (z2) {
                            y53.i(y53Var5.h0);
                            y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        qf3Var4.D();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        sp0.z(y53Var6.a, new xh(y53Var6), intentFilter11);
                        c33 c33Var116 = y53Var6.f;
                        y53.l(c33Var116);
                        c33Var116.Z.a("Registered app receiver");
                        if (z2) {
                            y53.i(y53Var5.h0);
                            y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                        }
                    }
                } else if (z) {
                    z = true;
                    qf3Var4.D();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    sp0.z(y53Var6.a, new xh(y53Var6), intentFilter12);
                    c33 c33Var117 = y53Var6.f;
                    y53.l(c33Var117);
                    c33Var117.Z.a("Registered app receiver");
                    if (z2) {
                        y53.i(y53Var5.h0);
                        y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                    }
                }
                hcVar = h43Var.i;
                p73VarL = h43Var.L();
                int i10 = p73VarL.b;
                l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
                l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
                n73Var = n73.ANALYTICS_STORAGE;
                l73Var = l73.UNINITIALIZED;
                if (l73VarU == l73Var) {
                    y53Var2 = y53Var5;
                    z23Var5 = z23Var4;
                    qf3Var = qf3Var4;
                    if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(n73.class);
                        enumMap7.put(n73.AD_STORAGE, l73VarU);
                        enumMap7.put(n73Var, l73VarU2);
                        p73Var = new p73(enumMap7, -10);
                    } else {
                        if (!TextUtils.isEmpty(y53Var2.q().L())) {
                            y53.k(w93Var);
                            w93Var.a0(new p73(-10), false);
                        }
                        p73Var = null;
                    }
                } else {
                    y53Var2 = y53Var5;
                    z23Var5 = z23Var4;
                    qf3Var = qf3Var4;
                    if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(n73.class);
                        enumMap8.put(n73.AD_STORAGE, l73VarU);
                        enumMap8.put(n73Var, l73VarU2);
                        p73Var = new p73(enumMap8, -10);
                    } else {
                        if (!TextUtils.isEmpty(y53Var2.q().L())) {
                            y53.k(w93Var);
                            w93Var.a0(new p73(-10), false);
                        }
                        p73Var = null;
                    }
                }
                if (p73Var != null) {
                    y53.k(w93Var);
                    w93Var.a0(p73Var, true);
                    p73Var2 = p73Var;
                } else {
                    p73Var2 = p73VarL;
                }
                y53.k(w93Var);
                y53Var3 = (y53) w93Var.a;
                w93Var.e0(p73Var2);
                h43Var.D();
                int i11 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
                l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
                if (l73VarU3 != l73Var) {
                    y53.l(c33Var2);
                    z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
                }
                l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
                if (l73VarU4 == l73Var) {
                    if (!TextUtils.isEmpty(y53Var2.q().L())) {
                        y53.k(w93Var);
                        w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
                    y53.k(w93Var);
                    w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolR = is2Var.R("google_analytics_tcf_data_enabled");
                if (boolR != null) {
                    y53.l(c33Var2);
                    z23Var.a("TCF client enabled.");
                    y53.k(w93Var);
                    w93Var.D();
                    c33 c33Var118 = y53Var3.f;
                    y53.l(c33Var118);
                    c33Var118.Z.a("Register tcfPrefChangeListener.");
                    if (w93Var.g0 == null) {
                        w93Var.h0 = new x73(w93Var, y53Var3, 2);
                        w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                w93 w93Var2 = w93Var;
                                w93Var2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    c33 c33Var119 = ((y53) w93Var2.a).f;
                                    y53.l(c33Var119);
                                    c33Var119.a0.a("IABTCF_TCString change picked up in listener.");
                                    x73 x73Var = w93Var2.h0;
                                    gu2.o(x73Var);
                                    x73Var.b(500L);
                                }
                            }
                        };
                    }
                    h43 h43Var13 = y53Var3.e;
                    y53.j(h43Var13);
                    h43Var13.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                    y53.k(w93Var);
                    w93Var.K();
                } else {
                    y53.l(c33Var2);
                    z23Var.a("TCF client enabled.");
                    y53.k(w93Var);
                    w93Var.D();
                    c33 c33Var119 = y53Var3.f;
                    y53.l(c33Var119);
                    c33Var119.Z.a("Register tcfPrefChangeListener.");
                    if (w93Var.g0 == null) {
                        w93Var.h0 = new x73(w93Var, y53Var3, 2);
                        w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                w93 w93Var2 = w93Var;
                                w93Var2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    c33 c33Var1110 = ((y53) w93Var2.a).f;
                                    y53.l(c33Var1110);
                                    c33Var1110.a0.a("IABTCF_TCString change picked up in listener.");
                                    x73 x73Var = w93Var2.h0;
                                    gu2.o(x73Var);
                                    x73Var.b(500L);
                                }
                            }
                        };
                    }
                    h43 h43Var14 = y53Var3.e;
                    y53.j(h43Var14);
                    h43Var14.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                    y53.k(w93Var);
                    w93Var.K();
                }
                b43Var = h43Var.f;
                if (b43Var.a() == 0) {
                    y53.l(c33Var2);
                    z23Var3.b(Long.valueOf(j), "Persisting first open");
                    b43Var.b(j);
                }
                y53.k(w93Var);
                t73Var = w93Var.d0;
                if (t73Var.d()) {
                    h43 h43Var15 = t73Var.a.e;
                    y53.j(h43Var15);
                    h43Var15.j0.k(null);
                }
                if (y53Var2.h()) {
                    if (y53Var2.a()) {
                        qf3Var2 = qf3Var;
                        if (qf3Var2.h0("android.permission.INTERNET")) {
                            y53.l(c33Var2);
                            z23Var6 = z23Var5;
                            z23Var6.a("App is missing INTERNET permission");
                        } else {
                            z23Var6 = z23Var5;
                        }
                        if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                            y53.l(c33Var2);
                            z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        y53Var4 = y53Var2;
                        context = y53Var4.a;
                        if (!la2.a(context).c()) {
                            if (!qf3.z0(context)) {
                                y53.l(c33Var2);
                                z23Var6.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!qf3.Z(context)) {
                                y53.l(c33Var2);
                                z23Var6.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        y53.l(c33Var2);
                        z23Var6.a("Uploading is not possible. App measurement disabled");
                    } else {
                        y53Var4 = y53Var2;
                        qf3Var2 = qf3Var;
                    }
                    c33Var = c33Var2;
                } else {
                    y53Var4 = y53Var2;
                    qf3Var2 = qf3Var;
                    if (TextUtils.isEmpty(y53Var4.q().L())) {
                        String strL9 = y53Var4.q().L();
                        h43Var.D();
                        String string6 = h43Var.I().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strL9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                        if (zIsEmpty) {
                            hcVar2 = hcVar;
                        } else {
                            hcVar2 = hcVar;
                        }
                        String strL10 = y53Var4.q().L();
                        h43Var.D();
                        SharedPreferences.Editor editorEdit8 = h43Var.I().edit();
                        editorEdit8.putString("gmp_app_id", strL10);
                        editorEdit8.apply();
                    } else {
                        hcVar2 = hcVar;
                    }
                    if (!h43Var.L().i(n73Var)) {
                        hcVar2.k(null);
                    }
                    y53.k(w93Var);
                    w93Var.i.set(hcVar2.j());
                    y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    c33Var = c33Var2;
                    if (!TextUtils.isEmpty(y53Var4.q().L())) {
                        zA = y53Var4.a();
                        sharedPreferences = h43Var.c;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            h43Var.M(!zA);
                        }
                        if (zA) {
                            y53.k(w93Var);
                            w93Var.Q();
                        }
                        td3 td3Var6 = y53Var4.v;
                        y53.k(td3Var6);
                        td3Var6.e.y();
                        y53Var4.o().I(new AtomicReference());
                        y53Var4.o().J(h43Var.l0.k());
                    }
                }
                hq2.a();
                if (is2Var.P(null, h13.P0)) {
                    qf3Var2.D();
                    if (qf3Var2.b0() == 1) {
                        long jIntValue6 = ((Integer) h13.w0.a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        y53Var4.X.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            y53.l(c33Var);
                            z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        y53.k(w93Var);
                        w93Var.D();
                        if (w93Var.Y == null) {
                            w93Var.Y = new x73(w93Var, y53Var3, 0);
                        }
                        w93Var.Y.b(jMax);
                    }
                }
                h43Var.b0.b(true);
            }
            y53.l(c33Var5);
            c33Var5.f.b(c33.M(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strW = e23Var2.Z;
            if (TextUtils.isEmpty(strW)) {
                strW = ia.w(context2, y53Var7.c0);
            }
            if (!TextUtils.isEmpty(strW)) {
                str4 = strW;
            }
            e23Var2.b0 = str4;
            if (iC == 0) {
                y53.l(c33Var5);
                c33Var5.a0.c(e23Var2.c, e23Var2.b0, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            y53.l(c33Var5);
            c33Var5.f.c(c33.M(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        string = "Unknown";
        str = string;
        str2 = installerPackageName;
        i = Integer.MIN_VALUE;
        e23Var2.c = packageName;
        e23Var2.f = str2;
        e23Var2.d = str;
        e23Var2.e = i;
        e23Var2.i = string;
        e23Var2.v = 0L;
        iC = y53Var7.c();
        if (iC == 0) {
            y53.l(c33Var5);
            c33Var5.a0.a("App measurement collection enabled");
        } else if (iC == 1) {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement deactivated via the manifest");
        } else if (iC == 3) {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iC == 4) {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement disabled via the manifest");
        } else if (iC == 6) {
            y53.l(c33Var5);
            c33Var5.X.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iC == 7) {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement disabled via the global data collection setting");
        } else if (iC != 8) {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement disabled");
            y53.l(c33Var5);
            c33Var5.i.a("Invalid scion state in identity");
        } else {
            y53.l(c33Var5);
            c33Var5.Y.a("App measurement disabled due to denied storage consent");
        }
        e23Var2.b0 = BuildConfig.FLAVOR;
        e23Var2.X = null;
        is2 is2Var4 = y53Var7.d;
        y53Var = (y53) is2Var4.a;
        gu2.l("analytics.safelisted_events");
        bundleQ = is2Var4.Q();
        if (bundleQ != null) {
            if (bundleQ.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleQ.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                e23Var2.X = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        e23Var2.X = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        qf3Var3 = y53Var7.w;
                        y53.j(qf3Var3);
                    }
                } while (qf3Var3.I0("safelisted event", str3));
            } else {
                y53.l(c33Var5);
                c33Var5.X.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                e23Var2.a0 = rq0.x(context2) ? 1 : 0;
            } else {
                e23Var2.a0 = 0;
            }
            ((y53) e23Var2.a).p0.incrementAndGet();
            e23Var2.b = true;
            fa3Var = new fa3(y53Var5);
            fa3Var.G();
            y53Var5.h0 = fa3Var;
            if (!fa3Var.b) {
                uq1.q("Can't initialize twice");
                return;
            }
            fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
            ((y53) fa3Var.a).p0.incrementAndGet();
            fa3Var.b = true;
            y53.l(c33Var2);
            z23Var = c33Var2.Z;
            z23Var2 = c33Var2.Y;
            z23Var3 = c33Var2.a0;
            z23Var4 = c33Var2.f;
            is2Var.K();
            z23Var2.b(161000L, "App measurement initialized, version");
            y53.l(c33Var2);
            z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strK = e23Var.K();
            if (qf3Var4.j0(strK, is2Var.c)) {
                y53.l(c33Var2);
                z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                y53.l(c33Var2);
                z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
            }
            y53.l(c33Var2);
            z23Var.a("Debug-level message logging enabled");
            i2 = y53Var5.n0;
            atomicInteger = y53Var5.p0;
            if (i2 != atomicInteger.get()) {
                y53.l(c33Var2);
                z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            y53Var5.i0 = true;
            j = y53Var5.q0;
            w93Var = y53Var5.Z;
            t53 t53Var6 = y53Var5.i;
            y53.l(t53Var6);
            t53Var6.D();
            y53.i(y53Var5.h0);
            iJ = y53Var5.h0.J();
            hq2.a();
            zP = is2Var.P(null, h13.P0);
            if (iJ == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zP) {
                qf3Var4.D();
                if (qf3Var4.b0() == 1) {
                    qf3Var4.D();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    sp0.z(y53Var6.a, new xh(y53Var6), intentFilter13);
                    c33 c33Var1110 = y53Var6.f;
                    y53.l(c33Var1110);
                    c33Var1110.Z.a("Registered app receiver");
                    if (z2) {
                        y53.i(y53Var5.h0);
                        y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    qf3Var4.D();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    sp0.z(y53Var6.a, new xh(y53Var6), intentFilter14);
                    c33 c33Var1111 = y53Var6.f;
                    y53.l(c33Var1111);
                    c33Var1111.Z.a("Registered app receiver");
                    if (z2) {
                        y53.i(y53Var5.h0);
                        y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                    }
                }
            } else if (z) {
                z = true;
                qf3Var4.D();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter15);
                c33 c33Var1112 = y53Var6.f;
                y53.l(c33Var1112);
                c33Var1112.Z.a("Registered app receiver");
                if (z2) {
                    y53.i(y53Var5.h0);
                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                }
            }
            hcVar = h43Var.i;
            p73VarL = h43Var.L();
            int i12 = p73VarL.b;
            l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
            l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
            n73Var = n73.ANALYTICS_STORAGE;
            l73Var = l73.UNINITIALIZED;
            if (l73VarU == l73Var) {
                y53Var2 = y53Var5;
                z23Var5 = z23Var4;
                qf3Var = qf3Var4;
                if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(n73.class);
                    enumMap9.put(n73.AD_STORAGE, l73VarU);
                    enumMap9.put(n73Var, l73VarU2);
                    p73Var = new p73(enumMap9, -10);
                } else {
                    if (!TextUtils.isEmpty(y53Var2.q().L())) {
                        y53.k(w93Var);
                        w93Var.a0(new p73(-10), false);
                    }
                    p73Var = null;
                }
            } else {
                y53Var2 = y53Var5;
                z23Var5 = z23Var4;
                qf3Var = qf3Var4;
                if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(n73.class);
                    enumMap10.put(n73.AD_STORAGE, l73VarU);
                    enumMap10.put(n73Var, l73VarU2);
                    p73Var = new p73(enumMap10, -10);
                } else {
                    if (!TextUtils.isEmpty(y53Var2.q().L())) {
                        y53.k(w93Var);
                        w93Var.a0(new p73(-10), false);
                    }
                    p73Var = null;
                }
            }
            if (p73Var != null) {
                y53.k(w93Var);
                w93Var.a0(p73Var, true);
                p73Var2 = p73Var;
            } else {
                p73Var2 = p73VarL;
            }
            y53.k(w93Var);
            y53Var3 = (y53) w93Var.a;
            w93Var.e0(p73Var2);
            h43Var.D();
            int i13 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
            l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
            if (l73VarU3 != l73Var) {
                y53.l(c33Var2);
                z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
            }
            l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
            if (l73VarU4 == l73Var) {
                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                    y53.k(w93Var);
                    w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
                y53.k(w93Var);
                w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolR = is2Var.R("google_analytics_tcf_data_enabled");
            if (boolR != null) {
                y53.l(c33Var2);
                z23Var.a("TCF client enabled.");
                y53.k(w93Var);
                w93Var.D();
                c33 c33Var1113 = y53Var3.f;
                y53.l(c33Var1113);
                c33Var1113.Z.a("Register tcfPrefChangeListener.");
                if (w93Var.g0 == null) {
                    w93Var.h0 = new x73(w93Var, y53Var3, 2);
                    w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            w93 w93Var2 = w93Var;
                            w93Var2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                c33 c33Var1114 = ((y53) w93Var2.a).f;
                                y53.l(c33Var1114);
                                c33Var1114.a0.a("IABTCF_TCString change picked up in listener.");
                                x73 x73Var = w93Var2.h0;
                                gu2.o(x73Var);
                                x73Var.b(500L);
                            }
                        }
                    };
                }
                h43 h43Var16 = y53Var3.e;
                y53.j(h43Var16);
                h43Var16.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                y53.k(w93Var);
                w93Var.K();
            } else {
                y53.l(c33Var2);
                z23Var.a("TCF client enabled.");
                y53.k(w93Var);
                w93Var.D();
                c33 c33Var1114 = y53Var3.f;
                y53.l(c33Var1114);
                c33Var1114.Z.a("Register tcfPrefChangeListener.");
                if (w93Var.g0 == null) {
                    w93Var.h0 = new x73(w93Var, y53Var3, 2);
                    w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            w93 w93Var2 = w93Var;
                            w93Var2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                c33 c33Var1115 = ((y53) w93Var2.a).f;
                                y53.l(c33Var1115);
                                c33Var1115.a0.a("IABTCF_TCString change picked up in listener.");
                                x73 x73Var = w93Var2.h0;
                                gu2.o(x73Var);
                                x73Var.b(500L);
                            }
                        }
                    };
                }
                h43 h43Var17 = y53Var3.e;
                y53.j(h43Var17);
                h43Var17.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
                y53.k(w93Var);
                w93Var.K();
            }
            b43Var = h43Var.f;
            if (b43Var.a() == 0) {
                y53.l(c33Var2);
                z23Var3.b(Long.valueOf(j), "Persisting first open");
                b43Var.b(j);
            }
            y53.k(w93Var);
            t73Var = w93Var.d0;
            if (t73Var.d()) {
                h43 h43Var18 = t73Var.a.e;
                y53.j(h43Var18);
                h43Var18.j0.k(null);
            }
            if (y53Var2.h()) {
                if (y53Var2.a()) {
                    qf3Var2 = qf3Var;
                    if (qf3Var2.h0("android.permission.INTERNET")) {
                        y53.l(c33Var2);
                        z23Var6 = z23Var5;
                        z23Var6.a("App is missing INTERNET permission");
                    } else {
                        z23Var6 = z23Var5;
                    }
                    if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                        y53.l(c33Var2);
                        z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    y53Var4 = y53Var2;
                    context = y53Var4.a;
                    if (!la2.a(context).c()) {
                        if (!qf3.z0(context)) {
                            y53.l(c33Var2);
                            z23Var6.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!qf3.Z(context)) {
                            y53.l(c33Var2);
                            z23Var6.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    y53.l(c33Var2);
                    z23Var6.a("Uploading is not possible. App measurement disabled");
                } else {
                    y53Var4 = y53Var2;
                    qf3Var2 = qf3Var;
                }
                c33Var = c33Var2;
            } else {
                y53Var4 = y53Var2;
                qf3Var2 = qf3Var;
                if (TextUtils.isEmpty(y53Var4.q().L())) {
                    String strL11 = y53Var4.q().L();
                    h43Var.D();
                    String string7 = h43Var.I().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strL11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                    if (zIsEmpty) {
                        hcVar2 = hcVar;
                    } else {
                        hcVar2 = hcVar;
                    }
                    String strL12 = y53Var4.q().L();
                    h43Var.D();
                    SharedPreferences.Editor editorEdit9 = h43Var.I().edit();
                    editorEdit9.putString("gmp_app_id", strL12);
                    editorEdit9.apply();
                } else {
                    hcVar2 = hcVar;
                }
                if (!h43Var.L().i(n73Var)) {
                    hcVar2.k(null);
                }
                y53.k(w93Var);
                w93Var.i.set(hcVar2.j());
                y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                c33Var = c33Var2;
                if (!TextUtils.isEmpty(y53Var4.q().L())) {
                    zA = y53Var4.a();
                    sharedPreferences = h43Var.c;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        h43Var.M(!zA);
                    }
                    if (zA) {
                        y53.k(w93Var);
                        w93Var.Q();
                    }
                    td3 td3Var7 = y53Var4.v;
                    y53.k(td3Var7);
                    td3Var7.e.y();
                    y53Var4.o().I(new AtomicReference());
                    y53Var4.o().J(h43Var.l0.k());
                }
            }
            hq2.a();
            if (is2Var.P(null, h13.P0)) {
                qf3Var2.D();
                if (qf3Var2.b0() == 1) {
                    long jIntValue7 = ((Integer) h13.w0.a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    y53Var4.X.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        y53.l(c33Var);
                        z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    y53.k(w93Var);
                    w93Var.D();
                    if (w93Var.Y == null) {
                        w93Var.Y = new x73(w93Var, y53Var3, 0);
                    }
                    w93Var.Y.b(jMax);
                }
            }
            h43Var.b0.b(true);
        }
        c33 c33Var1115 = y53Var.f;
        y53.l(c33Var1115);
        c33Var1115.f.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = y53Var.a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            e23Var2.X = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    e23Var2.X = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    qf3Var3 = y53Var7.w;
                    y53.j(qf3Var3);
                }
            } while (qf3Var3.I0("safelisted event", str3));
        } else {
            y53.l(c33Var5);
            c33Var5.X.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            e23Var2.a0 = rq0.x(context2) ? 1 : 0;
        } else {
            e23Var2.a0 = 0;
        }
        ((y53) e23Var2.a).p0.incrementAndGet();
        e23Var2.b = true;
        fa3Var = new fa3(y53Var5);
        fa3Var.G();
        y53Var5.h0 = fa3Var;
        if (!fa3Var.b) {
            uq1.q("Can't initialize twice");
            return;
        }
        fa3Var.c = (JobScheduler) ((y53) fa3Var.a).a.getSystemService("jobscheduler");
        ((y53) fa3Var.a).p0.incrementAndGet();
        fa3Var.b = true;
        y53.l(c33Var2);
        z23Var = c33Var2.Z;
        z23Var2 = c33Var2.Y;
        z23Var3 = c33Var2.a0;
        z23Var4 = c33Var2.f;
        is2Var.K();
        z23Var2.b(161000L, "App measurement initialized, version");
        y53.l(c33Var2);
        z23Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strK = e23Var.K();
        if (qf3Var4.j0(strK, is2Var.c)) {
            y53.l(c33Var2);
            z23Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            y53.l(c33Var2);
            z23Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strK)));
        }
        y53.l(c33Var2);
        z23Var.a("Debug-level message logging enabled");
        i2 = y53Var5.n0;
        atomicInteger = y53Var5.p0;
        if (i2 != atomicInteger.get()) {
            y53.l(c33Var2);
            z23Var4.c(Integer.valueOf(y53Var5.n0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        y53Var5.i0 = true;
        j = y53Var5.q0;
        w93Var = y53Var5.Z;
        t53 t53Var7 = y53Var5.i;
        y53.l(t53Var7);
        t53Var7.D();
        y53.i(y53Var5.h0);
        iJ = y53Var5.h0.J();
        hq2.a();
        zP = is2Var.P(null, h13.P0);
        if (iJ == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zP) {
            qf3Var4.D();
            if (qf3Var4.b0() == 1) {
                qf3Var4.D();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter16);
                c33 c33Var1116 = y53Var6.f;
                y53.l(c33Var1116);
                c33Var1116.Z.a("Registered app receiver");
                if (z2) {
                    y53.i(y53Var5.h0);
                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                qf3Var4.D();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                sp0.z(y53Var6.a, new xh(y53Var6), intentFilter17);
                c33 c33Var1117 = y53Var6.f;
                y53.l(c33Var1117);
                c33Var1117.Z.a("Registered app receiver");
                if (z2) {
                    y53.i(y53Var5.h0);
                    y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
                }
            }
        } else if (z) {
            z = true;
            qf3Var4.D();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z2 = z;
            sp0.z(y53Var6.a, new xh(y53Var6), intentFilter18);
            c33 c33Var1118 = y53Var6.f;
            y53.l(c33Var1118);
            c33Var1118.Z.a("Registered app receiver");
            if (z2) {
                y53.i(y53Var5.h0);
                y53Var5.h0.I(((Long) h13.C.a(null)).longValue());
            }
        }
        hcVar = h43Var.i;
        p73VarL = h43Var.L();
        int i14 = p73VarL.b;
        l73VarU = is2Var.U("google_analytics_default_allow_ad_storage", false);
        l73VarU2 = is2Var.U("google_analytics_default_allow_analytics_storage", false);
        n73Var = n73.ANALYTICS_STORAGE;
        l73Var = l73.UNINITIALIZED;
        if (l73VarU == l73Var) {
            y53Var2 = y53Var5;
            z23Var5 = z23Var4;
            qf3Var = qf3Var4;
            if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(n73.class);
                enumMap11.put(n73.AD_STORAGE, l73VarU);
                enumMap11.put(n73Var, l73VarU2);
                p73Var = new p73(enumMap11, -10);
            } else {
                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                    y53.k(w93Var);
                    w93Var.a0(new p73(-10), false);
                }
                p73Var = null;
            }
        } else {
            y53Var2 = y53Var5;
            z23Var5 = z23Var4;
            qf3Var = qf3Var4;
            if (p73.l(-10, h43Var.I().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(n73.class);
                enumMap12.put(n73.AD_STORAGE, l73VarU);
                enumMap12.put(n73Var, l73VarU2);
                p73Var = new p73(enumMap12, -10);
            } else {
                if (!TextUtils.isEmpty(y53Var2.q().L())) {
                    y53.k(w93Var);
                    w93Var.a0(new p73(-10), false);
                }
                p73Var = null;
            }
        }
        if (p73Var != null) {
            y53.k(w93Var);
            w93Var.a0(p73Var, true);
            p73Var2 = p73Var;
        } else {
            p73Var2 = p73VarL;
        }
        y53.k(w93Var);
        y53Var3 = (y53) w93Var.a;
        w93Var.e0(p73Var2);
        h43Var.D();
        int i15 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).a;
        l73VarU3 = is2Var.U("google_analytics_default_allow_ad_personalization_signals", true);
        if (l73VarU3 != l73Var) {
            y53.l(c33Var2);
            z23Var3.b(l73VarU3, "Default ad personalization consent from Manifest");
        }
        l73VarU4 = is2Var.U("google_analytics_default_allow_ad_user_data", true);
        if (l73VarU4 == l73Var) {
            if (!TextUtils.isEmpty(y53Var2.q().L())) {
                y53.k(w93Var);
                w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(y53Var2.q().L())) {
            y53.k(w93Var);
            w93Var.Z(new pu2((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolR = is2Var.R("google_analytics_tcf_data_enabled");
        if (boolR != null) {
            y53.l(c33Var2);
            z23Var.a("TCF client enabled.");
            y53.k(w93Var);
            w93Var.D();
            c33 c33Var1119 = y53Var3.f;
            y53.l(c33Var1119);
            c33Var1119.Z.a("Register tcfPrefChangeListener.");
            if (w93Var.g0 == null) {
                w93Var.h0 = new x73(w93Var, y53Var3, 2);
                w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        w93 w93Var2 = w93Var;
                        w93Var2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            c33 c33Var11110 = ((y53) w93Var2.a).f;
                            y53.l(c33Var11110);
                            c33Var11110.a0.a("IABTCF_TCString change picked up in listener.");
                            x73 x73Var = w93Var2.h0;
                            gu2.o(x73Var);
                            x73Var.b(500L);
                        }
                    }
                };
            }
            h43 h43Var19 = y53Var3.e;
            y53.j(h43Var19);
            h43Var19.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
            y53.k(w93Var);
            w93Var.K();
        } else {
            y53.l(c33Var2);
            z23Var.a("TCF client enabled.");
            y53.k(w93Var);
            w93Var.D();
            c33 c33Var11110 = y53Var3.f;
            y53.l(c33Var11110);
            c33Var11110.Z.a("Register tcfPrefChangeListener.");
            if (w93Var.g0 == null) {
                w93Var.h0 = new x73(w93Var, y53Var3, 2);
                w93Var.g0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: p93
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        w93 w93Var2 = w93Var;
                        w93Var2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            c33 c33Var11111 = ((y53) w93Var2.a).f;
                            y53.l(c33Var11111);
                            c33Var11111.a0.a("IABTCF_TCString change picked up in listener.");
                            x73 x73Var = w93Var2.h0;
                            gu2.o(x73Var);
                            x73Var.b(500L);
                        }
                    }
                };
            }
            h43 h43Var110 = y53Var3.e;
            y53.j(h43Var110);
            h43Var110.J().registerOnSharedPreferenceChangeListener(w93Var.g0);
            y53.k(w93Var);
            w93Var.K();
        }
        b43Var = h43Var.f;
        if (b43Var.a() == 0) {
            y53.l(c33Var2);
            z23Var3.b(Long.valueOf(j), "Persisting first open");
            b43Var.b(j);
        }
        y53.k(w93Var);
        t73Var = w93Var.d0;
        if (t73Var.d()) {
            h43 h43Var111 = t73Var.a.e;
            y53.j(h43Var111);
            h43Var111.j0.k(null);
        }
        if (y53Var2.h()) {
            if (y53Var2.a()) {
                qf3Var2 = qf3Var;
                if (qf3Var2.h0("android.permission.INTERNET")) {
                    y53.l(c33Var2);
                    z23Var6 = z23Var5;
                    z23Var6.a("App is missing INTERNET permission");
                } else {
                    z23Var6 = z23Var5;
                }
                if (!qf3Var2.h0("android.permission.ACCESS_NETWORK_STATE")) {
                    y53.l(c33Var2);
                    z23Var6.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                y53Var4 = y53Var2;
                context = y53Var4.a;
                if (!la2.a(context).c()) {
                    if (!qf3.z0(context)) {
                        y53.l(c33Var2);
                        z23Var6.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!qf3.Z(context)) {
                        y53.l(c33Var2);
                        z23Var6.a("AppMeasurementService not registered/enabled");
                    }
                }
                y53.l(c33Var2);
                z23Var6.a("Uploading is not possible. App measurement disabled");
            } else {
                y53Var4 = y53Var2;
                qf3Var2 = qf3Var;
            }
            c33Var = c33Var2;
        } else {
            y53Var4 = y53Var2;
            qf3Var2 = qf3Var;
            if (TextUtils.isEmpty(y53Var4.q().L())) {
                String strL13 = y53Var4.q().L();
                h43Var.D();
                String string8 = h43Var.I().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strL13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                if (zIsEmpty) {
                    hcVar2 = hcVar;
                } else {
                    hcVar2 = hcVar;
                }
                String strL14 = y53Var4.q().L();
                h43Var.D();
                SharedPreferences.Editor editorEdit10 = h43Var.I().edit();
                editorEdit10.putString("gmp_app_id", strL14);
                editorEdit10.apply();
            } else {
                hcVar2 = hcVar;
            }
            if (!h43Var.L().i(n73Var)) {
                hcVar2.k(null);
            }
            y53.k(w93Var);
            w93Var.i.set(hcVar2.j());
            y53Var6.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            c33Var = c33Var2;
            if (!TextUtils.isEmpty(y53Var4.q().L())) {
                zA = y53Var4.a();
                sharedPreferences = h43Var.c;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    h43Var.M(!zA);
                }
                if (zA) {
                    y53.k(w93Var);
                    w93Var.Q();
                }
                td3 td3Var8 = y53Var4.v;
                y53.k(td3Var8);
                td3Var8.e.y();
                y53Var4.o().I(new AtomicReference());
                y53Var4.o().J(h43Var.l0.k());
            }
        }
        hq2.a();
        if (is2Var.P(null, h13.P0)) {
            qf3Var2.D();
            if (qf3Var2.b0() == 1) {
                long jIntValue8 = ((Integer) h13.w0.a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                y53Var4.X.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    y53.l(c33Var);
                    z23Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                y53.k(w93Var);
                w93Var.D();
                if (w93Var.Y == null) {
                    w93Var.Y = new x73(w93Var, y53Var3, 0);
                }
                w93Var.Y.b(jMax);
            }
        }
        h43Var.b0.b(true);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        ((java.lang.Runnable) r13.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        r8 = defpackage.wo1.f;
        r9 = java.util.logging.Level.SEVERE;
        r10 = java.lang.String.valueOf((java.lang.Runnable) r13.b);
        r12 = new java.lang.StringBuilder(r10.length() + 35);
        r12.append("Exception while executing runnable ");
        r12.append(r10);
        r8.log(r9, r12.toString(), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        r13.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r0 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e0, code lost:
    
        ((java.lang.Runnable) r13.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ec, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ee, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ef, code lost:
    
        defpackage.vo1.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r13.b), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010c, code lost:
    
        r13.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x010e, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e() {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh0.e():void");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0071  */
    /* JADX WARN: Code duplicated, block: B:316:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v5, types: [int] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thO;
        g31 g31Var;
        Object[] objArr;
        Pair pairCreate;
        String str;
        um0 um0Var;
        um0 aj3Var;
        Long lValueOf;
        int i = 6;
        int i2 = 0;
        switch (this.a) {
            case 0:
                hd2 hd2Var = (hd2) this.c;
                ListenableFuture listenableFuture = (ListenableFuture) this.b;
                if ((listenableFuture instanceof v0) && (thO = ((v0) listenableFuture).o()) != null) {
                    hd2Var.i(thO);
                    return;
                }
                try {
                    dh0.b(listenableFuture);
                    w93 w93Var = (w93) hd2Var.c;
                    w93Var.D();
                    y53 y53Var = (y53) w93Var.a;
                    h43 h43Var = y53Var.e;
                    y53.j(h43Var);
                    SparseArray sparseArrayK = h43Var.K();
                    zzoh zzohVar = (zzoh) hd2Var.b;
                    sparseArrayK.put(zzohVar.c, Long.valueOf(zzohVar.b));
                    h43 h43Var2 = y53Var.e;
                    y53.j(h43Var2);
                    int[] iArr = new int[sparseArrayK.size()];
                    long[] jArr = new long[sparseArrayK.size()];
                    for (int i3 = 0; i3 < sparseArrayK.size(); i3++) {
                        iArr[i3] = sparseArrayK.keyAt(i3);
                        jArr[i3] = ((Long) sparseArrayK.valueAt(i3)).longValue();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putIntArray("uriSources", iArr);
                    bundle.putLongArray("uriTimestamps", jArr);
                    h43Var2.a0.x(bundle);
                    w93Var.w = false;
                    w93Var.W = 1;
                    c33 c33Var = y53Var.f;
                    y53.l(c33Var);
                    c33Var.Z.b(zzohVar.a, "Successfully registered trigger URI");
                    w93Var.d0();
                    return;
                } catch (Error e) {
                    e = e;
                    hd2Var.i(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    hd2Var.i(e);
                    return;
                } catch (ExecutionException e3) {
                    hd2Var.i(e3.getCause());
                    return;
                }
            case 1:
                mg2 mg2Var = (mg2) this.c;
                if (mg2Var.a) {
                    sh2 sh2Var = (sh2) this.b;
                    ConnectionResult connectionResult = sh2Var.b;
                    if (connectionResult.b != 0 && connectionResult.c != null) {
                        tw0 tw0Var = mg2Var.mLifecycleFragment;
                        Activity activity = mg2Var.getActivity();
                        PendingIntent pendingIntent = connectionResult.c;
                        gu2.o(pendingIntent);
                        int i4 = sh2Var.a;
                        int i5 = GoogleApiActivity.b;
                        Intent intent = new Intent(activity, (Class<?>) GoogleApiActivity.class);
                        intent.putExtra("pending_intent", pendingIntent);
                        intent.putExtra("failing_client_id", i4);
                        intent.putExtra("notify_manager", false);
                        tw0Var.startActivityForResult(intent, 1);
                        return;
                    }
                    Activity activity2 = mg2Var.getActivity();
                    int i6 = connectionResult.b;
                    qj0 qj0Var = mg2Var.d;
                    if (qj0Var.a(i6, activity2, null) != null) {
                        qj0Var.f(mg2Var.getActivity(), mg2Var.mLifecycleFragment, connectionResult.b, mg2Var);
                        return;
                    }
                    if (connectionResult.b != 18) {
                        int i7 = sh2Var.a;
                        mg2Var.b.set(null);
                        mg2Var.f.i(connectionResult, i7);
                        return;
                    }
                    Activity activity3 = mg2Var.getActivity();
                    ProgressBar progressBar = new ProgressBar(activity3, null, R.attr.progressBarStyleLarge);
                    progressBar.setIndeterminate(true);
                    progressBar.setVisibility(0);
                    AlertDialog.Builder builder = new AlertDialog.Builder(activity3);
                    builder.setView(progressBar);
                    builder.setMessage(gh2.b(activity3, 18));
                    builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
                    AlertDialog alertDialogCreate = builder.create();
                    qj0.i(activity3, alertDialogCreate, "GooglePlayServicesUpdatingDialog", mg2Var);
                    Context applicationContext = mg2Var.getActivity().getApplicationContext();
                    rd2 rd2Var = new rd2(i, this, alertDialogCreate, i2);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addDataScheme("package");
                    qv1 qv1Var = new qv1(rd2Var);
                    sp0.z(applicationContext, qv1Var, intentFilter);
                    qv1Var.b = applicationContext;
                    if (xj0.b(applicationContext)) {
                        return;
                    }
                    mg2 mg2Var2 = (mg2) this.c;
                    mg2Var2.b.set(null);
                    th2 th2Var = mg2Var2.f.n;
                    th2Var.sendMessage(th2Var.obtainMessage(3));
                    if (alertDialogCreate.isShowing()) {
                        alertDialogCreate.dismiss();
                    }
                    synchronized (qv1Var) {
                        try {
                            Context context = qv1Var.b;
                            if (context != null) {
                                context.unregisterReceiver(qv1Var);
                            }
                            qv1Var.b = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                w3 w3Var = (w3) this.b;
                z3 z3Var = (z3) this.c;
                i31 i31Var = z3Var.c;
                if (i31Var != null && (g31Var = i31Var.e) != null) {
                    g31Var.g(i31Var);
                }
                View view = (View) z3Var.v;
                if (view != null && view.getWindowToken() != null) {
                    if (w3Var.b()) {
                        z3Var.f0 = w3Var;
                    } else if (w3Var.e != null) {
                        w3Var.d(0, 0, false, false);
                        z3Var.f0 = w3Var;
                    }
                }
                z3Var.h0 = null;
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                ((f5) this.b).a = this.c;
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((f5) this.c);
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                Object obj = this.c;
                Object obj2 = this.b;
                try {
                    Method method = g5.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        g5.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th2) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ri2 ri2Var = (ri2) this.b;
                Typeface typeface = (Typeface) this.c;
                xi0 xi0Var = (xi0) ri2Var.a;
                if (xi0Var != null) {
                    xi0Var.r(typeface);
                    return;
                }
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                ml0 ml0VarA = ml0.a();
                ml0VarA.getClass();
                d42.b();
                ml0VarA.d.set(true);
                ((yc0) this.c).b.b = true;
                ((yc0) this.c).a.getViewTreeObserver().removeOnDrawListener((yc0) this.b);
                ((yc0) this.c).b.a.clear();
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                gj0 gj0Var = (gj0) this.c;
                if (gj0Var.d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.b).run();
                    return;
                } catch (Throwable th3) {
                    gj0Var.c.getClass();
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th3);
                        return;
                    }
                    return;
                }
            case 9:
                ((pk) this.b).E((jl0) this.c, Unit.a);
                return;
            case 10:
                fs fsVarB = sr0.b((mv0) this.b);
                pj1 pj1Var = rj1.b;
                fsVarB.resumeWith(zi0.i((Throwable) this.c));
                return;
            case 11:
                CoroutineContext coroutineContext = (ex0) this.c;
                ys ysVar = coroutineContext.d;
                while (true) {
                    try {
                        ((Runnable) this.b).run();
                    } catch (Throwable th4) {
                        ia.h(th4, g.a);
                    }
                    Runnable runnableL = coroutineContext.l();
                    if (runnableL == null) {
                        return;
                    }
                    this.b = runnableL;
                    i2++;
                    if (i2 >= 16 && ysVar.i(coroutineContext)) {
                        ysVar.e(coroutineContext, this);
                        return;
                    }
                    break;
                }
                break;
            case 12:
                cc ccVar = (cc) this.c;
                Object obj3 = this.b;
                boolean z = ccVar.c.get();
                hi2 hi2Var = ccVar.e;
                if (!z) {
                    if (hi2Var.g != ccVar) {
                        if (hi2Var.h == ccVar) {
                            SystemClock.uptimeMillis();
                            hi2Var.h = null;
                            hi2Var.b();
                        }
                    } else if (!hi2Var.c) {
                        SystemClock.uptimeMillis();
                        hi2Var.g = null;
                        hz0 hz0Var = hi2Var.a;
                        if (hz0Var != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                hz0Var.j(obj3);
                            } else {
                                synchronized (((b) hz0Var).a) {
                                    objArr = ((b) hz0Var).f == b.k ? 1 : 0;
                                    ((b) hz0Var).f = obj3;
                                    break;
                                }
                                if (objArr != 0) {
                                    cb cbVarG = cb.G();
                                    i4 i4Var = ((b) hz0Var).j;
                                    c00 c00Var = cbVarG.h;
                                    if (c00Var.j == null) {
                                        synchronized (c00Var.h) {
                                            try {
                                                if (c00Var.j == null) {
                                                    c00Var.j = c00.G(Looper.getMainLooper());
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                        }
                                    }
                                    c00Var.j.post(i4Var);
                                }
                            }
                        }
                    }
                    break;
                } else if (hi2Var.h == ccVar) {
                    SystemClock.uptimeMillis();
                    hi2Var.h = null;
                    hi2Var.b();
                }
                ccVar.b = 3;
                return;
            case 13:
                ((fe0) this.b).accept(this.c);
                return;
            case 14:
                ((pk) this.c).E((h80) this.b, Unit.a);
                return;
            case 15:
                try {
                    e();
                    return;
                } catch (Error e5) {
                    synchronized (((vo1) this.c).b) {
                        ((vo1) this.c).c = 1;
                        throw e5;
                    }
                }
            case 16:
                a();
                return;
            case 17:
                c62 c62Var = ((SwipeDismissBehavior) this.c).a;
                if (c62Var == null || !c62Var.f()) {
                    return;
                }
                ((View) this.b).postOnAnimation(this);
                return;
            case 18:
                ((lo2) ((i4) this.c).b).i((de2) this.b);
                return;
            case 19:
                String str2 = "pbT";
                LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.b;
                h01 h01VarB = ((ie2) this.c).l().b(true);
                if (h01VarB == null || !h01VarB.c(2)) {
                    if (h01VarB == null || !h01VarB.c(1)) {
                        pairCreate = Pair.create("pbT", null);
                    } else {
                        str = h01VarB.a;
                    }
                    linkedBlockingQueue.offer(pairCreate);
                    return;
                }
                str2 = "pbH";
                str = h01VarB.b;
                pairCreate = Pair.create(str2, str);
                linkedBlockingQueue.offer(pairCreate);
                return;
            case 20:
                ConnectionResult connectionResult2 = (ConnectionResult) this.b;
                tg2 tg2Var = (tg2) this.c;
                uj0 uj0Var = (uj0) tg2Var.f;
                nj0 nj0Var = (nj0) tg2Var.b;
                rg2 rg2Var = (rg2) uj0Var.j.get((j7) tg2Var.c);
                if (rg2Var == null) {
                    return;
                }
                if (connectionResult2.b != 0) {
                    rg2Var.o(connectionResult2, null);
                    return;
                }
                tg2Var.a = true;
                if (nj0Var.r()) {
                    if (!tg2Var.a || (um0Var = (um0) tg2Var.d) == null) {
                        return;
                    }
                    nj0Var.j(um0Var, (Set) tg2Var.e);
                    return;
                }
                try {
                    nj0Var.j(null, nj0Var.r() ? nj0Var.z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e6) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e6);
                    nj0Var.d("Failed to get service from broker.");
                    rg2Var.o(new ConnectionResult(10, (PendingIntent) null, (String) null), null);
                    return;
                }
            case 21:
                b();
                return;
            case 22:
                bh2 bh2Var = (bh2) this.c;
                zak zakVar = (zak) this.b;
                bh2Var.getClass();
                ConnectionResult connectionResult3 = zakVar.b;
                if (connectionResult3.b == 0) {
                    zay zayVar = zakVar.c;
                    gu2.o(zayVar);
                    ConnectionResult connectionResult4 = zayVar.c;
                    if (connectionResult4.b != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult4)), new Exception());
                        bh2Var.i.a(connectionResult4);
                        bh2Var.h.c();
                        return;
                    }
                    tg2 tg2Var2 = bh2Var.i;
                    IBinder iBinder = zayVar.b;
                    if (iBinder == null) {
                        aj3Var = null;
                    } else {
                        int i8 = i3.b;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        aj3Var = iInterfaceQueryLocalInterface instanceof um0 ? (um0) iInterfaceQueryLocalInterface : new aj3(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                    }
                    Set set = bh2Var.e;
                    tg2Var2.getClass();
                    if (aj3Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        tg2Var2.a(new ConnectionResult(4, (PendingIntent) null, (String) null));
                    } else {
                        tg2Var2.d = aj3Var;
                        tg2Var2.e = set;
                        if (tg2Var2.a) {
                            ((nj0) tg2Var2.b).j(aj3Var, set);
                        }
                    }
                } else {
                    bh2Var.i.a(connectionResult3);
                }
                bh2Var.h.c();
                return;
            case 23:
                hc0 hc0VarE = hc0.e((String) this.b);
                ((sl2) hc0VarE.b(sl2.class)).getClass();
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(hc0VarE);
                FirebaseUser firebaseUser = firebaseAuth.f;
                if (firebaseUser != null) {
                    Task taskB = firebaseAuth.b(firebaseUser);
                    wt2.e.j("Token refreshing started", new Object[0]);
                    taskB.addOnFailureListener(new ox1(this));
                    return;
                }
                return;
            case 24:
                j73 j73Var = (j73) this.b;
                j73Var.b();
                if (nk1.n()) {
                    j73Var.e().N(this);
                    return;
                }
                fu2 fu2Var = (fu2) this.c;
                Object[] objArr2 = fu2Var.c != 0 ? 1 : 0;
                fu2Var.c = 0L;
                if (objArr2 != 0) {
                    fu2Var.a();
                    return;
                }
                return;
            case 25:
                mc mcVar = (mc) this.c;
                y53 y53Var2 = (y53) ((gk1) mcVar.c).b;
                t53 t53Var = y53Var2.i;
                y53.l(t53Var);
                t53Var.D();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", (String) mcVar.b);
                try {
                    iv2 iv2Var = (iv2) ((nv2) this.b);
                    Parcel parcelF = iv2Var.F();
                    fv2.b(parcelF, bundle2);
                    Parcel parcelE = iv2Var.E(parcelF, 1);
                    Bundle bundle3 = (Bundle) fv2.a(parcelE, Bundle.CREATOR);
                    parcelE.recycle();
                    if (bundle3 == null) {
                        c33 c33Var2 = y53Var2.f;
                        y53.l(c33Var2);
                        c33Var2.f.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e7) {
                    c33 c33Var3 = y53Var2.f;
                    y53.l(c33Var3);
                    c33Var3.f.b(e7.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                t53 t53Var2 = y53Var2.i;
                y53.l(t53Var2);
                t53Var2.D();
                throw new IllegalStateException("Unexpected call on client side");
            case 26:
                c();
                return;
            case 27:
                d();
                return;
            case 28:
                g73 g73Var = (g73) this.c;
                g73Var.a.V();
                zzah zzahVar = (zzah) this.b;
                Object objZza = zzahVar.c.zza();
                if3 if3Var = g73Var.a;
                if (objZza == null) {
                    if3Var.getClass();
                    String str3 = zzahVar.a;
                    gu2.o(str3);
                    zzr zzrVarQ = if3Var.Q(str3);
                    if (zzrVarQ != null) {
                        if3Var.a0(zzahVar, zzrVarQ);
                        return;
                    }
                    return;
                }
                if3Var.getClass();
                String str4 = zzahVar.a;
                gu2.o(str4);
                zzr zzrVarQ2 = if3Var.Q(str4);
                if (zzrVarQ2 != null) {
                    if3Var.Z(zzahVar, zzrVarQ2);
                    return;
                }
                return;
            default:
                hx2 hx2Var = (hx2) this.b;
                w93 w93Var2 = (w93) this.c;
                td3 td3Var = ((y53) w93Var2.a).v;
                y53.k(td3Var);
                y53 y53Var3 = (y53) td3Var.a;
                h43 h43Var3 = y53Var3.e;
                h43 h43Var4 = y53Var3.e;
                y53.j(h43Var3);
                if (h43Var3.L().i(n73.ANALYTICS_STORAGE)) {
                    y53.j(h43Var4);
                    y53Var3.X.getClass();
                    if (!h43Var4.N(System.currentTimeMillis())) {
                        y53.j(h43Var4);
                        if (h43Var4.d0.a() != 0) {
                            y53.j(h43Var4);
                            lValueOf = Long.valueOf(h43Var4.d0.a());
                        }
                    }
                    if (lValueOf == null) {
                        qf3 qf3Var = ((y53) w93Var2.a).w;
                        y53.j(qf3Var);
                        qf3Var.s0(hx2Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            hx2Var.k(null);
                            return;
                        } catch (RemoteException e8) {
                            c33 c33Var4 = ((y53) w93Var2.a).f;
                            y53.l(c33Var4);
                            c33Var4.f.b(e8, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                c33 c33Var5 = y53Var3.f;
                y53.l(c33Var5);
                c33Var5.X.a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    hx2Var.k(null);
                    return;
                }
                qf3 qf3Var2 = ((y53) w93Var2.a).w;
                y53.j(qf3Var2);
                qf3Var2.s0(hx2Var, lValueOf.longValue());
                return;
        }
    }

    public String toString() {
        int i = this.a;
        String str = "IDLE";
        Object obj = this.c;
        switch (i) {
            case 0:
                p11 p11Var = new p11(bh0.class.getSimpleName(), 3);
                nl1 nl1Var = new nl1();
                ((nl1) p11Var.d).a = nl1Var;
                p11Var.d = nl1Var;
                nl1Var.b = (hd2) obj;
                return p11Var.toString();
            case 15:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((vo1) obj).c;
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "QUEUING";
                    } else if (i2 != 3) {
                        str = i2 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case 16:
                Runnable runnable2 = (Runnable) this.b;
                if (runnable2 != null) {
                    String strValueOf = String.valueOf(runnable2);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 34);
                    sb2.append("SequentialExecutorWorker{running=");
                    sb2.append(strValueOf);
                    sb2.append("}");
                    return sb2.toString();
                }
                int i3 = ((wo1) obj).c;
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "QUEUING";
                    } else if (i3 != 3) {
                        str = i3 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                StringBuilder sb3 = new StringBuilder(str.length() + 32);
                sb3.append("SequentialExecutorWorker{state=");
                sb3.append(str);
                sb3.append("}");
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ bh0(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ bh0(Executor executor, int i) {
        this.a = i;
        this.c = executor;
    }

    public bh0(mc mcVar, nv2 nv2Var, mc mcVar2) {
        this.a = 25;
        this.b = nv2Var;
        this.c = mcVar;
    }

    public bh0(mg2 mg2Var, sh2 sh2Var) {
        this.a = 1;
        Objects.requireNonNull(mg2Var);
        this.c = mg2Var;
        this.b = sh2Var;
    }

    public /* synthetic */ bh0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public bh0(w93 w93Var, hx2 hx2Var) {
        this.a = 29;
        this.b = hx2Var;
        Objects.requireNonNull(w93Var);
        this.c = w93Var;
    }

    public bh0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 17;
        this.c = swipeDismissBehavior;
        this.b = view;
    }
}
