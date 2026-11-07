package com.google.android.recaptcha.internal;

import defpackage.ko;
import defpackage.oc1;
import defpackage.tv2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzge {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(ko.h(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzue) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzue zzueVar) throws zzce {
        int iZzS = zzueVar.zzS();
        int i = iZzS - 1;
        if (iZzS == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zza.get(Integer.valueOf(zzueVar.zzi()));
            case 1:
                return Boolean.valueOf(zzueVar.zzQ());
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArrZzl = zzueVar.zzM().zzl();
                if (bArrZzl.length == 1) {
                    return Byte.valueOf(bArrZzl[0]);
                }
                tv2.c(4, 6, null);
                return null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                String strZzO = zzueVar.zzO();
                if (strZzO.length() == 1) {
                    return Character.valueOf(strZzO.charAt(0));
                }
                tv2.c(4, 6, null);
                return null;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                int iZzj = zzueVar.zzj();
                if (iZzj >= -32768 && iZzj <= 32767) {
                    return Short.valueOf((short) iZzj);
                }
                tv2.c(4, 6, null);
                return null;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(zzueVar.zzk());
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                tv2.c(4, 6, null);
                return null;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return Long.valueOf(zzueVar.zzl());
            case 9:
                return Float.valueOf(zzueVar.zzg());
            case 10:
                return Double.valueOf(zzueVar.zzf());
            case 11:
                return zzueVar.zzP();
            default:
                tv2.c(4, 5, null);
            case 12:
                return null;
        }
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i, Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(ko.h(listZzh));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzgc.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
