package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.a;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilJvmKt;
import prod.apptest.com.AppTestApp;
import prod.apptest.com.activity.X5_Activity;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rm extends kf {
    public static final ExecutorService e = Executors.newCachedThreadPool();
    public static final ll0 f = new ll0(Looper.getMainLooper());
    public final String a = AppTestApp.Z;
    public List b;
    public final WeakReference c;
    public final CountDownLatch d;

    public rm(X5_Activity x5_Activity, CountDownLatch countDownLatch) {
        this.c = new WeakReference(x5_Activity);
        this.d = countDownLatch;
        SharedPreferences sharedPreferences = AppTestApp.w.b;
        sharedPreferences.getClass();
        this.b = (List) new uk0().a(sharedPreferences.getString(AppTestApp.e, "[]"), new bb().b);
    }

    public static String e(gj1 gj1Var) throws Throwable {
        Throwable th;
        String strP;
        try {
            ResponseBody responseBody = gj1Var.c;
            if (responseBody == null) {
                return BuildConfig.FLAVOR;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(gj1Var.a.d);
            sb.append(" ");
            ri riVarE = responseBody.e();
            try {
                strP = riVarE.P(_UtilJvmKt.f(riVarE, Internal.a(responseBody.b())));
                try {
                    riVarE.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (riVarE != null) {
                    try {
                        riVarE.close();
                    } catch (Throwable th4) {
                        a80.a(th3, th4);
                    }
                }
                th = th3;
                strP = null;
            }
            if (th != null) {
                throw th;
            }
            sb.append(strP);
            return sb.toString();
        } catch (IOException unused) {
            return null;
        }
    }

    public static boolean f(String str, List list) {
        String strTrim = ak1.a(str, true).trim();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (strTrim.equalsIgnoreCase(ak1.a(((p20) it.next()).a(), true).trim())) {
                return true;
            }
        }
        return false;
    }

    public static void g(Context context, String str) {
        try {
            am2.p(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
            ii1 ii1VarB = a.a(context).e.b(context);
            ii1VarB.getClass();
            bi1 bi1Var = (bi1) ((bi1) new bi1(ii1VarB.a, ii1VarB, Drawable.class, ii1VarB.b).D(str).g(x10.d)).h();
            bi1Var.C(new qc1(bi1Var.g0), bi1Var);
            kv.E("Splash preloaded to disk cache");
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.kf
    public final Activity a() {
        Activity activity = (Activity) this.c.get();
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0143  */
    public final String c(boolean z) {
        boolean z2;
        Object obj;
        SharedPreferences sharedPreferences = AppTestApp.w.b;
        sharedPreferences.getClass();
        String string = sharedPreferences.getString(AppTestApp.i, BuildConfig.FLAVOR);
        String strD = AppTestApp.w.d();
        final int i = 0;
        boolean z3 = true;
        if (ea.q(string)) {
            SharedPreferences sharedPreferences2 = AppTestApp.w.b;
            sharedPreferences2.getClass();
            long j = sharedPreferences2.getLong(AppTestApp.v, -1L);
            long time = new Date().getTime();
            if (j == -1 || time - j >= 86400000) {
                string = null;
            } else {
                String str = ak1.a;
                String str2 = ak1.a(string, true) + "/";
                vk0 vk0Var = new vk0();
                vk0Var.m = 1;
                uk0 uk0Var = new uk0(vk0Var);
                OkHttpClient.Builder builderA = o81.a();
                builderA.c.add(new zj1(0));
                TimeUnit timeUnit = TimeUnit.SECONDS;
                timeUnit.getClass();
                builderA.w = _UtilJvmKt.b(3L);
                timeUnit.getClass();
                builderA.x = _UtilJvmKt.b(5L);
                builderA.y = _UtilJvmKt.b(5L);
                OkHttpClient okHttpClient = new OkHttpClient(builderA);
                xj1 xj1Var = new xj1();
                xj1Var.a(str2);
                xj1Var.c.add(new wk0(uk0Var));
                xj1Var.a = okHttpClient;
                wv1 wv1Var = (wv1) xj1Var.b().b();
                kv.F("Ready speed test last url: {}", string);
                try {
                    gj1 gj1VarA = wv1Var.b(Integer.valueOf(AppTestApp.m0), AppTestApp.h0).a();
                    if (!gj1VarA.a.d0 || (obj = gj1VarA.b) == null) {
                        String str3 = MessageFormat.format("Last URL test failed: {0}, response: {1}, will get new domainRoute", string, e(gj1VarA));
                        str3.getClass();
                        kv.n(str3);
                        qt.q(str3);
                    } else {
                        r20 r20Var = (r20) ((bu0) obj).a();
                        if (r20Var != null && r20Var.a() != null) {
                            AppTestApp.w.e(r20Var.a());
                            String strB = r20Var.b();
                            if (ea.q(strB) && !strB.equals(strD)) {
                                SharedPreferences sharedPreferences3 = AppTestApp.w.b;
                                sharedPreferences3.getClass();
                                sharedPreferences3.edit().putString("SPLASH_URL", strB).apply();
                                g(AppTestApp.w.getApplicationContext(), strB);
                                kv.E("Splash url saved to local and image preload to disk cache");
                            }
                            if (!f(string, r20Var.a())) {
                                String str4 = MessageFormat.format("Last URL test failed: {0} already be removed from domainRoute", string);
                                str4.getClass();
                                qt.q(str4);
                            }
                        }
                    }
                } catch (Exception e2) {
                    kv.o("Domain route failed: ".concat(string), e2);
                    String str5 = MessageFormat.format("Last URL test failed: {0}, error: {1}", string, e2.getLocalizedMessage());
                    str5.getClass();
                    kv.n(str5);
                    qt.q(str5);
                }
                string = null;
            }
        } else {
            string = null;
        }
        if (ea.q(string)) {
            kv.F("Fast domain: {}", string);
            AppTestApp.w.getClass();
            string.getClass();
            AppTestApp.w.f(string, false);
            return string;
        }
        AppTestApp.w.f(BuildConfig.FLAVOR, false);
        List list = this.b;
        if (list == null || list.size() == 0) {
            qt.q("Domain route empty");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.b);
        Collections.shuffle(arrayList);
        List<p20> listSubList = arrayList.subList(0, Math.min(20, arrayList.size()));
        int size = listSubList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (final p20 p20Var : listSubList) {
            if (!AppTestApp.n0.contains(ak1.a(p20Var.a(), true))) {
                wv1 wv1Var2 = (wv1) ak1.b(p20Var.a()).b();
                kv.F("Ready speed test: {}", p20Var.a());
                final wj<bu0<r20>> wjVarB = wv1Var2.b(Integer.valueOf(AppTestApp.m0), AppTestApp.h0);
                arrayList2.add(qp.b(qp.e, new bv1(this) { // from class: qm
                    @Override // defpackage.bv1, defpackage.ij0
                    public final Object get() {
                        int i2 = i;
                        p20 p20Var2 = p20Var;
                        wj wjVar = wjVarB;
                        switch (i2) {
                            case 0:
                                try {
                                    gj1 gj1VarA2 = wjVar.a();
                                    Response response = gj1VarA2.a;
                                    Object obj2 = gj1VarA2.b;
                                    if (!response.d0) {
                                        String str6 = MessageFormat.format("Domain route test failed: {0}, response: {1}", p20Var2.a(), rm.e(gj1VarA2));
                                        str6.getClass();
                                        kv.n(str6);
                                        qt.q(str6);
                                    }
                                    if (obj2 == null) {
                                        return null;
                                    }
                                    if (rm.f(p20Var2.a(), ((r20) ((bu0) obj2).a()).a())) {
                                        return (bu0) obj2;
                                    }
                                    String str7 = MessageFormat.format("Domain: {0} already be removed from domainRoute", p20Var2.a());
                                    str7.getClass();
                                    qt.q(str7);
                                    return null;
                                } catch (Exception e3) {
                                    kv.o("Domain route failed: " + p20Var2.a(), e3);
                                    return null;
                                }
                            default:
                                try {
                                    gj1 gj1VarA3 = wjVar.a();
                                    if (!gj1VarA3.a.d0) {
                                        String str8 = MessageFormat.format("Get Backup domain route failed: {0} response: {1}", p20Var2.a(), rm.e(gj1VarA3));
                                        str8.getClass();
                                        kv.n(str8);
                                        qt.q(str8);
                                    }
                                    return (bu0) gj1VarA3.b;
                                } catch (Exception e4) {
                                    String str9 = MessageFormat.format("Get Backup domain route failed: {0} reason: {1}", p20Var2.a(), e4.getLocalizedMessage());
                                    str9.getClass();
                                    kv.o(str9, e4);
                                    qt.q(str9);
                                    return null;
                                }
                        }
                    }
                }));
            }
        }
        HashSet hashSet = new HashSet(size);
        boolean z4 = false;
        String str6 = null;
        while (arrayList2.size() > 0 && !z4 && hashSet.size() != size) {
            int size2 = arrayList2.size();
            int i2 = i;
            String strA = str6;
            boolean z5 = z4;
            while (true) {
                if (i2 < size2) {
                    qp qpVar = (qp) arrayList2.get(i2);
                    if (!hashSet.contains(Integer.valueOf(i2)) && qpVar.isDone()) {
                        try {
                            bu0 bu0Var = (bu0) qpVar.get();
                            if (bu0Var == null) {
                                kv.n("Speed test failure: " + ((p20) listSubList.get(i2)).a());
                                hashSet.add(Integer.valueOf(i2));
                            } else {
                                try {
                                    r20 r20Var2 = (r20) bu0Var.a();
                                    if (r20Var2 != null) {
                                        AppTestApp.w.e(r20Var2.a());
                                        String strB2 = r20Var2.b();
                                        if (ea.q(strB2) && !strB2.equals(AppTestApp.w.d())) {
                                            SharedPreferences sharedPreferences4 = AppTestApp.w.b;
                                            sharedPreferences4.getClass();
                                            sharedPreferences4.edit().putString("SPLASH_URL", strB2).apply();
                                            g(AppTestApp.w.getApplicationContext(), strB2);
                                            kv.E("Splash url saved to local and image preload to disk cache");
                                        }
                                    }
                                    strA = ak1.a(((p20) listSubList.get(i2)).a(), z3);
                                    kv.E("Save new domain route");
                                    z4 = z3;
                                    break;
                                } catch (Exception e3) {
                                    e = e3;
                                    z5 = z3;
                                    kv.o("Speed test failure: " + ((p20) listSubList.get(i2)).a(), e);
                                    hashSet.add(Integer.valueOf(i2));
                                    i2++;
                                    z3 = true;
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                        }
                    }
                    i2++;
                    z3 = true;
                }
                z4 = z5;
                break;
            }
            str6 = strA;
            i = 0;
            z3 = true;
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((qp) obj2).cancel(true);
        }
        kv.E("Speed test finished");
        if (!ea.o(str6)) {
            kv.F("Fast domain: {}", str6);
            AppTestApp.w.getClass();
            str6.getClass();
            AppTestApp.w.f(str6, true);
            return str6;
        }
        if (z) {
            String[] strArrSplit = AppTestApp.b0.split("\\s*,[,\\s]*");
            ArrayList arrayList3 = new ArrayList(strArrSplit.length);
            for (String str7 : strArrSplit) {
                p20 p20Var2 = new p20();
                p20Var2.b(str7.trim());
                arrayList3.add(p20Var2);
            }
            int size4 = arrayList3.size();
            ArrayList arrayList4 = new ArrayList(size4);
            int size5 = arrayList3.size();
            int i4 = 0;
            while (i4 < size5) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                final p20 p20Var3 = (p20) obj3;
                wv1 wv1Var3 = (wv1) ak1.b(p20Var3.a()).b();
                kv.F("Ready fetch domain route from backup domain: {}", p20Var3.a());
                final wj<bu0<r20>> wjVarB2 = wv1Var3.b(Integer.valueOf(AppTestApp.m0), AppTestApp.h0);
                final int i5 = 1;
                arrayList4.add(qp.b(qp.e, new bv1(this) { // from class: qm
                    @Override // defpackage.bv1, defpackage.ij0
                    public final Object get() {
                        int i6 = i5;
                        p20 p20Var4 = p20Var3;
                        wj wjVar = wjVarB2;
                        switch (i6) {
                            case 0:
                                try {
                                    gj1 gj1VarA2 = wjVar.a();
                                    Response response = gj1VarA2.a;
                                    Object obj4 = gj1VarA2.b;
                                    if (!response.d0) {
                                        String str8 = MessageFormat.format("Domain route test failed: {0}, response: {1}", p20Var4.a(), rm.e(gj1VarA2));
                                        str8.getClass();
                                        kv.n(str8);
                                        qt.q(str8);
                                    }
                                    if (obj4 == null) {
                                        return null;
                                    }
                                    if (rm.f(p20Var4.a(), ((r20) ((bu0) obj4).a()).a())) {
                                        return (bu0) obj4;
                                    }
                                    String str9 = MessageFormat.format("Domain: {0} already be removed from domainRoute", p20Var4.a());
                                    str9.getClass();
                                    qt.q(str9);
                                    return null;
                                } catch (Exception e5) {
                                    kv.o("Domain route failed: " + p20Var4.a(), e5);
                                    return null;
                                }
                            default:
                                try {
                                    gj1 gj1VarA3 = wjVar.a();
                                    if (!gj1VarA3.a.d0) {
                                        String str10 = MessageFormat.format("Get Backup domain route failed: {0} response: {1}", p20Var4.a(), rm.e(gj1VarA3));
                                        str10.getClass();
                                        kv.n(str10);
                                        qt.q(str10);
                                    }
                                    return (bu0) gj1VarA3.b;
                                } catch (Exception e6) {
                                    String str11 = MessageFormat.format("Get Backup domain route failed: {0} reason: {1}", p20Var4.a(), e6.getLocalizedMessage());
                                    str11.getClass();
                                    kv.o(str11, e6);
                                    qt.q(str11);
                                    return null;
                                }
                        }
                    }
                }));
            }
            HashSet hashSet2 = new HashSet(size4);
            List listA = null;
            boolean z6 = false;
            while (!z6 && hashSet2.size() != size4) {
                int size6 = arrayList4.size();
                boolean z7 = z6;
                int i6 = 0;
                while (true) {
                    if (i6 < size6) {
                        qp qpVar2 = (qp) arrayList4.get(i6);
                        if (!hashSet2.contains(Integer.valueOf(i6)) && qpVar2.isDone()) {
                            try {
                                bu0 bu0Var2 = (bu0) qpVar2.get();
                                String strA2 = ((p20) arrayList3.get(i6)).a();
                                if (bu0Var2 == null) {
                                    kv.n("Speed test failure: " + strA2);
                                    hashSet2.add(Integer.valueOf(i6));
                                } else if (bu0Var2.a() == null || ((r20) bu0Var2.a()).a().isEmpty()) {
                                    kv.F("Get new domain route from backup domain is empty: {}", strA2);
                                    hashSet2.add(Integer.valueOf(i6));
                                } else {
                                    try {
                                        listA = ((r20) bu0Var2.a()).a();
                                        kv.F("Get new domain route from backup domain: {}", strA2);
                                        z6 = true;
                                        break;
                                    } catch (Exception e5) {
                                        e = e5;
                                        z7 = true;
                                        kv.o("Speed test failure: " + ((p20) arrayList3.get(i6)).a(), e);
                                        hashSet2.add(Integer.valueOf(i6));
                                        i6++;
                                    }
                                }
                            } catch (Exception e6) {
                                e = e6;
                            }
                        }
                        i6++;
                    }
                    z6 = z7;
                    break;
                }
            }
            int size7 = arrayList4.size();
            int i7 = 0;
            while (i7 < size7) {
                Object obj4 = arrayList4.get(i7);
                i7++;
                ((qp) obj4).cancel(true);
            }
            kv.E("backup domain get domain route done");
            if (listA == null || listA.isEmpty()) {
                qt.q("backup domain get domain route is empty");
            }
            if (listA == null || listA.isEmpty()) {
                z2 = false;
            } else {
                HashSet hashSet3 = new HashSet(this.b.size());
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    hashSet3.add(ak1.a(((p20) it.next()).a(), true));
                }
                HashSet hashSet4 = new HashSet(listA.size());
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    hashSet4.add(ak1.a(((p20) it2.next()).a(), true));
                }
                z2 = !hashSet3.containsAll(hashSet4);
            }
            if (z2) {
                this.b = listA;
                AppTestApp.w.e(listA);
                return c(false);
            }
        }
        return null;
    }

    public final sx0 d() throws InterruptedException {
        this.d.await();
        kv.E("Fetch domain route");
        List list = this.b;
        if (list == null || list.isEmpty()) {
            String[] strArrSplit = this.a.split("\\s*,[,\\s]*");
            ArrayList arrayList = new ArrayList(strArrSplit.length);
            for (String str : strArrSplit) {
                p20 p20Var = new p20();
                p20Var.b(str.trim());
                arrayList.add(p20Var);
            }
            this.b = arrayList;
            AppTestApp.w.e(arrayList);
        }
        return b(c(true));
    }
}
