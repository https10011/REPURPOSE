package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class je extends bt0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(je.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long Y = fe3.a.objectFieldOffset(je.class.getDeclaredField("_disposer$volatile"));
    public final /* synthetic */ le W;
    private volatile /* synthetic */ Object _disposer$volatile;
    public final pk v;
    public n20 w;

    public je(le leVar, pk pkVar) {
        this.W = leVar;
        this.v = pkVar;
    }

    @Override // defpackage.bt0
    public final boolean q() {
        return false;
    }

    @Override // defpackage.bt0
    public final void r(Throwable th) {
        pk pkVar = this.v;
        if (th != null) {
            vy2 vy2VarG = pkVar.G(new vp(th, false), null);
            if (vy2VarG != null) {
                pkVar.f(vy2VarG);
                ke keVarS = s();
                if (keVarS != null) {
                    keVarS.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = le.b;
        le leVar = this.W;
        if (atomicIntegerFieldUpdater.decrementAndGet(leVar) == 0) {
            e00[] e00VarArr = leVar.a;
            ArrayList arrayList = new ArrayList(e00VarArr.length);
            for (e00 e00Var : e00VarArr) {
                arrayList.add(e00Var.getCompleted());
            }
            pj1 pj1Var = rj1.b;
            pkVar.resumeWith(arrayList);
        }
    }

    public final ke s() {
        X.getClass();
        return (ke) fe3.a.getObjectVolatile(this, Y);
    }

    public final void t(ke keVar) {
        X.getClass();
        fe3.a.putObjectVolatile(this, Y, keVar);
    }
}
