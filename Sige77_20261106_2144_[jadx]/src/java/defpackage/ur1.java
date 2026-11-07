package defpackage;

import java.util.EnumSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public enum ur1 {
    /* JADX INFO: Fake field, exist only in values array */
    None(0),
    Enabled(1),
    RequireConfirm(2);

    public static final EnumSet b;
    public final long a;

    static {
        EnumSet enumSetAllOf = EnumSet.allOf(ur1.class);
        enumSetAllOf.getClass();
        b = enumSetAllOf;
    }

    ur1(int i) {
        this.a = j;
    }
}
