package defpackage;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class to0 implements Serializable {
    public final Object[] a;
    public final Object[] b;

    public to0(uo0 uo0Var) {
        int i = ((lh1) uo0Var).f;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        bs0 it = uo0Var.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i2] = entry.getKey();
            objArr2[i2] = entry.getValue();
            i2++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof wo0;
        Object[] objArr2 = this.b;
        if (!z) {
            q8 q8Var = new q8(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                q8Var.h(objArr[i], objArr2[i]);
            }
            return q8Var.c(true);
        }
        wo0 wo0Var = (wo0) objArr;
        q8 q8Var2 = new q8(wo0Var.size());
        bs0 it = wo0Var.iterator();
        bs0 it2 = ((wn0) objArr2).iterator();
        while (it.hasNext()) {
            q8Var2.h(it.next(), it2.next());
        }
        return q8Var2.c(true);
    }
}
