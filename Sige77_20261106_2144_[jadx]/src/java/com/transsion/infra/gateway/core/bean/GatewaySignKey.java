package com.transsion.infra.gateway.core.bean;

import defpackage.qq1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class GatewaySignKey {
    public qq1 algorithm;
    public String key;
    public int keyVersion;

    public GatewaySignKey(String str, int i, qq1 qq1Var) {
        this.key = str;
        this.keyVersion = i;
        this.algorithm = qq1Var;
    }

    public qq1 getAlgorithm() {
        return this.algorithm;
    }

    public String getKey() {
        return this.key;
    }

    public int getKeyVersion() {
        return this.keyVersion;
    }

    public void setAlgorithm(qq1 qq1Var) {
        this.algorithm = qq1Var;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setKeyVersion(int i) {
        this.keyVersion = i;
    }
}
