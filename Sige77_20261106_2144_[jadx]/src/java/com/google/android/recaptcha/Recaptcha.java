package com.google.android.recaptcha;

import android.app.Application;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.internal.zzcq;
import com.google.android.recaptcha.internal.zzdc;
import com.hjq.toast.BuildConfig;
import defpackage.fs;
import defpackage.ft;
import defpackage.oc1;
import defpackage.pj1;
import defpackage.qj1;
import defpackage.rj1;
import defpackage.uq1;
import defpackage.zi0;
import kotlin.Metadata;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\f\u0010\u000fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0087@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/google/android/recaptcha/Recaptcha;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Application;", "application", BuildConfig.FLAVOR, "siteKey", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaTasksClient;", "fetchTaskClient", "(Landroid/app/Application;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;", "getTasksClient", BuildConfig.FLAVOR, "timeout", "(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/recaptcha/RecaptchaClient;", "fetchClient", "(Landroid/app/Application;Ljava/lang/String;Lfs;)Ljava/lang/Object;", "Lrj1;", "getClient-BWLJW6A", "(Landroid/app/Application;Ljava/lang/String;JLfs;)Ljava/lang/Object;", "getClient", "java.com.google.android.libraries.abuse.recaptcha.enterprise_enterprise"}, k = 1, mv = {oc1.FLOAT_FIELD_NUMBER, 0, 0}, xi = 48)
public final class Recaptcha {
    public static final Recaptcha INSTANCE = new Recaptcha();

    private Recaptcha() {
    }

    public static final Task<RecaptchaTasksClient> fetchTaskClient(Application application, String str) {
        return zzcq.zze(application, str);
    }

    /* JADX INFO: renamed from: getClient-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ Object m0getClientBWLJW6A$default(Recaptcha recaptcha, Application application, String str, long j, fs fsVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j = 10000;
        }
        return recaptcha.m1getClientBWLJW6A(application, str, j, fsVar);
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str) {
        return zzcq.zzc(application, str, 10000L);
    }

    public final Object fetchClient(Application application, String str, fs<? super RecaptchaClient> fsVar) {
        return zzcq.zzd(application, str, fsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: getClient-BWLJW6A, reason: not valid java name */
    public final Object m1getClientBWLJW6A(Application application, String str, long j, fs<? super rj1> fsVar) {
        Recaptcha$getClient$1 recaptcha$getClient$1;
        if (fsVar instanceof Recaptcha$getClient$1) {
            recaptcha$getClient$1 = (Recaptcha$getClient$1) fsVar;
            int i = recaptcha$getClient$1.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                recaptcha$getClient$1.zzc = i - Integer.MIN_VALUE;
            } else {
                recaptcha$getClient$1 = new Recaptcha$getClient$1(this, fsVar);
            }
        } else {
            recaptcha$getClient$1 = new Recaptcha$getClient$1(this, fsVar);
        }
        Object objZzb = recaptcha$getClient$1.zza;
        ft ftVar = ft.a;
        int i2 = recaptcha$getClient$1.zzc;
        try {
            if (i2 == 0) {
                zi0.B(objZzb);
                pj1 pj1Var = rj1.b;
                recaptcha$getClient$1.zzc = 1;
                objZzb = zzcq.zzb(application, str, j, recaptcha$getClient$1);
                if (objZzb == ftVar) {
                    return ftVar;
                }
            } else {
                if (i2 != 1) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(objZzb);
            }
            zzdc zzdcVar = (zzdc) objZzb;
            pj1 pj1Var2 = rj1.b;
            return zzdcVar;
        } catch (Throwable th) {
            pj1 pj1Var3 = rj1.b;
            return new qj1(th);
        }
    }

    public static final Task<RecaptchaTasksClient> getTasksClient(Application application, String str, long j) {
        return zzcq.zzc(application, str, j);
    }
}
