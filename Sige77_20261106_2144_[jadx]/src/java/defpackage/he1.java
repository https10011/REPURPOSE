package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class he1 {
    public static final he1 a;
    public static final /* synthetic */ he1[] b;

    static {
        he1 he1Var = new he1("DEFAULT", 0);
        a = he1Var;
        he1 he1Var2 = new he1("UNMETERED_ONLY", 1);
        he1 he1Var3 = new he1("UNMETERED_OR_DAILY", 2);
        he1 he1Var4 = new he1("FAST_IF_RADIO_AWAKE", 3);
        he1 he1Var5 = new he1("NEVER", 4);
        he1 he1Var6 = new he1("UNRECOGNIZED", 5);
        b = new he1[]{he1Var, he1Var2, he1Var3, he1Var4, he1Var5, he1Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, he1Var);
        sparseArray.put(1, he1Var2);
        sparseArray.put(2, he1Var3);
        sparseArray.put(3, he1Var4);
        sparseArray.put(4, he1Var5);
        sparseArray.put(-1, he1Var6);
    }

    public static he1 valueOf(String str) {
        return (he1) Enum.valueOf(he1.class, str);
    }

    public static he1[] values() {
        return (he1[]) b.clone();
    }
}
