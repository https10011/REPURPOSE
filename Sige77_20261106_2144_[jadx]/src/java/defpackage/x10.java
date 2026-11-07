package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x10 {
    public static final x10 b = new x10(0);
    public static final x10 c = new x10(1);
    public static final x10 d = new x10(2);
    public final /* synthetic */ int a;

    public /* synthetic */ x10(int i) {
        this.a = i;
    }

    public final boolean a(int i) {
        switch (this.a) {
            case 0:
                return false;
            case 1:
                return (i == 3 || i == 5) ? false : true;
            default:
                return i == 2;
        }
    }
}
