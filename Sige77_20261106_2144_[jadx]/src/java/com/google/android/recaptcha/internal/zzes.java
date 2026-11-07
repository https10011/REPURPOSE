package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.e71;
import defpackage.et;
import defpackage.no1;
import defpackage.qr1;
import defpackage.qt;
import defpackage.sr0;
import defpackage.w50;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Timer;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzes implements zzeo {
    private static Timer zza;
    private final Context zzb;
    private final zzet zzc;
    private final et zzd;
    private final zzei zze;

    public zzes(Context context, zzet zzetVar, et etVar) {
        this.zzb = context;
        this.zzc = zzetVar;
        this.zzd = etVar;
        zzei zzeiVar = null;
        try {
            zzei zzeiVar2 = zzei.zzd;
            zzeiVar2 = zzeiVar2 == null ? new zzei(context, null) : zzeiVar2;
            zzei.zzd = zzeiVar2;
            zzeiVar = zzeiVar2;
        } catch (Exception unused) {
        }
        this.zze = zzeiVar;
        zzh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        ArrayList arrayList;
        Iterator it;
        zzei zzeiVar;
        zzei zzeiVar2 = this.zze;
        if (zzeiVar2 != null) {
            List listZzd = zzeiVar2.zzd();
            listZzd.getClass();
            int i = 0;
            if ((listZzd instanceof RandomAccess) && (listZzd instanceof List)) {
                List list = listZzd;
                int size = list.size();
                arrayList = new ArrayList((size / 20) + (size % 20 == 0 ? 0 : 1));
                for (int i2 = 0; i2 >= 0 && i2 < size; i2 += 20) {
                    int i3 = size - i2;
                    if (20 <= i3) {
                        i3 = 20;
                    }
                    ArrayList arrayList2 = new ArrayList(i3);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList2.add(list.get(i4 + i2));
                    }
                    arrayList.add(arrayList2);
                }
            } else {
                arrayList = new ArrayList();
                Iterator it2 = listZzd.iterator();
                it2.getClass();
                if (it2.hasNext()) {
                    qr1 qr1Var = new qr1(it2, null);
                    no1 no1Var = new no1();
                    no1Var.c = sr0.a(no1Var, no1Var, qr1Var);
                    it = no1Var;
                } else {
                    it = w50.a;
                }
                while (it.hasNext()) {
                    arrayList.add((List) it.next());
                }
            }
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj = arrayList.get(i);
                i++;
                zzrd zzrdVarZzi = zzrf.zzi();
                ArrayList arrayList3 = new ArrayList();
                for (zzej zzejVar : (List) obj) {
                    try {
                        zztx zztxVarZzk = zztx.zzk(zzkh.zzg().zzj(zzejVar.zzc()));
                        int iZzN = zztxVarZzk.zzN();
                        int i5 = iZzN - 1;
                        if (iZzN == 0) {
                            throw null;
                        }
                        if (i5 == 0) {
                            zzrdVarZzi.zzq(zztxVarZzk.zzf());
                        } else if (i5 == 1) {
                            zzrdVarZzi.zzr(zztxVarZzk.zzg());
                        } else {
                            if (i5 != 2) {
                                throw new e71();
                            }
                            Unit unit = Unit.a;
                        }
                        arrayList3.add(zzejVar);
                    } catch (Exception unused) {
                        zzei zzeiVar3 = this.zze;
                        if (zzeiVar3 != null) {
                            zzeiVar3.zzf(zzejVar);
                        }
                    }
                }
                if (zzrdVarZzi.zzf() + zzrdVarZzi.zze() != 0) {
                    if (this.zzc.zza(((zzrf) zzrdVarZzi.zzk()).zzd()) && (zzeiVar = this.zze) != null) {
                        zzeiVar.zza(arrayList3);
                    }
                }
            }
        }
    }

    private final void zzh() {
        if (zza == null) {
            Timer timer = new Timer();
            zza = timer;
            timer.schedule(new zzep(this), 120000L, 120000L);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzeo
    public final void zza(zztx zztxVar) {
        qt.o(this.zzd, new zzer(this, zztxVar, null));
        zzh();
    }
}
