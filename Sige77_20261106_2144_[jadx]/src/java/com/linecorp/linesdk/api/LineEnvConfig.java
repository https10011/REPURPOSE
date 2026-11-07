package com.linecorp.linesdk.api;

import com.hjq.toast.BuildConfig;
import defpackage.oc1;
import kotlin.Metadata;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/linecorp/linesdk/api/LineEnvConfig;", BuildConfig.FLAVOR, "()V", "apiServerBaseUri", BuildConfig.FLAVOR, "getApiServerBaseUri", "()Ljava/lang/String;", "openIdDiscoveryDocumentUrl", "getOpenIdDiscoveryDocumentUrl", "webLoginPageUrl", "getWebLoginPageUrl", "line-sdk_release"}, k = 1, mv = {1, oc1.DOUBLE_FIELD_NUMBER, 1}, xi = 48)
public abstract class LineEnvConfig {
    private final String apiServerBaseUri = "https://api.line.me/";
    private final String openIdDiscoveryDocumentUrl = "https://access.line.me/.well-known/openid-configuration";
    private final String webLoginPageUrl = "https://access.line.me/oauth2/v2.1/login";

    public String getApiServerBaseUri() {
        return this.apiServerBaseUri;
    }

    public String getOpenIdDiscoveryDocumentUrl() {
        return this.openIdDiscoveryDocumentUrl;
    }

    public String getWebLoginPageUrl() {
        return this.webLoginPageUrl;
    }
}
