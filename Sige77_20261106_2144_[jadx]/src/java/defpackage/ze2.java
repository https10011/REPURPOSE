package defpackage;

import android.text.TextUtils;
import android.util.ArrayMap;
import javax.crypto.KeyGenerator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ze2 {
    public static String a = null;
    public static String b = null;
    public static String c = null;
    public static String d = null;
    public static String e = null;
    public static String f = null;
    public static String g = null;
    public static String h = null;
    public static String i = null;
    public static String j = null;
    public static String k = null;
    public static byte[] l = null;
    public static byte[] m = null;
    public static byte[] n = null;
    public static long o = 30000;
    public static String p = "";
    public static String q = "";
    public static boolean r;
    public static final JSONObject s = new JSONObject();
    public static final JSONObject t = new JSONObject();
    public static final JSONObject u = new JSONObject();
    public static final JSONObject v = new JSONObject();
    public static final JSONObject w = new JSONObject();
    public static final ArrayMap x = new ArrayMap();
    public static final boolean y = true;

    public static String a(boolean z) {
        Boolean bool;
        String str = z ? c : d;
        try {
            try {
                try {
                    Class<?> clsLoadClass = hc.h.getClassLoader().loadClass("android.os.SystemProperties");
                    bool = (Boolean) clsLoadClass.getMethod("getBoolean", String.class, Boolean.TYPE).invoke(clsLoadClass, "debug.athena.test_mode", Boolean.FALSE);
                } catch (IllegalArgumentException e2) {
                    throw e2;
                }
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                str = z ? a : b;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return ts.j("https://", str);
    }

    public static void b(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        JSONObject jSONObject = new JSONObject(str);
        jSONObject.getString("d");
        a = jSONObject.getString("tu");
        b = jSONObject.getString("tc");
        c = jSONObject.getString("ou");
        d = jSONObject.getString("oc");
        e = jSONObject.getString("c").replace("v6", "v7");
        f = jSONObject.getString("g") + "v2";
        String string = jSONObject.getString("u");
        g = string;
        h = string.replace("v2", "v3");
        i = jSONObject.getString("fc");
        j = jSONObject.getString("fd");
        k = jSONObject.getString("fe");
        m = jSONObject.getString("w").getBytes();
        n = jSONObject.getString("iv").getBytes();
        dc2 dc2VarA = dc2.a(hc.h);
        try {
            if (dc2VarA.j("athena_def") != 0) {
                l = m;
                return;
            }
            String strM = dc2VarA.m();
            if (TextUtils.isEmpty(strM)) {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(128);
                strM = rq0.o(keyGenerator.generateKey().getEncoded());
                dc2VarA.g(strM);
            }
            l = rq0.i(strM);
        } catch (Exception unused) {
            dc2VarA.e(1, "athena_def");
            l = m;
        }
    }

    public static String c() {
        return a(true) + h;
    }
}
