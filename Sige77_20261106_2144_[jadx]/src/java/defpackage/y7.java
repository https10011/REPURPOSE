package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class y7 {
    public static final x7 a = new x7(new iz2(2));
    public static final int b = -100;
    public static qz0 c = null;
    public static qz0 d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final ob i = new ob(0);
    public static final Object v = new Object();
    public static final Object w = new Object();

    public static boolean d(Context context) {
        if (e == null) {
            try {
                int i2 = ya.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ya.class), xa.a() | 128).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void h(k8 k8Var) {
        synchronized (v) {
            try {
                ob obVar = i;
                obVar.getClass();
                ib ibVar = new ib(obVar);
                while (ibVar.hasNext()) {
                    y7 y7Var = (y7) ((WeakReference) ibVar.next()).get();
                    if (y7Var == k8Var || y7Var == null) {
                        ibVar.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void a();

    public abstract void b();

    public abstract void e();

    public abstract void f();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract e4 n(d4 d4Var);
}
