package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class ck0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ z9 c;

    public /* synthetic */ ck0(String str, z9 z9Var, int i) {
        this.a = i;
        this.b = str;
        this.c = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        z9 z9Var = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                if (!mt.a.contains(ek0.class)) {
                    try {
                        ek0.a.c(str, z9Var);
                    } catch (Throwable th) {
                        mt.a(ek0.class, th);
                        return;
                    }
                    break;
                }
                break;
            default:
                Set set = mt.a;
                if (!set.contains(b91.class)) {
                    try {
                        List listA = a.a(z9Var);
                        sh1 sh1Var = sh1.b;
                        if (!set.contains(sh1.class)) {
                            try {
                                listA.getClass();
                                sh1.b.h(str, listA, 2);
                            } catch (Throwable th2) {
                                mt.a(sh1.class, th2);
                            }
                        }
                    } catch (Throwable th3) {
                        mt.a(b91.class, th3);
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
