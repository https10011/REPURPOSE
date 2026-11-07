package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jh0 {
    public static final /* synthetic */ jh0[] a = {new jh0("APP_USERS", 0), new jh0("APP_NON_USERS", 1), new jh0("EVERYBODY", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    jh0 EF5;

    public static jh0 valueOf(String str) {
        return (jh0) Enum.valueOf(jh0.class, str);
    }

    public static jh0[] values() {
        return (jh0[]) a.clone();
    }
}
