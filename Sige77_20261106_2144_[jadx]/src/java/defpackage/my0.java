package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class my0 {
    public static final ly0 a;
    public static final ly0 b;

    static {
        td1 td1Var = td1.c;
        ly0 ly0Var = null;
        try {
            ly0Var = (ly0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ly0Var;
        b = new ly0();
    }
}
