package com.transsion.sdk.oneid.data;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.system.Os;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import defpackage.am2;
import java.io.Serializable;
import java.util.UUID;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class FingerprintInfo extends OneBaseInfo implements Serializable {
    public String gsf;
    public String hdid;

    public FingerprintInfo(Context context) {
        String string = BuildConfig.FLAVOR;
        this.gsf = BuildConfig.FLAVOR;
        this.hdid = BuildConfig.FLAVOR;
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
            if (cursorQuery == null || !cursorQuery.moveToNext()) {
                this.gsf = BuildConfig.FLAVOR;
            } else {
                this.gsf = Long.toHexString(cursorQuery.getLong(1));
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception unused) {
        }
        try {
            string = UUID.nameUUIDFromBytes(String.valueOf(Os.statvfs(Environment.getExternalStorageDirectory().getPath()).f_fsid).getBytes()).toString();
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
        this.hdid = string;
    }
}
