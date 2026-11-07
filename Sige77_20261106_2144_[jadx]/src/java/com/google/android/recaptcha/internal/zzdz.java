package com.google.android.recaptcha.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final /* synthetic */ class zzdz extends FunctionReferenceImpl implements Function1 {
    public zzdz(Object obj) {
        super(1, obj, zzec.class, "isRetriable", "isRetriable(Ljava/lang/Exception;)Z", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(zzec.zzo((Exception) obj));
    }
}
