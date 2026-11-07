package defpackage;

import java.io.File;
import java.util.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mb0 extends w0 {
    public final ArrayDeque c;
    public final /* synthetic */ ob0 d;

    public mb0(ob0 ob0Var) {
        this.d = ob0Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        File file = ob0Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (!file.isFile()) {
            this.a = 2;
        } else {
            file.getClass();
            arrayDeque.push(new kb0(file));
        }
    }

    @Override // defpackage.w0
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            nb0 nb0Var = (nb0) arrayDeque.peek();
            if (nb0Var == null) {
                file = null;
                break;
            }
            File fileA = nb0Var.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (Intrinsics.areEqual(fileA, nb0Var.a) || !fileA.isDirectory() || arrayDeque.size() >= this.d.f) {
                    file = fileA;
                    break;
                }
                arrayDeque.push(b(fileA));
            }
        }
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public final ib0 b(File file) {
        int iOrdinal = this.d.b.ordinal();
        if (iOrdinal == 0) {
            return new lb0(this, file);
        }
        if (iOrdinal == 1) {
            return new jb0(this, file);
        }
        throw new e71();
    }
}
