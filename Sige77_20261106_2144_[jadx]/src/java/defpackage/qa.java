package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qa {
    public static final qa a;
    public static final qa b;
    public static final /* synthetic */ qa[] c;

    static {
        qa qaVar = new qa("MOBILE_INSTALL_EVENT", 0);
        a = qaVar;
        qa qaVar2 = new qa("CUSTOM_APP_EVENTS", 1);
        b = qaVar2;
        c = new qa[]{qaVar, qaVar2};
    }

    public static qa valueOf(String str) {
        return (qa) Enum.valueOf(qa.class, str);
    }

    public static qa[] values() {
        return (qa[]) c.clone();
    }
}
