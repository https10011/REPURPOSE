package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.hjq.toast.BuildConfig;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hc0 {
    public static final Object j = new Object();
    public static final mb k = new mb(0);
    public final Context a;
    public final String b;
    public final xc0 c;
    public final qq d;
    public final wv0 g;
    public final zd1 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public hc0(Context context, String str, xc0 xc0Var) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        gu2.l(str);
        this.b = str;
        this.c = xc0Var;
        ee eeVar = FirebaseInitProvider.a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new mq((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        h22 h22Var = h22.a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new mq(new FirebaseCommonRegistrar(), i2));
        arrayList3.add(new mq(new ExecutorsRegistrar(), i2));
        arrayList4.add(aq.c(context, Context.class, new Class[0]));
        arrayList4.add(aq.c(this, hc0.class, new Class[0]));
        arrayList4.add(aq.c(xc0Var, xc0.class, new Class[0]));
        gp1 gp1Var = new gp1(4);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.b.get()) {
            arrayList4.add(aq.c(eeVar, ee.class, new Class[0]));
        }
        h22 h22Var2 = h22.a;
        qq qqVar = new qq();
        qqVar.a = new HashMap();
        qqVar.b = new HashMap();
        qqVar.c = new HashMap();
        qqVar.d = new HashSet();
        qqVar.f = new AtomicReference();
        o70 o70Var = new o70();
        qqVar.e = o70Var;
        qqVar.i = gp1Var;
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(aq.c(o70Var, o70.class, uu1.class, de1.class));
        arrayList5.add(aq.c(qqVar, qq.class, new Class[0]));
        int size = arrayList4.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList4.get(i3);
            i3++;
            aq aqVar = (aq) obj;
            if (aqVar != null) {
                arrayList5.add(aqVar);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            arrayList6.add(obj2);
        }
        ArrayList arrayList7 = new ArrayList();
        synchronized (qqVar) {
            Iterator it2 = arrayList6.iterator();
            while (it2.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((zd1) it2.next()).get();
                    if (componentRegistrar != null) {
                        arrayList5.addAll(((gp1) qqVar.i).o(componentRegistrar));
                        it2.remove();
                    }
                } catch (vr0 e) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                for (Object obj3 : ((aq) it3.next()).b.toArray()) {
                    if (obj3.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) qqVar.d).contains(obj3.toString())) {
                            it3.remove();
                            break;
                        }
                        ((HashSet) qqVar.d).add(obj3.toString());
                    }
                }
            }
            if (((HashMap) qqVar.a).isEmpty()) {
                bj0.g(arrayList5);
            } else {
                ArrayList arrayList8 = new ArrayList(((HashMap) qqVar.a).keySet());
                arrayList8.addAll(arrayList5);
                bj0.g(arrayList8);
            }
            int size3 = arrayList5.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj4 = arrayList5.get(i5);
                i5++;
                aq aqVar2 = (aq) obj4;
                ((HashMap) qqVar.a).put(aqVar2, new wv0(new pq(i, qqVar, aqVar2)));
            }
            arrayList7.addAll(qqVar.i(arrayList5));
            arrayList7.addAll(qqVar.j());
            qqVar.h();
        }
        int size4 = arrayList7.size();
        while (i < size4) {
            Object obj5 = arrayList7.get(i);
            i++;
            ((Runnable) obj5).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) qqVar.f).get();
        if (bool != null) {
            qqVar.d((HashMap) qqVar.a, bool.booleanValue());
        }
        this.d = qqVar;
        Trace.endSection();
        this.g = new wv0(new pq(2, this, context));
        this.h = qqVar.e(az.class);
        ec0 ec0Var = new ec0(this);
        a();
        if (this.e.get()) {
            se.e.a.get();
        }
        this.i.add(ec0Var);
        Trace.endSection();
    }

    public static ArrayList c() {
        ArrayList arrayList = new ArrayList();
        synchronized (j) {
            try {
                for (hc0 hc0Var : (lb) k.values()) {
                    hc0Var.a();
                    arrayList.add(hc0Var.b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static hc0 d() {
        hc0 hc0Var;
        synchronized (j) {
            try {
                hc0Var = (hc0) k.get("[DEFAULT]");
                if (hc0Var == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + dw0.h() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((az) hc0Var.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hc0Var;
    }

    public static hc0 e(String str) {
        hc0 hc0Var;
        String str2;
        synchronized (j) {
            try {
                hc0Var = (hc0) k.get(str.trim());
                if (hc0Var == null) {
                    ArrayList arrayListC = c();
                    if (arrayListC.isEmpty()) {
                        str2 = BuildConfig.FLAVOR;
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListC);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((az) hc0Var.h.get()).a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return hc0Var;
    }

    public static hc0 h(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return d();
                }
                xc0 xc0VarA = xc0.a(context);
                if (xc0VarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return i(context, xc0VarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static hc0 i(Context context, xc0 xc0Var) {
        hc0 hc0Var;
        AtomicReference atomicReference = fc0.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = fc0.a;
            if (atomicReference2.get() == null) {
                fc0 fc0Var = new fc0();
                do {
                    if (atomicReference2.compareAndSet(null, fc0Var)) {
                        se.b(application);
                        se.e.a(fc0Var);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            mb mbVar = k;
            gu2.q("FirebaseApp name [DEFAULT] already exists!", !mbVar.containsKey("[DEFAULT]"));
            gu2.p(context, "Application context cannot be null.");
            hc0Var = new hc0(context, "[DEFAULT]", xc0Var);
            mbVar.put("[DEFAULT]", hc0Var);
        }
        hc0Var.g();
        return hc0Var;
    }

    public final void a() {
        gu2.q("FirebaseApp was deleted", !this.f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc0)) {
            return false;
        }
        hc0 hc0Var = (hc0) obj;
        hc0Var.a();
        return this.b.equals(hc0Var.b);
    }

    public final String f() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(ga.i(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(ga.i(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void g() {
        HashMap map;
        if (!((UserManager) this.a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = gc0.b;
            if (atomicReference.get() == null) {
                gc0 gc0Var = new gc0(context);
                while (!atomicReference.compareAndSet(null, gc0Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(gc0Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        qq qqVar = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) qqVar.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((az) this.h.get()).a();
            }
        }
        synchronized (qqVar) {
            map = new HashMap((HashMap) qqVar.a);
        }
        qqVar.d(map, zEquals);
        ((az) this.h.get()).a();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        hs1 hs1Var = new hs1(this);
        hs1Var.e(this.b, "name");
        hs1Var.e(this.c, "options");
        return hs1Var.toString();
    }
}
