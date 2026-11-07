package com.transsion.sdk.oneid.data;

import com.hjq.toast.BuildConfig;
import defpackage.am2;
import defpackage.uk0;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class OneBaseInfo {
    public String toString() {
        try {
            return new uk0().d(this);
        } catch (Exception e) {
            am2.l(e);
            return BuildConfig.FLAVOR;
        }
    }
}
