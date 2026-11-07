package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sq0 {
    public static final sq0 a;
    public static final sq0 b;
    public static final sq0 c;
    public static final sq0 d;
    public static final sq0 e;
    public static final sq0 f;
    public static final /* synthetic */ sq0[] i;

    static {
        sq0 sq0Var = new sq0("Unknown", 0);
        a = sq0Var;
        sq0 sq0Var2 = new sq0("Analysis", 1);
        b = sq0Var2;
        sq0 sq0Var3 = new sq0("AnrReport", 2);
        c = sq0Var3;
        sq0 sq0Var4 = new sq0("CrashReport", 3);
        d = sq0Var4;
        sq0 sq0Var5 = new sq0("CrashShield", 4);
        e = sq0Var5;
        sq0 sq0Var6 = new sq0("ThreadCheck", 5);
        f = sq0Var6;
        i = new sq0[]{sq0Var, sq0Var2, sq0Var3, sq0Var4, sq0Var5, sq0Var6};
    }

    public static sq0 valueOf(String str) {
        return (sq0) Enum.valueOf(sq0.class, str);
    }

    public static sq0[] values() {
        return (sq0[]) i.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 1) {
            return "Analysis";
        }
        if (iOrdinal == 2) {
            return "AnrReport";
        }
        if (iOrdinal == 3) {
            return "CrashReport";
        }
        if (iOrdinal != 4) {
            return iOrdinal != 5 ? "Unknown" : "ThreadCheck";
        }
        return "CrashShield";
    }
}
