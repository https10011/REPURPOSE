package defpackage;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.internal.zzx;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cl2 extends en2 {
    public final EmailAuthCredential n;
    public final String o;

    public cl2(EmailAuthCredential emailAuthCredential, String str) {
        super(2);
        gu2.p(emailAuthCredential, "credential cannot be null");
        this.n = emailAuthCredential;
        gu2.m(emailAuthCredential.a, "email cannot be null");
        gu2.m(emailAuthCredential.b, "password cannot be null");
        this.o = str;
    }

    @Override // defpackage.en2
    public final String a() {
        return "linkEmailAuthCredential";
    }

    @Override // defpackage.en2
    public final void d(TaskCompletionSource taskCompletionSource, gm2 gm2Var) {
        this.g = new yd2(9, this, taskCompletionSource);
        EmailAuthCredential emailAuthCredential = this.n;
        String str = emailAuthCredential.a;
        String str2 = emailAuthCredential.b;
        gu2.l(str2);
        String strE0 = this.d.e0();
        String strT = this.d.T();
        gm2Var.getClass();
        gu2.l(str);
        gu2.l(str2);
        gu2.l(strE0);
        kj0 kj0Var = this.b;
        gu2.o(kj0Var);
        ox1 ox1Var = gm2Var.a;
        rd2 rd2Var = new rd2(kj0Var, gm2.b);
        ox1Var.getClass();
        gu2.l(str);
        gu2.l(str2);
        gu2.l(strE0);
        qp0 qp0Var = new qp0();
        qp0Var.a = str;
        qp0Var.b = str2;
        qp0Var.c = strT;
        qp0Var.d = this.o;
        qp0Var.e = rd2Var;
        Objects.requireNonNull(ox1Var);
        qp0Var.f = ox1Var;
        ox1Var.A(strE0, qp0Var);
    }

    @Override // defpackage.en2
    public final void e() {
        FirebaseUser firebaseUserN = md2.n(this.c, this.i);
        this.e.b(this.h, firebaseUserN);
        f(new zzx(firebaseUserN));
    }
}
