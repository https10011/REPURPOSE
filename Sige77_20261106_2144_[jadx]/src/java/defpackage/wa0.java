package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wa0 implements ds1 {
    public final fu0 a;
    public long b;
    public boolean c;

    public wa0(fu0 fu0Var, long j) {
        this.a = fu0Var;
        this.b = j;
    }

    @Override // defpackage.ds1
    public final long F(ji jiVar, long j) {
        long j2;
        long j3;
        int i;
        jiVar.getClass();
        if (this.c) {
            uq1.q("closed");
            return 0L;
        }
        fu0 fu0Var = this.a;
        long j4 = this.b;
        if (j < 0) {
            e.d(ck1.t("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                yn1 yn1VarM = jiVar.M(1);
                byte[] bArr = yn1VarM.a;
                int i2 = yn1VarM.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (fu0Var) {
                    bArr.getClass();
                    fu0Var.d.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = fu0Var.d.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (yn1VarM.b == yn1VarM.c) {
                        jiVar.a = yn1VarM.a();
                        ao1.a(yn1VarM);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    yn1VarM.c += i;
                    long j7 = i;
                    j6 += j7;
                    jiVar.b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        fu0 fu0Var = this.a;
        if (this.c) {
            return;
        }
        this.c = true;
        ReentrantLock reentrantLock = fu0Var.c;
        reentrantLock.lock();
        try {
            int i = fu0Var.b - 1;
            fu0Var.b = i;
            if (i == 0 && fu0Var.a) {
                Unit unit = Unit.a;
                reentrantLock.unlock();
                synchronized (fu0Var) {
                    fu0Var.d.close();
                }
                return;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // defpackage.ds1
    public final vx1 d() {
        return vx1.d;
    }
}
