package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b22 {
    public static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final ud2 b;
    public volatile int c = 0;

    public b22(ud2 ud2Var, int i) {
        this.b = ud2Var;
        this.a = i;
    }

    public final int a(int i) {
        s41 s41VarB = b();
        int iA = s41VarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) s41VarB.d;
        int i2 = iA + s41VarB.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final s41 b() {
        ThreadLocal threadLocal = d;
        s41 s41Var = (s41) threadLocal.get();
        if (s41Var == null) {
            s41Var = new s41();
            threadLocal.set(s41Var);
        }
        t41 t41Var = (t41) this.b.a;
        int iA = t41Var.a(6);
        if (iA != 0) {
            int i = iA + t41Var.a;
            int i2 = (this.a * 4) + ((ByteBuffer) t41Var.d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) t41Var.d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) t41Var.d;
            s41Var.d = byteBuffer;
            if (byteBuffer != null) {
                s41Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                s41Var.b = i4;
                s41Var.c = ((ByteBuffer) s41Var.d).getShort(i4);
                return s41Var;
            }
            s41Var.a = 0;
            s41Var.b = 0;
            s41Var.c = 0;
        }
        return s41Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        s41 s41VarB = b();
        int iA = s41VarB.a(4);
        sb.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) s41VarB.d).getInt(iA + s41VarB.a) : 0));
        sb.append(", codepoints:");
        s41 s41VarB2 = b();
        int iA2 = s41VarB2.a(16);
        if (iA2 != 0) {
            int i2 = iA2 + s41VarB2.a;
            i = ((ByteBuffer) s41VarB2.d).getInt(((ByteBuffer) s41VarB2.d).getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
