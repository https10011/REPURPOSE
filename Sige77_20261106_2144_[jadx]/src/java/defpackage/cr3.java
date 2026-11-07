package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cr3 {
    public static final cr3 b;
    public static final cr3 c;
    public static final cr3 d;
    public static final cr3 e;
    public static final cr3 f;
    public final gr3 a;

    static {
        int i = 23;
        b = new cr3(new qh1(i));
        c = new cr3(new gp1(i));
        new cr3(new j10(i));
        new cr3(new w40(i));
        d = new cr3(new mo1(i));
        e = new cr3(new k42(i));
        f = new cr3(new sh1(i));
    }

    public cr3(kr3 kr3Var) {
        if (f73.a()) {
            this.a = new u93(kr3Var, 4);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.a = new k93(kr3Var);
        } else {
            this.a = new bf3(kr3Var);
        }
    }
}
