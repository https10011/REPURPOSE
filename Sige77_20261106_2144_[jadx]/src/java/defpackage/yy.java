package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class yy implements nq {
    public final /* synthetic */ int a;
    public final /* synthetic */ je1 b;

    public /* synthetic */ yy(je1 je1Var, int i) {
        this.a = i;
        this.b = je1Var;
    }

    @Override // defpackage.nq
    public final Object d(co coVar) {
        int i = this.a;
        je1 je1Var = this.b;
        switch (i) {
            case 0:
                return new az((Context) coVar.a(Context.class), ((hc0) coVar.a(hc0.class)).f(), coVar.c(je1.a(vl0.class)), coVar.e(d00.class), (Executor) coVar.g(je1Var));
            default:
                return FirebaseMessagingRegistrar.a(je1Var, coVar);
        }
    }
}
