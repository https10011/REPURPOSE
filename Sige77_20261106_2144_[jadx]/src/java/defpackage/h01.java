package defpackage;

import android.content.ClipData;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h01 {
    public String a;
    public String b;
    public int c;

    public h01(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.b = string;
        this.a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (!(length <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public static h01 a(ClipData clipData) {
        String string;
        String str;
        ClipData.Item itemAt;
        String str2 = null;
        if (clipData == null) {
            return null;
        }
        h01 h01Var = new h01();
        if (clipData.getItemCount() <= 0 || (itemAt = clipData.getItemAt(0)) == null) {
            string = null;
        } else {
            String htmlText = itemAt.getHtmlText();
            string = itemAt.getText() != null ? itemAt.getText().toString() : null;
            str2 = htmlText;
        }
        if (str2 != null) {
            if (str2.contains(se2.a)) {
                h01Var.b = str2;
                h01Var.c |= 2;
            }
            e(str2);
        }
        if (string != null) {
            String str3 = se2.a;
            if (string.contains(str3)) {
                h01Var.a = string;
                h01Var.c |= 1;
                e(string);
                return h01Var;
            }
            try {
                str = new String(tb2.e.a(string), vb2.a);
            } catch (Exception unused) {
                str = string;
            }
            if (str.contains(str3)) {
                h01Var.a = string;
                h01Var.c |= 1;
            }
            e(str);
        }
        return h01Var;
    }

    public static h01 b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        h01 h01Var = new h01();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pbText")) {
                h01Var.a = jSONObject.optString("pbText");
            }
            if (jSONObject.has("pbHtml")) {
                h01Var.b = jSONObject.optString("pbHtml");
            }
            if (jSONObject.has("pbType")) {
                h01Var.c = jSONObject.optInt("pbType");
            }
            return h01Var;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void e(String str) {
        String str2 = se2.b;
        if (str.contains(str2)) {
            try {
                int iIndexOf = str.indexOf(str2) + str2.length();
                Long.parseLong(str.substring(iIndexOf, str.indexOf("-", iIndexOf)));
            } catch (Exception unused) {
            }
            System.currentTimeMillis();
        }
    }

    public boolean c(int i) {
        return (this.c & i) != 0;
    }

    public String d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pbText", this.a);
            jSONObject.put("pbHtml", this.b);
            jSONObject.put("pbType", this.c);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public void f(String str, Object... objArr) {
        if (this.c <= 3) {
            Log.d(this.a, i(str, objArr));
        }
    }

    public void g(String str, Exception exc, Object... objArr) {
        Log.e(this.a, i(str, objArr), exc);
    }

    public void h(String str, Object... objArr) {
        Log.e(this.a, i(str, objArr));
    }

    public String i(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.b.concat(str);
    }

    public void j(String str, Object... objArr) {
        if (this.c <= 2) {
            Log.v(this.a, i(str, objArr));
        }
    }

    public h01() {
        this.c = 0;
    }
}
