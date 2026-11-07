package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class qc0 implements rc0 {
    public static final Object m = new Object();
    public final hc0 a;
    public final oc0 b;
    public final rc2 c;
    public final i42 d;
    public final wv0 e;
    public final ef1 f;
    public final Object g;
    public final ExecutorService h;
    public final vo1 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public qc0(hc0 hc0Var, zd1 zd1Var, ExecutorService executorService, vo1 vo1Var) {
        hc0Var.a();
        oc0 oc0Var = new oc0(hc0Var.a, zd1Var);
        rc2 rc2Var = new rc2(hc0Var, 6);
        if (u41.e == null) {
            u41.e = new u41(9);
        }
        u41 u41Var = u41.e;
        if (i42.c == null) {
            i42.c = new i42(u41Var);
        }
        i42 i42Var = i42.c;
        wv0 wv0Var = new wv0(new mq(hc0Var, 2));
        ef1 ef1Var = new ef1();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = hc0Var;
        this.b = oc0Var;
        this.c = rc2Var;
        this.d = i42Var;
        this.e = wv0Var;
        this.f = ef1Var;
        this.h = executorService;
        this.i = vo1Var;
    }

    public final void a() {
        ae aeVarB;
        int i;
        synchronized (m) {
            try {
                hc0 hc0Var = this.a;
                hc0Var.a();
                rd2 rd2VarD = rd2.d(hc0Var.a);
                try {
                    aeVarB = this.c.B();
                    int i2 = aeVarB.b;
                    i = 1;
                    if (i2 == 2 || i2 == 1) {
                        String strF = f(aeVarB);
                        rc2 rc2Var = this.c;
                        zd zdVarA = aeVarB.a();
                        zdVarA.a = strF;
                        zdVarA.b = 3;
                        aeVarB = zdVarA.a();
                        rc2Var.A(aeVarB);
                    }
                    if (rd2VarD != null) {
                        rd2VarD.f();
                    }
                } catch (Throwable th) {
                    if (rd2VarD != null) {
                        rd2VarD.f();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i(aeVarB);
        this.i.execute(new pc0(this, i));
    }

    public final ae b(ae aeVar) throws sc0 {
        fe feVarF;
        fe feVar;
        oc0 oc0Var = this.b;
        hc0 hc0Var = this.a;
        hc0Var.a();
        String str = hc0Var.c.a;
        String str2 = aeVar.a;
        hc0 hc0Var2 = this.a;
        hc0Var2.a();
        String str3 = hc0Var2.c.g;
        String str4 = aeVar.d;
        bl blVar = oc0Var.c;
        if (!blVar.a()) {
            throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
        }
        URL urlA = oc0.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
            }
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = oc0Var.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    oc0.h(httpURLConnectionC);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    blVar.b(responseCode);
                    if (!(responseCode >= 200 && responseCode < 300)) {
                        oc0.b(httpURLConnectionC, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            if (((byte) (0 | 1)) != 1) {
                                throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                            }
                            feVar = new fe(null, 0L, 3);
                        } else {
                            if (responseCode == 429) {
                                throw new sc0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 0);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                if (((byte) (0 | 1)) != 1) {
                                    throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
                                }
                                feVar = new fe(null, 0L, 2);
                            }
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i++;
                        }
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        feVarF = feVar;
                        break;
                    }
                    feVarF = oc0.f(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    break;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        int iV = ts.v(feVarF.c);
        if (iV == 0) {
            String str5 = feVarF.a;
            long j = feVarF.b;
            this.d.a.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            zd zdVarA = aeVar.a();
            zdVarA.c = str5;
            zdVarA.e = j;
            byte b = (byte) (zdVarA.h | 1);
            zdVarA.f = jCurrentTimeMillis;
            zdVarA.h = (byte) (b | 2);
            return zdVarA.a();
        }
        if (iV == 1) {
            zd zdVarA2 = aeVar.a();
            zdVarA2.g = "BAD CONFIG";
            zdVarA2.b = 5;
            return zdVarA2.a();
        }
        if (iV != 2) {
            throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
        }
        synchronized (this) {
            this.j = null;
        }
        zd zdVarA3 = aeVar.a();
        zdVarA3.b = 2;
        return zdVarA3.a();
    }

    public final Task c() {
        String str;
        e();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        hi0 hi0Var = new hi0(taskCompletionSource);
        synchronized (this.g) {
            this.l.add(hi0Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new pc0(this, 0));
        return task;
    }

    public final Task d() {
        e();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        yh0 yh0Var = new yh0(this.d, taskCompletionSource);
        synchronized (this.g) {
            this.l.add(yh0Var);
        }
        Task task = taskCompletionSource.getTask();
        this.h.execute(new pc0(this, 2));
        return task;
    }

    public final void e() {
        hc0 hc0Var = this.a;
        hc0Var.a();
        gu2.m(hc0Var.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hc0Var.a();
        gu2.m(hc0Var.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hc0Var.a();
        gu2.m(hc0Var.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        hc0Var.a();
        String str = hc0Var.c.b;
        Pattern pattern = i42.b;
        gu2.h("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        hc0Var.a();
        gu2.h("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i42.b.matcher(hc0Var.c.a).matches());
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[Catch: all -> 0x003f, DONT_GENERATE, TRY_ENTER, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0041 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:10:0x002e, B:11:0x0030, B:15:0x003d, B:19:0x0041, B:20:0x0045, B:28:0x0059, B:12:0x0031, B:13:0x003a), top: B:35:0x002e, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    public final String f(ae aeVar) {
        on0 on0Var;
        String string;
        hc0 hc0Var = this.a;
        hc0Var.a();
        if (!hc0Var.b.equals("CHIME_ANDROID_SDK")) {
            hc0 hc0Var2 = this.a;
            hc0Var2.a();
            if ("[DEFAULT]".equals(hc0Var2.b)) {
                if (aeVar.b == 1) {
                    on0Var = (on0) this.e.get();
                    synchronized (on0Var.a) {
                        try {
                            synchronized (on0Var.a) {
                                string = on0Var.a.getString("|S|id", null);
                            }
                            if (string != null) {
                                string = on0Var.a();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return ef1.a();
                }
            }
        } else if (aeVar.b == 1) {
            on0Var = (on0) this.e.get();
            synchronized (on0Var.a) {
                synchronized (on0Var.a) {
                    string = on0Var.a.getString("|S|id", null);
                    if (string != null) {
                        string = on0Var.a();
                    }
                    if (TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f.getClass();
                    return ef1.a();
                }
            }
        }
        this.f.getClass();
        return ef1.a();
    }

    public final ae g(ae aeVar) throws sc0 {
        rd rdVarE;
        String str = aeVar.a;
        String string = null;
        if (str != null && str.length() == 11) {
            on0 on0Var = (on0) this.e.get();
            synchronized (on0Var.a) {
                try {
                    String[] strArr = on0.c;
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            break;
                        }
                        String str2 = strArr[i];
                        String string2 = on0Var.a.getString("|T|" + on0Var.b + "|" + str2, null);
                        if (string2 != null && !string2.isEmpty()) {
                            if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                            break;
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        oc0 oc0Var = this.b;
        hc0 hc0Var = this.a;
        hc0Var.a();
        String str3 = hc0Var.c.a;
        String str4 = aeVar.a;
        hc0 hc0Var2 = this.a;
        hc0Var2.a();
        String str5 = hc0Var2.c.g;
        hc0 hc0Var3 = this.a;
        hc0Var3.a();
        String str6 = hc0Var3.c.b;
        bl blVar = oc0Var.c;
        if (!blVar.a()) {
            throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
        }
        URL urlA = oc0.a("projects/" + str5 + "/installations");
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = oc0Var.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    oc0.g(httpURLConnectionC, str4, str6);
                    int responseCode = httpURLConnectionC.getResponseCode();
                    blVar.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        rdVarE = oc0.e(httpURLConnectionC);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    oc0.b(httpURLConnectionC, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new sc0("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", 0);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        try {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            rd rdVar = new rd(null, null, null, null, 2);
                            httpURLConnectionC.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            rdVarE = rdVar;
                            break;
                        } catch (IOException | AssertionError unused2) {
                        }
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th2) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            } catch (IOException | AssertionError unused3) {
            }
        }
        int iV = ts.v(rdVarE.e);
        if (iV != 0) {
            if (iV != 1) {
                throw new sc0("Firebase Installations Service is unavailable. Please try again later.", 0);
            }
            zd zdVarA = aeVar.a();
            zdVarA.g = "BAD CONFIG";
            zdVarA.b = 5;
            return zdVarA.a();
        }
        String str7 = rdVarE.b;
        String str8 = rdVarE.c;
        this.d.a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        fe feVar = rdVarE.d;
        String str9 = feVar.a;
        long j = feVar.b;
        zd zdVarA2 = aeVar.a();
        zdVarA2.a = str7;
        zdVarA2.b = 4;
        zdVarA2.c = str9;
        zdVarA2.d = str8;
        zdVarA2.e = j;
        byte b = (byte) (zdVarA2.h | 1);
        zdVarA2.f = jCurrentTimeMillis;
        zdVarA2.h = (byte) (b | 2);
        return zdVarA2.a();
    }

    public final void h(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((tt1) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ae aeVar) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((tt1) it.next()).b(aeVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
