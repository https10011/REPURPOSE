package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ki {
    public static final ki a;
    public static final ki b;
    public static final ki c;
    public static final /* synthetic */ ki[] d;

    static {
        ki kiVar = new ki("SUSPEND", 0);
        a = kiVar;
        ki kiVar2 = new ki("DROP_OLDEST", 1);
        b = kiVar2;
        ki kiVar3 = new ki("DROP_LATEST", 2);
        c = kiVar3;
        d = new ki[]{kiVar, kiVar2, kiVar3};
    }

    public static ki valueOf(String str) {
        return (ki) Enum.valueOf(ki.class, str);
    }

    public static ki[] values() {
        return (ki[]) d.clone();
    }
}
