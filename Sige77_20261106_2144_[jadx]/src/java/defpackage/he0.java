package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class he0 {
    public static final a11 a = new a11(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final wq1 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new h4(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new wq1(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((be0) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static ge0 b(String str, Context context, List list, int i) {
        int i2;
        Typeface typefaceK;
        a11 a11Var = a;
        rq0.n("getFontSync");
        try {
            Typeface typeface = (Typeface) a11Var.b(str);
            if (typeface != null) {
                ge0 ge0Var = new ge0(typeface);
                Trace.endSection();
                return ge0Var;
            }
            try {
                f6 f6VarA = ae0.a(context, list);
                List list2 = (List) f6VarA.c;
                int i3 = f6VarA.b;
                if (i3 == 0) {
                    me0[] me0VarArr = (me0[]) list2.get(0);
                    if (me0VarArr == null || me0VarArr.length == 0) {
                        i2 = 1;
                    } else {
                        int length = me0VarArr.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length) {
                                i2 = 0;
                                break;
                            }
                            int i5 = me0VarArr[i4].f;
                            if (i5 != 0) {
                                if (i5 >= 0) {
                                    i2 = i5;
                                    break;
                                }
                                i2 = -3;
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        i2 = -3;
                        break;
                    }
                    i2 = -2;
                }
                if (i2 != 0) {
                    ge0 ge0Var2 = new ge0(i2);
                    Trace.endSection();
                    return ge0Var2;
                }
                if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                    me0[] me0VarArr2 = (me0[]) list2.get(0);
                    gb2 gb2Var = u12.a;
                    rq0.n("TypefaceCompat.createFromFontInfo");
                    try {
                        typefaceK = u12.a.k(context, me0VarArr2, i);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    gb2 gb2Var2 = u12.a;
                    rq0.n("TypefaceCompat.createFromFontInfoWithFallback");
                    try {
                        typefaceK = u12.a.l(context, list2, i);
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                if (typefaceK == null) {
                    ge0 ge0Var3 = new ge0(-3);
                    Trace.endSection();
                    return ge0Var3;
                }
                a11Var.c(str, typefaceK);
                ge0 ge0Var4 = new ge0(typefaceK);
                Trace.endSection();
                return ge0Var4;
            } catch (PackageManager.NameNotFoundException unused) {
                ge0 ge0Var5 = new ge0(-1);
                Trace.endSection();
                return ge0Var5;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
