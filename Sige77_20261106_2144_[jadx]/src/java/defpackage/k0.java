package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k0 extends xi0 {
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;

    public k0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.h = atomicReferenceFieldUpdater;
        this.i = atomicReferenceFieldUpdater2;
        this.j = atomicReferenceFieldUpdater3;
        this.k = atomicReferenceFieldUpdater4;
        this.l = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.xi0
    public final boolean c(v0 v0Var, j0 j0Var, j0 j0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.k;
            if (atomicReferenceFieldUpdater.compareAndSet(v0Var, j0Var, j0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v0Var) == j0Var);
        return false;
    }

    @Override // defpackage.xi0
    public final boolean d(v0 v0Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.l;
            if (atomicReferenceFieldUpdater.compareAndSet(v0Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v0Var) == obj);
        return false;
    }

    @Override // defpackage.xi0
    public final boolean e(v0 v0Var, u0 u0Var, u0 u0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(v0Var, u0Var, u0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(v0Var) == u0Var);
        return false;
    }

    @Override // defpackage.xi0
    public final j0 h(v0 v0Var) {
        return (j0) this.k.getAndSet(v0Var, j0.d);
    }

    @Override // defpackage.xi0
    public final u0 i(v0 v0Var) {
        return (u0) this.j.getAndSet(v0Var, u0.c);
    }

    @Override // defpackage.xi0
    public final void u(u0 u0Var, u0 u0Var2) {
        this.i.lazySet(u0Var, u0Var2);
    }

    @Override // defpackage.xi0
    public final void v(u0 u0Var, Thread thread) {
        this.h.lazySet(u0Var, thread);
    }
}
