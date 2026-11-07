package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class u22 {
    public static t22 a(Object obj) {
        sh0 sh0Var = (sh0) obj;
        t22 t22Var = sh0Var.unknownFields;
        if (t22Var != t22.f) {
            return t22Var;
        }
        t22 t22Var2 = new t22(0, new int[8], new Object[8], true);
        sh0Var.unknownFields = t22Var2;
        return t22Var2;
    }

    public static boolean b(int i, we weVar, Object obj) throws ur0 {
        sn snVar = (sn) weVar.d;
        int i2 = weVar.a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            weVar.B(0);
            ((t22) obj).c(i3 << 3, Long.valueOf(snVar.n()));
            return true;
        }
        if (i4 == 1) {
            weVar.B(1);
            ((t22) obj).c((i3 << 3) | 1, Long.valueOf(snVar.k()));
            return true;
        }
        if (i4 == 2) {
            ((t22) obj).c((i3 << 3) | 2, weVar.j());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw ur0.b();
            }
            weVar.B(5);
            ((t22) obj).c(5 | (i3 << 3), Integer.valueOf(snVar.j()));
            return true;
        }
        t22 t22Var = new t22(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new ur0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (weVar.e() != Integer.MAX_VALUE && b(i7, weVar, t22Var)) {
        }
        if (i6 != weVar.a) {
            throw new ur0("Protocol message end-group tag did not match expected tag.");
        }
        if (t22Var.e) {
            t22Var.e = false;
        }
        ((t22) obj).c(i5 | 3, t22Var);
        return true;
    }
}
