package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ld2 {
    public static volatile ld2 c;
    public static final SecureRandom d = new SecureRandom();
    public final md2 a;
    public volatile boolean b;

    public ld2() {
        if (nd2.e == null) {
            synchronized (nd2.class) {
                try {
                    if (nd2.e == null) {
                        nd2.e = new nd2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        nd2 nd2Var = nd2.e;
        if (md2.c == null) {
            synchronized (md2.class) {
                try {
                    if (md2.c == null) {
                        md2 md2Var = new md2();
                        md2Var.b = new f91(8);
                        md2Var.a = nd2Var;
                        md2.c = md2Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.a = md2.c;
    }

    public static boolean d(float f) {
        boolean z = true;
        if (f != 1.0f) {
            int i = (int) (10000.0f * f);
            int iAbs = Math.abs(d.nextInt()) % 10000;
            z = iAbs < i;
            cc2.b("checkSamplingRate false, samplingRate : %f, samplingRateInTenThousand : %d, randomHash : %d", Float.valueOf(f), Integer.valueOf(i), Integer.valueOf(iAbs));
        }
        return z;
    }

    public static ld2 f() {
        if (c == null) {
            synchronized (ld2.class) {
                try {
                    if (c == null) {
                        c = new ld2();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final int a(int i, String str, float f) {
        rx1 rx1Var;
        if (!this.b) {
            cc2.a("isTidEnable init not completed");
            return 101;
        }
        String str2 = ze2.a;
        f91 f91Var = (f91) this.a.b;
        hf2 hf2Var = (hf2) f91Var.b;
        pd2 pd2VarA = f91Var.a(i);
        if (rq0.h(hf2Var.l) || pd2VarA == null || rq0.h(pd2VarA.f)) {
            if ("location#page_view#athena_anr_full#athena_crash_full".contains(str)) {
                return 102;
            }
            return d(f) ? 0 : 105;
        }
        Iterator it = pd2VarA.f.iterator();
        do {
            if (!it.hasNext()) {
                rx1Var = null;
                break;
            }
            rx1Var = (rx1) it.next();
        } while (!TextUtils.equals(rx1Var.b, str));
        if (rx1Var != null) {
            if (!rx1Var.a()) {
                cc2.a("isTidEnable device is not in sampling range");
                return 105;
            }
            qb2 qb2Var = rx1Var.c;
            if (qb2Var != null && qb2Var.b() >= 0) {
                return 0;
            }
            cc2.a("isTidEnable tid config is closed");
            return 104;
        }
        try {
            String str3 = sc2.a;
            String str4 = ze2.a;
            if (!TextUtils.equals("online", "test")) {
                return 103;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appid", i);
            jSONObject.put("event", str);
            cc2.d("invalid or not registered:%s", jSONObject.toString());
            return 103;
        } catch (Exception e) {
            cc2.d("checkTidEnable exception:%s", e.getMessage());
            return 103;
        }
    }

    public final int b(long j, float f) {
        rx1 rx1Var;
        if (!this.b) {
            cc2.a("isTidEnable init not completed");
            return 101;
        }
        String str = ze2.a;
        f91 f91Var = (f91) this.a.b;
        hf2 hf2Var = (hf2) f91Var.b;
        pd2 pd2VarA = f91Var.a(sc2.a(j));
        if (rq0.h(hf2Var.l) || pd2VarA == null || rq0.h(pd2VarA.f)) {
            return d(f) ? 0 : 105;
        }
        Iterator it = pd2VarA.f.iterator();
        do {
            if (!it.hasNext()) {
                rx1Var = null;
                break;
            }
            rx1Var = (rx1) it.next();
        } while (rx1Var.a != j);
        if (rx1Var == null) {
            cc2.a("isTidEnable tid config is null");
            return 103;
        }
        if (!rx1Var.a()) {
            cc2.a("isTidEnable tid " + rx1Var.a + " is not in sampling range");
            return 105;
        }
        qb2 qb2Var = rx1Var.c;
        if (qb2Var != null && qb2Var.b() >= 0) {
            return 0;
        }
        cc2.a("isTidEnable tid config is closed");
        return 104;
    }

    public final ic c(long j) {
        String strA;
        ic icVar = new ic();
        md2 md2Var = this.a;
        hf2 hf2Var = (hf2) ((f91) md2Var.b).b;
        hf2Var.getClass();
        String strValueOf = String.valueOf(j);
        JSONObject jSONObject = hf2Var.e;
        if (jSONObject == null || !jSONObject.has(strValueOf)) {
            strA = null;
        } else {
            try {
                strA = hf2Var.e.getString(strValueOf);
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
                strA = null;
            }
        }
        if (TextUtils.isEmpty(strA)) {
            strA = hf2Var.d;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = ze2.a(true);
        }
        StringBuilder sbM = ts.m(strA);
        sbM.append(ze2.g);
        icVar.a = sbM.toString();
        icVar.c = md2Var.d();
        icVar.b = ((hf2) ((f91) md2Var.b).b).b;
        return icVar;
    }

    public final rx1 e(long j) {
        f91 f91Var = (f91) this.a.b;
        f91Var.getClass();
        pd2 pd2VarA = f91Var.a(sc2.a(j));
        if (pd2VarA == null) {
            return null;
        }
        for (rx1 rx1Var : pd2VarA.f) {
            if (rx1Var.a == j) {
                return rx1Var;
            }
        }
        return null;
    }

    public final void g() {
        md2 md2Var = this.a;
        f91 f91Var = (f91) md2Var.b;
        for (pd2 pd2Var : (CopyOnWriteArrayList) f91Var.c) {
            pd2Var.d = 0L;
            pd2Var.c(-1L);
        }
        hf2 hf2Var = (hf2) f91Var.b;
        hf2Var.f = 0L;
        hf2Var.g = -1L;
        ((nd2) md2Var.a).c(((f91) md2Var.b).g());
    }
}
