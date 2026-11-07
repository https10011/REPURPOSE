package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yl1 {
    public static final yl1 a;
    public static final yl1 b;
    public static final yl1 c;
    public static final /* synthetic */ yl1[] d;

    static {
        yl1 yl1Var = new yl1("NETWORK_UNMETERED", 0);
        a = yl1Var;
        yl1 yl1Var2 = new yl1("DEVICE_IDLE", 1);
        b = yl1Var2;
        yl1 yl1Var3 = new yl1("DEVICE_CHARGING", 2);
        c = yl1Var3;
        d = new yl1[]{yl1Var, yl1Var2, yl1Var3};
    }

    public static yl1 valueOf(String str) {
        return (yl1) Enum.valueOf(yl1.class, str);
    }

    public static yl1[] values() {
        return (yl1[]) d.clone();
    }
}
