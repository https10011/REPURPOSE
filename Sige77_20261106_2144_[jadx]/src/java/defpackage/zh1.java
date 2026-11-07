package defpackage;

import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zh1 extends RequestBody {
    public final RequestBody b;
    public final MediaType c;

    public zh1(RequestBody requestBody, MediaType mediaType) {
        this.b = requestBody;
        this.c = mediaType;
    }

    public final long a() {
        return this.b.a();
    }

    public final MediaType b() {
        return this.c;
    }

    public final void d(qi qiVar) {
        this.b.d(qiVar);
    }
}
