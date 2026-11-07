package com.fm.openinstall.model;

import defpackage.ts;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class Error {
    public static final int INIT_ERROR = -12;
    public static final int INVALID_INTENT = -7;
    public static final int NOT_INIT = -8;
    public static final int REQUEST_ERROR = -2;
    public static final int REQUEST_FAIL = -1;
    public static final int TIMEOUT = -4;
    private int a;
    private String b;

    public Error(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public int getErrorCode() {
        return this.a;
    }

    public String getErrorMsg() {
        return this.b;
    }

    public void setErrorCode(int i) {
        this.a = i;
    }

    public void setErrorMsg(String str) {
        this.b = str;
    }

    public boolean shouldRetry() {
        return getErrorCode() == -1 || getErrorCode() == -4 || getErrorCode() == -8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Error {code=");
        sb.append(this.a);
        sb.append(", msg='");
        return ts.l(sb, this.b, "'}");
    }

    public Error() {
    }
}
