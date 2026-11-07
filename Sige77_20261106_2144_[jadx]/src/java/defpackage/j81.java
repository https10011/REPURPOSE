package defpackage;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j81 extends ResponseBody {
    public final ResponseBody d;
    public final mf1 e;
    public IOException f;

    public j81(ResponseBody responseBody) {
        this.d = responseBody;
        this.e = new mf1(new i81(this, responseBody.e()));
    }

    public final long a() {
        return this.d.a();
    }

    public final MediaType b() {
        return this.d.b();
    }

    public final void close() {
        this.d.close();
    }

    public final ri e() {
        return this.e;
    }
}
