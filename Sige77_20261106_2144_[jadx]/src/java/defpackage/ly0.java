package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ly0 {
    public static cr0 a(Object obj, long j) {
        cr0 cr0Var = (cr0) i32.c.h(obj, j);
        if (((i1) cr0Var).a) {
            return cr0Var;
        }
        int size = cr0Var.size();
        ud1 ud1VarC = ((ud1) cr0Var).c(size == 0 ? 10 : size * 2);
        i32.o(obj, j, ud1VarC);
        return ud1VarC;
    }
}
