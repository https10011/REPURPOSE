package defpackage;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a51 {
    public static final HashMap m = w11.c(new Pair("embedding.weight", "embed.weight"), new Pair("dense1.weight", "fc1.weight"), new Pair("dense2.weight", "fc2.weight"), new Pair("dense3.weight", "fc3.weight"), new Pair("dense1.bias", "fc1.bias"), new Pair("dense2.bias", "fc2.bias"), new Pair("dense3.bias", "fc3.bias"));
    public final d11 a;
    public final d11 b;
    public final d11 c;
    public final d11 d;
    public final d11 e;
    public final d11 f;
    public final d11 g;
    public final d11 h;
    public final d11 i;
    public final d11 j;
    public final d11 k;
    public final HashMap l;

    public a51(HashMap map) {
        Object obj = map.get("embed.weight");
        if (obj == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.a = (d11) obj;
        Object obj2 = map.get("convs.0.weight");
        if (obj2 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.b = x91.S((d11) obj2);
        Object obj3 = map.get("convs.1.weight");
        if (obj3 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.c = x91.S((d11) obj3);
        Object obj4 = map.get("convs.2.weight");
        if (obj4 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.d = x91.S((d11) obj4);
        Object obj5 = map.get("convs.0.bias");
        if (obj5 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.e = (d11) obj5;
        Object obj6 = map.get("convs.1.bias");
        if (obj6 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.f = (d11) obj6;
        Object obj7 = map.get("convs.2.bias");
        if (obj7 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.g = (d11) obj7;
        Object obj8 = map.get("fc1.weight");
        if (obj8 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.h = x91.R((d11) obj8);
        Object obj9 = map.get("fc2.weight");
        if (obj9 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.i = x91.R((d11) obj9);
        Object obj10 = map.get("fc1.bias");
        if (obj10 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.j = (d11) obj10;
        Object obj11 = map.get("fc2.bias");
        if (obj11 == null) {
            uq1.q("Required value was null.");
            throw null;
        }
        this.k = (d11) obj11;
        this.l = new HashMap();
        for (String str : wb.p(new String[]{y00.b(1), y00.b(2)})) {
            String strK = y00.k(str, ".weight");
            String strK2 = y00.k(str, ".bias");
            d11 d11Var = (d11) map.get(strK);
            d11 d11Var2 = (d11) map.get(strK2);
            if (d11Var != null) {
                this.l.put(strK, x91.R(d11Var));
            }
            if (d11Var2 != null) {
                this.l.put(strK2, d11Var2);
            }
        }
    }

    public final d11 a(d11 d11Var, String[] strArr, String str) {
        HashMap map = this.l;
        if (!mt.a.contains(this)) {
            try {
                d11 d11VarL = x91.l(x91.r(strArr, this.a), this.b);
                x91.i(d11VarL, this.e);
                x91.K(d11VarL);
                d11 d11VarL2 = x91.l(d11VarL, this.c);
                x91.i(d11VarL2, this.f);
                x91.K(d11VarL2);
                d11 d11VarB = x91.B(d11VarL2, 2);
                d11 d11VarL3 = x91.l(d11VarB, this.d);
                x91.i(d11VarL3, this.g);
                x91.K(d11VarL3);
                d11 d11VarB2 = x91.B(d11VarL, d11VarL.a[1]);
                d11 d11VarB3 = x91.B(d11VarB, d11VarB.a[1]);
                d11 d11VarB4 = x91.B(d11VarL3, d11VarL3.a[1]);
                x91.s(d11VarB2);
                x91.s(d11VarB3);
                x91.s(d11VarB4);
                d11 d11VarQ = x91.q(x91.k(new d11[]{d11VarB2, d11VarB3, d11VarB4, d11Var}), this.h, this.j);
                x91.K(d11VarQ);
                d11 d11VarQ2 = x91.q(d11VarQ, this.i, this.k);
                x91.K(d11VarQ2);
                d11 d11Var2 = (d11) map.get(str.concat(".weight"));
                d11 d11Var3 = (d11) map.get(str.concat(".bias"));
                if (d11Var2 != null && d11Var3 != null) {
                    d11 d11VarQ3 = x91.q(d11VarQ2, d11Var2, d11Var3);
                    x91.M(d11VarQ3);
                    return d11VarQ3;
                }
            } catch (Throwable th) {
                mt.a(this, th);
                return null;
            }
        }
        return null;
    }
}
