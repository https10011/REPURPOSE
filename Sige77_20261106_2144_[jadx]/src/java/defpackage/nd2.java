package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class nd2 {
    public static volatile nd2 e;
    public boolean a;
    public Object b;
    public Serializable c;
    public Object d;

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hc.h.getFilesDir());
        String str2 = File.separator;
        this.c = ts.l(sb, str2, str);
        if (!b()) {
            this.c = hc.h.getFilesDir().getPath();
        }
        this.d = y00.l(new StringBuilder(), (String) this.c, str2, "remote_config.cfg");
    }

    public boolean b() {
        if (!this.a) {
            File file = new File((String) this.c);
            try {
                if (file.exists()) {
                    this.a = true;
                } else {
                    this.a = file.mkdirs();
                }
            } catch (Exception e2) {
                cc2.c(Log.getStackTraceString(e2));
            }
        }
        return this.a;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty((String) this.c) && b()) {
            File file = new File((String) this.d);
            try {
                x91.d(file, str, (byte[]) this.b);
            } catch (Exception e2) {
                gf2.b.a(new oc2("bufferSave", e2));
                try {
                    if (file.isDirectory()) {
                        nj2.e(hc.h, (String) this.d);
                    }
                } catch (Exception unused) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public String d() {
        if (TextUtils.isEmpty((String) this.c) || !b()) {
            return null;
        }
        File file = new File((String) this.d);
        try {
            return x91.b(file, (byte[]) this.b);
        } catch (Exception e2) {
            try {
                Bundle bundle = new Bundle();
                bundle.putString("e", e2.getClass().getSimpleName());
                bundle.putString("pwd", rq0.o((byte[]) this.b));
                bundle.putLong("len", file.length());
                gf2.b.a(new oc2("bufferRead", bundle));
                nj2.n(hc.h, file);
                return null;
            } catch (Exception unused) {
                e2.printStackTrace();
                return null;
            }
        }
    }

    public synchronized void e() {
        try {
            if (this.a) {
                return;
            }
            Boolean boolG = g();
            this.c = boolG;
            if (boolG == null) {
                ur urVar = new ur(23);
                o70 o70Var = (o70) ((uu1) this.b);
                o70Var.a(o70Var.c, urVar);
            }
            this.a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean f() {
        boolean z;
        boolean zBooleanValue;
        try {
            e();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                hc0 hc0Var = ((FirebaseMessaging) this.d).a;
                hc0Var.a();
                iw iwVar = (iw) hc0Var.g.get();
                synchronized (iwVar) {
                    z = iwVar.a;
                }
                zBooleanValue = z;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public Boolean g() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        hc0 hc0Var = ((FirebaseMessaging) this.d).a;
        hc0Var.a();
        Context context = hc0Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
