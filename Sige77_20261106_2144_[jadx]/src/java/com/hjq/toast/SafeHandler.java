package com.hjq.toast;

import android.os.Handler;
import android.os.Message;
import android.view.WindowManager;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class SafeHandler extends Handler {
    private Handler mHandler;

    public SafeHandler(Handler handler) {
        this.mHandler = handler;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            this.mHandler.handleMessage(message);
        } catch (WindowManager.BadTokenException | IllegalStateException unused) {
        }
    }
}
