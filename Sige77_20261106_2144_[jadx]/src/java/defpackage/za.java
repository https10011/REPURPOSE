package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class za {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static Insets b(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void c(Resources.Theme theme) {
        theme.rebase();
    }

    public static void d(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void e(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void f(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
