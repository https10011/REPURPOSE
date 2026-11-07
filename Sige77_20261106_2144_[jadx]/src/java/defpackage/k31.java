package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class k31 implements sw0 {
    public final /* synthetic */ p11 a;
    public final /* synthetic */ lw0 b;
    public final /* synthetic */ c41 c;

    public /* synthetic */ k31(p11 p11Var, lw0 lw0Var, c41 c41Var) {
        this.a = p11Var;
        this.b = lw0Var;
        this.c = c41Var;
    }

    @Override // defpackage.sw0
    public final void a(ww0 ww0Var, kw0 kw0Var) {
        kw0 kw0Var2;
        p11 p11Var = this.a;
        p11Var.getClass();
        Runnable runnable = (Runnable) p11Var.b;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) p11Var.c;
        kw0.Companion.getClass();
        lw0 lw0Var = this.b;
        lw0Var.getClass();
        int iOrdinal = lw0Var.ordinal();
        kw0 kw0Var3 = null;
        if (iOrdinal == 2) {
            kw0Var2 = kw0.ON_CREATE;
        } else if (iOrdinal != 3) {
            kw0Var2 = iOrdinal != 4 ? null : kw0.ON_RESUME;
        } else {
            kw0Var2 = kw0.ON_START;
        }
        c41 c41Var = this.c;
        if (kw0Var == kw0Var2) {
            copyOnWriteArrayList.add(c41Var);
            runnable.run();
            return;
        }
        kw0 kw0Var4 = kw0.ON_DESTROY;
        if (kw0Var == kw0Var4) {
            p11Var.n(c41Var);
            return;
        }
        int iOrdinal2 = lw0Var.ordinal();
        if (iOrdinal2 == 2) {
            kw0Var3 = kw0Var4;
        } else if (iOrdinal2 == 3) {
            kw0Var3 = kw0.ON_STOP;
        } else if (iOrdinal2 == 4) {
            kw0Var3 = kw0.ON_PAUSE;
        }
        if (kw0Var == kw0Var3) {
            copyOnWriteArrayList.remove(c41Var);
            runnable.run();
        }
    }
}
