package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ii extends OutputStream {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ii(FileOutputStream fileOutputStream) {
        this.b = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                break;
            default:
                ((FileOutputStream) this.b).flush();
                break;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((ji) this.b) + ".outputStream()";
            default:
                return super.toString();
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.a;
        Object obj = this.b;
        bArr.getClass();
        switch (i3) {
            case 0:
                ((ji) obj).write(bArr, i, i2);
                break;
            default:
                ((FileOutputStream) obj).write(bArr, i, i2);
                break;
        }
    }

    public ii(ji jiVar) {
        this.b = jiVar;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        switch (this.a) {
            case 1:
                bArr.getClass();
                ((FileOutputStream) this.b).write(bArr);
                break;
            default:
                super.write(bArr);
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                ((ji) obj).S(i);
                break;
            default:
                ((FileOutputStream) obj).write(i);
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void e() {
    }
}
