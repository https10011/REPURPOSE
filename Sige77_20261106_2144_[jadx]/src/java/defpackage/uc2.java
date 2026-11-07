package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.DelayQueue;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uc2 {
    public final boolean a;
    public final ClipboardManager b;
    public final DelayQueue c = new DelayQueue();
    public WeakReference d = null;
    public int e = 0;

    public uc2(Context context) {
        boolean z;
        ue2 ue2Var = ue2.j;
        if (((Boolean) ue2Var.g) == null) {
            Object objA = r93.a(ue2Var.a, "com.openinstall.PB_SIGNAL");
            if (objA != null) {
                try {
                    z = Boolean.parseBoolean(String.valueOf(objA));
                } catch (Exception unused) {
                    z = true;
                }
            } else {
                z = true;
            }
            ue2Var.g = Boolean.valueOf(z);
        }
        this.a = ((Boolean) ue2Var.g).booleanValue();
        try {
            this.b = (ClipboardManager) context.getSystemService("clipboard");
        } catch (Throwable unused2) {
        }
    }

    public final ClipData a() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = this.b;
        ClipData primaryClip = null;
        try {
            primaryClipDescription = clipboardManager.getPrimaryClipDescription();
        } catch (Throwable unused) {
            primaryClipDescription = null;
        }
        if (primaryClipDescription == null) {
            return b();
        }
        if (!primaryClipDescription.hasMimeType("text/html") && !primaryClipDescription.hasMimeType("text/plain")) {
            return ClipData.newPlainText("custom", "don't match");
        }
        try {
            primaryClip = clipboardManager.getPrimaryClip();
        } catch (Throwable unused2) {
        }
        return primaryClip == null ? b() : primaryClip;
    }

    public final ClipData b() {
        Activity activity;
        WeakReference weakReference = this.d;
        if (!((weakReference == null || (activity = (Activity) weakReference.get()) == null) ? false : activity.hasWindowFocus())) {
            return null;
        }
        int i = this.e + 1;
        this.e = i;
        if (i < 3) {
            return null;
        }
        this.e = 0;
        return ClipData.newPlainText("custom", "app focus");
    }
}
