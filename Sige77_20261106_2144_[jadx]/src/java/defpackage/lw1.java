package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class lw1 implements uw0 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.uw0
    public final void b() {
        ArrayList arrayListR = d42.r(this.a);
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ((kw1) obj).b();
        }
    }

    @Override // defpackage.uw0
    public final void j() {
        ArrayList arrayListR = d42.r(this.a);
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ((kw1) obj).j();
        }
    }

    @Override // defpackage.uw0
    public final void k() {
        ArrayList arrayListR = d42.r(this.a);
        int size = arrayListR.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListR.get(i);
            i++;
            ((kw1) obj).k();
        }
    }
}
