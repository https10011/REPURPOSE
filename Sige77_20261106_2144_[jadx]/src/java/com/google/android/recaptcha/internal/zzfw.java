package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import defpackage.et;
import defpackage.qt;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class zzfw {
    private final WebView zza;
    private final et zzb;

    public zzfw(WebView webView, et etVar) {
        this.zza = webView;
        this.zzb = etVar;
    }

    public final void zzb(String str, String... strArr) {
        qt.o(this.zzb, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null));
    }
}
