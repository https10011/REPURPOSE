package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Reflection;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class l81 implements wj {
    public final fi1 a;
    public final Object b;
    public final Object[] c;
    public final Call.Factory d;
    public final ls e;
    public volatile boolean f;
    public Call i;
    public Throwable v;
    public boolean w;

    public l81(fi1 fi1Var, Object obj, Object[] objArr, Call.Factory factory, ls lsVar) {
        this.a = fi1Var;
        this.b = obj;
        this.c = objArr;
        this.d = factory;
        this.e = lsVar;
    }

    @Override // defpackage.wj
    public final gj1 a() {
        Call callD;
        synchronized (this) {
            if (this.w) {
                throw new IllegalStateException("Already executed.");
            }
            this.w = true;
            callD = d();
        }
        if (this.f) {
            callD.cancel();
        }
        return f(callD.a());
    }

    @Override // defpackage.wj
    public final synchronized Request b() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return d().b();
    }

    public final Call c() {
        HttpUrl.Builder builder;
        HttpUrl httpUrlA;
        fi1 fi1Var = this.a;
        rq0[] rq0VarArr = fi1Var.j;
        Object[] objArr = this.c;
        int length = objArr.length;
        if (length != rq0VarArr.length) {
            e.g(ts.h(rq0VarArr.length, ")", ck1.u(length, "Argument count (", ") doesn't match expected count (")));
            return null;
        }
        ai1 ai1Var = new ai1(fi1Var.c, fi1Var.b, fi1Var.d, fi1Var.e, fi1Var.f, fi1Var.g, fi1Var.h, fi1Var.i);
        if (fi1Var.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            rq0VarArr[i].j(ai1Var, objArr[i]);
        }
        HttpUrl.Builder builder2 = ai1Var.d;
        if (builder2 != null) {
            httpUrlA = builder2.a();
        } else {
            String str = ai1Var.c;
            HttpUrl httpUrl = ai1Var.b;
            httpUrl.getClass();
            str.getClass();
            try {
                builder = new HttpUrl.Builder();
                builder.b(httpUrl, str);
            } catch (IllegalArgumentException unused) {
                builder = null;
            }
            httpUrlA = builder != null ? builder.a() : null;
            if (httpUrlA == null) {
                StringBuilder sb = new StringBuilder("Malformed URL. Base: ");
                sb.append(httpUrl);
                uq1.j(sb, ", Relative: ", ai1Var.c);
                return null;
            }
        }
        FormBody zh1Var = ai1Var.k;
        if (zh1Var == null) {
            FormBody.Builder builder3 = ai1Var.j;
            if (builder3 != null) {
                zh1Var = new FormBody(builder3.a, builder3.b);
            } else {
                MultipartBody.Builder builder4 = ai1Var.i;
                if (builder4 != null) {
                    ArrayList arrayList2 = builder4.c;
                    if (arrayList2.isEmpty()) {
                        uq1.q("Multipart body must have at least one part.");
                        return null;
                    }
                    zh1Var = new MultipartBody(builder4.a, builder4.b, _UtilJvmKt.j(arrayList2));
                } else if (ai1Var.h) {
                    RequestBody.a.getClass();
                    _UtilCommonKt.a(0L, 0L, 0L);
                    zh1Var = new RequestBody.Companion.toRequestBody.3(new byte[0], 0);
                }
            }
        }
        MediaType mediaType = ai1Var.g;
        Headers.Builder builder5 = ai1Var.f;
        if (mediaType != null) {
            if (zh1Var != null) {
                zh1Var = new zh1(zh1Var, mediaType);
            } else {
                builder5.a("Content-Type", mediaType.a);
            }
        }
        Request.Builder builder6 = ai1Var.e;
        builder6.getClass();
        builder6.a = httpUrlA;
        builder6.c = builder5.c().c();
        builder6.b(ai1Var.a, zh1Var);
        wr0 wr0Var = new wr0(this.b, fi1Var.a, arrayList);
        ju0 orCreateKotlinClass = Reflection.getOrCreateKotlinClass(wr0.class);
        orCreateKotlinClass.getClass();
        builder6.e = builder6.e.b(orCreateKotlinClass, wr0Var);
        return this.d.a(new Request(builder6));
    }

    @Override // defpackage.wj
    public final void cancel() {
        Call call;
        this.f = true;
        synchronized (this) {
            call = this.i;
        }
        if (call != null) {
            call.cancel();
        }
    }

    @Override // defpackage.wj
    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final wj mo4clone() {
        return new l81(this.a, this.b, this.c, this.d, this.e);
    }

    public final Call d() throws IOException {
        Call call = this.i;
        if (call != null) {
            return call;
        }
        Throwable th = this.v;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            Call callC = c();
            this.i = callC;
            return callC;
        } catch (IOException | Error | RuntimeException e) {
            ta.F(e);
            this.v = e;
            throw e;
        }
    }

    @Override // defpackage.wj
    public final boolean e() {
        boolean z = true;
        if (this.f) {
            return true;
        }
        synchronized (this) {
            try {
                Call call = this.i;
                if (call == null || !call.e()) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final gj1 f(Response response) throws IOException {
        ResponseBody responseBody = response.i;
        Response.Builder builderE = response.e();
        builderE.g = new k81(responseBody.b(), responseBody.a());
        Response responseA = builderE.a();
        boolean z = responseA.d0;
        int i = responseA.d;
        if (i < 200 || i >= 300) {
            try {
                ji jiVar = new ji();
                responseBody.e().r(jiVar);
                MediaType mediaTypeB = responseBody.b();
                long jA = responseBody.a();
                ResponseBody.b.getClass();
                ResponseBody.Companion.asResponseBody.1 r3 = new ResponseBody.Companion.asResponseBody.1(mediaTypeB, jA, jiVar);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                gj1 gj1Var = new gj1(responseA, null, r3);
                responseBody.close();
                return gj1Var;
            } catch (Throwable th) {
                responseBody.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            responseBody.close();
            if (z) {
                return new gj1(responseA, null, null);
            }
            e.g("rawResponse must be successful response");
            return null;
        }
        j81 j81Var = new j81(responseBody);
        try {
            Object objI = this.e.i(j81Var);
            if (z) {
                return new gj1(responseA, objI, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = j81Var.f;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // defpackage.wj
    public final void w(ak akVar) {
        Call call;
        Throwable th;
        synchronized (this) {
            try {
                if (this.w) {
                    throw new IllegalStateException("Already executed.");
                }
                this.w = true;
                call = this.i;
                th = this.v;
                if (call == null && th == null) {
                    try {
                        Call callC = c();
                        this.i = callC;
                        call = callC;
                    } catch (Throwable th2) {
                        th = th2;
                        ta.F(th);
                        this.v = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            akVar.r(this, th);
            return;
        }
        if (this.f) {
            call.cancel();
        }
        call.s(new dc2(this, akVar, false));
    }

    public final Object clone() {
        return new l81(this.a, this.b, this.c, this.d, this.e);
    }
}
