package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.data.AppIdData;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nf2 extends nc2 {
    public final boolean c;
    public final String d;
    public final ArrayList e;
    public final SparseArray f;
    public boolean i;

    public nf2(Handler handler, String str, ArrayList arrayList, boolean z, SparseArray sparseArray) {
        super(handler);
        this.i = false;
        this.d = str;
        this.e = arrayList;
        this.c = z;
        this.f = sparseArray;
    }

    public static void f(pd2 pd2Var, String str, boolean z) {
        int iAbs;
        if (z) {
            try {
                String strL = sc2.a == null ? BuildConfig.FLAVOR : sc2.a;
                if (TextUtils.isEmpty(strL)) {
                    strL = nj2.l(hc.h);
                }
                iAbs = (TextUtils.isEmpty(strL) || strL.hashCode() == 0) ? 1800000 : (Math.abs(strL.hashCode()) % 30) * 60000;
            } catch (Exception e) {
                cc2.d("Handle pull config exception after upload : %s", e.getMessage());
                oc2.a("handlePullConfig", e);
                return;
            }
        } else {
            iAbs = 0;
        }
        pd2Var.g = str;
        pd2Var.d = 0L;
        pd2Var.c(System.currentTimeMillis() + ((long) iAbs));
        ac2.i(hc.h).k(pd2Var, false);
    }

    public static void h(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (jSONObject != null) {
            if (jSONObject3 != null) {
                try {
                    if (jSONObject3.length() > 0) {
                        JSONObject jSONObject4 = new JSONObject();
                        if (jSONObject2.has("_ext")) {
                            jSONObject4 = jSONObject2.getJSONObject("_ext");
                        }
                        Iterator<String> itKeys = jSONObject3.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            String str = "_" + next;
                            Object obj = jSONObject3.get(next);
                            if (!jSONObject4.has(str)) {
                                jSONObject4.putOpt(str, obj);
                            }
                        }
                        int length = jSONObject4.toString().getBytes(StandardCharsets.UTF_8).length;
                        if (length > 2000) {
                            String str2 = String.format(Locale.getDefault(), "custom param is too long,limit is 2000 bytes(now is %d bytes)", Integer.valueOf(length));
                            cc2.c(str2);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("errorMsg", str2);
                            jSONObject2.put("_ext", jSONObject5);
                        } else {
                            jSONObject2.put("_ext", jSONObject4);
                        }
                    }
                } catch (Exception e) {
                    cc2.d("Insert common params exception : %s", e.getMessage());
                    return;
                }
            }
            jSONObject.put("eparam", jSONObject2.toString());
        }
    }

    @Override // defpackage.nc2
    public final void a() throws Throwable {
        int iNextInt;
        String str = this.d;
        bc2 bc2VarC = bc2.c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (bc2VarC.c) {
            gd2 gd2Var = bc2VarC.a;
            jCurrentTimeMillis = (gd2Var.a + jElapsedRealtime) - gd2Var.b;
        }
        long j = jCurrentTimeMillis;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        AppIdData appIdData = null;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            AppIdData appIdData2 = (AppIdData) obj;
            if (!TextUtils.isEmpty(appIdData2.c) && TextUtils.equals(appIdData2.f, str)) {
                if (appIdData == null) {
                    i2++;
                    appIdData = appIdData2;
                } else if (!TextUtils.equals(appIdData.c, appIdData2.c)) {
                    i2++;
                    break;
                }
            }
        }
        if (i2 != 1) {
            if (i2 > 1) {
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    AppIdData appIdData3 = (AppIdData) obj2;
                    if (!TextUtils.isEmpty(appIdData3.c) && TextUtils.equals(appIdData3.f, str)) {
                        arrayList2.add(appIdData3);
                    }
                }
                ac2.i(hc.h).n(arrayList2);
            }
            appIdData = null;
        }
        hf2 hf2Var = (hf2) ((f91) ld2.f().a.b).b;
        hf2Var.getClass();
        try {
            int iIntValue = ((Integer) hf2Var.m.first).intValue();
            int iIntValue2 = ((Integer) hf2Var.m.second).intValue();
            String str2 = sc2.a;
            iNextInt = new Random().nextInt((iIntValue2 - iIntValue) + 1) + iIntValue;
        } catch (Exception e) {
            e.printStackTrace();
            iNextInt = 6;
        }
        long j2 = ((long) iNextInt) * 1000;
        if (appIdData != null) {
            Pair pairD = d(appIdData.c, 0L);
            List list = (List) pairD.second;
            if (rq0.l(list)) {
                g(list, (String) pairD.first, j, j2, appIdData.d);
                return;
            }
            return;
        }
        Pair pairD2 = d(null, j);
        String str3 = (String) pairD2.first;
        List list2 = (List) pairD2.second;
        if (rq0.l(list2)) {
            g(list2, str3, j, j2, 0);
        }
    }

    @Override // defpackage.nc2
    public final String c() {
        String str = this.d;
        if (TextUtils.isEmpty(str)) {
            return "Default";
        }
        try {
            String[] strArrSplit = str.split("//");
            if (strArrSplit.length > 0) {
                return strArrSplit[1].split("\\.")[0];
            }
        } catch (Exception e) {
            cc2.d("get domain exception : %s", e.getMessage());
        }
        return "Default";
    }

    public final Pair d(String str, long j) {
        String string;
        qc2 qc2VarG;
        NetworkCapabilities networkCapabilities;
        NetworkCapabilities networkCapabilities2;
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        loop0: while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            AppIdData appIdData = (AppIdData) obj;
            if (TextUtils.equals(appIdData.f, this.d)) {
                pd2 pd2VarA = ((f91) ld2.f().a.b).a(appIdData.a);
                CopyOnWriteArrayList<rx1> copyOnWriteArrayList = pd2VarA != null ? pd2VarA.f : null;
                if (rq0.l(copyOnWriteArrayList)) {
                    int i4 = i2;
                    int i5 = i;
                    for (rx1 rx1Var : copyOnWriteArrayList) {
                        qb2 qb2Var = rx1Var.c;
                        long j2 = qb2Var.i;
                        long jB = qb2Var.b();
                        if (j2 != -1 && jB != -1) {
                            boolean z = Math.abs(j - j2) >= jB;
                            int i6 = qb2Var.j;
                            boolean z2 = i6 > 0 && i6 <= qb2Var.k;
                            int i7 = qb2Var.e;
                            if (i7 != 0) {
                                if (i7 == 1) {
                                    Context context = hc.h;
                                    try {
                                        if (bj0.d(context)) {
                                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                                            Network activeNetwork = connectivityManager.getActiveNetwork();
                                            if (!((activeNetwork == null || (networkCapabilities2 = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) ? false : networkCapabilities2.hasTransport(1))) {
                                                Network activeNetwork2 = connectivityManager.getActiveNetwork();
                                                if (!((activeNetwork2 == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork2)) == null) ? false : networkCapabilities.hasTransport(3))) {
                                                    continue;
                                                }
                                            }
                                        }
                                    } catch (Exception unused) {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                            if (z || z2) {
                                if (this.c) {
                                    try {
                                        ac2.i(hc.h).j(rx1Var.a, new uq1(26));
                                    } catch (Exception e) {
                                        cc2.d("Upload 1.x events exception : %s", e.getMessage());
                                        oc2.a("checkUploadFile", e);
                                    }
                                }
                                ac2 ac2VarI = ac2.i(hc.h);
                                long j3 = rx1Var.a;
                                int i8 = 921600 - i4;
                                int i9 = 2000 - i5;
                                synchronized (ac2VarI) {
                                    try {
                                        qc2VarG = ((rc2) ac2VarI.c).g(j3, j, str, i8, i9);
                                    } catch (oc2 e2) {
                                        int i10 = oc2.c;
                                        gf2.b.a(e2);
                                        qc2VarG = null;
                                    }
                                }
                                if (qc2VarG != null && (linkedList.contains(appIdData) || linkedList.add(appIdData))) {
                                    appIdData.e.add(qc2VarG);
                                    i5 += qc2VarG.f;
                                    i4 += qc2VarG.g;
                                    if (i5 >= 2000 || i4 >= 921600) {
                                        cc2.f("Packet size out of limit, packetSize [%d], eventCount [%d]", Integer.valueOf(i4), Integer.valueOf(i5));
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                    i = i5;
                    i2 = i4;
                } else {
                    cc2.d("Appid [%d] checkUpload tid config is null.", Integer.valueOf(appIdData.a));
                }
                if (rq0.h(appIdData.e)) {
                    ac2.i(hc.h).n(Collections.singletonList(appIdData));
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            Random random = new Random();
            StringBuilder sb = new StringBuilder();
            for (int i11 = 0; i11 < 8; i11++) {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(36)));
            }
            string = sb.toString();
            ac2 ac2VarI2 = ac2.i(hc.h);
            synchronized (ac2VarI2) {
                try {
                    ((rc2) ac2VarI2.c).r(linkedList, string);
                } catch (oc2 e3) {
                    int i12 = oc2.c;
                    gf2.b.a(e3);
                }
            }
        } else {
            string = str;
        }
        return new Pair(string, linkedList);
    }

    public final void e(pb2 pb2Var, List list, long j, int i) {
        boolean zV;
        rx1 rx1VarE;
        hf2 hf2Var = (hf2) ((f91) ld2.f().a.b).b;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(TextUtils.isEmpty(hf2Var.n) ? "Asia/Shanghai" : hf2Var.n));
        String str = calendar.get(1) + "-" + (calendar.get(2) + 1) + "-" + calendar.get(5);
        ac2 ac2VarI = ac2.i(hc.h);
        uq1 uq1Var = new uq1(27);
        synchronized (ac2VarI) {
            try {
                ((rc2) ac2VarI.c).u(list, j, str, uq1Var);
            } catch (oc2 e) {
                int i2 = oc2.c;
                gf2.b.a(e);
            }
        }
        if (sc2.g(hc.h)) {
            dc2.a(hc.h).l("first_launch", "false");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", i);
            jSONObject.put("code", pb2Var.a);
            jSONObject.put("message", pb2Var.b);
            jSONObject.put("app", pb2Var.c);
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ArrayList arrayList = ((AppIdData) it.next()).e;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    qc2 qc2Var = (qc2) obj;
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("tid", qc2Var.a);
                    jSONObject2.put("event", qc2Var.b);
                    jSONObject2.put("count", qc2Var.f);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("events", jSONArray);
            cc2.f("<-- upload success:%s", jSONObject.toString());
        } catch (Exception e2) {
            cc2.d("exception when print upload events success: ", e2.getMessage());
        }
        if (this.i) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i4 = ((AppIdData) it2.next()).a;
                if (this.f.indexOfKey(i4) >= 0) {
                    this.f.put(i4, BuildConfig.FLAVOR);
                    dc2.a(hc.h).l("first_page_enter_" + i4, BuildConfig.FLAVOR);
                }
            }
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ArrayList arrayList2 = ((AppIdData) it3.next()).e;
            int size2 = arrayList2.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList2.get(i5);
                i5++;
                qc2 qc2Var2 = (qc2) obj2;
                if (qc2Var2.h && (rx1VarE = ld2.f().e(qc2Var2.a)) != null) {
                    qb2 qb2Var = rx1VarE.c;
                    qb2Var.i = j;
                    qb2Var.k = 0;
                }
            }
        }
        ArrayList arrayList3 = pb2Var.c;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                int i7 = i6 + 1;
                ob2 ob2Var = (ob2) arrayList3.get(i6);
                pd2 pd2VarA = ((f91) ld2.f().a.b).a(ob2Var.a);
                if (pd2VarA != null && !TextUtils.equals(pd2VarA.g, ob2Var.a())) {
                    int i8 = ob2Var.b;
                    if (i8 == 1) {
                        String strA = ob2Var.a();
                        try {
                            ac2 ac2VarI2 = ac2.i(hc.h);
                            int i9 = pd2VarA.a;
                            synchronized (ac2VarI2) {
                                try {
                                    try {
                                        zV = ((rc2) ac2VarI2.c).v(i9);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (oc2 e3) {
                                    int i10 = oc2.c;
                                    gf2.b.a(e3);
                                    zV = false;
                                }
                            }
                            if (zV) {
                                pd2VarA.g = strA;
                                pd2VarA.d = 0L;
                                pd2VarA.c(-1L);
                                ac2.i(hc.h).k(pd2VarA, false);
                            }
                        } catch (Exception e4) {
                            cc2.d("Handle cleanup data exception : %s", e4.getMessage());
                            oc2.a("handleCleanupData", e4);
                        }
                    } else if (i8 == 2) {
                        f(pd2VarA, ob2Var.a(), true);
                    } else if (i8 == 3) {
                        f(pd2VarA, ob2Var.a(), false);
                    }
                }
                i6 = i7;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x04fa */
    /* JADX WARN: Code duplicated, block: B:286:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:288:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:303:0x0523  */
    /* JADX WARN: Code duplicated, block: B:305:0x0527  */
    /* JADX WARN: Code duplicated, block: B:306:0x052a  */
    /* JADX WARN: Code duplicated, block: B:307:0x052d  */
    /* JADX WARN: Code duplicated, block: B:310:0x0539  */
    /* JADX WARN: Code duplicated, block: B:319:0x058d A[Catch: Exception -> 0x05c7, TryCatch #11 {Exception -> 0x05c7, blocks: (B:312:0x0564, B:314:0x056b, B:316:0x0572, B:317:0x0587, B:319:0x058d, B:321:0x059c), top: B:417:0x0564 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x059c A[Catch: Exception -> 0x05c7, TRY_LEAVE, TryCatch #11 {Exception -> 0x05c7, blocks: (B:312:0x0564, B:314:0x056b, B:316:0x0572, B:317:0x0587, B:319:0x058d, B:321:0x059c), top: B:417:0x0564 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x05d4 A[Catch: Exception -> 0x05c5, TRY_ENTER, TRY_LEAVE, TryCatch #14 {Exception -> 0x05c5, blocks: (B:323:0x05ac, B:325:0x05b3, B:327:0x05ba, B:332:0x05ca, B:335:0x05d4, B:337:0x05da, B:340:0x05e9), top: B:423:0x05ac }] */
    /* JADX WARN: Code duplicated, block: B:339:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:347:0x064b  */
    /* JADX WARN: Code duplicated, block: B:354:0x066a  */
    /* JADX WARN: Code duplicated, block: B:359:0x0678  */
    /* JADX WARN: Code duplicated, block: B:360:0x067b A[Catch: Exception -> 0x0695, TRY_ENTER, TryCatch #0 {Exception -> 0x0695, blocks: (B:348:0x0654, B:350:0x065d, B:352:0x0666, B:355:0x066b, B:357:0x0670, B:361:0x067d, B:363:0x0682, B:365:0x0689, B:360:0x067b), top: B:397:0x0654 }] */
    /* JADX WARN: Code duplicated, block: B:389:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:397:0x0654 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x06ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x06ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x062e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x070a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:453:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00eb A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0101  */
    /* JADX WARN: Code duplicated, block: B:61:0x010c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0111  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:67:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x012a A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0132 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0138 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0140 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0146 A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x014e A[Catch: Exception -> 0x00e8, TryCatch #10 {Exception -> 0x00e8, blocks: (B:23:0x0094, B:25:0x009c, B:28:0x00a8, B:31:0x00ae, B:33:0x00b6, B:36:0x00bc, B:38:0x00c4, B:41:0x00ca, B:43:0x00d2, B:46:0x00d8, B:49:0x00e1, B:80:0x0153, B:52:0x00eb, B:54:0x00f1, B:56:0x00fd, B:59:0x0103, B:68:0x011c, B:70:0x0124, B:71:0x012a, B:73:0x0132, B:74:0x0138, B:76:0x0140, B:77:0x0146, B:79:0x014e, B:55:0x00f7), top: B:415:0x0094 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v45, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v78, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r24v6 */
    /* JADX WARN: Type inference failed for: r24v7 */
    /* JADX WARN: Type inference failed for: r24v8 */
    /* JADX WARN: Type inference failed for: r24v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r3v78 */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r3v84 */
    /* JADX WARN: Type inference failed for: r3v85 */
    /* JADX WARN: Type inference failed for: r3v86 */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(java.util.List r29, java.lang.String r30, long r31, long r33, int r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf2.g(java.util.List, java.lang.String, long, long, int):void");
    }
}
