package defpackage;

import com.fm.openinstall.model.Error;
import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class de2 {
    public String a;
    public final Error b;

    public de2(int i, String str) {
        this.b = new Error(i, str);
    }

    public static de2 a(ce2 ce2Var) {
        if (ce2Var instanceof vd2) {
            vd2 vd2Var = (vd2) ce2Var;
            return vd2Var.a == 0 ? b(vd2Var.b) : ck1.b(5, vd2Var.c);
        }
        if (ce2Var instanceof ae2) {
            return ck1.b(4, ((ae2) ce2Var).a.getMessage());
        }
        return ce2Var instanceof be2 ? ck1.b(3, ((be2) ce2Var).a) : b(BuildConfig.FLAVOR);
    }

    public static de2 b(String str) {
        de2 de2Var = new de2();
        de2Var.a = str;
        return de2Var;
    }
}
