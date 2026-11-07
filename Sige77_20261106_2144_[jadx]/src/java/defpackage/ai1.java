package defpackage;

import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ai1 {
    public static final char[] l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final Pattern m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;
    public final HttpUrl b;
    public String c;
    public HttpUrl.Builder d;
    public final Request.Builder e = new Request.Builder();
    public final Headers.Builder f;
    public MediaType g;
    public final boolean h;
    public final MultipartBody.Builder i;
    public final FormBody.Builder j;
    public RequestBody k;

    public ai1(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = httpUrl;
        this.c = str2;
        this.g = mediaType;
        this.h = z;
        if (headers != null) {
            this.f = headers.c();
        } else {
            this.f = new Headers.Builder();
        }
        if (z2) {
            this.j = new FormBody.Builder();
            return;
        }
        if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.i = builder;
            MediaType mediaType2 = MultipartBody.g;
            mediaType2.getClass();
            if (Intrinsics.areEqual(mediaType2.b, "multipart")) {
                builder.b = mediaType2;
            } else {
                throw new IllegalArgumentException(("multipart != " + mediaType2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z) {
        FormBody.Builder builder = this.j;
        if (z) {
            builder.getClass();
            str.getClass();
            builder.a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        builder.getClass();
        str.getClass();
        builder.a.add(_UrlKt.b(str, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        builder.b.add(_UrlKt.b(str2, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                MediaType.e.getClass();
                this.g = MediaType.Companion.a(str2);
                return;
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException(ts.j("Malformed content type: ", str2), e);
            }
        }
        Headers.Builder builder = this.f;
        if (!z) {
            builder.a(str, str2);
            return;
        }
        builder.getClass();
        str.getClass();
        str2.getClass();
        _HeadersCommonKt.b(str);
        _HeadersCommonKt.a(builder, str, str2);
    }

    public final void c(Headers headers, RequestBody requestBody) {
        MultipartBody.Builder builder = this.i;
        builder.getClass();
        requestBody.getClass();
        MultipartBody.Part.c.getClass();
        if (headers.a("Content-Type") != null) {
            e.g("Unexpected header: Content-Type");
        } else if (headers.a("Content-Length") != null) {
            e.g("Unexpected header: Content-Length");
        } else {
            builder.c.add(new MultipartBody.Part(headers, requestBody));
        }
    }

    public final void d(String str, String str2, boolean z) {
        HttpUrl.Builder builder;
        String str3 = this.c;
        if (str3 != null) {
            HttpUrl httpUrl = this.b;
            httpUrl.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.b(httpUrl, str3);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            this.d = builder;
            if (builder == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                uq1.j(sb, ", Relative: ", this.c);
                return;
            }
            this.c = null;
        }
        HttpUrl.Builder builder2 = this.d;
        if (z) {
            builder2.getClass();
            str.getClass();
            if (builder2.g == null) {
                builder2.g = new ArrayList();
            }
            ArrayList arrayList = builder2.g;
            arrayList.getClass();
            arrayList.add(_UrlKt.a(str, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = builder2.g;
            arrayList2.getClass();
            arrayList2.add(str2 != null ? _UrlKt.a(str2, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        builder2.getClass();
        str.getClass();
        if (builder2.g == null) {
            builder2.g = new ArrayList();
        }
        ArrayList arrayList3 = builder2.g;
        arrayList3.getClass();
        arrayList3.add(_UrlKt.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = builder2.g;
        arrayList4.getClass();
        arrayList4.add(str2 != null ? _UrlKt.a(str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }
}
