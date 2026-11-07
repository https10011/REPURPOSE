package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class io1 extends zn1 {
    public final /* synthetic */ AtomicReferenceArray g;

    public io1(long j, io1 io1Var, int i) {
        super(j, io1Var, i);
        this.g = new AtomicReferenceArray(ho1.f);
    }

    @Override // defpackage.zn1
    public final int l() {
        return ho1.f;
    }

    @Override // defpackage.zn1
    public final void m(int i, CoroutineContext coroutineContext) {
        this.g.set(i, ho1.e);
        n();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
