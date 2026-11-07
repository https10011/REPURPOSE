package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class pq implements zd1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pq(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zd1
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.a;
        boolean z = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                qq qqVar = (qq) obj2;
                aq aqVar = (aq) obj;
                nq nqVar = aqVar.f;
                co coVar = new co();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                HashSet hashSet4 = new HashSet();
                HashSet hashSet5 = new HashSet();
                Set<u00> set = aqVar.c;
                Set set2 = aqVar.g;
                for (u00 u00Var : set) {
                    int i2 = u00Var.c;
                    int i3 = u00Var.b;
                    boolean z2 = i2 == 0 ? z : false;
                    je1 je1Var = u00Var.a;
                    if (z2) {
                        if (i3 == 2) {
                            hashSet4.add(je1Var);
                        } else {
                            hashSet.add(je1Var);
                        }
                    } else if (i2 == 2) {
                        hashSet3.add(je1Var);
                    } else if (i3 == 2) {
                        hashSet5.add(je1Var);
                    } else {
                        hashSet2.add(je1Var);
                    }
                    z = true;
                }
                if (!set2.isEmpty()) {
                    hashSet.add(je1.a(de1.class));
                }
                coVar.b = Collections.unmodifiableSet(hashSet);
                coVar.a = Collections.unmodifiableSet(hashSet2);
                Collections.unmodifiableSet(hashSet3);
                coVar.c = Collections.unmodifiableSet(hashSet4);
                coVar.d = Collections.unmodifiableSet(hashSet5);
                coVar.e = qqVar;
                return nqVar.d(coVar);
            case 1:
                return new zl0((Context) obj2, (String) obj);
            default:
                hc0 hc0Var = (hc0) obj2;
                String strF = hc0Var.f();
                iw iwVar = new iw();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strF), 0);
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                iwVar.a = z;
                return iwVar;
        }
    }
}
