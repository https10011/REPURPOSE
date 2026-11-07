package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class n7 implements tl1 {
    public final /* synthetic */ int a;
    public final Object b;

    public n7(ul1 ul1Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        ul1Var.c("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.tl1
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((p7) obj).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) obj));
                return bundle2;
        }
    }

    public n7(p7 p7Var) {
        this.a = 0;
        this.b = p7Var;
    }
}
