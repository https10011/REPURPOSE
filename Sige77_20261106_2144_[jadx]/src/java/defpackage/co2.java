package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class co2 {
    public static final mb a = new mb(0);
    public static final mb b = new mb(0);

    public static void a(String str) {
        mb mbVar = a;
        synchronized (mbVar) {
            if (mbVar.get(str) != null) {
                throw new ClassCastException();
            }
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String b(String str) {
        mb mbVar = a;
        synchronized (mbVar) {
            if (mbVar.get(str) != null) {
                throw new ClassCastException();
            }
        }
        return "https://".concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }
}
