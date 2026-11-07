package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w61 {
    public static final SparseArray a;
    public static final /* synthetic */ w61[] b;

    /* JADX INFO: Fake field, exist only in values array */
    w61 EF1;

    static {
        w61 w61Var = new w61("UNKNOWN_MOBILE_SUBTYPE", 0);
        w61 w61Var2 = new w61("GPRS", 1);
        w61 w61Var3 = new w61("EDGE", 2);
        w61 w61Var4 = new w61("UMTS", 3);
        w61 w61Var5 = new w61("CDMA", 4);
        w61 w61Var6 = new w61("EVDO_0", 5);
        w61 w61Var7 = new w61("EVDO_A", 6);
        w61 w61Var8 = new w61("RTT", 7);
        w61 w61Var9 = new w61("HSDPA", 8);
        w61 w61Var10 = new w61("HSUPA", 9);
        w61 w61Var11 = new w61("HSPA", 10);
        w61 w61Var12 = new w61("IDEN", 11);
        w61 w61Var13 = new w61("EVDO_B", 12);
        w61 w61Var14 = new w61("LTE", 13);
        w61 w61Var15 = new w61("EHRPD", 14);
        w61 w61Var16 = new w61("HSPAP", 15);
        w61 w61Var17 = new w61("GSM", 16);
        w61 w61Var18 = new w61("TD_SCDMA", 17);
        w61 w61Var19 = new w61("IWLAN", 18);
        w61 w61Var20 = new w61("LTE_CA", 19);
        b = new w61[]{w61Var, w61Var2, w61Var3, w61Var4, w61Var5, w61Var6, w61Var7, w61Var8, w61Var9, w61Var10, w61Var11, w61Var12, w61Var13, w61Var14, w61Var15, w61Var16, w61Var17, w61Var18, w61Var19, w61Var20, new w61("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, w61Var);
        sparseArray.put(1, w61Var2);
        sparseArray.put(2, w61Var3);
        sparseArray.put(3, w61Var4);
        sparseArray.put(4, w61Var5);
        sparseArray.put(5, w61Var6);
        sparseArray.put(6, w61Var7);
        sparseArray.put(7, w61Var8);
        sparseArray.put(8, w61Var9);
        sparseArray.put(9, w61Var10);
        sparseArray.put(10, w61Var11);
        sparseArray.put(11, w61Var12);
        sparseArray.put(12, w61Var13);
        sparseArray.put(13, w61Var14);
        sparseArray.put(14, w61Var15);
        sparseArray.put(15, w61Var16);
        sparseArray.put(16, w61Var17);
        sparseArray.put(17, w61Var18);
        sparseArray.put(18, w61Var19);
        sparseArray.put(19, w61Var20);
    }

    public static w61 valueOf(String str) {
        return (w61) Enum.valueOf(w61.class, str);
    }

    public static w61[] values() {
        return (w61[]) b.clone();
    }
}
