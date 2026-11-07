package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class tr1 implements Iterator {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Iterator d;
    public final /* synthetic */ AbstractMap e;

    public /* synthetic */ tr1(ao2 ao2Var) {
        this.a = 1;
        Objects.requireNonNull(ao2Var);
        this.e = ao2Var;
        this.b = -1;
    }

    public Iterator a() {
        if (this.d == null) {
            this.d = ((rr1) this.e).b.entrySet().iterator();
        }
        return this.d;
    }

    public Iterator b() {
        if (this.d == null) {
            this.d = ((ao2) this.e).c.entrySet().iterator();
        }
        return this.d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                rr1 rr1Var = (rr1) abstractMap;
                if (this.b + 1 >= rr1Var.a.size()) {
                    return !rr1Var.b.isEmpty() && a().hasNext();
                }
                return true;
            default:
                ao2 ao2Var = (ao2) abstractMap;
                if (this.b + 1 >= ao2Var.b) {
                    return !ao2Var.c.isEmpty() && b().hasNext();
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                this.c = true;
                int i2 = this.b + 1;
                this.b = i2;
                rr1 rr1Var = (rr1) abstractMap;
                return i2 < rr1Var.a.size() ? (Map.Entry) rr1Var.a.get(this.b) : (Map.Entry) a().next();
            default:
                this.c = true;
                int i3 = this.b + 1;
                this.b = i3;
                ao2 ao2Var = (ao2) abstractMap;
                return i3 < ao2Var.b ? (bo2) ao2Var.a[i3] : (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.a;
        AbstractMap abstractMap = this.e;
        switch (i) {
            case 0:
                rr1 rr1Var = (rr1) abstractMap;
                if (!this.c) {
                    uq1.q("remove() was called before next()");
                } else {
                    this.c = false;
                    int i2 = rr1.f;
                    rr1Var.b();
                    if (this.b >= rr1Var.a.size()) {
                        a().remove();
                    } else {
                        int i3 = this.b;
                        this.b = i3 - 1;
                        rr1Var.h(i3);
                    }
                }
                break;
            default:
                if (!this.c) {
                    uq1.q("remove() was called before next()");
                } else {
                    this.c = false;
                    ao2 ao2Var = (ao2) abstractMap;
                    ao2Var.f();
                    int i4 = this.b;
                    if (i4 >= ao2Var.b) {
                        b().remove();
                    } else {
                        this.b = i4 - 1;
                        ao2Var.d(i4);
                    }
                }
                break;
        }
    }

    public tr1(rr1 rr1Var) {
        this.a = 0;
        this.e = rr1Var;
        this.b = -1;
    }
}
