package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class m1 extends zi0 {
    public final AtomicReferenceFieldUpdater f;
    public final AtomicReferenceFieldUpdater g;
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;

    public m1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f = atomicReferenceFieldUpdater;
        this.g = atomicReferenceFieldUpdater2;
        this.h = atomicReferenceFieldUpdater3;
        this.i = atomicReferenceFieldUpdater4;
        this.j = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.zi0
    public final boolean c(p1 p1Var, l1 l1Var, l1 l1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.i;
            if (atomicReferenceFieldUpdater.compareAndSet(p1Var, l1Var, l1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p1Var) == l1Var);
        return false;
    }

    @Override // defpackage.zi0
    public final boolean d(p1 p1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(p1Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p1Var) == obj);
        return false;
    }

    @Override // defpackage.zi0
    public final boolean e(p1 p1Var, o1 o1Var, o1 o1Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.h;
            if (atomicReferenceFieldUpdater.compareAndSet(p1Var, o1Var, o1Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(p1Var) == o1Var);
        return false;
    }

    @Override // defpackage.zi0
    public final void s(o1 o1Var, o1 o1Var2) {
        this.g.lazySet(o1Var, o1Var2);
    }

    @Override // defpackage.zi0
    public final void t(o1 o1Var, Thread thread) {
        this.f.lazySet(o1Var, thread);
    }
}
