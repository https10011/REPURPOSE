package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.adjust.sdk.AdjustInstance;
import java.lang.ref.WeakReference;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final /* synthetic */ class t5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ t5(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 2;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    @Override // java.lang.Runnable
    public final void run() {
        qz0 qz0Var;
        Object systemService;
        Context context;
        int i = this.a;
        Context context2 = this.b;
        switch (i) {
            case 0:
                AdjustInstance.c(context2);
                break;
            case 1:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i2 >= 33) {
                            ob obVar = y7.i;
                            obVar.getClass();
                            ib ibVar = new ib(obVar);
                            while (true) {
                                if (ibVar.hasNext()) {
                                    y7 y7Var = (y7) ((WeakReference) ibVar.next()).get();
                                    if (y7Var != null && (context = ((k8) y7Var).X) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                qz0Var = new qz0(new rz0(w7.a(systemService)));
                            } else {
                                qz0Var = qz0.b;
                            }
                        } else {
                            qz0Var = y7.c;
                            if (qz0Var == null) {
                                qz0Var = qz0.b;
                            }
                        }
                        if (qz0Var.a.a.isEmpty()) {
                            String strX = ea.x(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                w7.b(systemService2, v7.a(strX));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                y7.f = true;
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                (Build.VERSION.SDK_INT >= 28 ? id1.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new t5(context2, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new t5(context2, 4));
                break;
            default:
                ta.H(context2, new w21(), ta.b, false);
                break;
        }
    }

    public /* synthetic */ t5(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
