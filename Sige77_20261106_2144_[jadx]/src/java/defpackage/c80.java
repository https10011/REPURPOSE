package defpackage;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c80 implements m02, Cloneable {
    public static final c80 c = new c80();
    public final List a;
    public final List b;

    public c80() {
        List list = Collections.EMPTY_LIST;
        this.a = list;
        this.b = list;
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Class cls = s12Var.a;
        boolean zD = d(cls, true);
        boolean zD2 = d(cls, false);
        if (zD || zD2) {
            return new b80(this, zD2, zD, uk0Var, s12Var);
        }
        return null;
    }

    public final Object clone() {
        try {
            return (c80) super.clone();
        } catch (CloneNotSupportedException e) {
            e.b(e);
            return null;
        }
    }

    public final boolean d(Class cls, boolean z) {
        if (!z && !Enum.class.isAssignableFrom(cls)) {
            ta taVar = rg1.a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z ? this.a : this.b).iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
        return false;
    }
}
