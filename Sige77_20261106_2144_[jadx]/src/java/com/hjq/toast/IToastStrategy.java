package com.hjq.toast;

import android.app.Application;
import android.widget.Toast;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface IToastStrategy {
    public static final int LONG_DURATION_TIMEOUT = 3500;
    public static final int SHORT_DURATION_TIMEOUT = 2000;

    void bind(Toast toast);

    void cancel();

    Toast create(Application application);

    void show(CharSequence charSequence);
}
