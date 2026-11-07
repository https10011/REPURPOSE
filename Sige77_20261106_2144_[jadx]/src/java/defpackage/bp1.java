package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bp1 implements Externalizable {
    public static final ap1 b = new ap1(null);
    public Map a;

    public bp1() {
        y50 y50Var = y50.a;
        y50Var.getClass();
        this.a = y50Var;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b2 = objectInput.readByte();
        if (b2 != 0) {
            throw new InvalidObjectException(ck1.r(b2, "Unsupported flags value: "));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            sm0.o(i, "Illegal size value: ");
            return;
        }
        l11 l11Var = new l11(i);
        for (int i2 = 0; i2 < i; i2++) {
            l11Var.put(objectInput.readObject(), objectInput.readObject());
        }
        l11Var.b();
        l11Var.Z = true;
        if (l11Var.w <= 0) {
            l11Var = l11.b0;
            l11Var.getClass();
        }
        this.a = l11Var;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }
}
