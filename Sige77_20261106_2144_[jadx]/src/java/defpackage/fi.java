package defpackage;

import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fi {
    public final String a;
    public final Boolean b;
    public final String c;
    public final String d;
    public final String e;

    public fi(String str, Boolean bool, String str2, String str3, String str4) {
        this.a = str;
        this.b = bool;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final LineApiError a() {
        String str = this.e;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.a)) {
            return new LineApiError(str);
        }
        try {
            return new LineApiError(new JSONObject().putOpt("error", this.c).putOpt("error_description", this.d).toString());
        } catch (JSONException e) {
            return new LineApiError(e);
        }
    }
}
