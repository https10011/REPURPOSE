package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pk1 {
    public l82 a;
    public ArrayList b;

    public static long a(z00 z00Var, long j) {
        l82 l82Var = z00Var.d;
        ArrayList arrayList = z00Var.k;
        if (l82Var instanceof am0) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            v00 v00Var = (v00) arrayList.get(i);
            if (v00Var instanceof z00) {
                z00 z00Var2 = (z00) v00Var;
                if (z00Var2.d != l82Var) {
                    jMin = Math.min(jMin, a(z00Var2, ((long) z00Var2.f) + j));
                }
            }
        }
        z00 z00Var3 = l82Var.i;
        z00 z00Var4 = l82Var.h;
        if (z00Var != z00Var3) {
            return jMin;
        }
        long j2 = j - l82Var.j();
        return Math.min(Math.min(jMin, a(z00Var4, j2)), j2 - ((long) z00Var4.f));
    }

    public static long b(z00 z00Var, long j) {
        l82 l82Var = z00Var.d;
        ArrayList arrayList = z00Var.k;
        if (l82Var instanceof am0) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            v00 v00Var = (v00) arrayList.get(i);
            if (v00Var instanceof z00) {
                z00 z00Var2 = (z00) v00Var;
                if (z00Var2.d != l82Var) {
                    jMax = Math.max(jMax, b(z00Var2, ((long) z00Var2.f) + j));
                }
            }
        }
        z00 z00Var3 = l82Var.h;
        z00 z00Var4 = l82Var.i;
        if (z00Var != z00Var3) {
            return jMax;
        }
        long j2 = l82Var.j() + j;
        return Math.max(Math.max(jMax, b(z00Var4, j2)), j2 - ((long) z00Var4.f));
    }
}
