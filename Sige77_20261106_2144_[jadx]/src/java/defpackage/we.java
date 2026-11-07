package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hjq.toast.BuildConfig;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class we {
    public int a;
    public int b;
    public int c = 0;
    public Object d;

    public we(sn snVar, boolean z) {
        byte[] bArr = ds2.a;
        if (snVar == null) {
            uq1.h("input");
            throw null;
        }
        this.d = snVar;
        snVar.c = this;
    }

    public static void D(int i) throws ur0 {
        if ((i & 3) != 0) {
            throw new ur0("Failed to parse the message.");
        }
    }

    public static void E(int i) throws ur0 {
        if ((i & 7) != 0) {
            throw new ur0("Failed to parse the message.");
        }
    }

    public static final void a0(int i) throws xm2 {
        if ((i & 3) == 0) {
            return;
        }
        tv2.i("Failed to parse the message.");
    }

    public static final void b0(int i) throws xm2 {
        if ((i & 7) == 0) {
            return;
        }
        tv2.i("Failed to parse the message.");
    }

    public static void l0(int i) throws ks2 {
        if ((i & 3) != 0) {
            throw ks2.f();
        }
    }

    public static void o0(int i) throws ks2 {
        if ((i & 7) != 0) {
            throw ks2.f();
        }
    }

    public void A(int i) throws ur0 {
        if (((sn) this.d).b() != i) {
            throw ur0.e();
        }
    }

    public void A0(js2 js2Var) throws ms2 {
        f0(js2Var, false);
    }

    public void B(int i) throws tr0 {
        if ((this.a & 7) != i) {
            throw ur0.b();
        }
    }

    public void B0(js2 js2Var) throws ms2 {
        f0(js2Var, true);
    }

    public boolean C() {
        int i;
        sn snVar = (sn) this.d;
        if (snVar.c() || (i = this.a) == this.b) {
            return false;
        }
        return snVar.x(i);
    }

    public jr2 C0() {
        h0(2);
        return ((sn) this.d).Y();
    }

    public void D0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Integer.valueOf(snVar.S()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Integer.valueOf(snVar.S()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public hl2 E0() {
        V(2);
        return ((ll2) this.d).y();
    }

    public void F(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof dn2;
        int i = this.a;
        if (z) {
            dn2 dn2Var = (dn2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    dn2Var.d(ll2Var.r());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                dn2Var.d(ll2Var.r());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Long.valueOf(ll2Var.r()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Long.valueOf(ll2Var.r()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void F0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Long.valueOf(snVar.X()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Long.valueOf(snVar.X()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public void G(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    fm2Var.zzh(ll2Var.s());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                fm2Var.zzh(ll2Var.s());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Integer.valueOf(ll2Var.s()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.s()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void G0(um2 um2Var) throws xm2 {
        int iL;
        ll2 ll2Var = (ll2) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                um2Var.add(Double.valueOf(ll2Var.o()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            this.c = iL;
            return;
        }
        if (i != 2) {
            uq1.p();
            return;
        }
        int iA = ll2Var.A();
        b0(iA);
        int iE = ll2Var.e() + iA;
        do {
            um2Var.add(Double.valueOf(ll2Var.o()));
        } while (ll2Var.e() < iE);
    }

    public void H(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof dn2;
        int i = this.a;
        if (z) {
            dn2 dn2Var = (dn2) um2Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iA = ll2Var.A();
                b0(iA);
                int iE = ll2Var.e() + iA;
                do {
                    dn2Var.d(ll2Var.t());
                } while (ll2Var.e() < iE);
                return;
            }
            do {
                dn2Var.d(ll2Var.t());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iA2 = ll2Var.A();
                b0(iA2);
                int iE2 = ll2Var.e() + iA2;
                do {
                    um2Var.add(Long.valueOf(ll2Var.t()));
                } while (ll2Var.e() < iE2);
                return;
            }
            do {
                um2Var.add(Long.valueOf(ll2Var.t()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void H0(um2 um2Var) throws xm2 {
        int iL;
        ll2 ll2Var = (ll2) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iA = ll2Var.A();
            a0(iA);
            int iE = ll2Var.e() + iA;
            do {
                um2Var.add(Float.valueOf(ll2Var.p()));
            } while (ll2Var.e() < iE);
            return;
        }
        if (i != 5) {
            uq1.p();
            return;
        }
        do {
            um2Var.add(Float.valueOf(ll2Var.p()));
            if (ll2Var.d()) {
                return;
            } else {
                iL = ll2Var.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void I(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = ll2Var.A();
                a0(iA);
                int iE = ll2Var.e() + iA;
                do {
                    fm2Var.zzh(ll2Var.u());
                } while (ll2Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                uq1.p();
                return;
            }
            do {
                fm2Var.zzh(ll2Var.u());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = ll2Var.A();
                a0(iA2);
                int iE2 = ll2Var.e() + iA2;
                do {
                    um2Var.add(Integer.valueOf(ll2Var.u()));
                } while (ll2Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                uq1.p();
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.u()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void I0(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof dn2;
        int i = this.a;
        if (z) {
            dn2 dn2Var = (dn2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    dn2Var.d(ll2Var.q());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                dn2Var.d(ll2Var.q());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Long.valueOf(ll2Var.q()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Long.valueOf(ll2Var.q()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void J(um2 um2Var) throws xm2 {
        int iL;
        ll2 ll2Var = (ll2) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                um2Var.add(Boolean.valueOf(ll2Var.v()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            this.c = iL;
            return;
        }
        if (i != 2) {
            uq1.p();
            return;
        }
        int iE = ll2Var.e() + ll2Var.A();
        do {
            um2Var.add(Boolean.valueOf(ll2Var.v()));
        } while (ll2Var.e() < iE);
        Z(iE);
    }

    public void K(um2 um2Var, boolean z) throws vm2 {
        String strW;
        int iL;
        ll2 ll2Var = (ll2) this.d;
        if ((this.a & 7) != 2) {
            uq1.p();
            return;
        }
        do {
            if (z) {
                V(2);
                strW = ll2Var.x();
            } else {
                V(2);
                strW = ll2Var.w();
            }
            um2Var.add(strW);
            if (ll2Var.d()) {
                return;
            } else {
                iL = ll2Var.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void L(um2 um2Var, yn2 yn2Var, vl2 vl2Var) throws xm2 {
        int iL;
        int i = this.a;
        if ((i & 7) != 2) {
            uq1.p();
            return;
        }
        do {
            dm2 dm2VarZza = yn2Var.zza();
            W(dm2VarZza, yn2Var, vl2Var);
            yn2Var.f(dm2VarZza);
            um2Var.add(dm2VarZza);
            ll2 ll2Var = (ll2) this.d;
            if (ll2Var.d() || this.c != 0) {
                return;
            } else {
                iL = ll2Var.l();
            }
        } while (iL == i);
        this.c = iL;
    }

    public void M(um2 um2Var, yn2 yn2Var, vl2 vl2Var) throws vm2 {
        int iL;
        int i = this.a;
        if ((i & 7) != 3) {
            uq1.p();
            return;
        }
        do {
            dm2 dm2VarZza = yn2Var.zza();
            X(dm2VarZza, yn2Var, vl2Var);
            yn2Var.f(dm2VarZza);
            um2Var.add(dm2VarZza);
            ll2 ll2Var = (ll2) this.d;
            if (ll2Var.d() || this.c != 0) {
                return;
            } else {
                iL = ll2Var.l();
            }
        } while (iL == i);
        this.c = iL;
    }

    public void N(um2 um2Var) throws vm2 {
        int iL;
        if ((this.a & 7) != 2) {
            uq1.p();
            return;
        }
        do {
            um2Var.add(E0());
            ll2 ll2Var = (ll2) this.d;
            if (ll2Var.d()) {
                return;
            } else {
                iL = ll2Var.l();
            }
        } while (iL == this.a);
        this.c = iL;
    }

    public void O(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    fm2Var.zzh(ll2Var.A());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                fm2Var.zzh(ll2Var.A());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Integer.valueOf(ll2Var.A()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.A()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void P(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    fm2Var.zzh(ll2Var.B());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                fm2Var.zzh(ll2Var.B());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Integer.valueOf(ll2Var.B()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.B()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void Q(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iA = ll2Var.A();
                a0(iA);
                int iE = ll2Var.e() + iA;
                do {
                    fm2Var.zzh(ll2Var.C());
                } while (ll2Var.e() < iE);
                return;
            }
            if (i2 != 5) {
                uq1.p();
                return;
            }
            do {
                fm2Var.zzh(ll2Var.C());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iA2 = ll2Var.A();
                a0(iA2);
                int iE2 = ll2Var.e() + iA2;
                do {
                    um2Var.add(Integer.valueOf(ll2Var.C()));
                } while (ll2Var.e() < iE2);
                return;
            }
            if (i3 != 5) {
                uq1.p();
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.C()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void R(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof dn2;
        int i = this.a;
        if (z) {
            dn2 dn2Var = (dn2) um2Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iA = ll2Var.A();
                b0(iA);
                int iE = ll2Var.e() + iA;
                do {
                    dn2Var.d(ll2Var.D());
                } while (ll2Var.e() < iE);
                return;
            }
            do {
                dn2Var.d(ll2Var.D());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iA2 = ll2Var.A();
                b0(iA2);
                int iE2 = ll2Var.e() + iA2;
                do {
                    um2Var.add(Long.valueOf(ll2Var.D()));
                } while (ll2Var.e() < iE2);
                return;
            }
            do {
                um2Var.add(Long.valueOf(ll2Var.D()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void S(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof fm2;
        int i = this.a;
        if (z) {
            fm2 fm2Var = (fm2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    fm2Var.zzh(ll2Var.E());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                fm2Var.zzh(ll2Var.E());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Integer.valueOf(ll2Var.E()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Integer.valueOf(ll2Var.E()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void T(um2 um2Var) throws xm2 {
        int iL;
        int iL2;
        ll2 ll2Var = (ll2) this.d;
        boolean z = um2Var instanceof dn2;
        int i = this.a;
        if (z) {
            dn2 dn2Var = (dn2) um2Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    uq1.p();
                    return;
                }
                int iE = ll2Var.e() + ll2Var.A();
                do {
                    dn2Var.d(ll2Var.F());
                } while (ll2Var.e() < iE);
                Z(iE);
                return;
            }
            do {
                dn2Var.d(ll2Var.F());
                if (ll2Var.d()) {
                    return;
                } else {
                    iL2 = ll2Var.l();
                }
            } while (iL2 == this.a);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    uq1.p();
                    return;
                }
                int iE2 = ll2Var.e() + ll2Var.A();
                do {
                    um2Var.add(Long.valueOf(ll2Var.F()));
                } while (ll2Var.e() < iE2);
                Z(iE2);
                return;
            }
            do {
                um2Var.add(Long.valueOf(ll2Var.F()));
                if (ll2Var.d()) {
                    return;
                } else {
                    iL = ll2Var.l();
                }
            } while (iL == this.a);
            iL2 = iL;
        }
        this.c = iL2;
    }

    public void U(gn2 gn2Var, p11 p11Var, vl2 vl2Var) {
        int i;
        int i2;
        V(2);
        ll2 ll2Var = (ll2) this.d;
        int iA = ll2Var.a(ll2Var.A());
        Object obj = p11Var.d;
        Object objY = BuildConfig.FLAVOR;
        Object objY2 = obj;
        while (true) {
            try {
                int iG0 = g0();
                if (iG0 == Integer.MAX_VALUE || ll2Var.d()) {
                    break;
                }
                boolean zN = false;
                if (iG0 == 1) {
                    objY = Y((ro2) p11Var.b, null, null);
                } else if (iG0 != 2) {
                    try {
                        if (!((ll2Var.d() || (i2 = this.a) == this.b) ? false : ll2Var.n(i2))) {
                            throw new xm2("Unable to parse map entry.");
                        }
                    } catch (vm2 e) {
                        if (!ll2Var.d() && (i = this.a) != this.b) {
                            zN = ll2Var.n(i);
                        }
                        if (!zN) {
                            throw new xm2("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objY2 = Y((ro2) p11Var.c, obj.getClass(), vl2Var);
                }
            } catch (Throwable th) {
                ll2Var.b(iA);
                throw th;
            }
        }
        gn2Var.put(objY, objY2);
        ll2Var.b(iA);
    }

    public void V(int i) {
        if ((this.a & 7) == i) {
            return;
        }
        uq1.p();
    }

    public void W(Object obj, yn2 yn2Var, vl2 vl2Var) throws xm2 {
        ll2 ll2Var = (ll2) this.d;
        int iA = ll2Var.A();
        if (ll2Var.a + ll2Var.b >= 100) {
            tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iA2 = ll2Var.a(iA);
        ll2Var.a++;
        yn2Var.e(obj, this, vl2Var);
        ll2Var.m(0);
        ll2Var.a--;
        ll2Var.b(iA2);
    }

    public void X(Object obj, yn2 yn2Var, vl2 vl2Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            yn2Var.e(obj, this, vl2Var);
            if (this.a != this.b) {
                throw new xm2("Failed to parse the message.");
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public Object Y(ro2 ro2Var, Class cls, vl2 vl2Var) throws xm2 {
        ll2 ll2Var = (ll2) this.d;
        ro2 ro2Var2 = ro2.c;
        switch (ro2Var.ordinal()) {
            case 0:
                V(1);
                return Double.valueOf(ll2Var.o());
            case 1:
                V(5);
                return Float.valueOf(ll2Var.p());
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                V(0);
                return Long.valueOf(ll2Var.r());
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                V(0);
                return Long.valueOf(ll2Var.q());
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                V(0);
                return Integer.valueOf(ll2Var.s());
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                V(1);
                return Long.valueOf(ll2Var.t());
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                V(5);
                return Integer.valueOf(ll2Var.u());
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                V(0);
                return Boolean.valueOf(ll2Var.v());
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                V(2);
                return ll2Var.x();
            case 9:
            default:
                e.g("unsupported field type.");
                return null;
            case 10:
                V(2);
                yn2 yn2VarA = un2.c.a(cls);
                dm2 dm2VarZza = yn2VarA.zza();
                W(dm2VarZza, yn2VarA, vl2Var);
                yn2VarA.f(dm2VarZza);
                return dm2VarZza;
            case 11:
                return E0();
            case 12:
                V(0);
                return Integer.valueOf(ll2Var.A());
            case 13:
                V(0);
                return Integer.valueOf(ll2Var.B());
            case 14:
                V(5);
                return Integer.valueOf(ll2Var.C());
            case 15:
                V(1);
                return Long.valueOf(ll2Var.D());
            case 16:
                V(0);
                return Integer.valueOf(ll2Var.E());
            case 17:
                V(0);
                return Long.valueOf(ll2Var.F());
        }
    }

    public void Z(int i) throws xm2 {
        if (((ll2) this.d).e() == i) {
            return;
        }
        tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public void a(int i, int i2) {
        if (i < 0) {
            e.g("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            e.g("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void b() {
        View view = (View) this.d;
        int top = this.c - (view.getTop() - this.a);
        WeakHashMap weakHashMap = x52.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        xf1 xf1Var = recyclerView.b0;
        if (recyclerView.a0 == null || xf1Var == null || !xf1Var.i) {
            return;
        }
        if (z) {
            if (!recyclerView.d.y()) {
                xf1Var.i(recyclerView.a0.a(), this);
            }
        } else if (!recyclerView.K()) {
            xf1Var.h(this.a, this.b, recyclerView.Q0, this);
        }
        int i = this.c;
        if (i > xf1Var.j) {
            xf1Var.j = i;
            xf1Var.k = z;
            recyclerView.b.l();
        }
    }

    public void c0(int i) throws ks2 {
        if (((sn) this.d).J() != i) {
            throw ks2.g();
        }
    }

    public f6 d() {
        return ((f6[]) this.d)[this.a];
    }

    public void d0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Boolean.valueOf(snVar.c0()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Boolean.valueOf(snVar.c0()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public int e() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((sn) this.d).u();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public void e0(js2 js2Var, ct2 ct2Var, wr2 wr2Var) throws ms2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a;
        if ((i & 7) != 3) {
            throw ks2.a();
        }
        do {
            cs2 cs2VarZza = ct2Var.zza();
            m0(cs2VarZza, ct2Var, wr2Var);
            ct2Var.f(cs2VarZza);
            js2Var.add(cs2VarZza);
            if (snVar.b0() || this.c != 0) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == i);
        this.c = iR;
    }

    public byte[][] f(int i, int i2) {
        int i3 = this.b * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.c * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = (byte[]) ((f6[]) this.d)[i4 / i2].c;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public void f0(js2 js2Var, boolean z) throws ms2 {
        String strZ;
        int iR;
        sn snVar = (sn) this.d;
        if ((this.a & 7) != 2) {
            throw ks2.a();
        }
        do {
            if (z) {
                h0(2);
                strZ = snVar.a0();
            } else {
                h0(2);
                strZ = snVar.Z();
            }
            js2Var.add(strZ);
            if (snVar.b0()) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == this.a);
        this.c = iR;
    }

    public void g(Object obj, zl1 zl1Var, w80 w80Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            zl1Var.f(obj, this, w80Var);
            if (this.a != this.b) {
                throw new ur0("Failed to parse the message.");
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public int g0() {
        int iL = this.c;
        if (iL != 0) {
            this.a = iL;
            this.c = 0;
        } else {
            iL = ((ll2) this.d).l();
            this.a = iL;
        }
        if (iL == 0 || iL == this.b) {
            return Integer.MAX_VALUE;
        }
        return iL >>> 3;
    }

    public void h(Object obj, zl1 zl1Var, w80 w80Var) throws ur0 {
        sn snVar = (sn) this.d;
        int iV = snVar.v();
        if (snVar.b >= 100) {
            throw new ur0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iE = snVar.e(iV);
        snVar.b++;
        zl1Var.f(obj, this, w80Var);
        snVar.a(0);
        snVar.b--;
        snVar.d(iE);
    }

    public void h0(int i) {
        if ((this.a & 7) != i) {
            throw ks2.a();
        }
    }

    public void i(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Boolean.valueOf(snVar.f()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Boolean.valueOf(snVar.f()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void i0(js2 js2Var) throws ms2 {
        int iR;
        sn snVar = (sn) this.d;
        if ((this.a & 7) != 2) {
            throw ks2.a();
        }
        do {
            js2Var.add(C0());
            if (snVar.b0()) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == this.a);
        this.c = iR;
    }

    public qj j() throws tr0 {
        B(2);
        return ((sn) this.d).g();
    }

    public void j0(js2 js2Var, ct2 ct2Var, wr2 wr2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a;
        if ((i & 7) != 2) {
            throw ks2.a();
        }
        do {
            cs2 cs2VarZza = ct2Var.zza();
            p0(cs2VarZza, ct2Var, wr2Var);
            ct2Var.f(cs2VarZza);
            js2Var.add(cs2VarZza);
            if (snVar.b0() || this.c != 0) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == i);
        this.c = iR;
    }

    public void k(cr0 cr0Var) throws tr0 {
        int iU;
        sn snVar = (sn) this.d;
        if ((this.a & 7) != 2) {
            throw ur0.b();
        }
        do {
            cr0Var.add(j());
            if (snVar.c()) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == this.a);
        this.c = iU;
    }

    public int k0() {
        int i = this.c;
        if (i != 0) {
            this.a = i;
            this.c = 0;
        } else {
            this.a = ((sn) this.d).R();
        }
        int i2 = this.a;
        if (i2 == 0 || i2 == this.b) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public void l(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                cr0Var.add(Double.valueOf(snVar.h()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iV = snVar.v();
        E(iV);
        int iB = snVar.b() + iV;
        do {
            cr0Var.add(Double.valueOf(snVar.h()));
        } while (snVar.b() < iB);
    }

    public void m(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Integer.valueOf(snVar.i()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Integer.valueOf(snVar.i()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void m0(Object obj, ct2 ct2Var, wr2 wr2Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            ct2Var.c(obj, this, wr2Var);
            if (this.a != this.b) {
                throw ks2.f();
            }
            this.b = i;
        } catch (Throwable th) {
            this.b = i;
            throw th;
        }
    }

    public Object n(da2 da2Var, Class cls, w80 w80Var) throws ur0 {
        sn snVar = (sn) this.d;
        switch (da2Var.ordinal()) {
            case 0:
                B(1);
                return Double.valueOf(snVar.h());
            case 1:
                B(5);
                return Float.valueOf(snVar.l());
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                B(0);
                return Long.valueOf(snVar.n());
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                B(0);
                return Long.valueOf(snVar.w());
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                B(0);
                return Integer.valueOf(snVar.m());
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                B(1);
                return Long.valueOf(snVar.k());
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                B(5);
                return Integer.valueOf(snVar.j());
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                B(0);
                return Boolean.valueOf(snVar.f());
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                B(2);
                return snVar.t();
            case 9:
            default:
                e.g("unsupported field type.");
                return null;
            case 10:
                B(2);
                zl1 zl1VarA = td1.c.a(cls);
                sh0 sh0VarI = zl1VarA.i();
                h(sh0VarI, zl1VarA, w80Var);
                zl1VarA.d(sh0VarI);
                return sh0VarI;
            case 11:
                return j();
            case 12:
                B(0);
                return Integer.valueOf(snVar.v());
            case 13:
                B(0);
                return Integer.valueOf(snVar.i());
            case 14:
                B(5);
                return Integer.valueOf(snVar.o());
            case 15:
                B(1);
                return Long.valueOf(snVar.p());
            case 16:
                B(0);
                return Integer.valueOf(snVar.q());
            case 17:
                B(0);
                return Long.valueOf(snVar.r());
        }
    }

    public void n0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                js2Var.add(Double.valueOf(snVar.z()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iS = snVar.S();
        o0(iS);
        int iJ = snVar.J() + iS;
        do {
            js2Var.add(Double.valueOf(snVar.z()));
        } while (snVar.J() < iJ);
    }

    public void o(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iV = snVar.v();
            D(iV);
            int iB = snVar.b() + iV;
            do {
                cr0Var.add(Integer.valueOf(snVar.j()));
            } while (snVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw ur0.b();
        }
        do {
            cr0Var.add(Integer.valueOf(snVar.j()));
            if (snVar.c()) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == this.a);
        this.c = iU;
    }

    public void p(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                cr0Var.add(Long.valueOf(snVar.k()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iV = snVar.v();
        E(iV);
        int iB = snVar.b() + iV;
        do {
            cr0Var.add(Long.valueOf(snVar.k()));
        } while (snVar.b() < iB);
    }

    public void p0(Object obj, ct2 ct2Var, wr2 wr2Var) throws ks2 {
        sn snVar = (sn) this.d;
        int iS = snVar.S();
        if (snVar.b + 0 >= 100) {
            throw new ks2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iH = snVar.H(iS);
        snVar.b++;
        ct2Var.c(obj, this, wr2Var);
        snVar.K(0);
        snVar.b--;
        snVar.M(iH);
    }

    public void q(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iV = snVar.v();
            D(iV);
            int iB = snVar.b() + iV;
            do {
                cr0Var.add(Float.valueOf(snVar.l()));
            } while (snVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw ur0.b();
        }
        do {
            cr0Var.add(Float.valueOf(snVar.l()));
            if (snVar.c()) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == this.a);
        this.c = iU;
    }

    public void q0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Integer.valueOf(snVar.L()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Integer.valueOf(snVar.L()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public void r(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Integer.valueOf(snVar.m()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Integer.valueOf(snVar.m()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void r0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iS = snVar.S();
            l0(iS);
            int iJ = snVar.J() + iS;
            do {
                js2Var.add(Integer.valueOf(snVar.N()));
            } while (snVar.J() < iJ);
            return;
        }
        if (i != 5) {
            throw ks2.a();
        }
        do {
            js2Var.add(Integer.valueOf(snVar.N()));
            if (snVar.b0()) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == this.a);
        this.c = iR;
    }

    public void s(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Long.valueOf(snVar.n()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Long.valueOf(snVar.n()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void s0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                js2Var.add(Long.valueOf(snVar.T()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iS = snVar.S();
        o0(iS);
        int iJ = snVar.J() + iS;
        do {
            js2Var.add(Long.valueOf(snVar.T()));
        } while (snVar.J() < iJ);
    }

    public void t(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iV = snVar.v();
            D(iV);
            int iB = snVar.b() + iV;
            do {
                cr0Var.add(Integer.valueOf(snVar.o()));
            } while (snVar.b() < iB);
            return;
        }
        if (i != 5) {
            throw ur0.b();
        }
        do {
            cr0Var.add(Integer.valueOf(snVar.o()));
            if (snVar.c()) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == this.a);
        this.c = iU;
    }

    public void t0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iS = snVar.S();
            l0(iS);
            int iJ = snVar.J() + iS;
            do {
                js2Var.add(Float.valueOf(snVar.G()));
            } while (snVar.J() < iJ);
            return;
        }
        if (i != 5) {
            throw ks2.a();
        }
        do {
            js2Var.add(Float.valueOf(snVar.G()));
            if (snVar.b0()) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == this.a);
        this.c = iR;
    }

    public void u(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                cr0Var.add(Long.valueOf(snVar.p()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iV = snVar.v();
        E(iV);
        int iB = snVar.b() + iV;
        do {
            cr0Var.add(Long.valueOf(snVar.p()));
        } while (snVar.b() < iB);
    }

    public void u0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Integer.valueOf(snVar.O()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Integer.valueOf(snVar.O()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public void v(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Integer.valueOf(snVar.q()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Integer.valueOf(snVar.q()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void v0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Long.valueOf(snVar.U()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Long.valueOf(snVar.U()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public void w(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Long.valueOf(snVar.r()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Long.valueOf(snVar.r()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void w0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iS = snVar.S();
            l0(iS);
            int iJ = snVar.J() + iS;
            do {
                js2Var.add(Integer.valueOf(snVar.P()));
            } while (snVar.J() < iJ);
            return;
        }
        if (i != 5) {
            throw ks2.a();
        }
        do {
            js2Var.add(Integer.valueOf(snVar.P()));
            if (snVar.b0()) {
                return;
            } else {
                iR = snVar.R();
            }
        } while (iR == this.a);
        this.c = iR;
    }

    public void x(cr0 cr0Var, boolean z) throws tr0 {
        String strS;
        int iU;
        sn snVar = (sn) this.d;
        if ((this.a & 7) != 2) {
            throw ur0.b();
        }
        do {
            if (z) {
                B(2);
                strS = snVar.t();
            } else {
                B(2);
                strS = snVar.s();
            }
            cr0Var.add(strS);
            if (snVar.c()) {
                return;
            } else {
                iU = snVar.u();
            }
        } while (iU == this.a);
        this.c = iU;
    }

    public void x0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                js2Var.add(Long.valueOf(snVar.V()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iS = snVar.S();
        o0(iS);
        int iJ = snVar.J() + iS;
        do {
            js2Var.add(Long.valueOf(snVar.V()));
        } while (snVar.J() < iJ);
    }

    public void y(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Integer.valueOf(snVar.v()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Integer.valueOf(snVar.v()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void y0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Integer.valueOf(snVar.Q()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Integer.valueOf(snVar.Q()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public void z(cr0 cr0Var) throws ur0 {
        int iU;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                cr0Var.add(Long.valueOf(snVar.w()));
                if (snVar.c()) {
                    return;
                } else {
                    iU = snVar.u();
                }
            } while (iU == this.a);
            this.c = iU;
            return;
        }
        if (i != 2) {
            throw ur0.b();
        }
        int iB = snVar.b() + snVar.v();
        do {
            cr0Var.add(Long.valueOf(snVar.w()));
        } while (snVar.b() < iB);
        A(iB);
    }

    public void z0(js2 js2Var) throws ks2 {
        int iR;
        sn snVar = (sn) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                js2Var.add(Long.valueOf(snVar.W()));
                if (snVar.b0()) {
                    return;
                } else {
                    iR = snVar.R();
                }
            } while (iR == this.a);
            this.c = iR;
            return;
        }
        if (i != 2) {
            throw ks2.a();
        }
        int iJ = snVar.J() + snVar.S();
        do {
            js2Var.add(Long.valueOf(snVar.W()));
        } while (snVar.J() < iJ);
        c0(iJ);
    }

    public we(sn snVar) {
        Charset charset = dr0.a;
        this.d = snVar;
        snVar.c = this;
    }

    public we(ll2 ll2Var) {
        this.d = ll2Var;
        ll2Var.c = this;
    }
}
