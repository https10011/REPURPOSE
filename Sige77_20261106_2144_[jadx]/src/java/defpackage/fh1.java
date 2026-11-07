package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fh1 {
    public final vf3 a;
    public final pv2 b;
    public final yd2 c;
    public final gk1 d;
    public final xw e;
    public final lk0 f;
    public final ri2 g;
    public final f91 h = new f91(6);
    public final fz0 i = new fz0();
    public final ac2 j;

    public fh1() {
        int i = 6;
        ac2 ac2Var = new ac2(new ac1(20), new op0(i), new br0(i));
        this.j = ac2Var;
        this.a = new vf3(ac2Var);
        this.b = new pv2(9);
        this.c = new yd2(6);
        this.d = new gk1(17);
        int i2 = 0;
        this.e = new xw(0);
        lk0 lk0Var = new lk0();
        lk0Var.a = new ArrayList();
        this.f = lk0Var;
        this.g = new ri2(11);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        yd2 yd2Var = this.c;
        synchronized (yd2Var) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) yd2Var.b);
                ((ArrayList) yd2Var.b).clear();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((ArrayList) yd2Var.b).add((String) obj);
                }
                int size2 = arrayList2.size();
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    String str = (String) obj2;
                    if (!arrayList.contains(str)) {
                        ((ArrayList) yd2Var.b).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Class cls, g60 g60Var) {
        pv2 pv2Var = this.b;
        synchronized (pv2Var) {
            ((ArrayList) pv2Var.a).add(new j60(cls, g60Var));
        }
    }

    public final void b(Class cls, vi1 vi1Var) {
        gk1 gk1Var = this.d;
        synchronized (gk1Var) {
            ((ArrayList) gk1Var.b).add(new wi1(cls, vi1Var));
        }
    }

    public final void c(Class cls, Class cls2, f51 f51Var) {
        vf3 vf3Var = this.a;
        synchronized (vf3Var) {
            ((ep1) vf3Var.b).h(cls, cls2, f51Var);
            ((HashMap) ((wa) vf3Var.c).b).clear();
        }
    }

    public final void d(String str, Class cls, Class cls2, si1 si1Var) {
        yd2 yd2Var = this.c;
        synchronized (yd2Var) {
            yd2Var.h(str).add(new ti1(cls, cls2, si1Var));
        }
    }

    public final ArrayList e() {
        ArrayList arrayList;
        ri2 ri2Var = this.g;
        synchronized (ri2Var) {
            arrayList = (ArrayList) ri2Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new eh1("Failed to find image header parser.");
        }
        return arrayList;
    }

    public final List f(Object obj) {
        List listUnmodifiableList;
        vf3 vf3Var = this.a;
        vf3Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (vf3Var) {
            g51 g51Var = (g51) ((HashMap) ((wa) vf3Var.c).b).get(cls);
            listUnmodifiableList = g51Var == null ? null : g51Var.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((ep1) vf3Var.b).j(cls));
                if (((g51) ((HashMap) ((wa) vf3Var.c).b).put(cls, new g51(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new eh1("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            e51 e51Var = (e51) listUnmodifiableList.get(i);
            if (e51Var.a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(e51Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new eh1("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    public final vw g(Object obj) {
        vw vwVarB;
        xw xwVar = this.e;
        synchronized (xwVar) {
            try {
                am2.o(obj);
                uw uwVar = (uw) xwVar.a.get(obj.getClass());
                if (uwVar == null) {
                    for (uw uwVar2 : xwVar.a.values()) {
                        if (uwVar2.a().isAssignableFrom(obj.getClass())) {
                            uwVar = uwVar2;
                            break;
                        }
                    }
                }
                if (uwVar == null) {
                    uwVar = xw.b;
                }
                vwVarB = uwVar.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return vwVarB;
    }

    public final void h(uw uwVar) {
        xw xwVar = this.e;
        synchronized (xwVar) {
            xwVar.a.put(uwVar.a(), uwVar);
        }
    }

    public final void i(Class cls, Class cls2, bj1 bj1Var) {
        lk0 lk0Var = this.f;
        synchronized (lk0Var) {
            lk0Var.a.add(new ez1(cls, cls2, bj1Var));
        }
    }
}
