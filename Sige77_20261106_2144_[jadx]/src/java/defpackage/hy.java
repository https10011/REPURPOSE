package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hy {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public cj0 c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public bk0 h;
    public da1 i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public hv0 n;
    public vc1 o;
    public x10 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                d51 d51Var = (d51) arrayListB.get(i);
                hv0 hv0Var = d51Var.a;
                List list = d51Var.b;
                if (!arrayList.contains(hv0Var)) {
                    arrayList.add(d51Var.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add((hv0) list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                d51 d51VarB = ((e51) listF.get(i)).b(this.d, this.e, this.f, this.i);
                if (d51VarB != null) {
                    arrayList.add(d51VarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ez0 c(Class cls) {
        ez0 ez0Var;
        Class cls2;
        Class cls3;
        Class cls4;
        ez0 ez0Var2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        bj1 bj1Var;
        Class cls5 = cls;
        fh1 fh1VarA = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        fz0 fz0Var = fh1VarA.i;
        u51 u51Var = (u51) fz0Var.b.getAndSet(null);
        if (u51Var == null) {
            u51Var = new u51();
        }
        u51Var.a = cls5;
        u51Var.b = cls6;
        u51Var.c = cls7;
        synchronized (fz0Var.a) {
            ez0Var = (ez0) fz0Var.a.get(u51Var);
        }
        fz0Var.b.set(u51Var);
        fh1VarA.i.getClass();
        if (fz0.c.equals(ez0Var)) {
            return null;
        }
        if (ez0Var != null) {
            return ez0Var;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayListI = fh1VarA.c.i(cls5, cls6);
        int size = arrayListI.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            Class<?> cls8 = (Class) arrayListI.get(i2);
            ArrayList arrayListB = fh1VarA.f.b(cls8, cls7);
            int size2 = arrayListB.size();
            int i4 = 0;
            while (i4 < size2) {
                int i5 = i4 + 1;
                Class cls9 = (Class) arrayListB.get(i4);
                yd2 yd2Var = fh1VarA.c;
                synchronized (yd2Var) {
                    arrayList = new ArrayList();
                    ArrayList arrayList4 = (ArrayList) yd2Var.b;
                    int size3 = arrayList4.size();
                    arrayList2 = arrayListB;
                    int i6 = 0;
                    while (i6 < size3) {
                        Object obj = arrayList4.get(i6);
                        int i7 = i6 + 1;
                        String str = (String) obj;
                        int i8 = size2;
                        List list = (List) ((HashMap) yd2Var.c).get(str);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                ti1 ti1Var = (ti1) it.next();
                                Iterator it2 = it;
                                if (ti1Var.a.isAssignableFrom(cls5) && cls8.isAssignableFrom(ti1Var.b)) {
                                    arrayList.add(ti1Var.c);
                                }
                                it = it2;
                            }
                        }
                        size2 = i8;
                        i6 = i7;
                    }
                    i = size2;
                }
                lk0 lk0Var = fh1VarA.f;
                synchronized (lk0Var) {
                    if (cls9.isAssignableFrom(cls8)) {
                        bj1Var = xn.d;
                    } else {
                        ArrayList arrayList5 = lk0Var.a;
                        int size4 = arrayList5.size();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= size4) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            Object obj2 = arrayList5.get(i9);
                            i9++;
                            ez1 ez1Var = (ez1) obj2;
                            ArrayList arrayList6 = arrayList5;
                            if (ez1Var.a.isAssignableFrom(cls8) && cls9.isAssignableFrom(ez1Var.b)) {
                                bj1Var = ez1Var.c;
                                break;
                            }
                            cls5 = cls;
                            arrayList5 = arrayList6;
                        }
                    }
                }
                arrayList3.add(new ky(cls5, cls8, cls9, arrayList, bj1Var, fh1VarA.j));
                cls5 = cls;
                i4 = i5;
                arrayListB = arrayList2;
                size2 = i;
            }
            cls5 = cls;
            i2 = i3;
        }
        if (arrayList3.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            ez0Var2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            ez0Var2 = new ez0(cls2, cls3, cls4, arrayList3, fh1VarA.j);
        }
        fz0 fz0Var2 = fh1VarA.i;
        synchronized (fz0Var2.a) {
            fz0Var2.a.put(new u51(cls2, cls3, cls4), ez0Var2 != null ? ez0Var2 : fz0.c);
        }
        return ez0Var2;
    }

    public final g60 d(Object obj) {
        g60 g60Var;
        pv2 pv2Var = this.c.a().b;
        Class<?> cls = obj.getClass();
        synchronized (pv2Var) {
            ArrayList arrayList = (ArrayList) pv2Var.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    g60Var = null;
                    break;
                }
                Object obj2 = arrayList.get(i);
                i++;
                j60 j60Var = (j60) obj2;
                if (j60Var.a.isAssignableFrom(cls)) {
                    g60Var = j60Var.b;
                    break;
                }
            }
        }
        if (g60Var != null) {
            return g60Var;
        }
        throw new eh1("Failed to find source encoder for data class: " + obj.getClass());
    }

    public final fz1 e(Class cls) {
        fz1 fz1Var = (fz1) this.j.get(cls);
        if (fz1Var == null) {
            for (Map.Entry entry : this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    fz1Var = (fz1) entry.getValue();
                    break;
                }
            }
        }
        if (fz1Var != null) {
            return fz1Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return s22.b;
        }
        uq1.e(cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.", "Missing transformation for ");
        return null;
    }
}
