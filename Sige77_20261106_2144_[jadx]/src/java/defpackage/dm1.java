package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dm1 {
    public static final HashMap b = new HashMap();
    public static final dm1 c = new dm1("profile");
    public static final dm1 d;
    public final String a;

    static {
        new dm1("friends");
        new dm1("groups");
        new dm1("message.write");
        d = new dm1("openid");
        new dm1("email");
        new dm1("phone");
        new dm1("gender");
        new dm1("birthdate");
        new dm1("address");
        new dm1("real_name");
        new dm1("onetime.share");
        new dm1("openchat.term.agreement.status");
        new dm1("openchat.create.join");
        new dm1("openchat.info");
        new dm1("openchatplug.managament");
        new dm1("openchatplug.info");
        new dm1("openchatplug.profile");
        new dm1("openchatplug.send.message");
        new dm1("openchatplug.receive.message.and.event");
    }

    public dm1(String str) {
        this.a = str;
        b.put(str, this);
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dm1) it.next()).a);
        }
        return arrayList;
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            dm1 dm1Var = (dm1) b.get(str);
            if (dm1Var != null) {
                arrayList.add(dm1Var);
            } else {
                arrayList.add(new dm1(str));
            }
        }
        return arrayList;
    }

    public static List c(String str) {
        return TextUtils.isEmpty(str) ? Collections.EMPTY_LIST : b(Arrays.asList(str.split(" ")));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dm1.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((dm1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ts.l(new StringBuilder("Scope{code='"), this.a, "'}");
    }
}
