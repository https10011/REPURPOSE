package defpackage;

import com.hjq.toast.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xj1 {
    public Call.Factory a;
    public HttpUrl b;
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public final void a(String str) {
        HttpUrl.j.getClass();
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.b((HttpUrl) null, str);
        HttpUrl httpUrlA = builder.a();
        ArrayList arrayList = httpUrlA.f;
        if (BuildConfig.FLAVOR.equals(arrayList.get(arrayList.size() - 1))) {
            this.b = httpUrlA;
        } else {
            ur.g(httpUrlA, "baseUrl must end in /: ");
        }
    }

    public final yj1 b() {
        if (this.b == null) {
            uq1.q("Base URL required.");
            return null;
        }
        OkHttpClient okHttpClient = this.a;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        OkHttpClient okHttpClient2 = okHttpClient;
        r6 r6Var = rb1.a;
        vi viVar = rb1.c;
        ArrayList arrayList = new ArrayList(this.d);
        List listA = viVar.a(r6Var);
        arrayList.addAll(listA);
        List listD = viVar.d();
        int size = listD.size();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1 + size);
        arrayList3.add(new wi(0));
        arrayList3.addAll(arrayList2);
        arrayList3.addAll(listD);
        HttpUrl httpUrl = this.b;
        List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
        List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
        listA.size();
        return new yj1(okHttpClient2, httpUrl, listUnmodifiableList, listUnmodifiableList2, r6Var);
    }
}
