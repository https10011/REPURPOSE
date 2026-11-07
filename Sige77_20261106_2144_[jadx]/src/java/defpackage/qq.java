package defpackage;

import android.content.Context;
import com.linecorp.linesdk.LineApiError;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qq implements kq, m90 {
    public static final oq v = new oq(0);
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object a = jx0.a;
    public Object i = LineApiError.d;

    @Override // defpackage.kq
    public synchronized zd1 b(je1 je1Var) {
        bw0 bw0Var = (bw0) ((HashMap) this.c).get(je1Var);
        if (bw0Var != null) {
            return bw0Var;
        }
        return v;
    }

    public void d(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            aq aqVar = (aq) entry.getKey();
            zd1 zd1Var = (zd1) entry.getValue();
            int i = aqVar.d;
            if (i == 1 || (i == 2 && z)) {
                zd1Var.get();
            }
        }
        o70 o70Var = (o70) this.e;
        synchronized (o70Var) {
            try {
                arrayDeque = o70Var.b;
                if (arrayDeque != null) {
                    o70Var.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw y00.i(it);
            }
        }
    }

    @Override // defpackage.kq
    public synchronized zd1 f(je1 je1Var) {
        g93.k(je1Var, "Null interface requested.");
        return (zd1) ((HashMap) this.b).get(je1Var);
    }

    @Override // defpackage.yd1
    public Object get() {
        Context context = (Context) ((yd1) this.a).get();
        q41 q41Var = (q41) ((yd1) this.b).get();
        bl1 bl1Var = (bl1) ((yd1) this.c).get();
        ac2 ac2Var = (ac2) ((p11) this.d).get();
        Executor executor = (Executor) ((yd1) this.e).get();
        bl1 bl1Var2 = (bl1) ((yd1) this.f).get();
        br0 br0Var = new br0(10);
        k42 k42Var = new k42(9);
        bl1 bl1Var3 = (bl1) ((yd1) this.i).get();
        ue2 ue2Var = new ue2();
        ue2Var.a = context;
        ue2Var.b = q41Var;
        ue2Var.c = bl1Var;
        ue2Var.d = ac2Var;
        ue2Var.e = executor;
        ue2Var.f = bl1Var2;
        ue2Var.g = br0Var;
        ue2Var.h = k42Var;
        ue2Var.i = bl1Var3;
        return ue2Var;
    }

    public void h() {
        for (aq aqVar : ((HashMap) this.a).keySet()) {
            for (u00 u00Var : aqVar.c) {
                if (u00Var.b == 2 && !((HashMap) this.c).containsKey(u00Var.a)) {
                    HashMap map = (HashMap) this.c;
                    je1 je1Var = u00Var.a;
                    Set set = Collections.EMPTY_SET;
                    bw0 bw0Var = new bw0();
                    bw0Var.b = null;
                    bw0Var.a = Collections.newSetFromMap(new ConcurrentHashMap());
                    bw0Var.a.addAll(set);
                    map.put(je1Var, bw0Var);
                } else if (((HashMap) this.b).containsKey(u00Var.a)) {
                    continue;
                } else {
                    int i = u00Var.b;
                    if (i == 1) {
                        throw new w00("Unsatisfied dependency for component " + aqVar + ": " + u00Var.a, 1);
                    }
                    if (i != 2) {
                        HashMap map2 = (HashMap) this.b;
                        je1 je1Var2 = u00Var.a;
                        sm0 sm0Var = ba1.c;
                        oq oqVar = ba1.d;
                        ba1 ba1Var = new ba1();
                        ba1Var.a = sm0Var;
                        ba1Var.b = oqVar;
                        map2.put(je1Var2, ba1Var);
                    }
                }
            }
        }
    }

    public ArrayList i(ArrayList arrayList) {
        HashMap map = (HashMap) this.b;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            aq aqVar = (aq) obj;
            if (aqVar.e == 0) {
                zd1 zd1Var = (zd1) ((HashMap) this.a).get(aqVar);
                for (je1 je1Var : aqVar.b) {
                    if (map.containsKey(je1Var)) {
                        arrayList2.add(new x4(13, (ba1) ((zd1) map.get(je1Var)), zd1Var));
                    } else {
                        map.put(je1Var, zd1Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList j() {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.a).entrySet()) {
            aq aqVar = (aq) entry.getKey();
            if (aqVar.e != 0) {
                zd1 zd1Var = (zd1) entry.getValue();
                for (je1 je1Var : aqVar.b) {
                    if (!map2.containsKey(je1Var)) {
                        map2.put(je1Var, new HashSet());
                    }
                    ((Set) map2.get(je1Var)).add(zd1Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                bw0 bw0Var = (bw0) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new x4(14, bw0Var, (zd1) it.next()));
                }
            } else {
                je1 je1Var2 = (je1) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                bw0 bw0Var2 = new bw0();
                bw0Var2.b = null;
                bw0Var2.a = Collections.newSetFromMap(new ConcurrentHashMap());
                bw0Var2.a.addAll(set);
                map.put(je1Var2, bw0Var2);
            }
        }
        return arrayList;
    }

    public ep1 k() {
        if (((ep1) this.i) == null) {
            hc0 hc0Var = (hc0) this.e;
            String strF = ((jf2) this.d).f();
            hc0Var.a();
            this.i = new ep1(hc0Var.a, hc0Var, strF);
        }
        return (ep1) this.i;
    }
}
