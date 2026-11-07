package defpackage;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x1 {
    public final SharedPreferences a;

    public x1(int i) {
        switch (i) {
            case 1:
                SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences.getClass();
                this.a = sharedPreferences;
                break;
            default:
                SharedPreferences sharedPreferences2 = i90.a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                sharedPreferences2.getClass();
                this.a = sharedPreferences2;
                break;
        }
    }
}
