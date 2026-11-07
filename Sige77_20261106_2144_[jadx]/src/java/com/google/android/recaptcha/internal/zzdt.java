package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import defpackage.aw0;
import defpackage.ea;
import defpackage.fs;
import defpackage.ft;
import defpackage.k42;
import defpackage.ko;
import defpackage.qt;
import defpackage.rj1;
import defpackage.sm0;
import defpackage.uo1;
import defpackage.uq1;
import defpackage.v11;
import defpackage.vv0;
import defpackage.ws0;
import defpackage.wx1;
import defpackage.yx1;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final vv0 zzd;
    private final vv0 zze;
    private final vv0 zzf;
    private final vv0 zzg;
    private final vv0 zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = aw0.a(zzdm.zza);
        this.zze = aw0.a(zzdn.zza);
        this.zzf = aw0.a(zzdo.zza);
        this.zzg = aw0.a(zzdp.zza);
        this.zzh = aw0.a(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zzekVarZza = this.zzb.zza();
        zzekVarZza.zzc(str);
        return zzekVarZza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object zzv(zzsc zzscVar, long j, fs fsVar) throws Throwable {
        zzdj zzdjVar;
        Object objZzc;
        Sequence children;
        k42 k42Var = k42.c;
        if (fsVar instanceof zzdj) {
            zzdjVar = (zzdj) fsVar;
            int i = zzdjVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzdjVar = new zzdj(this, fsVar);
            }
        } else {
            zzdjVar = new zzdj(this, fsVar);
        }
        zzdj zzdjVar2 = zzdjVar;
        Object obj = zzdjVar2.zzb;
        ft ftVar = ft.a;
        int i2 = zzdjVar2.zzd;
        if (i2 == 0) {
            zi0.B(obj);
            zzy(zzscVar.zzO());
            Iterator it = zzw().iterator();
            while (it.hasNext()) {
                this.zzc.zzf((zze) it.next());
            }
            zzl zzlVar = this.zzc;
            zzek zzekVar = this.zzb;
            zzdjVar2.zza = this;
            zzdjVar2.zzd = 1;
            objZzc = zzlVar.zzc(j, zzscVar, zzekVar, zzdjVar2);
            if (objZzc != ftVar) {
            }
            return ftVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th = (Throwable) zzdjVar2.zza;
            zi0.B(obj);
            throw th;
        }
        this = (zzdt) zzdjVar2.zza;
        zi0.B(obj);
        objZzc = ((rj1) obj).a;
        Throwable thA = rj1.a(objZzc);
        if (thA == null) {
            return Unit.a;
        }
        ws0 ws0Var = (ws0) this.zzi.zzd().b().get(k42Var);
        if (ws0Var != null && (children = ws0Var.getChildren()) != null) {
            Iterator it2 = children.iterator();
            while (it2.hasNext()) {
                ((ws0) it2.next()).cancel(null);
            }
        }
        CoroutineContext coroutineContextB = this.zzi.zzd().b();
        ws0 ws0Var2 = (ws0) coroutineContextB.get(k42Var);
        if (ws0Var2 == null) {
            sm0.g(coroutineContextB, "Current context doesn't contain Job in it: ");
            return null;
        }
        List listC = uo1.c(ws0Var2.getChildren());
        zzdjVar2.zza = thA;
        zzdjVar2.zzd = 2;
        if (ea.r(listC, zzdjVar2) != ftVar) {
            throw thA;
        }
        return ftVar;
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.B(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            return (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(16)) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) throws zzbd {
        try {
            zzrv zzrvVarZzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) aw0.a(zzde.zza).getValue()).zza(zzrvVarZzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzsoVarZzf = zzsp.zzf();
        zzsoVarZzf.zzs(this.zza);
        zzsoVarZzf.zze(recaptchaAction.getAction());
        zzsoVarZzf.zzf(zzscVar.zzN());
        zzsoVarZzf.zzq(zzscVar.zzM());
        zzsoVarZzf.zzr(zzsiVar);
        return (zzsp) zzsoVarZzf.zzk();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzl(String str, long j, fs fsVar) throws zzbd {
        zzdd zzddVar;
        Exception e;
        zzen zzenVar;
        wx1 e2;
        zzbd e3;
        if (fsVar instanceof zzdd) {
            zzddVar = (zzdd) fsVar;
            int i = zzddVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzddVar = new zzdd(this, fsVar);
            }
        } else {
            zzddVar = new zzdd(this, fsVar);
        }
        Object obj = zzddVar.zza;
        ft ftVar = ft.a;
        int i2 = zzddVar.zzc;
        if (i2 == 0) {
            zi0.B(obj);
            zzen zzenVarZzf = zzu(str).zzf(27);
            try {
                zzl zzlVar = this.zzc;
                zzddVar.zzd = zzenVarZzf;
                zzddVar.zzc = 1;
                Object objZzb = zzlVar.zzb(str, j, zzddVar);
                if (objZzb == ftVar) {
                    return ftVar;
                }
                obj = objZzb;
                zzenVar = zzenVarZzf;
            } catch (zzbd e4) {
                e3 = e4;
                zzenVar = zzenVarZzf;
                zzenVar.zzb(e3);
                throw e3;
            } catch (wx1 e5) {
                e2 = e5;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                zzenVar.zzb(zzbdVar);
                throw zzbdVar;
            } catch (Exception e6) {
                e = e6;
                zzenVar = zzenVarZzf;
                zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar2);
                throw zzbdVar2;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzddVar.zzd;
            try {
                zi0.B(obj);
            } catch (zzbd e7) {
                e3 = e7;
                zzenVar.zzb(e3);
                throw e3;
            } catch (wx1 e8) {
                e2 = e8;
                zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
                zzenVar.zzb(zzbdVar3);
                throw zzbdVar3;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVar4 = new zzbd(zzbb.zzb, zzba.zzaa, e.getMessage());
                zzenVar.zzb(zzbdVar4);
                throw zzbdVar4;
            }
        }
        zzsi zzsiVar = (zzsi) obj;
        zzenVar.zza();
        return zzsiVar;
    }

    public final Object zzm(zzsp zzspVar, String str, long j, fs fsVar) {
        return qt.E(this.zzi.zza().b(), new zzdg(this, str, j, zzspVar, null), fsVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzn(zzsc zzscVar, long j, fs fsVar) throws zzbd {
        zzdk zzdkVar;
        if (fsVar instanceof zzdk) {
            zzdkVar = (zzdk) fsVar;
            int i = zzdkVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdkVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdkVar = new zzdk(this, fsVar);
            }
        } else {
            zzdkVar = new zzdk(this, fsVar);
        }
        Object obj = zzdkVar.zza;
        ft ftVar = ft.a;
        int i2 = zzdkVar.zzc;
        try {
            if (i2 == 0) {
                zi0.B(obj);
                zzdl zzdlVar = new zzdl(this, zzscVar, j, null);
                zzdkVar.zzc = 1;
                if (yx1.a(j, zzdlVar, zzdkVar) == ftVar) {
                    return ftVar;
                }
            } else {
                if (i2 != 1) {
                    uq1.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zi0.B(obj);
            }
            return Unit.a;
        } catch (zzbd e) {
            throw e;
        } catch (wx1 e2) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e2.getMessage());
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e3.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object zzo(long j, fs fsVar) throws zzbd {
        zzdr zzdrVar;
        zzen zzenVarZzf;
        Exception e;
        zzdt zzdtVar;
        zzen zzenVar;
        wx1 e2;
        zzbd e3;
        if (fsVar instanceof zzdr) {
            zzdrVar = (zzdr) fsVar;
            int i = zzdrVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzdrVar = new zzdr(this, fsVar);
            }
        } else {
            zzdrVar = new zzdr(this, fsVar);
        }
        Object obj = zzdrVar.zza;
        ft ftVar = ft.a;
        int i2 = zzdrVar.zzc;
        if (i2 == 0) {
            zi0.B(obj);
            zzenVarZzf = this.zzb.zzf(22);
            try {
                zzds zzdsVar = new zzds(this, zzenVarZzf, null);
                zzdrVar.zzd = this;
                zzdrVar.zze = zzenVarZzf;
                zzdrVar.zzc = 1;
                Object objA = yx1.a(j, zzdsVar, zzdrVar);
                if (objA == ftVar) {
                    return ftVar;
                }
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                obj = objA;
            } catch (zzbd e4) {
                e3 = e4;
                if (Intrinsics.areEqual(e3.zzb(), zzbb.zzc)) {
                    e3 = this.zzs(e3, e3);
                }
                zzenVarZzf.zzb(e3);
                throw e3;
            } catch (wx1 e5) {
                e2 = e5;
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                zzbd zzbdVarZzs = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs);
                throw zzbdVarZzs;
            } catch (Exception e6) {
                e = e6;
                zzdtVar = this;
                zzenVar = zzenVarZzf;
                zzbd zzbdVarZzs2 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs2);
                throw zzbdVarZzs2;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zzenVar = zzdrVar.zze;
            zzdtVar = zzdrVar.zzd;
            try {
                zi0.B(obj);
            } catch (zzbd e7) {
                e3 = e7;
                zzenVarZzf = zzenVar;
                this = zzdtVar;
                if (Intrinsics.areEqual(e3.zzb(), zzbb.zzc)) {
                    e3 = this.zzs(e3, e3);
                }
                zzenVarZzf.zzb(e3);
                throw e3;
            } catch (wx1 e8) {
                e2 = e8;
                zzbd zzbdVarZzs3 = zzdtVar.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
                zzenVar.zzb(zzbdVarZzs3);
                throw zzbdVarZzs3;
            } catch (Exception e9) {
                e = e9;
                zzbd zzbdVarZzs4 = zzdtVar.zzs(e, new zzbd(zzbb.zzc, zzba.zzaw, e.getMessage()));
                zzenVar.zzb(zzbdVarZzs4);
                throw zzbdVarZzs4;
            }
        }
        return (zzsc) obj;
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzenVarZzf = zzu(str).zzf(29);
        try {
            List<zzst> listZzk = zzsrVar.zzk();
            int iA = v11.a(ko.h(listZzk));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (zzst zzstVar : listZzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzenVarZzf.zza();
        } catch (zzbd e) {
            zzenVarZzf.zzb(e);
        } catch (Exception e2) {
            zzenVarZzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
