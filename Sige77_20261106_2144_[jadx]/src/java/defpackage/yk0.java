package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yk0 implements GenericArrayType {
    public final /* synthetic */ int a;
    public final Type b;

    public yk0(int i, Type type) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = type;
                break;
            default:
                Objects.requireNonNull(type);
                this.b = am2.m(type);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                return (obj instanceof GenericArrayType) && am2.u(this, (GenericArrayType) obj);
            default:
                return (obj instanceof GenericArrayType) && ta.h(this, (GenericArrayType) obj);
        }
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.hashCode();
    }

    public final String toString() {
        int i = this.a;
        Type type = this.b;
        switch (i) {
            case 0:
                return am2.Y(type) + "[]";
            default:
                return ta.G(type) + "[]";
        }
    }
}
