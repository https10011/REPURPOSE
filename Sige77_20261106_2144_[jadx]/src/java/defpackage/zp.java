package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zp {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public int d;
    public int e;
    public nq f;
    public final HashSet g;

    public zp(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(je1.a(cls));
        for (Class cls2 : clsArr) {
            g93.k(cls2, "Null interface");
            this.b.add(je1.a(cls2));
        }
    }

    public final void a(u00 u00Var) {
        if (this.b.contains(u00Var.a)) {
            e.g("Components are not allowed to depend on interfaces they themselves provide.");
        } else {
            this.c.add(u00Var);
        }
    }

    public final aq b() {
        if (this.f != null) {
            return new aq(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e, this.f, this.g);
        }
        uq1.q("Missing required property: factory.");
        return null;
    }

    public zp(je1 je1Var, je1[] je1VarArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(je1Var);
        for (je1 je1Var2 : je1VarArr) {
            g93.k(je1Var2, "Null interface");
        }
        Collections.addAll(this.b, je1VarArr);
    }
}
