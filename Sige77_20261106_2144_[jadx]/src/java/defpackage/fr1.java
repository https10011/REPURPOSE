package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fr1 implements zq {
    public final /* synthetic */ ir1 a;

    public fr1(ir1 ir1Var) {
        this.a = ir1Var;
    }

    @Override // defpackage.zq
    public final void a(boolean z) {
        ArrayList arrayList;
        d42.b();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.d);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zq) obj).a(z);
        }
    }
}
