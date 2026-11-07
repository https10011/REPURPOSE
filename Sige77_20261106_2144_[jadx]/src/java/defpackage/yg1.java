package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yg1 implements m02 {
    public final ir1 a;
    public final int b;
    public final c80 c;
    public final ot0 d;
    public final List e;

    public yg1(ir1 ir1Var, int i, c80 c80Var, ot0 ot0Var, List list) {
        this.a = ir1Var;
        this.b = i;
        this.c = c80Var;
        this.d = ot0Var;
        this.e = list;
    }

    public static void a(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + rg1.c(field) + " and " + rg1.c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at zn3.accept(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:12)
    	at java.util.ArrayList.forEach(ArrayList.java:1621)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:20)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
    	... 9 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
        	at uv1.l(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:80)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:31)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:22)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.k(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:29)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
        Caused by: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.instructions.args.ArgType jadx.core.dex.instructions.args.Typed.getType()' on a null object reference
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:13)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:27)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.u(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
        	at ho3.update(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:53)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:39)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:24)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:28)
        	... 7 more
        */
    public final defpackage.wg1 b(defpackage.uk0 r30, defpackage.s12 r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg1.b(uk0, s12, java.lang.Class, boolean):wg1");
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Class cls = s12Var.a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        ta taVar = rg1.a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new sg1();
        }
        ia.e(this.e);
        return rg1.a.r(cls) ? new xg1(cls, b(uk0Var, s12Var, cls, true)) : new vg1(this.a.c(s12Var, true), b(uk0Var, s12Var, cls, false));
    }

    public final boolean d(Field field, boolean z) {
        boolean z2;
        c80 c80Var = this.c;
        c80Var.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c80Var.d(field.getType(), z)) {
            z2 = true;
        } else {
            List list = z ? c80Var.a : c80Var.b;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw y00.i(it);
                }
            }
            z2 = false;
        }
        return !z2;
    }
}
