package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kw0 {
    private static final /* synthetic */ kw0[] $VALUES;
    public static final iw0 Companion;
    public static final kw0 ON_ANY;
    public static final kw0 ON_CREATE;
    public static final kw0 ON_DESTROY;
    public static final kw0 ON_PAUSE;
    public static final kw0 ON_RESUME;
    public static final kw0 ON_START;
    public static final kw0 ON_STOP;

    static {
        kw0 kw0Var = new kw0("ON_CREATE", 0);
        ON_CREATE = kw0Var;
        kw0 kw0Var2 = new kw0("ON_START", 1);
        ON_START = kw0Var2;
        kw0 kw0Var3 = new kw0("ON_RESUME", 2);
        ON_RESUME = kw0Var3;
        kw0 kw0Var4 = new kw0("ON_PAUSE", 3);
        ON_PAUSE = kw0Var4;
        kw0 kw0Var5 = new kw0("ON_STOP", 4);
        ON_STOP = kw0Var5;
        kw0 kw0Var6 = new kw0("ON_DESTROY", 5);
        ON_DESTROY = kw0Var6;
        kw0 kw0Var7 = new kw0("ON_ANY", 6);
        ON_ANY = kw0Var7;
        $VALUES = new kw0[]{kw0Var, kw0Var2, kw0Var3, kw0Var4, kw0Var5, kw0Var6, kw0Var7};
        Companion = new iw0();
    }

    public static kw0 valueOf(String str) {
        return (kw0) Enum.valueOf(kw0.class, str);
    }

    public static kw0[] values() {
        return (kw0[]) $VALUES.clone();
    }

    public final lw0 a() {
        switch (jw0.a[ordinal()]) {
            case 1:
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return lw0.c;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return lw0.d;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return lw0.e;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return lw0.a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
