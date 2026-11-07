package defpackage;

import com.facebook.FacebookRequestError;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pk0 {
    public static final /* synthetic */ int e = 0;
    public final HttpURLConnection a;
    public final JSONObject b;
    public final FacebookRequestError c;
    public final JSONObject d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pk0(mk0 mk0Var, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this(mk0Var, httpURLConnection, jSONObject, null, null);
        mk0Var.getClass();
        str.getClass();
    }

    public final String toString() {
        String str;
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            HttpURLConnection httpURLConnection = this.a;
            str = String.format(locale, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200)}, 1));
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder sbN = ts.n("{Response:  responseCode: ", str, ", graphObject: ");
        sbN.append(this.b);
        sbN.append(", error: ");
        sbN.append(this.c);
        sbN.append("}");
        return sbN.toString();
    }

    public pk0(mk0 mk0Var, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, FacebookRequestError facebookRequestError) {
        mk0Var.getClass();
        this.a = httpURLConnection;
        this.b = jSONObject;
        this.c = facebookRequestError;
        this.d = jSONObject;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pk0(mk0 mk0Var, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this(mk0Var, httpURLConnection, null, null, facebookRequestError);
        mk0Var.getClass();
    }
}
