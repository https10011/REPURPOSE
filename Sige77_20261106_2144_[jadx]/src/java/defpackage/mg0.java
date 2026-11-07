package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mg0 {
    public static final mg0 a;
    public static final mg0 b;
    public static final mg0 c;
    public static final mg0 d;
    public static final mg0 e;
    public static final mg0 f;
    public static final mg0 i;
    public static final /* synthetic */ mg0[] v;

    static {
        mg0 mg0Var = new mg0("PENALTY_LOG", 0);
        a = mg0Var;
        mg0 mg0Var2 = new mg0("PENALTY_DEATH", 1);
        b = mg0Var2;
        mg0 mg0Var3 = new mg0("DETECT_FRAGMENT_REUSE", 2);
        c = mg0Var3;
        mg0 mg0Var4 = new mg0("DETECT_FRAGMENT_TAG_USAGE", 3);
        d = mg0Var4;
        mg0 mg0Var5 = new mg0("DETECT_WRONG_NESTED_HIERARCHY", 4);
        e = mg0Var5;
        mg0 mg0Var6 = new mg0("DETECT_RETAIN_INSTANCE_USAGE", 5);
        f = mg0Var6;
        mg0 mg0Var7 = new mg0("DETECT_SET_USER_VISIBLE_HINT", 6);
        mg0 mg0Var8 = new mg0("DETECT_TARGET_FRAGMENT_USAGE", 7);
        mg0 mg0Var9 = new mg0("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        i = mg0Var9;
        v = new mg0[]{mg0Var, mg0Var2, mg0Var3, mg0Var4, mg0Var5, mg0Var6, mg0Var7, mg0Var8, mg0Var9};
    }

    public static mg0 valueOf(String str) {
        return (mg0) Enum.valueOf(mg0.class, str);
    }

    public static mg0[] values() {
        return (mg0[]) v.clone();
    }
}
