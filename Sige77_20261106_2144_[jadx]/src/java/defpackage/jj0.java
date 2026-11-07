package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jj0 implements hv0 {
    public final ul0 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public jj0(String str) {
        zv0 zv0Var = ul0.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            e.g("Must not be null or empty");
            throw null;
        }
        this.d = str;
        am2.p(zv0Var, "Argument must not be null");
        this.b = zv0Var;
    }

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(hv0.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        am2.p(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String string = this.d;
            if (TextUtils.isEmpty(string)) {
                URL url = this.c;
                am2.p(url, "Argument must not be null");
                string = url.toString();
            }
            this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.e;
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof jj0) {
            jj0 jj0Var = (jj0) obj;
            if (c().equals(jj0Var.c()) && this.b.equals(jj0Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public jj0(URL url) {
        zv0 zv0Var = ul0.a;
        am2.p(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        am2.p(zv0Var, "Argument must not be null");
        this.b = zv0Var;
    }
}
