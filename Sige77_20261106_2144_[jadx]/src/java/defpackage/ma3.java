package defpackage;

import io.jsonwebtoken.JwtParser;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ma3 {
    public static final wa a;

    static {
        Object wj2Var;
        ((oj2) jj2.a).getClass();
        AtomicReference atomicReference = sj2.f;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            uj2 uj2Var = (uj2) atomicReference.get();
            wj2Var = new wj2(strReplace, uj2Var.a, uj2Var.b, uj2Var.c);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', JwtParser.SEPARATOR_CHAR);
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            sj2 sj2Var = new sj2(strReplace);
            if (sj2.c || sj2.d) {
                sj2Var.b = new vj2(strReplace);
            } else if (sj2.e) {
                uj2 uj2Var2 = wj2.v;
                sj2Var.b = new wj2(strReplace, Level.OFF, uj2Var2.b, uj2Var2.c);
            } else {
                sj2Var.b = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = qj2.a;
            concurrentLinkedQueue.offer(sj2Var);
            wj2Var = sj2Var;
            if (atomicReference.get() != null) {
                while (true) {
                    sj2 sj2Var2 = (sj2) concurrentLinkedQueue.poll();
                    if (sj2Var2 == null) {
                        break;
                    }
                    uj2 uj2Var3 = (uj2) atomicReference.get();
                    sj2Var2.b = new wj2((String) sj2Var2.a, uj2Var3.a, uj2Var3.b, uj2Var3.c);
                }
                sj2.F();
                wj2Var = sj2Var;
            }
        }
        a = new wa(wj2Var, 2);
    }
}
