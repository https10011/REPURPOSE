package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ox0 {
    public static final /* synthetic */ ox0[] a = {new ox0("normal", 0), new ox0("aggressive", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ox0 EF5;

    public static ox0 valueOf(String str) {
        return (ox0) Enum.valueOf(ox0.class, str);
    }

    public static ox0[] values() {
        return (ox0[]) a.clone();
    }
}
