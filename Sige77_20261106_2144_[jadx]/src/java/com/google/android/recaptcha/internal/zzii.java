package com.google.android.recaptcha.internal;

import android.content.Context;
import defpackage.tv2;
import defpackage.w11;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzii implements zzih {
    private final Context zza;
    private final Map zzb = w11.d(new Pair(2, Context.ACTIVITY_SERVICE), new Pair(3, Context.TELEPHONY_SERVICE), new Pair(4, Context.INPUT_METHOD_SERVICE), new Pair(5, Context.AUDIO_SERVICE));

    public zzii(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final Object zza(Object... objArr) throws zzce {
        Object obj = objArr[0];
        if (true != (obj instanceof Integer)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num == null) {
            tv2.c(4, 5, null);
            return null;
        }
        Object obj2 = this.zzb.get(Integer.valueOf(num.intValue()));
        if (obj2 != null) {
            return this.zza.getSystemService((String) obj2);
        }
        throw new zzce(4, 4, null);
    }
}
