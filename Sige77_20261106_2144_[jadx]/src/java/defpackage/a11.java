package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class a11 {
    public final int a;
    public final pv2 b;
    public final sh1 c;
    public int d;
    public int e;
    public int f;

    public a11(int i) {
        this.a = i;
        if (i <= 0) {
            e.g("maxSize <= 0");
            throw null;
        }
        this.b = new pv2(14);
        this.c = new sh1(7);
    }

    public Object a(Object obj) {
        obj.getClass();
        return null;
    }

    public final Object b(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            pv2 pv2Var = this.b;
            pv2Var.getClass();
            Object obj2 = ((LinkedHashMap) pv2Var.a).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            Object objA = a(obj);
            if (objA == null) {
                return null;
            }
            synchronized (this.c) {
                try {
                    pv2 pv2Var2 = this.b;
                    pv2Var2.getClass();
                    objPut = ((LinkedHashMap) pv2Var2.a).put(obj, objA);
                    if (objPut != null) {
                        pv2 pv2Var3 = this.b;
                        pv2Var3.getClass();
                        ((LinkedHashMap) pv2Var3.a).put(obj, objPut);
                    } else {
                        this.d++;
                        Unit unit = Unit.a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                return objPut;
            }
            d(this.a);
            return objA;
        }
    }

    public final Object c(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            try {
                this.d++;
                pv2 pv2Var = this.b;
                pv2Var.getClass();
                objPut = ((LinkedHashMap) pv2Var.a).put(obj, obj2);
                if (objPut != null) {
                    this.d--;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        d(this.a);
        return objPut;
    }

    public final void d(int i) {
        Object next;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.a).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !((LinkedHashMap) this.b.a).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.b.a).entrySet();
                        setEntrySet.getClass();
                        if (setEntrySet instanceof List) {
                            List list = (List) setEntrySet;
                            next = list.isEmpty() ? null : list.get(0);
                        } else {
                            Iterator it = setEntrySet.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        pv2 pv2Var = this.b;
                        pv2Var.getClass();
                        key.getClass();
                        ((LinkedHashMap) pv2Var.a).remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
