package defpackage;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xk0 implements ls {
    public static final MediaType c;
    public final uk0 a;
    public final l02 b;

    static {
        MediaType.e.getClass();
        c = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public xk0(uk0 uk0Var, l02 l02Var) {
        this.a = uk0Var;
        this.b = l02Var;
    }

    @Override // defpackage.ls
    public final Object i(Object obj) throws IOException {
        ji jiVar = new ji();
        eu0 eu0VarC = this.a.c(new OutputStreamWriter(new ii(jiVar), StandardCharsets.UTF_8));
        this.b.c(eu0VarC, obj);
        eu0VarC.close();
        rj rjVarK = jiVar.k(jiVar.b);
        RequestBody.a.getClass();
        rjVarK.getClass();
        return new RequestBody.Companion.toRequestBody.1(c, rjVarK);
    }
}
