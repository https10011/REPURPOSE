package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class x5 extends x91 {
    public final AtomicReferenceFieldUpdater e;
    public final AtomicIntegerFieldUpdater f;

    public x5(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.e = atomicReferenceFieldUpdater;
        this.f = atomicIntegerFieldUpdater;
    }

    @Override // defpackage.x91
    public final void j(yo yoVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.e;
            if (atomicReferenceFieldUpdater.compareAndSet(yoVar, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(yoVar) == null);
    }

    @Override // defpackage.x91
    public final int o(yo yoVar) {
        return this.f.decrementAndGet(yoVar);
    }
}
