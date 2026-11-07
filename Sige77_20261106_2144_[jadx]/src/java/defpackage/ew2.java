package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ew2 {
    public static final gh1 a;
    public static final gh1 b;
    public static final gh1 c;

    static {
        int i = wo0.c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        wo0.i(15, objArr);
        no0 no0Var = ro0.b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        ga.e(7, objArr2);
        a = ro0.h(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        ga.e(3, objArr3);
        b = ro0.h(3, objArr3);
        Object[] objArr4 = {"_r", "_dbg"};
        ga.e(2, objArr4);
        c = ro0.h(2, objArr4);
        mo0 mo0Var = new mo0(4);
        mo0Var.b(r93.i);
        mo0Var.b(r93.j);
        mo0Var.e();
        Object[] objArr5 = {"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"};
        ga.e(2, objArr5);
        ro0.h(2, objArr5);
    }
}
