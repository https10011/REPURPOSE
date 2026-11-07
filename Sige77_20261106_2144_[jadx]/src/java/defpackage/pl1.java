package defpackage;

import android.os.Bundle;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pl1 implements tl1 {
    public final ul1 a;
    public boolean b;
    public Bundle c;
    public final uv1 d;

    public pl1(ul1 ul1Var, q62 q62Var) {
        ul1Var.getClass();
        this.a = ul1Var;
        this.d = aw0.a(new vt(q62Var, 3));
    }

    @Override // defpackage.tl1
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((ql1) this.d.getValue()).d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((ol1) entry.getValue()).e.a();
            if (!Intrinsics.areEqual(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundle;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.c = bundle;
        this.b = true;
    }
}
