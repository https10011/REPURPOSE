package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rf0 extends gb2 {
    public final /* synthetic */ Fragment X;

    public rf0(Fragment fragment) {
        this.X = fragment;
    }

    @Override // defpackage.gb2
    public final View x(int i) {
        Fragment fragment = this.X;
        View view = fragment.t0;
        if (view != null) {
            return view.findViewById(i);
        }
        uq1.q(y00.j("Fragment ", fragment, " does not have a view"));
        return null;
    }

    @Override // defpackage.gb2
    public final boolean y() {
        return this.X.t0 != null;
    }
}
