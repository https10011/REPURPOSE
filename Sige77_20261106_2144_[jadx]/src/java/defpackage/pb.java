package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class pb implements m02 {
    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Type type = s12Var.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new qb(uk0Var, uk0Var.b(new s12(genericComponentType)), am2.y(genericComponentType));
    }
}
