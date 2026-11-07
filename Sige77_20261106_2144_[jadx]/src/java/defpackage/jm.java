package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jm implements OnFailureListener {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public jm(r41 r41Var) {
        this.a = 3;
        gu2.o(r41Var);
        this.c = r41Var;
    }

    public void a(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        jm jmVar = (jm) this.c;
        if (jmVar != null) {
            jmVar.a(i - 64);
        }
    }

    public int b(int i) {
        jm jmVar = (jm) this.c;
        if (jmVar == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(((1 << i) - 1) & j);
        }
        if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        }
        return Long.bitCount(this.b) + jmVar.b(i - 64);
    }

    public void c() {
        if (((jm) this.c) == null) {
            this.c = new jm();
        }
    }

    public boolean d(int i) {
        if (i < 64) {
            return ((1 << i) & this.b) != 0;
        }
        c();
        return ((jm) this.c).d(i - 64);
    }

    public void e(int i, boolean z) {
        if (i >= 64) {
            c();
            ((jm) this.c).e(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            h(i);
        } else {
            a(i);
        }
        if (z2 || ((jm) this.c) != null) {
            c();
            ((jm) this.c).e(0, z2);
        }
    }

    public boolean f(int i) {
        if (i >= 64) {
            c();
            return ((jm) this.c).f(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        jm jmVar = (jm) this.c;
        if (jmVar != null) {
            if (jmVar.d(0)) {
                h(63);
            }
            ((jm) this.c).f(0);
        }
        return z;
    }

    public void g() {
        this.b = 0L;
        jm jmVar = (jm) this.c;
        if (jmVar != null) {
            jmVar.g();
        }
    }

    public void h(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            c();
            ((jm) this.c).h(i - 64);
        }
    }

    public void onFailure(Exception exc) {
        ConnectionResult connectionResult;
        switch (this.a) {
            case 1:
                dc2 dc2Var = (dc2) this.c;
                long j = this.b;
                dc2Var.getClass();
                Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
                if ((exc instanceof i7) && (connectionResult = ((i7) exc).getStatus().d) != null && connectionResult.b == 24) {
                    ((AtomicLong) dc2Var.b).set(j);
                    break;
                }
                break;
            default:
                ((AtomicLong) ((u23) this.c).d).set(this.b);
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((jm) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((jm) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jm(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public jm() {
        this.a = 0;
        this.b = 0L;
    }
}
