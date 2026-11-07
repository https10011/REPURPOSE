package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.auth.LineAuthenticationConfig;
import com.linecorp.linesdk.auth.LineAuthenticationParams;
import com.linecorp.linesdk.auth.LineLoginResult;
import defpackage.ac2;
import defpackage.fi;
import defpackage.jw1;
import defpackage.jx0;
import defpackage.mx0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d {
    public static Intent i;
    public final LineAuthenticationActivity a;
    public final LineAuthenticationConfig b;
    public final mx0 c;
    public final jw1 d;
    public final a e;
    public final ac2 f;
    public final LineAuthenticationParams g;
    public final LineAuthenticationStatus h;

    public d(LineAuthenticationActivity lineAuthenticationActivity, LineAuthenticationConfig lineAuthenticationConfig, LineAuthenticationStatus lineAuthenticationStatus, LineAuthenticationParams lineAuthenticationParams) {
        Context applicationContext = lineAuthenticationActivity.getApplicationContext();
        Uri uri = lineAuthenticationConfig.b;
        Uri uri2 = lineAuthenticationConfig.c;
        mx0 mx0Var = new mx0(applicationContext, uri, uri2);
        jw1 jw1Var = new jw1(lineAuthenticationActivity.getApplicationContext(), uri2);
        a aVar = new a(lineAuthenticationStatus);
        ac2 ac2Var = new ac2(lineAuthenticationActivity.getApplicationContext(), lineAuthenticationConfig.a);
        this.a = lineAuthenticationActivity;
        this.b = lineAuthenticationConfig;
        this.c = mx0Var;
        this.d = jw1Var;
        this.e = aVar;
        this.f = ac2Var;
        this.h = lineAuthenticationStatus;
        this.g = lineAuthenticationParams;
    }

    public final void a(Intent intent) {
        fi fiVar;
        LineLoginResult lineLoginResultA;
        LineAuthenticationStatus lineAuthenticationStatus = this.h;
        lineAuthenticationStatus.e = 3;
        a aVar = this.e;
        aVar.getClass();
        Uri data = intent.getData();
        if (data == null) {
            fiVar = new fi(null, null, null, null, "Illegal redirection from external application.");
        } else {
            String str = aVar.a.c;
            String queryParameter = data.getQueryParameter("state");
            if (str == null || !str.equals(queryParameter)) {
                fiVar = new fi(null, null, null, null, "Illegal parameter value of 'state'.");
            } else {
                String queryParameter2 = data.getQueryParameter("code");
                String queryParameter3 = data.getQueryParameter("friendship_status_changed");
                fiVar = !TextUtils.isEmpty(queryParameter2) ? new fi(queryParameter2, !TextUtils.isEmpty(queryParameter3) ? Boolean.valueOf(Boolean.parseBoolean(queryParameter3)) : null, null, null, null) : new fi(null, null, data.getQueryParameter("error"), data.getQueryParameter("error_description"), null);
            }
        }
        String str2 = fiVar.a;
        if (!TextUtils.isEmpty(str2)) {
            new b(this).execute(fiVar);
            return;
        }
        lineAuthenticationStatus.e = 4;
        if ("ACCESS_DENIED".equalsIgnoreCase(fiVar.c)) {
            lineLoginResultA = LineLoginResult.a(jx0.b, LineApiError.d);
        } else if (TextUtils.isEmpty(fiVar.e) && TextUtils.isEmpty(str2)) {
            lineLoginResultA = LineLoginResult.a(jx0.e, fiVar.a());
        } else {
            lineLoginResultA = LineLoginResult.a(jx0.f, fiVar.a());
        }
        this.a.a(lineLoginResultA);
    }
}
