package defpackage;

import android.util.SparseIntArray;
import android.widget.CheckBox;
import androidx.lifecycle.b;
import com.linecorp.linesdk.BR;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o91 extends n91 {
    public static final SparseIntArray u0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(2131296632, 4);
        sparseIntArray.put(2131296633, 5);
        sparseIntArray.put(2131296438, 6);
        sparseIntArray.put(2131296439, 7);
        sparseIntArray.put(2131296440, 8);
        sparseIntArray.put(2131296382, 9);
        sparseIntArray.put(2131296379, 10);
        sparseIntArray.put(2131296381, 11);
        sparseIntArray.put(2131296380, 12);
        sparseIntArray.put(2131296726, 13);
        sparseIntArray.put(2131296738, 14);
        sparseIntArray.put(2131296732, 15);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    public final void O() {
        long j;
        long j2;
        String str;
        String str2;
        b bVar;
        Boolean bool;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        r91 r91Var = this.r0;
        boolean zBooleanValue = false;
        String str3 = null;
        if ((31 & j) != 0) {
            if ((j & 25) == 0) {
                str = null;
            } else {
                b bVar2 = r91Var != null ? r91Var.f : null;
                W(0, bVar2);
                if (bVar2 != null) {
                    str = (String) bVar2.d();
                } else {
                    str = null;
                }
            }
            if ((j & 26) != 0) {
                b bVar3 = r91Var != null ? r91Var.h : null;
                j2 = 0;
                W(1, bVar3);
                if (bVar3 != null) {
                    str2 = (String) bVar3.d();
                }
                if ((j & 28) != j2) {
                    if (r91Var != null) {
                        bVar = r91Var.j;
                    } else {
                        bVar = null;
                    }
                    W(2, bVar);
                    bool = bVar != null ? (Boolean) bVar.d() : null;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                }
                str3 = str2;
            } else {
                j2 = 0;
            }
            str2 = null;
            if ((j & 28) != j2) {
                if (r91Var != null) {
                    bVar = r91Var.j;
                } else {
                    bVar = null;
                }
                W(2, bVar);
                if (bVar != null) {
                }
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            str3 = str2;
        } else {
            j2 = 0;
            str = null;
        }
        if ((j & 26) != j2) {
            aj0.O(this.l0, str3);
        }
        if ((j & 25) != j2) {
            aj0.O(this.n0, str);
        }
        if ((j & 28) != j2) {
            CheckBox checkBox = this.p0;
            if (checkBox.isChecked() != zBooleanValue) {
                checkBox.setChecked(zBooleanValue);
            }
        }
    }

    public final boolean P() {
        synchronized (this) {
            try {
                return this.t0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean S(Object obj, int i, int i2) {
        if (i == 0) {
            return Y(i2);
        }
        if (i == 1) {
            return Z(i2);
        }
        if (i != 2) {
            return false;
        }
        return a0(i2);
    }

    @Override // defpackage.n91
    public final void X(r91 r91Var) {
        this.r0 = r91Var;
        synchronized (this) {
            this.t0 |= 8;
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
            this.t0 |= 1;
        }
        return true;
    }

    public final boolean Z(int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.t0 |= 2;
        }
        return true;
    }

    public final boolean a0(int i) {
        if (i != BR._all) {
            return false;
        }
        synchronized (this) {
            this.t0 |= 4;
        }
        return true;
    }
}
