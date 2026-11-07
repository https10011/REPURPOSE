package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hg0 implements gg0 {
    public final int a;
    public final /* synthetic */ e b;

    public hg0(e eVar, int i) {
        this.b = eVar;
        this.a = i;
    }

    @Override // defpackage.gg0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        e eVar = this.b;
        Fragment fragment = eVar.x;
        int i = this.a;
        if (fragment == null || i >= 0 || !fragment.h().P(-1, 0)) {
            return eVar.Q(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
