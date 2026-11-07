package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ul1 {
    public boolean b;
    public Bundle c;
    public boolean d;
    public n7 e;
    public final kl1 a = new kl1();
    public boolean f = true;

    public final Bundle a(String str) {
        if (!this.d) {
            uq1.q("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
            return null;
        }
        Bundle bundle = this.c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && !bundle4.isEmpty()) {
            return bundle2;
        }
        this.c = null;
        return bundle2;
    }

    public final tl1 b() {
        String str;
        tl1 tl1Var;
        Iterator it = this.a.iterator();
        do {
            gl1 gl1Var = (gl1) it;
            if (!gl1Var.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) gl1Var.next();
            entry.getClass();
            str = (String) entry.getKey();
            tl1Var = (tl1) entry.getValue();
        } while (!Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return tl1Var;
    }

    public final void c(String str, tl1 tl1Var) {
        Object obj;
        tl1Var.getClass();
        kl1 kl1Var = this.a;
        hl1 hl1VarA = kl1Var.a(str);
        if (hl1VarA != null) {
            obj = hl1VarA.b;
        } else {
            hl1 hl1Var = new hl1(str, tl1Var);
            kl1Var.d++;
            hl1 hl1Var2 = kl1Var.b;
            if (hl1Var2 == null) {
                kl1Var.a = hl1Var;
                kl1Var.b = hl1Var;
            } else {
                hl1Var2.c = hl1Var;
                hl1Var.d = hl1Var2;
                kl1Var.b = hl1Var;
            }
            obj = null;
        }
        if (((tl1) obj) == null) {
            return;
        }
        e.g("SavedStateProvider with the given key is already registered");
    }

    public final void d() {
        if (!this.f) {
            uq1.q("Can not perform this action after onSaveInstanceState");
            return;
        }
        n7 n7Var = this.e;
        if (n7Var == null) {
            n7Var = new n7(this);
        }
        this.e = n7Var;
        try {
            ew0.class.getDeclaredConstructor(null);
            n7 n7Var2 = this.e;
            if (n7Var2 != null) {
                ((LinkedHashSet) n7Var2.b).add(ew0.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + ew0.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
