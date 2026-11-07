package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bi2 implements Runnable {
    public static final h01 c = new h01("RevokeAccessOperation", new String[0]);
    public final String a;
    public final wt1 b;

    public bi2(String str) {
        gu2.l(str);
        this.a = str;
        this.b = new wt1(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        h01 h01Var = c;
        Status status = Status.i;
        try {
            String str = this.a;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
            sb.append("https://accounts.google.com/o/oauth2/revoke?token=");
            sb.append(str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.e;
            } else {
                h01Var.h("Unable to revoke access!", new Object[0]);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(responseCode).length() + 15);
            sb2.append("Response Code: ");
            sb2.append(responseCode);
            h01Var.f(sb2.toString(), new Object[0]);
        } catch (IOException e) {
            h01Var.h("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            h01Var.h("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.b.e(status);
    }
}
