package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class p02 extends l02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l02 b;

    public /* synthetic */ p02(l02 l02Var, int i) {
        this.a = i;
        this.b = l02Var;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        int i = this.a;
        l02 l02Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                au0Var.a();
                while (au0Var.p()) {
                    arrayList.add(Long.valueOf(((Number) l02Var.b(au0Var)).longValue()));
                }
                au0Var.j();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) l02Var.b(au0Var)).longValue());
        }
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        int i = this.a;
        l02 l02Var = this.b;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                eu0Var.b();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    l02Var.c(eu0Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                eu0Var.j();
                break;
            default:
                l02Var.c(eu0Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
        }
    }
}
