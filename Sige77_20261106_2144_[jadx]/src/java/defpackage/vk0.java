package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class vk0 {
    public static final ir1 q;
    public static final ot0 r;
    public static final vk0 s;
    public static final List t;
    public static final if0 p = if0.d;
    public static final int u = 1;
    public static final int v = 1;
    public static final int w = 2;
    public final c80 a = c80.c;
    public final int k = 1;
    public final int l = u;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final int e = 2;
    public final int f = 2;
    public final boolean g = true;
    public final if0 h = p;
    public int m = 0;
    public final boolean i = true;
    public final int n = v;
    public final int o = w;
    public final ArrayDeque j = new ArrayDeque();

    static {
        ir1 ir1Var = new ir1(Collections.EMPTY_MAP, true, Collections.EMPTY_LIST);
        q = ir1Var;
        ot0 ot0Var = new ot0(ir1Var);
        r = ot0Var;
        vk0 vk0Var = new vk0();
        s = vk0Var;
        t = vk0Var.a(ir1Var, ot0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List b(AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }

    public final List a(ir1 ir1Var, ot0 ot0Var) {
        h12 h12Var;
        h12 h12Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(r12.B);
        int i = this.n;
        int i2 = 1;
        arrayList.add(i == 1 ? d81.c : new c81(i));
        arrayList.add(this.a);
        ArrayList arrayList2 = this.c;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = this.d;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        boolean z = ys1.a;
        int i3 = 0;
        qs0.b bVar = null;
        int i4 = this.e;
        int i5 = this.f;
        if (i4 != 2 || i5 != 2) {
            h12 h12Var3 = new h12(Date.class, new ty(sy.b, i4, i5), i3);
            if (z) {
                xs1 xs1Var = ys1.c;
                xs1Var.getClass();
                h12Var2 = new h12(xs1Var.a, new ty(xs1Var, i4, i5), i3);
                xs1 xs1Var2 = ys1.b;
                xs1Var2.getClass();
                h12Var = new h12(xs1Var2.a, new ty(xs1Var2, i4, i5), i3);
            } else {
                h12Var = null;
                h12Var2 = null;
            }
            arrayList.add(h12Var3);
            if (z) {
                arrayList.add(h12Var2);
                arrayList.add(h12Var);
            }
        }
        arrayList.add(r12.r);
        arrayList.add(r12.g);
        arrayList.add(r12.d);
        arrayList.add(r12.e);
        arrayList.add(r12.f);
        if (this.k == 0) {
            throw null;
        }
        q02 q02Var = r12.k;
        arrayList.add(new i12(Long.TYPE, Long.class, q02Var));
        arrayList.add(new i12(Double.TYPE, Double.class, r12.m));
        arrayList.add(new i12(Float.TYPE, Float.class, r12.l));
        int i6 = this.o;
        arrayList.add(i6 == 2 ? s71.b : new r71(new s71(i6), i3));
        arrayList.add(r12.h);
        arrayList.add(r12.i);
        Objects.requireNonNull(q02Var);
        arrayList.add(new h12(AtomicLong.class, new p02(q02Var, 1).a(), i3));
        arrayList.add(new h12(AtomicLongArray.class, new p02(q02Var, 0).a(), i3));
        arrayList.add(r12.j);
        arrayList.add(r12.n);
        arrayList.add(r12.s);
        arrayList.add(r12.t);
        arrayList.add(r12.o);
        arrayList.add(r12.p);
        arrayList.add(r12.q);
        arrayList.add(r12.u);
        arrayList.add(r12.v);
        arrayList.add(r12.x);
        arrayList.add(r12.y);
        arrayList.add(r12.A);
        arrayList.add(r12.w);
        arrayList.add(r12.b);
        arrayList.add(ty.c);
        arrayList.add(r12.z);
        try {
            os0 os0Var = qs0.a;
            ((qs0) ((q12) qs0.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            bVar = qs0.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.addAll(ys1.d);
        arrayList.add(qb.c);
        arrayList.add(r12.a);
        arrayList.add(new io(ir1Var, i3));
        arrayList.add(new io(ir1Var, i2));
        arrayList.add(ot0Var);
        arrayList.add(r12.C);
        arrayList.add(new yg1(ir1Var, this.l, this.a, ot0Var, b(this.j)));
        arrayList.trimToSize();
        return Collections.unmodifiableList(arrayList);
    }
}
