package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class kl1 implements Iterable {
    public hl1 a;
    public hl1 b;
    public final WeakHashMap c = new WeakHashMap();
    public int d = 0;

    public hl1 a(Object obj) {
        hl1 hl1Var = this.a;
        while (hl1Var != null && !hl1Var.a.equals(obj)) {
            hl1Var = hl1Var.c;
        }
        return hl1Var;
    }

    public Object b(Object obj) {
        hl1 hl1VarA = a(obj);
        if (hl1VarA == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.c;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((jl1) it.next()).a(hl1VarA);
            }
        }
        hl1 hl1Var = hl1VarA.d;
        hl1 hl1Var2 = hl1VarA.c;
        if (hl1Var != null) {
            hl1Var.c = hl1Var2;
        } else {
            this.a = hl1Var2;
        }
        hl1 hl1Var3 = hl1VarA.c;
        if (hl1Var3 != null) {
            hl1Var3.d = hl1Var;
        } else {
            this.b = hl1Var;
        }
        hl1VarA.c = null;
        hl1VarA.d = null;
        return hl1VarA.b;
    }

    public final boolean equals(Object obj) {
        gl1 gl1Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kl1)) {
            return false;
        }
        kl1 kl1Var = (kl1) obj;
        if (this.d != kl1Var.d) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = kl1Var.iterator();
        while (true) {
            gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                break;
            }
            gl1 gl1Var2 = (gl1) it2;
            if (!gl1Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) gl1Var.next();
            Object next = gl1Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (gl1Var.hasNext() || ((gl1) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            gl1 gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) gl1Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        gl1 gl1Var = new gl1(this.a, this.b, 0);
        this.c.put(gl1Var, Boolean.FALSE);
        return gl1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            gl1 gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) gl1Var.next()).toString());
            if (gl1Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
