package defpackage;

import java.io.ObjectStreamException;
import java.io.Serializable;
import org.json.JSONException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y9 implements Serializable {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public y9(String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    private final Object readResolve() throws ObjectStreamException, JSONException {
        return new z9(this.a, this.b, this.c, this.d);
    }
}
