package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineIdToken;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.auth.LineLoginResult;
import com.linecorp.linesdk.internal.pkce.PKCECode;
import defpackage.ac2;
import defpackage.dm1;
import defpackage.er0;
import defpackage.fi;
import defpackage.g93;
import defpackage.ix0;
import defpackage.jw1;
import defpackage.mx0;
import defpackage.qq;
import defpackage.sm0;
import defpackage.ta;
import defpackage.u91;
import defpackage.vl;
import defpackage.zr0;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b extends AsyncTask {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void a(LineIdToken lineIdToken, String str) {
        d dVar = this.a;
        ix0 ix0VarA = dVar.c.a();
        if (!ix0VarA.d()) {
            StringBuilder sb = new StringBuilder("Failed to get OpenId Discovery Document.  Response Code: ");
            sb.append(ix0VarA.a);
            LineApiError lineApiError = ix0VarA.c;
            sb.append(" Error Data: ");
            sb.append(lineApiError);
            throw new RuntimeException(sb.toString());
        }
        String str2 = ((u91) ix0VarA.c()).a;
        String str3 = dVar.b.a;
        String str4 = dVar.h.d;
        String str5 = lineIdToken.b;
        Date date = lineIdToken.f;
        if (!str2.equals(str5)) {
            ta.t(str2, str5, "OpenId issuer does not match.");
            throw null;
        }
        String str6 = lineIdToken.c;
        if (str != null && !str.equals(str6)) {
            ta.t(str, str6, "OpenId subject does not match.");
            throw null;
        }
        String str7 = lineIdToken.d;
        if (!str3.equals(str7)) {
            ta.t(str3, str7, "OpenId audience does not match.");
            throw null;
        }
        String str8 = lineIdToken.v;
        if (!(str4 == null && str8 == null) && (str4 == null || !str4.equals(str8))) {
            ta.t(str4, str8, "OpenId nonce does not match.");
            throw null;
        }
        Date date2 = new Date();
        Date date3 = lineIdToken.e;
        if (date.getTime() > date2.getTime() + 300000) {
            sm0.u(date, "OpenId issuedAt is after current time: ");
        } else {
            if (date3.getTime() >= date2.getTime() - 300000) {
                return;
            }
            sm0.u(date3, "OpenId expiresAt is before current time: ");
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        LineProfile lineProfile;
        String str;
        fi fiVar = ((fi[]) objArr)[0];
        if (TextUtils.isEmpty(fiVar.a)) {
            sm0.h("requestToken is null. Please check result by isSuccess before.");
            return null;
        }
        String str2 = fiVar.a;
        d dVar = this.a;
        LineAuthenticationStatus lineAuthenticationStatus = dVar.h;
        PKCECode pKCECode = lineAuthenticationStatus.a;
        String str3 = lineAuthenticationStatus.b;
        if (TextUtils.isEmpty(str2) || pKCECode == null || TextUtils.isEmpty(str3)) {
            return LineLoginResult.b("Requested data is missing.");
        }
        mx0 mx0Var = dVar.c;
        String str4 = dVar.b.a;
        Uri uriI = g93.i(mx0Var.a, "oauth2/v2.1", "token");
        LinkedHashMap linkedHashMapH = g93.h("grant_type", "authorization_code", "code", str2, "redirect_uri", str3, "client_id", str4, "code_verifier", pKCECode.a, "id_token_key_type", "JWK", "client_version", "LINE SDK Android v5.12.0");
        vl vlVar = mx0Var.b;
        Map map = Collections.EMPTY_MAP;
        ix0 ix0VarH = vlVar.h(uriI, linkedHashMapH, mx0Var.c);
        if (!ix0VarH.d()) {
            return LineLoginResult.a(ix0VarH.a, ix0VarH.c);
        }
        zr0 zr0Var = (zr0) ix0VarH.c();
        er0 er0Var = zr0Var.a;
        List list = zr0Var.b;
        if (list.contains(dm1.c)) {
            jw1 jw1Var = dVar.d;
            ix0 ix0VarA = jw1Var.b.a(g93.i(jw1Var.a, "v2", "profile"), jw1.a(er0Var), Collections.EMPTY_MAP, jw1.c);
            if (!ix0VarA.d()) {
                return LineLoginResult.a(ix0VarA.a, ix0VarA.c);
            }
            lineProfile = (LineProfile) ix0VarA.c();
            str = lineProfile.a;
        } else {
            lineProfile = null;
            str = null;
        }
        ac2 ac2Var = dVar.f;
        ((Context) ac2Var.b).getSharedPreferences((String) ac2Var.d, 0).edit().putString("accessToken", ac2Var.y(er0Var.a)).putString("expiresIn", ac2Var.x(er0Var.b)).putString("issuedClientTime", ac2Var.x(er0Var.c)).putString("refreshToken", ac2Var.y(er0Var.d)).apply();
        LineIdToken lineIdToken = zr0Var.c;
        if (lineIdToken != null) {
            try {
                a(lineIdToken, str);
            } catch (Exception e) {
                return LineLoginResult.b(e.getMessage());
            }
        }
        qq qqVar = new qq();
        qqVar.b = lineAuthenticationStatus.d;
        qqVar.c = lineProfile;
        qqVar.d = lineIdToken;
        if (TextUtils.isEmpty(fiVar.a)) {
            sm0.h("requestToken is null. Please check result by isSuccess before.");
            return null;
        }
        qqVar.e = fiVar.b;
        qqVar.f = new LineCredential(new LineAccessToken(er0Var.a, er0Var.b, er0Var.c), list);
        return new LineLoginResult(qqVar);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        d dVar = this.a;
        dVar.h.e = 4;
        dVar.a.a((LineLoginResult) obj);
    }
}
