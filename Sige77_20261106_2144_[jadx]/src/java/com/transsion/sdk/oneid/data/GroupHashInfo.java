package com.transsion.sdk.oneid.data;

import com.hjq.toast.BuildConfig;
import defpackage.am2;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class GroupHashInfo extends OneBaseInfo implements Serializable {
    public String device_hash;
    public String dids_hash;
    public String env_hash;
    public String fp_hash;
    public String pkg_hash;
    public String rom_hash;
    public String user_hash;
    public String vaid;

    public GroupHashInfo(GroupFpInfo groupFpInfo) {
        this.vaid = BuildConfig.FLAVOR;
        this.dids_hash = BuildConfig.FLAVOR;
        this.user_hash = BuildConfig.FLAVOR;
        this.pkg_hash = BuildConfig.FLAVOR;
        this.env_hash = BuildConfig.FLAVOR;
        this.device_hash = BuildConfig.FLAVOR;
        this.fp_hash = BuildConfig.FLAVOR;
        this.rom_hash = BuildConfig.FLAVOR;
        this.vaid = groupFpInfo.vaid;
        this.dids_hash = am2.e(groupFpInfo.dids.toString());
        this.user_hash = am2.e(groupFpInfo.user.toString());
        this.pkg_hash = am2.e(groupFpInfo.pkg.toString());
        this.env_hash = am2.e(groupFpInfo.env.toString());
        this.device_hash = am2.e(groupFpInfo.device.toString());
        this.fp_hash = am2.e(groupFpInfo.fp.toString());
        this.rom_hash = am2.e(groupFpInfo.rom.toString());
    }

    public void updateDidsHash(UniqueIdInfo uniqueIdInfo) {
        this.dids_hash = am2.e(uniqueIdInfo.toString());
    }
}
