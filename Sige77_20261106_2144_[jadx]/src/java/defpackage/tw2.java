package defpackage;

import androidx.fragment.app.c;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tw2 {
    public static final tw2 c = new tw2();
    public final ev2 a;
    public final ci b;

    public tw2() {
        ev2 ev2Var = ev2.d;
        if (ci.c == null) {
            ci ciVar = new ci();
            ciVar.a = false;
            ci.c = ciVar;
        }
        ci ciVar2 = ci.c;
        this.a = ev2Var;
        this.b = ciVar2;
    }

    public final void a(c cVar) {
        ev2 ev2Var = this.a;
        ev2Var.getClass();
        ev2.b(cVar.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        ev2Var.a = null;
        ev2Var.b = 0L;
    }
}
