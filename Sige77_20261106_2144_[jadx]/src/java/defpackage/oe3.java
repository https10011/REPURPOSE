package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class oe3 {
    public static final oe3 b = new oe3();
    public final HashMap a = new HashMap();

    public final synchronized void a(String str, dx2 dx2Var) {
        try {
            boolean zContainsKey = this.a.containsKey(str);
            HashMap map = this.a;
            if (!zContainsKey) {
                map.put(str, dx2Var);
                return;
            }
            if (((dx2) map.get(str)).equals(dx2Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.a.get(str)) + "), cannot insert " + String.valueOf(dx2Var));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (dx2) entry.getValue());
        }
    }
}
