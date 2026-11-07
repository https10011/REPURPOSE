package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pv1 {
    public static final pv1 a;
    public static final pv1 b;
    public static final pv1 c;
    public static final /* synthetic */ pv1[] d;

    static {
        pv1 pv1Var = new pv1("FORCE_NONE", 0);
        a = pv1Var;
        pv1 pv1Var2 = new pv1("FORCE_SQUARE", 1);
        b = pv1Var2;
        pv1 pv1Var3 = new pv1("FORCE_RECTANGLE", 2);
        c = pv1Var3;
        d = new pv1[]{pv1Var, pv1Var2, pv1Var3};
    }

    public static pv1 valueOf(String str) {
        return (pv1) Enum.valueOf(pv1.class, str);
    }

    public static pv1[] values() {
        return (pv1[]) d.clone();
    }
}
