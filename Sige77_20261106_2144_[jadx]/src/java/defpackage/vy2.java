package defpackage;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vy2 implements n50, an2 {
    public static final vy2 c;
    public static final vy2 d;
    public static final vy2 e;
    public static final vy2 f;
    public static final vy2 i;
    public final /* synthetic */ int a;
    public String b;

    static {
        int i2 = 0;
        c = new vy2("TINK", i2);
        d = new vy2("CRUNCHY", i2);
        e = new vy2("NO_PREFIX", i2);
        int i3 = 1;
        f = new vy2("TINK", i3);
        i = new vy2("NO_PREFIX", i3);
    }

    public /* synthetic */ vy2(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    @Override // defpackage.n50
    public boolean c(CharSequence charSequence, int i2, int i3, b22 b22Var) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), this.b)) {
            return true;
        }
        b22Var.c = (b22Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return this.b;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                return super.toString();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return "<" + this.b + '>';
        }
    }

    @Override // defpackage.an2
    public an2 zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.b = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e2) {
            Log.e("vy2", "Failed to parse error for string [" + str + "] with exception: " + e2.getMessage());
            throw new sk2(ts.k("Failed to parse error for string [", str, "]"), e2);
        }
    }

    public /* synthetic */ vy2() {
        this.a = 5;
    }

    @Override // defpackage.n50
    public Object a() {
        return this;
    }
}
