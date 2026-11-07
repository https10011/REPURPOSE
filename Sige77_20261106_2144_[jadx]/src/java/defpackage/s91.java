package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class s91 {
    public static final /* synthetic */ s91[] a = {new s91("NONE", 0), new s91("APPROVAL", 1), new s91("CODE", 2), new s91("UNDEFINED", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    s91 EF5;

    public static s91 valueOf(String str) {
        return (s91) Enum.valueOf(s91.class, str);
    }

    public static s91[] values() {
        return (s91[]) a.clone();
    }
}
