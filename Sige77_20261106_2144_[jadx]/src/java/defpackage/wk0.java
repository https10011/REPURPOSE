package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wk0 extends ks {
    public final uk0 a;

    public wk0(uk0 uk0Var) {
        this.a = uk0Var;
    }

    @Override // defpackage.ks
    public final ls a(Type type) {
        s12 s12Var = new s12(type);
        uk0 uk0Var = this.a;
        return new xk0(uk0Var, uk0Var.b(s12Var));
    }

    @Override // defpackage.ks
    public final ls b(Type type, Annotation[] annotationArr, yj1 yj1Var) {
        s12 s12Var = new s12(type);
        uk0 uk0Var = this.a;
        return new nl1(uk0Var, uk0Var.b(s12Var));
    }
}
