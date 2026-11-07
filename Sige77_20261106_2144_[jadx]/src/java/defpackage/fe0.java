package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fe0 implements vr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vr
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                ge0 ge0Var = (ge0) obj;
                if (ge0Var == null) {
                    ge0Var = new ge0(-3);
                }
                ((dc2) this.b).J(ge0Var);
                return;
            default:
                ge0 ge0Var2 = (ge0) obj;
                synchronized (he0.c) {
                    try {
                        wq1 wq1Var = he0.d;
                        ArrayList arrayList = (ArrayList) wq1Var.get((String) this.b);
                        if (arrayList == null) {
                            return;
                        }
                        wq1Var.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((vr) arrayList.get(i)).accept(ge0Var2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
