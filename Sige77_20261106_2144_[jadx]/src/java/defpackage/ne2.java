package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.fm.openinstall.Configuration;
import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ne2 extends je2 {
    public final Context c;
    public final fc2 d;
    public final xb2 e;
    public final p11 f;
    public final WeakReference i;
    public h01 v;

    public ne2(qp0 qp0Var, WeakReference weakReference) {
        super(qp0Var, 1);
        this.i = weakReference;
        Context context = ue2.j.a;
        this.c = context;
        this.e = new xb2();
        this.d = new fc2();
        this.f = new p11(context, 13);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x025a  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:145:0x0302  */
    /* JADX WARN: Code duplicated, block: B:146:0x030a  */
    /* JADX WARN: Code duplicated, block: B:148:0x0310  */
    /* JADX WARN: Code duplicated, block: B:151:0x031b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0323  */
    /* JADX WARN: Code duplicated, block: B:156:0x0331 A[Catch: all -> 0x033b, TryCatch #20 {all -> 0x033b, blocks: (B:154:0x032b, B:156:0x0331, B:157:0x0336), top: B:290:0x032b }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0336 A[Catch: all -> 0x033b, TRY_LEAVE, TryCatch #20 {all -> 0x033b, blocks: (B:154:0x032b, B:156:0x0331, B:157:0x0336), top: B:290:0x032b }] */
    /* JADX WARN: Code duplicated, block: B:159:0x033b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0342  */
    /* JADX WARN: Code duplicated, block: B:168:0x0356  */
    /* JADX WARN: Code duplicated, block: B:173:0x036a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0376  */
    /* JADX WARN: Code duplicated, block: B:177:0x038d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0397  */
    /* JADX WARN: Code duplicated, block: B:181:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:202:0x0432  */
    /* JADX WARN: Code duplicated, block: B:210:0x044f  */
    /* JADX WARN: Code duplicated, block: B:212:0x0459  */
    /* JADX WARN: Code duplicated, block: B:249:0x026c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x0402 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x0480 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0448 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x03b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x03c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:310:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x03a9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.je2
    public final de2 F() throws IOException {
        jf2 jf2VarQ;
        int i;
        int i2;
        int i3;
        ce2 ce2VarA;
        int iMin;
        vd2 vd2Var;
        int i4;
        pv2 pv2Var;
        ec1 ec1Var;
        pv2 pv2Var2;
        String str;
        ec1 ec1Var2;
        ec1 ec1Var3;
        Pair pair;
        int i5;
        ArrayList list;
        int size;
        int i6;
        NetworkInterface networkInterface;
        String str2;
        byte[] hardwareAddress;
        WifiInfo connectionInfo;
        Context context;
        String str3;
        String deviceId;
        TelephonyManager telephonyManager;
        lf2 lf2Var;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        jf2 jf2Var = jf2.f;
        jf2 jf2Var2 = jf2.i;
        jf2 jf2Var3 = jf2.c;
        ue2 ue2Var = ue2.j;
        System.currentTimeMillis();
        qp0 qp0Var = (qp0) this.a;
        ec1 ec1Var4 = (ec1) qp0Var.d;
        synchronized (ec1Var4) {
            jf2VarQ = (jf2) ec1Var4.b;
        }
        if (jf2VarQ == null) {
            jf2VarQ = ((pv2) qp0Var.c).q((String) ue2Var.b);
        }
        if (jf2VarQ == jf2Var3) {
            pv2 pv2Var3 = (pv2) qp0Var.c;
            pv2Var3.getClass();
            try {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((FutureTask) pv2Var3.a).get()).edit();
                editorEdit.clear();
                editorEdit.apply();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        if (jf2VarQ != jf2Var3 && jf2VarQ != jf2.e && jf2VarQ != jf2Var2) {
            if (jf2VarQ == jf2Var) {
                pv2 pv2Var4 = (pv2) qp0Var.c;
                pv2Var4.getClass();
                try {
                    lf2Var = lf2.b(((SharedPreferences) ((FutureTask) pv2Var4.a).get()).getString("FM_config_data", BuildConfig.FLAVOR));
                } catch (InterruptedException | ExecutionException unused2) {
                    lf2Var = new lf2();
                }
                ((lf2) qp0Var.e).a(lf2Var);
                ec1 ec1Var5 = (ec1) qp0Var.d;
                synchronized (ec1Var5) {
                    ec1Var5.b = jf2VarQ;
                }
                ((CountDownLatch) ((ec1) qp0Var.d).c).countDown();
                l().c = false;
            }
            System.currentTimeMillis();
            return de2.b(BuildConfig.FLAVOR);
        }
        ec1 ec1Var6 = (ec1) qp0Var.d;
        jf2 jf2Var4 = jf2.d;
        synchronized (ec1Var6) {
            ec1Var6.b = jf2Var4;
        }
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        mapSynchronizedMap.put("md", (String) qp0Var.f().e);
        mapSynchronizedMap.put("bI", (String) qp0Var.f().f);
        mapSynchronizedMap.put("buiD", (String) qp0Var.f().g);
        mapSynchronizedMap.put("bd", (String) qp0Var.f().h);
        qp0Var.f().getClass();
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces != null) {
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                    if (!networkInterfaceNextElement.isLoopback() && networkInterfaceNextElement.isUp()) {
                        Enumeration<InetAddress> inetAddresses = networkInterfaceNextElement.getInetAddresses();
                        while (inetAddresses.hasMoreElements()) {
                            arrayList.add(inetAddresses.nextElement().getHostAddress());
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
        mapSynchronizedMap.put("loI", arrayList);
        String str4 = (String) ue2Var.c;
        if (!TextUtils.isEmpty(str4)) {
            mapSynchronizedMap.put("cC", str4);
        }
        p11 p11Var = this.f;
        if (((Configuration) ue2Var.d) == null) {
            ue2Var.d = Configuration.getDefault();
        }
        Configuration configuration = (Configuration) ue2Var.d;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        h01 h01Var = this.v;
        if (h01Var == null) {
            ee2.a.execute(new oe2(this, linkedBlockingQueue, 0));
            i = 1;
        } else {
            h01 h01VarG = G(h01Var);
            if (h01VarG.c(2)) {
                mapSynchronizedMap.put("pbH", h01VarG.b);
                if (g93.i) {
                    g93.b("获取到 %s", "pbH");
                }
            } else if (h01VarG.c(1)) {
                mapSynchronizedMap.put("pbT", h01VarG.a);
                if (g93.i) {
                    g93.b("获取到 %s", "pbT");
                }
            }
            l().c = false;
            i = 0;
        }
        ThreadPoolExecutor threadPoolExecutor = ee2.a;
        threadPoolExecutor.execute(new oe2(this, linkedBlockingQueue, 1));
        int i7 = i + 2;
        threadPoolExecutor.execute(new oe2(this, linkedBlockingQueue, 2));
        if (configuration.isSimulatorDisabled()) {
            i2 = i7;
        } else {
            threadPoolExecutor.execute(new oe2(this, linkedBlockingQueue, 3));
            i2 = i + 3;
        }
        if (configuration.isAdEnabled()) {
            if (Configuration.isPresent(configuration.getMacAddress())) {
                mapSynchronizedMap.put("mA", configuration.getMacAddress());
            } else {
                if (!configuration.isMacDisabled()) {
                    String macAddress = (String) p11Var.c;
                    if (macAddress != null) {
                        i5 = i2;
                        i3 = 1;
                    } else {
                        try {
                            WifiManager wifiManager = (WifiManager) ((Context) p11Var.b).getSystemService(se2.c);
                            macAddress = (wifiManager == null || (connectionInfo = wifiManager.getConnectionInfo()) == null) ? null : connectionInfo.getMacAddress();
                        } catch (Throwable unused4) {
                        }
                        if (p11.a(macAddress)) {
                            try {
                                i5 = i2;
                                try {
                                    try {
                                        macAddress = new BufferedReader(new FileReader(new File(se2.e))).readLine();
                                    } catch (Throwable unused5) {
                                        macAddress = macAddress;
                                    }
                                } catch (Throwable unused6) {
                                    macAddress = macAddress;
                                    if (p11.a(macAddress)) {
                                        try {
                                            list = Collections.list(NetworkInterface.getNetworkInterfaces());
                                            size = list.size();
                                            i6 = 0;
                                            while (i6 < size) {
                                                try {
                                                    Object obj = list.get(i6);
                                                    i6++;
                                                    networkInterface = (NetworkInterface) obj;
                                                    ArrayList arrayList2 = list;
                                                    str2 = macAddress;
                                                    try {
                                                        if (se2.d.equalsIgnoreCase(networkInterface.getName())) {
                                                            macAddress = str2;
                                                        } else {
                                                            macAddress = str2;
                                                        }
                                                        size = size;
                                                        list = arrayList2;
                                                    } catch (Throwable unused7) {
                                                        i3 = 1;
                                                    }
                                                } catch (Throwable unused8) {
                                                }
                                            }
                                        } catch (Throwable unused9) {
                                        }
                                        i3 = 1;
                                        if (p11.a(macAddress)) {
                                            p11Var.c = BuildConfig.FLAVOR;
                                        } else {
                                            p11Var.c = macAddress;
                                        }
                                        macAddress = (String) p11Var.c;
                                    } else {
                                        p11Var.c = macAddress;
                                        i3 = 1;
                                    }
                                    mapSynchronizedMap.put("mA", macAddress);
                                    if (Configuration.isPresent(configuration.getImei())) {
                                        mapSynchronizedMap.put("im", configuration.getImei());
                                    } else if (!configuration.isImeiDisabled()) {
                                        context = (Context) p11Var.b;
                                        str3 = (String) p11Var.d;
                                        if (str3 == null) {
                                            if (z32.a(context, "android.permission.READ_PHONE_STATE")) {
                                                telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                                try {
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        deviceId = telephonyManager.getImei();
                                                    } else {
                                                        deviceId = telephonyManager.getDeviceId();
                                                    }
                                                } catch (Throwable unused10) {
                                                    deviceId = null;
                                                }
                                            } else {
                                                deviceId = null;
                                            }
                                            if (TextUtils.isEmpty(deviceId)) {
                                                p11Var.d = BuildConfig.FLAVOR;
                                            } else {
                                                p11Var.d = BuildConfig.FLAVOR;
                                            }
                                            str3 = (String) p11Var.d;
                                        }
                                        mapSynchronizedMap.put("im", str3);
                                    }
                                    if (Configuration.isPresent(configuration.getGaid())) {
                                        mapSynchronizedMap.put("ga", configuration.getGaid());
                                        i2 = i5;
                                    } else {
                                        i2 = i5 + 1;
                                        ee2.a.execute(new oe2(this, linkedBlockingQueue, 4));
                                    }
                                    if (Configuration.isPresent(configuration.getOaid())) {
                                        mapSynchronizedMap.put("oa", configuration.getOaid());
                                    } else {
                                        i2++;
                                        ee2.a.execute(new oe2(this, linkedBlockingQueue, 5));
                                    }
                                    while (i2 > 0) {
                                        try {
                                            pair = (Pair) linkedBlockingQueue.poll(1L, timeUnit);
                                        } catch (InterruptedException unused11) {
                                            pair = null;
                                        }
                                        if (pair != null) {
                                            i2--;
                                            if (TextUtils.isEmpty((CharSequence) pair.first)) {
                                            }
                                        }
                                    }
                                    ud2 ud2Var = (ud2) qp0Var.b;
                                    ce2VarA = ud2Var.a("/init", ud2Var.i(mapSynchronizedMap));
                                    iMin = i3;
                                    while (!(ce2VarA instanceof vd2)) {
                                        try {
                                            ((LinkedBlockingQueue) ((ec1) qp0Var.d).d).poll(iMin, timeUnit);
                                        } catch (InterruptedException unused12) {
                                        }
                                        ud2 ud2Var2 = (ud2) qp0Var.b;
                                        ce2VarA = ud2Var2.a("/init", ud2Var2.i(mapSynchronizedMap));
                                        iMin = Math.min(iMin * 2, 60);
                                    }
                                    vd2Var = (vd2) ce2VarA;
                                    h(vd2Var);
                                    i4 = vd2Var.a;
                                    pv2Var = (pv2) qp0Var.c;
                                    if (i4 == 0) {
                                        pv2Var.p("FM_init_data", vd2Var.b);
                                        ((pv2) qp0Var.c).p("FM_init_msg", vd2Var.c);
                                        ec1Var3 = (ec1) qp0Var.d;
                                        synchronized (ec1Var3) {
                                            ec1Var3.b = jf2Var;
                                        }
                                    } else {
                                        pv2Var.p("FM_init_msg", vd2Var.c);
                                        ec1Var = (ec1) qp0Var.d;
                                        synchronized (ec1Var) {
                                            ec1Var.b = jf2Var2;
                                        }
                                    }
                                    ((pv2) qp0Var.c).d(null);
                                    ((CountDownLatch) ((ec1) qp0Var.d).c).countDown();
                                    pv2Var2 = (pv2) qp0Var.c;
                                    str = (String) ue2Var.b;
                                    ec1Var2 = (ec1) qp0Var.d;
                                    synchronized (ec1Var2) {
                                        jf2 jf2Var5 = (jf2) ec1Var2.b;
                                        pv2Var2.getClass();
                                        SharedPreferences.Editor editorEdit2 = ((SharedPreferences) ((FutureTask) pv2Var2.a).get()).edit();
                                        editorEdit2.putInt(str, jf2Var5.b);
                                        editorEdit2.apply();
                                        H();
                                        System.currentTimeMillis();
                                        return de2.b(BuildConfig.FLAVOR);
                                    }
                                }
                            } catch (Throwable unused13) {
                                i5 = i2;
                            }
                            if (p11.a(macAddress)) {
                                p11Var.c = macAddress;
                                i3 = 1;
                            } else {
                                list = Collections.list(NetworkInterface.getNetworkInterfaces());
                                size = list.size();
                                i6 = 0;
                                while (i6 < size) {
                                    Object obj2 = list.get(i6);
                                    i6++;
                                    networkInterface = (NetworkInterface) obj2;
                                    ArrayList arrayList3 = list;
                                    str2 = macAddress;
                                    if (se2.d.equalsIgnoreCase(networkInterface.getName()) || (hardwareAddress = networkInterface.getHardwareAddress()) == null) {
                                        macAddress = str2;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        int length = hardwareAddress.length;
                                        int i8 = 0;
                                        while (i8 < length) {
                                            try {
                                                int i9 = i8;
                                                int i10 = length;
                                                sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i8])));
                                                i8 = i9 + 1;
                                                length = i10;
                                            } catch (Throwable unused14) {
                                                macAddress = str2;
                                            }
                                        }
                                        if (sb.length() > 0) {
                                            i3 = 1;
                                            try {
                                                sb.deleteCharAt(sb.length() - 1);
                                            } catch (Throwable unused15) {
                                                macAddress = str2;
                                                if (p11.a(macAddress)) {
                                                    p11Var.c = macAddress;
                                                } else {
                                                    p11Var.c = BuildConfig.FLAVOR;
                                                }
                                                macAddress = (String) p11Var.c;
                                                mapSynchronizedMap.put("mA", macAddress);
                                                if (Configuration.isPresent(configuration.getImei())) {
                                                    mapSynchronizedMap.put("im", configuration.getImei());
                                                } else if (!configuration.isImeiDisabled()) {
                                                    context = (Context) p11Var.b;
                                                    str3 = (String) p11Var.d;
                                                    if (str3 == null) {
                                                        if (z32.a(context, "android.permission.READ_PHONE_STATE")) {
                                                            telephonyManager = (TelephonyManager) context.getSystemService("phone");
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                deviceId = telephonyManager.getImei();
                                                            } else {
                                                                deviceId = telephonyManager.getDeviceId();
                                                            }
                                                        } else {
                                                            deviceId = null;
                                                        }
                                                        if (TextUtils.isEmpty(deviceId)) {
                                                            p11Var.d = BuildConfig.FLAVOR;
                                                        } else {
                                                            p11Var.d = BuildConfig.FLAVOR;
                                                        }
                                                        str3 = (String) p11Var.d;
                                                    }
                                                    mapSynchronizedMap.put("im", str3);
                                                }
                                                if (Configuration.isPresent(configuration.getGaid())) {
                                                    mapSynchronizedMap.put("ga", configuration.getGaid());
                                                    i2 = i5;
                                                } else {
                                                    i2 = i5 + 1;
                                                    ee2.a.execute(new oe2(this, linkedBlockingQueue, 4));
                                                }
                                                if (Configuration.isPresent(configuration.getOaid())) {
                                                    mapSynchronizedMap.put("oa", configuration.getOaid());
                                                } else {
                                                    i2++;
                                                    ee2.a.execute(new oe2(this, linkedBlockingQueue, 5));
                                                }
                                                while (i2 > 0) {
                                                    pair = (Pair) linkedBlockingQueue.poll(1L, timeUnit);
                                                    if (pair != null) {
                                                        i2--;
                                                        if (TextUtils.isEmpty((CharSequence) pair.first)) {
                                                        }
                                                    }
                                                }
                                                ud2 ud2Var3 = (ud2) qp0Var.b;
                                                ce2VarA = ud2Var3.a("/init", ud2Var3.i(mapSynchronizedMap));
                                                iMin = i3;
                                                while (!(ce2VarA instanceof vd2)) {
                                                    ((LinkedBlockingQueue) ((ec1) qp0Var.d).d).poll(iMin, timeUnit);
                                                    ud2 ud2Var4 = (ud2) qp0Var.b;
                                                    ce2VarA = ud2Var4.a("/init", ud2Var4.i(mapSynchronizedMap));
                                                    iMin = Math.min(iMin * 2, 60);
                                                }
                                                vd2Var = (vd2) ce2VarA;
                                                h(vd2Var);
                                                i4 = vd2Var.a;
                                                pv2Var = (pv2) qp0Var.c;
                                                if (i4 == 0) {
                                                    pv2Var.p("FM_init_data", vd2Var.b);
                                                    ((pv2) qp0Var.c).p("FM_init_msg", vd2Var.c);
                                                    ec1Var3 = (ec1) qp0Var.d;
                                                    synchronized (ec1Var3) {
                                                        ec1Var3.b = jf2Var;
                                                    }
                                                } else {
                                                    pv2Var.p("FM_init_msg", vd2Var.c);
                                                    ec1Var = (ec1) qp0Var.d;
                                                    synchronized (ec1Var) {
                                                        ec1Var.b = jf2Var2;
                                                    }
                                                }
                                                ((pv2) qp0Var.c).d(null);
                                                ((CountDownLatch) ((ec1) qp0Var.d).c).countDown();
                                                pv2Var2 = (pv2) qp0Var.c;
                                                str = (String) ue2Var.b;
                                                ec1Var2 = (ec1) qp0Var.d;
                                                synchronized (ec1Var2) {
                                                    jf2 jf2Var6 = (jf2) ec1Var2.b;
                                                    pv2Var2.getClass();
                                                    SharedPreferences.Editor editorEdit3 = ((SharedPreferences) ((FutureTask) pv2Var2.a).get()).edit();
                                                    editorEdit3.putInt(str, jf2Var6.b);
                                                    editorEdit3.apply();
                                                    H();
                                                    System.currentTimeMillis();
                                                    return de2.b(BuildConfig.FLAVOR);
                                                }
                                            }
                                        }
                                        macAddress = sb.toString();
                                    }
                                    size = size;
                                    list = arrayList3;
                                }
                                i3 = 1;
                                if (p11.a(macAddress)) {
                                    p11Var.c = macAddress;
                                } else {
                                    p11Var.c = BuildConfig.FLAVOR;
                                }
                                macAddress = (String) p11Var.c;
                            }
                        } else {
                            p11Var.c = macAddress;
                            i5 = i2;
                            i3 = 1;
                        }
                    }
                    mapSynchronizedMap.put("mA", macAddress);
                }
                if (Configuration.isPresent(configuration.getImei())) {
                    mapSynchronizedMap.put("im", configuration.getImei());
                } else if (!configuration.isImeiDisabled()) {
                    context = (Context) p11Var.b;
                    str3 = (String) p11Var.d;
                    if (str3 == null) {
                        if (z32.a(context, "android.permission.READ_PHONE_STATE")) {
                            telephonyManager = (TelephonyManager) context.getSystemService("phone");
                            if (Build.VERSION.SDK_INT >= 26) {
                                deviceId = telephonyManager.getImei();
                            } else {
                                deviceId = telephonyManager.getDeviceId();
                            }
                        } else {
                            deviceId = null;
                        }
                        if (TextUtils.isEmpty(deviceId) || deviceId.equals(se2.g) || deviceId.equals(se2.h)) {
                            p11Var.d = BuildConfig.FLAVOR;
                        } else {
                            p11Var.d = deviceId;
                        }
                        str3 = (String) p11Var.d;
                    }
                    mapSynchronizedMap.put("im", str3);
                }
                if (Configuration.isPresent(configuration.getGaid())) {
                    mapSynchronizedMap.put("ga", configuration.getGaid());
                    i2 = i5;
                } else {
                    i2 = i5 + 1;
                    ee2.a.execute(new oe2(this, linkedBlockingQueue, 4));
                }
                if (Configuration.isPresent(configuration.getOaid())) {
                    mapSynchronizedMap.put("oa", configuration.getOaid());
                } else {
                    i2++;
                    ee2.a.execute(new oe2(this, linkedBlockingQueue, 5));
                }
            }
            i5 = i2;
            i3 = 1;
            if (Configuration.isPresent(configuration.getImei())) {
                mapSynchronizedMap.put("im", configuration.getImei());
            } else if (!configuration.isImeiDisabled()) {
                context = (Context) p11Var.b;
                str3 = (String) p11Var.d;
                if (str3 == null) {
                    if (z32.a(context, "android.permission.READ_PHONE_STATE")) {
                        telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (Build.VERSION.SDK_INT >= 26) {
                            deviceId = telephonyManager.getImei();
                        } else {
                            deviceId = telephonyManager.getDeviceId();
                        }
                    } else {
                        deviceId = null;
                    }
                    if (TextUtils.isEmpty(deviceId)) {
                        p11Var.d = BuildConfig.FLAVOR;
                    } else {
                        p11Var.d = BuildConfig.FLAVOR;
                    }
                    str3 = (String) p11Var.d;
                }
                mapSynchronizedMap.put("im", str3);
            }
            if (Configuration.isPresent(configuration.getGaid())) {
                mapSynchronizedMap.put("ga", configuration.getGaid());
                i2 = i5;
            } else {
                i2 = i5 + 1;
                ee2.a.execute(new oe2(this, linkedBlockingQueue, 4));
            }
            if (Configuration.isPresent(configuration.getOaid())) {
                mapSynchronizedMap.put("oa", configuration.getOaid());
            } else {
                i2++;
                ee2.a.execute(new oe2(this, linkedBlockingQueue, 5));
            }
        } else {
            i3 = 1;
        }
        while (i2 > 0) {
            pair = (Pair) linkedBlockingQueue.poll(1L, timeUnit);
            if (pair != null) {
                i2--;
                if (TextUtils.isEmpty((CharSequence) pair.first) && !TextUtils.isEmpty((CharSequence) pair.second) && !"false".equalsIgnoreCase((String) pair.second)) {
                    mapSynchronizedMap.put(pair.first, pair.second);
                    if (g93.i) {
                        g93.b("获取到 %s", pair.first);
                    }
                }
            }
        }
        ud2 ud2Var5 = (ud2) qp0Var.b;
        ce2VarA = ud2Var5.a("/init", ud2Var5.i(mapSynchronizedMap));
        iMin = i3;
        while (!(ce2VarA instanceof vd2)) {
            ((LinkedBlockingQueue) ((ec1) qp0Var.d).d).poll(iMin, timeUnit);
            ud2 ud2Var6 = (ud2) qp0Var.b;
            ce2VarA = ud2Var6.a("/init", ud2Var6.i(mapSynchronizedMap));
            iMin = Math.min(iMin * 2, 60);
        }
        vd2Var = (vd2) ce2VarA;
        h(vd2Var);
        i4 = vd2Var.a;
        pv2Var = (pv2) qp0Var.c;
        if (i4 == 0) {
            pv2Var.p("FM_init_data", vd2Var.b);
            ((pv2) qp0Var.c).p("FM_init_msg", vd2Var.c);
            ec1Var3 = (ec1) qp0Var.d;
            synchronized (ec1Var3) {
                ec1Var3.b = jf2Var;
            }
        } else {
            pv2Var.p("FM_init_msg", vd2Var.c);
            ec1Var = (ec1) qp0Var.d;
            synchronized (ec1Var) {
                ec1Var.b = jf2Var2;
            }
        }
        ((pv2) qp0Var.c).d(null);
        ((CountDownLatch) ((ec1) qp0Var.d).c).countDown();
        pv2Var2 = (pv2) qp0Var.c;
        str = (String) ue2Var.b;
        ec1Var2 = (ec1) qp0Var.d;
        synchronized (ec1Var2) {
            jf2 jf2Var7 = (jf2) ec1Var2.b;
        }
        pv2Var2.getClass();
        try {
            SharedPreferences.Editor editorEdit4 = ((SharedPreferences) ((FutureTask) pv2Var2.a).get()).edit();
            editorEdit4.putInt(str, jf2Var7.b);
            editorEdit4.apply();
        } catch (InterruptedException | ExecutionException unused16) {
        }
        H();
        System.currentTimeMillis();
        return de2.b(BuildConfig.FLAVOR);
    }

    public final h01 G(h01 h01Var) {
        h01 h01VarB;
        qp0 qp0Var = (qp0) this.a;
        if (h01Var != null && h01Var.c != 0) {
            ((pv2) qp0Var.c).d(h01Var);
            return h01Var;
        }
        pv2 pv2Var = (pv2) qp0Var.c;
        pv2Var.getClass();
        try {
            h01VarB = h01.b(((SharedPreferences) ((FutureTask) pv2Var.a).get()).getString("FM_pb_data", BuildConfig.FLAVOR));
        } catch (InterruptedException | ExecutionException unused) {
            h01VarB = null;
        }
        return h01VarB != null ? h01VarB : h01Var;
    }

    public final void H() {
        String strB;
        qp0 qp0Var = (qp0) this.a;
        if (TextUtils.isEmpty(((lf2) qp0Var.e).f)) {
            pv2 pv2VarJ = qp0Var.j();
            strB = ((rb2) pv2VarJ.a).b((String) ue2.j.b);
        } else {
            strB = ((lf2) qp0Var.e).f;
        }
        if (g93.i) {
            g93.b("opid = %s", strB);
        }
    }

    @Override // defpackage.lo2
    public final void o() {
        WeakReference weakReference;
        ue2 ue2Var = ue2.j;
        boolean zBooleanValue = ue2Var.a().booleanValue();
        h01 h01VarA = h01.a((ClipData) ue2Var.h);
        boolean z = h01VarA == null || h01VarA.c == 0;
        if (zBooleanValue && z) {
            System.currentTimeMillis();
            jf2 jf2VarQ = ((pv2) ((qp0) this.a).c).q((String) ue2Var.b);
            if (jf2VarQ == jf2.c || jf2VarQ == jf2.e || jf2VarQ == jf2.i) {
                hc2 hc2VarL = l();
                if (hc2VarL.a && (weakReference = this.i) != null) {
                    hc2VarL.b.d = weakReference;
                }
                h01VarA = l().b(false);
                System.currentTimeMillis();
            }
        }
        this.v = h01VarA;
    }
}
