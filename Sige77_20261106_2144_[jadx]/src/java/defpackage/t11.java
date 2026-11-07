package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class t11 {
    public static final s11 a;
    public static final s11 b;

    static {
        td1 td1Var = td1.c;
        s11 s11Var = null;
        try {
            s11Var = (s11) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = s11Var;
        b = new s11();
    }
}
