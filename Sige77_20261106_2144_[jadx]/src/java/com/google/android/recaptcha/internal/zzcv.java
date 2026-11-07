package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.recaptcha.RecaptchaException;
import defpackage.aw0;
import defpackage.f61;
import defpackage.fs;
import defpackage.ft;
import defpackage.h61;
import defpackage.i7;
import defpackage.sp0;
import defpackage.uq1;
import defpackage.wx1;
import defpackage.zi0;
import java.util.UUID;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final f61 zzb = new h61();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();
    private final zzl zze = new zzl(null, 1, null);

    public zzcv(Application application) {
        this.zza = application;
        int i = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(null, 1, null)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i2 = 0; i2 < 13; i2++) {
            zzaw zzawVar = zzawVarArr[i2];
            if (!zzav.zzc.containsKey(Integer.valueOf(zzawVar.zza()))) {
                zzav.zzc.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) throws zzbd {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) throws zzbd {
        if (j < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (sp0.d(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return Intrinsics.areEqual(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, fs fsVar, int i, Object obj) throws wx1, RecaptchaException, i7 {
        if ((i & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcvVar.zzg(str, j, null, zzbiVar2, zzchVar2, fsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzj(String str, int i, Function2 function2, fs fsVar) throws RecaptchaException {
        zzcu zzcuVar;
        Exception e;
        zzen zzenVar;
        zzbd e2;
        if (fsVar instanceof zzcu) {
            zzcuVar = (zzcu) fsVar;
            int i2 = zzcuVar.zzc;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i2 - Integer.MIN_VALUE;
            } else {
                zzcuVar = new zzcu(this, fsVar);
            }
        } else {
            zzcuVar = new zzcu(this, fsVar);
        }
        Object objInvoke = zzcuVar.zza;
        ft ftVar = ft.a;
        int i3 = zzcuVar.zzc;
        if (i3 == 0) {
            zi0.B(objInvoke);
            zzek zzekVarZzk = zzk(str, this.zzf, i);
            zzen zzenVarZzf = zzekVarZzk.zzf(6);
            try {
                zzcuVar.zzd = zzenVarZzf;
                zzcuVar.zzc = 1;
                objInvoke = function2.invoke(zzekVarZzk, zzcuVar);
                if (objInvoke == ftVar) {
                    return ftVar;
                }
                zzenVar = zzenVarZzf;
            } catch (zzbd e3) {
                e2 = e3;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e4) {
                e = e4;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar.zzc();
            }
        } else {
            if (i3 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzcuVar.zzd;
            try {
                zi0.B(objInvoke);
            } catch (zzbd e5) {
                e2 = e5;
                zzenVar.zzb(e2);
                throw e2.zzc();
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2.zzc();
            }
        }
        zzenVar.zza();
        return objInvoke;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String string = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) aw0.a(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, string, i, this.zza, zzesVar, null);
        zzekVar.zzc(string);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object zzg(String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, fs fsVar) throws Throwable {
        zzcs zzcsVar;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j2;
        zzcv zzcvVar;
        String str2;
        f61 f61Var;
        f61 f61Var2;
        int i;
        if (fsVar instanceof zzcs) {
            zzcsVar = (zzcs) fsVar;
            int i2 = zzcsVar.zzg;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zzcsVar.zzg = i2 - Integer.MIN_VALUE;
            } else {
                zzcsVar = new zzcs(this, fsVar);
            }
        } else {
            zzcsVar = new zzcs(this, fsVar);
        }
        Object obj = zzcsVar.zze;
        ft ftVar = ft.a;
        int i3 = zzcsVar.zzg;
        try {
            if (i3 == 0) {
                zi0.B(obj);
                f61 f61Var3 = this.zzb;
                zzcsVar.zza = this;
                zzcsVar.zzh = str;
                zzcsVar.zzb = null;
                zzcsVar.zzj = zzbiVar;
                zzcsVar.zzi = zzchVar;
                zzcsVar.zzc = f61Var3;
                zzcsVar.zzd = j;
                zzcsVar.zzg = 1;
                h61 h61Var = (h61) f61Var3;
                if (h61Var.d(zzcsVar) != ftVar) {
                    zzbiVar2 = zzbiVar;
                    zzchVar2 = zzchVar;
                    j2 = j;
                    zzcvVar = this;
                    str2 = str;
                    f61Var = h61Var;
                }
                return ftVar;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f61Var2 = (f61) zzcsVar.zza;
                try {
                    zi0.B(obj);
                    f61Var2 = f61Var2;
                    zzdc zzdcVar = (zzdc) obj;
                    ((h61) f61Var2).g(null);
                    return zzdcVar;
                } catch (Throwable th) {
                    th = th;
                    ((h61) f61Var2).g(null);
                    throw th;
                }
            }
            long j3 = zzcsVar.zzd;
            f61 f61Var4 = (f61) zzcsVar.zzc;
            zzch zzchVar3 = zzcsVar.zzi;
            zzbi zzbiVar3 = zzcsVar.zzj;
            str2 = zzcsVar.zzh;
            zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
            zi0.B(obj);
            f61Var = f61Var4;
            zzchVar2 = zzchVar3;
            zzbiVar2 = zzbiVar3;
            zzcvVar = zzcvVar2;
            j2 = j3;
            if (Intrinsics.areEqual(zzchVar2, zzch.zza)) {
                i = 3;
            } else {
                i = Intrinsics.areEqual(zzchVar2, zzch.zzb) ? 4 : 2;
            }
            zzct zzctVar = new zzct(zzcvVar, str2, j2, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = f61Var;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            Object objZzj = zzcvVar.zzj(str2, i, zzctVar, zzcsVar);
            if (objZzj != ftVar) {
                f61Var2 = f61Var;
                obj = objZzj;
                zzdc zzdcVar2 = (zzdc) obj;
                ((h61) f61Var2).g(null);
                return zzdcVar2;
            }
            return ftVar;
        } catch (Throwable th2) {
            th = th2;
            f61Var2 = f61Var;
            ((h61) f61Var2).g(null);
            throw th;
        }
    }
}
