package com.google.android.recaptcha.internal;

import com.appsflyer.internal.d;
import defpackage.ap;
import defpackage.y00;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strY = StringsKt.y(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strY2 = StringsKt.y(10, String.valueOf(this.zzc));
        return y00.l(d.b("avgExecutionTime: ", strY, " us| maxExecutionTime: ", strY2, " us| totalTime: "), StringsKt.y(10, String.valueOf(this.zzb)), " us| #Usages: ", StringsKt.y(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbj zzbjVar) {
        return ap.a(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
