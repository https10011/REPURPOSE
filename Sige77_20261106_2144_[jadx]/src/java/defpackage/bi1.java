package defpackage;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bi1 extends nf {
    public final Context f0;
    public final ii1 g0;
    public final Class h0;
    public final cj0 i0;
    public vz1 j0;
    public Object k0;
    public ArrayList l0;
    public bi1 m0;
    public bi1 n0;
    public boolean o0 = true;
    public boolean p0;
    public boolean q0;

    static {
    }

    public bi1(a aVar, ii1 ii1Var, Class cls, Context context) {
        ki1 ki1Var;
        this.g0 = ii1Var;
        this.h0 = cls;
        this.f0 = context;
        mb mbVar = ii1Var.a.c.f;
        vz1 vz1Var = (vz1) mbVar.get(cls);
        if (vz1Var == null) {
            for (Map.Entry entry : (hb) mbVar.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    vz1Var = (vz1) entry.getValue();
                }
            }
        }
        this.j0 = vz1Var == null ? cj0.k : vz1Var;
        this.i0 = aVar.c;
        Iterator it = ii1Var.w.iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                ur.a();
                throw null;
            }
            y();
        }
        synchronized (ii1Var) {
            ki1Var = ii1Var.W;
        }
        c(ki1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public final xh1 A(Object obj, kw1 kw1Var, ci1 ci1Var, vz1 vz1Var, vc1 vc1Var, int i, int i2, nf nfVar) {
        ci1 ci1Var2;
        ci1 m70Var;
        nf nfVar2;
        xh1 er1Var;
        vc1 vc1Var2;
        if (this.n0 != null) {
            m70Var = new m70(obj, ci1Var);
            ci1Var2 = m70Var;
        } else {
            ci1Var2 = null;
            m70Var = ci1Var;
        }
        bi1 bi1Var = this.m0;
        if (bi1Var == null) {
            Context context = this.f0;
            cj0 cj0Var = this.i0;
            nfVar2 = nfVar;
            er1Var = new er1(context, cj0Var, obj, this.k0, this.h0, nfVar2, i, i2, vc1Var, kw1Var, this.l0, m70Var, cj0Var.g, vz1Var.a);
        } else {
            if (this.q0) {
                uq1.q("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            vz1 vz1Var2 = bi1Var.o0 ? vz1Var : bi1Var.j0;
            if (nf.k(bi1Var.a, 8)) {
                vc1Var2 = this.m0.c;
            } else {
                int iOrdinal = vc1Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    vc1Var2 = vc1.a;
                } else if (iOrdinal == 2) {
                    vc1Var2 = vc1.b;
                } else {
                    if (iOrdinal != 3) {
                        uq1.l(this.c, "unknown priority: ");
                        return null;
                    }
                    vc1Var2 = vc1.c;
                }
            }
            vc1 vc1Var3 = vc1Var2;
            bi1 bi1Var2 = this.m0;
            int i3 = bi1Var2.v;
            int i4 = bi1Var2.i;
            if (d42.z(i, i2)) {
                bi1 bi1Var3 = this.m0;
                if (!d42.z(bi1Var3.v, bi1Var3.i)) {
                    i3 = nfVar.v;
                    i4 = nfVar.i;
                }
            }
            int i5 = i4;
            int i6 = i3;
            qx1 qx1Var = new qx1(obj, m70Var);
            Context context2 = this.f0;
            cj0 cj0Var2 = this.i0;
            er1 er1Var2 = new er1(context2, cj0Var2, obj, this.k0, this.h0, nfVar, i, i2, vc1Var, kw1Var, this.l0, qx1Var, cj0Var2.g, vz1Var.a);
            this.q0 = true;
            bi1 bi1Var4 = this.m0;
            xh1 xh1VarA = bi1Var4.A(obj, kw1Var, qx1Var, vz1Var2, vc1Var3, i6, i5, bi1Var4);
            this.q0 = false;
            qx1Var.c = er1Var2;
            qx1Var.d = xh1VarA;
            nfVar2 = nfVar;
            er1Var = qx1Var;
        }
        if (ci1Var2 == null) {
            return er1Var;
        }
        bi1 bi1Var5 = this.n0;
        int i7 = bi1Var5.v;
        int i8 = bi1Var5.i;
        if (d42.z(i, i2)) {
            bi1 bi1Var6 = this.n0;
            if (!d42.z(bi1Var6.v, bi1Var6.i)) {
                i7 = nfVar2.v;
                i8 = nfVar2.i;
            }
        }
        bi1 bi1Var7 = this.n0;
        m70 m70Var2 = ci1Var2;
        xh1 xh1VarA2 = bi1Var7.A(obj, kw1Var, m70Var2, bi1Var7.j0, bi1Var7.c, i7, i8, bi1Var7);
        m70Var2.c = er1Var;
        m70Var2.d = xh1VarA2;
        return m70Var2;
    }

    @Override // defpackage.nf
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final bi1 clone() {
        bi1 bi1Var = (bi1) super.clone();
        bi1Var.j0 = bi1Var.j0.clone();
        if (bi1Var.l0 != null) {
            bi1Var.l0 = new ArrayList(bi1Var.l0);
        }
        bi1 bi1Var2 = bi1Var.m0;
        if (bi1Var2 != null) {
            bi1Var.m0 = bi1Var2.clone();
        }
        bi1 bi1Var3 = bi1Var.n0;
        if (bi1Var3 != null) {
            bi1Var.n0 = bi1Var3.clone();
        }
        return bi1Var;
    }

    public final void C(kw1 kw1Var, nf nfVar) {
        am2.o(kw1Var);
        if (!this.p0) {
            e.g("You must call #load() before calling #into()");
            return;
        }
        xh1 xh1VarA = A(new Object(), kw1Var, null, this.j0, nfVar.c, nfVar.v, nfVar.i, nfVar);
        xh1 xh1VarH = kw1Var.h();
        if (xh1VarA.b(xh1VarH) && (nfVar.f || !xh1VarH.k())) {
            am2.p(xh1VarH, "Argument must not be null");
            if (xh1VarH.isRunning()) {
                return;
            }
            xh1VarH.j();
            return;
        }
        this.g0.l(kw1Var);
        kw1Var.f(xh1VarA);
        ii1 ii1Var = this.g0;
        synchronized (ii1Var) {
            ii1Var.f.a.add(kw1Var);
            ir1 ir1Var = ii1Var.d;
            ((Set) ir1Var.c).add(xh1VarA);
            if (ir1Var.b) {
                xh1VarA.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                ((HashSet) ir1Var.d).add(xh1VarA);
            } else {
                xh1VarA.j();
            }
        }
    }

    public final bi1 D(Object obj) {
        if (this.c0) {
            return clone().D(obj);
        }
        this.k0 = obj;
        this.p0 = true;
        p();
        return this;
    }

    public final bi1 E(f30 f30Var) {
        if (this.c0) {
            return clone().E(f30Var);
        }
        this.j0 = f30Var;
        this.o0 = false;
        p();
        return this;
    }

    @Override // defpackage.nf
    public final boolean equals(Object obj) {
        if (!(obj instanceof bi1)) {
            return false;
        }
        bi1 bi1Var = (bi1) obj;
        return super.equals(bi1Var) && Objects.equals(this.h0, bi1Var.h0) && this.j0.equals(bi1Var.j0) && Objects.equals(this.k0, bi1Var.k0) && Objects.equals(this.l0, bi1Var.l0) && Objects.equals(this.m0, bi1Var.m0) && Objects.equals(this.n0, bi1Var.n0) && this.o0 == bi1Var.o0 && this.p0 == bi1Var.p0;
    }

    @Override // defpackage.nf
    public final int hashCode() {
        return d42.w(this.p0 ? 1 : 0, d42.w(this.o0 ? 1 : 0, d42.x(d42.x(d42.x(d42.x(d42.x(d42.x(d42.x(super.hashCode(), this.h0), this.j0), this.k0), this.l0), this.m0), this.n0), null)));
    }

    public final bi1 y() {
        if (this.c0) {
            return clone().y();
        }
        p();
        return this;
    }

    @Override // defpackage.nf
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final bi1 c(nf nfVar) {
        am2.o(nfVar);
        return (bi1) super.c(nfVar);
    }
}
