package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qv2 implements zm2 {
    public static final qv2 c;
    public static final qv2 d;
    public static final qv2 e;
    public static final qv2 f;
    public static final qv2 i;
    public static final qv2 v;
    public final /* synthetic */ int a;
    public final String b;

    static {
        int i2 = 0;
        c = new qv2("ENABLED", i2);
        d = new qv2("DISABLED", i2);
        e = new qv2("DESTROYED", i2);
        int i3 = 1;
        f = new qv2("TINK", i3);
        i = new qv2("CRUNCHY", i3);
        v = new qv2("NO_PREFIX", i3);
    }

    public /* synthetic */ qv2(String str, int i2) {
        this.a = i2;
        this.b = str;
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) this.b);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            e.b(e2);
        }
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
        String str = this.b;
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("tenantId", str);
        }
        if (!TextUtils.isEmpty("CLIENT_TYPE_ANDROID")) {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        if (!TextUtils.isEmpty("RECAPTCHA_ENTERPRISE")) {
            jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        }
        return jSONObject.toString();
    }
}
