package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lh0 implements Runnable {
    public static final ThreadLocal e = new ThreadLocal();
    public static final rs f = new rs(1);
    public ArrayList a;
    public long b;
    public long c;
    public ArrayList d;

    public static kg1 c(RecyclerView recyclerView, int i, long j) {
        int iG = recyclerView.e.G();
        for (int i2 = 0; i2 < iG; i2++) {
            kg1 kg1VarI = RecyclerView.I(recyclerView.e.F(i2));
            if (kg1VarI.c == i && !kg1VarI.f()) {
                return null;
            }
        }
        dg1 dg1Var = recyclerView.b;
        try {
            recyclerView.P();
            kg1 kg1VarJ = dg1Var.j(i, j);
            if (kg1VarJ != null) {
                if (!kg1VarJ.e() || kg1VarJ.f()) {
                    dg1Var.a(kg1VarJ, false);
                } else {
                    dg1Var.g(kg1VarJ.a);
                }
            }
            return kg1VarJ;
        } finally {
            recyclerView.Q(false);
        }
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.g0 && this.b == 0) {
            this.b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        we weVar = recyclerView.P0;
        weVar.a = i;
        weVar.b = i2;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    public final void b(long j) {
        kh0 kh0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        kh0 kh0Var2;
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            we weVar = recyclerView3.P0;
            if (windowVisibility == 0) {
                weVar.c(recyclerView3, false);
                i += weVar.c;
            }
        }
        arrayList.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                we weVar2 = recyclerView4.P0;
                int iAbs = Math.abs(weVar2.b) + Math.abs(weVar2.a);
                for (int i5 = 0; i5 < weVar2.c * 2; i5 += 2) {
                    if (i3 >= arrayList.size()) {
                        kh0Var2 = new kh0();
                        arrayList.add(kh0Var2);
                    } else {
                        kh0Var2 = (kh0) arrayList.get(i3);
                    }
                    int[] iArr = (int[]) weVar2.d;
                    int i6 = iArr[i5 + 1];
                    kh0Var2.a = i6 <= iAbs;
                    kh0Var2.b = iAbs;
                    kh0Var2.c = i6;
                    kh0Var2.d = recyclerView4;
                    kh0Var2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList, f);
        for (int i7 = 0; i7 < arrayList.size() && (recyclerView = (kh0Var = (kh0) arrayList.get(i7)).d) != null; i7++) {
            kg1 kg1VarC = c(recyclerView, kh0Var.e, kh0Var.a ? Long.MAX_VALUE : j);
            if (kg1VarC != null && kg1VarC.b != null && kg1VarC.e() && !kg1VarC.f() && (recyclerView2 = (RecyclerView) kg1VarC.b.get()) != null) {
                if (recyclerView2.p0 && recyclerView2.e.G() != 0) {
                    dg1 dg1Var = recyclerView2.b;
                    uf1 uf1Var = recyclerView2.y0;
                    if (uf1Var != null) {
                        uf1Var.e();
                    }
                    xf1 xf1Var = recyclerView2.b0;
                    if (xf1Var != null) {
                        xf1Var.h0(dg1Var);
                        recyclerView2.b0.i0(dg1Var);
                    }
                    dg1Var.a.clear();
                    dg1Var.e();
                }
                we weVar3 = recyclerView2.P0;
                weVar3.c(recyclerView2, true);
                if (weVar3.c != 0) {
                    try {
                        int i8 = cz1.a;
                        Trace.beginSection("RV Nested Prefetch");
                        hg1 hg1Var = recyclerView2.Q0;
                        pf1 pf1Var = recyclerView2.a0;
                        hg1Var.d = 1;
                        hg1Var.e = pf1Var.a();
                        hg1Var.g = false;
                        hg1Var.h = false;
                        hg1Var.i = false;
                        for (int i9 = 0; i9 < weVar3.c * 2; i9 += 2) {
                            c(recyclerView2, ((int[]) weVar3.d)[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = cz1.a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            kh0Var.a = false;
            kh0Var.b = 0;
            kh0Var.c = 0;
            kh0Var.d = null;
            kh0Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.a;
        try {
            int i = cz1.a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.c);
                }
            }
            this.b = 0L;
        } finally {
            this.b = 0L;
            int i3 = cz1.a;
            Trace.endSection();
        }
    }
}
