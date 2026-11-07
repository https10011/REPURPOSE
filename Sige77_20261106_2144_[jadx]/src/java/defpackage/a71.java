package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class a71 {
    public static final z61 a;
    public static final z61 b;

    static {
        td1 td1Var = td1.c;
        z61 z61Var = null;
        try {
            z61Var = (z61) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = z61Var;
        b = new z61();
    }
}
