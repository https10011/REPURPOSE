package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class ur implements v71, nq, ca0, Continuation, r70, ij0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ur(qp0 qp0Var) {
        this.a = 27;
    }

    public static /* synthetic */ void a() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void b(Object obj, String str) throws FileNotFoundException {
        throw new FileNotFoundException(str + obj);
    }

    public static /* synthetic */ void c(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // defpackage.nq
    public Object d(co coVar) {
        switch (this.a) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                Set setC = coVar.c(je1.a(td.class));
                kj0 kj0Var = kj0.c;
                if (kj0Var == null) {
                    synchronized (kj0.class) {
                        try {
                            kj0Var = kj0.c;
                            if (kj0Var == null) {
                                kj0Var = new kj0(0);
                                kj0.c = kj0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                }
                return new d00(setC, kj0Var);
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
            case oc1.LONG_FIELD_NUMBER /* 4 */:
            default:
                return FirebaseInstallationsRegistrar.a(coVar);
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                wv0 wv0Var = ExecutorsRegistrar.a;
                return h22.a;
        }
    }

    @Override // defpackage.v71
    public Object e() {
        switch (this.a) {
            case 0:
                return new LinkedHashMap();
            default:
                return new TreeMap();
        }
    }

    @Override // defpackage.ca0
    public void f(boolean z) {
        switch (this.a) {
            case 10:
                i90 i90Var = i90.a;
                if (z && x32.c()) {
                    fa0.a(new sm0(2), da0.CrashReport);
                    fa0.a(new sm0(3), da0.ErrorReport);
                    fa0.a(new sm0(4), da0.AnrReport);
                    break;
                }
                break;
            case 11:
                i90 i90Var2 = i90.a;
                if (z && !mt.a.contains(ta.class)) {
                    try {
                        ma0.e.add(new sa());
                        ma0.d();
                    } catch (Throwable th) {
                        mt.a(ta.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 12:
                if (!z) {
                    i90 i90Var3 = i90.a;
                } else {
                    i90.n = true;
                }
                break;
            case 13:
                if (!z) {
                    i90 i90Var4 = i90.a;
                } else {
                    i90.o = true;
                }
                break;
            default:
                if (!z) {
                    i90 i90Var5 = i90.a;
                } else {
                    i90.p = true;
                }
                break;
        }
    }

    @Override // defpackage.ij0
    public Object get() {
        boolean z = false;
        if (Build.VERSION.SDK_INT == 34) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
            Bitmap bitmapCopy = bitmapCreateBitmap.copy(Bitmap.Config.HARDWARE, false);
            bitmapCreateBitmap.recycle();
            z = bitmapCopy == null;
            if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                Log.v("GainmapWorkaroundCalc", "calculateNeedsGainmapDecodeWorkaround=" + z);
            }
            if (bitmapCopy != null) {
                bitmapCopy.recycle();
            }
        }
        return Boolean.valueOf(z);
    }

    public Object then(Task task) throws IOException {
        int i;
        switch (this.a) {
            case 15:
                i = 403;
                break;
            case 16:
                i = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    uq1.o("SERVICE_NOT_AVAILABLE");
                    return null;
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    uq1.o("INSTANCE_ID_RESET");
                    return null;
                }
                if (string2 != null) {
                    uq1.o(string2);
                    return null;
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                uq1.o("SERVICE_NOT_AVAILABLE");
                return null;
        }
        return Integer.valueOf(i);
    }

    public /* synthetic */ ur(int i) {
        this.a = i;
    }
}
