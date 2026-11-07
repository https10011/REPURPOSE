package defpackage;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import com.hjq.toast.BuildConfig;
import com.hjq.toast.ToastUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class yn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ yn(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences = null;
        Locale locale = null;
        switch (this.a) {
            case 0:
                String str = this.b;
                if (!mt.a.contains(zn.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        nc ncVarT = kv.t(i90.a());
                        JSONArray jSONArray = new JSONArray();
                        String str2 = Build.MODEL;
                        if (str2 == null) {
                            str2 = BuildConfig.FLAVOR;
                        }
                        jSONArray.put(str2);
                        if ((ncVarT != null ? ncVarT.a() : null) != null) {
                            jSONArray.put(ncVarT.a());
                        } else {
                            jSONArray.put(BuildConfig.FLAVOR);
                        }
                        jSONArray.put("0");
                        jSONArray.put(ga.p() ? "1" : "0");
                        try {
                            locale = i90.a().getResources().getConfiguration().locale;
                            break;
                        } catch (Exception unused) {
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            locale.getClass();
                        }
                        jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                        String string = jSONArray.toString();
                        string.getClass();
                        bundle.putString("device_session_id", zn.a());
                        bundle.putString("extinfo", string);
                        String str3 = mk0.j;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        boolean z = true;
                        JSONObject jSONObject = new mk0(null, String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1)), bundle, nm0.b, null).c().b;
                        AtomicBoolean atomicBoolean = zn.g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z = false;
                        }
                        atomicBoolean.set(z);
                        if (atomicBoolean.get()) {
                            i62 i62Var = zn.d;
                            if (i62Var != null) {
                                i62Var.c();
                            }
                        } else {
                            zn.e = null;
                        }
                        zn.h = false;
                    } catch (Throwable th) {
                        mt.a(zn.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                ToastUtils.show((CharSequence) this.b);
                break;
            default:
                String str4 = this.b;
                if (!mt.a.contains(t32.class)) {
                    try {
                        str4.getClass();
                        if (!t32.c.get()) {
                            t32.a.b();
                        }
                        SharedPreferences sharedPreferences2 = t32.b;
                        if (sharedPreferences2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sharedPreferences");
                        } else {
                            sharedPreferences = sharedPreferences2;
                        }
                        sharedPreferences.edit().putString("com.facebook.appevents.UserDataStore.internalUserData", str4).apply();
                    } catch (Throwable th2) {
                        mt.a(t32.class, th2);
                    }
                    break;
                }
                break;
        }
    }
}
