package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mc1 extends sh0 {
    private static final mc1 DEFAULT_INSTANCE;
    private static volatile eb1 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private cr0 strings_ = ud1.d;

    static {
        mc1 mc1Var = new mc1();
        DEFAULT_INSTANCE = mc1Var;
        sh0.j(mc1.class, mc1Var);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public static void l(mc1 mc1Var, Set set) {
        cr0 cr0Var = mc1Var.strings_;
        if (!((i1) cr0Var).a) {
            int size = cr0Var.size();
            mc1Var.strings_ = ((ud1) cr0Var).c(size == 0 ? 10 : size * 2);
        }
        List list = mc1Var.strings_;
        Charset charset = dr0.a;
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(set.size() + list.size());
        }
        int size2 = list.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                    list.remove(size3);
                }
                uq1.h(str);
                return;
            }
            list.add(obj);
        }
    }

    public static mc1 m() {
        return DEFAULT_INSTANCE;
    }

    public static lc1 o() {
        return (lc1) ((qh0) DEFAULT_INSTANCE.c(5));
    }

    @Override // defpackage.sh0
    public final Object c(int i) {
        eb1 rh0Var;
        switch (ts.v(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return new if1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return new mc1();
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                return new lc1(DEFAULT_INSTANCE);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                eb1 eb1Var = PARSER;
                if (eb1Var != null) {
                    return eb1Var;
                }
                synchronized (mc1.class) {
                    try {
                        rh0Var = PARSER;
                        if (rh0Var == null) {
                            rh0Var = new rh0();
                            PARSER = rh0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return rh0Var;
            default:
                uq1.k();
                return null;
        }
    }

    public final cr0 n() {
        return this.strings_;
    }
}
