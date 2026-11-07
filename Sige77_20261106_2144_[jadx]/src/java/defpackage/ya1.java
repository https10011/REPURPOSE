package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ya1 extends rq0 {
    public final /* synthetic */ int W = 1;
    public final Method X;
    public final int Y;
    public final ls Z;
    public final Object a0;

    public ya1(Method method, int i, ls lsVar, String str) {
        this.X = method;
        this.Y = i;
        this.Z = lsVar;
        this.a0 = str;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.W;
        ls lsVar = this.Z;
        Object obj2 = this.a0;
        Method method = this.X;
        int i2 = this.Y;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    ai1Var.c((Headers) obj2, (RequestBody) lsVar.i(obj));
                    return;
                } catch (IOException e) {
                    throw ta.v(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw ta.v(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ta.v(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ta.v(method, i2, ts.k("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", ts.k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    Headers.b.getClass();
                    ai1Var.c(Headers.Companion.a(strArr), (RequestBody) lsVar.i(value));
                }
                return;
        }
    }

    public ya1(Method method, int i, Headers headers, ls lsVar) {
        this.X = method;
        this.Y = i;
        this.a0 = headers;
        this.Z = lsVar;
    }
}
