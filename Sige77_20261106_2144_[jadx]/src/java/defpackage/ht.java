package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ht {
    public static final ht a;
    public static final ht b;
    public static final /* synthetic */ ht[] c;

    static {
        ht htVar = new ht("DEFAULT", 0);
        a = htVar;
        ht htVar2 = new ht("LAZY", 1);
        ht htVar3 = new ht("ATOMIC", 2);
        b = htVar3;
        c = new ht[]{htVar, htVar2, htVar3, new ht("UNDISPATCHED", 3)};
    }

    public static ht valueOf(String str) {
        return (ht) Enum.valueOf(ht.class, str);
    }

    public static ht[] values() {
        return (ht[]) c.clone();
    }
}
