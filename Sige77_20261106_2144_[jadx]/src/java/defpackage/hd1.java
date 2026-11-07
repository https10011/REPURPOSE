package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class hd1 {
    public static void a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new b7(runnable, 1));
    }
}
