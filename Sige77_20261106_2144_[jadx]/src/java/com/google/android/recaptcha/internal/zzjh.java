package com.google.android.recaptcha.internal;

import defpackage.oc1;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zzjh zzb() {
        zzjh zzjhVar = new zzjh();
        zzjhVar.zze();
        return zzjhVar;
    }

    public static zzjh zzc() {
        return new zzjh();
    }

    private final long zzg() {
        return this.zza ? (System.nanoTime() - this.zzc) + this.zzb : this.zzb;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jZzg = zzg();
        long j = jZzg / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jZzg / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jZzg / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jZzg / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jZzg / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jZzg / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZzg / timeUnit2.convert(1L, timeUnit)));
        switch (zzjg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                str = "μs";
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                str = "ms";
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                str = "s";
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                str = "min";
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "h";
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return str2 + " " + str;
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzjh zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zzjh zze() {
        zzjf.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzjh zzf() {
        long jNanoTime = System.nanoTime();
        zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (jNanoTime - this.zzc) + this.zzb;
        return this;
    }
}
