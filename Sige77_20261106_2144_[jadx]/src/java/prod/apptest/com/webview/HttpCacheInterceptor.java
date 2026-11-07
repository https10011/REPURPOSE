package prod.apptest.com.webview;

import android.text.TextUtils;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.util.Objects;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
class HttpCacheInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Request requestB = chain.b();
        requestB.getClass();
        String strA = requestB.c.a(WebViewCacheInterceptor.KEY_CACHE);
        Response responseA = chain.a(requestB);
        if (!TextUtils.isEmpty(strA)) {
            if (Objects.equals(strA, CacheType.NORMAL.ordinal() + BuildConfig.FLAVOR)) {
                return responseA;
            }
        }
        Response.Builder builderE = responseA.e();
        builderE.f.e("pragma");
        builderE.f.e("Cache-Control");
        Headers.Builder builder = builderE.f;
        builder.getClass();
        _HeadersCommonKt.b("Cache-Control");
        _HeadersCommonKt.c("max-age=3153600000", "Cache-Control");
        builder.e("Cache-Control");
        _HeadersCommonKt.a(builder, "Cache-Control", "max-age=3153600000");
        return builderE.a();
    }
}
