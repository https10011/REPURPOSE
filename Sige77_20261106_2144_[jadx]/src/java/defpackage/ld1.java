package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ld1 {
    public static final oi1 a = new oi1();
    public static final Object b = new Object();
    public static mo1 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? jd1.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static mo1 b() {
        mo1 mo1Var = new mo1(8);
        c = mo1Var;
        a.j(mo1Var);
        return c;
    }

    public static void c(boolean z, Context context) {
        kd1 kd1VarA;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    try {
                        if (c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    boolean z2 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z3 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                kd1VarA = kd1.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            kd1VarA = null;
                        }
                        if (kd1VarA != null && kd1VarA.c == jA && (i = kd1VarA.b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (kd1VarA != null && kd1VarA.b == 2 && i3 == 1 && length < kd1VarA.d) {
                            i3 = 3;
                        }
                        kd1 kd1Var = new kd1(1, i3, jA, length2);
                        if (kd1VarA == null || !kd1VarA.equals(kd1Var)) {
                            try {
                                kd1Var.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
