package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class d00 {
    public final String a;
    public final kj0 b;

    public d00(Set set, kj0 kj0Var) {
        this.a = b(set);
        this.b = kj0Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            td tdVar = (td) it.next();
            sb.append(tdVar.a);
            sb.append('/');
            sb.append(tdVar.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        kj0 kj0Var = this.b;
        synchronized (((HashSet) kj0Var.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) kj0Var.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(' ');
        synchronized (((HashSet) kj0Var.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) kj0Var.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
