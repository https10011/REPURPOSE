package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.hjq.toast.BuildConfig;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yr implements xr, zr {
    public final /* synthetic */ int a = 0;
    public ClipData b;
    public int c;
    public int d;
    public Uri e;
    public Bundle f;

    public yr(yr yrVar) {
        ClipData clipData = yrVar.b;
        clipData.getClass();
        this.b = clipData;
        int i = yrVar.c;
        if (i < 0) {
            Locale locale = Locale.US;
            e.g("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            e.g("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.c = i;
        int i2 = yrVar.d;
        if ((i2 & 1) == i2) {
            this.d = i2;
            this.e = yrVar.e;
            this.f = yrVar.f;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // defpackage.zr
    public int b() {
        return this.c;
    }

    @Override // defpackage.xr
    public as build() {
        return new as(new yr(this));
    }

    @Override // defpackage.xr
    public void e(Uri uri) {
        this.e = uri;
    }

    @Override // defpackage.xr
    public void i(int i) {
        this.d = i;
    }

    @Override // defpackage.zr
    public ClipData k() {
        return this.b;
    }

    @Override // defpackage.xr
    public void setExtras(Bundle bundle) {
        this.f = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.a) {
            case 1:
                Uri uri = this.e;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.b.getDescription());
                sb.append(", source=");
                int i = this.c;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.d;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                String str2 = BuildConfig.FLAVOR;
                if (uri == null) {
                    str = BuildConfig.FLAVOR;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                if (this.f != null) {
                    str2 = ", hasExtras";
                }
                return ts.l(sb, str2, "}");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.zr
    public int w() {
        return this.d;
    }

    @Override // defpackage.zr
    public ContentInfo x() {
        return null;
    }

    public /* synthetic */ yr() {
    }
}
