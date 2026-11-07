package com.linecorp.linesdk.api;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.linecorp.linesdk.ManifestParser;
import defpackage.ac2;
import defpackage.e;
import defpackage.fd;
import defpackage.fx0;
import defpackage.hx0;
import defpackage.i4;
import defpackage.jw1;
import defpackage.mx0;
import defpackage.n60;
import defpackage.qx0;
import java.lang.reflect.Proxy;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class LineApiClientBuilder {
    private Uri apiBaseUri;
    private final String channelId;
    private final Context context;
    private boolean isEncryptorPreparationDisabled;
    private boolean isTokenAutoRefreshDisabled;
    private Uri openidDiscoveryDocumentUrl;

    public LineApiClientBuilder(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            e.g("channel id is empty");
            throw null;
        }
        this.context = context.getApplicationContext();
        this.channelId = str;
        LineEnvConfig qx0Var = new ManifestParser().parse(context);
        qx0Var = qx0Var == null ? new qx0() : qx0Var;
        this.openidDiscoveryDocumentUrl = Uri.parse(qx0Var.getOpenIdDiscoveryDocumentUrl());
        this.apiBaseUri = Uri.parse(qx0Var.getApiServerBaseUri());
    }

    @Deprecated
    public LineApiClientBuilder apiBaseUri(Uri uri) {
        if (uri != null) {
            this.apiBaseUri = uri;
        }
        return this;
    }

    public fx0 build() {
        if (!this.isEncryptorPreparationDisabled) {
            Context context = this.context;
            if (!n60.b) {
                n60.b = true;
                Executors.newSingleThreadExecutor().execute(new i4(context.getApplicationContext(), 7));
            }
        }
        hx0 hx0Var = new hx0(this.channelId, new mx0(this.context, this.openidDiscoveryDocumentUrl, this.apiBaseUri), new jw1(this.context, this.apiBaseUri), new ac2(this.context, this.channelId));
        return this.isTokenAutoRefreshDisabled ? hx0Var : (fx0) Proxy.newProxyInstance(hx0.class.getClassLoader(), new Class[]{fx0.class}, new fd(hx0Var));
    }

    public LineApiClientBuilder disableEncryptorPreparation() {
        this.isEncryptorPreparationDisabled = true;
        return this;
    }

    public LineApiClientBuilder disableTokenAutoRefresh() {
        this.isTokenAutoRefreshDisabled = true;
        return this;
    }

    @Deprecated
    public LineApiClientBuilder openidDiscoveryDocumentUrl(Uri uri) {
        if (uri != null) {
            this.openidDiscoveryDocumentUrl = uri;
        }
        return this;
    }
}
