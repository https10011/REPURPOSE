package com.google.android.recaptcha.internal;

import defpackage.sm0;
import defpackage.wb;
import defpackage.x50;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzhy {
    private List zza = x50.a;

    public final long zza(long[] jArr) {
        Iterator it = CollectionsKt.v(this.zza, wb.n(jArr)).iterator();
        if (!it.hasNext()) {
            sm0.h("Empty collection can't be reduced.");
            return 0L;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = wb.n(jArr);
    }
}
