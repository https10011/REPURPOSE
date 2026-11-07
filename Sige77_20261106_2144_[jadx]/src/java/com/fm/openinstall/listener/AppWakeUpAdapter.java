package com.fm.openinstall.listener;

import com.fm.openinstall.model.AppData;
import com.fm.openinstall.model.Error;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class AppWakeUpAdapter implements AppWakeUpListener {
    public abstract void onWakeUp(AppData appData);

    @Override // com.fm.openinstall.listener.AppWakeUpListener
    public void onWakeUpFinish(AppData appData, Error error) {
        if (error != null || appData == null || appData.isEmpty()) {
            return;
        }
        onWakeUp(appData);
    }
}
