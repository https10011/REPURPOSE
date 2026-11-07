package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ec1 {
    public final Object a;
    public volatile Object b;
    public final Object c;
    public final Object d;

    public ec1() {
        this.b = null;
        this.c = new CountDownLatch(1);
        this.d = new LinkedBlockingQueue(1);
        this.a = new Object();
    }

    public void a() {
        if (((jf2) this.b) == null || ((jf2) this.b) == jf2.c || ((jf2) this.b) == jf2.d) {
            ((LinkedBlockingQueue) this.d).offer(this.a);
        }
    }

    public boolean b() {
        return ((jf2) this.b) == jf2.i || ((jf2) this.b) == jf2.f;
    }

    public ec1(String str, wa waVar, Function1 function1, et etVar) {
        this.c = str;
        this.d = function1;
        this.a = new Object();
    }
}
