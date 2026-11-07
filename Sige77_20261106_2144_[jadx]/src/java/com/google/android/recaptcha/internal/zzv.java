package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import defpackage.e71;
import defpackage.et;
import defpackage.fs;
import defpackage.ft;
import defpackage.jo;
import defpackage.ko;
import defpackage.rj0;
import defpackage.rj1;
import defpackage.ta;
import defpackage.uq1;
import defpackage.v11;
import defpackage.y50;
import defpackage.zi0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzv extends zze {
    private final zzek zza;
    private final List zzb;
    private zzle zzc;
    private final Map zzd;

    public zzv(Context context, zzek zzekVar, zzbi zzbiVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        zzab zzabVar = new zzab(zzekVar.zza());
        zzp zzpVar = new zzp(zzekVar.zza());
        zzm zzmVar = new zzm(zzekVar.zza(), context.getContentResolver());
        zzn zznVar = new zzn(zzekVar.zza());
        zzek zzekVarZza = zzekVar.zza();
        et etVarZzc = zzbiVar.zzc();
        List listD = jo.d(zzabVar, zzpVar, zzmVar, zznVar, new zzae(zzekVarZza, context, etVarZzc, new zzan(context, etVarZzc, zzekVarZza, IntegrityManagerFactory.createStandard(context), 28800000L), new zzbs(rj0.b)));
        this.zza = zzekVar;
        this.zzb = listD;
        this.zzd = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzsi zzq(String str) {
        Map linkedHashMap;
        List list = (List) this.zzd.remove(str);
        if (list != null) {
            List<zzaa> list2 = list;
            int iA = v11.a(ko.h(list2));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            for (zzaa zzaaVar : list2) {
                linkedHashMap.put(Integer.valueOf(zzaaVar.zzb()), zzaaVar);
            }
        } else {
            linkedHashMap = y50.a;
            linkedHashMap.getClass();
        }
        zzsz zzszVarZzs = zzs(linkedHashMap, str);
        zzsh zzshVarZzf = zzsi.zzf();
        zzshVarZzf.zze(str);
        zzsf zzsfVarZzf = zzsg.zzf();
        byte[] bArrZzd = zzszVarZzs.zzd();
        zzsfVarZzf.zze(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        zzshVarZzf.zzf(zzsfVarZzf);
        return (zzsi) zzshVarZzf.zzk();
    }

    private final zzsx zzr(zzaa zzaaVar) {
        zzle zzleVar;
        zzsv zzsvVarZzf = zzsx.zzf();
        zzsvVarZzf.zzq(3);
        if (zzaaVar instanceof zzx) {
            zzti zztiVarZza = ((zzx) zzaaVar).zza();
            zzle zzleVar2 = this.zzc;
            zzleVar = zzleVar2 != null ? zzleVar2 : null;
            byte[] bArrZzd = zztiVarZza.zzd();
            zzsvVarZzf.zzf(zzcf.zza(zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length), zzleVar));
        } else {
            if (!(zzaaVar instanceof zzw)) {
                throw new e71();
            }
            zzte zzteVarZza = ((zzw) zzaaVar).zza();
            zzle zzleVar3 = this.zzc;
            zzleVar = zzleVar3 != null ? zzleVar3 : null;
            byte[] bArrZzd2 = zzteVarZza.zzd();
            zzsvVarZzf.zze(zzcf.zza(zzkh.zzh().zzi(bArrZzd2, 0, bArrZzd2.length), zzleVar));
        }
        return (zzsx) zzsvVarZzf.zzk();
    }

    private final zzsz zzs(Map map, String str) {
        zzsy zzsyVarZzf = zzsz.zzf();
        zzsyVarZzf.zzq(str);
        List list = this.zzb;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((zzy) obj).zzf()) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            zzy zzyVar = (zzy) obj2;
            if (!map.containsKey(Integer.valueOf(zzyVar.zza()))) {
                int iZza = zzyVar.zza();
                zztd zztdVarZzf = zzte.zzf();
                zztdVarZzf.zzf(iZza);
                zztdVarZzf.zzr(13);
                zztdVarZzf.zzq(27);
                zzsyVarZzf.zzf(zzr(new zzw(iZza, (zzte) zztdVarZzf.zzk())));
            }
        }
        Collection collectionValues = map.values();
        ArrayList arrayList2 = new ArrayList(ko.h(collectionValues));
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzr((zzaa) it.next()));
        }
        zzsyVarZzf.zze(arrayList2);
        return (zzsz) zzsyVarZzf.zzk();
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zza(String str) {
        zzek zzekVar = this.zza;
        zzekVar.zzc(str);
        return zzekVar.zzf(35);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final zzen zzb() {
        zzek zzekVar = this.zza;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(34);
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzd(String str, fs fsVar) {
        return zzq(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzf(String str, fs fsVar) {
        zzq zzqVar;
        if (fsVar instanceof zzq) {
            zzqVar = (zzq) fsVar;
            int i = zzqVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzqVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zzqVar = new zzq(this, fsVar);
            }
        } else {
            zzqVar = new zzq(this, fsVar);
        }
        Object objE = zzqVar.zza;
        ft ftVar = ft.a;
        int i2 = zzqVar.zzc;
        if (i2 == 0) {
            zi0.B(objE);
            zzs zzsVar = new zzs(this, str, null);
            zzqVar.zzc = 1;
            objE = ta.e(zzsVar, zzqVar);
            if (objE == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zi0.B(objE);
        }
        return ((rj1) objE).a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zze
    public final Object zzh(zzsc zzscVar, fs fsVar) {
        zzt zztVar;
        if (fsVar instanceof zzt) {
            zztVar = (zzt) fsVar;
            int i = zztVar.zzc;
            if ((i & Integer.MIN_VALUE) != 0) {
                zztVar.zzc = i - Integer.MIN_VALUE;
            } else {
                zztVar = new zzt(this, fsVar);
            }
        } else {
            zztVar = new zzt(this, fsVar);
        }
        Object objE = zztVar.zza;
        ft ftVar = ft.a;
        int i2 = zztVar.zzc;
        if (i2 == 0) {
            zi0.B(objE);
            zzu zzuVar = new zzu(zzscVar, this, null);
            zztVar.zzc = 1;
            objE = ta.e(zzuVar, zztVar);
            if (objE == ftVar) {
                return ftVar;
            }
        } else {
            if (i2 != 1) {
                uq1.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zi0.B(objE);
        }
        return ((rj1) objE).a;
    }

    @Override // com.google.android.recaptcha.internal.zze
    public final void zzk(zzsr zzsrVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zzy) it.next()).zze(zzsrVar);
        }
    }

    public final Map zzo() {
        return this.zzd;
    }
}
