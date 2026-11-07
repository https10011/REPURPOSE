package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class eo implements Serializable {
    public final int a;
    public transient Object[] b;

    public eo(int i, Object... objArr) {
        this.a = i;
        this.b = objArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(ck1.r(i, "negative length "));
        }
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = objectInputStream.readObject();
        }
        this.b = objArr;
    }

    private Object readResolve() throws ObjectStreamException {
        try {
            Object[] objArr = this.b;
            if (objArr == null) {
                throw new InvalidObjectException("null array");
            }
            int i = this.a;
            int i2 = i & 255;
            if (i2 == 1) {
                return z32.A(objArr);
            }
            if (i2 == 2) {
                return g93.A(objArr);
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new InvalidObjectException(String.format("invalid flags 0x%x", Integer.valueOf(i)));
                }
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
                boolean z = lo0.b;
                return objArrCopyOf.length == 0 ? lo0.e : new do0(objArrCopyOf, true);
            }
            if (objArr.length == 0) {
                return lo0.g;
            }
            if (objArr.length != 2) {
                return new go0(this.b);
            }
            Object[] objArr2 = this.b;
            return new eo0(objArr2[0], objArr2[1]);
        } catch (IllegalArgumentException e) {
            InvalidObjectException invalidObjectException = new InvalidObjectException("invalid object");
            invalidObjectException.initCause(e);
            throw invalidObjectException;
        } catch (NullPointerException e2) {
            InvalidObjectException invalidObjectException2 = new InvalidObjectException("invalid object");
            invalidObjectException2.initCause(e2);
            throw invalidObjectException2;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.b.length);
        int i = 0;
        while (true) {
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return;
            }
            objectOutputStream.writeObject(objArr[i]);
            i++;
        }
    }
}
