package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v51 implements lw, kw {
    public final ArrayList a;
    public final yb1 b;
    public int c;
    public vc1 d;
    public kw e;
    public List f;
    public boolean i;

    public v51(ArrayList arrayList, yb1 yb1Var) {
        this.b = yb1Var;
        if (arrayList.isEmpty()) {
            e.g("Must not be empty.");
            throw null;
        }
        this.a = arrayList;
        this.c = 0;
    }

    @Override // defpackage.lw
    public final Class a() {
        return ((lw) this.a.get(0)).a();
    }

    @Override // defpackage.kw
    public final void b(Exception exc) {
        List list = this.f;
        am2.p(list, "Argument must not be null");
        list.add(exc);
        d();
    }

    @Override // defpackage.kw
    public final void c(Object obj) {
        if (obj != null) {
            this.e.c(obj);
        } else {
            d();
        }
    }

    @Override // defpackage.lw
    public final void cancel() {
        this.i = true;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((lw) obj).cancel();
        }
    }

    public final void d() {
        if (this.i) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            i(this.d, this.e);
        } else {
            am2.o(this.f);
            this.e.b(new ej0("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.lw
    public final void h() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((lw) obj).h();
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        this.d = vc1Var;
        this.e = kwVar;
        this.f = (List) this.b.h();
        ((lw) this.a.get(this.c)).i(vc1Var, this);
        if (this.i) {
            cancel();
        }
    }

    @Override // defpackage.lw
    public final int j() {
        return ((lw) this.a.get(0)).j();
    }
}
