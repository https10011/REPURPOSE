package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nh3 {
    public final HashMap a;
    public final HashMap b;
    public final ArrayList c;

    public nh3(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xi3 xi3Var = (xi3) it.next();
            if (TextUtils.isEmpty(xi3Var.zzc())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                xi3 xi3Var2 = (xi3) this.a.put(xi3Var.zzc(), xi3Var);
                if (xi3Var2 != null) {
                    String canonicalName = xi3Var2.getClass().getCanonicalName();
                    String canonicalName2 = xi3Var.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw y00.i(it2);
        }
        this.c.addAll(list);
    }

    public final Object a(Uri uri, lh3 lh3Var) {
        return lh3Var.c(b(uri));
    }

    public final ep1 b(Uri uri) {
        List listI;
        no0 no0Var = ro0.b;
        gu2.k(4, "initialCapacity");
        Object[] objArr = new Object[4];
        gu2.k(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listI = gh1.e;
        } else {
            listI = ro0.i(new qs1(new ei(new ri2(new xl("+".charAt(0))), true), encodedFragment.substring(10)));
        }
        int size = listI.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            String str = (String) listI.get(i);
            Matcher matcher = mi3.a.matcher(str);
            if (!matcher.matches()) {
                e.g("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, vn0.c(objArrCopyOf.length, i3));
            }
            objArrCopyOf[i2] = strGroup;
            i++;
            i2++;
        }
        gh1 gh1VarH = ro0.h(i2, objArrCopyOf);
        if (gh1VarH.d > 0) {
            String str2 = (String) gh1VarH.get(0);
            if (this.b.get(str2) != null) {
                ur.a();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(str2.length() + 40 + strValueOf.length());
            sb.append("Requested transform isn't registered: ");
            sb.append(str2);
            sb.append(": ");
            sb.append(strValueOf);
            throw new tn(sb.toString());
        }
        ro0 ro0VarM = ro0.h(0, objArr).m();
        ud2 ud2Var = new ud2();
        String scheme = uri.getScheme();
        xi3 xi3Var = (xi3) this.a.get(scheme);
        if (xi3Var == null) {
            throw new tn(ts.j("Requested backend isn't registered: ", scheme));
        }
        ud2Var.a = xi3Var;
        ud2Var.c = this.c;
        ud2Var.b = ro0VarM;
        if (!ro0VarM.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = ro0VarM.listIterator(ro0VarM.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        ur.a();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        ud2Var.d = uri;
        return new ep1(ud2Var);
    }
}
