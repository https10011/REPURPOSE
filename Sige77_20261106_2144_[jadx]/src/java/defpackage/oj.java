package defpackage;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oj extends qj {
    public final int e;
    public final int f;

    public oj(byte[] bArr, int i, int i2) {
        super(bArr);
        qj.b(i, i + i2, bArr.length);
        this.e = i;
        this.f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // defpackage.qj
    public final byte a(int i) {
        int i2 = this.f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[this.e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(ck1.r(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(ts.i("Index > length: ", i, i2, ", "));
    }

    @Override // defpackage.qj
    public final void d(byte[] bArr, int i) {
        System.arraycopy(this.b, this.e, bArr, 0, i);
    }

    @Override // defpackage.qj
    public final int e() {
        return this.e;
    }

    @Override // defpackage.qj
    public final byte f(int i) {
        return this.b[this.e + i];
    }

    @Override // defpackage.qj
    public final int size() {
        return this.f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = dr0.b;
        } else {
            byte[] bArr2 = new byte[size];
            d(bArr2, size);
            bArr = bArr2;
        }
        return new qj(bArr);
    }
}
