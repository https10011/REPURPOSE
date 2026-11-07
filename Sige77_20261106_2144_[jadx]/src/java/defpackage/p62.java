package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p62 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        for (l62 l62Var : this.a.values()) {
            l62Var.c = true;
            HashMap map = l62Var.a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = l62Var.a.values().iterator();
                        while (it.hasNext()) {
                            l62.a(it.next());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = l62Var.b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l62Var.b.iterator();
                        while (it2.hasNext()) {
                            l62.a((Closeable) it2.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            l62Var.b();
        }
        this.a.clear();
    }
}
