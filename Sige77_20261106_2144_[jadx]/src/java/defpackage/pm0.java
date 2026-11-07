package defpackage;

import okhttp3.Call;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pm0 extends rm0 {
    public final yj d;
    public final boolean e;

    public pm0(fi1 fi1Var, Call.Factory factory, ls lsVar, yj yjVar, boolean z) {
        super(fi1Var, factory, lsVar);
        this.d = yjVar;
        this.e = z;
    }

    @Override // defpackage.rm0
    public final Object b(l81 l81Var, Object[] objArr) {
        wj wjVar = (wj) this.d.l(l81Var);
        fs fsVar = (fs) objArr[objArr.length - 1];
        try {
            try {
                if (!this.e) {
                    return am2.i(wjVar, fsVar);
                }
                try {
                    wjVar.getClass();
                    return am2.j(wjVar, fsVar);
                } catch (LinkageError e) {
                    throw e;
                } catch (ThreadDeath e2) {
                    throw e2;
                }
            } catch (LinkageError | ThreadDeath | VirtualMachineError e3) {
                throw e3;
            }
        } catch (Throwable th) {
            am2.X(th, fsVar);
            return ft.a;
        }
    }
}
