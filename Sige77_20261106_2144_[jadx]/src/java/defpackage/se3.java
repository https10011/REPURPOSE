package defpackage;

import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class se3 extends ge3 {
    public static final boolean H(String str) {
        String str2 = (String) h13.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.I().t()) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.pe3 F(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se3.F(java.lang.String):pe3");
    }

    public final String G(String str) {
        f53 f53Var = this.b.a;
        if3.T(f53Var);
        String strR = f53Var.R(str);
        if (TextUtils.isEmpty(strR)) {
            return (String) h13.r.a(null);
        }
        Uri uri = Uri.parse((String) h13.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(strR).length() + 1 + String.valueOf(authority).length());
        sb.append(strR);
        sb.append(".");
        sb.append(authority);
        builderBuildUpon.authority(sb.toString());
        return builderBuildUpon.build().toString();
    }
}
