package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class o02 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        au0Var.a();
        while (au0Var.p()) {
            try {
                arrayList.add(Integer.valueOf(au0Var.x()));
            } catch (NumberFormatException e) {
                throw new wt0(4, e);
            }
        }
        au0Var.j();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        eu0Var.b();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            eu0Var.x(atomicIntegerArray.get(i));
        }
        eu0Var.j();
    }
}
