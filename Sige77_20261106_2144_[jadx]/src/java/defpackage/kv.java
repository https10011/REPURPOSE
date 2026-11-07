package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class kv {
    public static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final vy2 b;
    public static final long[] c;
    public static final Object d;
    public static volatile nc0 e;
    public static volatile nc0 f;
    public static Context g;
    public static boolean h;
    public static volatile ka2 i;
    public static Context j;

    static {
        new gi(0);
        b = new vy2("NULL", 4);
        c = new long[]{3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
        d = new Object();
    }

    public static final int A(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 < i3) {
                int i5 = i3 % i4;
                if (i5 < 0) {
                    i5 += i4;
                }
                int i6 = i2 % i4;
                if (i6 < 0) {
                    i6 += i4;
                }
                int i7 = (i5 - i6) % i4;
                if (i7 < 0) {
                    i7 += i4;
                }
                return i3 - i7;
            }
        } else {
            if (i4 >= 0) {
                e.g("Step is zero.");
                return 0;
            }
            if (i2 > i3) {
                int i8 = -i4;
                int i9 = i2 % i8;
                if (i9 < 0) {
                    i9 += i8;
                }
                int i10 = i3 % i8;
                if (i10 < 0) {
                    i10 += i8;
                }
                int i11 = (i9 - i10) % i8;
                if (i11 < 0) {
                    i11 += i8;
                }
                return i11 + i3;
            }
        }
        return i3;
    }

    public static final String B(String str) {
        if (mt.a.contains(kv.class)) {
            return null;
        }
        try {
            if (dw0.j(i90.a(), str)) {
                return str;
            }
            return dw0.j(i90.a(), x()) ? x() : BuildConfig.FLAVOR;
        } catch (Throwable th) {
            mt.a(kv.class, th);
            return null;
        }
    }

    public static boolean C(int i2, int[] iArr, int[] iArr2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            int i4 = iArr[i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    public static boolean D(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = n61.a;
            }
        } else {
            if (!(collection instanceof zo0)) {
                return false;
            }
            objComparator = ((zo0) collection).d;
        }
        return comparator.equals(objComparator);
    }

    public static void E(String str) {
        Log.i("TCG_log", s() + ": " + str);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    public static void F(String str, Object... objArr) {
        nl1 nl1Var;
        int i2;
        String strS = s();
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        int i3 = 0;
        if (th != null) {
            if (objArr.length == 0) {
                uq1.q("non-sensical empty or null argument array");
                return;
            }
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            objArr = objArr2;
        }
        StringBuilder sb = new StringBuilder(str.length() + 50);
        int i4 = 0;
        while (i3 < objArr.length) {
            int iIndexOf = str.indexOf("{}", i4);
            if (iIndexOf == -1) {
                if (i4 == 0) {
                    nl1Var = new nl1(str, objArr);
                } else {
                    sb.append((CharSequence) str, i4, str.length());
                    nl1Var = new nl1(sb.toString(), objArr);
                }
                Log.i("TCG_log", strS + ": " + ((String) nl1Var.b));
            }
            if (iIndexOf == 0) {
                sb.append((CharSequence) str, i4, iIndexOf);
                bj0.f(sb, objArr[i3], new HashMap());
                i2 = iIndexOf + 2;
            } else {
                int i5 = iIndexOf - 1;
                if (str.charAt(i5) != '\\') {
                    sb.append((CharSequence) str, i4, iIndexOf);
                    bj0.f(sb, objArr[i3], new HashMap());
                } else if (iIndexOf < 2 || str.charAt(iIndexOf - 2) != '\\') {
                    i3--;
                    sb.append((CharSequence) str, i4, i5);
                    sb.append('{');
                    i2 = iIndexOf + 1;
                } else {
                    sb.append((CharSequence) str, i4, i5);
                    bj0.f(sb, objArr[i3], new HashMap());
                }
                i2 = iIndexOf + 2;
            }
            i4 = i2;
            i3++;
        }
        sb.append((CharSequence) str, i4, str.length());
        nl1Var = new nl1(sb.toString(), objArr);
        Log.i("TCG_log", strS + ": " + ((String) nl1Var.b));
    }

    public static void G(long[] jArr, long[] jArr2, long[] jArr3) {
        int i2 = 56;
        while (true) {
            long j2 = 0;
            int i3 = 0;
            if (i2 < 0) {
                break;
            }
            for (int i4 = 1; i4 < 9; i4 += 2) {
                int i5 = (int) (jArr[i4] >>> i2);
                f(jArr2, (i5 & 15) * 9, jArr2, (((i5 >>> 4) & 15) + 16) * 9, jArr3, i4 - 1);
            }
            while (i3 < 16) {
                long j3 = jArr3[i3];
                jArr3[i3] = (j2 >>> (-8)) | (j3 << 8);
                i3++;
                j2 = j3;
            }
            i2 -= 8;
        }
        for (int i6 = 56; i6 >= 0; i6 -= 8) {
            int i7 = 0;
            while (i7 < 9) {
                int i8 = (int) (jArr[i7] >>> i6);
                int i9 = i7;
                f(jArr2, (i8 & 15) * 9, jArr2, (((i8 >>> 4) & 15) + 16) * 9, jArr3, i9);
                i7 = i9 + 2;
            }
            if (i6 > 0) {
                long j4 = 0;
                int i10 = 0;
                while (i10 < 18) {
                    long j5 = jArr3[i10];
                    jArr3[i10] = (j4 >>> (-8)) | (j5 << 8);
                    i10++;
                    j4 = j5;
                }
            }
        }
    }

    public static void H(long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < 9; i2++) {
            bj0.k(i2 << 1, jArr[i2], jArr2);
        }
    }

    public static int I(int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr2[i3] = i4;
            i3++;
            if (i4 != 0) {
                while (i3 < i2) {
                    iArr2[i3] = iArr[i3];
                    i3++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int J(int[] iArr) {
        for (int i2 = 0; i2 < 16; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int K(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static int L(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] + 1;
            iArr[i3] = i4;
            if (i4 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static void M(Context context, String[] strArr, sk0 sk0Var) {
        j = context.getApplicationContext();
        if (i == null) {
            if (ka2.f == null) {
                synchronized (ka2.class) {
                    try {
                        if (ka2.f == null) {
                            ka2.f = new ka2();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            i = ka2.f;
        }
        if (strArr.length <= 0) {
            Log.e("GslbSdk", "Init with invalid domains");
            return;
        }
        ka2 ka2Var = i;
        xy0 xy0Var = new xy0();
        xy0Var.a = strArr;
        xy0Var.b = sk0Var;
        ka2Var.c();
        Message messageObtainMessage = ka2Var.a.obtainMessage(101);
        messageObtainMessage.obj = xy0Var;
        ka2Var.a.sendMessage(messageObtainMessage);
    }

    public static boolean N(Context context) {
        Method methodQ = h42.q("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodQ != null) {
            Object objS = h42.s(null, methodQ, context);
            if ((objS instanceof Integer) && Intrinsics.areEqual(objS, 0)) {
                return true;
            }
        }
        return false;
    }

    public static boolean O(String str) {
        if (i == null) {
            j42.a.b("GslbSdk is not initialized");
            return false;
        }
        if (str != null) {
            return !TextUtils.isEmpty(y(str, false));
        }
        return false;
    }

    public static boolean P(int[] iArr, int i2) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i3 = 1; i3 < i2; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean Q(int[] iArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (iArr[i3] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void R(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        G(jArr, W(jArr2), jArr4);
        X(jArr4, jArr3);
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        G(jArr, W(jArr2), jArr4);
        for (int i2 = 0; i2 < 18; i2++) {
            jArr3[i2] = jArr3[i2] ^ jArr4[i2];
        }
    }

    public static void T(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[18];
        G(jArr, jArr2, jArr4);
        X(jArr4, jArr3);
    }

    public static long[] W(long[] jArr) {
        long j2;
        long[] jArr2 = new long[288];
        int i2 = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i3 = 7;
        int i4 = 0;
        while (true) {
            j2 = 0;
            if (i3 <= 0) {
                break;
            }
            int i5 = i4 + 18;
            int i6 = i5 >>> 1;
            int i7 = 0;
            while (i7 < 9) {
                long j3 = jArr2[i6 + i7];
                jArr2[i5 + i7] = (j2 >>> 63) | (j3 << 1);
                i7++;
                j2 = j3;
            }
            Y(jArr2, i5);
            int i8 = i4 + 27;
            for (int i9 = 0; i9 < 9; i9++) {
                jArr2[i8 + i9] = jArr2[9 + i9] ^ jArr2[i5 + i9];
            }
            i3--;
            i4 = i5;
        }
        while (i2 < 144) {
            long j4 = jArr2[i2];
            jArr2[144 + i2] = (j2 >>> (-4)) | (j4 << 4);
            i2++;
            j2 = j4;
        }
        return jArr2;
    }

    public static void X(long[] jArr, long[] jArr2) {
        long j2 = jArr[9];
        long j3 = jArr[17];
        long j4 = (((j2 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j5 = (j3 << 15) ^ (((jArr[8] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        for (int i2 = 16; i2 >= 10; i2--) {
            long j6 = jArr[i2];
            jArr2[i2 - 8] = (((j5 ^ (j6 >>> 59)) ^ (j6 >>> 57)) ^ (j6 >>> 54)) ^ (j6 >>> 49);
            j5 = (((jArr[i2 - 9] ^ (j6 << 5)) ^ (j6 << 7)) ^ (j6 << 10)) ^ (j6 << 15);
        }
        jArr2[1] = (((j5 ^ (j4 >>> 59)) ^ (j4 >>> 57)) ^ (j4 >>> 54)) ^ (j4 >>> 49);
        long j7 = (j4 << 15) ^ (((jArr[0] ^ (j4 << 5)) ^ (j4 << 7)) ^ (j4 << 10));
        long j8 = jArr2[8];
        long j9 = j8 >>> 59;
        jArr2[0] = (((j7 ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 10);
        jArr2[8] = 576460752303423487L & j8;
    }

    public static void Y(long[] jArr, int i2) {
        int i3 = i2 + 8;
        long j2 = jArr[i3];
        long j3 = j2 >>> 59;
        jArr[i2] = ((j3 << 10) ^ (((j3 << 2) ^ j3) ^ (j3 << 5))) ^ jArr[i2];
        jArr[i3] = j2 & 576460752303423487L;
    }

    public static final int Z(int i2) {
        return ((i2 & 255) << 24) | (((-16777216) & i2) >>> 24) | ((16711680 & i2) >>> 8) | ((65280 & i2) << 8);
    }

    public static qv2 a(Context context) throws PackageManager.NameNotFoundException, IOException {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            uq1.q("Cannot be called from the main thread");
            return null;
        }
        context.getPackageManager().getPackageInfo("com.android.vending", 0);
        int i2 = 4;
        v5 v5Var = new v5(4);
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, v5Var, 1)) {
            try {
                try {
                    IBinder iBinderA = v5Var.a();
                    if (iBinderA != null) {
                        w5 w5Var = new w5(4);
                        w5Var.b = iBinderA;
                        String strA = w5Var.a();
                        w5Var.d();
                        qv2 qv2Var = new qv2(strA, i2);
                        context.unbindService(v5Var);
                        return qv2Var;
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

    public static int a0(int i2, int i3, int[] iArr, int[] iArr2) {
        int i4 = 0;
        while (i4 < i2) {
            int i5 = iArr[i4];
            iArr2[i4] = (i3 >>> 31) | (i5 << 1);
            i4++;
            i3 = i5;
        }
        return i3 >>> 31;
    }

    public static int b(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (((long) iArr[i3]) & 4294967295L) + (4294967295L & ((long) iArr2[i3])) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int b0(int i2, int[] iArr, int[] iArr2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = iArr[i3];
            iArr2[i3] = (i4 >>> (-3)) | (i5 << 3);
            i3++;
            i4 = i5;
        }
        return i4 >>> (-3);
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 9; i2++) {
            jArr3[i2] = jArr[i2] ^ jArr2[i2];
        }
    }

    public static int c0(int[] iArr, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = iArr[i3];
            iArr[i3] = (i4 >>> (-2)) | (i5 << 2);
            i3++;
            i4 = i5;
        }
        return i4 >>> (-2);
    }

    public static void d(int i2, int i3, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) i3) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = (4294967295L & ((long) iArr[1])) + 1 + (j2 >>> 32);
        iArr[1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return;
        }
        K(i2, 2, iArr);
    }

    public static void d0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        H(jArr, jArr3);
        X(jArr3, jArr2);
    }

    public static int e(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & 4294967295L) + (4294967295L & ((long) iArr3[i3])) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static void e0(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[18];
        H(jArr, jArr3);
        X(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            H(jArr2, jArr3);
            X(jArr3, jArr2);
        }
    }

    public static void f(long[] jArr, int i2, long[] jArr2, int i3, long[] jArr3, int i4) {
        for (int i5 = 0; i5 < 9; i5++) {
            int i6 = i4 + i5;
            jArr3[i6] = jArr3[i6] ^ (jArr[i2 + i5] ^ jArr2[i3 + i5]);
        }
    }

    public static int f0(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = ((((long) iArr[i3]) & 4294967295L) - (4294967295L & ((long) iArr2[i3]))) + j2;
            iArr3[i3] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int g(int i2, int i3, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            long j3 = (((long) iArr[i4]) & 4294967295L) + (4294967295L & ((long) iArr2[i5])) + j2;
            iArr2[i5] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static void g0(int i2, int i3, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (((long) i3) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = ((4294967295L & ((long) iArr[1])) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return;
        }
        m(i2, 2, iArr);
    }

    public static int h(int i2, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = (((long) iArr[i3]) & 4294967295L) + (4294967295L & ((long) iArr2[i3])) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int h0(int i2, int i3, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + i4;
            long j3 = ((((long) iArr2[i5]) & 4294967295L) - (4294967295L & ((long) iArr[i4]))) + j2;
            iArr2[i5] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static void i(int i2, int i3, int i4, int[] iArr) {
        long j2 = (((long) i3) & 4294967295L) + (4294967295L & ((long) iArr[i4]));
        iArr[i4] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return;
        }
        K(i2, i4 + 1, iArr);
    }

    public static int i0(int i2, int[] iArr, int[] iArr2) {
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            long j3 = ((((long) iArr2[i3]) & 4294967295L) - (4294967295L & ((long) iArr[i3]))) + j2;
            iArr2[i3] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int j(int i2, int i3, int[] iArr) {
        long j2 = (((long) i3) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return K(i2, 1, iArr);
    }

    public static BigInteger j0(int[] iArr, int i2) {
        byte[] bArr = new byte[i2 << 2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = iArr[i3];
            if (i4 != 0) {
                sp0.r(bArr, i4, ((i2 - 1) - i3) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final boolean k(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final String k0(byte b2) {
        char[] cArr = c.a;
        return new String(new char[]{cArr[(b2 >> 4) & 15], cArr[b2 & 15]});
    }

    public static final void l(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static final String l0(int i2) {
        if (i2 == 0) {
            return "0";
        }
        char[] cArr = c.a;
        int i3 = 0;
        char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
        while (i3 < 8 && cArr2[i3] == '0') {
            i3++;
        }
        b1.a.getClass();
        if (i3 < 0) {
            e.c(ts.g(i3, "startIndex: ", ", endIndex: 8, size: 8"));
            return null;
        }
        if (i3 <= 8) {
            return new String(cArr2, i3, 8 - i3);
        }
        e.g(ts.g(i3, "startIndex: ", " > endIndex: 8"));
        return null;
    }

    public static int m(int i2, int i3, int[] iArr) {
        while (i3 < i2) {
            int i4 = iArr[i3] - 1;
            iArr[i3] = i4;
            if (i4 != -1) {
                return 0;
            }
            i3++;
        }
        return -1;
    }

    public static Status m0(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return new Status(17499, (String) null, (PendingIntent) null, (ConnectionResult) null);
        }
        String[] strArrSplit = str.split(":", 2);
        strArrSplit[0] = strArrSplit[0].trim();
        if (strArrSplit.length > 1 && (str2 = strArrSplit[1]) != null) {
            strArrSplit[1] = str2.trim();
        }
        List listAsList = Arrays.asList(strArrSplit);
        return listAsList.size() > 1 ? n0((String) listAsList.get(0), (String) listAsList.get(1)) : n0((String) listAsList.get(0), null);
    }

    public static void n(String str) {
        Log.e("TCG_log", s() + ": " + str);
    }

    public static Status n0(String str, String str2) {
        int i2;
        str.getClass();
        switch (str) {
            case "USER_CANCELLED":
                i2 = 18001;
                break;
            case "INVALID_RECIPIENT_EMAIL":
                i2 = 17033;
                break;
            case "WEB_CONTEXT_ALREADY_PRESENTED":
                i2 = 17057;
                break;
            case "INTERNAL_SUCCESS_SIGN_OUT":
                i2 = 17091;
                break;
            case "INVALID_IDP_RESPONSE":
            case "INVALID_LOGIN_CREDENTIALS":
            case "INVALID_PENDING_TOKEN":
                i2 = 17004;
                break;
            case "DYNAMIC_LINK_NOT_ACTIVATED":
                i2 = 17068;
                break;
            case "QUOTA_EXCEEDED":
                i2 = 17052;
                break;
            case "WEB_NETWORK_REQUEST_FAILED":
                i2 = 17061;
                break;
            case "INVALID_RECAPTCHA_VERSION":
                i2 = 17206;
                break;
            case "RECAPTCHA_NOT_ENABLED":
                i2 = 17200;
                break;
            case "EXPIRED_OOB_CODE":
                i2 = 17029;
                break;
            case "UNAUTHORIZED_DOMAIN":
                i2 = 17038;
                break;
            case "INVALID_OOB_CODE":
                i2 = 17030;
                break;
            case "MISSING_EMAIL":
                i2 = 17034;
                break;
            case "INVALID_CODE":
                i2 = 17044;
                break;
            case "INVALID_HOSTING_LINK_DOMAIN":
                i2 = 17214;
                break;
            case "TOKEN_EXPIRED":
                i2 = 17021;
                break;
            case "INVALID_TENANT_ID":
                i2 = 17079;
                break;
            case "ALTERNATE_CLIENT_IDENTIFIER_REQUIRED":
                i2 = 18002;
                break;
            case "INVALID_SESSION_INFO":
                i2 = 17046;
                break;
            case "SECOND_FACTOR_EXISTS":
                i2 = 17087;
                break;
            case "INVALID_EMAIL":
            case "INVALID_IDENTIFIER":
                i2 = 17008;
                break;
            case "ADMIN_ONLY_OPERATION":
                i2 = 17085;
                break;
            case "MISSING_OR_INVALID_NONCE":
                i2 = 17094;
                break;
            case "INVALID_CERT_HASH":
                i2 = 17064;
                break;
            case "NO_SUCH_PROVIDER":
                i2 = 17016;
                break;
            case "MFA_ENROLLMENT_NOT_FOUND":
                i2 = 17084;
                break;
            case "MISSING_PASSWORD":
                i2 = 17035;
                break;
            case "CREDENTIAL_TOO_OLD_LOGIN_AGAIN":
                i2 = 17014;
                break;
            case "TIMEOUT":
            case "<<Network Error>>":
                i2 = 17020;
                break;
            case "INVALID_REQ_TYPE":
                i2 = 17207;
                break;
            case "INVALID_RECAPTCHA_ACTION":
                i2 = 17203;
                break;
            case "OPERATION_NOT_ALLOWED":
            case "PASSWORD_LOGIN_DISABLED":
                i2 = 17006;
                break;
            case "WEB_INTERNAL_ERROR":
                i2 = 17062;
                break;
            case "SECOND_FACTOR_LIMIT_EXCEEDED":
                i2 = 17088;
                break;
            case "MISSING_MFA_ENROLLMENT_ID":
                i2 = 17082;
                break;
            case "USER_NOT_FOUND":
            case "EMAIL_NOT_FOUND":
                i2 = 17011;
                break;
            case "CAPTCHA_CHECK_FAILED":
                i2 = 17056;
                break;
            case "WEAK_PASSWORD":
                i2 = 17026;
                break;
            case "UNSUPPORTED_FIRST_FACTOR":
                i2 = 17089;
                break;
            case "INVALID_SENDER":
                i2 = 17032;
                break;
            case "MISSING_PHONE_NUMBER":
                i2 = 17041;
                break;
            case "INVALID_DYNAMIC_LINK_DOMAIN":
                i2 = 17074;
                break;
            case "MISSING_MFA_PENDING_CREDENTIAL":
                i2 = 17081;
                break;
            case "UNSUPPORTED_PASSTHROUGH_OPERATION":
                i2 = 17095;
                break;
            case "EMAIL_EXISTS":
                i2 = 17007;
                break;
            case "INVALID_ID_TOKEN":
                i2 = 17017;
                break;
            case "WEB_STORAGE_UNSUPPORTED":
                i2 = 17065;
                break;
            case "MISSING_CLIENT_TYPE":
                i2 = 17204;
                break;
            case "MISSING_RECAPTCHA_VERSION":
                i2 = 17205;
                break;
            case "UNVERIFIED_EMAIL":
                i2 = 17086;
                break;
            case "REJECTED_CREDENTIAL":
                i2 = 17075;
                break;
            case "INVALID_MFA_PENDING_CREDENTIAL":
                i2 = 17083;
                break;
            case "INVALID_VERIFICATION_PROOF":
                i2 = 17049;
                break;
            case "INVALID_PROVIDER_ID":
                i2 = 17071;
                break;
            case "CREDENTIAL_MISMATCH":
                i2 = 17002;
                break;
            case "WEB_CONTEXT_CANCELED":
                i2 = 17058;
                break;
            case "REQUIRES_SECOND_FACTOR_AUTH":
                i2 = 17078;
                break;
            case "MISSING_CLIENT_IDENTIFIER":
                i2 = 17093;
                break;
            case "INVALID_MESSAGE_PAYLOAD":
                i2 = 17031;
                break;
            case "RESET_PASSWORD_EXCEED_LIMIT":
            case "TOO_MANY_ATTEMPTS_TRY_LATER":
                i2 = 17010;
                break;
            case "INVALID_CUSTOM_TOKEN":
                i2 = 17000;
                break;
            case "INVALID_PASSWORD":
                i2 = 17009;
                break;
            case "INVALID_RECAPTCHA_TOKEN":
                i2 = 17202;
                break;
            case "SESSION_EXPIRED":
                i2 = 17051;
                break;
            case "MISSING_CODE":
                i2 = 17043;
                break;
            case "FEDERATED_USER_ID_ALREADY_LINKED":
                i2 = 17025;
                break;
            case "MISSING_RECAPTCHA_TOKEN":
                i2 = 17201;
                break;
            case "USER_DISABLED":
                i2 = 17005;
                break;
            case "INVALID_PHONE_NUMBER":
                i2 = 17042;
                break;
            case "INVALID_APP_CREDENTIAL":
                i2 = 17028;
                break;
            case "MISSING_CONTINUE_URI":
                i2 = 17040;
                break;
            case "MISSING_SESSION_INFO":
                i2 = 17045;
                break;
            case "EMAIL_CHANGE_NEEDS_VERIFICATION":
                i2 = 17090;
                break;
            case "UNSUPPORTED_TENANT_OPERATION":
                i2 = 17073;
                break;
            default:
                i2 = 17499;
                break;
        }
        if (i2 != 17499) {
            return new Status(i2, str2, (PendingIntent) null, (ConnectionResult) null);
        }
        if (str2 == null) {
            return new Status(i2, str, (PendingIntent) null, (ConnectionResult) null);
        }
        return new Status(i2, str + ":" + str2, (PendingIntent) null, (ConnectionResult) null);
    }

    public static void o(String str, Exception exc) {
        Log.e("TCG_log", s() + ": " + str, exc);
    }

    public static void o0() {
        try {
            if (f73.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static boolean p(int i2, int[] iArr, int[] iArr2) {
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (iArr[i3] != iArr2[i3]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] p0(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return q0(bArr, bArr2);
    }

    public static View q(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static byte[] q0(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i2 = 32;
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 32);
        int i3 = 0;
        bArrCopyOf[0] = (byte) (bArrCopyOf[0] & 248);
        byte b2 = (byte) (bArrCopyOf[31] & 127);
        bArrCopyOf[31] = b2;
        bArrCopyOf[31] = (byte) (b2 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        bArrCopyOf2[31] = (byte) (bArrCopyOf2[31] & 127);
        int i4 = 0;
        while (true) {
            byte[][] bArr3 = ga.v;
            if (i4 >= 7) {
                int i5 = 10;
                long[] jArr2 = new long[10];
                for (int i6 = 0; i6 < 10; i6++) {
                    int i7 = ia.e[i6];
                    jArr2[i6] = (((((long) (bArrCopyOf2[i7 + 3] & 255)) << 24) | ((((long) (bArrCopyOf2[i7] & 255)) | (((long) (bArrCopyOf2[i7 + 1] & 255)) << 8)) | (((long) (bArrCopyOf2[i7 + 2] & 255)) << 16))) >> ia.f[i6]) & ((long) ia.i[i6 & 1]);
                }
                long[] jArr3 = new long[19];
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                jArr5[0] = 1;
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                long[] jArr8 = new long[19];
                jArr8[0] = 1;
                long[] jArr9 = new long[19];
                long[] jArr10 = new long[19];
                jArr10[0] = 1;
                System.arraycopy(jArr2, 0, jArr3, 0, 10);
                while (i3 < i2) {
                    int i8 = bArrCopyOf[31 - i3] & 255;
                    int i9 = 0;
                    while (i9 < 8) {
                        int i10 = (i8 >> (7 - i9)) & 1;
                        ga.B(i10, jArr5, jArr3);
                        ga.B(i10, jArr6, jArr4);
                        byte[] bArr4 = bArrCopyOf;
                        long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
                        int i11 = i8;
                        long[] jArr11 = new long[19];
                        int i12 = i3;
                        long[] jArr12 = new long[19];
                        int i13 = i9;
                        long[] jArr13 = new long[19];
                        long[] jArr14 = jArr;
                        long[] jArr15 = new long[19];
                        long[] jArr16 = new long[19];
                        long[] jArr17 = jArr10;
                        long[] jArr18 = new long[19];
                        long[] jArr19 = new long[19];
                        ia.L(jArr5, jArr5, jArr6);
                        ia.J(jArr6, jArrCopyOf, jArr6);
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr3, 10);
                        ia.L(jArr3, jArr3, jArr4);
                        ia.J(jArr4, jArrCopyOf2, jArr4);
                        ia.G(jArr15, jArr3, jArr6);
                        ia.G(jArr16, jArr5, jArr4);
                        ia.E(jArr15);
                        ia.z(jArr15);
                        ia.E(jArr16);
                        ia.z(jArr16);
                        long[] jArr20 = jArr3;
                        System.arraycopy(jArr15, 0, jArrCopyOf2, 0, 10);
                        ia.L(jArr15, jArr15, jArr16);
                        ia.J(jArr16, jArrCopyOf2, jArr16);
                        ia.F(jArr19, jArr15);
                        ia.F(jArr18, jArr16);
                        ia.G(jArr16, jArr18, jArr2);
                        ia.E(jArr16);
                        ia.z(jArr16);
                        System.arraycopy(jArr19, 0, jArr7, 0, 10);
                        System.arraycopy(jArr16, 0, jArr8, 0, 10);
                        ia.F(jArr12, jArr5);
                        ia.F(jArr13, jArr6);
                        ia.G(jArr9, jArr12, jArr13);
                        ia.E(jArr9);
                        ia.z(jArr9);
                        ia.J(jArr13, jArr12, jArr13);
                        Arrays.fill(jArr11, 10, 18, 0L);
                        int i14 = 0;
                        for (int i15 = 10; i14 < i15; i15 = 10) {
                            jArr11[i14] = jArr13[i14] * 121665;
                            i14++;
                        }
                        ia.z(jArr11);
                        ia.L(jArr11, jArr11, jArr12);
                        ia.G(jArr17, jArr13, jArr11);
                        ia.E(jArr17);
                        ia.z(jArr17);
                        ga.B(i10, jArr9, jArr7);
                        ga.B(i10, jArr17, jArr8);
                        i9 = i13 + 1;
                        long[] jArr21 = jArr5;
                        jArr5 = jArr9;
                        jArr9 = jArr21;
                        long[] jArr22 = jArr6;
                        jArr6 = jArr17;
                        jArr10 = jArr22;
                        long[] jArr23 = jArr8;
                        jArr8 = jArr4;
                        jArr4 = jArr23;
                        i8 = i11;
                        jArr3 = jArr7;
                        bArrCopyOf = bArr4;
                        i3 = i12;
                        jArr = jArr14;
                        jArr7 = jArr20;
                    }
                    i3++;
                    i2 = 32;
                    i5 = 10;
                }
                long[] jArr24 = jArr;
                int i16 = i5;
                long[] jArr25 = new long[i16];
                long[] jArr26 = new long[i16];
                long[] jArr27 = new long[i16];
                long[] jArr28 = new long[i16];
                long[] jArr29 = new long[i16];
                long[] jArr30 = new long[i16];
                long[] jArr31 = new long[i16];
                long[] jArr32 = new long[i16];
                long[] jArr33 = new long[i16];
                long[] jArr34 = new long[i16];
                long[] jArr35 = jArr3;
                long[] jArr36 = new long[i16];
                ia.F(jArr26, jArr6);
                ia.F(jArr36, jArr26);
                ia.F(jArr34, jArr36);
                ia.B(jArr27, jArr34, jArr6);
                ia.B(jArr28, jArr27, jArr26);
                ia.F(jArr34, jArr28);
                ia.B(jArr29, jArr34, jArr27);
                ia.F(jArr34, jArr29);
                ia.F(jArr36, jArr34);
                ia.F(jArr34, jArr36);
                ia.F(jArr36, jArr34);
                ia.F(jArr34, jArr36);
                ia.B(jArr30, jArr34, jArr29);
                ia.F(jArr34, jArr30);
                ia.F(jArr36, jArr34);
                for (int i17 = 2; i17 < 10; i17 += 2) {
                    ia.F(jArr34, jArr36);
                    ia.F(jArr36, jArr34);
                }
                ia.B(jArr31, jArr36, jArr30);
                ia.F(jArr34, jArr31);
                ia.F(jArr36, jArr34);
                for (int i18 = 2; i18 < 20; i18 += 2) {
                    ia.F(jArr34, jArr36);
                    ia.F(jArr36, jArr34);
                }
                ia.B(jArr34, jArr36, jArr31);
                ia.F(jArr36, jArr34);
                ia.F(jArr34, jArr36);
                for (int i19 = 2; i19 < 10; i19 += 2) {
                    ia.F(jArr36, jArr34);
                    ia.F(jArr34, jArr36);
                }
                ia.B(jArr32, jArr34, jArr30);
                ia.F(jArr34, jArr32);
                ia.F(jArr36, jArr34);
                for (int i20 = 2; i20 < 50; i20 += 2) {
                    ia.F(jArr34, jArr36);
                    ia.F(jArr36, jArr34);
                }
                ia.B(jArr33, jArr36, jArr32);
                ia.F(jArr36, jArr33);
                ia.F(jArr34, jArr36);
                for (int i21 = 2; i21 < 100; i21 += 2) {
                    ia.F(jArr36, jArr34);
                    ia.F(jArr34, jArr36);
                }
                ia.B(jArr36, jArr34, jArr33);
                ia.F(jArr34, jArr36);
                ia.F(jArr36, jArr34);
                for (int i22 = 2; i22 < 50; i22 += 2) {
                    ia.F(jArr34, jArr36);
                    ia.F(jArr36, jArr34);
                }
                ia.B(jArr34, jArr36, jArr32);
                ia.F(jArr36, jArr34);
                ia.F(jArr34, jArr36);
                ia.F(jArr36, jArr34);
                ia.F(jArr34, jArr36);
                ia.F(jArr36, jArr34);
                ia.B(jArr25, jArr36, jArr28);
                ia.B(jArr24, jArr5, jArr25);
                long[] jArr37 = new long[10];
                long[] jArr38 = new long[10];
                long[] jArr39 = new long[11];
                long[] jArr40 = new long[11];
                long[] jArr41 = new long[11];
                ia.B(jArr37, jArr2, jArr24);
                ia.L(jArr38, jArr2, jArr24);
                long[] jArr42 = new long[10];
                jArr42[0] = 486662;
                ia.L(jArr40, jArr38, jArr42);
                ia.B(jArr40, jArr40, jArr4);
                ia.L(jArr40, jArr40, jArr35);
                ia.B(jArr40, jArr40, jArr37);
                ia.B(jArr40, jArr40, jArr35);
                for (int i23 = 0; i23 < 10; i23++) {
                    jArr39[i23] = jArr40[i23] * 4;
                }
                ia.z(jArr39);
                ia.B(jArr40, jArr37, jArr4);
                ia.J(jArr40, jArr40, jArr4);
                ia.B(jArr41, jArr38, jArr35);
                ia.L(jArr40, jArr40, jArr41);
                ia.F(jArr40, jArr40);
                if (MessageDigest.isEqual(ia.K(jArr39), ia.K(jArr40))) {
                    return ia.K(jArr24);
                }
                uq1.q("Arithmetic error in curve multiplication with the public key: ".concat(r93.q0(bArr2)));
                return null;
            }
            if (MessageDigest.isEqual(bArr3[i4], bArrCopyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(r93.q0(bArr3[i4])));
            }
            i4++;
        }
    }

    public static int[] r(int i2, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i2) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[(i2 + 31) >> 5];
        int i3 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i3] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i3++;
        }
        return iArr;
    }

    public static String s() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        String className = stackTraceElement.getClassName();
        String strReplaceAll = className.substring(className.lastIndexOf(".") + 1).replaceAll("\\$.*", BuildConfig.FLAVOR);
        return String.format("%s.%s (%s.java:%d)", strReplaceAll, stackTraceElement.getMethodName(), strReplaceAll, Integer.valueOf(stackTraceElement.getLineNumber()));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:115:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x011e A[Catch: all -> 0x00e6, Exception -> 0x00ea, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:5:0x0011  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129 A[Catch: all -> 0x00e6, Exception -> 0x00ea, TryCatch #8 {Exception -> 0x00ea, all -> 0x00e6, blocks: (B:40:0x00c5, B:42:0x00d3, B:44:0x00d7, B:51:0x00ef, B:53:0x0109, B:55:0x0114, B:62:0x0131, B:64:0x0137, B:67:0x0143, B:69:0x0147, B:70:0x0150, B:58:0x011e, B:60:0x0129, B:92:0x01b3, B:93:0x01ba), top: B:114:0x00c5 }] */
    public static nc t(Context context) throws Throwable {
        nc ncVar;
        Exception exc;
        Cursor cursor;
        Throwable th;
        Uri uri;
        String str;
        Uri uri2;
        Method methodQ;
        Object objS;
        context.getClass();
        Cursor cursor2 = null;
        try {
            if (!N(context) || (methodQ = h42.q("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (objS = h42.s(null, methodQ, context)) == null) {
                ncVar = null;
            } else {
                Method methodP = h42.p(objS.getClass(), "getId", new Class[0]);
                Method methodP2 = h42.p(objS.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (methodP == null || methodP2 == null) {
                    ncVar = null;
                } else {
                    ncVar = new nc();
                    ncVar.a = (String) h42.s(objS, methodP, new Object[0]);
                    Boolean bool = (Boolean) h42.s(objS, methodP2, new Object[0]);
                    ncVar.e = bool != null ? bool.booleanValue() : false;
                }
            }
        } catch (Exception unused) {
            i90 i90Var = i90.a;
        }
        if (ncVar == null) {
            if (N(context)) {
                mc mcVar = new mc();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    try {
                        if (context.bindService(intent, mcVar, 1)) {
                            try {
                                w5 w5Var = new w5(mcVar.a());
                                nc ncVar2 = new nc();
                                ncVar2.a = w5Var.e();
                                ncVar2.e = w5Var.F();
                                context.unbindService(mcVar);
                                ncVar = ncVar2;
                            } catch (Exception unused2) {
                                i90 i90Var2 = i90.a;
                                context.unbindService(mcVar);
                                ncVar = null;
                            }
                        } else {
                            ncVar = null;
                        }
                    } catch (Throwable th2) {
                        context.unbindService(mcVar);
                        throw th2;
                    }
                } catch (SecurityException unused3) {
                }
            } else {
                ncVar = null;
            }
            if (ncVar == null) {
                ncVar = new nc();
            }
        }
        try {
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                throw new d90("getAttributionIdentifiers cannot be called on the main thread.");
            }
            nc ncVar3 = nc.f;
            if (ncVar3 != null && System.currentTimeMillis() - ncVar3.b < 3600000) {
                return ncVar3;
            }
            String[] strArr = {"aid", "androidid", "limit_tracking"};
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
            ProviderInfo providerInfoResolveContentProvider2 = context.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
            if (providerInfoResolveContentProvider != null) {
                String str2 = providerInfoResolveContentProvider.packageName;
                str2.getClass();
                if (k90.a(context, str2)) {
                    uri2 = Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider");
                } else {
                    if (providerInfoResolveContentProvider2 != null) {
                        str = providerInfoResolveContentProvider2.packageName;
                        str.getClass();
                        if (k90.a(context, str)) {
                            uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        }
                    }
                    uri = null;
                }
                uri = uri2;
            } else {
                if (providerInfoResolveContentProvider2 != null) {
                    str = providerInfoResolveContentProvider2.packageName;
                    str.getClass();
                    if (k90.a(context, str)) {
                        uri2 = Uri.parse("content://com.facebook.wakizashi.provider.AttributionIdProvider");
                        uri = uri2;
                    }
                }
                uri = null;
            }
            PackageManager packageManager = context.getPackageManager();
            String installerPackageName = packageManager != null ? packageManager.getInstallerPackageName(context.getPackageName()) : null;
            if (installerPackageName != null) {
                ncVar.d = installerPackageName;
            }
            if (uri == null) {
                ncVar.b = System.currentTimeMillis();
                nc.f = ncVar;
            } else {
                Cursor cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("aid");
                            int columnIndex2 = cursorQuery.getColumnIndex("androidid");
                            int columnIndex3 = cursorQuery.getColumnIndex("limit_tracking");
                            ncVar.c = cursorQuery.getString(columnIndex);
                            if (columnIndex2 > 0 && columnIndex3 > 0 && ncVar.a() == null) {
                                ncVar.a = cursorQuery.getString(columnIndex2);
                                ncVar.e = Boolean.parseBoolean(cursorQuery.getString(columnIndex3));
                            }
                            cursorQuery.close();
                            ncVar.b = System.currentTimeMillis();
                            nc.f = ncVar;
                            return ncVar;
                        }
                    } catch (Exception e2) {
                        cursor = cursorQuery;
                        exc = e2;
                        try {
                            exc.toString();
                            i90 i90Var3 = i90.a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                                throw th;
                            }
                            cursor2.close();
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursorQuery;
                        th = th;
                        if (cursor2 != null) {
                            throw th;
                        }
                        cursor2.close();
                        throw th;
                    }
                }
                ncVar.b = System.currentTimeMillis();
                nc.f = ncVar;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return ncVar;
        } catch (Exception e3) {
            exc = e3;
            cursor = null;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public static int u(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final String v() {
        if (!mt.a.contains(kv.class)) {
            try {
                Context contextA = i90.a();
                List<ResolveInfo> listQueryIntentServices = contextA.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                listQueryIntentServices.getClass();
                String[] strArr = a;
                HashSet hashSet = new HashSet(v11.a(3));
                wb.m(strArr, hashSet);
                Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                        return serviceInfo.packageName;
                    }
                }
            } catch (Throwable th) {
                mt.a(kv.class, th);
                return null;
            }
        }
        return null;
    }

    public static Context w() {
        Context context = g;
        if (context != null) {
            return context;
        }
        uq1.h("u should init first");
        return null;
    }

    public static final String x() {
        if (mt.a.contains(kv.class)) {
            return null;
        }
        try {
            return "fbconnect://cct." + i90.a().getPackageName();
        } catch (Throwable th) {
            mt.a(kv.class, th);
            return null;
        }
    }

    public static String y(String str, boolean z) {
        if (i == null) {
            j42.a.b("GslbSdk is not initialized");
            return str;
        }
        if (TextUtils.isEmpty(str)) {
            j42.a.b("url is empty");
            return str;
        }
        String strA = j42.a(str);
        q20 q20VarC = q20.c();
        String str2 = (String) q20VarC.a.get(strA);
        q20VarC.a();
        if (str2 != null && !str2.equals("blank")) {
            return str.replace(strA, str2);
        }
        if (str2 == null) {
            b81 b81Var = j42.a;
            b81Var.d((String) b81Var.a.d, 5, y00.k(strA, " is not in init list "));
        }
        if (z) {
            return str;
        }
        return null;
    }

    public static void z(String str, sh1 sh1Var) {
        if (i == null) {
            j42.a.b("GslbSdk is not initialized");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            j42.a.b("url is empty");
            return;
        }
        String strA = j42.a(str);
        q20 q20VarC = q20.c();
        String str2 = (String) q20VarC.a.get(strA);
        q20VarC.a();
        if (str2 == null) {
            b81 b81Var = j42.a;
            b81Var.d((String) b81Var.a.d, 5, y00.k(strA, " this domain is not in init list "));
        } else {
            if (!str2.equals("blank")) {
                if (sh1Var != null) {
                    str.replace(strA, str2);
                    return;
                }
                return;
            }
            ka2 ka2Var = i;
            xy0 xy0Var = new xy0();
            xy0Var.c = str;
            xy0Var.d = sh1Var;
            ka2Var.c();
            Message messageObtainMessage = ka2Var.a.obtainMessage(101);
            messageObtainMessage.obj = xy0Var;
            ka2Var.a.sendMessage(messageObtainMessage);
        }
    }

    public abstract void U(Throwable th);

    public abstract void V(ud2 ud2Var);
}
