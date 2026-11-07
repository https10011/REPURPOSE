package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ay2 extends Fragment implements tw0 {
    public static final WeakHashMap L0 = new WeakHashMap();
    public final q8 K0 = new q8();

    public final void C() {
        ((Fragment) this).r0 = true;
        q8 q8Var = this.K0;
        q8Var.a = 3;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onResume();
        }
    }

    public final void D(Bundle bundle) {
        this.K0.l(bundle);
    }

    public final void E() {
        ((Fragment) this).r0 = true;
        q8 q8Var = this.K0;
        q8Var.a = 2;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onStart();
        }
    }

    public final void F() {
        ((Fragment) this).r0 = true;
        q8 q8Var = this.K0;
        q8Var.a = 4;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onStop();
        }
    }

    @Override // defpackage.tw0
    public final void a(String str, pw0 pw0Var) {
        this.K0.j(str, pw0Var);
    }

    @Override // defpackage.tw0
    public final pw0 b(Class cls, String str) {
        return (pw0) cls.cast(((Map) this.K0.b).get(str));
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.e(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.K0.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        Iterator it = ((Map) this.K0.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void v(Bundle bundle) {
        super.v(bundle);
        this.K0.k(bundle);
    }

    public final void x() {
        ((Fragment) this).r0 = true;
        q8 q8Var = this.K0;
        q8Var.a = 5;
        Iterator it = ((Map) q8Var.b).values().iterator();
        while (it.hasNext()) {
            ((pw0) it.next()).onDestroy();
        }
    }
}
