package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.Profile;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class zj implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ zj(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f1 A[Catch: all -> 0x00fc, NameNotFoundException -> 0x010d, TryCatch #5 {NameNotFoundException -> 0x010d, all -> 0x00fc, blocks: (B:41:0x00c0, B:43:0x00d9, B:45:0x00e1, B:47:0x00f1, B:50:0x00fe, B:52:0x0106), top: B:80:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106 A[Catch: all -> 0x00fc, NameNotFoundException -> 0x010d, TRY_LEAVE, TryCatch #5 {NameNotFoundException -> 0x010d, all -> 0x00fc, blocks: (B:41:0x00c0, B:43:0x00d9, B:45:0x00e1, B:47:0x00f1, B:50:0x00fe, B:52:0x0106), top: B:80:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        AccessToken accessTokenI;
        Profile profile;
        Context contextA;
        Bundle bundle;
        pa paVar;
        Bundle bundle2;
        pa paVar2;
        AccessToken accessTokenT;
        String string;
        Context context = null;
        switch (this.a) {
            case 0:
                return null;
            case 1:
                Context context2 = i90.j;
                if (context2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("applicationContext");
                } else {
                    context = context2;
                }
                return context.getCacheDir();
            default:
                i90 i90Var = i90.a;
                sh1 sh1Var = ac2.Y;
                co coVarN = co.v.n();
                SharedPreferences sharedPreferences = ((x1) coVarN.b).a;
                if (sharedPreferences.contains("com.facebook.AccessTokenManager.CachedAccessToken") && (string = sharedPreferences.getString("com.facebook.AccessTokenManager.CachedAccessToken", null)) != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        Date date = AccessToken.Y;
                        accessTokenI = aj0.i(jSONObject);
                    } catch (JSONException unused) {
                        accessTokenI = null;
                    }
                    break;
                } else {
                    accessTokenI = null;
                }
                if (accessTokenI != null) {
                    coVarN.I(accessTokenI, false);
                }
                ac2 ac2VarC = sh1Var.c();
                String string2 = ((x1) ac2VarC.c).a.getString("com.facebook.ProfileManager.CachedProfile", null);
                if (string2 != null) {
                    try {
                        profile = new Profile(new JSONObject(string2));
                    } catch (JSONException unused2) {
                        profile = null;
                    }
                    break;
                } else {
                    profile = null;
                }
                if (profile != null) {
                    ac2VarC.P(profile, false);
                }
                Date date2 = AccessToken.Y;
                int i = 8;
                if (aj0.v() && ((Profile) sh1Var.c().d) == null && (accessTokenT = aj0.t()) != null) {
                    if (aj0.v()) {
                        h42.o(new c11(i), accessTokenT.e);
                    } else {
                        sh1Var.c().P(null, true);
                    }
                }
                Context contextA2 = i90.a();
                String str = i90.d;
                contextA2.getClass();
                String str2 = pa.c;
                if (!x32.c()) {
                    if (!mt.a.contains(x32.class)) {
                        try {
                            contextA = i90.a();
                            ApplicationInfo applicationInfo = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                            applicationInfo.getClass();
                            bundle = applicationInfo.metaData;
                            if (bundle != null && bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                                paVar = new pa(contextA, (String) null);
                                bundle2 = new Bundle();
                                if (!h42.t()) {
                                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    Log.w("x32", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                }
                                if (x32.c()) {
                                    paVar.d("fb_auto_applink", bundle2);
                                }
                            }
                            break;
                        } catch (PackageManager.NameNotFoundException unused3) {
                        } catch (Throwable th) {
                            mt.a(x32.class, th);
                        }
                    }
                    Context applicationContext = i90.a().getApplicationContext();
                    applicationContext.getClass();
                    paVar2 = new pa(applicationContext, (String) null);
                    if (!mt.a.contains(paVar2)) {
                        try {
                            da.c(1);
                        } catch (Throwable th2) {
                            mt.a(paVar2, th2);
                        }
                    }
                    break;
                } else {
                    pa paVar3 = new pa(contextA2, str);
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutorB = pa.b();
                    if (scheduledThreadPoolExecutorB != null) {
                        scheduledThreadPoolExecutorB.execute(new x4(i, contextA2, paVar3));
                        if (!mt.a.contains(x32.class)) {
                            contextA = i90.a();
                            ApplicationInfo applicationInfo2 = contextA.getPackageManager().getApplicationInfo(contextA.getPackageName(), 128);
                            applicationInfo2.getClass();
                            bundle = applicationInfo2.metaData;
                            if (bundle != null) {
                                paVar = new pa(contextA, (String) null);
                                bundle2 = new Bundle();
                                if (!h42.t()) {
                                    bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                    Log.w("x32", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                                }
                                if (x32.c()) {
                                    paVar.d("fb_auto_applink", bundle2);
                                }
                            }
                        }
                        Context applicationContext2 = i90.a().getApplicationContext();
                        applicationContext2.getClass();
                        paVar2 = new pa(applicationContext2, (String) null);
                        if (!mt.a.contains(paVar2)) {
                            da.c(1);
                        }
                    } else {
                        uq1.q("Required value was null.");
                    }
                    break;
                }
                return null;
        }
    }
}
