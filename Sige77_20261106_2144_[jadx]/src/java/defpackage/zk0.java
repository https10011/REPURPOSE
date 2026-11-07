package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zk0 implements ParameterizedType {
    public final /* synthetic */ int a = 0;
    public final Type b;
    public final Type c;
    public final Type[] d;

    public zk0(Type type, Class cls, Type[] typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            ur.g(cls, "Must specify owner type for ");
            throw null;
        }
        this.b = type != null ? am2.m(type) : null;
        this.c = am2.m(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.d = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.d[i]);
            am2.q(this.d[i]);
            Type[] typeArr3 = this.d;
            typeArr3[i] = am2.m(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof ParameterizedType) && am2.u(this, (ParameterizedType) obj);
            default:
                return (obj instanceof ParameterizedType) && ta.h(this, (ParameterizedType) obj);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        int i = this.a;
        Type[] typeArr = this.d;
        switch (i) {
            case 0:
                break;
        }
        return (Type[]) typeArr.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    public final int hashCode() {
        int i = this.a;
        Type type = this.b;
        Type type2 = this.c;
        Type[] typeArr = this.d;
        switch (i) {
            case 0:
                return (Arrays.hashCode(typeArr) ^ type2.hashCode()) ^ (type != null ? type.hashCode() : 0);
            default:
                return (Arrays.hashCode(typeArr) ^ type2.hashCode()) ^ (type != null ? type.hashCode() : 0);
        }
    }

    public final String toString() {
        int i = this.a;
        Type[] typeArr = this.d;
        int i2 = 1;
        Type type = this.c;
        switch (i) {
            case 0:
                int length = typeArr.length;
                if (length == 0) {
                    return am2.Y(type);
                }
                StringBuilder sb = new StringBuilder((length + 1) * 30);
                sb.append(am2.Y(type));
                sb.append("<");
                sb.append(am2.Y(typeArr[0]));
                while (i2 < length) {
                    sb.append(", ");
                    sb.append(am2.Y(typeArr[i2]));
                    i2++;
                }
                sb.append(">");
                return sb.toString();
            default:
                if (typeArr.length == 0) {
                    return ta.G(type);
                }
                StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
                sb2.append(ta.G(type));
                sb2.append("<");
                sb2.append(ta.G(typeArr[0]));
                while (i2 < typeArr.length) {
                    sb2.append(", ");
                    sb2.append(ta.G(typeArr[i2]));
                    i2++;
                }
                sb2.append(">");
                return sb2.toString();
        }
    }

    public zk0(Type type, Type type2, Type[] typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                sm0.a();
                throw null;
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            ta.c(type3);
        }
        this.b = type;
        this.c = type2;
        this.d = (Type[]) typeArr.clone();
    }
}
