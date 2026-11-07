package defpackage;

import android.util.Log;
import com.google.firebase.auth.EmailAuthCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mo2 implements zm2 {
    public final String a;
    public final String b;
    public final EmailAuthCredential c;
    public final String d;
    public final String e;

    static {
        String simpleName = mo2.class.getSimpleName();
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str);
            }
            sb.append("] ");
        }
        Object[] objArr = {simpleName, 23};
        if (!(simpleName.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        for (int i = 2; i <= 7 && !Log.isLoggable(simpleName, i); i++) {
        }
    }

    public mo2(EmailAuthCredential emailAuthCredential, String str, String str2) {
        gu2.o(emailAuthCredential);
        this.c = emailAuthCredential;
        String str3 = emailAuthCredential.a;
        gu2.l(str3);
        this.a = str3;
        String str4 = emailAuthCredential.c;
        gu2.l(str4);
        this.b = str4;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.zm2
    public final String zza() throws JSONException {
        s3 s3Var;
        int i = s3.c;
        String str = this.b;
        gu2.l(str);
        try {
            s3Var = new s3(str);
        } catch (IllegalArgumentException unused) {
            s3Var = null;
        }
        String str2 = s3Var != null ? s3Var.a : null;
        String str3 = s3Var != null ? s3Var.b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.a);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.d;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.e;
        if (str5 != null) {
            am2.e0(jSONObject, "captchaResp", str5);
        } else {
            jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
        }
        return jSONObject.toString();
    }
}
