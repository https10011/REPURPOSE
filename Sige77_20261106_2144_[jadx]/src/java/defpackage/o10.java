package defpackage;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.e;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class o10 implements g81 {
    public final /* synthetic */ q10 a;

    public o10(q10 q10Var) {
        this.a = q10Var;
    }

    @Override // defpackage.g81
    public final void a(Object obj) {
        if (((ww0) obj) != null) {
            q10 q10Var = this.a;
            if (q10Var.R0) {
                View viewK = q10Var.K();
                if (viewK.getParent() != null) {
                    uq1.q("DialogFragment can not be attached to a container view");
                    return;
                }
                if (q10Var.V0 != null) {
                    if (e.H(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + q10Var.V0);
                    }
                    q10Var.V0.setContentView(viewK);
                }
            }
        }
    }
}
