package defpackage;

import androidx.lifecycle.b;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class c31 extends b {
    public kl1 l;

    public final void g() {
        Iterator it = this.l.iterator();
        while (true) {
            gl1 gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                return;
            }
            b31 b31Var = (b31) ((Map.Entry) gl1Var.next()).getValue();
            b31Var.a.f(b31Var);
        }
    }

    public final void h() {
        Iterator it = this.l.iterator();
        while (true) {
            gl1 gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                return;
            }
            b31 b31Var = (b31) ((Map.Entry) gl1Var.next()).getValue();
            b31Var.a.i(b31Var);
        }
    }
}
