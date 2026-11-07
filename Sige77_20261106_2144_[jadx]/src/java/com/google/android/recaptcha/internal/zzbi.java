package com.google.android.recaptcha.internal;

import defpackage.av1;
import defpackage.ds;
import defpackage.e11;
import defpackage.et;
import defpackage.fz;
import defpackage.h80;
import defpackage.i20;
import defpackage.qt;
import defpackage.sz;
import defpackage.ta;
import java.util.concurrent.Executors;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzbi {
    private final et zza;
    private final et zzb;
    private final et zzc;
    private final et zzd;

    public zzbi() {
        av1 av1Var = new av1();
        sz szVar = i20.a;
        this.zza = new ds(e.c(av1Var, e11.a));
        ds dsVarA = ta.a(new h80(Executors.newSingleThreadExecutor()));
        qt.o(dsVarA, new zzbh(null));
        this.zzb = dsVarA;
        this.zzc = ta.a(fz.c);
        ds dsVarA2 = ta.a(new h80(Executors.newSingleThreadExecutor()));
        qt.o(dsVarA2, new zzbg(null));
        this.zzd = dsVarA2;
    }

    public final et zza() {
        return this.zzc;
    }

    public final et zzb() {
        return this.zza;
    }

    public final et zzc() {
        return this.zzd;
    }

    public final et zzd() {
        return this.zzb;
    }
}
