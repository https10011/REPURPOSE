package com.hjq.toast;

import android.widget.Toast;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ToastInterceptor implements IToastInterceptor {
    @Override // com.hjq.toast.IToastInterceptor
    public boolean intercept(Toast toast, CharSequence charSequence) {
        return charSequence == null || BuildConfig.FLAVOR.equals(charSequence.toString());
    }
}
