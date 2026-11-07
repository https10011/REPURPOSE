package defpackage;

import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class dv extends h8 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(String str, int i, Bundle bundle) {
        super(str, bundle);
        switch (i) {
            case 1:
                super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused) {
                    }
                }
                e.g("credentialJson must not be empty, and must be a valid JSON");
                throw null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
                if (str.length() > 0) {
                    return;
                }
                e.g("password should not be empty");
                throw null;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
                str.getClass();
                if (str.length() != 0) {
                    try {
                        new JSONObject(str);
                        return;
                    } catch (Exception unused2) {
                    }
                }
                e.g("authenticationResponseJson must not be empty, and must be a valid JSON");
                throw null;
            default:
                str.getClass();
                bundle.getClass();
                if (str.length() > 0) {
                    return;
                }
                e.g("type should not be empty");
                throw null;
        }
    }
}
