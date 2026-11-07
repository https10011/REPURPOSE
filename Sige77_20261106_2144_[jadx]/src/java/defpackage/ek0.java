package defpackage;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ek0 {
    public static final ek0 a = new ek0();
    public static final String b;
    public static boolean c;
    public static fk0 d;
    public static String e;

    static {
        String string = ek0.class.toString();
        string.getClass();
        b = string;
    }

    public final boolean a() {
        String str = b;
        if (mt.a.contains(this)) {
            return false;
        }
        try {
            if (!c || Build.VERSION.SDK_INT < 33) {
                return false;
            }
            fk0 fk0Var = null;
            try {
                Class.forName("android.adservices.measurement.MeasurementManager");
                Class.forName("android.os.OutcomeReceiver");
                return true;
            } catch (Error e2) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                fk0 fk0Var2 = d;
                if (fk0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var = fk0Var2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", e2.toString());
                Unit unit = Unit.a;
                fk0Var.a("gps_ara_failed", bundle);
                return false;
            } catch (Exception e3) {
                Log.i(str, "FAILURE_NO_MEASUREMENT_MANAGER_CLASS");
                fk0 fk0Var3 = d;
                if (fk0Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var = fk0Var3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_ara_failed_reason", e3.toString());
                Unit unit2 = Unit.a;
                fk0Var.a("gps_ara_failed", bundle2);
                return false;
            }
        } catch (Throwable th) {
            mt.a(this, th);
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    public final String b(z9 z9Var) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = z9Var.a;
            if (jSONObject != null && jSONObject.length() != 0) {
                Iterator<String> itKeys = jSONObject.keys();
                itKeys.getClass();
                this = uo1.b(new wb0(new wb0(ro1.a(itKeys), new ux(jSONObject, 1), 2), new ws(5), 0), "&");
                return this;
            }
            return BuildConfig.FLAVOR;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public final void c(String str, z9 z9Var) {
        String str2 = b;
        Set set = mt.a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (set.contains(this)) {
                return;
            }
            try {
                String string = z9Var.a.getString("_eventName");
                if (Intrinsics.areEqual(string, "_removed_")) {
                    return;
                }
                string.getClass();
                if (!StringsKt.t(string, "gps") && a()) {
                    Context contextA = i90.a();
                    fk0 fk0Var = null;
                    try {
                        MeasurementManager measurementManagerR = vi0.r(contextA.getSystemService(vi0.s()));
                        if (measurementManagerR == null) {
                            measurementManagerR = MeasurementManager.get(contextA.getApplicationContext());
                        }
                        if (measurementManagerR == null) {
                            Log.w(str2, "FAILURE_GET_MEASUREMENT_MANAGER");
                            fk0 fk0Var2 = d;
                            if (fk0Var2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                                fk0Var2 = null;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("gps_ara_failed_reason", "Failed to get measurement manager");
                            Unit unit = Unit.a;
                            fk0Var2.a("gps_ara_failed", bundle);
                            return;
                        }
                        String strB = b(z9Var);
                        StringBuilder sb = new StringBuilder();
                        String str3 = e;
                        if (str3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("serverUri");
                            str3 = null;
                        }
                        sb.append(str3);
                        sb.append("?app_id=");
                        sb.append(str);
                        sb.append('&');
                        sb.append(strB);
                        Uri uri = Uri.parse(sb.toString());
                        uri.getClass();
                        measurementManagerR.registerTrigger(uri, i90.c(), new dk0(0));
                    } catch (Error e2) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        fk0 fk0Var3 = d;
                        if (fk0Var3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            fk0Var = fk0Var3;
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("gps_ara_failed_reason", e2.toString());
                        Unit unit2 = Unit.a;
                        fk0Var.a("gps_ara_failed", bundle2);
                    } catch (Exception e3) {
                        Log.w(str2, "FAILURE_TRIGGER_REGISTRATION_FAILED");
                        fk0 fk0Var4 = d;
                        if (fk0Var4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                        } else {
                            fk0Var = fk0Var4;
                        }
                        Bundle bundle3 = new Bundle();
                        bundle3.putString("gps_ara_failed_reason", e3.toString());
                        Unit unit3 = Unit.a;
                        fk0Var.a("gps_ara_failed", bundle3);
                    }
                }
            } catch (Throwable th) {
                mt.a(this, th);
            }
        } catch (Throwable th2) {
            mt.a(this, th2);
        }
    }

    public final void d(String str, z9 z9Var) {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            i90.c().execute(new ck0(str, z9Var, 0));
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }
}
