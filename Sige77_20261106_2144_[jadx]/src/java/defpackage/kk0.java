package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.GraphRequest;
import com.hjq.toast.BuildConfig;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kk0 implements jk0 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;

    public kk0() {
        this.a = 1;
        this.d = null;
        this.b = true;
        this.c = true;
    }

    @Override // defpackage.jk0
    public void a(String str, String str2) throws IOException {
        str.getClass();
        str2.getClass();
        d(str, null, null);
        g("%s", str2);
        i();
        synchronized (i90.b) {
        }
    }

    public void b(String str) {
        char[] cArr = b81.c;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                this.d = str;
                this.b = false;
                return;
            }
        }
        this.d = BuildConfig.FLAVOR;
        this.b = true;
    }

    public void c(String str, Object... objArr) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        if (this.c) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
            strEncode.getClass();
            byte[] bytes = strEncode.getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        if (this.b) {
            Charset charset = Charsets.UTF_8;
            byte[] bytes2 = "--".getBytes(charset);
            bytes2.getClass();
            filterOutputStream.write(bytes2);
            byte[] bytes3 = mk0.j.getBytes(charset);
            bytes3.getClass();
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            bytes4.getClass();
            filterOutputStream.write(bytes4);
            this.b = false;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(Charsets.UTF_8);
        bytes5.getClass();
        filterOutputStream.write(bytes5);
    }

    public void d(String str, String str2, String str3) throws IOException {
        if (this.c) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(Charsets.UTF_8);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        c("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            c("; filename=\"%s\"", str2);
        }
        g(BuildConfig.FLAVOR, new Object[0]);
        if (str3 != null) {
            g("%s: %s", "Content-Type", str3);
        }
        g(BuildConfig.FLAVOR, new Object[0]);
    }

    public void e(Uri uri, String str, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        str.getClass();
        uri.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        d(str, str, str2);
        int i = h42.i(i90.a().getContentResolver().openInputStream(uri), filterOutputStream);
        g(BuildConfig.FLAVOR, new Object[0]);
        i();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (i90.b) {
        }
    }

    public void f(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        str.getClass();
        parcelFileDescriptor.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        d(str, str, str2);
        int i = h42.i(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        g(BuildConfig.FLAVOR, new Object[0]);
        i();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        synchronized (i90.b) {
        }
    }

    public void g(String str, Object... objArr) throws IOException {
        c(str, Arrays.copyOf(objArr, objArr.length));
        if (this.c) {
            return;
        }
        c("\r\n", new Object[0]);
    }

    public void h(String str, Object obj, mk0 mk0Var) throws IOException {
        str.getClass();
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        String str2 = mk0.j;
        if (vl0.n(obj)) {
            a(str, vl0.f(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            d(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            g(BuildConfig.FLAVOR, new Object[0]);
            i();
            synchronized (i90.b) {
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            d(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            g(BuildConfig.FLAVOR, new Object[0]);
            i();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            synchronized (i90.b) {
            }
            return;
        }
        if (obj instanceof Uri) {
            e((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            f(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof GraphRequest.ParcelableResourceWithMimeType)) {
            e.g("value is not a supported type.");
            return;
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = (GraphRequest.ParcelableResourceWithMimeType) obj;
        Parcelable parcelable = parcelableResourceWithMimeType.b;
        String str3 = parcelableResourceWithMimeType.a;
        if (parcelable instanceof ParcelFileDescriptor) {
            f(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            e((Uri) parcelable, str, str3);
        } else {
            e.g("value is not a supported type.");
        }
    }

    public void i() throws IOException {
        if (!this.c) {
            g("--%s", mk0.j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.d;
        byte[] bytes = "&".getBytes(Charsets.UTF_8);
        bytes.getClass();
        filterOutputStream.write(bytes);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("switch: false");
                String str = b81.d;
                ts.r(sb, str, "console: true", str, "tag: ");
                ts.r(sb, this.b ? "null" : (String) this.d, str, "head: true", str);
                ts.q(sb, "file: false", str, "dir: ");
                ts.q(sb, null, str, "border: ");
                sb.append(this.c);
                sb.append(str);
                sb.append("consoleFilter: ");
                char[] cArr = b81.c;
                sb.append(cArr[0]);
                sb.append(str);
                sb.append("fileFilter: ");
                sb.append(cArr[0]);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public kk0(FilterOutputStream filterOutputStream, i01 i01Var, boolean z) {
        this.a = 0;
        this.d = filterOutputStream;
        this.b = true;
        this.c = z;
    }
}
