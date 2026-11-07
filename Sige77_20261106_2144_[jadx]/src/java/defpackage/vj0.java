package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import io.jsonwebtoken.Claims;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vj0 extends dv {
    public final String c;

    public vj0(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        str.getClass();
        str2.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", 0, bundle);
        this.c = str2;
        if (str.length() <= 0) {
            e.g("id should not be empty");
            throw null;
        }
        if (str2.length() <= 0) {
            e.g("idToken should not be empty");
            throw null;
        }
        List listB = StringsKt.B(str2, new String[]{"."}, 0, 6);
        if (listB.size() != 3) {
            e.g("Invalid token format");
            throw null;
        }
        try {
            byte[] bArrDecode = Base64.decode((String) listB.get(1), 8);
            bArrDecode.getClass();
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, charset));
            jSONObject.optString("email").getClass();
            String strOptString = jSONObject.optString(Claims.SUBJECT);
            if ((strOptString.length() == 0 ? null : strOptString) != null) {
            } else {
                throw new IllegalArgumentException("ID token missing required field: sub");
            }
        } catch (JSONException e) {
            sm0.s(e);
            throw null;
        }
    }
}
