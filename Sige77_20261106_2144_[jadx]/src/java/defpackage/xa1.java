package defpackage;

import java.lang.reflect.Method;
import okhttp3.Headers;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xa1 extends rq0 {
    public final /* synthetic */ int W;
    public final Method X;
    public final int Y;

    public /* synthetic */ xa1(Method method, int i, int i2) {
        this.W = i2;
        this.X = method;
        this.Y = i;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.W;
        int i2 = this.Y;
        Method method = this.X;
        switch (i) {
            case 0:
                Headers headers = (Headers) obj;
                if (headers == null) {
                    throw ta.v(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                Headers.Builder builder = ai1Var.f;
                builder.getClass();
                int size = headers.size();
                for (int i3 = 0; i3 < size; i3++) {
                    _HeadersCommonKt.a(builder, headers.b(i3), headers.e(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw ta.v(method, i2, "@Url parameter is null.", new Object[0]);
                }
                ai1Var.c = obj.toString();
                return;
        }
    }
}
