package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q20 {
    public static volatile q20 j;
    public final ConcurrentHashMap a;
    public final ArrayList b;
    public long c;
    public long d;
    public String e;
    public String f;
    public long g;
    public long h;
    public final String i;

    public q20() throws Throwable {
        String str;
        String processName;
        Exception e;
        String str2 = BuildConfig.FLAVOR;
        this.e = BuildConfig.FLAVOR;
        this.f = BuildConfig.FLAVOR;
        this.g = 0L;
        this.h = 0L;
        this.a = new ConcurrentHashMap();
        this.b = new ArrayList();
        this.d = 86400000L;
        StringBuilder sb = new StringBuilder("gslb_");
        Context context = kv.j;
        b81 b81Var = j42.a;
        FileInputStream fileInputStream = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
            } else {
                int iMyPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    str = null;
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        try {
                            if (runningAppProcessInfo.pid == iMyPid) {
                                str = runningAppProcessInfo.processName;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    }
                    processName = str;
                } else {
                    processName = null;
                }
            }
        } catch (Exception e3) {
            e = e3;
            str = null;
        }
        sb.append(TextUtils.isEmpty(processName) ? context.getPackageName() : processName);
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kv.j.getFilesDir().getPath());
        String strL = ts.l(sb2, File.separator, string);
        this.i = strL;
        File file = new File(strL);
        b81 b81Var2 = j42.a;
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream2.available()];
                        fileInputStream2.read(bArr);
                        String str3 = new String(bArr);
                        try {
                            fileInputStream2.close();
                        } catch (IOException unused) {
                        }
                        str2 = str3;
                    } catch (Exception e4) {
                        e = e4;
                        fileInputStream = fileInputStream2;
                        j42.a.b(Log.getStackTraceString(e));
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e5) {
                e = e5;
            }
            String[] strArrSplit = str2.split("&");
            if (strArrSplit.length >= 4) {
                try {
                    String str4 = strArrSplit[0];
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
                    if (str4 != null && str4.length() != 0) {
                        for (String str5 : str4.split(",")) {
                            String[] strArrSplit2 = str5.split("#");
                            if (strArrSplit2.length == 2) {
                                concurrentHashMap.put(strArrSplit2[0], strArrSplit2[1]);
                            }
                        }
                    }
                    this.a = concurrentHashMap;
                    this.e = strArrSplit[1];
                    this.d = Long.parseLong(strArrSplit[2]);
                    this.c = Long.parseLong(strArrSplit[3]);
                    this.f = strArrSplit[4];
                } catch (Throwable unused4) {
                }
            }
            if (this.a.size() == 0) {
                this.a.put("dsu.shalltry.com", "blank");
                this.a.put("dsc.shalltry.com", "blank");
                this.a.put("api.twibida.com", "blank");
            }
            a();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static q20 c() {
        if (j == null) {
            synchronized (q20.class) {
                try {
                    if (j == null) {
                        j = new q20();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return j;
    }

    public static boolean d(String str) {
        return (TextUtils.isEmpty(str) || str.equals("blank")) ? false : true;
    }

    public final void a() {
        ka2 ka2Var;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (Math.abs(this.g - jCurrentTimeMillis) > 86400000) {
            this.h = 0L;
        }
        long j2 = this.c;
        if (j2 <= 0 || Math.abs(jCurrentTimeMillis - j2) <= this.d) {
            return;
        }
        long j3 = this.h;
        if (j3 == 0) {
            this.g = jCurrentTimeMillis;
        }
        if (j3 < 4 && (ka2Var = kv.i) != null) {
            ka2Var.c();
            if (!ka2Var.a.hasMessages(103)) {
                ka2Var.a.sendEmptyMessageDelayed(103, 100L);
            }
        }
        this.h++;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((Map.Entry) it.next()).getKey());
        }
        return arrayList;
    }

    public final void e() {
        ArrayList arrayList = this.b;
        int i = 0;
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xy0 xy0Var = (xy0) obj;
                xy0Var.getClass();
                sh1 sh1Var = xy0Var.d;
                String str = xy0Var.c;
                sk0 sk0Var = xy0Var.b;
                ConcurrentHashMap concurrentHashMap = this.a;
                if (sk0Var != null) {
                    boolean z = false;
                    for (String str2 : xy0Var.a) {
                        if (!TextUtils.isEmpty(str2) && !d((String) concurrentHashMap.get(str2))) {
                            z = true;
                        }
                    }
                    if (!z && !TextUtils.isEmpty(this.f)) {
                        sk0Var.f(new HashMap(concurrentHashMap));
                    }
                } else if (str != null && sh1Var != null) {
                    String strA = j42.a(str);
                    String str3 = (String) concurrentHashMap.get(strA);
                    if (d(str3)) {
                        str.replace(strA, str3);
                    }
                }
            }
            arrayList.clear();
        } catch (Exception e) {
            e.printStackTrace();
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                xy0 xy0Var2 = (xy0) obj2;
                xy0Var2.getClass();
                if (xy0Var2.b == null && xy0Var2.c != null) {
                    sh1 sh1Var2 = xy0Var2.d;
                }
            }
            arrayList.clear();
        }
    }

    public final void f() {
        ArrayList arrayList = this.b;
        int i = 0;
        try {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xy0 xy0Var = (xy0) obj;
                xy0Var.getClass();
                if (xy0Var.b != null) {
                    arrayList2.add(xy0Var);
                } else if (xy0Var.c != null) {
                    sh1 sh1Var = xy0Var.d;
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        } catch (Exception e) {
            e.printStackTrace();
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                xy0 xy0Var2 = (xy0) obj2;
                xy0Var2.getClass();
                if (xy0Var2.b == null && xy0Var2.c != null) {
                    sh1 sh1Var2 = xy0Var2.d;
                }
            }
            arrayList.clear();
        }
    }

    public final void g() {
        String string;
        StringBuilder sb = new StringBuilder();
        b81 b81Var = j42.a;
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            string = BuildConfig.FLAVOR;
        } else {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                sb2.append((String) entry.getKey());
                sb2.append("#");
                sb2.append((String) entry.getValue());
                sb2.append(",");
            }
            string = sb2.toString();
        }
        sb.append(string);
        sb.append("&");
        sb.append(this.e);
        sb.append("&");
        sb.append(this.d);
        sb.append("&");
        sb.append(this.c);
        sb.append("&");
        sb.append(this.f);
        String string2 = sb.toString();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(this.i);
                    try {
                        fileOutputStream2.write(string2.getBytes());
                        fileOutputStream2.close();
                    } catch (Exception e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        j42.a.b(Log.getStackTraceString(e));
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (IOException unused2) {
        }
    }
}
