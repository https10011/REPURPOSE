package defpackage;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.hjq.toast.BuildConfig;
import com.tencent.mmkv.MMKV;
import com.transsion.athena.data.AppIdData;
import com.transsion.athena.data.TrackData;
import com.transsion.athena.data.TrackDataWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ff2 extends h8 implements Handler.Callback {
    public static volatile ff2 o;
    public boolean c;
    public int d;
    public int e;
    public final SparseArray f;
    public String g;
    public boolean h;
    public boolean i;
    public long j;
    public final ox1 k;
    public long l;
    public final bf2 m;
    public final cf2 n;

    public ff2(Context context) {
        super(context);
        this.c = false;
        this.f = new SparseArray();
        this.j = 0L;
        this.k = new ox1(this);
        new af2(this);
        this.l = 0L;
        this.m = new bf2(this, 1);
        this.n = new cf2(this);
        HandlerThread handlerThread = new HandlerThread("Athena-Worker", 10);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.b = handler;
        handler.sendEmptyMessage(303);
    }

    public static void A(String str, int i, pd2 pd2Var, String str2) {
        String strY;
        if (TextUtils.isEmpty(str)) {
            strY = kv.y(ze2.c(), true);
        } else {
            String str3 = ze2.a;
            StringBuilder sbM = ts.m(str);
            sbM.append(ze2.h);
            strY = kv.y(sbM.toString(), true);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("app_id", i);
        bundle.putString("url", strY);
        bundle.putLong("ver", pd2Var.d);
        bundle.putString("gslb_data", str2);
        ic icVar = new ic("app_cfg_log", 9999);
        icVar.d(bundle);
        icVar.c();
    }

    public static void C(JSONObject jSONObject, String str, Object obj) throws JSONException {
        try {
            jSONObject.getString(str);
        } catch (JSONException unused) {
            jSONObject.put(str, obj);
        }
    }

    public static boolean I() {
        CopyOnWriteArrayList<pd2> copyOnWriteArrayList = (CopyOnWriteArrayList) ((f91) ld2.f().a.b).c;
        if (rq0.h(copyOnWriteArrayList)) {
            return false;
        }
        for (pd2 pd2Var : copyOnWriteArrayList) {
            if (pd2Var != null && pd2Var.b()) {
                return true;
            }
        }
        return false;
    }

    public static void z(ff2 ff2Var, int i, boolean z) {
        Context context = (Context) ff2Var.a;
        pd2 pd2VarA = ((f91) ld2.f().a.b).a(i);
        if (pd2VarA != null) {
            cc2.b("handleTidChange appconf : %s", pd2VarA.d());
            ac2.i(context).k(pd2VarA, z);
            String str = pd2VarA.h;
            int i2 = 10;
            if (!TextUtils.isEmpty(str)) {
                if (kv.O(str)) {
                    A(str, i, pd2VarA, ff2Var.g);
                } else {
                    q8 q8Var = new q8();
                    q8Var.b = str;
                    q8Var.a = i;
                    q8Var.c = pd2VarA;
                    kv.M(context, new String[]{str}, q8Var);
                }
                kv.z(str, new sh1(i2));
            }
            String str2 = pd2VarA.k;
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            if (!TextUtils.isEmpty(str2)) {
                kv.M(context, new String[]{str2}, new mo1(i2));
                kv.z(str2, null);
            }
        }
        if (z) {
            CopyOnWriteArrayList<rx1> copyOnWriteArrayList = pd2VarA.f;
            if (rq0.h(copyOnWriteArrayList)) {
                cc2.f("%s", "handleTidChange tid config is null");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (rx1 rx1Var : copyOnWriteArrayList) {
                if (rx1Var.c.b() == -1) {
                    arrayList.add(Long.valueOf(rx1Var.a));
                }
            }
            if (!arrayList.isEmpty()) {
                try {
                    ac2.i(context).m(arrayList, ff2Var.c, new uq1(25));
                } catch (Exception e) {
                    cc2.d("Handle tid change exception : %s", e.getMessage());
                    gf2.b.a(new oc2("handleTidChange", e));
                }
            }
            if (qd2.a == i) {
                ze2.r = ld2.f().a(i, "page_view", 1.0f) == 0;
            }
        }
    }

    public final void B(ArrayList arrayList) throws Throwable {
        int iW;
        int iF;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dz1 dz1Var = (dz1) obj;
            if (ld2.f().b(dz1Var.d, dz1Var.i.c) == 0) {
                bc2.c().a(dz1Var);
                arrayList2.add(dz1Var);
            }
        }
        if (arrayList2.size() > 0) {
            ac2 ac2VarI = ac2.i((Context) this.a);
            h51 h51Var = new h51(arrayList);
            ac2VarI.getClass();
            try {
                iW = ((rc2) ac2VarI.c).w(arrayList2, h51Var);
            } catch (oc2 e) {
                int i2 = oc2.c;
                gf2.b.a(e);
                iW = 0;
            }
            cc2.e("saveMemCacheToDb Count = " + iW);
            if (iW == -2) {
                ac2 ac2VarI2 = ac2.i((Context) this.a);
                qh1 qh1Var = new qh1(10);
                ac2VarI2.getClass();
                try {
                    iF = ((rc2) ac2VarI2.c).f(qh1Var);
                } catch (oc2 e2) {
                    int i3 = oc2.c;
                    gf2.b.a(e2);
                    iF = -1;
                }
                cc2.c("saveToDB out of memory cleanCount = " + iF);
            }
            v(this.d, false);
        }
    }

    public final void D(boolean z) {
        Context context = (Context) this.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((z && TextUtils.isEmpty(ze2.q)) || Math.abs(jCurrentTimeMillis - this.l) < 3600000) {
            if (((Handler) this.b).hasMessages(502)) {
                return;
            }
            ((Handler) this.b).sendMessageDelayed(((Handler) this.b).obtainMessage(502), 3600000L);
            return;
        }
        if (ld2.f().a(9999, "location", 1.0f) == 0) {
            if (sc2.e(context, "android.permission.ACCESS_COARSE_LOCATION") || sc2.e(context, "android.permission.ACCESS_FINE_LOCATION")) {
                LocationManager locationManager = (LocationManager) context.getApplicationContext().getSystemService("location");
                if (locationManager == null) {
                    x(null);
                    return;
                }
                String str = "network";
                if (!locationManager.isProviderEnabled("network")) {
                    str = "passive";
                    if (!locationManager.isProviderEnabled("passive")) {
                        str = "gps";
                        if (!locationManager.isProviderEnabled("gps")) {
                            str = null;
                        }
                    }
                }
                if (str != null) {
                    Handler handler = (Handler) this.b;
                    bf2 bf2Var = this.m;
                    handler.removeCallbacks(bf2Var);
                    ((Handler) this.b).postDelayed(bf2Var, 30000L);
                    locationManager.requestSingleUpdate(str, this.n, (Looper) null);
                    this.l = jCurrentTimeMillis;
                }
                if (((Handler) this.b).hasMessages(502)) {
                    return;
                }
                ((Handler) this.b).sendMessageDelayed(((Handler) this.b).obtainMessage(502), 3600000L);
            }
        }
    }

    public final void E(int i, String str) {
        Context context = (Context) this.a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((f91) ld2.f().a.b).c;
        Iterator it = copyOnWriteArrayList.iterator();
        do {
            if (!it.hasNext()) {
                pd2 pd2Var = new pd2();
                pd2Var.a = i;
                copyOnWriteArrayList.add(pd2Var);
                break;
            }
        } while (((pd2) it.next()).a != i);
        if (ac2.i(context) != null) {
            if (str == null) {
                ac2.i(context).l(AppIdData.a(context, i));
                return;
            }
            ac2 ac2VarI = ac2.i(context);
            AppIdData appIdData = new AppIdData();
            appIdData.a = i;
            appIdData.b = str;
            ac2VarI.l(appIdData);
        }
    }

    public final void F(dz1 dz1Var) {
        Context context = (Context) this.a;
        String str = ze2.a;
        if (G(dz1Var)) {
            int iA = sc2.a(dz1Var.d);
            SparseArray sparseArray = this.f;
            if (sparseArray.indexOfKey(iA) >= 0) {
                String str2 = (String) sparseArray.get(iA, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        String string = jSONObject.has("eparam") ? jSONObject.getString("eparam") : BuildConfig.FLAVOR;
                        JSONObject jSONObject2 = TextUtils.isEmpty(string) ? new JSONObject() : new JSONObject(string);
                        dz1 dz1Var2 = new dz1();
                        dz1Var2.a = jSONObject.getString("event");
                        dz1Var2.d = jSONObject.getLong("tid");
                        dz1Var2.f = jSONObject.getLong("ts");
                        dz1Var2.g = SystemClock.elapsedRealtime();
                        dz1Var2.c = jSONObject2;
                        sparseArray.put(iA, BuildConfig.FLAVOR);
                        dc2.a(hc.h).l("first_page_enter_" + iA, BuildConfig.FLAVOR);
                        F(dz1Var2);
                    } catch (Exception unused) {
                    }
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("event", dz1Var.a);
                jSONObject3.put("tid", dz1Var.d);
                jSONObject3.put("type", dz1Var.e);
                JSONObject jSONObject4 = dz1Var.c;
                C(jSONObject4, "_apkg", nj2.B(context));
                C(jSONObject4, "_avn", nj2.J(context));
                C(jSONObject4, "_avc", Integer.valueOf(nj2.C(context)));
                String str3 = ze2.a;
                C(jSONObject4, "_atutp", (short) 0);
                C(jSONObject4, "_atuid", BuildConfig.FLAVOR);
                C(jSONObject4, "_achannel", ze2.p);
                C(jSONObject4, "_ainstallchnl", TextUtils.isEmpty(nj2.w(context)) ? " " : nj2.w(context));
                jSONObject3.put("_eparam", jSONObject4);
            } catch (JSONException e) {
                cc2.d("Track by DCS exception : ", e.getMessage());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("trackObject", jSONObject3.toString());
            context.getContentResolver().insert(Uri.parse("content://com.transsion.dataservice.provider/track"), contentValues);
            cc2.f("track by DCS:%s", jSONObject3.toString());
        }
    }

    public final boolean G(dz1 dz1Var) {
        if (!"app_launch".equals(dz1Var.a)) {
            return true;
        }
        dc2 dc2VarA = dc2.a((Context) this.a);
        String str = "app_launch_" + sc2.a(dz1Var.d);
        int iJ = dc2VarA.j(str);
        if (iJ != 0 && Math.abs((dz1Var.f / 1000) - ((long) iJ)) <= 7200) {
            return false;
        }
        dc2VarA.e(Long.valueOf(dz1Var.f / 1000).intValue(), str);
        return true;
    }

    public final void H() {
        Context context = (Context) this.a;
        Cursor cursorQuery = null;
        try {
            String strB = nj2.B(context);
            cursorQuery = context.getContentResolver().query(Uri.parse("content://com.transsion.dataservice.provider/authorize"), null, "pkg = ?", new String[]{strB}, null);
            if (cursorQuery != null) {
                boolean z = true;
                if (cursorQuery.getCount() != 1) {
                    z = false;
                }
                this.i = z;
                cc2.f("Pkg [%s] DCS authorize [%s]", strB, z ? "enable" : "disable");
            } else {
                cc2.f("Cursor is null, Pkg [%s] may not on the DCS white list", strB);
            }
        } catch (Exception e) {
            cc2.d("Dcs applyForAccess exception : %s", e.getMessage());
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    public final void J() {
        long j;
        int i;
        long j2;
        if (!bj0.d((Context) this.a)) {
            cc2.f("%s", "CheckConfig cancel, network is not available");
            return;
        }
        if (!kv.O(ze2.a(false))) {
            cc2.f("%s", "CheckConfig cancel, GslbSdk is not inited");
            return;
        }
        ld2 ld2VarF = ld2.f();
        Handler handler = (Handler) this.b;
        md2 md2Var = ld2VarF.a;
        md2Var.getClass();
        hf2 hf2Var = (hf2) ((f91) md2Var.b).b;
        long j3 = hf2Var.g;
        ox1 ox1Var = this.k;
        if (j3 == -1 || hf2Var.a == -1) {
            j = -1;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j4 = jCurrentTimeMillis - hf2Var.g;
            j = -1;
            if (Math.abs(j4) < hf2Var.a) {
                if (j4 >= 0 && hf2Var.h < 32) {
                }
                for (pd2 pd2Var : (CopyOnWriteArrayList) ((f91) md2Var.b).c) {
                    i = pd2Var.i;
                    if (i > 0) {
                        j2 = ((long) i) * 3600000;
                    } else {
                        j2 = hf2Var.a;
                    }
                    if (pd2Var.b == j && j2 != j) {
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        long j5 = jCurrentTimeMillis2 - pd2Var.b;
                        if (Math.abs(j5) >= j2) {
                            pd2Var.c(jCurrentTimeMillis2);
                        } else if (j5 < 0) {
                            long j6 = pd2Var.b;
                            Calendar calendar = Calendar.getInstance();
                            calendar.get(1);
                            calendar.get(2);
                            calendar.get(5);
                            calendar.set(11, 0);
                            calendar.set(12, 0);
                            calendar.set(13, 0);
                            calendar.set(14, 0);
                            long timeInMillis = calendar.getTimeInMillis();
                            calendar.add(5, 1);
                            long timeInMillis2 = calendar.getTimeInMillis();
                            if (j6 < timeInMillis || j6 >= timeInMillis2) {
                            }
                        } else if (pd2Var.c < 32) {
                        }
                    }
                    hd2.a().b(new zc2(pd2Var, j2, ox1Var));
                }
            }
            hf2Var.g = jCurrentTimeMillis;
            hf2Var.h = 0;
        }
        hd2.a().b(new yc2(handler, hf2Var, ox1Var));
        while (r2.hasNext()) {
            i = pd2Var.i;
            if (i > 0) {
                j2 = ((long) i) * 3600000;
            } else {
                j2 = hf2Var.a;
            }
            if (pd2Var.b == j) {
            }
            hd2.a().b(new zc2(pd2Var, j2, ox1Var));
        }
    }

    public final void K() {
        gd2 gd2Var;
        ArrayList arrayList;
        String strY;
        if (!bj0.d((Context) this.a)) {
            cc2.b("%s", "checkUpload network unavailable");
            return;
        }
        bc2 bc2VarC = bc2.c();
        if ((bc2VarC.d <= 0 || SystemClock.elapsedRealtime() - bc2VarC.d <= 60000) && ((gd2Var = bc2VarC.a) == null || !TextUtils.equals(gd2Var.c, bc2VarC.b))) {
            if (bc2.c().e) {
                return;
            }
            cc2.b("%s", "checkUpload sync baseTime");
            bc2 bc2VarC2 = bc2.c();
            bc2VarC2.e = true;
            bc2VarC2.d = SystemClock.elapsedRealtime();
            hd2 hd2VarA = hd2.a();
            sd2 sd2Var = new sd2((Handler) this.b);
            sd2Var.c = 0;
            hd2VarA.b(sd2Var);
            return;
        }
        if (!kv.O(ze2.c())) {
            cc2.b("%s", "checkUpload GSLB is not ready");
            return;
        }
        if (rq0.h(((hf2) ((f91) ld2.f().a.b).b).l)) {
            cc2.b("%s", "checkUpload global config is not ready");
            return;
        }
        ac2 ac2VarI = ac2.i((Context) this.a);
        ac2VarI.getClass();
        try {
            arrayList = ((rc2) ac2VarI.c).j();
        } catch (oc2 e) {
            int i = oc2.c;
            gf2.b.a(e);
            arrayList = null;
        }
        if (rq0.h(arrayList)) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((f91) ld2.f().a.b).c;
            if (rq0.h(copyOnWriteArrayList)) {
                cc2.b("%s", "checkUpload appid config list is null");
                return;
            }
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                AppIdData appIdDataA = AppIdData.a((Context) this.a, ((pd2) it.next()).a);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(appIdDataA);
                ac2.i((Context) this.a).l(appIdDataA);
            }
        }
        ArrayList<AppIdData> arrayList2 = arrayList;
        HashSet hashSet = new HashSet();
        for (AppIdData appIdData : arrayList2) {
            pd2 pd2VarA = ((f91) ld2.f().a.b).a(appIdData.a);
            if (pd2VarA != null) {
                if (TextUtils.isEmpty(pd2VarA.h)) {
                    strY = kv.y(ze2.c(), true);
                } else {
                    StringBuilder sbM = ts.m(pd2VarA.h);
                    sbM.append(ze2.h);
                    strY = kv.y(sbM.toString(), true);
                }
                appIdData.f = strY;
                hashSet.add(strY);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            hd2.a().b(new nf2((Handler) this.b, (String) it2.next(), arrayList2, this.c, this.f));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0297 A[Catch: Exception -> 0x0246, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x029d A[Catch: Exception -> 0x0246, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ac A[Catch: Exception -> 0x0246, TRY_LEAVE, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[Catch: Exception -> 0x011b, TRY_LEAVE, TryCatch #3 {Exception -> 0x011b, blocks: (B:40:0x00ff, B:42:0x0117), top: B:119:0x00ff, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0128 A[DONT_INVERT, PHI: r3
      0x0128: PHI (r3v19 f91) = (r3v34 f91), (r3v35 f91), (r3v18 f91) binds: [B:39:0x00fd, B:45:0x011c, B:43:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x012a A[Catch: Exception -> 0x0136, TryCatch #9 {Exception -> 0x0136, blocks: (B:38:0x00f2, B:47:0x012a, B:51:0x013a, B:54:0x0147, B:58:0x015c, B:61:0x0165, B:57:0x0152, B:50:0x0138, B:45:0x011c, B:40:0x00ff, B:42:0x0117), top: B:127:0x00f2, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0138 A[Catch: Exception -> 0x0136, TryCatch #9 {Exception -> 0x0136, blocks: (B:38:0x00f2, B:47:0x012a, B:51:0x013a, B:54:0x0147, B:58:0x015c, B:61:0x0165, B:57:0x0152, B:50:0x0138, B:45:0x011c, B:40:0x00ff, B:42:0x0117), top: B:127:0x00f2, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147 A[Catch: Exception -> 0x0136, TryCatch #9 {Exception -> 0x0136, blocks: (B:38:0x00f2, B:47:0x012a, B:51:0x013a, B:54:0x0147, B:58:0x015c, B:61:0x0165, B:57:0x0152, B:50:0x0138, B:45:0x011c, B:40:0x00ff, B:42:0x0117), top: B:127:0x00f2, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x014f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152 A[Catch: Exception -> 0x0136, TryCatch #9 {Exception -> 0x0136, blocks: (B:38:0x00f2, B:47:0x012a, B:51:0x013a, B:54:0x0147, B:58:0x015c, B:61:0x0165, B:57:0x0152, B:50:0x0138, B:45:0x011c, B:40:0x00ff, B:42:0x0117), top: B:127:0x00f2, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0164  */
    /* JADX WARN: Code duplicated, block: B:71:0x0197  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0205 A[Catch: Exception -> 0x0246, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0222 A[Catch: Exception -> 0x0246, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x028a A[Catch: Exception -> 0x0246, TryCatch #8 {Exception -> 0x0246, blocks: (B:82:0x01f1, B:83:0x01ff, B:85:0x0205, B:87:0x0222, B:88:0x022c, B:90:0x0232, B:92:0x0238, B:95:0x0248, B:97:0x028a, B:99:0x0290, B:102:0x0294, B:103:0x0297, B:105:0x029d, B:106:0x02a6, B:108:0x02ac), top: B:125:0x01f1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0205, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void L() throws Throwable {
        FileInputStream fileInputStream;
        String strTrim;
        md2 md2Var;
        nd2 nd2Var;
        int i;
        dc2 dc2VarA;
        File file;
        File file2;
        String[] list;
        SharedPreferences sharedPreferences;
        String strD;
        f91 f91Var;
        hf2 hf2VarA;
        pd2 pd2VarA;
        CopyOnWriteArrayList copyOnWriteArrayList;
        long j;
        this.h = bj0.d((Context) this.a);
        ((Handler) this.b).postDelayed(new bf2(this, 0 == true ? 1 : 0), 3600000L);
        bc2 bc2VarC = bc2.c();
        bc2VarC.getClass();
        try {
            String strN = dc2.a(hc.h).n("base_time");
            cc2.a("baseTimeJs = " + strN);
            if (!TextUtils.isEmpty(strN)) {
                gd2 gd2Var = new gd2();
                JSONObject jSONObject = new JSONObject(strN);
                gd2Var.a = jSONObject.getLong("serverTime");
                gd2Var.b = jSONObject.getLong("elapsedRealtime");
                gd2Var.c = jSONObject.getString("bootId");
                bc2VarC.a = gd2Var;
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
        FileInputStream fileInputStream2 = null;
        f91Var = null;
        f91 f91Var2 = null;
        try {
            fileInputStream = new FileInputStream("/proc/sys/kernel/random/boot_id");
            try {
                byte[] bArr = new byte[1024];
                int i2 = fileInputStream.read(bArr);
                if (i2 > 0) {
                    strTrim = new String(bArr, 0, i2).trim();
                    try {
                        fileInputStream.close();
                    } catch (IOException unused) {
                    }
                } else {
                    try {
                        fileInputStream.close();
                    } catch (IOException unused2) {
                    }
                    strTrim = null;
                }
            } catch (Exception unused3) {
                if (fileInputStream != null) {
                }
                strTrim = null;
                bc2VarC.b = strTrim;
                if (bc2VarC.a != null) {
                    if (bc2VarC.b.equals(bc2VarC.a.c)) {
                        bc2VarC.a = null;
                        dc2.a(hc.h).l("base_time", BuildConfig.FLAVOR);
                    } else if (Math.abs(((SystemClock.elapsedRealtime() - bc2VarC.a.b) + bc2VarC.a.a) - System.currentTimeMillis()) > 600000) {
                        bc2VarC.c = true;
                    }
                }
                ld2 ld2VarF = ld2.f();
                md2Var = ld2VarF.a;
                nd2Var = (nd2) md2Var.a;
                md2Var.c();
                strD = nd2Var.d();
                if (TextUtils.isEmpty(strD)) {
                    if (f91Var2 == null) {
                        nd2Var.c(((f91) md2Var.b).g());
                    } else {
                        md2Var.b = f91Var2;
                    }
                    pd2VarA = ((f91) md2Var.b).a(qd2.a);
                    if (pd2VarA == null) {
                        copyOnWriteArrayList = pd2VarA.f;
                        if (rq0.h(copyOnWriteArrayList)) {
                            j = 0;
                        } else {
                            j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                        }
                        String str = ze2.a;
                        if (j < 30000) {
                            j = 30000;
                        }
                        ze2.o = j;
                    }
                } else {
                    try {
                        JSONObject jSONObject2 = new JSONObject(strD);
                        f91Var = new f91(8);
                        hf2VarA = hf2.a(jSONObject2.getJSONObject("global_config"));
                        if (hf2VarA != null) {
                            f91Var.b = hf2VarA;
                        }
                        f91Var2 = f91Var;
                    } catch (Exception e2) {
                        cc2.c(Log.getStackTraceString(e2));
                        oc2.a("fromJSON", e2);
                    }
                    if (f91Var2 == null) {
                        nd2Var.c(((f91) md2Var.b).g());
                    } else {
                        md2Var.b = f91Var2;
                    }
                    pd2VarA = ((f91) md2Var.b).a(qd2.a);
                    if (pd2VarA == null) {
                        copyOnWriteArrayList = pd2VarA.f;
                        if (rq0.h(copyOnWriteArrayList)) {
                            j = 0;
                        } else {
                            j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                        }
                        String str2 = ze2.a;
                        if (j < 30000) {
                            j = 30000;
                        }
                        ze2.o = j;
                    }
                }
                ld2VarF.b = true;
                ac2 ac2VarI = ac2.i((Context) this.a);
                uq1 uq1Var = new uq1(23);
                ac2VarI.getClass();
                ((rc2) ac2VarI.c).l(uq1Var);
                i = qd2.a;
                if (i != 0) {
                    ze2.r = ld2.f().a(i, "page_view", 1.0f) == 0;
                }
                if (sc2.h((Context) this.a)) {
                    cc2.f("%s", "Dcs unavailable because of not support or conf disable");
                } else {
                    cc2.f("%s", "Dcs unavailable because of not support or conf disable");
                }
                kv.M((Context) this.a, od2.a, new ri2(this));
                Handler handler = (Handler) this.b;
                handler.postDelayed(new i4(handler, 22), 7200000L);
                dc2VarA = dc2.a((Context) this.a);
                for (Integer num : qd2.b) {
                    String str3 = "first_page_enter_" + num;
                    if (((SharedPreferences) dc2VarA.a) == null) {
                        dc2VarA.a = dc2VarA.k((Context) dc2VarA.b);
                    }
                    sharedPreferences = (SharedPreferences) dc2VarA.a;
                    if (sharedPreferences == null) {
                    }
                }
                File filesDir = ((Context) this.a).getFilesDir();
                StringBuilder sb = new StringBuilder();
                sb.append(filesDir);
                String str4 = File.separator;
                sb.append(str4);
                sb.append(ze2.j);
                file = new File(sb.toString());
                file2 = new File(filesDir + str4 + ze2.k);
                if (file.exists()) {
                    list = file.list();
                    if (list == null) {
                        if (file.delete()) {
                            cc2.b("%s", "dataFile deleted");
                        }
                    } else if (file.delete()) {
                        cc2.b("%s", "dataFile deleted");
                    }
                }
                if (file2.exists()) {
                    nj2.e((Context) this.a, file2.getPath());
                }
                Message messageObtainMessage = ((Handler) this.b).obtainMessage(502);
                messageObtainMessage.arg1 = 1;
                ((Handler) this.b).sendMessageDelayed(messageObtainMessage, 3000L);
                this.d = ((hf2) ((f91) ld2.f().a.b).b).p * 1000;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        bc2VarC.b = strTrim;
        if (bc2VarC.a != null && !TextUtils.isEmpty(strTrim)) {
            if (bc2VarC.b.equals(bc2VarC.a.c)) {
                bc2VarC.a = null;
                dc2.a(hc.h).l("base_time", BuildConfig.FLAVOR);
            } else if (Math.abs(((SystemClock.elapsedRealtime() - bc2VarC.a.b) + bc2VarC.a.a) - System.currentTimeMillis()) > 600000) {
                bc2VarC.c = true;
            }
        }
        ld2 ld2VarF2 = ld2.f();
        md2Var = ld2VarF2.a;
        nd2Var = (nd2) md2Var.a;
        try {
            md2Var.c();
            strD = nd2Var.d();
            if (TextUtils.isEmpty(strD)) {
                JSONObject jSONObject3 = new JSONObject(strD);
                f91Var = new f91(8);
                hf2VarA = hf2.a(jSONObject3.getJSONObject("global_config"));
                if (hf2VarA != null) {
                    f91Var.b = hf2VarA;
                }
                f91Var2 = f91Var;
                if (f91Var2 == null) {
                    nd2Var.c(((f91) md2Var.b).g());
                } else {
                    md2Var.b = f91Var2;
                }
                pd2VarA = ((f91) md2Var.b).a(qd2.a);
                if (pd2VarA == null) {
                    copyOnWriteArrayList = pd2VarA.f;
                    if (rq0.h(copyOnWriteArrayList)) {
                        j = 0;
                    } else {
                        j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                    }
                    String str5 = ze2.a;
                    if (j < 30000) {
                        j = 30000;
                    }
                    ze2.o = j;
                }
            } else {
                if (f91Var2 == null) {
                    nd2Var.c(((f91) md2Var.b).g());
                } else {
                    md2Var.b = f91Var2;
                }
                pd2VarA = ((f91) md2Var.b).a(qd2.a);
                if (pd2VarA == null) {
                    copyOnWriteArrayList = pd2VarA.f;
                    if (rq0.h(copyOnWriteArrayList)) {
                        j = 0;
                    } else {
                        j = ((rx1) copyOnWriteArrayList.get(0)).c.l;
                    }
                    String str6 = ze2.a;
                    if (j < 30000) {
                        j = 30000;
                    }
                    ze2.o = j;
                }
            }
        } catch (Exception e3) {
            cc2.c(Log.getStackTraceString(e3));
        }
        ld2VarF2.b = true;
        ac2 ac2VarI2 = ac2.i((Context) this.a);
        uq1 uq1Var2 = new uq1(23);
        ac2VarI2.getClass();
        try {
            ((rc2) ac2VarI2.c).l(uq1Var2);
        } catch (oc2 e4) {
            int i3 = oc2.c;
            gf2.b.a(e4);
        }
        i = qd2.a;
        if (i != 0) {
            ze2.r = ld2.f().a(i, "page_view", 1.0f) == 0;
        }
        if (sc2.h((Context) this.a) || !I()) {
            cc2.f("%s", "Dcs unavailable because of not support or conf disable");
        } else {
            String str7 = ze2.a;
            cc2.f("%s", "Dcs available");
            H();
        }
        kv.M((Context) this.a, od2.a, new ri2(this));
        Handler handler2 = (Handler) this.b;
        handler2.postDelayed(new i4(handler2, 22), 7200000L);
        try {
            dc2VarA = dc2.a((Context) this.a);
            while (r2.hasNext()) {
                String str8 = "first_page_enter_" + num;
                if (((SharedPreferences) dc2VarA.a) == null) {
                    dc2VarA.a = dc2VarA.k((Context) dc2VarA.b);
                }
                sharedPreferences = (SharedPreferences) dc2VarA.a;
                if (sharedPreferences == null && sharedPreferences.contains(str8)) {
                    this.f.put(num.intValue(), dc2VarA.n(str8));
                }
            }
            File filesDir2 = ((Context) this.a).getFilesDir();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(filesDir2);
            String str9 = File.separator;
            sb2.append(str9);
            sb2.append(ze2.j);
            file = new File(sb2.toString());
            file2 = new File(filesDir2 + str9 + ze2.k);
            if (file.exists()) {
                list = file.list();
                if (list == null && list.length != 0) {
                    this.c = true;
                } else if (file.delete()) {
                    cc2.b("%s", "dataFile deleted");
                }
            }
            if (file2.exists()) {
                nj2.e((Context) this.a, file2.getPath());
            }
        } catch (Exception e5) {
            cc2.b("%s", e5.getMessage());
            gf2.b.a(new oc2("handleInit", e5));
        }
        Message messageObtainMessage2 = ((Handler) this.b).obtainMessage(502);
        messageObtainMessage2.arg1 = 1;
        ((Handler) this.b).sendMessageDelayed(messageObtainMessage2, 3000L);
        this.d = ((hf2) ((f91) ld2.f().a.b).b).p * 1000;
    }

    @Override // defpackage.h8
    public final void c(Message message, long j) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            if (j > 0) {
                handler.removeMessages(message.what);
            }
            ((Handler) this.b).sendMessageDelayed(message, j);
        }
    }

    @Override // defpackage.h8
    public final void d(Runnable runnable) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    @Override // defpackage.h8
    public final void e(Runnable runnable, long j) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        }
    }

    @Override // defpackage.h8
    public final void f(String str, TrackData trackData, long j) {
        dz1 dz1Var = new dz1();
        dz1Var.a = str;
        dz1Var.d = j;
        dz1Var.f = System.currentTimeMillis();
        dz1Var.g = SystemClock.elapsedRealtime();
        dz1Var.i = trackData;
        int i = this.e;
        if (i < 5000) {
            this.e = i + 1;
            Message messageObtainMessage = ((Handler) this.b).obtainMessage(302);
            messageObtainMessage.obj = dz1Var;
            ((Handler) this.b).sendMessage(messageObtainMessage);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0172 A[Catch: Exception -> 0x007c, JSONException -> 0x0150, LOOP:0: B:99:0x016c->B:101:0x0172, LOOP_END, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c7 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f9 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0203 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0218 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0222 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x023b A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x023f A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x024c A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0262 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:3:0x0001, B:21:0x002c, B:23:0x003e, B:25:0x004c, B:29:0x0057, B:31:0x005d, B:32:0x0065, B:39:0x0078, B:42:0x007b, B:45:0x007f, B:46:0x0087, B:50:0x008d, B:52:0x0091, B:59:0x00b9, B:60:0x00c7, B:62:0x00d2, B:64:0x00e2, B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:110:0x01be, B:112:0x01c7, B:114:0x01cb, B:116:0x01cf, B:118:0x01e5, B:120:0x01eb, B:127:0x01ff, B:129:0x0203, B:131:0x0207, B:133:0x020b, B:135:0x0218, B:137:0x0222, B:139:0x0229, B:141:0x0233, B:123:0x01f1, B:125:0x01f9, B:126:0x01fc, B:92:0x0152, B:93:0x0158, B:109:0x01b3, B:82:0x0127, B:142:0x0237, B:144:0x023b, B:146:0x023f, B:147:0x0242, B:149:0x024c, B:151:0x0262, B:152:0x0264, B:54:0x009b, B:56:0x00ac, B:65:0x00e8, B:67:0x00f2, B:69:0x00f7, B:71:0x00fd, B:74:0x0109, B:76:0x010d, B:78:0x0113, B:79:0x011c, B:33:0x0066, B:38:0x0071), top: B:159:0x0001, inners: #2, #3, #4, #5 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x013a A[Catch: Exception -> 0x007c, JSONException -> 0x0150, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0144 A[Catch: Exception -> 0x007c, JSONException -> 0x0150, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152 A[Catch: Exception -> 0x007c, JSONException -> 0x0150, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0158 A[Catch: Exception -> 0x007c, JSONException -> 0x0150, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x0161 A[Catch: Exception -> 0x007c, JSONException -> 0x0150, TryCatch #5 {JSONException -> 0x0150, blocks: (B:83:0x012e, B:85:0x013a, B:87:0x0144, B:89:0x014a, B:94:0x015d, B:96:0x0161, B:98:0x0167, B:99:0x016c, B:101:0x0172, B:102:0x0186, B:104:0x0196, B:106:0x01a3, B:92:0x0152, B:93:0x0158), top: B:167:0x012e, outer: #0 }] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        Context context;
        long j;
        JSONObject jSONObject;
        Object jSONObject2;
        JSONArray jSONArrayNames;
        int i;
        try {
            int i2 = message.what;
            boolean z = true;
            if (i2 == 298) {
                if (message.arg1 == 1) {
                    J();
                }
                if (!((Handler) this.b).hasMessages(299)) {
                    context = (Context) this.a;
                    String str = sc2.a;
                    if (TextUtils.isEmpty(dc2.a(context).n("first_init"))) {
                        String str2 = ze2.a;
                    }
                    Handler handler = (Handler) this.b;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 299));
                    return false;
                }
            } else {
                if (i2 == 299) {
                    K();
                    return false;
                }
                if (i2 == 302) {
                    dz1 dz1Var = (dz1) message.obj;
                    TrackData trackData = dz1Var.i;
                    try {
                        if (dz1Var.a.equals("page_enter")) {
                            WeakReference weakReference = nj2.l;
                            Activity activity = null;
                            if (((weakReference == null || weakReference.get() == null) ? null : (Activity) nj2.l.get()) == null) {
                                try {
                                    jSONObject = trackData.a;
                                    String str3 = ze2.a;
                                    if (jSONObject.has("_eparam")) {
                                        jSONObject2 = jSONObject.get("_eparam");
                                        if ((jSONObject2 instanceof JSONArray) || jSONObject.length() <= 1) {
                                            jSONObject.remove("_eparam");
                                        } else {
                                            jSONObject2 = new JSONObject();
                                        }
                                    } else {
                                        jSONObject2 = new JSONObject();
                                    }
                                    if ((jSONObject2 instanceof JSONObject) && jSONObject.length() > 0) {
                                        jSONArrayNames = jSONObject.names();
                                        for (i = 0; i < jSONArrayNames.length(); i++) {
                                            String string = jSONArrayNames.getString(i);
                                            ((JSONObject) jSONObject2).put(string, jSONObject.get(string));
                                            jSONObject.remove(string);
                                        }
                                    }
                                    JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                                    jSONObject.put("_eparam", jSONObject2);
                                    jSONObject.put("net", bj0.b((Context) this.a));
                                    jSONObject.put("event", dz1Var.a);
                                    dz1Var.b = jSONObject;
                                    dz1Var.c = jSONObject3;
                                    dz1Var.e = trackData.b;
                                } catch (JSONException e) {
                                    cc2.d("Record track exception : %s", e.getMessage());
                                }
                                this.e--;
                                if (this.h && this.i && ze2.y) {
                                    pd2 pd2VarA = ((f91) ld2.f().a.b).a(sc2.a(dz1Var.d));
                                    if (pd2VarA == null || !pd2VarA.b()) {
                                        if (!"ev_athena".equals(dz1Var.a)) {
                                            J();
                                        }
                                        w(dz1Var);
                                    } else {
                                        F(dz1Var);
                                    }
                                } else {
                                    if (!"ev_athena".equals(dz1Var.a)) {
                                        J();
                                    }
                                    w(dz1Var);
                                }
                                if (!this.h && !this.i && ze2.y) {
                                    this.j++;
                                    if (I()) {
                                        j = this.j;
                                        if (j % 20 == 0 && j / 20 <= 3 && sc2.h((Context) this.a)) {
                                            H();
                                        }
                                    }
                                }
                            } else {
                                WeakReference weakReference2 = nj2.l;
                                if (weakReference2 != null && weakReference2.get() != null) {
                                    activity = (Activity) nj2.l.get();
                                }
                                trackData.a(nj2.a(activity), 0, "fromsite");
                                jSONObject = trackData.a;
                                String str4 = ze2.a;
                                if (jSONObject.has("_eparam")) {
                                    jSONObject2 = jSONObject.get("_eparam");
                                    if (jSONObject2 instanceof JSONArray) {
                                        jSONObject.remove("_eparam");
                                    } else {
                                        jSONObject.remove("_eparam");
                                    }
                                } else {
                                    jSONObject2 = new JSONObject();
                                }
                                if (jSONObject2 instanceof JSONObject) {
                                    jSONArrayNames = jSONObject.names();
                                    while (i < jSONArrayNames.length()) {
                                        String string2 = jSONArrayNames.getString(i);
                                        ((JSONObject) jSONObject2).put(string2, jSONObject.get(string2));
                                        jSONObject.remove(string2);
                                    }
                                }
                                JSONObject jSONObject4 = new JSONObject(jSONObject2.toString());
                                jSONObject.put("_eparam", jSONObject2);
                                jSONObject.put("net", bj0.b((Context) this.a));
                                jSONObject.put("event", dz1Var.a);
                                dz1Var.b = jSONObject;
                                dz1Var.c = jSONObject4;
                                dz1Var.e = trackData.b;
                                this.e--;
                                if (this.h) {
                                    if (!"ev_athena".equals(dz1Var.a)) {
                                        J();
                                    }
                                    w(dz1Var);
                                } else {
                                    if (!"ev_athena".equals(dz1Var.a)) {
                                        J();
                                    }
                                    w(dz1Var);
                                }
                                if (!this.h) {
                                    this.j++;
                                    if (I()) {
                                        j = this.j;
                                        if (j % 20 == 0) {
                                            H();
                                        }
                                    }
                                }
                            }
                        } else {
                            jSONObject = trackData.a;
                            String str5 = ze2.a;
                            if (jSONObject.has("_eparam")) {
                                jSONObject2 = jSONObject.get("_eparam");
                                if (jSONObject2 instanceof JSONArray) {
                                    jSONObject.remove("_eparam");
                                } else {
                                    jSONObject.remove("_eparam");
                                }
                            } else {
                                jSONObject2 = new JSONObject();
                            }
                            if (jSONObject2 instanceof JSONObject) {
                                jSONArrayNames = jSONObject.names();
                                while (i < jSONArrayNames.length()) {
                                    String string3 = jSONArrayNames.getString(i);
                                    ((JSONObject) jSONObject2).put(string3, jSONObject.get(string3));
                                    jSONObject.remove(string3);
                                }
                            }
                            JSONObject jSONObject5 = new JSONObject(jSONObject2.toString());
                            jSONObject.put("_eparam", jSONObject2);
                            jSONObject.put("net", bj0.b((Context) this.a));
                            jSONObject.put("event", dz1Var.a);
                            dz1Var.b = jSONObject;
                            dz1Var.c = jSONObject5;
                            dz1Var.e = trackData.b;
                            this.e--;
                            if (this.h) {
                                if (!"ev_athena".equals(dz1Var.a)) {
                                    J();
                                }
                                w(dz1Var);
                            } else {
                                if (!"ev_athena".equals(dz1Var.a)) {
                                    J();
                                }
                                w(dz1Var);
                            }
                            if (!this.h) {
                                this.j++;
                                if (I()) {
                                    j = this.j;
                                    if (j % 20 == 0) {
                                        H();
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        cc2.c(Log.getStackTraceString(e2));
                    }
                } else {
                    if (i2 == 303) {
                        kk0 kk0Var = cc2.a.a;
                        String str6 = ze2.a;
                        kk0Var.getClass();
                        cc2.f("Athena init, SDK Version is [%s]", "1.2.0.0-snowball");
                        L();
                        J();
                        return false;
                    }
                    if (i2 == 308) {
                        try {
                            ld2.f().g();
                            if (ac2.i((Context) this.a) != null) {
                                ac2.i((Context) this.a).o();
                                return false;
                            }
                        } catch (Exception e3) {
                            gf2.b.a(new oc2("handleCleanupData", e3));
                        }
                    } else {
                        if (i2 == 400) {
                            E(message.arg1, (String) message.obj);
                            return false;
                        }
                        if (i2 == 600) {
                            if (message.arg1 == 1) {
                                J();
                            }
                            if (!((Handler) this.b).hasMessages(299)) {
                                context = (Context) this.a;
                                String str7 = sc2.a;
                                if (TextUtils.isEmpty(dc2.a(context).n("first_init"))) {
                                    String str8 = ze2.a;
                                }
                                Handler handler2 = (Handler) this.b;
                                handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 299));
                                return false;
                            }
                        } else {
                            if (i2 == 502) {
                                if (message.arg1 != 1) {
                                    z = false;
                                }
                                D(z);
                                return false;
                            }
                            if (i2 == 503) {
                                if (bc2.c().b(((Long) message.obj).longValue())) {
                                    String str9 = bc2.c().b;
                                    gd2 gd2Var = bc2.c().a;
                                    long j2 = gd2Var != null ? gd2Var.a - gd2Var.b : 0L;
                                    if (j2 > 0 && !TextUtils.isEmpty(str9)) {
                                        ac2 ac2VarI = ac2.i((Context) this.a);
                                        synchronized (ac2VarI) {
                                            try {
                                                ((rc2) ac2VarI.c).p(str9, j2);
                                            } catch (oc2 e4) {
                                                int i3 = oc2.c;
                                                gf2.b.a(e4);
                                            }
                                        }
                                    }
                                }
                                v(this.d, false);
                            }
                        }
                    }
                }
            }
        } catch (Exception e5) {
            String str10 = sc2.a;
            String str11 = ze2.a;
            if (TextUtils.equals("online", "test")) {
                cc2.d("Worker handle message exception : %s", e5.getMessage());
            }
            gf2.b.a(new oc2("handleMessage", e5));
        }
        return false;
    }

    @Override // defpackage.h8
    public final void j() {
        v(this.d, true);
    }

    public final dz1 u(TrackDataWrapper trackDataWrapper) {
        Object jSONObject;
        dz1 dz1Var = new dz1();
        String str = trackDataWrapper.a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        dz1Var.a = str;
        dz1Var.d = trackDataWrapper.c;
        dz1Var.f = System.currentTimeMillis();
        dz1Var.g = SystemClock.elapsedRealtime();
        TrackData trackData = trackDataWrapper.b;
        try {
            JSONObject jSONObject2 = trackData.a;
            String str2 = ze2.a;
            if (jSONObject2.has("_eparam")) {
                jSONObject = jSONObject2.get("_eparam");
                if (!(jSONObject instanceof JSONArray) || jSONObject2.length() <= 1) {
                    jSONObject2.remove("_eparam");
                } else {
                    jSONObject = new JSONObject();
                }
            } else {
                jSONObject = new JSONObject();
            }
            if ((jSONObject instanceof JSONObject) && jSONObject2.length() > 0) {
                JSONArray jSONArrayNames = jSONObject2.names();
                for (int i = 0; i < jSONArrayNames.length(); i++) {
                    String string = jSONArrayNames.getString(i);
                    ((JSONObject) jSONObject).put(string, jSONObject2.get(string));
                    jSONObject2.remove(string);
                }
            }
            JSONObject jSONObject3 = new JSONObject(jSONObject.toString());
            jSONObject2.put("_eparam", jSONObject);
            jSONObject2.put("net", bj0.b((Context) this.a));
            jSONObject2.put("event", dz1Var.a);
            dz1Var.b = jSONObject2;
            dz1Var.c = jSONObject3;
            dz1Var.e = trackData.b;
            ld2 ld2VarF = ld2.f();
            int i2 = (int) dz1Var.d;
            String str3 = dz1Var.a;
            pd2 pd2VarA = ((f91) ld2VarF.a.b).a(i2);
            rx1 rx1Var = null;
            if (pd2VarA != null) {
                for (rx1 rx1Var2 : pd2VarA.f) {
                    if (TextUtils.equals(rx1Var2.b, str3)) {
                        rx1Var = rx1Var2;
                        break;
                    }
                }
            }
            if (rx1Var != null) {
                dz1Var.d = rx1Var.a;
            }
            return dz1Var;
        } catch (JSONException e) {
            cc2.d("Convert to Track exception : %s", e.getMessage());
            return dz1Var;
        }
    }

    public final void v(long j, boolean z) {
        if (((Handler) this.b).hasMessages(298)) {
            return;
        }
        Message messageObtainMessage = ((Handler) this.b).obtainMessage(298);
        if (z) {
            messageObtainMessage.arg1 = 1;
            ((Handler) this.b).sendMessage(messageObtainMessage);
        } else {
            messageObtainMessage.arg1 = 0;
            ((Handler) this.b).sendMessageDelayed(messageObtainMessage, j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    public final void w(dz1 dz1Var) throws Throwable {
        rx1 rx1VarE;
        int i;
        int i2;
        int iE;
        int iA = sc2.a(dz1Var.d);
        rx1 rx1Var = null;
        if (!BuildConfig.FLAVOR.equals((String) this.f.get(iA, null)) && "page_enter".equals(dz1Var.a)) {
            try {
                String string = new JSONObject().put("event", dz1Var.a).put("ts", dz1Var.f).put("tid", dz1Var.d).put("net", dz1Var.b.getInt("net")).put("eparam", dz1Var.b.getJSONObject("_eparam").toString()).toString();
                this.f.put(iA, string);
                dc2.a((Context) this.a).l("first_page_enter_" + iA, string);
                cc2.b("save [%d] fpe to sp : %s", Integer.valueOf(iA), string);
                return;
            } catch (Exception e) {
                cc2.d("saveFpeForAppId exception : %s", e.getMessage());
            }
        }
        String str = ze2.a;
        String string2 = dz1Var.b.toString();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appid", sc2.a(dz1Var.d));
            jSONObject.put("event", dz1Var.a);
            jSONObject.put("ts", dz1Var.f);
            jSONObject.put("params", dz1Var.b);
            cc2.f("track event:%s", jSONObject.toString());
        } catch (Exception e2) {
            cc2.d("handleSaveData exception:%s", e2.getMessage());
        }
        if (string2.length() >= 716800) {
            cc2.d("track [%d]-[%s], save2DB failed due to eparam out of limit [%d]", Long.valueOf(dz1Var.d), dz1Var.a, 716800);
            return;
        }
        if (G(dz1Var)) {
            if (dz1Var.d > 9999) {
                rx1VarE = ld2.f().e(dz1Var.d);
            } else {
                ld2 ld2VarF = ld2.f();
                int i3 = (int) dz1Var.d;
                String str2 = dz1Var.a;
                pd2 pd2VarA = ((f91) ld2VarF.a.b).a(i3);
                if (pd2VarA != null) {
                    for (rx1 rx1Var2 : pd2VarA.f) {
                        if (TextUtils.equals(rx1Var2.b, str2)) {
                            rx1Var = rx1Var2;
                            break;
                        }
                    }
                }
                if (rx1Var != null) {
                    dz1Var.d = rx1Var.a;
                }
                rx1VarE = rx1Var;
            }
            int iB = dz1Var.d > 9999 ? ld2.f().b(dz1Var.d, dz1Var.i.c) : ld2.f().a((int) dz1Var.d, dz1Var.a, dz1Var.i.c);
            if (iB != 0) {
                cc2.d("recordTrackFailed reason : %d", Integer.valueOf(iB));
                return;
            }
            if (rx1VarE != null) {
                long j = dz1Var.f;
                long j2 = rx1VarE.c.m;
                if (j2 != 0 && j < rx1VarE.d + j2) {
                    cc2.d("save [%d]-[%s] to DB failed due to limit in one-life-cycle", Long.valueOf(dz1Var.d), dz1Var.a);
                    iE = 0;
                } else {
                    bc2.c().a(dz1Var);
                    ac2 ac2VarI = ac2.i((Context) this.a);
                    ac2VarI.getClass();
                    i = dz1Var.e;
                    if (i != 1 || i == 2) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    try {
                        iE = ((rc2) ac2VarI.c).e(dz1Var, i2);
                    } catch (oc2 e3) {
                        int i4 = oc2.c;
                        gf2.b.a(e3);
                        iE = 0;
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("tid", dz1Var.d);
                        jSONObject2.put("event", dz1Var.a);
                        jSONObject2.put("ts", dz1Var.f);
                        jSONObject2.put("db_count", iE);
                        cc2.f("save event to DB:%s", jSONObject2.toString());
                    } catch (Exception e4) {
                        cc2.d("saveTrack2DB exception:%s", e4.getMessage());
                    }
                }
            } else {
                bc2.c().a(dz1Var);
                ac2 ac2VarI2 = ac2.i((Context) this.a);
                ac2VarI2.getClass();
                i = dz1Var.e;
                if (i != 1) {
                    i2 = 1;
                } else {
                    i2 = 1;
                }
                iE = ((rc2) ac2VarI2.c).e(dz1Var, i2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("tid", dz1Var.d);
                jSONObject3.put("event", dz1Var.a);
                jSONObject3.put("ts", dz1Var.f);
                jSONObject3.put("db_count", iE);
                cc2.f("save event to DB:%s", jSONObject3.toString());
            }
            int iF = -1;
            if (iE == -1) {
                cc2.c("DB_UPDATE_ERROR");
            } else if (iE == -2) {
                cc2.f("save [%d]-[%s] to DB failed due to DB_OUT_OF_MEMORY_ERROR", Long.valueOf(dz1Var.d), dz1Var.a);
                ac2 ac2VarI3 = ac2.i((Context) this.a);
                uq1 uq1Var = new uq1(24);
                ac2VarI3.getClass();
                try {
                    iF = ((rc2) ac2VarI3.c).f(uq1Var);
                } catch (oc2 e5) {
                    int i5 = oc2.c;
                    gf2.b.a(e5);
                }
                cc2.f("Clean up DB due to DB_OUT_OF_MEMORY_ERROR, Count [%d]", Integer.valueOf(iF));
            }
            if ("ev_athena".equals(dz1Var.a)) {
                return;
            }
            if (iE > 0) {
                if (rx1VarE != null) {
                    rx1VarE.d = dz1Var.f;
                    rx1VarE.c.k = iE;
                }
                if ("device".equals(dz1Var.a) && 9999 == sc2.a(dz1Var.d)) {
                    md2 md2Var = ld2.f().a;
                    hf2 hf2Var = (hf2) ((f91) md2Var.b).b;
                    hf2Var.j = nj2.J(hc.h);
                    hf2Var.i = true;
                    ((nd2) md2Var.a).c(((f91) md2Var.b).g());
                }
            }
            v(this.d, false);
        }
    }

    public final void x(Location location) {
        boolean z;
        String str;
        String strSubstring;
        kd2 kd2Var;
        kd2 kd2Var2;
        String string;
        Context context = (Context) this.a;
        TrackData trackData = new TrackData();
        kd2 kd2Var3 = null;
        boolean z2 = true;
        if (location != null) {
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(location.getLongitude());
            RoundingMode roundingMode = RoundingMode.HALF_UP;
            double dDoubleValue = bigDecimalValueOf.setScale(2, roundingMode).doubleValue();
            double dDoubleValue2 = BigDecimal.valueOf(location.getLatitude()).setScale(2, roundingMode).doubleValue();
            try {
                trackData.a.put("_".concat("lng"), dDoubleValue);
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
            }
            try {
                trackData.a.put("_".concat("lat"), dDoubleValue2);
            } catch (Exception e2) {
                cc2.c(Log.getStackTraceString(e2));
            }
            try {
                zb2 zb2VarA = zb2.a(dDoubleValue2, dDoubleValue, ((hf2) ((f91) ld2.f().a.b).b).o);
                if (zb2VarA.b % 5 == 0) {
                    StringBuilder sb = new StringBuilder();
                    long j = zb2VarA.a;
                    int iCeil = (int) Math.ceil(((double) zb2VarA.b) / 5.0d);
                    for (int i = 0; i < iCeil; i++) {
                        sb.append(zb2.c[(int) (((-576460752303423488L) & j) >>> 59)]);
                        j <<= 5;
                    }
                    string = sb.toString();
                } else {
                    uq1.q("Cannot convert a geohash to base32 if the precision is not a multiple of 5.");
                    string = null;
                }
                trackData.b(0, "geono", string);
            } catch (Exception e3) {
                cc2.c(Log.getStackTraceString(e3));
            }
            z = true;
        } else {
            trackData.a(0, 0, "lng");
            trackData.a(0, 0, "lat");
            z = false;
        }
        if (sc2.e(context, "android.permission.ACCESS_FINE_LOCATION")) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            String networkOperator = telephonyManager.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator)) {
                str = BuildConfig.FLAVOR;
                strSubstring = str;
            } else {
                String strSubstring2 = networkOperator.substring(0, 3);
                strSubstring = networkOperator.substring(3);
                str = strSubstring2;
            }
            List<CellInfo> allCellInfo = telephonyManager.getAllCellInfo();
            ArrayList arrayList = new ArrayList();
            if (allCellInfo != null) {
                for (CellInfo cellInfo : allCellInfo) {
                    if (cellInfo instanceof CellInfoGsm) {
                        CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
                        CellIdentityGsm cellIdentity = cellInfoGsm.getCellIdentity();
                        int asuLevel = cellInfoGsm.getCellSignalStrength().getAsuLevel();
                        if (cellIdentity.getCid() > 0 && cellIdentity.getLac() > 0 && asuLevel != 99) {
                            if (cellIdentity.getMcc() == Integer.MAX_VALUE || cellIdentity.getMnc() == Integer.MAX_VALUE) {
                                kd2Var = new kd2(cellIdentity.getCid(), cellIdentity.getLac(), asuLevel, str, strSubstring, cellInfo.isRegistered());
                                kd2Var3 = kd2Var;
                            } else {
                                kd2Var2 = new kd2(cellIdentity.getCid(), cellIdentity.getLac(), asuLevel, sc2.b(cellIdentity.getMcc()), sc2.b(cellIdentity.getMnc()), cellInfo.isRegistered());
                                kd2Var3 = kd2Var2;
                            }
                        }
                    } else if (cellInfo instanceof CellInfoWcdma) {
                        CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
                        CellIdentityWcdma cellIdentity2 = cellInfoWcdma.getCellIdentity();
                        int asuLevel2 = cellInfoWcdma.getCellSignalStrength().getAsuLevel();
                        if (cellIdentity2.getCid() > 0 && cellIdentity2.getLac() > 0 && asuLevel2 != 99) {
                            if (cellIdentity2.getMcc() == Integer.MAX_VALUE || cellIdentity2.getMnc() == Integer.MAX_VALUE) {
                                kd2Var = new kd2(cellIdentity2.getCid(), cellIdentity2.getLac(), asuLevel2, str, strSubstring, cellInfo.isRegistered());
                                kd2Var3 = kd2Var;
                            } else {
                                kd2Var2 = new kd2(cellIdentity2.getCid(), cellIdentity2.getLac(), asuLevel2, sc2.b(cellIdentity2.getMcc()), sc2.b(cellIdentity2.getMnc()), cellInfo.isRegistered());
                                kd2Var3 = kd2Var2;
                            }
                        }
                    } else if (cellInfo instanceof CellInfoLte) {
                        CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
                        CellIdentityLte cellIdentity3 = cellInfoLte.getCellIdentity();
                        int asuLevel3 = cellInfoLte.getCellSignalStrength().getAsuLevel();
                        if (cellIdentity3.getCi() > 0 && cellIdentity3.getTac() > 0 && asuLevel3 != 99) {
                            if (cellIdentity3.getMcc() == Integer.MAX_VALUE || cellIdentity3.getMnc() == Integer.MAX_VALUE) {
                                kd2Var = new kd2(cellIdentity3.getCi(), cellIdentity3.getTac(), asuLevel3, str, strSubstring, cellInfo.isRegistered());
                                kd2Var3 = kd2Var;
                            } else {
                                kd2Var2 = new kd2(cellIdentity3.getCi(), cellIdentity3.getTac(), asuLevel3, sc2.b(cellIdentity3.getMcc()), sc2.b(cellIdentity3.getMnc()), cellInfo.isRegistered());
                                kd2Var3 = kd2Var2;
                            }
                        }
                    }
                    if (kd2Var3 != null && !arrayList.contains(kd2Var3)) {
                        arrayList.add(kd2Var3);
                    }
                    if (arrayList.size() == 10) {
                        break;
                    }
                }
            }
            Collections.sort(arrayList, new rs(11));
            JSONArray jSONArray = new JSONArray();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                kd2 kd2Var4 = (kd2) arrayList.get(i2);
                try {
                    jSONArray.put(new JSONObject().put("cellid", kd2Var4.a()).put("level", kd2Var4.e));
                } catch (JSONException e4) {
                    cc2.d("%s", Log.getStackTraceString(e4));
                }
                i2 = i3;
            }
            if (jSONArray.length() > 0) {
                trackData.e("cellidlist", jSONArray.toString());
            } else {
                trackData.b(0, "cellidlist", BuildConfig.FLAVOR);
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            hc.g(9999L).i("location", trackData, 9999L);
        }
    }

    public final void y(MMKV mmkv) throws Throwable {
        try {
            String[] strArrAllKeys = mmkv.allKeys();
            if (strArrAllKeys != null && strArrAllKeys.length >= 1) {
                ArrayList arrayList = new ArrayList();
                String[] strArr = new String[100];
                for (int i = 0; i < strArrAllKeys.length; i++) {
                    TrackDataWrapper trackDataWrapper = (TrackDataWrapper) mmkv.decodeParcelable(strArrAllKeys[i], TrackDataWrapper.class);
                    if (trackDataWrapper != null && arrayList.size() < 100) {
                        arrayList.add(u(trackDataWrapper));
                        strArr[i] = strArrAllKeys[i];
                    }
                }
                if (!arrayList.isEmpty()) {
                    B(arrayList);
                    mmkv.removeValuesForKeys(strArr);
                }
                if (mmkv.allKeys() == null || mmkv.allKeys().length <= 0) {
                    return;
                }
                y(mmkv);
            }
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
        }
    }
}
