package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import org.json.JSONArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ve {
    public static boolean b;
    public static final ve a = new ve();
    public static HashSet c = new HashSet();

    public static final void a(Bundle bundle) {
        if (mt.a.contains(ve.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            mt.a(ve.class, th);
        }
    }
}
