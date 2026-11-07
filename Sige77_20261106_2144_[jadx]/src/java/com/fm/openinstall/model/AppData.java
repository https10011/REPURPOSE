package com.fm.openinstall.model;

import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import defpackage.ts;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class AppData implements Serializable {
    public String channel = BuildConfig.FLAVOR;
    public String data = BuildConfig.FLAVOR;

    public String getChannel() {
        return this.channel;
    }

    public String getData() {
        return this.data;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(getChannel()) && TextUtils.isEmpty(getData());
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppData{channel='");
        sb.append(this.channel);
        sb.append("', data='");
        return ts.l(sb, this.data, "'}");
    }
}
