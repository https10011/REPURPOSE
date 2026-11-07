package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b70 extends b1 implements a70, Serializable {
    public final Enum[] b;

    public b70(Enum[] enumArr) {
        enumArr.getClass();
        this.b = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new d70(this.b);
    }

    @Override // defpackage.d0
    public final int a() {
        return this.b.length;
    }

    @Override // defpackage.d0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) wb.k(r3.ordinal(), this.b)) == r3;
    }

    @Override // defpackage.b1, java.util.List
    public final Object get(int i) {
        x0 x0Var = b1.a;
        Enum[] enumArr = this.b;
        int length = enumArr.length;
        x0Var.getClass();
        x0.a(i, length);
        return enumArr[i];
    }

    @Override // defpackage.b1, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) wb.k(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.b1, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) wb.k(iOrdinal, this.b)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
