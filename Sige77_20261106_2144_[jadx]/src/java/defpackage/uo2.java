package defpackage;

import com.hjq.toast.BuildConfig;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class uo2 {
    public static final vd3 a;
    public static volatile String b;
    public static final k93 c;

    static {
        to2 to2Var = to2.b;
        int i = wo0.c;
        he3 he3Var = new he3(to2Var, true, mh1.W);
        bk0 bk0Var = new bk0();
        bk0Var.b = he3Var;
        c = new k93(bk0Var);
        a = new vd3("__phenotype_server_token", bk0Var, BuildConfig.FLAVOR);
        b = null;
    }

    public static String a() {
        return (String) a.get();
    }
}
