package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ao1 {
    public static final yn1 a = new yn1(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(yn1 yn1Var) {
        yn1Var.getClass();
        if (yn1Var.f != null || yn1Var.g != null) {
            e.g("Failed requirement.");
            return;
        }
        if (yn1Var.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        yn1 yn1Var2 = a;
        yn1 yn1Var3 = (yn1) atomicReference.getAndSet(yn1Var2);
        if (yn1Var3 == yn1Var2) {
            return;
        }
        int i = yn1Var3 != null ? yn1Var3.c : 0;
        if (i >= 65536) {
            atomicReference.set(yn1Var3);
            return;
        }
        yn1Var.f = yn1Var3;
        yn1Var.b = 0;
        yn1Var.c = i + 8192;
        atomicReference.set(yn1Var);
    }

    public static final yn1 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        yn1 yn1Var = a;
        yn1 yn1Var2 = (yn1) atomicReference.getAndSet(yn1Var);
        if (yn1Var2 == yn1Var) {
            return new yn1();
        }
        if (yn1Var2 == null) {
            atomicReference.set(null);
            return new yn1();
        }
        atomicReference.set(yn1Var2.f);
        yn1Var2.f = null;
        yn1Var2.c = 0;
        return yn1Var2;
    }
}
