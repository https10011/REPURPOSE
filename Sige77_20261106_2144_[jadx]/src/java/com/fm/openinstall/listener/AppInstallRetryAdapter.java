package com.fm.openinstall.listener;

import com.fm.openinstall.model.AppData;
import com.fm.openinstall.model.Error;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class AppInstallRetryAdapter implements AppInstallListener {
    public abstract void onInstall(AppData appData, boolean z);

    @Override // com.fm.openinstall.listener.AppInstallListener
    public void onInstallFinish(AppData appData, Error error) {
        if (appData == null) {
            appData = new AppData();
        }
        onInstall(appData, error != null && error.shouldRetry());
    }
}
