package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cr {
    public int b;
    public boolean c;
    public final qr d;
    public final int e;
    public cr f;
    public as1 i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public cr(qr qrVar, int i) {
        this.d = qrVar;
        this.e = i;
    }

    public final void a(cr crVar, int i) {
        b(crVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(cr crVar, int i, int i2, boolean z) {
        if (crVar == null) {
            j();
            return true;
        }
        if (!z && !i(crVar)) {
            return false;
        }
        this.f = crVar;
        if (crVar.a == null) {
            crVar.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, k82 k82Var, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                dw0.d(((cr) it.next()).d, i, arrayList, k82Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        cr crVar;
        if (this.d.f0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (crVar = this.f) == null || crVar.d.f0 != 8) ? this.g : i;
    }

    public final cr f() {
        int i = this.e;
        int iV = ts.v(i);
        qr qrVar = this.d;
        switch (iV) {
            case 0:
            case oc1.STRING_FIELD_NUMBER /* 5 */:
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return qrVar.J;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return qrVar.K;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return qrVar.H;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return qrVar.I;
            default:
                e.b(ts.t(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((cr) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x0061 A[RETURN] */
    public final boolean i(cr crVar) {
        if (crVar != null) {
            qr qrVar = crVar.d;
            int i = crVar.e;
            int i2 = this.e;
            if (i != i2) {
                switch (ts.v(i2)) {
                    case 0:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        break;
                    case 1:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        boolean z = i == 2 || i == 4;
                        if (!(qrVar instanceof cl0)) {
                            return z;
                        }
                        if (z || i == 8) {
                            return true;
                        }
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        boolean z2 = i == 3 || i == 5;
                        if (!(qrVar instanceof cl0)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                            return true;
                        }
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        if (i != 2 && i != 4) {
                            return true;
                        }
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        if (i != 6 && i != 8 && i != 9) {
                            return true;
                        }
                        break;
                    default:
                        e.b(ts.t(i2));
                        return false;
                }
            } else if (i2 != 6 || (qrVar.D && this.d.D)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        cr crVar = this.f;
        if (crVar != null && (hashSet = crVar.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        as1 as1Var = this.i;
        if (as1Var == null) {
            this.i = new as1(1);
        } else {
            as1Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.g0 + ":" + ts.t(this.e);
    }
}
