package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hi extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public hi(gi giVar, ll2 ll2Var) {
        this.a = 3;
        this.b = ll2Var;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (int) Math.min(((ji) obj).b, 2147483647L);
            case 1:
                mf1 mf1Var = (mf1) obj;
                if (!mf1Var.c) {
                    return (int) Math.min(mf1Var.b.b, 2147483647L);
                }
                uq1.o("closed");
                return 0;
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((mf1) this.b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                bArr.getClass();
                return ((ji) obj).read(bArr, i, i2);
            case 1:
                bArr.getClass();
                mf1 mf1Var = (mf1) obj;
                ji jiVar = mf1Var.b;
                if (mf1Var.c) {
                    uq1.o("closed");
                    return 0;
                }
                kv.l(bArr.length, i, i2);
                if (jiVar.b == 0 && mf1Var.a.F(jiVar, 8192L) == -1) {
                    return -1;
                }
                return jiVar.read(bArr, i, i2);
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                gi giVar = (gi) obj;
                try {
                    int iInflate = ((Inflater) giVar.b).inflate(bArr, i, i2);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i2 == 0) {
                        return 0;
                    }
                    if (((Inflater) giVar.b).getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = ((Inflater) giVar.b).getRemaining();
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 70 + String.valueOf(remaining).length());
                    sb.append("Read no bytes (requested up to ");
                    sb.append(i2);
                    sb.append(") but did not reach end of stream, had ");
                    sb.append(remaining);
                    throw new IOException(sb.toString());
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            default:
                return ((ll2) obj).f(bArr, i, i2);
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        switch (this.a) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (j <= 0) {
                    return 0L;
                }
                int i = j > 2147483647L ? Integer.MAX_VALUE : (int) j;
                ((ll2) this.b).g(i);
                return i;
            default:
                return super.skip(j);
        }
    }

    public String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((ji) obj) + ".inputStream()";
            case 1:
                return ((mf1) obj) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.a) {
            case 1:
                outputStream.getClass();
                mf1 mf1Var = (mf1) this.b;
                ji jiVar = mf1Var.b;
                if (mf1Var.c) {
                    uq1.o("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (jiVar.b == 0 && mf1Var.a.F(jiVar, 8192L) == -1) {
                        return j;
                    }
                    long j2 = jiVar.b;
                    j += j2;
                    kv.l(j2, 0L, j2);
                    yn1 yn1Var = jiVar.a;
                    while (j2 > 0) {
                        yn1Var.getClass();
                        int iMin = (int) Math.min(j2, yn1Var.c - yn1Var.b);
                        outputStream.write(yn1Var.a, yn1Var.b, iMin);
                        int i = yn1Var.b + iMin;
                        yn1Var.b = i;
                        long j3 = iMin;
                        jiVar.b -= j3;
                        j2 -= j3;
                        if (i == yn1Var.c) {
                            yn1 yn1VarA = yn1Var.a();
                            jiVar.a = yn1VarA;
                            ao1.a(yn1Var);
                            yn1Var = yn1VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }

    public /* synthetic */ hi(Closeable closeable, int i) {
        this.a = i;
        this.b = closeable;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ji jiVar = (ji) obj;
                if (jiVar.b > 0) {
                    return jiVar.readByte() & 255;
                }
                return -1;
            case 1:
                mf1 mf1Var = (mf1) obj;
                ji jiVar2 = mf1Var.b;
                if (mf1Var.c) {
                    uq1.o("closed");
                    return 0;
                }
                if (jiVar2.b == 0 && mf1Var.a.F(jiVar2, 8192L) == -1) {
                    return -1;
                }
                return jiVar2.readByte() & 255;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            default:
                byte[] bArr2 = new byte[1];
                if (((ll2) obj).f(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
        }
    }
}
