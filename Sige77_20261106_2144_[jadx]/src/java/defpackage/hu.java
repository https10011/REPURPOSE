package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.a;
import com.google.android.gms.common.Feature;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hu extends ku {
    public final Context d;
    public cu e;
    public Executor f;
    public CancellationSignal g;
    public final CredentialProviderBeginSignInController.resultReceiver.1 h;

    public hu(Context context) {
        context.getClass();
        this.d = context;
        this.h = new CredentialProviderBeginSignInController.resultReceiver.1(this, new Handler(Looper.getMainLooper()));
    }

    /* JADX WARN: Code duplicated, block: B:87:0x013d A[Catch: JSONException -> 0x00e1, all -> 0x015e, TryCatch #0 {JSONException -> 0x00e1, blocks: (B:52:0x00c5, B:54:0x00cc, B:56:0x00d3, B:59:0x00e5, B:61:0x00e9, B:62:0x00ee, B:65:0x00f4, B:66:0x00f9, B:68:0x00fd, B:71:0x0106, B:87:0x013d, B:88:0x0140, B:90:0x0144, B:92:0x014e, B:74:0x010e, B:84:0x0133, B:85:0x013a), top: B:110:0x00c5, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0144 A[Catch: JSONException -> 0x00e1, all -> 0x015e, TryCatch #0 {JSONException -> 0x00e1, blocks: (B:52:0x00c5, B:54:0x00cc, B:56:0x00d3, B:59:0x00e5, B:61:0x00e9, B:62:0x00ee, B:65:0x00f4, B:66:0x00f9, B:68:0x00fd, B:71:0x0106, B:87:0x013d, B:88:0x0140, B:90:0x0144, B:92:0x014e, B:74:0x010e, B:84:0x0133, B:85:0x013a), top: B:110:0x00c5, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x014e A[Catch: JSONException -> 0x00e1, all -> 0x015e, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00e1, blocks: (B:52:0x00c5, B:54:0x00cc, B:56:0x00d3, B:59:0x00e5, B:61:0x00e9, B:62:0x00ee, B:65:0x00f4, B:66:0x00f9, B:68:0x00fd, B:71:0x0106, B:87:0x013d, B:88:0x0140, B:90:0x0144, B:92:0x014e, B:74:0x010e, B:84:0x0133, B:85:0x013a), top: B:110:0x00c5, outer: #2 }] */
    public final fi0 c(SignInCredential signInCredential) throws ii0, zh0 {
        dv dvVar;
        AuthenticatorErrorResponse authenticatorErrorResponse;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs;
        String string;
        String str = signInCredential.f;
        PublicKeyCredential publicKeyCredential = signInCredential.w;
        String str2 = signInCredential.i;
        String str3 = signInCredential.a;
        if (str != null) {
            str3.getClass();
            str.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str3);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            dvVar = new dv(str, 2, bundle);
        } else {
            JSONObject jSONObject = null;
            if (str2 != null) {
                str3.getClass();
                String str4 = signInCredential.b;
                String str5 = str4 != null ? str4 : null;
                String str6 = signInCredential.c;
                String str7 = str6 != null ? str6 : null;
                String str8 = signInCredential.d;
                String str9 = str8 != null ? str8 : null;
                String str10 = signInCredential.v;
                String str11 = str10 != null ? str10 : null;
                Uri uri = signInCredential.e;
                dvVar = new vj0(str3, str2, str5, str9, str7, uri != null ? uri : null, str11);
            } else if (publicKeyCredential != null) {
                AuthenticatorErrorResponse authenticatorErrorResponse2 = publicKeyCredential.f;
                AuthenticatorErrorResponse authenticatorErrorResponse3 = publicKeyCredential.e;
                AuthenticatorErrorResponse authenticatorErrorResponse4 = publicKeyCredential.d;
                LinkedHashMap linkedHashMap = be1.a;
                JSONObject jSONObject2 = new JSONObject();
                if (authenticatorErrorResponse4 != null) {
                    authenticatorErrorResponse = authenticatorErrorResponse4;
                } else if (authenticatorErrorResponse3 != null) {
                    authenticatorErrorResponse = authenticatorErrorResponse3;
                } else {
                    if (authenticatorErrorResponse2 == null) {
                        uq1.q("No response set.");
                        return null;
                    }
                    authenticatorErrorResponse = authenticatorErrorResponse2;
                }
                boolean z = false;
                if (authenticatorErrorResponse instanceof AuthenticatorErrorResponse) {
                    AuthenticatorErrorResponse authenticatorErrorResponse5 = authenticatorErrorResponse;
                    ErrorCode errorCode = authenticatorErrorResponse5.a;
                    errorCode.getClass();
                    String str12 = authenticatorErrorResponse5.b;
                    t tVar = (t) be1.a.get(errorCode);
                    if (tVar == null) {
                        throw new ii0(new t(26), ts.j("unknown fido gms exception - ", str12));
                    }
                    if (errorCode == ErrorCode.Y && str12 != null && StringsKt.t(str12, "Unable to get sync account")) {
                        throw new zh0("Passkey retrieval was cancelled by the user.", 0);
                    }
                    throw new ii0(tVar, str12);
                }
                if (authenticatorErrorResponse instanceof AuthenticatorAssertionResponse) {
                    try {
                        d33 d33Var = publicKeyCredential.c;
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            if (d33Var != null && d33Var.i().length > 0) {
                                jSONObject3.put("rawId", ga.i(d33Var.i()));
                            }
                            String str13 = publicKeyCredential.v;
                            if (str13 != null) {
                                jSONObject3.put("authenticatorAttachment", str13);
                            }
                            String str14 = publicKeyCredential.b;
                            if (str14 != null && authenticatorErrorResponse2 == null) {
                                jSONObject3.put("type", str14);
                            }
                            String str15 = publicKeyCredential.a;
                            if (str15 != null) {
                                jSONObject3.put("id", str15);
                            }
                            String str16 = "response";
                            if (authenticatorErrorResponse3 != null) {
                                jSONObject = authenticatorErrorResponse3.R();
                            } else {
                                if (authenticatorErrorResponse4 != null) {
                                    jSONObject = authenticatorErrorResponse4.R();
                                } else if (authenticatorErrorResponse2 != null) {
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("code", authenticatorErrorResponse2.a.a);
                                        String str17 = authenticatorErrorResponse2.b;
                                        if (str17 != null) {
                                            jSONObject.put("message", str17);
                                        }
                                        str16 = "error";
                                    } catch (JSONException e) {
                                        throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
                                    }
                                }
                                if (jSONObject != null) {
                                    jSONObject3.put(str16, jSONObject);
                                }
                                authenticationExtensionsClientOutputs = publicKeyCredential.i;
                                if (authenticationExtensionsClientOutputs != null) {
                                    jSONObject3.put("clientExtensionResults", authenticationExtensionsClientOutputs.R());
                                } else if (z) {
                                    jSONObject3.put("clientExtensionResults", new JSONObject());
                                }
                                string = jSONObject3.toString();
                                string.getClass();
                            }
                            z = true;
                            if (jSONObject != null) {
                                jSONObject3.put(str16, jSONObject);
                            }
                            authenticationExtensionsClientOutputs = publicKeyCredential.i;
                            if (authenticationExtensionsClientOutputs != null) {
                                jSONObject3.put("clientExtensionResults", authenticationExtensionsClientOutputs.R());
                            } else if (z) {
                                jSONObject3.put("clientExtensionResults", new JSONObject());
                            }
                            string = jSONObject3.toString();
                            string.getClass();
                        } catch (JSONException e2) {
                            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e2);
                        }
                    } catch (Throwable th) {
                        throw new zh0("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage(), 4);
                    }
                } else {
                    Log.e("PublicKeyUtility", "AuthenticatorResponse expected assertion response but got: ".concat(authenticatorErrorResponse.getClass().getName()));
                    string = jSONObject2.toString();
                    string.getClass();
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", string);
                dvVar = new dv(string, 3, bundle2);
            } else {
                Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
                dvVar = null;
            }
        }
        if (dvVar != null) {
            return new fi0(dvVar);
        }
        throw new zh0("When attempting to convert get response, null credential found", 4);
    }

    public final cu d() {
        cu cuVar = this.e;
        if (cuVar != null) {
            return cuVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        return null;
    }

    public final Executor e() {
        Executor executor = this.f;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(ei0 ei0Var, CancellationSignal cancellationSignal, Executor executor, cu cuVar) {
        ei0Var.getClass();
        cuVar.getClass();
        executor.getClass();
        this.g = cancellationSignal;
        this.e = cuVar;
        this.f = executor;
        CredentialProviderPlayServicesImpl.Companion.getClass();
        if (vu.a(cancellationSignal)) {
            return;
        }
        Context context = this.d;
        context.getClass();
        boolean z = false;
        Object[] objArr = 0;
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = new BeginSignInRequest.PasswordRequestOptions(false);
        a aVarR = BeginSignInRequest.GoogleIdTokenRequestOptions.R();
        aVarR.a = false;
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsA = aVarR.a();
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = new BeginSignInRequest.PasskeysRequestOptions((String) null, false, (byte[]) null);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = new BeginSignInRequest.PasskeyJsonRequestOptions((String) null, false);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        int i = packageManager.getPackageInfo("com.google.android.gms", 0).versionCode;
        for (gi0 gi0Var : ei0Var.a) {
            if (gi0Var instanceof gi0) {
                a aVarR2 = BeginSignInRequest.GoogleIdTokenRequestOptions.R();
                aVarR2.c = false;
                String str = gi0Var.d;
                gu2.l(str);
                aVarR2.b = str;
                aVarR2.a = true;
                googleIdTokenRequestOptionsA = aVarR2.a();
            }
        }
        BeginSignInRequest beginSignInRequest = new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptionsA, (String) null, false, 0, passkeysRequestOptions, passkeyJsonRequestOptions, false);
        yh2 yh2VarM = jw.m(context);
        a aVarR3 = BeginSignInRequest.GoogleIdTokenRequestOptions.R();
        aVarR3.a = false;
        aVarR3.a();
        new BeginSignInRequest.PasskeysRequestOptions((String) null, false, (byte[]) null);
        new BeginSignInRequest.PasskeyJsonRequestOptions((String) null, false);
        BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.b;
        gu2.o(googleIdTokenRequestOptions);
        BeginSignInRequest.PasswordRequestOptions passwordRequestOptions2 = beginSignInRequest.a;
        gu2.o(passwordRequestOptions2);
        BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions2 = beginSignInRequest.f;
        gu2.o(passkeysRequestOptions2);
        BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions2 = beginSignInRequest.i;
        gu2.o(passkeyJsonRequestOptions2);
        BeginSignInRequest beginSignInRequest2 = new BeginSignInRequest(passwordRequestOptions2, googleIdTokenRequestOptions, yh2VarM.l, beginSignInRequest.d, beginSignInRequest.e, passkeysRequestOptions2, passkeyJsonRequestOptions2, beginSignInRequest.v);
        ei eiVarB = ei.b();
        eiVarB.e = new Feature[]{new Feature("auth_api_credentials_begin_sign_in", 8L)};
        eiVarB.d = new f91(9, yh2VarM, beginSignInRequest2, z);
        eiVarB.c = false;
        eiVarB.b = 1553;
        yh2VarM.b(0, eiVarB.a()).addOnSuccessListener(new ab(new fu(objArr == true ? 1 : 0, cancellationSignal, this), 6)).addOnFailureListener(new eg(4, this, cancellationSignal));
    }
}
