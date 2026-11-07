package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gy {
    public static final gy a;
    public static final gy b;
    public static final gy c;
    public static final /* synthetic */ gy[] d;

    static {
        gy gyVar = new gy("PREFER_ARGB_8888", 0);
        a = gyVar;
        gy gyVar2 = new gy("PREFER_RGB_565", 1);
        b = gyVar2;
        d = new gy[]{gyVar, gyVar2};
        c = gyVar;
    }

    public static gy valueOf(String str) {
        return (gy) Enum.valueOf(gy.class, str);
    }

    public static gy[] values() {
        return (gy[]) d.clone();
    }
}
