package defpackage;

import android.util.SparseIntArray;
import androidx.lifecycle.b;
import com.linecorp.linesdk.BR;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ed1 extends dd1 {
    public static final SparseIntArray p0;
    public long o0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.put(2131296456, 2);
    }

    public final void O() {
        long j;
        synchronized (this) {
            j = this.o0;
            this.o0 = 0L;
        }
        r91 r91Var = this.m0;
        long j2 = j & 7;
        String str = null;
        if (j2 != 0) {
            b bVar = r91Var != null ? r91Var.g : null;
            W(0, bVar);
            if (bVar != null) {
                str = (String) bVar.d();
            }
        }
        if (j2 != 0) {
            aj0.O(this.k0, str);
        }
    }

    public final boolean P() {
        synchronized (this) {
            try {
                return this.o0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean S(Object obj, int i, int i2) {
        if (i != 0) {
            return false;
        }
        return Y(i2);
    }

    @Override // defpackage.dd1
    public final void X(r91 r91Var) {
        this.m0 = r91Var;
        synchronized (this) {
            this.o0 |= 2;
        }
        int i = BR.viewModel;
        synchronized (this) {
        }
        U();
    }

    public final boolean Y(int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.o0 |= 1;
        }
        return true;
    }
}
