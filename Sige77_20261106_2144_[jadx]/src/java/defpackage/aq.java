package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class aq {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final nq f;
    public final Set g;

    public aq(String str, Set set, Set set2, int i, int i2, nq nqVar, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = nqVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static zp a(je1 je1Var) {
        return new zp(je1Var, new je1[0]);
    }

    public static zp b(Class cls) {
        return new zp(cls, new Class[0]);
    }

    public static aq c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(je1.a(cls));
        for (Class cls2 : clsArr) {
            g93.k(cls2, "Null interface");
            hashSet.add(je1.a(cls2));
        }
        return new aq(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new yp(obj, 1), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
