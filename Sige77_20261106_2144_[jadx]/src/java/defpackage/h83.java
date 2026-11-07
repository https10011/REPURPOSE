package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzoo;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h83 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ w93 c;

    public h83(w93 w93Var, AtomicReference atomicReference, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = atomicReference;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                this.b = atomicReference;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = atomicReference;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                this.b = atomicReference;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
            default:
                this.b = atomicReference;
                Objects.requireNonNull(w93Var);
                this.c = w93Var;
                break;
        }
    }

    private final void a() {
        AtomicReference atomicReference = this.b;
        synchronized (atomicReference) {
            try {
                try {
                    y53 y53Var = (y53) this.c.a;
                    atomicReference.set(Double.valueOf(y53Var.d.O(y53Var.q().K(), h13.e0)));
                    this.b.notify();
                } catch (Throwable th) {
                    this.b.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AtomicReference atomicReference = this.b;
                synchronized (atomicReference) {
                    try {
                        try {
                            y53 y53Var = (y53) this.c.a;
                            atomicReference.set(Boolean.valueOf(y53Var.d.P(y53Var.q().K(), h13.a0)));
                            this.b.notify();
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (Throwable th2) {
                        this.b.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            y53 y53Var2 = (y53) this.c.a;
                            atomicReference2.set(y53Var2.d.L(y53Var2.q().K(), h13.b0));
                            this.b.notify();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        this.b.notify();
                        throw th4;
                    }
                }
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                AtomicReference atomicReference3 = this.b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            y53 y53Var3 = (y53) this.c.a;
                            atomicReference3.set(Long.valueOf(y53Var3.d.M(y53Var3.q().K(), h13.c0)));
                            this.b.notify();
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        this.b.notify();
                        throw th6;
                    }
                }
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                AtomicReference atomicReference4 = this.b;
                synchronized (atomicReference4) {
                    try {
                        try {
                            y53 y53Var4 = (y53) this.c.a;
                            atomicReference4.set(Integer.valueOf(y53Var4.d.N(y53Var4.q().K(), h13.d0)));
                            this.b.notify();
                        } catch (Throwable th7) {
                            this.b.notify();
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        throw th8;
                    }
                }
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                a();
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                w93 w93Var = this.c;
                h43 h43Var = ((y53) w93Var.a).e;
                y53.j(h43Var);
                Bundle bundleK = h43Var.a0.k();
                lc3 lc3VarO = ((y53) w93Var.a).o();
                AtomicReference atomicReference5 = this.b;
                lc3VarO.D();
                lc3VarO.F();
                lc3VarO.S(new yk(lc3VarO, atomicReference5, lc3VarO.U(false), bundleK, 9, false));
                return;
            default:
                lc3 lc3VarO2 = ((y53) this.c.a).o();
                zzoo zzooVarR = zzoo.R(new ia3[]{ia3.SGTM_CLIENT});
                AtomicReference atomicReference6 = this.b;
                lc3VarO2.D();
                lc3VarO2.F();
                lc3VarO2.S(new yk(lc3VarO2, atomicReference6, lc3VarO2.U(false), zzooVarR, 10, false));
                return;
        }
    }

    public /* synthetic */ h83(w93 w93Var, AtomicReference atomicReference, int i, boolean z) {
        this.a = i;
        this.c = w93Var;
        this.b = atomicReference;
    }
}
