package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzdd;
import com.hjq.toast.BuildConfig;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ua3 extends k13 {
    public ja3 W;
    public boolean X;
    public final Object Y;
    public volatile ja3 c;
    public volatile ja3 d;
    public ja3 e;
    public final ConcurrentHashMap f;
    public zzdd i;
    public volatile boolean v;
    public volatile ja3 w;

    public ua3(y53 y53Var) {
        super(y53Var);
        this.Y = new Object();
        this.f = new ConcurrentHashMap();
    }

    @Override // defpackage.k13
    public final boolean H() {
        return false;
    }

    public final ja3 I(boolean z) {
        F();
        D();
        ja3 ja3Var = this.e;
        return (z && ja3Var == null) ? this.W : ja3Var;
    }

    public final String J(String str) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str2 = length > 0 ? strArrSplit[length - 1] : BuildConfig.FLAVOR;
        y53 y53Var = (y53) this.a;
        int length2 = str2.length();
        y53Var.d.getClass();
        if (length2 <= 500) {
            return str2;
        }
        y53Var.d.getClass();
        return str2.substring(0, 500);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0033  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    public final void K(ja3 ja3Var, ja3 ja3Var2, long j, boolean z, Bundle bundle) {
        boolean z2;
        long j2;
        Bundle bundle2;
        boolean z3 = ja3Var.e;
        y53 y53Var = (y53) this.a;
        D();
        boolean z4 = false;
        if (ja3Var2 != null) {
            if (ja3Var2.c == ja3Var.c && Objects.equals(ja3Var2.b, ja3Var.b) && Objects.equals(ja3Var2.a, ja3Var.a)) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
        }
        if (z && this.e != null) {
            z4 = true;
        }
        if (z2) {
            Bundle bundle3 = bundle != null ? new Bundle(bundle) : new Bundle();
            qf3.A0(ja3Var, bundle3, true);
            if (ja3Var2 != null) {
                String str = ja3Var2.a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = ja3Var2.b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", ja3Var2.c);
            }
            if (z4) {
                td3 td3Var = y53Var.v;
                y53.k(td3Var);
                pd3 pd3Var = td3Var.f;
                long j3 = j - pd3Var.b;
                pd3Var.b = j;
                if (j3 > 0) {
                    qf3 qf3Var = y53Var.w;
                    y53.j(qf3Var);
                    qf3Var.q0(bundle3, j3);
                }
            }
            is2 is2Var = y53Var.d;
            r41 r41Var = y53Var.X;
            if (!is2Var.T()) {
                bundle3.putLong("_mst", 1L);
            }
            String str3 = true != z3 ? "auto" : "app";
            r41Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z3) {
                long j4 = ja3Var.f;
                if (j4 != 0) {
                    j2 = j4;
                } else {
                    j2 = jCurrentTimeMillis;
                }
            } else {
                j2 = jCurrentTimeMillis;
            }
            long jElapsedRealtime = y53Var.d.P(null, h13.e1) ? SystemClock.elapsedRealtime() : 0L;
            if (z3) {
                bundle2 = bundle3;
                long j5 = ja3Var.g;
                if (j5 != 0) {
                    jElapsedRealtime = j5;
                }
            } else {
                bundle2 = bundle3;
            }
            w93 w93Var = y53Var.Z;
            y53.k(w93Var);
            w93Var.M(j2, jElapsedRealtime, bundle2, str3, "_vs");
        }
        if (z4) {
            N(this.e, true, j);
        }
        this.e = ja3Var;
        if (z3) {
            this.W = ja3Var;
        }
        lc3 lc3VarO = y53Var.o();
        lc3VarO.D();
        lc3VarO.F();
        lc3VarO.S(new z83(lc3VarO, ja3Var));
    }

    public final void L(zzdd zzddVar, Bundle bundle) {
        Bundle bundle2;
        if (!((y53) this.a).d.T() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(Integer.valueOf(zzddVar.a), new ja3(bundle2.getLong("id"), bundle2.getString("name"), bundle2.getString("referrer_name")));
    }

    public final void M(String str, ja3 ja3Var, boolean z) {
        ja3 ja3Var2;
        ja3 ja3Var3 = this.c == null ? this.d : this.c;
        if (ja3Var.b == null) {
            ja3Var2 = new ja3(ja3Var.a, str != null ? J(str) : null, ja3Var.c, ja3Var.e, ja3Var.f, ja3Var.g);
        } else {
            ja3Var2 = ja3Var;
        }
        this.d = this.c;
        this.c = ja3Var2;
        y53 y53Var = (y53) this.a;
        y53Var.X.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        t53 t53Var = y53Var.i;
        y53.l(t53Var);
        t53Var.N(new la3(this, ja3Var2, ja3Var3, jElapsedRealtime, z));
    }

    public final void N(ja3 ja3Var, boolean z, long j) {
        y53 y53Var = (y53) this.a;
        xx2 xx2Var = y53Var.a0;
        y53.i(xx2Var);
        y53Var.X.getClass();
        xx2Var.H(SystemClock.elapsedRealtime());
        boolean z2 = ja3Var != null && ja3Var.d;
        td3 td3Var = y53Var.v;
        y53.k(td3Var);
        if (!td3Var.f.a(z2, z, j) || ja3Var == null) {
            return;
        }
        ja3Var.d = false;
    }

    public final ja3 O(zzdd zzddVar) {
        gu2.o(zzddVar);
        Integer numValueOf = Integer.valueOf(zzddVar.a);
        ConcurrentHashMap concurrentHashMap = this.f;
        ja3 ja3Var = (ja3) concurrentHashMap.get(numValueOf);
        if (ja3Var == null) {
            String strJ = J(zzddVar.b);
            qf3 qf3Var = ((y53) this.a).w;
            y53.j(qf3Var);
            ja3 ja3Var2 = new ja3(qf3Var.C0(), null, strJ);
            concurrentHashMap.put(numValueOf, ja3Var2);
            ja3Var = ja3Var2;
        }
        return this.w != null ? this.w : ja3Var;
    }
}
