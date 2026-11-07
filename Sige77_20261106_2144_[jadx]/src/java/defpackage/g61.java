package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g61 implements nk, s72 {
    public final pk a;
    public final /* synthetic */ h61 b;

    public g61(h61 h61Var, pk pkVar) {
        this.b = h61Var;
        this.a = pkVar;
    }

    @Override // defpackage.s72
    public final void a(zn1 zn1Var, int i) {
        this.a.a(zn1Var, i);
    }

    @Override // defpackage.nk
    public final void c(Object obj, xg0 xg0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h61.i;
        h61 h61Var = this.b;
        atomicReferenceFieldUpdater.set(h61Var, null);
        c0 c0Var = new c0(h61Var, this);
        pk pkVar = this.a;
        pkVar.D((Unit) obj, pkVar.c, new ok(c0Var, 0));
    }

    @Override // defpackage.nk
    public final vy2 d(Object obj, xg0 xg0Var) {
        h61 h61Var = this.b;
        ok okVar = new ok(h61Var, this);
        vy2 vy2VarG = this.a.G((Unit) obj, okVar);
        if (vy2VarG != null) {
            h61.i.set(h61Var, null);
        }
        return vy2VarG;
    }

    @Override // defpackage.nk
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // defpackage.fs
    public final CoroutineContext getContext() {
        return this.a.e;
    }

    @Override // defpackage.fs
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
