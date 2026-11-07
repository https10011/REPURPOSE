package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public interface nm2 {
    public static final h01 N = new h01("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    void a(Status status);

    Uri.Builder b(Intent intent, String str, String str2);

    void c(Uri uri, String str, zd1 zd1Var);

    HttpURLConnection d(URL url);

    Context zza();

    String zza(String str);
}
