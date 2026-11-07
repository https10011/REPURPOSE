package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzfz {
    private final zzjj zza;

    public zzfz(int i) {
        this.zza = zzjj.zza(i);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return CollectionsKt.B(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zzfz() {
        this(1);
    }
}
