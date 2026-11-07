package com.transsion.sdk.oneid.data;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import defpackage.aj0;
import defpackage.am2;
import defpackage.xe2;
import defpackage.yd2;
import java.io.File;
import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class GroupFpInfo extends OneBaseInfo implements Serializable {
    public DeviceInfo device;
    public UniqueIdInfo dids;
    public EnvironInfo env;
    public FingerprintInfo fp;
    public PackageInfo pkg;
    public RomInfo rom;
    public UserIdInfo user;
    public String vaid;

    public GroupFpInfo(Context context, Handler.Callback callback) {
        String strD;
        String packageName = context.getPackageName();
        try {
            this.vaid = yd2.a(context).e("vaid");
        } catch (Exception unused) {
        }
        try {
            if (TextUtils.isEmpty(this.vaid)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        if (!TextUtils.isEmpty(string)) {
                            this.vaid = UUID.nameUUIDFromBytes((packageName + string).getBytes()).toString();
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (TextUtils.isEmpty(this.vaid)) {
                    this.vaid = UUID.randomUUID().toString();
                }
                yd2.a(context).c("vaid", this.vaid);
            }
            try {
                File file = new File(aj0.a());
                if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                    boolean zExists = file.exists();
                    String strOptString = BuildConfig.FLAVOR;
                    if (zExists && (strD = am2.d(file)) != null && strD.length() > 0) {
                        am2.g("read vaid success");
                        strOptString = new JSONObject(strD).optString(packageName, BuildConfig.FLAVOR);
                    }
                    if (!TextUtils.equals(strOptString, this.vaid)) {
                        xe2.a(context).d(new IdChangeInfo("vaid", strOptString, this.vaid));
                    }
                }
            } catch (Exception e) {
                am2.l(e.getMessage());
            }
        } catch (Exception unused3) {
        }
        this.dids = new UniqueIdInfo(context, callback);
        this.user = new UserIdInfo(context);
        this.pkg = new PackageInfo(context);
        this.env = new EnvironInfo(context);
        this.device = new DeviceInfo(context);
        this.fp = new FingerprintInfo(context);
        this.rom = new RomInfo(context);
    }
}
