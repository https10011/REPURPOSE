package com.hjq.toast;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
final class WindowHelper implements Application.ActivityLifecycleCallbacks {
    private final ToastHelper mToastHelper;
    private Activity mTopActivity;

    private WindowHelper(ToastHelper toastHelper) {
        this.mToastHelper = toastHelper;
    }

    public static WindowHelper register(ToastHelper toastHelper, Application application) {
        WindowHelper windowHelper = new WindowHelper(toastHelper);
        application.registerActivityLifecycleCallbacks(windowHelper);
        return windowHelper;
    }

    public Activity getTopActivity() {
        return this.mTopActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.mTopActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.mTopActivity == activity) {
            this.mTopActivity = null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (this.mToastHelper.isShow()) {
            this.mToastHelper.cancel();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        this.mTopActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        this.mTopActivity = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}
