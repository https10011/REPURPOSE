package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class r33 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public r33(lc3 lc3Var, zzr zzrVar, boolean z, zzah zzahVar) {
        this.a = 3;
        this.c = zzrVar;
        this.b = z;
        this.d = zzahVar;
        Objects.requireNonNull(lc3Var);
        this.e = lc3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzah zzahVarUnconfigurableExecutorService;
        int iA;
        switch (this.a) {
            case 0:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            CloudMessage cloudMessage = new CloudMessage(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    zzahVarUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (zzahVarUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new j61("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        zzahVarUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(zzahVarUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            zzahVarUnconfigurableExecutorService.execute(new gc(context, cloudMessage, countDownLatch, 6, false));
                            try {
                                iIntValue = ((Integer) Tasks.await(new nl1(context).l(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                lc3 lc3Var = (lc3) this.e;
                n13 n13Var = lc3Var.d;
                if (n13Var != null) {
                    lc3Var.W(n13Var, this.b ? null : (zzpl) this.d, (zzr) this.c);
                    lc3Var.R();
                    return;
                } else {
                    c33 c33Var = ((y53) lc3Var.a).f;
                    y53.l(c33Var);
                    c33Var.f.a("Discarding data. Failed to set user property");
                    return;
                }
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                lc3 lc3Var2 = (lc3) this.e;
                n13 n13Var2 = lc3Var2.d;
                if (n13Var2 != null) {
                    lc3Var2.W(n13Var2, this.b ? null : (zzbh) this.d, (zzr) this.c);
                    lc3Var2.R();
                    return;
                } else {
                    c33 c33Var2 = ((y53) lc3Var2.a).f;
                    y53.l(c33Var2);
                    c33Var2.f.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                lc3 lc3Var3 = (lc3) this.e;
                n13 n13Var3 = lc3Var3.d;
                if (n13Var3 != null) {
                    lc3Var3.W(n13Var3, this.b ? null : (zzah) this.d, (zzr) this.c);
                    lc3Var3.R();
                    return;
                } else {
                    c33 c33Var3 = ((y53) lc3Var3.a).f;
                    y53.l(c33Var3);
                    c33Var3.f.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ r33(lc3 lc3Var, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
        this.a = i;
        this.c = zzrVar;
        this.b = z;
        this.d = abstractSafeParcelable;
        this.e = lc3Var;
    }

    public /* synthetic */ r33(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = 0;
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }
}
