package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i5 {
    public static i5 b;
    public final Object a;

    public i5() {
        this.a = new Object();
        new Handler(Looper.getMainLooper(), new qi0(this, 1));
    }

    public i5(Serializable serializable) {
        this.a = serializable;
    }
}
