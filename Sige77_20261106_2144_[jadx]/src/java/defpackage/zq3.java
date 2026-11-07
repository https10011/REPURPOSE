package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zq3 {
    public static final zq3 a;
    public static final zq3 b;
    public static final zq3 c;
    public static final /* synthetic */ zq3[] d;

    static {
        zq3 zq3Var = new zq3("UNCOMPRESSED", 0);
        a = zq3Var;
        zq3 zq3Var2 = new zq3("COMPRESSED", 1);
        b = zq3Var2;
        zq3 zq3Var3 = new zq3("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        c = zq3Var3;
        d = new zq3[]{zq3Var, zq3Var2, zq3Var3};
    }

    public static zq3[] values() {
        return (zq3[]) d.clone();
    }
}
