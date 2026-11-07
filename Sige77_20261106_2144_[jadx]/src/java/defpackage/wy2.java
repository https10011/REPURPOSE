package defpackage;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wy2 implements zm2 {
    public static final wy2 W;
    public static final wy2 X;
    public static final wy2 Y;
    public static final wy2 Z;
    public static final Object a0 = new Object();
    public static volatile lh1 b0;
    public static final wy2 c;
    public static final wy2 d;
    public static final wy2 e;
    public static final wy2 f;
    public static final wy2 i;
    public static final wy2 v;
    public static final wy2 w;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new wy2("SHA1", i2);
        d = new wy2("SHA224", i2);
        e = new wy2("SHA256", i2);
        f = new wy2("SHA384", i2);
        i = new wy2("SHA512", i2);
        int i3 = 1;
        v = new wy2("ASSUME_AES_GCM", i3);
        w = new wy2("ASSUME_XCHACHA20POLY1305", i3);
        W = new wy2("ASSUME_CHACHA20POLY1305", i3);
        X = new wy2("ASSUME_AES_CTR_HMAC", i3);
        Y = new wy2("ASSUME_AES_EAX", i3);
        Z = new wy2("ASSUME_AES_GCM_SIV", i3);
    }

    public wy2(Context context, rf3 rf3Var) {
        this.a = 2;
        this.b = rf3Var.u() ? s93.b(context, rf3Var.t()) : rf3Var.t();
    }

    public String toString() {
        int i2 = this.a;
        String str = this.b;
        switch (i2) {
            case 0:
            case 1:
                return str;
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zm2
    public String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grantType", "refresh_token");
        jSONObject.put("refreshToken", this.b);
        return jSONObject.toString();
    }

    public /* synthetic */ wy2(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public wy2(String str) {
        this.a = 3;
        gu2.l(str);
        this.b = str;
    }
}
