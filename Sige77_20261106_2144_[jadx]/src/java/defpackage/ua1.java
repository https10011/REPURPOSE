package defpackage;

import java.io.IOException;
import java.lang.reflect.Method;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ua1 extends rq0 {
    public final Method W;
    public final int X;
    public final ls Y;

    public ua1(Method method, int i, ls lsVar) {
        this.W = method;
        this.X = i;
        this.Y = lsVar;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.X;
        Method method = this.W;
        if (obj == null) {
            throw ta.v(method, i, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            ai1Var.k = (RequestBody) this.Y.i(obj);
        } catch (IOException e) {
            throw ta.w(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
