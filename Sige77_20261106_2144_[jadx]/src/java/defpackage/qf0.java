package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qf0 extends uf0 {
    public final /* synthetic */ Fragment a;

    public qf0(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.uf0
    public final void a() {
        Fragment fragment = this.a;
        fragment.F0.f();
        bj0.h(fragment);
        Bundle bundle = fragment.b;
        fragment.F0.g(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
