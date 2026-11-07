package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nh0 {
    public static final a81 a;

    static {
        z71 z71Var = new z71();
        z71Var.a = null;
        z71Var.b = true;
        z71Var.c = true;
        z71Var.d = true;
        char[] cArr = a81.b;
        for (int i = 0; i < 12; i++) {
            if (!Character.isWhitespace("gateway_core".charAt(i))) {
                z71Var.a = "gateway_core";
                z71Var.b = false;
                z71Var.c = false;
                z71Var.d = false;
                a = new a81(z71Var);
            }
        }
        z71Var.a = BuildConfig.FLAVOR;
        z71Var.b = true;
        z71Var.c = false;
        z71Var.d = false;
        a = new a81(z71Var);
    }
}
