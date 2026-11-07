package defpackage;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dk0 implements OutcomeReceiver {
    public final /* synthetic */ int a;

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        String str;
        fk0 fk0Var;
        String str2;
        fk0 fk0Var2;
        fk0 fk0Var3 = null;
        switch (this.a) {
            case 0:
                Exception exc = (Exception) th;
                exc.getClass();
                if (mt.a.contains(ek0.class)) {
                    str = null;
                } else {
                    try {
                        str = ek0.b;
                    } catch (Throwable th2) {
                        mt.a(ek0.class, th2);
                        str = null;
                    }
                }
                Log.d(str, "OUTCOME_RECEIVER_TRIGGER_FAILURE");
                if (mt.a.contains(ek0.class)) {
                    fk0Var = null;
                } else {
                    try {
                        fk0Var = ek0.d;
                    } catch (Throwable th3) {
                        mt.a(ek0.class, th3);
                        fk0Var = null;
                    }
                }
                if (fk0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var3 = fk0Var;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_ara_failed_reason", exc.toString());
                Unit unit = Unit.a;
                fk0Var3.a("gps_ara_failed", bundle);
                break;
            default:
                Exception exc2 = (Exception) th;
                exc2.getClass();
                if (mt.a.contains(ia1.class)) {
                    str2 = null;
                } else {
                    try {
                        str2 = ia1.b;
                    } catch (Throwable th4) {
                        mt.a(ia1.class, th4);
                        str2 = null;
                    }
                }
                Log.e(str2, exc2.toString());
                if (mt.a.contains(ia1.class)) {
                    fk0Var2 = null;
                } else {
                    try {
                        fk0Var2 = ia1.f;
                    } catch (Throwable th5) {
                        mt.a(ia1.class, th5);
                        fk0Var2 = null;
                    }
                }
                if (fk0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    fk0Var3 = fk0Var2;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", exc2.toString());
                Unit unit2 = Unit.a;
                fk0Var3.a("gps_pa_failed", bundle2);
                break;
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        String str;
        fk0 fk0Var;
        String str2;
        fk0 fk0Var2;
        int i = this.a;
        obj.getClass();
        switch (i) {
            case 0:
                if (mt.a.contains(ek0.class)) {
                    str = null;
                } else {
                    try {
                        str = ek0.b;
                    } catch (Throwable th) {
                        mt.a(ek0.class, th);
                        str = null;
                    }
                }
                Log.d(str, "OUTCOME_RECEIVER_TRIGGER_SUCCESS");
                if (mt.a.contains(ek0.class)) {
                    fk0Var = null;
                } else {
                    try {
                        fk0Var = ek0.d;
                    } catch (Throwable th2) {
                        mt.a(ek0.class, th2);
                        fk0Var = null;
                    }
                }
                if (fk0Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    fk0Var = null;
                }
                fk0Var.a("gps_ara_succeed", null);
                break;
            default:
                if (mt.a.contains(ia1.class)) {
                    str2 = null;
                } else {
                    try {
                        str2 = ia1.b;
                    } catch (Throwable th3) {
                        mt.a(ia1.class, th3);
                        str2 = null;
                    }
                }
                Log.i(str2, "Successfully joined custom audience");
                if (mt.a.contains(ia1.class)) {
                    fk0Var2 = null;
                } else {
                    try {
                        fk0Var2 = ia1.f;
                    } catch (Throwable th4) {
                        mt.a(ia1.class, th4);
                        fk0Var2 = null;
                    }
                }
                if (fk0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                    fk0Var2 = null;
                }
                fk0Var2.a("gps_pa_succeed", null);
                break;
        }
    }
}
