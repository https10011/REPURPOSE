package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zo1 implements Externalizable {
    public static final yo1 c = new yo1(null);
    public Collection a;
    public final int b;

    public zo1(int i, Collection collection) {
        collection.getClass();
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Collection collection;
        objectInput.getClass();
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            sm0.o(b, "Unsupported flags value: ");
            return;
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            sm0.o(i2, "Illegal size value: ");
            return;
        }
        int i3 = 0;
        if (i == 0) {
            jy0 jy0Var = new jy0(i2);
            while (i3 < i2) {
                jy0Var.add(objectInput.readObject());
                i3++;
            }
            jy0Var.f();
            jy0Var.c = true;
            int i4 = jy0Var.b;
            collection = jy0Var;
            if (i4 <= 0) {
                collection = jy0.e;
            }
        } else {
            if (i != 1) {
                sm0.o(i, "Unsupported collection type tag: ");
                return;
            }
            ip1 ip1Var = new ip1(i2);
            while (i3 < i2) {
                ip1Var.add(objectInput.readObject());
                i3++;
            }
            l11 l11Var = ip1Var.a;
            l11Var.b();
            l11Var.Z = true;
            if (l11Var.w <= 0) {
                l11.b0.getClass();
            }
            collection = ip1Var;
            if (l11Var.w <= 0) {
                collection = ip1.c;
            }
        }
        this.a = collection;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public zo1() {
        this(0, x50.a);
    }
}
