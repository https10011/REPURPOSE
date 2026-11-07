package com.hjq.toast.style;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class ToastQQStyle extends BaseToastStyle {
    public ToastQQStyle(Context context) {
        super(context);
    }

    @Override // com.hjq.toast.IToastStyle
    public int getBackgroundColor() {
        return -13421773;
    }

    @Override // com.hjq.toast.IToastStyle
    public int getCornerRadius() {
        return dp2px(4.0f);
    }

    @Override // com.hjq.toast.IToastStyle
    public int getPaddingStart() {
        return dp2px(16.0f);
    }

    @Override // com.hjq.toast.IToastStyle
    public int getPaddingTop() {
        return dp2px(14.0f);
    }

    @Override // com.hjq.toast.IToastStyle
    public int getTextColor() {
        return -1842205;
    }

    @Override // com.hjq.toast.IToastStyle
    public float getTextSize() {
        return sp2px(12.0f);
    }

    @Override // com.hjq.toast.style.BaseToastStyle, com.hjq.toast.IToastStyle
    public int getZ() {
        return 0;
    }
}
