package com.google.android.recaptcha.internal;

import android.content.Context;
import com.hjq.toast.BuildConfig;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.ta;
import defpackage.uq1;
import defpackage.zi0;
import java.nio.charset.StandardCharsets;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = BuildConfig.FLAVOR;
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, et etVar, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, fs fsVar) {
        return ta.e(new zzac(this, str, null), fsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, fs fsVar) {
        zzad zzadVar;
        zzen zzenVarZzc;
        zzen zzenVar;
        if (fsVar instanceof zzad) {
            zzadVar = (zzad) fsVar;
            int i = zzadVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzadVar = new zzad(this, fsVar);
            }
        } else {
            zzadVar = new zzad(this, fsVar);
        }
        Object obj = zzadVar.zzb;
        ft ftVar = ft.a;
        int i2 = zzadVar.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                zzen zzenVar2 = zzadVar.zze;
                zzae zzaeVar = (zzae) zzadVar.zza;
                zi0.B(obj);
                zzenVarZzc = zzenVar2;
                this = zzaeVar;
            } else {
                if (i2 != 2) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzenVar = (zzen) zzadVar.zza;
                zi0.B(obj);
            }
            zzenVar.zza();
            return Unit.a;
        }
        zi0.B(obj);
        zzenVarZzc = zzz.zzc(this);
        if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
            this.zzd = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return Unit.a;
        }
        this.zze = zzi(zzseVar.zzg());
        zzan zzanVar = this.zzc;
        long jZzf = zzseVar.zzf();
        zzadVar.zza = this;
        zzadVar.zze = zzenVarZzc;
        zzadVar.zzd = 1;
        if (zzanVar.zzd(jZzf, zzadVar) != ftVar) {
        }
        return ftVar;
        zzan zzanVar2 = this.zzc;
        zzadVar.zza = zzenVarZzc;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
        if (zzanVar2.zze(zzadVar) != ftVar) {
            zzenVar = zzenVarZzc;
            zzenVar.zza();
            return Unit.a;
        }
        return ftVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
