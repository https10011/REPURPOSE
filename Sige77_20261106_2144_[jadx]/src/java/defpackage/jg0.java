package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class jg0 extends l62 {
    public static final mo1 j = new mo1(6);
    public final boolean g;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public boolean h = false;
    public boolean i = false;

    public jg0(boolean z) {
        this.g = z;
    }

    @Override // defpackage.l62
    public final void b() {
        if (e.H(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    public final void d(Fragment fragment) {
        if (this.i) {
            if (e.H(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.e;
        HashMap map = this.d;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.e, fragment);
        if (e.H(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void e(Fragment fragment) {
        if (e.H(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        f(fragment.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jg0.class == obj.getClass()) {
            jg0 jg0Var = (jg0) obj;
            if (this.d.equals(jg0Var.d) && this.e.equals(jg0Var.e) && this.f.equals(jg0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str) {
        HashMap map = this.e;
        jg0 jg0Var = (jg0) map.get(str);
        if (jg0Var != null) {
            jg0Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f;
        p62 p62Var = (p62) map2.get(str);
        if (p62Var != null) {
            p62Var.a();
            map2.remove(str);
        }
    }

    public final void g(Fragment fragment) {
        if (this.i) {
            if (e.H(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(fragment.e) == null || !e.H(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
