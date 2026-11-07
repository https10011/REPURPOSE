package defpackage;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wr0 {
    public final Object a;
    public final Method b;
    public final List c;

    public wr0(Object obj, Method method, ArrayList arrayList) {
        this.a = obj;
        this.b = method;
        this.c = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", wv1.class.getName(), this.b.getName(), this.c);
    }
}
