package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t91 {
    public static final /* synthetic */ t91[] a = {new t91("ALIVE", 0), new t91("DELETED", 1), new t91("SUSPENDED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    t91 EF5;

    public static t91 valueOf(String str) {
        return (t91) Enum.valueOf(t91.class, str);
    }

    public static t91[] values() {
        return (t91[]) a.clone();
    }
}
