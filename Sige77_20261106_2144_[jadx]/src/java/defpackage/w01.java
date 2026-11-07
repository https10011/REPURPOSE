package defpackage;

import android.app.NotificationChannel;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract /* synthetic */ class w01 {
    public static /* synthetic */ NotificationChannel b(String str) {
        return new NotificationChannel(str, "Push Notifications", 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager e(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class f() {
        return AutofillManager.class;
    }
}
