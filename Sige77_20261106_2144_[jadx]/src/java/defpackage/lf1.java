package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lf1 implements qi {
    public final kr1 a;
    public final ji b;
    public boolean c;

    public lf1(kr1 kr1Var) {
        kr1Var.getClass();
        this.a = kr1Var;
        this.b = new ji();
    }

    @Override // defpackage.qi
    public final qi H(byte[] bArr, int i) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.write(bArr, 0, i);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi K(String str) {
        str.getClass();
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.Y(str);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi L(long j) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.T(j);
        a();
        return this;
    }

    public final qi a() {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        ji jiVar = this.b;
        long jL = jiVar.l();
        if (jL > 0) {
            this.a.f(jiVar, jL);
        }
        return this;
    }

    @Override // defpackage.qi
    public final ji c() {
        return this.b;
    }

    @Override // defpackage.kr1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        kr1 kr1Var = this.a;
        if (this.c) {
            return;
        }
        ji jiVar = this.b;
        long j = jiVar.b;
        if (j > 0) {
            kr1Var.f(jiVar, j);
        }
        th = null;
        try {
            kr1Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.kr1
    public final vx1 d() {
        return this.a.d();
    }

    @Override // defpackage.kr1
    public final void f(ji jiVar, long j) {
        jiVar.getClass();
        if (this.c) {
            uq1.q("closed");
        } else {
            this.b.f(jiVar, j);
            a();
        }
    }

    @Override // defpackage.qi, defpackage.kr1, java.io.Flushable
    public final void flush() {
        if (this.c) {
            uq1.q("closed");
            return;
        }
        ji jiVar = this.b;
        long j = jiVar.b;
        kr1 kr1Var = this.a;
        if (j > 0) {
            kr1Var.f(jiVar, j);
        }
        kr1Var.flush();
    }

    @Override // defpackage.qi
    public final qi g(rj rjVar) {
        rjVar.getClass();
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.N(rjVar);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi h(long j) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.U(j);
        a();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.qi
    public final qi write(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.write(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi writeByte(int i) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.S(i);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi writeInt(int i) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.V(i);
        a();
        return this;
    }

    @Override // defpackage.qi
    public final qi writeShort(int i) {
        if (this.c) {
            uq1.q("closed");
            return null;
        }
        this.b.W(i);
        a();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (!this.c) {
            int iWrite = this.b.write(byteBuffer);
            a();
            return iWrite;
        }
        uq1.q("closed");
        return 0;
    }
}
