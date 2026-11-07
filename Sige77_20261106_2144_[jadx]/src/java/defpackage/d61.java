package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d61 {
    public final LinkedHashMap a;
    public final pv2 b;

    public d61(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        pv2 pv2Var = new pv2();
        pv2Var.a = new AtomicBoolean(z);
        this.b = pv2Var;
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iA = v11.a(ko.h(setEntrySet));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.a, pair.b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.a).get()) {
            uq1.q("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(fc1 fc1Var, Object obj) {
        fc1Var.getClass();
        d(fc1Var, obj);
    }

    public final void d(fc1 fc1Var, Object obj) {
        fc1Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            b();
            linkedHashMap.remove(fc1Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.F((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(fc1Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(fc1Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(fc1Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (obj instanceof d61) {
            LinkedHashMap linkedHashMap = ((d61) obj).a;
            LinkedHashMap linkedHashMap2 = this.a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zAreEqual = Intrinsics.areEqual(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zAreEqual = true;
                                } else {
                                    zAreEqual = false;
                                }
                            } else {
                                zAreEqual = false;
                            }
                            if (!zAreEqual) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.s(this.a.entrySet(), ",\n", "{\n", "\n}", sm.d, 24);
    }

    public /* synthetic */ d61(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
