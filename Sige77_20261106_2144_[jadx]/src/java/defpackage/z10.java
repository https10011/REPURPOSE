package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z10 {
    public final ArrayDeque a;

    public z10(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new ArrayDeque();
                break;
        }
    }

    public void a() throws IOException {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + c());
    }

    public void b(long j) throws IOException {
        long jC = c();
        if (jC != j) {
            if (jC != -1) {
                if (jC != -2) {
                    return;
                } else {
                    jC = -2;
                }
            }
            throw new IOException("expected non-string scope or scope " + j + " but found " + jC);
        }
    }

    public long c() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
