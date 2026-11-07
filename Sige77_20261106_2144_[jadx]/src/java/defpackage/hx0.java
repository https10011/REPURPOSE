package defpackage;

import com.linecorp.linesdk.LineApiError;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hx0 implements fx0 {
    public static final ix0 e = ix0.a(jx0.f, new LineApiError("access token is null"));
    public final String a;
    public final mx0 b;
    public final jw1 c;
    public final ac2 d;

    public hx0(String str, mx0 mx0Var, jw1 jw1Var, ac2 ac2Var) {
        this.a = str;
        this.b = mx0Var;
        this.c = jw1Var;
        this.d = ac2Var;
    }

    @Override // defpackage.fx0
    public final ix0 a() {
        return c(new ab(this, 12));
    }

    @Override // defpackage.fx0
    public final ix0 b(nx0 nx0Var) {
        return c(new eg(9, this, nx0Var));
    }

    public final ix0 c(gx0 gx0Var) {
        try {
            er0 er0VarZ = this.d.z();
            return er0VarZ == null ? e : gx0Var.c(er0VarZ);
        } catch (Exception e2) {
            return ix0.a(jx0.f, new LineApiError("get access token fail:" + e2.getMessage()));
        }
    }
}
