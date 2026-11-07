package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fc0 implements re {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.re
    public final void a(boolean z) {
        synchronized (hc0.j) {
            try {
                ArrayList arrayList = new ArrayList(hc0.k.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hc0 hc0Var = (hc0) obj;
                    if (hc0Var.e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = hc0Var.i.iterator();
                        while (it.hasNext()) {
                            hc0 hc0Var2 = ((ec0) it.next()).a;
                            if (!z) {
                                ((az) hc0Var2.h.get()).a();
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
