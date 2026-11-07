package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qb2 {
    public int a = 0;
    public int b = 100;
    public int c = 1;
    public long d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 100;
    public int h = 1;
    public long i = 0;
    public int j = 0;
    public int k = 0;
    public long l = 30000;
    public long m;
    public int n;

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.g = jSONObject.getInt("gmax");
            this.f = jSONObject.getInt("gmin");
            this.j = jSONObject.getInt("mi");
            this.e = jSONObject.getInt("nf");
            this.d = jSONObject.getLong("pd");
            this.l = jSONObject.getLong("se");
            this.b = jSONObject.getInt("urhash");
            this.m = jSONObject.getInt("frq");
            this.a = jSONObject.optInt("ct", 0);
            this.n = jSONObject.optInt("pr", 0);
            this.c = jSONObject.optInt("upct", 1);
            this.h = jSONObject.optInt("gpct", 1);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }

    public final long b() {
        Long lValueOf;
        long j = this.d;
        try {
            String str = ze2.a;
            if (!TextUtils.equals("online", "test")) {
                return j;
            }
            Context context = hc.h;
            long j2 = this.d;
            try {
                Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
                lValueOf = (Long) clsLoadClass.getMethod("getLong", String.class, Long.TYPE).invoke(clsLoadClass, "debug.athena.push_during", Long.valueOf(j2));
            } catch (IllegalArgumentException e) {
                throw e;
            } catch (Exception unused) {
                lValueOf = Long.valueOf(j2);
            }
            return lValueOf.longValue();
        } catch (Exception e2) {
            cc2.c("SystemPropertiesProxy.getLong " + e2.getMessage());
            return j;
        }
    }

    public final String c() {
        try {
            return new JSONObject().put("gmax", this.g).put("gmin", this.f).put("mi", this.j).put("nf", this.e).put("pd", b()).put("se", this.l).put("urhash", this.b).put("frq", this.m).put("ct", this.a).put("pr", this.n).put("upct", this.c).put("gpct", this.h).toString();
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }

    public final String toString() {
        return "TidConfig { pushTime=" + this.i + ", pushDuration=" + this.d + ", maxCachedItems=" + this.j + ", cachedItems=" + this.k + ", netWorkFlag=" + this.e + '}';
    }
}
