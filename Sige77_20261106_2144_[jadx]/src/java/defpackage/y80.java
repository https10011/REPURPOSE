package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class y80 {
    public static final x80 a = new x80();
    public static final x80 b;

    static {
        td1 td1Var = td1.c;
        x80 x80Var = null;
        try {
            x80Var = (x80) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = x80Var;
    }
}
