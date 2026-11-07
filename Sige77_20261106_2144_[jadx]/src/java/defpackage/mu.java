package defpackage;

import android.os.Bundle;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class mu extends ku {
    public static final /* synthetic */ int d = 0;

    public static qt c(PublicKeyCredential publicKeyCredential) throws nt {
        JSONObject jSONObjectR;
        try {
            AuthenticatorErrorResponse authenticatorErrorResponse = publicKeyCredential.f;
            d33 d33Var = publicKeyCredential.c;
            try {
                JSONObject jSONObject = new JSONObject();
                if (d33Var != null && d33Var.i().length > 0) {
                    jSONObject.put("rawId", ga.i(d33Var.i()));
                }
                String str = publicKeyCredential.v;
                if (str != null) {
                    jSONObject.put("authenticatorAttachment", str);
                }
                String str2 = publicKeyCredential.b;
                if (str2 != null && authenticatorErrorResponse == null) {
                    jSONObject.put("type", str2);
                }
                String str3 = publicKeyCredential.a;
                if (str3 != null) {
                    jSONObject.put("id", str3);
                }
                String str4 = "response";
                AuthenticatorAssertionResponse authenticatorAssertionResponse = publicKeyCredential.e;
                boolean z = true;
                if (authenticatorAssertionResponse != null) {
                    jSONObjectR = authenticatorAssertionResponse.R();
                } else {
                    AuthenticatorAttestationResponse authenticatorAttestationResponse = publicKeyCredential.d;
                    if (authenticatorAttestationResponse != null) {
                        jSONObjectR = authenticatorAttestationResponse.R();
                    } else {
                        z = false;
                        if (authenticatorErrorResponse != null) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("code", authenticatorErrorResponse.a.a);
                                String str5 = authenticatorErrorResponse.b;
                                if (str5 != null) {
                                    jSONObject2.put("message", str5);
                                }
                                str4 = "error";
                                jSONObjectR = jSONObject2;
                            } catch (JSONException e) {
                                throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                            }
                        } else {
                            jSONObjectR = null;
                        }
                    }
                }
                if (jSONObjectR != null) {
                    jSONObject.put(str4, jSONObjectR);
                }
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = publicKeyCredential.i;
                if (authenticationExtensionsClientOutputs != null) {
                    jSONObject.put("clientExtensionResults", authenticationExtensionsClientOutputs.R());
                } else if (z) {
                    jSONObject.put("clientExtensionResults", new JSONObject());
                }
                String string = jSONObject.toString();
                string.getClass();
                Bundle bundle = new Bundle();
                bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
                return new qt(string, bundle);
            } catch (JSONException e2) {
                throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
            }
        } catch (Throwable th) {
            throw new nt("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), 5);
        }
    }
}
