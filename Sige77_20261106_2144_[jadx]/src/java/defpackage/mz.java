package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mz extends uf1 {
    public static TimeInterpolator s;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((kg1) arrayList.get(size)).a.animate().cancel();
        }
    }

    @Override // defpackage.uf1
    public final boolean a(kg1 kg1Var, kg1 kg1Var2, u61 u61Var, u61 u61Var2) {
        int i;
        int i2;
        int i3 = u61Var.a;
        int i4 = u61Var.b;
        if (kg1Var2.o()) {
            int i5 = u61Var.a;
            i2 = u61Var.b;
            i = i5;
        } else {
            i = u61Var2.a;
            i2 = u61Var2.b;
        }
        if (kg1Var == kg1Var2) {
            return g(kg1Var, i3, i4, i, i2);
        }
        View view = kg1Var.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(kg1Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = kg1Var2.a;
        l(kg1Var2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.k;
        kz kzVar = new kz();
        kzVar.a = kg1Var;
        kzVar.b = kg1Var2;
        kzVar.c = i3;
        kzVar.d = i4;
        kzVar.e = i;
        kzVar.f = i2;
        arrayList.add(kzVar);
        return true;
    }

    @Override // defpackage.uf1
    public final void d(kg1 kg1Var) {
        ArrayList arrayList = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        View view = kg1Var.a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((lz) arrayList4.get(size)).a == kg1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(kg1Var);
                arrayList4.remove(size);
            }
        }
        j(this.k, kg1Var);
        if (this.h.remove(kg1Var)) {
            view.setAlpha(1.0f);
            c(kg1Var);
        }
        if (this.i.remove(kg1Var)) {
            view.setAlpha(1.0f);
            c(kg1Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, kg1Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            for (int size4 = arrayList6.size() - 1; size4 >= 0; size4--) {
                if (((lz) arrayList6.get(size4)).a == kg1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(kg1Var);
                    arrayList6.remove(size4);
                    if (!arrayList6.isEmpty()) {
                        break;
                    }
                    arrayList2.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(kg1Var)) {
                view.setAlpha(1.0f);
                c(kg1Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.q.remove(kg1Var);
        this.o.remove(kg1Var);
        this.r.remove(kg1Var);
        this.p.remove(kg1Var);
        i();
    }

    @Override // defpackage.uf1
    public final void e() {
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.n;
        ArrayList arrayList3 = this.l;
        ArrayList arrayList4 = this.m;
        ArrayList arrayList5 = this.i;
        ArrayList arrayList6 = this.h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            lz lzVar = (lz) arrayList7.get(size);
            View view = lzVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(lzVar.a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((kg1) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            kg1 kg1Var = (kg1) arrayList5.get(size3);
            kg1Var.a.setAlpha(1.0f);
            c(kg1Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList.size() - 1; size4 >= 0; size4--) {
            kz kzVar = (kz) arrayList.get(size4);
            kg1 kg1Var2 = kzVar.a;
            if (kg1Var2 != null) {
                k(kzVar, kg1Var2);
            }
            kg1 kg1Var3 = kzVar.b;
            if (kg1Var3 != null) {
                k(kzVar, kg1Var3);
            }
        }
        arrayList.clear();
        if (f()) {
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList4.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    lz lzVar2 = (lz) arrayList8.get(size6);
                    View view2 = lzVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(lzVar2.a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList4.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList3.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList3.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    kg1 kg1Var4 = (kg1) arrayList9.get(size8);
                    kg1Var4.a.setAlpha(1.0f);
                    c(kg1Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList3.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList2.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList2.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    kz kzVar2 = (kz) arrayList10.get(size10);
                    kg1 kg1Var5 = kzVar2.a;
                    if (kg1Var5 != null) {
                        k(kzVar2, kg1Var5);
                    }
                    kg1 kg1Var6 = kzVar2.b;
                    if (kg1Var6 != null) {
                        k(kzVar2, kg1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList2.remove(arrayList10);
                    }
                }
            }
            h(this.q);
            h(this.p);
            h(this.o);
            h(this.r);
            ArrayList arrayList11 = this.b;
            if (arrayList11.size() <= 0) {
                arrayList11.clear();
            } else {
                arrayList11.get(0).getClass();
                ur.a();
            }
        }
    }

    @Override // defpackage.uf1
    public final boolean f() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean g(kg1 kg1Var, int i, int i2, int i3, int i4) {
        View view = kg1Var.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) kg1Var.a.getTranslationY());
        l(kg1Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(kg1Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.j;
        lz lzVar = new lz();
        lzVar.a = kg1Var;
        lzVar.b = translationX;
        lzVar.c = translationY;
        lzVar.d = i3;
        lzVar.e = i4;
        arrayList.add(lzVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            ur.a();
        }
    }

    public final void j(ArrayList arrayList, kg1 kg1Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            kz kzVar = (kz) arrayList.get(size);
            if (k(kzVar, kg1Var) && kzVar.a == null && kzVar.b == null) {
                arrayList.remove(kzVar);
            }
        }
    }

    public final boolean k(kz kzVar, kg1 kg1Var) {
        if (kzVar.b == kg1Var) {
            kzVar.b = null;
        } else {
            if (kzVar.a != kg1Var) {
                return false;
            }
            kzVar.a = null;
        }
        View view = kg1Var.a;
        View view2 = kg1Var.a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(kg1Var);
        return true;
    }

    public final void l(kg1 kg1Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        kg1Var.a.animate().setInterpolator(s);
        d(kg1Var);
    }
}
