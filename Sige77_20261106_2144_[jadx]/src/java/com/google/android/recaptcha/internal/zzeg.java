package com.google.android.recaptcha.internal;

import com.hjq.toast.BuildConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzeg {
    public /* synthetic */ zzeg(DefaultConstructorMarker defaultConstructorMarker) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int zzc(String str) {
        String strG = d.g("18.6.1", ".", BuildConfig.FLAVOR);
        int iV = StringsKt.v(strG, "-", 0, 6);
        if (iV != -1) {
            strG = strG.substring(0, iV);
        }
        return Integer.parseInt(strG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(StringsKt.D("18.6.1", "-", BuildConfig.FLAVOR));
    }

    private zzeg() {
        throw null;
    }
}
