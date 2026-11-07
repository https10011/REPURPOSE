package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ct {
    public static final ct a;
    public static final ct b;
    public static final ct c;
    public static final ct d;
    public static final ct e;
    public static final /* synthetic */ ct[] f;

    static {
        ct ctVar = new ct("CPU_ACQUIRED", 0);
        a = ctVar;
        ct ctVar2 = new ct("BLOCKING", 1);
        b = ctVar2;
        ct ctVar3 = new ct("PARKING", 2);
        c = ctVar3;
        ct ctVar4 = new ct("DORMANT", 3);
        d = ctVar4;
        ct ctVar5 = new ct("TERMINATED", 4);
        e = ctVar5;
        f = new ct[]{ctVar, ctVar2, ctVar3, ctVar4, ctVar5};
    }

    public static ct valueOf(String str) {
        return (ct) Enum.valueOf(ct.class, str);
    }

    public static ct[] values() {
        return (ct[]) f.clone();
    }
}
