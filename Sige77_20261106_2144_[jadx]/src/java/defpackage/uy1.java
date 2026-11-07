package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.firebase.auth.zzc;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class uy1 implements mn2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;

    public uy1(Set set, String str, String str2) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = map;
        this.d = str;
        this.e = str2;
        this.f = sq1.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (it.hasNext()) {
            throw y00.i(it);
        }
        this.b = Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        String str = (String) this.c;
        String str2 = (String) this.b;
        List list = (List) ((wo2) an2Var).a.b;
        if (list == null || list.isEmpty()) {
            ((mn2) this.a).zza("No users.");
            return;
        }
        zo2 zo2Var = (zo2) list.get(0);
        ri2 ri2Var = zo2Var.f;
        List list2 = ri2Var != null ? (List) ri2Var.a : null;
        if (list2 != null && !list2.isEmpty()) {
            if (TextUtils.isEmpty(str2)) {
                ((op2) list2.get(0)).e = str;
            } else {
                for (int i = 0; i < list2.size(); i++) {
                    if (((op2) list2.get(i)).d.equals(str2)) {
                        ((op2) list2.get(i)).e = str;
                        break;
                    }
                }
            }
        }
        zo2Var.j = ((Boolean) this.d).booleanValue();
        zo2Var.k = (zzc) this.e;
        ((rd2) this.f).j((zzahd) this.i, zo2Var);
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((mn2) this.a).zza(str);
    }
}
