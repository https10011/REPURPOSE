package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oo3 implements Runnable {
    public final /* synthetic */ Ref.ObjectRef a;
    public final /* synthetic */ bo3 b;
    public final /* synthetic */ yk c;

    public oo3(Ref.ObjectRef objectRef, bo3 bo3Var, yk ykVar) {
        this.a = objectRef;
        this.b = bo3Var;
        this.c = ykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.element != null) {
            ur.a();
            return;
        }
        yk ykVar = this.c;
        zn3 zn3VarC = vm3.c();
        bo3 bo3VarB = vm3.b(zn3VarC, this.b);
        try {
            ykVar.run();
            Unit unit = Unit.a;
            vm3.b(zn3VarC, bo3VarB);
        } catch (Throwable th) {
            try {
                pm3.a(th);
                throw th;
            } catch (Throwable th2) {
                vm3.b(zn3VarC, bo3VarB);
                throw th2;
            }
        }
    }

    public final String toString() {
        yk ykVar = this.c;
        StringBuilder sb = new StringBuilder(ykVar.toString().length() + 14);
        sb.append("propagating=[");
        sb.append(ykVar);
        sb.append("]");
        return sb.toString();
    }
}
