package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class rb1 {
    public static final r6 a;
    public static final k42 b;
    public static final vi c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        int i = 4;
        if (property.equals("RoboVM")) {
            a = null;
            b = new k42(8);
            c = new vi(i);
        } else if (property.equals("Dalvik")) {
            a = new r6();
            b = new og1(0);
            c = new xi(i);
        } else {
            a = null;
            b = new og1(1);
            c = new xi(i);
        }
    }
}
