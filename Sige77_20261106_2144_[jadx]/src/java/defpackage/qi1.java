package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qi1 implements nw, kw {
    public ri1 W;
    public final jy a;
    public final hy b;
    public int c;
    public int d = -1;
    public hv0 e;
    public List f;
    public int i;
    public volatile d51 v;
    public File w;

    public qi1(hy hyVar, jy jyVar) {
        this.b = hyVar;
        this.a = jyVar;
    }

    @Override // defpackage.kw
    public final void b(Exception exc) {
        this.a.a(this.W, exc, this.v.c, 4);
    }

    @Override // defpackage.kw
    public final void c(Object obj) {
        this.a.b(this.e, obj, this.v.c, 4, this.W);
    }

    @Override // defpackage.nw
    public final void cancel() {
        d51 d51Var = this.v;
        if (d51Var != null) {
            d51Var.c.cancel();
        }
    }

    @Override // defpackage.nw
    public final boolean d() {
        List list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListR;
        ArrayList arrayListA = this.b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        hy hyVar = this.b;
        fh1 fh1VarA = hyVar.c.a();
        Class<?> cls = hyVar.d.getClass();
        Class cls2 = hyVar.g;
        Class cls3 = hyVar.k;
        f91 f91Var = fh1VarA.h;
        u51 u51Var = (u51) ((AtomicReference) f91Var.b).getAndSet(null);
        if (u51Var == null) {
            u51Var = new u51(cls, cls2, cls3);
        } else {
            u51Var.a = cls;
            u51Var.b = cls2;
            u51Var.c = cls3;
        }
        synchronized (((mb) f91Var.c)) {
            list = (List) ((mb) f91Var.c).get(u51Var);
        }
        ((AtomicReference) f91Var.b).set(u51Var);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            vf3 vf3Var = fh1VarA.a;
            synchronized (vf3Var) {
                arrayListR = ((ep1) vf3Var.b).r(cls);
            }
            int size = arrayListR.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListR.get(i);
                i++;
                ArrayList arrayListI = fh1VarA.c.i((Class) obj, cls2);
                int size2 = arrayListI.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListI.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!fh1VarA.f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            f91 f91Var2 = fh1VarA.h;
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (((mb) f91Var2.c)) {
                ((mb) f91Var2.c).put(new u51(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.b.d.getClass());
            Class cls5 = this.b.k;
            sb.append(" to ");
            sb.append(cls5);
            throw new IllegalStateException(sb.toString());
        }
        while (true) {
            List list3 = this.f;
            if (list3 != null && this.i < list3.size()) {
                this.v = null;
                boolean z3 = z;
                while (!z3 && this.i < this.f.size()) {
                    List list4 = this.f;
                    int i3 = this.i;
                    this.i = i3 + 1;
                    e51 e51Var = (e51) list4.get(i3);
                    File file = this.w;
                    hy hyVar2 = this.b;
                    this.v = e51Var.b(file, hyVar2.e, hyVar2.f, hyVar2.i);
                    if (this.v != null && this.b.c(this.v.c.a()) != null) {
                        this.v.c.i(this.b.o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.d + 1;
            this.d = i4;
            if (i4 >= list2.size()) {
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 >= arrayListA.size()) {
                    return z;
                }
                this.d = z ? 1 : 0;
            }
            hv0 hv0Var = (hv0) arrayListA.get(this.c);
            Class cls6 = (Class) list2.get(this.d);
            fz1 fz1VarE = this.b.e(cls6);
            hy hyVar3 = this.b;
            this.W = new ri1(hyVar3.c.a, hv0Var, hyVar3.n, hyVar3.e, hyVar3.f, fz1VarE, cls6, hyVar3.i);
            File fileD = hyVar3.h.a().d(this.W);
            this.w = fileD;
            if (fileD != null) {
                this.e = hv0Var;
                this.f = this.b.c.a().f(fileD);
                z2 = false;
                this.i = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }
}
