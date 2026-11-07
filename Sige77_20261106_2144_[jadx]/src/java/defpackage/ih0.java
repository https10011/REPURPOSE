package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ih0 {
    public static final /* synthetic */ ih0[] a = {new ih0("SEND", 0), new ih0("ASKFOR", 1), new ih0("TURN", 2), new ih0("INVITE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ih0 EF5;

    public static ih0 valueOf(String str) {
        return (ih0) Enum.valueOf(ih0.class, str);
    }

    public static ih0[] values() {
        return (ih0[]) a.clone();
    }
}
