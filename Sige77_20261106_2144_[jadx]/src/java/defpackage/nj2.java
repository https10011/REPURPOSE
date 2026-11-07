package defpackage;

import android.animation.TimeInterpolator;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import com.google.android.gms.common.api.Status;
import com.hjq.toast.BuildConfig;
import com.transsion.athena.AthenaConfig;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class nj2 {
    public static final bk0 a = new bk0(new ur(26));
    public static final int[] b = {1, 0, 0, -1, -1, -1, -1};
    public static final int[] c = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] d = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};
    public static final sy2 e = new sy2(7);
    public static final nf3 f = new nf3(l13.class, cv2.class);
    public static boolean g;
    public static Method h;
    public static boolean i;
    public static Field j;
    public static String k;
    public static WeakReference l;

    public static File A(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static String B(Context context) {
        try {
            return context.getPackageName();
        } catch (Exception e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return BuildConfig.FLAVOR;
        }
    }

    public static int C(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(B(context), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            cc2.c(Log.getStackTraceString(e2));
            return 0;
        }
    }

    public static void D(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        jArr2[0] = j2 & 1152921504606846975L;
        jArr2[1] = ((j2 >>> 60) ^ (j3 << 4)) & 1152921504606846975L;
        jArr2[2] = ((j3 >>> 56) ^ (j4 << 8)) & 1152921504606846975L;
        jArr2[3] = (j4 >>> 52) ^ (j5 << 12);
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        D(jArr, jArr4);
        D(jArr2, jArr5);
        F(jArr4[0], jArr5[0], jArr3, 0);
        F(jArr4[1], jArr5[1], jArr3, 1);
        F(jArr4[2], jArr5[2], jArr3, 2);
        F(jArr4[3], jArr5[3], jArr3, 3);
        for (int i2 = 5; i2 > 0; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 1];
        }
        F(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        F(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j2 = jArr4[0] ^ jArr4[2];
        long j3 = jArr4[1] ^ jArr4[3];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr5[3] ^ jArr5[1];
        F(j2 ^ j3, j4 ^ j5, jArr3, 3);
        long[] jArr6 = new long[3];
        F(j2, j4, jArr6, 0);
        F(j3, j5, jArr6, 1);
        long j6 = jArr6[0];
        long j7 = jArr6[1];
        long j8 = jArr6[2];
        long j9 = jArr3[2] ^ j6;
        jArr3[2] = j9;
        long j10 = (j6 ^ j7) ^ jArr3[3];
        jArr3[3] = j10;
        long j11 = (j7 ^ j8) ^ jArr3[4];
        jArr3[4] = j11;
        long j12 = j8 ^ jArr3[5];
        jArr3[5] = j12;
        long j13 = jArr3[0];
        long j14 = jArr3[1];
        long j15 = jArr3[6];
        long j16 = jArr3[7];
        jArr3[0] = j13 ^ (j14 << 60);
        jArr3[1] = (j14 >>> 4) ^ (j9 << 56);
        jArr3[2] = (j9 >>> 8) ^ (j10 << 52);
        jArr3[3] = (j10 >>> 12) ^ (j11 << 48);
        jArr3[4] = (j11 >>> 16) ^ (j12 << 44);
        jArr3[5] = (j12 >>> 20) ^ (j15 << 40);
        jArr3[6] = (j15 >>> 24) ^ (j16 << 36);
        jArr3[7] = j16 >>> 28;
    }

    public static void F(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i3 = (int) j2;
        long j8 = (jArr2[(i3 >>> 3) & 7] << 3) ^ jArr2[i3 & 7];
        long j9 = 0;
        int i4 = 54;
        do {
            int i5 = (int) (j2 >>> i4);
            long j10 = jArr2[i5 & 7] ^ (jArr2[(i5 >>> 3) & 7] << 3);
            j8 ^= j10 << i4;
            j9 ^= j10 >>> (-i4);
            i4 -= 6;
        } while (i4 > 0);
        jArr[i2] = jArr[i2] ^ (1152921504606846975L & j8);
        int i6 = i2 + 1;
        jArr[i6] = ((((((j2 & 585610922974906400L) & ((j3 << 4) >> 63)) >>> 5) ^ j9) << 4) ^ (j8 >>> 60)) ^ jArr[i6];
    }

    public static void G(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
        bj0.k(4, jArr[2], jArr2);
        long j2 = jArr[3];
        jArr2[6] = bj0.j((int) j2);
        jArr2[7] = ((long) bj0.i((int) (j2 >>> 32))) & 4294967295L;
    }

    public static boolean H() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static String J(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo(B(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return BuildConfig.FLAVOR;
        }
    }

    public static MappedByteBuffer K(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    public static void L(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        g93.x(iArr, iArr2, iArr4);
        N(iArr4, iArr3);
    }

    public static void M(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        E(jArr, jArr2, jArr4);
        O(jArr4, jArr3);
    }

    public static void N(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[10]) & 4294967295L;
        long j3 = ((long) iArr[11]) & 4294967295L;
        long j4 = ((long) iArr[12]) & 4294967295L;
        long j5 = ((long) iArr[13]) & 4294967295L;
        long j6 = ((((long) iArr[7]) & 4294967295L) + j3) - 1;
        long j7 = (((long) iArr[8]) & 4294967295L) + j4;
        long j8 = (((long) iArr[9]) & 4294967295L) + j5;
        long j9 = (((long) iArr[0]) & 4294967295L) - j6;
        long j10 = j9 & 4294967295L;
        long j11 = ((((long) iArr[1]) & 4294967295L) - j7) + (j9 >> 32);
        int i2 = (int) j11;
        iArr2[1] = i2;
        long j12 = ((((long) iArr[2]) & 4294967295L) - j8) + (j11 >> 32);
        int i3 = (int) j12;
        iArr2[2] = i3;
        long j13 = (((((long) iArr[3]) & 4294967295L) + j6) - j2) + (j12 >> 32);
        long j14 = j13 & 4294967295L;
        long j15 = (((((long) iArr[4]) & 4294967295L) + j7) - j3) + (j13 >> 32);
        iArr2[4] = (int) j15;
        long j16 = (((((long) iArr[5]) & 4294967295L) + j8) - j4) + (j15 >> 32);
        iArr2[5] = (int) j16;
        long j17 = (((((long) iArr[6]) & 4294967295L) + j2) - j5) + (j16 >> 32);
        iArr2[6] = (int) j17;
        long j18 = (j17 >> 32) + 1;
        long j19 = j14 + j18;
        long j20 = j10 - j18;
        iArr2[0] = (int) j20;
        long j21 = j20 >> 32;
        if (j21 != 0) {
            long j22 = j21 + (((long) i2) & 4294967295L);
            iArr2[1] = (int) j22;
            long j23 = (j22 >> 32) + (((long) i3) & 4294967295L);
            iArr2[2] = (int) j23;
            j19 += j23 >> 32;
        }
        iArr2[3] = (int) j19;
        if (((j19 >> 32) == 0 || kv.K(7, 4, iArr2) == 0) && !(iArr2[6] == -1 && g93.s(iArr2, b))) {
            return;
        }
        j(iArr2);
    }

    public static void O(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = j8 ^ (j9 >>> 17);
        long j11 = (j7 ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = ((j6 ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j13 = j2 ^ (j12 << 17);
        long j14 = (j3 ^ (j11 << 17)) ^ (j12 >>> 47);
        long j15 = ((j4 ^ (j10 << 17)) ^ (j11 >>> 47)) ^ (j12 << 47);
        long j16 = (((j5 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47)) ^ (j12 >>> 17);
        long j17 = j16 >>> 47;
        jArr2[0] = j13 ^ j17;
        jArr2[1] = j14;
        jArr2[2] = (j17 << 30) ^ j15;
        jArr2[3] = 140737488355327L & j16;
    }

    public static void P(int[] iArr, int i2) {
        long j2;
        if (i2 != 0) {
            long j3 = ((long) i2) & 4294967295L;
            long j4 = (((long) iArr[0]) & 4294967295L) - j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = (4294967295L & ((long) iArr[3])) + j3 + j5;
            iArr[3] = (int) j8;
            j2 = j8 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || kv.K(7, 4, iArr) == 0) && !(iArr[6] == -1 && g93.s(iArr, b))) {
            return;
        }
        j(iArr);
    }

    public static int Q(int i2, int i3, Context context) {
        TypedValue typedValueT = jw.t(context, i2);
        return (typedValueT == null || typedValueT.type != 16) ? i3 : typedValueT.data;
    }

    public static TimeInterpolator R(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            e.g("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!I(strValueOf, "cubic-bezier") && !I(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (I(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(z(strArrSplit, 0), z(strArrSplit, 1), z(strArrSplit, 2), z(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!I(strValueOf, "path")) {
            e.g("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            lb1.b(x91.n(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e2) {
            sm0.m("Error in parsing ".concat(strSubstring), e2);
            return null;
        }
    }

    public static final void S(pk pkVar, fs fsVar, boolean z) {
        Object objH;
        Object objT = pkVar.t();
        Throwable thG = pkVar.g(objT);
        if (thG != null) {
            pj1 pj1Var = rj1.b;
            objH = new qj1(thG);
        } else {
            pj1 pj1Var2 = rj1.b;
            objH = pkVar.h(objT);
        }
        if (!z) {
            fsVar.resumeWith(objH);
            return;
        }
        fsVar.getClass();
        f20 f20Var = (f20) fsVar;
        gs gsVar = f20Var.e;
        Object obj = f20Var.i;
        CoroutineContext context = gsVar.getContext();
        Object objC = ix1.c(context, obj);
        m22 m22VarC = objC != ix1.a ? vs.c(gsVar, context, objC) : null;
        try {
            gsVar.resumeWith(objH);
            Unit unit = Unit.a;
        } finally {
            if (m22VarC == null || m22VarC.Y()) {
                ix1.a(context, objC);
            }
        }
    }

    public static void T(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        g93.F(iArr, iArr3);
        N(iArr3, iArr2);
    }

    public static void U(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        G(jArr, jArr3);
        O(jArr3, jArr2);
    }

    public static void V(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        G(jArr, jArr3);
        O(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            G(jArr2, jArr3);
            O(jArr3, jArr2);
        }
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g93.G(iArr, iArr2, iArr3) != 0) {
            long j2 = (((long) iArr3[0]) & 4294967295L) + 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = ((4294967295L & ((long) iArr3[3])) - 1) + j3;
            iArr3[3] = (int) j6;
            if ((j6 >> 32) != 0) {
                kv.m(7, 4, iArr3);
            }
        }
    }

    public static void X(int[] iArr, int[] iArr2) {
        if (kv.a0(7, 0, iArr, iArr2) != 0 || (iArr2[6] == -1 && g93.s(iArr2, b))) {
            j(iArr2);
        }
    }

    public static int Y(int i2, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i4 = i2 / i3;
        int i5 = i2 - (i3 * i4);
        if (i5 == 0) {
            return i4;
        }
        int i6 = ((i2 ^ i3) >> 31) | 1;
        switch (a23.a[roundingMode.ordinal()]) {
            case 1:
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return i4;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                if (i6 >= 0) {
                    return i4;
                }
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                if (i6 <= 0) {
                    return i4;
                }
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                int iAbs = Math.abs(i5);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i4;
                }
                if (iAbs2 <= 0) {
                    return i4;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i4 + i6;
    }

    public static void Z(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                uq1.h(ck1.s(i3, "at index ", new StringBuilder(String.valueOf(i3).length() + 9)));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    public static int a(Activity activity) {
        Intent intent;
        ResolveInfo resolveInfoResolveActivity;
        ActivityInfo activityInfo;
        PackageManager packageManager;
        Uri referrer;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return 0;
        }
        if (intent.getBooleanExtra(AthenaConfig.ATHENA_PUSH_CALL, false)) {
            return 3;
        }
        String callingPackage = activity.getCallingPackage();
        boolean zIsEmpty = TextUtils.isEmpty(callingPackage);
        String str = BuildConfig.FLAVOR;
        List<ResolveInfo> listQueryIntentActivities = null;
        if (zIsEmpty) {
            Intent intent2 = activity.getIntent();
            if (intent2 == null) {
                referrer = null;
            } else {
                referrer = (Uri) intent2.getParcelableExtra("android.intent.extra.REFERRER");
                if (referrer == null) {
                    String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
                    referrer = !TextUtils.isEmpty(stringExtra) ? Uri.parse(stringExtra) : activity.getReferrer();
                }
            }
            if (referrer != null) {
                callingPackage = referrer.getHost();
                if (TextUtils.isEmpty(callingPackage)) {
                    callingPackage = BuildConfig.FLAVOR;
                }
            } else {
                callingPackage = BuildConfig.FLAVOR;
            }
        }
        String packageName = activity.getPackageName();
        if (TextUtils.isEmpty(callingPackage) || callingPackage.equals(packageName)) {
            return 1;
        }
        Intent intent3 = new Intent("android.intent.action.MAIN");
        intent3.addCategory("android.intent.category.HOME");
        PackageManager packageManager2 = activity.getPackageManager();
        if (packageManager2 != null) {
            try {
                resolveInfoResolveActivity = packageManager2.resolveActivity(intent3, 0);
            } catch (Exception e2) {
                cc2.c(e2.getMessage());
                resolveInfoResolveActivity = null;
            }
            if (resolveInfoResolveActivity != null && (activityInfo = resolveInfoResolveActivity.activityInfo) != null) {
                String str2 = activityInfo.packageName;
                if (!"android".equals(str2) && !TextUtils.isEmpty(str2)) {
                    str = str2;
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            return !callingPackage.equals(str) ? 2 : 1;
        }
        if (!TextUtils.isEmpty(callingPackage) && (packageManager = activity.getPackageManager()) != null) {
            Intent intent4 = new Intent("android.intent.action.MAIN");
            intent4.addCategory("android.intent.category.HOME");
            try {
                listQueryIntentActivities = packageManager.queryIntentActivities(intent4, 65536);
            } catch (Exception e3) {
                cc2.c(e3.getMessage());
            }
            if (listQueryIntentActivities != null) {
                Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
                while (it.hasNext()) {
                    ActivityInfo activityInfo2 = it.next().activityInfo;
                    if (activityInfo2 != null && callingPackage.equals(activityInfo2.packageName)) {
                        return 1;
                    }
                }
            }
        }
        return 2;
    }

    public static final void a0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2) {
        if (i2 < 0 || byteBuffer2.remaining() < i2 || byteBuffer3.remaining() < i2 || byteBuffer.remaining() < i2) {
            e.g("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static String b(Context context, int i2) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            Class<?> cls = telephonyManager.getClass();
            Class cls2 = Integer.TYPE;
            String str = (String) cls.getMethod("getImei", cls2).invoke(telephonyManager, Integer.valueOf(i2));
            if (TextUtils.isEmpty(str)) {
                str = (String) telephonyManager.getClass().getMethod("getDeviceId", cls2).invoke(telephonyManager, Integer.valueOf(i2));
            }
            return !TextUtils.isEmpty(str) ? ia.a(str) : BuildConfig.FLAVOR;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static final byte[] b0(byte[] bArr, int i2, byte[] bArr2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i2 || bArr2.length - i3 < 0) {
            e.g("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i2] ^ bArr2[i4]);
        }
        return bArr3;
    }

    public static nz2 c(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            uq1.q("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        int i2 = 3;
        v5 v5Var = new v5(3);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, v5Var, 1)) {
            try {
                try {
                    IBinder iBinderA = v5Var.a();
                    if (iBinderA != null) {
                        w5 w5Var = new w5(3);
                        w5Var.b = iBinderA;
                        String strA = w5Var.a();
                        w5Var.d();
                        nz2 nz2Var = new nz2(strA, i2);
                        context.unbindService(v5Var);
                        return nz2Var;
                    }
                    context.unbindService(v5Var);
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                context.unbindService(v5Var);
                throw th;
            }
            context.unbindService(v5Var);
            throw th;
        }
        uq1.o("Google Play connection failed");
        return null;
    }

    public static final byte[] c0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return b0(bArr, 0, bArr2, bArr.length);
        }
        e.g("The lengths of x and y should match.");
        return null;
    }

    public static void d(Context context, File file) throws Throwable {
        if (file.exists() && file.isDirectory() && file.listFiles() != null) {
            for (File file2 : file.listFiles()) {
                if (file2.isFile()) {
                    n(context, file2);
                } else if (file2.isDirectory()) {
                    d(context, file2);
                }
            }
        }
    }

    public static byte[] d0(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                tv2.f("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static void e(Context context, String str) throws Throwable {
        File file = new File(str);
        d(context, file);
        if (file.isDirectory()) {
            if (file.listFiles() == null || file.listFiles().length == 0) {
                file.delete();
            }
        }
    }

    public static void f(String str, ArrayList arrayList, String str2) {
        File[] fileArrListFiles;
        if (str == null) {
            return;
        }
        File file = new File(str);
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                f(file2.getAbsolutePath(), arrayList, str2);
            } else if (str2 == null) {
                arrayList.add(file2);
            } else if (file2.getName().contains(str2)) {
                arrayList.add(file2);
            }
        }
    }

    public static boolean g(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) a.get()).booleanValue();
        }
        return false;
    }

    public static void h(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g93.c(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && g93.s(iArr3, b))) {
            j(iArr3);
        }
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void j(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = (4294967295L & ((long) iArr[3])) + 1 + j3;
        iArr[3] = (int) j6;
        if ((j6 >> 32) != 0) {
            kv.K(7, 4, iArr);
        }
    }

    public static String k() {
        char c2;
        try {
            int rawOffset = TimeZone.getDefault().getRawOffset() / 60000;
            if (rawOffset < 0) {
                rawOffset = -rawOffset;
                c2 = '-';
            } else {
                c2 = '+';
            }
            StringBuilder sb = new StringBuilder(9);
            sb.append("GMT");
            sb.append(c2);
            String string = Integer.toString(rawOffset / 60);
            for (int i2 = 0; i2 < 2 - string.length(); i2++) {
                sb.append('0');
            }
            sb.append(string);
            sb.append(':');
            String string2 = Integer.toString(rawOffset % 60);
            for (int i3 = 0; i3 < 2 - string2.length(); i3++) {
                sb.append('0');
            }
            sb.append(string2);
            return sb.toString();
        } catch (Throwable th) {
            cc2.c(Log.getStackTraceString(th));
            return BuildConfig.FLAVOR;
        }
    }

    public static String l(Context context) {
        if (!TextUtils.isEmpty(k)) {
            return k;
        }
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (!TextUtils.isEmpty(string)) {
                String strTrim = string.trim();
                String strA = TextUtils.isEmpty(strTrim) ? BuildConfig.FLAVOR : ia.a(strTrim);
                k = strA;
                return strA;
            }
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
        }
        return BuildConfig.FLAVOR;
    }

    public static String m(Context context, int i2) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            String str = (String) telephonyManager.getClass().getMethod("getSubscriberId", Integer.TYPE).invoke(telephonyManager, Integer.valueOf(i2));
            return !TextUtils.isEmpty(str) ? ia.a(str) : BuildConfig.FLAVOR;
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.nio.channels.spi.AbstractInterruptibleChannel] */
    public static boolean n(Context context, File file) throws Throwable {
        Throwable th;
        ?? r7;
        RandomAccessFile randomAccessFile;
        ?? r8;
        FileLock fileLock;
        FileLock fileLock2;
        if (file.getParent().contains(context.getFilesDir().getPath())) {
            File file2 = new File(file.getParent() + File.separator + System.currentTimeMillis());
            file.renameTo(file2);
            return file2.delete();
        }
        FileLock fileLockLock = null;
        try {
            randomAccessFile = new RandomAccessFile(file.getPath(), "rw");
            try {
                FileChannel channel = randomAccessFile.getChannel();
                try {
                    fileLockLock = channel.lock();
                    File file3 = new File(file.getParent() + File.separator + System.currentTimeMillis());
                    file.renameTo(file3);
                    boolean zDelete = file3.delete();
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    try {
                        channel.close();
                    } catch (IOException unused2) {
                    }
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused3) {
                    }
                    return zDelete;
                } catch (Exception unused4) {
                    fileLock2 = fileLockLock;
                    fileLockLock = channel;
                    FileLock fileLock3 = fileLock2;
                    r8 = fileLockLock;
                    fileLockLock = fileLock3;
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused5) {
                        }
                    }
                    if (r8 != 0) {
                        try {
                            r8.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (randomAccessFile == null) {
                        return false;
                    }
                    try {
                        randomAccessFile.close();
                        return false;
                    } catch (IOException unused7) {
                        return false;
                    }
                } catch (Throwable th2) {
                    fileLock = fileLockLock;
                    fileLockLock = channel;
                    th = th2;
                    FileLock fileLock4 = fileLock;
                    r7 = fileLockLock;
                    fileLockLock = fileLock4;
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused8) {
                        }
                    }
                    if (r7 != 0) {
                        try {
                            r7.close();
                        } catch (IOException unused9) {
                        }
                    }
                    if (randomAccessFile == null) {
                        throw th;
                    }
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (IOException unused10) {
                        throw th;
                    }
                }
            } catch (Exception unused11) {
                fileLock2 = null;
            } catch (Throwable th3) {
                th = th3;
                fileLock = null;
            }
        } catch (Exception unused12) {
            r8 = 0;
            randomAccessFile = null;
        } catch (Throwable th4) {
            th = th4;
            r7 = 0;
            randomAccessFile = null;
        }
    }

    public static String o() {
        String serial;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                serial = Build.getSerial();
            } catch (Exception unused) {
                serial = BuildConfig.FLAVOR;
            }
        } else {
            serial = Build.SERIAL;
        }
        try {
            if (TextUtils.isEmpty(serial) || "unknown".equals(serial)) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                serial = (String) cls.getMethod("get", String.class).invoke(cls, "ro.serialno");
            }
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
        }
        return TextUtils.isEmpty(serial) ? BuildConfig.FLAVOR : ia.a(serial);
    }

    public static void p(BigInteger[] bigIntegerArr, String str) {
        if (bigIntegerArr.length != 2 || bigIntegerArr[0] == null || bigIntegerArr[1] == null) {
            e.g(ts.k("'", str, "' must consist of exactly 2 (non-null) values"));
        }
    }

    public static final void q(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                a80.a(th, th2);
            }
        }
    }

    public static boolean r(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zS = s(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zS;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean s(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 != -1) {
                            fileOutputStream2.write(bArr, 0, i2);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String t(Context context) {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                return Application.getProcessName();
            }
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    str = null;
                    break;
                }
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == Process.myPid()) {
                        str = next.processName;
                        break;
                    }
                    str = null;
                    break;
                }
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(str)) {
                try {
                    Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, null);
                    if (!(objInvoke instanceof String)) {
                        return null;
                    }
                    str = (String) objInvoke;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return str;
        } catch (Exception e2) {
            b81 b81Var = cc2.a;
            cc2.c(Log.getStackTraceString(e2));
            return null;
        }
    }

    public static boolean u(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = x52.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = w52.d;
            w52 w52Var = (w52) view.getTag(2131296798);
            WeakReference weakReference = null;
            if (w52Var == null) {
                w52Var = new w52();
                w52Var.a = null;
                w52Var.b = null;
                w52Var.c = null;
                view.setTag(2131296798, w52Var);
            }
            WeakReference weakReference2 = w52Var.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                w52Var.c = new WeakReference(keyEvent);
                if (w52Var.b == null) {
                    w52Var.b = new SparseArray();
                }
                SparseArray sparseArray = w52Var.b;
                if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(2131296799)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    ur.a();
                    return false;
                }
            }
        }
        return false;
    }

    public static boolean v(iv0 iv0Var, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (iv0Var != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return iv0Var.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!g) {
                            try {
                                h = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            g = true;
                        }
                        Method method = h;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (x52.c(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!i) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        j = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    i = true;
                }
                Field field = j;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (x52.c(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && x52.c(view, keyEvent)) || iv0Var.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static String w(Context context) {
        try {
            return context.getPackageManager().getInstallerPackageName(B(context));
        } catch (Exception e2) {
            cc2.c(e2.getMessage());
            return BuildConfig.FLAVOR;
        }
    }

    public static String x(Context context) {
        String simOperator;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            simOperator = telephonyManager == null ? BuildConfig.FLAVOR : telephonyManager.getSimOperator();
        } catch (Exception unused) {
        }
        return (TextUtils.isEmpty(simOperator) || simOperator.length() < 3) ? BuildConfig.FLAVOR : simOperator.substring(0, 3);
    }

    public static i7 y(Status status) {
        return status.c != null ? new ni1(status) : new i7(status);
    }

    public static float z(String[] strArr, int i2) {
        float f2 = Float.parseFloat(strArr[i2]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }
}
