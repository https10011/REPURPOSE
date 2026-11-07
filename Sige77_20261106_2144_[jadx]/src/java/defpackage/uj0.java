package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uj0 implements Handler.Callback {
    public static final Status p = new Status(4, "Sign-out occurred while this API call was in progress.", (PendingIntent) null, (ConnectionResult) null);
    public static final Status q = new Status(4, "The user must be signed in to make this API call.", (PendingIntent) null, (ConnectionResult) null);
    public static final Object r = new Object();
    public static uj0 s;
    public long a;
    public boolean b;
    public TelemetryData c;
    public jr0 d;
    public final Context e;
    public final qj0 f;
    public final yd2 g;
    public final AtomicInteger h;
    public final AtomicInteger i;
    public final ConcurrentHashMap j;
    public mg2 k;
    public final ob l;
    public final ob m;
    public final th2 n;
    public volatile boolean o;

    public uj0(Context context, Looper looper) {
        qj0 qj0Var = qj0.e;
        this.a = 10000L;
        this.b = false;
        this.h = new AtomicInteger(1);
        this.i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.k = null;
        this.l = new ob(0);
        this.m = new ob(0);
        this.o = true;
        this.e = context;
        th2 th2Var = new th2(looper, this);
        Looper.getMainLooper();
        this.n = th2Var;
        this.f = qj0Var;
        this.g = new yd2(8);
        PackageManager packageManager = context.getPackageManager();
        if (gb2.W == null) {
            gb2.W = Boolean.valueOf(nj2.H() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (gb2.W.booleanValue()) {
            this.o = false;
        }
        th2Var.sendMessage(th2Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (r) {
            try {
                uj0 uj0Var = s;
                if (uj0Var != null) {
                    uj0Var.i.incrementAndGet();
                    th2 th2Var = uj0Var.n;
                    th2Var.sendMessageAtFrontOfQueue(th2Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Status d(j7 j7Var, ConnectionResult connectionResult) {
        String str = (String) j7Var.b.c;
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(17, sb.toString(), connectionResult.c, connectionResult);
    }

    public static uj0 e(Context context) {
        uj0 uj0Var;
        HandlerThread handlerThread;
        synchronized (r) {
            if (s == null) {
                synchronized (yf3.g) {
                    try {
                        handlerThread = yf3.i;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            yf3.i = handlerThread2;
                            handlerThread2.start();
                            handlerThread = yf3.i;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = qj0.d;
                s = new uj0(applicationContext, looper);
            }
            uj0Var = s;
        }
        return uj0Var;
    }

    public final rg2 b(pj0 pj0Var) {
        j7 j7Var = pj0Var.f;
        ConcurrentHashMap concurrentHashMap = this.j;
        rg2 rg2Var = (rg2) concurrentHashMap.get(j7Var);
        if (rg2Var == null) {
            rg2Var = new rg2(this, pj0Var);
            concurrentHashMap.put(j7Var, rg2Var);
        }
        if (rg2Var.b.r()) {
            this.m.add(j7Var);
        }
        rg2Var.r();
        return rg2Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    public final void c(TaskCompletionSource taskCompletionSource, int i, pj0 pj0Var) {
        vg2 vg2Var;
        uj0 uj0Var;
        if (i != 0) {
            j7 j7Var = pj0Var.f;
            if (g()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) gk1.q().b;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.b) {
                        boolean z2 = rootTelemetryConfiguration.c;
                        rg2 rg2Var = (rg2) this.j.get(j7Var);
                        if (rg2Var != null) {
                            nj0 nj0Var = rg2Var.b;
                            if (nj0Var instanceof jf) {
                                nj0 nj0Var2 = nj0Var;
                                if (nj0Var2.w == null || nj0Var2.q()) {
                                    z = z2;
                                } else {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationA = vg2.a(rg2Var, nj0Var2, i);
                                    if (connectionTelemetryConfigurationA != null) {
                                        rg2Var.m++;
                                        z = connectionTelemetryConfigurationA.c;
                                    }
                                }
                            }
                        } else {
                            z = z2;
                        }
                    }
                    vg2Var = null;
                    uj0Var = this;
                }
                uj0Var = this;
                vg2Var = new vg2(uj0Var, i, j7Var, z ? System.currentTimeMillis() : 0L, z ? SystemClock.elapsedRealtime() : 0L);
            } else {
                vg2Var = null;
                uj0Var = this;
            }
            if (vg2Var != null) {
                Task task = taskCompletionSource.getTask();
                th2 th2Var = uj0Var.n;
                Objects.requireNonNull(th2Var);
                task.addOnCompleteListener(new r6(th2Var, 3), vg2Var);
            }
        }
    }

    public final void f(mg2 mg2Var) {
        synchronized (r) {
            try {
                if (this.k != mg2Var) {
                    this.k = mg2Var;
                    this.l.clear();
                }
                this.l.addAll(mg2Var.e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        int i;
        if (this.b) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = (RootTelemetryConfiguration) gk1.q().b;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.b) {
            return false;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.g.b;
        synchronized (sparseIntArray) {
            i = sparseIntArray.get(203400000, -1);
        }
        return i == -1 || i == 0;
    }

    public final boolean h(ConnectionResult connectionResult, int i) {
        qj0 qj0Var = this.f;
        qj0Var.getClass();
        Context context = this.e;
        if (!rq0.x(context)) {
            int i2 = connectionResult.b;
            PendingIntent activity = connectionResult.c;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentA = qj0Var.a(i2, context, null);
                if (intentA != null) {
                    activity = PendingIntent.getActivity(context, 0, intentA, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                qj0Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, rh2.a | 134217728));
                qj0Var.h(context, connectionResult, false);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0367  */
    /* JADX WARN: Code duplicated, block: B:171:0x036d  */
    /* JADX WARN: Code duplicated, block: B:173:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:175:0x03b5  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v13 rg2, still in use, count: 2, list:
          (r2v13 rg2) from 0x035f: IGET (r2v13 rg2) A[WRAPPED] (LINE:864) rg2.h int
          (r2v13 rg2) from 0x0365: PHI (r2 I:??) = (r2v10 rg2), (r2v13 rg2) binds: [B:167:0x0364, B:222:0x0365] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:179)
        	at jadx.core.utils.InsnRemover.unbindResult(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.utils.InsnRemover.unbindInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:4)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:222)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:7)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:58)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:5)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:8)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r15) {
        /*
            Method dump skipped, instruction units count: 1178
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj0.handleMessage(android.os.Message):boolean");
    }

    public final void i(ConnectionResult connectionResult, int i) {
        if (h(connectionResult, i)) {
            return;
        }
        th2 th2Var = this.n;
        th2Var.sendMessage(th2Var.obtainMessage(5, i, 0, connectionResult));
    }
}
