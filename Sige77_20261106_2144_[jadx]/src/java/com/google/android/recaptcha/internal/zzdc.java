package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
import defpackage.fs;
import defpackage.ft;
import defpackage.pj1;
import defpackage.qt;
import defpackage.rj1;
import defpackage.uq1;
import defpackage.zi0;
import java.util.UUID;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final Regex zza = new Regex("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) throws zzbd {
        zzbd zzbdVar = !zza.c(recaptchaAction.getAction()) ? new zzbd(zzbb.zzg, zzba.zzh, null) : null;
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar != null) {
            throw zzbdVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzf(RecaptchaAction recaptchaAction, long j, fs fsVar) {
        zzcy zzcyVar;
        if (fsVar instanceof zzcy) {
            zzcyVar = (zzcy) fsVar;
            int i = zzcyVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcyVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcyVar = new zzcy(this, fsVar);
            }
        } else {
            zzcyVar = new zzcy(this, fsVar);
        }
        Object objZzg = zzcyVar.zza;
        Object obj = ft.a;
        int i2 = zzcyVar.zzc;
        try {
            if (i2 == 0) {
                zi0.B(objZzg);
                String string = UUID.randomUUID().toString();
                Function2 zzczVar = new zzcz(this, j, recaptchaAction, string, null);
                zzcyVar.zzc = 1;
                objZzg = zzg(string, zzczVar, zzcyVar);
                if (objZzg == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(objZzg);
            }
            return ((rj1) objZzg).a;
        } catch (zzbd e) {
            pj1 pj1Var = rj1.b;
            return zi0.i(e.zzc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzg(String str, Function2 function2, fs fsVar) throws zzbd {
        zzdb zzdbVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (fsVar instanceof zzdb) {
            zzdbVar = (zzdb) fsVar;
            int i = zzdbVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdbVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdbVar = new zzdb(this, fsVar);
            }
        } else {
            zzdbVar = new zzdb(this, fsVar);
        }
        Object objInvoke = zzdbVar.zza;
        ft ftVar = ft.a;
        int i2 = zzdbVar.zzc;
        if (i2 == 0) {
            zi0.B(objInvoke);
            zzek zzekVarZza = this.zzd.zza();
            zzekVarZza.zzc(str);
            zzen zzenVarZzf = zzekVarZza.zzf(9);
            try {
                zzdbVar.zzd = zzenVarZzf;
                zzdbVar.zzc = 1;
                objInvoke = function2.invoke(zzekVarZza, zzdbVar);
                if (objInvoke == ftVar) {
                    return ftVar;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e3) {
                e2 = e3;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e4) {
                e = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzdbVar.zzd;
            try {
                zi0.B(objInvoke);
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar.zzb(e2);
                throw e2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzX, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-0E7RQCE */
    public final Object mo2execute0E7RQCE(RecaptchaAction recaptchaAction, long j, fs<? super rj1> fsVar) {
        zzcw zzcwVar;
        if (fsVar instanceof zzcw) {
            zzcwVar = (zzcw) fsVar;
            int i = zzcwVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcwVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcwVar = new zzcw(this, fsVar);
            }
        } else {
            zzcwVar = new zzcw(this, fsVar);
        }
        Object obj = zzcwVar.zza;
        Object obj2 = ft.a;
        int i2 = zzcwVar.zzc;
        if (i2 == 0) {
            zi0.B(obj);
            zzcwVar.zzc = 1;
            Object objZzf = zzf(recaptchaAction, j, zzcwVar);
            return objZzf == obj2 ? obj2 : objZzf;
        }
        if (i2 == 1) {
            zi0.B(obj);
            return ((rj1) obj).a;
        }
        uq1.q("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* JADX INFO: renamed from: execute-gIAlu-s */
    public final Object mo3executegIAlus(RecaptchaAction recaptchaAction, fs<? super rj1> fsVar) {
        zzcx zzcxVar;
        if (fsVar instanceof zzcx) {
            zzcxVar = (zzcx) fsVar;
            int i = zzcxVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzcxVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzcxVar = new zzcx(this, fsVar);
            }
        } else {
            zzcxVar = new zzcx(this, fsVar);
        }
        Object obj = zzcxVar.zza;
        Object obj2 = ft.a;
        int i2 = zzcxVar.zzc;
        if (i2 == 0) {
            zi0.B(obj);
            zzcxVar.zzc = 1;
            Object objMo2execute0E7RQCE = mo2execute0E7RQCE(recaptchaAction, 10000L, zzcxVar);
            return objMo2execute0E7RQCE == obj2 ? obj2 : objMo2execute0E7RQCE;
        }
        if (i2 == 1) {
            zi0.B(obj);
            return ((rj1) obj).a;
        }
        uq1.q("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(qt.b(this.zze.zzb(), new zzda(this, recaptchaAction, 10000L, null)));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(qt.b(this.zze.zzb(), new zzda(this, recaptchaAction, j, null)));
    }
}
