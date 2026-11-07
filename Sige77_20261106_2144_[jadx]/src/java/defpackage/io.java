package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class io implements m02 {
    public final /* synthetic */ int a;
    public final ir1 b;

    public /* synthetic */ io(ir1 ir1Var, int i) {
        this.a = i;
        this.b = ir1Var;
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Type[] actualTypeArguments;
        int i = this.a;
        ir1 ir1Var = this.b;
        Type type = Object.class;
        switch (i) {
            case 0:
                Type type2 = s12Var.b;
                Class cls = s12Var.a;
                if (!Collection.class.isAssignableFrom(cls)) {
                    return null;
                }
                Type typeA = am2.A(type2, cls, Collection.class);
                type = typeA instanceof ParameterizedType ? ((ParameterizedType) typeA).getActualTypeArguments()[0] : Object.class;
                return new ho(new rs0(uk0Var, uk0Var.b(new s12(type)), type, 2), ir1Var.c(s12Var, false), 0);
            default:
                Type type3 = s12Var.b;
                Class cls2 = s12Var.a;
                if (!Map.class.isAssignableFrom(cls2)) {
                    return null;
                }
                if (Properties.class.isAssignableFrom(cls2)) {
                    actualTypeArguments = new Type[]{String.class, String.class};
                } else {
                    Type typeA2 = am2.A(type3, cls2, Map.class);
                    actualTypeArguments = typeA2 instanceof ParameterizedType ? ((ParameterizedType) typeA2).getActualTypeArguments() : new Type[]{type, type};
                }
                Type type4 = actualTypeArguments[0];
                Type type5 = actualTypeArguments[1];
                return new rs0(this, new rs0(uk0Var, (type4 == Boolean.TYPE || type4 == Boolean.class) ? r12.c : uk0Var.b(new s12(type4)), type4, 2), new rs0(uk0Var, uk0Var.b(new s12(type5)), type5, 2), ir1Var.c(s12Var, false));
        }
    }
}
