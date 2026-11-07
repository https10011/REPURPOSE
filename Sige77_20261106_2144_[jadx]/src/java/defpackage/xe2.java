package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import com.transsion.sdk.oneid.data.AppIdInfo;
import com.transsion.sdk.oneid.data.GroupFpInfo;
import com.transsion.sdk.oneid.data.GroupHashInfo;
import com.transsion.sdk.oneid.data.IdChangeInfo;
import com.transsion.sdk.oneid.data.OdIdInfo;
import com.transsion.sdk.oneid.data.UniqueIdInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class xe2 implements Handler.Callback {
    public static volatile xe2 n;
    public Handler a;
    public GroupFpInfo c;
    public GroupHashInfo d;
    public tc2 g;
    public final Context j;
    public OdIdInfo k;
    public ConcurrentHashMap l;
    public HandlerThread b = null;
    public long e = 0;
    public long f = 0;
    public final ReentrantLock i = new ReentrantLock();
    public final AtomicBoolean m = new AtomicBoolean(false);
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();

    public xe2(Context context) {
        this.j = context;
        g();
        Handler handler = this.a;
        if (handler != null) {
            handler.sendEmptyMessage(200);
        }
    }

    public static xe2 a(Context context) {
        if (n == null) {
            synchronized (xe2.class) {
                try {
                    if (n == null) {
                        n = new xe2(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return n;
    }

    public final void b(int i, AppIdInfo appIdInfo) {
        if (am2.t(this.j)) {
            am2.g("onOdidRequestRetry");
            appIdInfo.retryTimes++;
            long j = appIdInfo.retryRequestDelay;
            if (j == 0) {
                appIdInfo.retryRequestDelay = 3000L;
            } else {
                appIdInfo.retryRequestDelay = Math.min((j * 2) + 1000, 600000L);
            }
            Message messageObtain = Message.obtain(this.a, 303);
            messageObtain.obj = appIdInfo;
            messageObtain.arg1 = i;
            this.a.sendMessageDelayed(messageObtain, appIdInfo.retryRequestDelay);
        }
    }

    public final void c(Message message) {
        if (am2.t(this.j)) {
            long j = this.e;
            if (j == 0) {
                this.e = 3000L;
            } else {
                this.e = Math.min((j * 2) + 1000, 600000L);
            }
            this.a.sendMessageDelayed(message, this.e);
        }
    }

    public final void d(IdChangeInfo idChangeInfo) {
        IdChangeInfo idChangeInfo2;
        am2.g("onFpIdChanged type = " + idChangeInfo.id_type);
        CopyOnWriteArrayList copyOnWriteArrayList = this.h;
        if (copyOnWriteArrayList != null) {
            Iterator it = copyOnWriteArrayList.iterator();
            do {
                if (!it.hasNext()) {
                    idChangeInfo2 = null;
                    break;
                }
                idChangeInfo2 = (IdChangeInfo) it.next();
            } while (!idChangeInfo2.id_type.equals(idChangeInfo.id_type));
            if (idChangeInfo2 != null) {
                copyOnWriteArrayList.remove(idChangeInfo2);
            }
            copyOnWriteArrayList.add(idChangeInfo);
        }
    }

    public final void e(String str) {
        am2.g("onFpPostComplete");
        this.f = System.currentTimeMillis();
        try {
            yd2 yd2VarA = yd2.a(this.j);
            yd2VarA.b(Long.valueOf(this.f / 1000).intValue(), "last_post_time");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            yd2VarA.c("fp_hash", str);
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    public final void f(String str, int i, AppIdInfo appIdInfo) {
        am2.g("onOdidRequestComplete appId : " + i);
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optInt("code", 0);
            String strOptString = jSONObject.optString("msg", BuildConfig.FLAVOR);
            long jOptLong = jSONObject.optLong("time", 0L);
            appIdInfo.odid = jSONObject.optString("odid", BuildConfig.FLAVOR);
            appIdInfo.retryTimes = 0;
            appIdInfo.retryRequestDelay = 0L;
            appIdInfo.lastRequestTime = System.currentTimeMillis();
            long j = jOptLong * 1000;
            appIdInfo.waitTime = j;
            appIdInfo.msg = strOptString;
            yd2 yd2VarA = yd2.a(this.j);
            String strE = new uk0().e(this.l, new we2().b);
            am2.g("appIdInfoListJson : ".concat(strE));
            yd2VarA.f("appid_info_list", strE);
            Message messageObtain = Message.obtain(this.a, 303);
            messageObtain.obj = appIdInfo;
            messageObtain.arg1 = i;
            this.a.sendMessageDelayed(messageObtain, j);
        } catch (Exception e) {
            am2.l(Log.getStackTraceString(e));
        }
    }

    public final void g() {
        ReentrantLock reentrantLock = this.i;
        if (reentrantLock.tryLock()) {
            try {
                try {
                    Handler handler = this.a;
                    if (handler == null || this.b == null) {
                        HandlerThread handlerThread = new HandlerThread("OneID Worker", 10);
                        this.b = handlerThread;
                        handlerThread.start();
                        this.a = new Handler(this.b.getLooper(), this);
                    } else if (handler.hasMessages(201)) {
                        this.a.removeMessages(201);
                    }
                } catch (Exception e) {
                    am2.l(Log.getStackTraceString(e));
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void h() {
        ConcurrentHashMap concurrentHashMap = this.l;
        if (concurrentHashMap == null || concurrentHashMap.isEmpty()) {
            String strG = yd2.a(this.j).g("appid_info_list");
            if (!TextUtils.isEmpty(strG)) {
                am2.g("AppId Records : " + strG);
                try {
                    this.l = (ConcurrentHashMap) new uk0().a(strG, new ve2().b);
                } catch (Exception e) {
                    am2.l(Log.getStackTraceString(e));
                }
            }
            if (this.l == null) {
                this.l = new ConcurrentHashMap();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        GroupFpInfo groupFpInfo;
        String strE;
        boolean z;
        ReentrantLock reentrantLock = this.i;
        try {
            int i = message.what;
            Context context = this.j;
            if (i == 100) {
                am2.g("-->WHAT_GET_PROP_RET");
                String string = message.getData().getString("oneid");
                if (!TextUtils.isEmpty(string) && !TextUtils.equals(string, "UNKNOWN") && (groupFpInfo = this.c) != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(groupFpInfo.dids.tsid);
                    GroupFpInfo groupFpInfo2 = this.c;
                    if (zIsEmpty) {
                        UniqueIdInfo uniqueIdInfo = groupFpInfo2.dids;
                        uniqueIdInfo.tsid = string;
                        this.d.updateDidsHash(uniqueIdInfo);
                        this.k.tsid = string;
                        yd2 yd2VarA = yd2.a(context);
                        int iIntValue = Long.valueOf(System.currentTimeMillis() / 1000).intValue();
                        try {
                            yd2VarA.c("oneid", string);
                            yd2VarA.b(iIntValue, "oneid_time");
                            return false;
                        } catch (Exception e) {
                            am2.l(Log.getStackTraceString(e));
                        }
                    } else if (!TextUtils.equals(groupFpInfo2.dids.tsid, string)) {
                        d(new IdChangeInfo("tsid", this.c.dids.tsid, string));
                        UniqueIdInfo uniqueIdInfo2 = this.c.dids;
                        uniqueIdInfo2.tsid = string;
                        this.d.updateDidsHash(uniqueIdInfo2);
                        this.k.tsid = string;
                        return false;
                    }
                }
            } else if (i == 200) {
                kk0 kk0Var = new kk0();
                kk0Var.b("OneID");
                kk0Var.c = false;
                am2.g = new b81(kk0Var);
                TextUtils.isEmpty(yd2.a(context).g("one_id_first_launch"));
                am2.g("-->WHAT_INIT 2.0.1.9");
                String string2 = context.getResources().getString(2131886342);
                if (TextUtils.isEmpty(string2)) {
                    string2 = context.getPackageName();
                }
                if (!TextUtils.equals(string2, am2.k(context))) {
                    am2.g("Only works in the main process");
                    this.a.sendEmptyMessageDelayed(201, 1000L);
                    return false;
                }
                try {
                    if (this.g == null) {
                        tc2 tc2Var = new tc2(1);
                        tc2Var.b = true;
                        this.g = tc2Var;
                        context.registerReceiver(this.g, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, this.a);
                    }
                } catch (Exception e2) {
                    am2.l(Log.getStackTraceString(e2));
                }
                kv.M(context, new String[]{"ire-oneid.shalltry.com", "oneid-dev-sg.shalltry.com"}, null);
                GroupFpInfo groupFpInfo3 = new GroupFpInfo(context, this);
                this.c = groupFpInfo3;
                this.d = new GroupHashInfo(groupFpInfo3);
                this.k = new OdIdInfo(this.c);
                am2.g("--> new OdidInfo " + this.k);
                if (this.f == 0) {
                    yd2 yd2VarA2 = yd2.a(context);
                    Context context2 = (Context) yd2VarA2.c;
                    int i2 = -1;
                    if (context2 != null) {
                        if (((SharedPreferences) yd2VarA2.b) == null) {
                            yd2VarA2.b = yd2VarA2.d(context2);
                        }
                        SharedPreferences sharedPreferences = (SharedPreferences) yd2VarA2.b;
                        if (sharedPreferences != null) {
                            try {
                                i2 = sharedPreferences.getInt("last_post_time", 0);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    this.f = ((long) i2) * 1000;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = this.f;
                if (jCurrentTimeMillis >= j && jCurrentTimeMillis - j < 86400000) {
                    am2.g("Post time not yet reached");
                } else if (!this.a.hasMessages(300)) {
                    this.a.sendEmptyMessageDelayed(300, kv.O("https://ire-oneid.shalltry.com") ? 3000L : 6000L);
                }
                this.m.set(true);
            } else if (i != 201) {
                CopyOnWriteArrayList<IdChangeInfo> copyOnWriteArrayList = this.h;
                switch (i) {
                    case 300:
                        am2.g("-->WHAT_POST_FP_HASH");
                        this.a.removeMessages(300);
                        if (!am2.r(context)) {
                            am2.g("OneID disable or network unavailable");
                            this.e = 0L;
                            this.a.sendEmptyMessage(201);
                            return false;
                        }
                        if (!kv.O("https://ire-oneid.shalltry.com")) {
                            am2.g("GslbSdk new domain is not ready");
                            c(Message.obtain(this.a, 300));
                            return false;
                        }
                        try {
                            strE = yd2.a(context).e("fp_hash");
                        } catch (Exception unused2) {
                            strE = BuildConfig.FLAVOR;
                        }
                        String strE2 = am2.e(this.d.toString());
                        am2.g(strE + " vs " + strE2);
                        if (TextUtils.equals(strE, strE2)) {
                            e(null);
                        } else {
                            Message.obtain(this.a, 301, strE2).sendToTarget();
                        }
                        break;
                        break;
                    case 301:
                        am2.g("-->WHAT_POST_FP_DATA");
                        this.a.removeMessages(301);
                        if (!am2.r(context)) {
                            am2.g("OneID disable or network unavailable");
                            this.e = 0L;
                            this.a.sendEmptyMessage(201);
                            return false;
                        }
                        String str = (String) message.obj;
                        v61 v61VarA = if2.a(0, kv.y("https://ire-oneid.shalltry.com", true) + "/one/v1/log", this.c.toString());
                        Object obj = v61VarA.b;
                        int i3 = v61VarA.a;
                        am2.g("code = " + i3 + " data = " + ((String) obj));
                        if (i3 == 0) {
                            this.e = 0L;
                            try {
                                z = false;
                                if (new JSONObject((String) obj).optInt("code", 0) == 0) {
                                    if (copyOnWriteArrayList.isEmpty()) {
                                        e(str);
                                        return false;
                                    }
                                    Message.obtain(this.a, 302, str).sendToTarget();
                                    return false;
                                }
                                return z;
                            } catch (Exception e3) {
                                am2.l(Log.getStackTraceString(e3));
                            }
                        } else if (i3 != 4) {
                            c(Message.obtain(this.a, 301, str));
                            return false;
                        }
                        break;
                        break;
                    case 302:
                        am2.g("-->WHAT_POST_ID_CHANGE");
                        this.a.removeMessages(302);
                        String str2 = (String) message.obj;
                        ArrayList arrayList = new ArrayList();
                        for (IdChangeInfo idChangeInfo : copyOnWriteArrayList) {
                            if (!TextUtils.isEmpty(idChangeInfo.pre_id)) {
                                arrayList.add(idChangeInfo);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            if (copyOnWriteArrayList.size() > 0) {
                                am2.f(context, copyOnWriteArrayList);
                                copyOnWriteArrayList.clear();
                            }
                            e(str2);
                            return false;
                        }
                        try {
                            v61 v61VarA2 = if2.a(0, kv.y("https://ire-oneid.shalltry.com", true) + "/one/v1/change", new uk0().d(arrayList));
                            Object obj2 = v61VarA2.b;
                            int i4 = v61VarA2.a;
                            am2.g("code = " + i4 + " data = " + ((String) obj2));
                            if (i4 == 0) {
                                this.e = 0L;
                                try {
                                    z = false;
                                    if (new JSONObject((String) obj2).optInt("code", 0) == 0) {
                                        am2.f(context, copyOnWriteArrayList);
                                        copyOnWriteArrayList.clear();
                                        e(str2);
                                        return false;
                                    }
                                    return z;
                                } catch (Exception e4) {
                                    am2.l(Log.getStackTraceString(e4));
                                }
                            } else if (i4 != 4) {
                                c(Message.obtain(this.a, 302, str2));
                                return false;
                            }
                        } catch (Exception e5) {
                            am2.l(Log.getStackTraceString(e5));
                        }
                        break;
                        break;
                    case 303:
                        am2.g("-->WHAT_REQUEST_ODID");
                        int i5 = message.arg1;
                        AppIdInfo appIdInfo = (AppIdInfo) message.obj;
                        this.a.removeMessages(303, appIdInfo);
                        if (!am2.r(context)) {
                            am2.g("OneID disable or network unavailable");
                            this.a.sendEmptyMessage(201);
                            return false;
                        }
                        OdIdInfo odIdInfo = this.k;
                        if (odIdInfo == null) {
                            return false;
                        }
                        odIdInfo.appid = i5;
                        am2.g("--> mOdidInfo set appID :" + this.k.toString());
                        OdIdInfo odIdInfo2 = this.k;
                        v61 v61VarA3 = if2.a(odIdInfo2.appid, kv.y("https://ire-oneid.shalltry.com", true) + "/one/v1/odid", odIdInfo2.toString());
                        Object obj3 = v61VarA3.b;
                        int i6 = v61VarA3.a;
                        am2.g("code = " + i6 + " data = " + ((String) obj3));
                        if (i6 == 0) {
                            f((String) obj3, i5, appIdInfo);
                            return false;
                        }
                        if (i6 != 3) {
                            if (i6 == 4) {
                                return false;
                            }
                            b(i5, appIdInfo);
                            return false;
                        }
                        am2.g("onOdidRequestGatewayError");
                        Message messageObtain = Message.obtain(this.a, 303);
                        messageObtain.obj = appIdInfo;
                        messageObtain.arg1 = i5;
                        this.a.sendMessageDelayed(messageObtain, 1000L);
                        return false;
                    case 304:
                        Integer num = (Integer) message.obj;
                        int iIntValue2 = num.intValue();
                        this.a.removeMessages(304, num);
                        if (!am2.r(context)) {
                            am2.g("OneID disable or network unavailable");
                            this.a.sendEmptyMessage(201);
                            return false;
                        }
                        h();
                        AppIdInfo appIdInfo2 = (AppIdInfo) this.l.get(num);
                        if (appIdInfo2 == null) {
                            appIdInfo2 = new AppIdInfo();
                            this.l.put(num, appIdInfo2);
                            OdIdInfo odIdInfo3 = this.k;
                            if (odIdInfo3 != null) {
                                odIdInfo3.appid = iIntValue2;
                            }
                        }
                        Message messageObtain2 = Message.obtain(this.a, 303);
                        messageObtain2.arg1 = iIntValue2;
                        messageObtain2.obj = appIdInfo2;
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long jMax = kv.O("https://ire-oneid.shalltry.com") ? 3000L : 6000L;
                        long j2 = appIdInfo2.lastRequestTime;
                        if (jCurrentTimeMillis2 >= j2) {
                            long j3 = jCurrentTimeMillis2 - j2;
                            long j4 = appIdInfo2.waitTime;
                            if (j3 < j4) {
                                jMax = Math.max((j2 + j4) - jCurrentTimeMillis2, jMax);
                            }
                        }
                        if (this.a.hasMessages(303, appIdInfo2)) {
                            return false;
                        }
                        this.a.sendMessageDelayed(messageObtain2, jMax);
                        am2.g("Appid : " + iIntValue2 + " delay " + jMax + " ms refresh odid ");
                        return false;
                    default:
                        return false;
                }
            } else {
                am2.g("-->WHAT_QUIT");
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
        } catch (Exception e6) {
            am2.l(Log.getStackTraceString(e6));
        }
        return false;
    }

    public final void i() {
        if (am2.t(this.j)) {
            am2.g("retry");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.f;
            if (jCurrentTimeMillis >= j && jCurrentTimeMillis - j < 86400000) {
                am2.g("Post time not yet reached");
                return;
            }
            ReentrantLock reentrantLock = this.i;
            if (reentrantLock.tryLock()) {
                try {
                    if (this.b == null) {
                        g();
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            Handler handler = this.a;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.a.sendEmptyMessage(200);
            }
        }
    }
}
