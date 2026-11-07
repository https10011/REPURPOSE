package defpackage;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k81 extends ResponseBody {
    public final MediaType d;
    public final long e;

    public k81(MediaType mediaType, long j) {
        this.d = mediaType;
        this.e = j;
    }

    public final long a() {
        return this.e;
    }

    public final MediaType b() {
        return this.d;
    }

    public final ri e() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
