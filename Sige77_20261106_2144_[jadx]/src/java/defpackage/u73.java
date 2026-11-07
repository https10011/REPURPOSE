package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdb;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u73 {
    public final Context a;
    public final Boolean b;
    public final long c;
    public final zzdb d;
    public final boolean e;
    public final Long f;
    public final Long g;
    public final String h;

    public u73(Context context, zzdb zzdbVar, Long l, Long l2) {
        this.e = true;
        gu2.o(context);
        Context applicationContext = context.getApplicationContext();
        gu2.o(applicationContext);
        this.a = applicationContext;
        this.f = l;
        this.g = l2;
        if (zzdbVar != null) {
            this.d = zzdbVar;
            this.e = zzdbVar.c;
            this.c = zzdbVar.b;
            this.h = zzdbVar.e;
            Bundle bundle = zzdbVar.d;
            if (bundle != null) {
                this.b = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
