package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k82 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                k82 k82Var = (k82) arrayList.get(i);
                if (this.e == k82Var.b) {
                    c(this.c, k82Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(zx0 zx0Var, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        rr rrVar = (rr) ((qr) arrayList.get(0)).S;
        zx0Var.t();
        rrVar.b(zx0Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((qr) arrayList.get(i2)).b(zx0Var, false);
        }
        if (i == 0 && rrVar.y0 > 0) {
            rq0.k(rrVar, zx0Var, arrayList, 0);
        }
        if (i == 1 && rrVar.z0 > 0) {
            rq0.k(rrVar, zx0Var, arrayList, 1);
        }
        try {
            zx0Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            qr qrVar = (qr) arrayList.get(i3);
            c11 c11Var = new c11(10);
            new WeakReference(qrVar);
            zx0.n(qrVar.H);
            zx0.n(qrVar.I);
            zx0.n(qrVar.J);
            zx0.n(qrVar.K);
            zx0.n(qrVar.L);
            this.d.add(c11Var);
        }
        if (i == 0) {
            iN = zx0.n(rrVar.H);
            iN2 = zx0.n(rrVar.J);
            zx0Var.t();
        } else {
            iN = zx0.n(rrVar.I);
            iN2 = zx0.n(rrVar.K);
            zx0Var.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, k82 k82Var) {
        int i2 = k82Var.b;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            qr qrVar = (qr) obj;
            ArrayList arrayList2 = k82Var.a;
            if (!arrayList2.contains(qrVar)) {
                arrayList2.add(qrVar);
            }
            if (i == 0) {
                qrVar.m0 = i2;
            } else {
                qrVar.n0 = i2;
            }
        }
        this.e = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strH = ts.h(this.b, "] <", sb);
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            strH = strH + " " + ((qr) obj).g0;
        }
        return strH.concat(" >");
    }
}
