package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ul extends zn1 {
    public final mi g;
    public final /* synthetic */ AtomicReferenceArray h;

    public ul(long j, ul ulVar, mi miVar, int i) {
        super(j, ulVar, i);
        this.g = miVar;
        this.h = new AtomicReferenceArray(oi.b * 2);
    }

    @Override // defpackage.zn1
    public final int l() {
        return oi.b;
    }

    @Override // defpackage.zn1
    public final void m(int i, CoroutineContext coroutineContext) {
        mi miVar;
        int i2 = oi.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i * 2);
        while (true) {
            Object objQ = q(i);
            boolean z2 = objQ instanceof s72;
            miVar = this.g;
            if (z2 || (objQ instanceof t72)) {
                if (p(i, objQ, z ? oi.j : oi.k)) {
                    s(i, null);
                    r(i, !z);
                    if (z) {
                        miVar.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (objQ == oi.j || objQ == oi.k) {
                    break;
                }
                if (objQ != oi.g && objQ != oi.f) {
                    if (objQ == oi.i || objQ == oi.d || objQ == oi.l) {
                        return;
                    }
                    sm0.g(objQ, "unexpected state: ");
                    return;
                }
            }
        }
        s(i, null);
        if (z) {
            miVar.getClass();
        }
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            mi miVar = this.g;
            miVar.getClass();
            miVar.J((this.e * ((long) oi.b)) + ((long) i));
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
