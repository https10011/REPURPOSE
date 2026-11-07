package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p81 implements lw, Callback {
    public final Call.Factory a;
    public final jj0 b;
    public bs c;
    public ResponseBody d;
    public kw e;
    public volatile Call f;

    public p81(Call.Factory factory, jj0 jj0Var) {
        this.a = factory;
        this.b = jj0Var;
    }

    @Override // defpackage.lw
    public final Class a() {
        return InputStream.class;
    }

    public final void b(Call call, Response response) {
        ResponseBody responseBody = response.i;
        this.d = responseBody;
        if (!response.d0) {
            this.e.b(new tn(response.c, response.d, null));
            return;
        }
        am2.p(responseBody, "Argument must not be null");
        bs bsVar = new bs(this.d.e().Q(), responseBody.a());
        this.c = bsVar;
        this.e.c(bsVar);
    }

    public final void c(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.e.b(iOException);
    }

    @Override // defpackage.lw
    public final void cancel() {
        Call call = this.f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.lw
    public final void h() {
        try {
            bs bsVar = this.c;
            if (bsVar != null) {
                bsVar.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.e = null;
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        Request.Builder builder = new Request.Builder();
        builder.c(this.b.d());
        for (Map.Entry entry : this.b.b.a().entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            builder.c.a(str, str2);
        }
        Request request = new Request(builder);
        this.e = kwVar;
        this.f = this.a.a(request);
        this.f.s(this);
    }

    @Override // defpackage.lw
    public final int j() {
        return 2;
    }
}
