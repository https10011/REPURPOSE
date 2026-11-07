package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pr3 {
    public final /* synthetic */ int a;

    public /* synthetic */ pr3(int i) {
        this.a = i;
    }

    public final void a(pq3 pq3Var, Iterator it, lr3 lr3Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (!pq3Var.c) {
                    uq1.q("non repeating key");
                } else if (pq3Var.d && ((mk2) mk2.b.get()).a > 20) {
                    while (it.hasNext()) {
                        lr3Var.a(it.next(), pq3Var.a);
                    }
                } else {
                    pq3Var.a(it, lr3Var);
                }
                break;
        }
    }

    private final void b(pq3 pq3Var, Iterator it, lr3 lr3Var) {
    }
}
