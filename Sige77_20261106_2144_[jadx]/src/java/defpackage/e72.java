package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class e72 {
    public static final k72 a;
    public static final hl b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new l72();
        } else {
            a = new k72();
        }
        b = new hl(Float.class, "translationAlpha", 5);
        new hl(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.I(view, i, i2, i3, i4);
    }

    public static void b(View view, int i) {
        a.J(view, i);
    }
}
