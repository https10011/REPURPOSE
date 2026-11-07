package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ft {
    public static final ft a;
    public static final /* synthetic */ ft[] b;

    static {
        ft ftVar = new ft("COROUTINE_SUSPENDED", 0);
        a = ftVar;
        b = new ft[]{ftVar, new ft("UNDECIDED", 1), new ft("RESUMED", 2)};
    }

    public static ft valueOf(String str) {
        return (ft) Enum.valueOf(ft.class, str);
    }

    public static ft[] values() {
        return (ft[]) b.clone();
    }
}
