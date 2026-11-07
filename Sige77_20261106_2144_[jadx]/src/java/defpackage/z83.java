package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzoh;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z83 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public z83(lc3 lc3Var, ja3 ja3Var) {
        this.a = 5;
        this.c = ja3Var;
        Objects.requireNonNull(lc3Var);
        this.b = lc3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        objArr = 0;
        Object[] objArr = 0;
        int i = 1;
        switch (this.a) {
            case 0:
                ((w93) this.b).V((Boolean) this.c, true);
                return;
            case 1:
                w93 w93Var = (w93) this.b;
                y53 y53Var = (y53) w93Var.a;
                h43 h43Var = y53Var.e;
                c33 c33Var = y53Var.f;
                y53.j(h43Var);
                h43Var.D();
                h43Var.D();
                pu2 pu2VarB = pu2.b(h43Var.I().getString("dma_consent_settings", null));
                pu2 pu2Var = (pu2) this.c;
                int i2 = pu2Var.a;
                if (!p73.l(i2, pu2VarB.a)) {
                    y53.l(c33Var);
                    c33Var.Y.b(Integer.valueOf(i2), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = h43Var.I().edit();
                editorEdit.putString("dma_consent_settings", pu2Var.b);
                editorEdit.apply();
                y53.l(c33Var);
                c33Var.a0.b(pu2Var, "Setting DMA consent(FE)");
                y53 y53Var2 = (y53) w93Var.a;
                if (y53Var2.o().O()) {
                    lc3 lc3VarO = y53Var2.o();
                    lc3VarO.D();
                    lc3VarO.F();
                    lc3VarO.S(new ec3(lc3VarO, i));
                    return;
                }
                lc3 lc3VarO2 = y53Var2.o();
                lc3VarO2.D();
                lc3VarO2.F();
                if (lc3VarO2.N()) {
                    lc3VarO2.S(new gb3(lc3VarO2, lc3VarO2.U(false)));
                    return;
                }
                return;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                w93 w93Var2 = ((AppMeasurementDynamiteService) this.b).a.Z;
                y53.k(w93Var2);
                rd2 rd2Var = (rd2) this.c;
                w93Var2.D();
                w93Var2.F();
                rd2 rd2Var2 = w93Var2.d;
                if (rd2Var != rd2Var2) {
                    gu2.q("EventInterceptor already set.", rd2Var2 == null);
                }
                w93Var2.d = rd2Var;
                return;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                w93 w93Var3 = (w93) this.b;
                w93Var3.D();
                if (Build.VERSION.SDK_INT < 30) {
                    return;
                }
                List<zzoh> list = (List) this.c;
                h43 h43Var2 = ((y53) w93Var3.a).e;
                y53.j(h43Var2);
                SparseArray sparseArrayK = h43Var2.K();
                for (zzoh zzohVar : list) {
                    int i3 = zzohVar.c;
                    if (!sparseArrayK.contains(i3) || ((Long) sparseArrayK.get(i3)).longValue() < zzohVar.b) {
                        w93Var3.c0().add(zzohVar);
                    }
                }
                w93Var3.d0();
                return;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                y53 y53Var3 = (y53) ((w93) this.b).a;
                e23 e23VarQ = y53Var3.q();
                String str = (String) this.c;
                String str2 = e23VarQ.e0;
                if (str2 != null && !str2.equals(str)) {
                    objArr = 1;
                }
                e23VarQ.e0 = str;
                if (objArr != 0) {
                    y53Var3.q().J();
                    return;
                }
                return;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                lc3 lc3Var = (lc3) this.b;
                n13 n13Var = lc3Var.d;
                y53 y53Var4 = (y53) lc3Var.a;
                if (n13Var == null) {
                    c33 c33Var2 = y53Var4.f;
                    y53.l(c33Var2);
                    c33Var2.f.a("Failed to send current screen to service");
                    return;
                }
                try {
                    ja3 ja3Var = (ja3) this.c;
                    if (ja3Var == null) {
                        n13Var.l(0L, null, null, y53Var4.a.getPackageName());
                    } else {
                        n13Var.l(ja3Var.c, ja3Var.a, ja3Var.b, y53Var4.a.getPackageName());
                    }
                    lc3Var.R();
                    return;
                } catch (RemoteException e) {
                    c33 c33Var3 = ((y53) lc3Var.a).f;
                    y53.l(c33Var3);
                    c33Var3.f.b(e, "Failed to send current screen to the service");
                    return;
                }
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                ((gc3) this.b).c.P((ComponentName) this.c);
                return;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                xe3 xe3Var = (xe3) this.c;
                int i4 = ((xg3) this.b).a;
                synchronized (xe3Var) {
                    xg3 xg3Var = (xg3) xe3Var.e.get(i4);
                    if (xg3Var != null) {
                        Log.w("MessengerIpcClient", "Timing out request: " + i4);
                        xe3Var.e.remove(i4);
                        xg3Var.b(new nc0("Timed out waiting for response", (Throwable) null));
                        xe3Var.c();
                    }
                    break;
                }
                return;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                lc3 lc3Var2 = ((gc3) this.b).c;
                lc3Var2.d = null;
                if (((ConnectionResult) this.c).b != 7777) {
                    lc3Var2.T();
                    return;
                }
                if (lc3Var2.i == null) {
                    lc3Var2.i = Executors.newScheduledThreadPool(1);
                }
                lc3Var2.i.schedule(new aj2(this, 5), ((Long) h13.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 9:
                if3 if3Var = (if3) this.c;
                if3Var.V();
                Runnable runnable = (Runnable) this.b;
                if3Var.e().D();
                if (if3Var.c0 == null) {
                    if3Var.c0 = new ArrayList();
                }
                if3Var.c0.add(runnable);
                if3Var.q();
                return;
            case 10:
                ox1 ox1Var = (ox1) this.c;
                JobParameters jobParameters = (JobParameters) this.b;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((sc3) ((Service) ox1Var.a)).b(jobParameters);
                return;
            case 11:
                Context context = ((y93) this.c).b;
                lh1 lh1VarC = wy2.b0;
                if (lh1VarC == null) {
                    synchronized (wy2.a0) {
                        lh1VarC = wy2.b0;
                        if (lh1VarC == null) {
                            q8 q8Var = new q8(4);
                            try {
                                String[] list2 = context.getAssets().list("phenotype");
                                if (list2 != null) {
                                    for (String str3 : list2) {
                                        if (str3.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str3.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str3);
                                                InputStream inputStreamOpen = assets.open(sb.toString());
                                                try {
                                                    vl2 vl2Var = vl2.b;
                                                    int i5 = yk2.a;
                                                    wy2 wy2Var = new wy2(context, rf3.v(inputStreamOpen, vl2.c));
                                                    q8Var.h(wy2Var.b, wy2Var);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th2) {
                                                            th.addSuppressed(th2);
                                                        }
                                                        break;
                                                    }
                                                    throw th;
                                                }
                                            } catch (xm2 e2) {
                                                StringBuilder sb2 = new StringBuilder(str3.length() + 45);
                                                sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                sb2.append(str3);
                                                Log.e("PackageInfo", sb2.toString(), e2);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e3) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e3);
                            }
                            lh1VarC = q8Var.c(true);
                            wy2.b0 = lh1VarC;
                        }
                    }
                }
                String str4 = (String) this.b;
                if (lh1VarC.containsKey(str4)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 173);
                sb3.append("Config package ");
                sb3.append(str4);
                sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb3.toString());
                return;
            default:
                this.c = null;
                this.b = null;
                return;
        }
    }

    public /* synthetic */ z83(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj2;
        this.b = obj;
    }

    public /* synthetic */ z83(int i, Object obj, Object obj2, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public z83(ox1 ox1Var, if3 if3Var, Runnable runnable) {
        this.a = 9;
        this.c = if3Var;
        this.b = runnable;
    }

    public /* synthetic */ z83() {
        this.a = 12;
    }
}
