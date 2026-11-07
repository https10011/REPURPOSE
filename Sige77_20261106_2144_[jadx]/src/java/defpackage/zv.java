package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class zv extends r {
    public final byte[] a;

    public zv(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
        } else {
            uq1.h("string cannot be null");
            throw null;
        }
    }

    @Override // defpackage.r
    public final boolean b(r rVar) {
        if (rVar instanceof zv) {
            return z32.d(this.a, ((zv) rVar).a);
        }
        return false;
    }

    @Override // defpackage.r
    public final void c(kj0 kj0Var) throws IOException {
        kj0Var.R(4);
        byte[] bArr = this.a;
        kj0Var.S(bArr.length);
        ((ByteArrayOutputStream) kj0Var.b).write(bArr);
    }

    @Override // defpackage.r
    public final int d() {
        byte[] bArr = this.a;
        return cu1.a(bArr.length) + 1 + bArr.length;
    }

    @Override // defpackage.r
    public final r e() {
        return new zv(this.a);
    }

    @Override // defpackage.r, defpackage.p
    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("#");
        hs1 hs1Var = cm0.a;
        byte[] bArr = this.a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr2 = (byte[]) cm0.a.b;
            for (byte b : bArr) {
                byteArrayOutputStream.write(bArr2[(b & 255) >>> 4]);
                byteArrayOutputStream.write(bArr2[b & 15]);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            int i = ju1.a;
            int length = byteArray.length;
            char[] cArr = new char[length];
            for (int i2 = 0; i2 != length; i2++) {
                cArr[i2] = (char) (byteArray[i2] & 255);
            }
            sb.append(new String(cArr));
            return sb.toString();
        } catch (Exception e) {
            ly lyVar = new ly("exception encoding Hex string: " + e.getMessage(), 1);
            lyVar.b = e;
            throw lyVar;
        }
    }
}
