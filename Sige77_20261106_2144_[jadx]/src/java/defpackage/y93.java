package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y93 {
    public static final Object j = new Object();
    public static final AtomicReference k = new AtomicReference();
    public static volatile y93 l = null;
    public static final cv1 m = ia.j(nk1.v);
    public final u23 a = new u23();
    public final Context b;
    public final cv1 c;
    public final cv1 d;
    public final cv1 e;
    public final cv1 f;
    public final ch3 g;
    public final cv1 h;
    public final gg3 i;

    public y93(Context context, cv1 cv1Var, cv1 cv1Var2, cv1 cv1Var3, cv1 cv1Var4, cv1 cv1Var5) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        cv1Var.getClass();
        cv1Var2.getClass();
        cv1Var3.getClass();
        cv1Var4.getClass();
        cv1Var5.getClass();
        cv1 cv1VarJ = ia.j(cv1Var);
        cv1 cv1VarJ2 = ia.j(cv1Var2);
        cv1 cv1VarJ3 = ia.j(new k93(cv1Var3));
        cv1 cv1VarJ4 = ia.j(cv1Var4);
        cv1 cv1VarJ5 = ia.j(cv1Var5);
        this.b = applicationContext;
        this.c = cv1VarJ;
        this.d = cv1VarJ2;
        this.e = cv1VarJ3;
        this.f = cv1VarJ4;
        this.g = new ch3(applicationContext, cv1VarJ, cv1VarJ4, cv1VarJ2);
        this.h = cv1VarJ5;
        this.i = new gg3(applicationContext, cv1VarJ, cv1VarJ3, cv1VarJ2);
    }

    public static void b() {
        synchronized (kv.d) {
        }
        if (k.get() == null && kv.e == null) {
            kv.e = new nc0(5);
        }
    }

    public final q51 a() {
        return (q51) this.c.get();
    }
}
