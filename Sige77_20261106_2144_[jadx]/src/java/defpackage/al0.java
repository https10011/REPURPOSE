package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class al0 implements WildcardType {
    public final /* synthetic */ int a;
    public final Type b;
    public final Type c;

    public al0(Type[] typeArr, Type[] typeArr2, int i) {
        this.a = i;
        switch (i) {
            case 1:
                if (typeArr2.length > 1) {
                    sm0.a();
                    throw null;
                }
                if (typeArr.length != 1) {
                    sm0.a();
                    throw null;
                }
                if (typeArr2.length != 1) {
                    typeArr[0].getClass();
                    ta.c(typeArr[0]);
                    this.c = null;
                    this.b = typeArr[0];
                    return;
                }
                typeArr2[0].getClass();
                ta.c(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    sm0.a();
                    throw null;
                }
                this.c = typeArr2[0];
                this.b = Object.class;
                return;
            default:
                if (typeArr2.length > 1) {
                    e.g("At most one lower bound is supported");
                    throw null;
                }
                if (typeArr.length != 1) {
                    e.g("Exactly one upper bound must be specified");
                    throw null;
                }
                if (typeArr2.length != 1) {
                    Objects.requireNonNull(typeArr[0]);
                    am2.q(typeArr[0]);
                    this.c = null;
                    this.b = am2.m(typeArr[0]);
                    return;
                }
                Objects.requireNonNull(typeArr2[0]);
                am2.q(typeArr2[0]);
                if (typeArr[0] != Object.class) {
                    e.g("When lower bound is specified, upper bound must be Object");
                    throw null;
                }
                this.c = am2.m(typeArr2[0]);
                this.b = Object.class;
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof WildcardType) && am2.u(this, (WildcardType) obj);
            default:
                return (obj instanceof WildcardType) && ta.h(this, (WildcardType) obj);
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        int i = this.a;
        Type type = this.c;
        switch (i) {
            case 0:
                return type != null ? new Type[]{type} : am2.a;
            default:
                return type != null ? new Type[]{type} : ta.c;
        }
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        int i = this.a;
        Type type = this.b;
        switch (i) {
            case 0:
                return new Type[]{type};
            default:
                return new Type[]{type};
        }
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = this.a;
        Type type = this.b;
        Type type2 = this.c;
        switch (i) {
            case 0:
                iHashCode = type2 != null ? type2.hashCode() + 31 : 1;
                iHashCode2 = type.hashCode();
                break;
            default:
                iHashCode = type2 != null ? type2.hashCode() + 31 : 1;
                iHashCode2 = type.hashCode();
                break;
        }
        return (iHashCode2 + 31) ^ iHashCode;
    }

    public final String toString() {
        int i = this.a;
        Type type = this.c;
        Type type2 = this.b;
        switch (i) {
            case 0:
                if (type != null) {
                    return "? super " + am2.Y(type);
                }
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + am2.Y(type2);
            default:
                if (type != null) {
                    return "? super " + ta.G(type);
                }
                if (type2 == Object.class) {
                    return "?";
                }
                return "? extends " + ta.G(type2);
        }
    }
}
