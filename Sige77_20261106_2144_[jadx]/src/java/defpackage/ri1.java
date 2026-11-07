package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ri1 implements hv0 {
    public static final z01 j = new z01(50);
    public final v01 b;
    public final hv0 c;
    public final hv0 d;
    public final int e;
    public final int f;
    public final Class g;
    public final da1 h;
    public final fz1 i;

    public ri1(v01 v01Var, hv0 hv0Var, hv0 hv0Var2, int i, int i2, fz1 fz1Var, Class cls, da1 da1Var) {
        this.b = v01Var;
        this.c = hv0Var;
        this.d = hv0Var2;
        this.e = i;
        this.f = i2;
        this.i = fz1Var;
        this.g = cls;
        this.h = da1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
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
    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        Object objE;
        v01 v01Var = this.b;
        synchronized (v01Var) {
            u01 u01Var = v01Var.b;
            xb1 xb1VarF = (xb1) ((ArrayDeque) u01Var.a).poll();
            if (xb1VarF == null) {
                xb1VarF = u01Var.F();
            }
            t01 t01Var = (t01) xb1VarF;
            t01Var.b = 8;
            t01Var.c = byte[].class;
            objE = v01Var.e(t01Var, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        fz1 fz1Var = this.i;
        if (fz1Var != null) {
            fz1Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        z01 z01Var = j;
        Class cls = this.g;
        byte[] bytes = (byte[]) z01Var.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(hv0.a);
            z01Var.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.b.g(bArr);
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof ri1) {
            ri1 ri1Var = (ri1) obj;
            if (this.f == ri1Var.f && this.e == ri1Var.e && d42.c(this.i, ri1Var.i) && this.g.equals(ri1Var.g) && this.c.equals(ri1Var.c) && this.d.equals(ri1Var.d) && this.h.equals(ri1Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        fz1 fz1Var = this.i;
        if (fz1Var != null) {
            iHashCode = (iHashCode * 31) + fz1Var.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
