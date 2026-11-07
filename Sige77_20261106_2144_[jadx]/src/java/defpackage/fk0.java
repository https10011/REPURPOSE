package defpackage;

import android.content.Context;
import android.os.Bundle;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fk0 {
    public static final boolean b;
    public final ox1 a;

    static {
        df1.a.getClass();
        b = df1.b.d().nextDouble() <= 1.0E-4d;
    }

    public fk0(Context context) {
        context.getClass();
        this.a = new ox1(context);
    }

    public final void a(String str, Bundle bundle) {
        if (b && StringsKt.t(str, "gps")) {
            this.a.q(str, bundle);
        }
    }
}
