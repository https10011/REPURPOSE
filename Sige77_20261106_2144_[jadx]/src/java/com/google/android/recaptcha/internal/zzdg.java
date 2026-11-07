package com.google.android.recaptcha.internal;

import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.mv1;
import defpackage.wx1;
import defpackage.yx1;
import defpackage.zi0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class zzdg extends mv1 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, fs fsVar) {
        super(2, fsVar);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // defpackage.ze
    public final fs create(Object obj, fs fsVar) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, fsVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((et) obj, (fs) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.ze
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVar;
        Exception e;
        wx1 e2;
        zzbd e3;
        ft ftVar = ft.a;
        if (this.zzb != 0) {
            zzenVar = (zzen) this.zza;
            try {
                zi0.B(obj);
            } catch (zzbd e4) {
                e3 = e4;
                zzbd zzbdVarZzs = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (wx1 e5) {
                e2 = e5;
                zzbd zzbdVarZzs2 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            } catch (Exception e6) {
                e = e6;
                zzbd zzbdVarZzs3 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            }
        } else {
            zi0.B(obj);
            zzen zzenVarZzf = this.zzc.zzu(this.zzd).zzf(28);
            try {
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzenVarZzf, null);
                this.zza = zzenVarZzf;
                this.zzb = 1;
                Object objA = yx1.a(j, zzdfVar, this);
                if (objA == ftVar) {
                    return ftVar;
                }
                zzenVar = zzenVarZzf;
                obj = objA;
            } catch (zzbd e7) {
                zzenVar = zzenVarZzf;
                e3 = e7;
                zzbd zzbdVarZzs4 = this.zzc.zzs(e3, e3);
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            } catch (wx1 e8) {
                zzenVar = zzenVarZzf;
                e2 = e8;
                zzbd zzbdVarZzs5 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs5);
                throw zzbdVarZzs5;
            } catch (Exception e9) {
                zzenVar = zzenVarZzf;
                e = e9;
                zzbd zzbdVarZzs6 = this.zzc.zzs(e, new zzbd(zzbb.zzc, zzba.zzZ, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs6);
                throw zzbdVarZzs6;
            }
        }
        return (zzsr) obj;
    }
}
