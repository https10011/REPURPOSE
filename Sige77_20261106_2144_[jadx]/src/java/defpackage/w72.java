package defpackage;

import androidx.databinding.a;
import androidx.lifecycle.b;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class w72 extends WeakReference {
    public final b62 a;
    public final int b;
    public Object c;

    public w72(a aVar, int i, b62 b62Var, ReferenceQueue referenceQueue) {
        super(aVar, referenceQueue);
        this.b = i;
        this.a = b62Var;
    }

    public final boolean a() {
        boolean z;
        Object obj = this.c;
        if (obj != null) {
            b62 b62Var = this.a;
            b62Var.getClass();
            ((b) obj).i(b62Var);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
