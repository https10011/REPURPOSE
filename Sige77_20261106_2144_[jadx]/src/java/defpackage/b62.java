package defpackage;

import androidx.databinding.a;
import androidx.lifecycle.b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b62 implements g81 {
    public final w72 a;
    public WeakReference b = null;

    public b62(a aVar, int i, ReferenceQueue referenceQueue) {
        this.a = new w72(aVar, i, this, referenceQueue);
    }

    @Override // defpackage.g81
    public final void a(Object obj) {
        w72 w72Var = this.a;
        a aVar = (a) w72Var.get();
        if (aVar == null) {
            w72Var.a();
        }
        if (aVar != null) {
            int i = w72Var.b;
            Object obj2 = w72Var.c;
            if (aVar.f0 || !aVar.S(obj2, i, 0)) {
                return;
            }
            aVar.U();
        }
    }

    public final void b(ww0 ww0Var) {
        WeakReference weakReference = this.b;
        ww0 ww0Var2 = weakReference == null ? null : (ww0) weakReference.get();
        b bVar = (b) this.a.c;
        if (bVar != null) {
            if (ww0Var2 != null) {
                bVar.i(this);
            }
            if (ww0Var != null) {
                bVar.e(ww0Var, this);
            }
        }
        if (ww0Var != null) {
            this.b = new WeakReference(ww0Var);
        }
    }
}
