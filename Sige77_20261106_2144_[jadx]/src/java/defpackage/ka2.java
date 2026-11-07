package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ka2 implements Handler.Callback {
    public static ka2 f;
    public Handler a;
    public HandlerThread b = null;
    public int c = 0;
    public final ReentrantLock d = new ReentrantLock();
    public q20 e;

    public ka2() {
        c();
        this.a.sendEmptyMessage(100);
    }

    public static String b() {
        SharedPreferences sharedPreferences;
        String string = BuildConfig.FLAVOR;
        try {
            sharedPreferences = kv.j.getSharedPreferences("gslb", 0);
            try {
                string = sharedPreferences.getString("deviceID", BuildConfig.FLAVOR);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            sharedPreferences = null;
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        if (sharedPreferences != null) {
            try {
                sharedPreferences.edit().putString("deviceID", string2).apply();
            } catch (Exception unused3) {
            }
        }
        return string2;
    }

    public final void a() {
        if (this.a.hasMessages(102)) {
            return;
        }
        this.a.sendEmptyMessageDelayed(102, 1000L);
    }

    public final void c() {
        ReentrantLock reentrantLock = this.d;
        try {
            if (reentrantLock.tryLock()) {
                if (this.b == null) {
                    HandlerThread handlerThread = new HandlerThread("GSLB Worker");
                    this.b = handlerThread;
                    handlerThread.setPriority(10);
                    this.b.start();
                    this.a = new Handler(this.b.getLooper(), this);
                } else if (this.a.hasMessages(110)) {
                    this.a.removeMessages(110);
                }
            }
        } catch (Exception e) {
            j42.a.b(Log.getStackTraceString(e));
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0275 A[Catch: JSONException -> 0x0287, TryCatch #8 {JSONException -> 0x0287, blocks: (B:102:0x0262, B:104:0x0275, B:108:0x028a, B:126:0x02de, B:127:0x02e6, B:129:0x02ec, B:132:0x0306, B:133:0x0314, B:135:0x031a, B:136:0x031c, B:125:0x02d5), top: B:163:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x028a A[Catch: JSONException -> 0x0287, TRY_LEAVE, TryCatch #8 {JSONException -> 0x0287, blocks: (B:102:0x0262, B:104:0x0275, B:108:0x028a, B:126:0x02de, B:127:0x02e6, B:129:0x02ec, B:132:0x0306, B:133:0x0314, B:135:0x031a, B:136:0x031c, B:125:0x02d5), top: B:163:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b6 A[Catch: Exception -> 0x02c6, LOOP:2: B:114:0x02b0->B:116:0x02b6, LOOP_END, TryCatch #9 {Exception -> 0x02c6, blocks: (B:113:0x02ac, B:114:0x02b0, B:116:0x02b6, B:119:0x02c8), top: B:164:0x02ac }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02ec A[Catch: JSONException -> 0x0287, TryCatch #8 {JSONException -> 0x0287, blocks: (B:102:0x0262, B:104:0x0275, B:108:0x028a, B:126:0x02de, B:127:0x02e6, B:129:0x02ec, B:132:0x0306, B:133:0x0314, B:135:0x031a, B:136:0x031c, B:125:0x02d5), top: B:163:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0304 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:135:0x031a A[Catch: JSONException -> 0x0287, TryCatch #8 {JSONException -> 0x0287, blocks: (B:102:0x0262, B:104:0x0275, B:108:0x028a, B:126:0x02de, B:127:0x02e6, B:129:0x02ec, B:132:0x0306, B:133:0x0314, B:135:0x031a, B:136:0x031c, B:125:0x02d5), top: B:163:0x0262 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x032f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0306 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:104:0x0275, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x032f, please report this as an issue */
    public final boolean d(ArrayList arrayList) {
        String strB;
        String simOperator;
        String strSubstring;
        HttpURLConnection httpURLConnection;
        int i;
        b81 b81Var;
        q20 q20Var;
        JSONObject jSONObject;
        int i2;
        String string;
        HashMap map;
        long j;
        boolean z;
        JSONObject jSONObject2;
        Iterator<String> itKeys;
        v61 v61Var;
        HttpURLConnection httpURLConnection2 = null;
        try {
            strB = rq0.u(kv.w()).b;
        } catch (Exception e) {
            j42.a.b(Log.getStackTraceString(e));
            strB = null;
        }
        if (strB == null || TextUtils.isEmpty(strB)) {
            j42.a.b("Unable to get the device's gaid");
            strB = b();
        }
        if (strB.contains("00000000-0000-0000-0000-000000000000")) {
            j42.a.b("gaid tracking is limited");
            strB = b();
        }
        String str = strB;
        j42.a.b("device id is" + str);
        String strA = ia.a(str);
        if (!TextUtils.isEmpty(null)) {
            strA = null;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("appId", kv.j.getPackageName());
            jSONObject3.put("key", strA);
            String str2 = this.e.e;
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            String string2 = BuildConfig.FLAVOR;
            if (zIsEmpty || str.equals(str2)) {
                jSONObject3.put("oldKey", BuildConfig.FLAVOR);
            } else {
                jSONObject3.put("oldKey", ia.a(str2));
            }
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                jSONArray.put((String) obj);
            }
            jSONObject3.put("domains", jSONArray);
            if (TextUtils.isEmpty(null)) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) kv.w().getSystemService("phone");
                    simOperator = telephonyManager == null ? BuildConfig.FLAVOR : telephonyManager.getSimOperator();
                } catch (Exception unused) {
                }
                strSubstring = (TextUtils.isEmpty(simOperator) || simOperator.length() < 3) ? BuildConfig.FLAVOR : simOperator.substring(0, 3);
            } else {
                strSubstring = null;
            }
            if (strSubstring == null) {
                strSubstring = BuildConfig.FLAVOR;
            }
            jSONObject3.put("mcc", strSubstring);
            String country = Locale.getDefault().getCountry();
            if (country == null) {
                country = BuildConfig.FLAVOR;
            }
            jSONObject3.put("locale", country);
            String language = Locale.getDefault().getLanguage();
            if (language == null) {
                language = BuildConfig.FLAVOR;
            }
            jSONObject3.put("language", language);
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = BuildConfig.FLAVOR;
            }
            jSONObject3.put("model", str3);
            String string3 = jSONObject3.toString();
            String strA2 = ia.a(kv.j.getPackageName() + strA);
            b81 b81Var2 = j42.a;
            b81Var2.a("begin net connect: " + string3);
            v61 v61Var2 = new v61(-1, null);
            String str4 = string3 != null ? string3 : BuildConfig.FLAVOR;
            try {
                httpURLConnection = (HttpURLConnection) new URL("https://gslb.shalltry.com/gslb/domain/convert").openConnection();
                try {
                    httpURLConnection.setRequestProperty("accept", "*/*");
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str4.length()));
                    httpURLConnection.setRequestProperty("X-Gslb-Sign", strA2);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setReadTimeout(20000);
                    httpURLConnection.setConnectTimeout(30000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    PrintWriter printWriter = new PrintWriter(httpURLConnection.getOutputStream());
                    printWriter.write(str4);
                    printWriter.flush();
                    printWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    b81Var2.c("url:https://gslb.shalltry.com/gslb/domain/convert code:" + responseCode + " Post Data:" + string3 + " " + httpURLConnection.getResponseMessage());
                    if (responseCode == 200) {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        }
                        String string4 = sb.toString();
                        try {
                            if (TextUtils.equals("{}", string4)) {
                                v61Var = new v61(1, null);
                            } else {
                                if (TextUtils.isEmpty(string4)) {
                                    v61Var = new v61(-1, null);
                                } else {
                                    v61Var2 = new v61(0, string4);
                                }
                                bufferedReader.close();
                                inputStream.close();
                            }
                            bufferedReader.close();
                            inputStream.close();
                        } catch (Throwable th) {
                            th = th;
                            try {
                                b81Var2.b(Log.getStackTraceString(th));
                                if (httpURLConnection != null) {
                                }
                                i = v61Var2.a;
                                if (i != 0) {
                                    j42.a.a("get data error " + i);
                                    return false;
                                }
                                b81Var = j42.a;
                                StringBuilder sb2 = new StringBuilder("get data success, data is ");
                                String str5 = (String) v61Var2.b;
                                sb2.append(str5);
                                b81Var.a(sb2.toString());
                                q20Var = this.e;
                                q20Var.e = str;
                                try {
                                    jSONObject = new JSONObject(str5);
                                    i2 = jSONObject.getInt("code");
                                    string = jSONObject.getString("message");
                                    if (i2 != 200) {
                                        b81Var.b("error message is " + string);
                                        return false;
                                    }
                                    map = new HashMap(4);
                                    try {
                                        JSONObject jSONObject4 = jSONObject.getJSONObject("data");
                                        jSONObject2 = jSONObject4.getJSONObject("domainPairs");
                                        z = jSONObject4.getBoolean("overrideFlag");
                                        try {
                                            j = jSONObject4.getInt("expireTime");
                                            try {
                                                itKeys = jSONObject2.keys();
                                                while (itKeys.hasNext()) {
                                                    String strValueOf = String.valueOf(itKeys.next());
                                                    map.put(strValueOf, jSONObject2.getString(strValueOf));
                                                }
                                                string2 = jSONObject4.getString("country");
                                            } catch (Exception e2) {
                                                e = e2;
                                                j42.a.b(Log.getStackTraceString(e));
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            j = 86400000;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        j = 86400000;
                                        z = false;
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (q20.d((String) q20Var.a.get(entry.getKey()))) {
                                        }
                                        q20Var.a.put(entry.getKey(), entry.getValue());
                                    }
                                    q20Var.d = j;
                                    if (j < 86400000) {
                                        q20Var.d = 86400000L;
                                    }
                                    q20Var.c = System.currentTimeMillis();
                                    q20Var.f = string2;
                                    q20Var.g();
                                    return true;
                                } catch (JSONException e5) {
                                    e5.printStackTrace();
                                }
                            } catch (Throwable th2) {
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th2;
                            }
                        }
                        v61Var2 = v61Var;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    httpURLConnection2 = httpURLConnection;
                    httpURLConnection = httpURLConnection2;
                    b81Var2.b(Log.getStackTraceString(th));
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    i = v61Var2.a;
                    if (i != 0) {
                        j42.a.a("get data error " + i);
                        return false;
                    }
                    b81Var = j42.a;
                    StringBuilder sb3 = new StringBuilder("get data success, data is ");
                    String str6 = (String) v61Var2.b;
                    sb3.append(str6);
                    b81Var.a(sb3.toString());
                    q20Var = this.e;
                    q20Var.e = str;
                    jSONObject = new JSONObject(str6);
                    i2 = jSONObject.getInt("code");
                    string = jSONObject.getString("message");
                    if (i2 != 200) {
                        b81Var.b("error message is " + string);
                        return false;
                    }
                    map = new HashMap(4);
                    JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                    jSONObject2 = jSONObject5.getJSONObject("domainPairs");
                    z = jSONObject5.getBoolean("overrideFlag");
                    j = jSONObject5.getInt("expireTime");
                    itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String strValueOf2 = String.valueOf(itKeys.next());
                        map.put(strValueOf2, jSONObject2.getString(strValueOf2));
                    }
                    string2 = jSONObject5.getString("country");
                    while (r0.hasNext()) {
                        if (q20.d((String) q20Var.a.get(entry.getKey()))) {
                        }
                        q20Var.a.put(entry.getKey(), entry.getValue());
                    }
                    q20Var.d = j;
                    if (j < 86400000) {
                        q20Var.d = 86400000L;
                    }
                    q20Var.c = System.currentTimeMillis();
                    q20Var.f = string2;
                    q20Var.g();
                    return true;
                }
            } catch (Throwable th4) {
                th = th4;
            }
            httpURLConnection.disconnect();
            i = v61Var2.a;
            if (i != 0) {
                j42.a.a("get data error " + i);
                return false;
            }
            b81Var = j42.a;
            StringBuilder sb4 = new StringBuilder("get data success, data is ");
            String str7 = (String) v61Var2.b;
            sb4.append(str7);
            b81Var.a(sb4.toString());
            q20Var = this.e;
            q20Var.e = str;
            jSONObject = new JSONObject(str7);
            i2 = jSONObject.getInt("code");
            string = jSONObject.getString("message");
            if (i2 != 200) {
                b81Var.b("error message is " + string);
                return false;
            }
            map = new HashMap(4);
            JSONObject jSONObject6 = jSONObject.getJSONObject("data");
            jSONObject2 = jSONObject6.getJSONObject("domainPairs");
            z = jSONObject6.getBoolean("overrideFlag");
            j = jSONObject6.getInt("expireTime");
            itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String strValueOf3 = String.valueOf(itKeys.next());
                map.put(strValueOf3, jSONObject2.getString(strValueOf3));
            }
            string2 = jSONObject6.getString("country");
            while (r0.hasNext()) {
                if (q20.d((String) q20Var.a.get(entry.getKey())) || z) {
                    q20Var.a.put(entry.getKey(), entry.getValue());
                }
            }
            q20Var.d = j;
            if (j < 86400000) {
                q20Var.d = 86400000L;
            }
            q20Var.c = System.currentTimeMillis();
            q20Var.f = string2;
            q20Var.g();
            return true;
        } catch (JSONException unused2) {
            return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        int i2 = 0;
        if (i != 110) {
            int i3 = 1;
            switch (i) {
                case 100:
                    Context context = kv.j;
                    if (!kv.h || kv.g == null) {
                        kv.h = true;
                        kv.g = context.getApplicationContext();
                        String str = ye1.g;
                        if (str == null || str.length() == 0) {
                            new Thread(new e10(i2)).start();
                        }
                        kv.w();
                        int i4 = kq1.a;
                    }
                    j42.a.c("-->WHAT_INIT.");
                    try {
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                        kv.j.registerReceiver(new lg3(i3), intentFilter);
                        break;
                    } catch (Exception e) {
                        Log.d("GSLB_SDK", "regiseter gslb sdk error " + e.toString());
                        j42.a.b(Log.getStackTraceString(e));
                    }
                    j42.a.c("GSLB SDK version is 1.0.2.6");
                    this.e = q20.c();
                    return false;
                case 101:
                    j42.a.c("-->WHAT_ADD_DOMAIN.");
                    xy0 xy0Var = (xy0) message.obj;
                    String[] strArr = xy0Var.a;
                    if (strArr != null) {
                        this.c = 0;
                    }
                    q20 q20Var = this.e;
                    ArrayList arrayList = q20Var.b;
                    sh1 sh1Var = xy0Var.d;
                    String str2 = xy0Var.c;
                    sk0 sk0Var = xy0Var.b;
                    if (strArr != null) {
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = true;
                        for (int i5 = 0; i5 < strArr.length; i5++) {
                            String strA = j42.a(strArr[i5]);
                            strArr[i5] = strA;
                            if (!TextUtils.isEmpty(strA)) {
                                String str3 = (String) q20Var.a.get(strArr[i5]);
                                if (str3 == null) {
                                    q20Var.a.put(strArr[i5], "blank");
                                    z3 = false;
                                    z = true;
                                } else if (q20.d(str3)) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                    z2 = true;
                                }
                            }
                        }
                        if (z3) {
                            arrayList.add(xy0Var);
                        } else {
                            if (z) {
                                q20Var.g();
                            } else if (!z2 && !TextUtils.isEmpty(q20Var.f)) {
                                if (sk0Var != null) {
                                    sk0Var.f(new HashMap(q20Var.a));
                                }
                            }
                            arrayList.add(xy0Var);
                        }
                    } else if (str2 != null && sh1Var != null) {
                        String strA2 = j42.a(str2);
                        String str4 = (String) q20Var.a.get(strA2);
                        if (q20.d(str4)) {
                            str2.replace(strA2, str4);
                        } else {
                            arrayList.add(xy0Var);
                        }
                    }
                    a();
                    if (this.a.hasMessages(110)) {
                        this.a.removeMessages(110);
                        return false;
                    }
                    break;
                case 102:
                    j42.a.c("-->WHAT_CHECK_EMPTY.");
                    boolean zB = j42.b(kv.j);
                    q20 q20Var2 = this.e;
                    if (!zB) {
                        q20Var2.f();
                        this.a.removeMessages(110);
                        this.a.sendEmptyMessageDelayed(110, 15000L);
                        return false;
                    }
                    q20Var2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : q20Var2.a.entrySet()) {
                        if (!q20.d((String) entry.getValue())) {
                            arrayList2.add(entry.getKey());
                        }
                    }
                    if (arrayList2.size() <= 0) {
                        if (!TextUtils.isEmpty(this.e.f)) {
                            Log.d("GSLB_SDK", "getBlankDomains size < 0 ");
                            this.a.removeMessages(110);
                            this.a.sendEmptyMessageDelayed(110, 15000L);
                            return false;
                        }
                        if (d(this.e.b())) {
                            Log.d("GSLB_SDK", "net request for country success");
                            this.e.e();
                            this.a.removeMessages(103);
                        }
                        this.a.removeMessages(110);
                        this.a.sendEmptyMessageDelayed(110, 15000L);
                        return false;
                    }
                    b81 b81Var = j42.a;
                    b81Var.c("getBlankDomains size > 0");
                    b81Var.c("blankDomains.size()" + arrayList2.size());
                    boolean zD = d(arrayList2);
                    q20 q20Var3 = this.e;
                    if (zD) {
                        q20Var3.e();
                        a();
                        return false;
                    }
                    q20Var3.f();
                    int i6 = this.c + 1;
                    this.c = i6;
                    if (i6 < 3) {
                        a();
                        return false;
                    }
                    this.e.e();
                    this.a.removeMessages(110);
                    this.a.sendEmptyMessageDelayed(110, 15000L);
                    return false;
                case 103:
                    j42.a.c("-->WHAT_SYNC_DATA.");
                    if (j42.b(kv.j)) {
                        ArrayList arrayListB = this.e.b();
                        if (arrayListB.size() > 0) {
                            d(arrayListB);
                        }
                        this.a.removeMessages(103);
                    }
                    this.a.removeMessages(110);
                    this.a.sendEmptyMessageDelayed(110, 15000L);
                    return false;
            }
        } else {
            j42.a.c("-->WHAT_QUIT.");
            ReentrantLock reentrantLock = this.d;
            if (reentrantLock.tryLock()) {
                try {
                    HandlerThread handlerThread = this.b;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        this.b = null;
                    }
                    return false;
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        return false;
    }
}
