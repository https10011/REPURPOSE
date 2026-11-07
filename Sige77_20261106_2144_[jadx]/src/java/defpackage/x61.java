package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x61 {
    public static final SparseArray a;
    public static final /* synthetic */ x61[] b;

    /* JADX INFO: Fake field, exist only in values array */
    x61 EF1;

    static {
        x61 x61Var = new x61("MOBILE", 0);
        x61 x61Var2 = new x61("WIFI", 1);
        x61 x61Var3 = new x61("MOBILE_MMS", 2);
        x61 x61Var4 = new x61("MOBILE_SUPL", 3);
        x61 x61Var5 = new x61("MOBILE_DUN", 4);
        x61 x61Var6 = new x61("MOBILE_HIPRI", 5);
        x61 x61Var7 = new x61("WIMAX", 6);
        x61 x61Var8 = new x61("BLUETOOTH", 7);
        x61 x61Var9 = new x61("DUMMY", 8);
        x61 x61Var10 = new x61("ETHERNET", 9);
        x61 x61Var11 = new x61("MOBILE_FOTA", 10);
        x61 x61Var12 = new x61("MOBILE_IMS", 11);
        x61 x61Var13 = new x61("MOBILE_CBS", 12);
        x61 x61Var14 = new x61("WIFI_P2P", 13);
        x61 x61Var15 = new x61("MOBILE_IA", 14);
        x61 x61Var16 = new x61("MOBILE_EMERGENCY", 15);
        x61 x61Var17 = new x61("PROXY", 16);
        x61 x61Var18 = new x61("VPN", 17);
        x61 x61Var19 = new x61("NONE", 18);
        b = new x61[]{x61Var, x61Var2, x61Var3, x61Var4, x61Var5, x61Var6, x61Var7, x61Var8, x61Var9, x61Var10, x61Var11, x61Var12, x61Var13, x61Var14, x61Var15, x61Var16, x61Var17, x61Var18, x61Var19};
        SparseArray sparseArray = new SparseArray();
        a = sparseArray;
        sparseArray.put(0, x61Var);
        sparseArray.put(1, x61Var2);
        sparseArray.put(2, x61Var3);
        sparseArray.put(3, x61Var4);
        sparseArray.put(4, x61Var5);
        sparseArray.put(5, x61Var6);
        sparseArray.put(6, x61Var7);
        sparseArray.put(7, x61Var8);
        sparseArray.put(8, x61Var9);
        sparseArray.put(9, x61Var10);
        sparseArray.put(10, x61Var11);
        sparseArray.put(11, x61Var12);
        sparseArray.put(12, x61Var13);
        sparseArray.put(13, x61Var14);
        sparseArray.put(14, x61Var15);
        sparseArray.put(15, x61Var16);
        sparseArray.put(16, x61Var17);
        sparseArray.put(17, x61Var18);
        sparseArray.put(-1, x61Var19);
    }

    public static x61 valueOf(String str) {
        return (x61) Enum.valueOf(x61.class, str);
    }

    public static x61[] values() {
        return (x61[]) b.clone();
    }
}
