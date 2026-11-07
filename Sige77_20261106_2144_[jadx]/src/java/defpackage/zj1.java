package defpackage;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;
import prod.apptest.com.AppTestApp;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zj1 implements Interceptor {
    public final /* synthetic */ int a;

    public /* synthetic */ zj1(int i) {
        this.a = i;
    }

    public final Response intercept(Interceptor.Chain chain) {
        switch (this.a) {
            case 0:
                RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
                Request request = realInterceptorChain.e;
                Request.Builder builderA = request.a();
                builderA.a("User-Agent", ak1.a);
                builderA.a("Cache-Control", "no-cache");
                builderA.a("Merchant", AppTestApp.Y);
                builderA.b(request.b, request.d);
                return realInterceptorChain.a(new Request(builderA));
            default:
                RealInterceptorChain realInterceptorChain2 = (RealInterceptorChain) chain;
                Request request2 = realInterceptorChain2.e;
                Request.Builder builderA2 = request2.a();
                builderA2.a("User-Agent", ak1.a);
                builderA2.a("Cache-Control", "no-cache");
                builderA2.a("Merchant", AppTestApp.Y);
                builderA2.b(request2.b, request2.d);
                return realInterceptorChain2.a(new Request(builderA2));
        }
    }
}
