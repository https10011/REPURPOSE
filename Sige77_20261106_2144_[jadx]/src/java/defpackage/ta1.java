package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ta1 extends rq0 {
    public final /* synthetic */ int W;
    public final /* synthetic */ rq0 X;

    public /* synthetic */ ta1(rq0 rq0Var, int i) {
        this.W = i;
        this.X = rq0Var;
    }

    @Override // defpackage.rq0
    public final void j(ai1 ai1Var, Object obj) {
        int i = this.W;
        rq0 rq0Var = this.X;
        switch (i) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        rq0Var.j(ai1Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i2 = 0; i2 < length; i2++) {
                        rq0Var.j(ai1Var, Array.get(obj, i2));
                    }
                    break;
                }
                break;
        }
    }
}
