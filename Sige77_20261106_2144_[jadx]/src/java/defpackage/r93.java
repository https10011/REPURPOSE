package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class r93 implements l40 {
    public static volatile aa1 e;
    public static final int[] f = {R.attr.theme, 2130969858};
    public static final int[] g = {2130969439};
    public static final long[] h = {2791191049453778211L, 2791191049453778402L, 6};
    public static final String[] i = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] j = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public final /* synthetic */ int d = 6;

    public static void A(long j2, long j3, long[] jArr, int i2) {
        long j4 = j3 << 1;
        long j5 = j4 ^ j3;
        long j6 = j3 << 2;
        long j7 = j5 << 1;
        long[] jArr2 = {0, j3, j4, j5, j6, j6 ^ j3, j7, j7 ^ j3};
        int i3 = (int) j2;
        long j8 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
        long j9 = 0;
        int i4 = 33;
        do {
            int i5 = (int) (j2 >>> i4);
            long j10 = ((jArr2[i5 & 7] ^ (jArr2[(i5 >>> 3) & 7] << 3)) ^ (jArr2[(i5 >>> 6) & 7] << 6)) ^ (jArr2[(i5 >>> 9) & 7] << 9);
            j8 ^= j10 << i4;
            j9 ^= j10 >>> (-i4);
            i4 -= 12;
        } while (i4 > 0);
        jArr[i2] = 17592186044415L & j8;
        jArr[i2 + 1] = (j8 >>> 44) ^ (j9 << 20);
    }

    public static void B(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
        jArr2[4] = ((long) bj0.l((int) jArr[2])) & 4294967295L;
    }

    public static final int C(ob obVar, Object obj, int i2) {
        int i3 = obVar.c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iD = jw.d(i3, i2, obVar.a);
            if (iD < 0 || Intrinsics.areEqual(obj, obVar.b[iD])) {
                return iD;
            }
            int i4 = iD + 1;
            while (i4 < i3 && obVar.a[i4] == i2) {
                if (Intrinsics.areEqual(obj, obVar.b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iD - 1; i5 >= 0 && obVar.a[i5] == i2; i5--) {
                if (Intrinsics.areEqual(obj, obVar.b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static boolean E(byte b) {
        return b > -65;
    }

    public static boolean G(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean H(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 4; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean J(int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean K(long[] jArr) {
        for (int i2 = 0; i2 < 4; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void L(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = ((long) iArr[0]) & 4294967295L;
        long j11 = j10 * j2;
        iArr3[0] = (int) j11;
        long j12 = (j10 * j3) + (j11 >>> 32);
        iArr3[1] = (int) j12;
        long j13 = (j10 * j4) + (j12 >>> 32);
        iArr3[2] = (int) j13;
        long j14 = (j10 * j5) + (j13 >>> 32);
        iArr3[3] = (int) j14;
        long j15 = (j10 * j6) + (j14 >>> 32);
        iArr3[4] = (int) j15;
        long j16 = (j10 * j7) + (j15 >>> 32);
        iArr3[5] = (int) j16;
        long j17 = (j10 * j8) + (j16 >>> 32);
        iArr3[6] = (int) j17;
        long j18 = (j10 * j9) + (j17 >>> 32);
        iArr3[7] = (int) j18;
        int i2 = (int) (j18 >>> 32);
        iArr3[8] = i2;
        int i3 = 1;
        for (int i4 = 8; i3 < i4; i4 = 8) {
            long j19 = ((long) iArr[i3]) & 4294967295L;
            long j20 = j6;
            long j21 = (j19 * j2) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j21;
            int i5 = i3 + 1;
            long j22 = (j19 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j21 >>> 32);
            iArr3[i5] = (int) j22;
            int i6 = i3 + 2;
            long j23 = (j19 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j22 >>> 32);
            iArr3[i6] = (int) j23;
            int i7 = i3 + 3;
            long j24 = (j19 * j5) + (((long) iArr3[i7]) & 4294967295L) + (j23 >>> 32);
            iArr3[i7] = (int) j24;
            int i8 = i3 + 4;
            long j25 = (j19 * j20) + (((long) iArr3[i8]) & 4294967295L) + (j24 >>> 32);
            iArr3[i8] = (int) j25;
            int i9 = i3 + 5;
            long j26 = (j19 * j7) + (((long) iArr3[i9]) & 4294967295L) + (j25 >>> 32);
            iArr3[i9] = (int) j26;
            int i10 = i3 + 6;
            long j27 = (j19 * j8) + (((long) iArr3[i10]) & 4294967295L) + (j26 >>> 32);
            iArr3[i10] = (int) j27;
            long j28 = j27 >>> 32;
            int i11 = i3 + 7;
            long j29 = (j19 * j9) + (((long) iArr3[i11]) & 4294967295L) + j28;
            iArr3[i11] = (int) j29;
            iArr3[i3 + 8] = (int) (j29 >>> 32);
            i3 = i5;
            j6 = j20;
        }
    }

    public static int M(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j11 = ((long) iArr[i2]) & 4294967295L;
            long j12 = (j11 * j2) + (((long) iArr3[i2]) & 4294967295L);
            int i3 = i2;
            iArr3[i3] = (int) j12;
            int i4 = i3 + 1;
            long j13 = (j11 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j12 >>> 32);
            iArr3[i4] = (int) j13;
            int i5 = i3 + 2;
            long j14 = (j11 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j13 >>> 32);
            iArr3[i5] = (int) j14;
            int i6 = i3 + 3;
            long j15 = (j11 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j14 >>> 32);
            iArr3[i6] = (int) j15;
            int i7 = i3 + 4;
            long j16 = (j11 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j15 >>> 32);
            iArr3[i7] = (int) j16;
            int i8 = i3 + 5;
            long j17 = (j11 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j16 >>> 32);
            iArr3[i8] = (int) j17;
            int i9 = i3 + 6;
            long j18 = (j11 * j8) + (((long) iArr3[i9]) & 4294967295L) + (j17 >>> 32);
            iArr3[i9] = (int) j18;
            int i10 = i3 + 7;
            long j19 = (j11 * j9) + (((long) iArr3[i10]) & 4294967295L) + (j18 >>> 32);
            iArr3[i10] = (int) j19;
            int i11 = i3 + 8;
            long j20 = j10 + (((long) iArr3[i11]) & 4294967295L) + (j19 >>> 32);
            iArr3[i11] = (int) j20;
            j10 = j20 >>> 32;
            i2 = i4;
        }
        return (int) j10;
    }

    public static void O(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        z(jArr, jArr2, jArr4);
        U(jArr4, jArr3);
    }

    public static HashSet S(int i2) {
        int i3;
        if (i2 < 3) {
            gu2.k(i2, "expectedSize");
            i3 = i2 + 1;
        } else {
            i3 = i2 < 1073741824 ? (int) ((i2 / 0.75f) + 1.0f) : Integer.MAX_VALUE;
        }
        return new HashSet(i3);
    }

    public static final Object T(Object obj) {
        if (obj instanceof vp) {
            pj1 pj1Var = rj1.b;
            return zi0.i(((vp) obj).a);
        }
        pj1 pj1Var2 = rj1.b;
        return obj;
    }

    public static void U(long[] jArr, long[] jArr2) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = jArr[2];
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = j5 ^ (j6 >>> 59);
        long j8 = j2 ^ ((j7 << 61) ^ (j7 << 63));
        long j9 = (j3 ^ ((j6 << 61) ^ (j6 << 63))) ^ ((((j7 >>> 3) ^ (j7 >>> 1)) ^ j7) ^ (j7 << 5));
        long j10 = (j4 ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5))) ^ (j7 >>> 59);
        long j11 = j10 >>> 3;
        jArr2[0] = (((j8 ^ j11) ^ (j11 << 2)) ^ (j11 << 3)) ^ (j11 << 8);
        jArr2[1] = (j10 >>> 59) ^ j9;
        jArr2[2] = 7 & j10;
    }

    public static final void V(Object[] objArr, int i2, int i3) {
        objArr.getClass();
        while (i2 < i3) {
            objArr[i2] = null;
            i2++;
        }
    }

    public static void Y(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i2 = 16;
        int i3 = 0;
        int i4 = 7;
        while (true) {
            int i5 = i4 - 1;
            long j3 = ((long) iArr[i4]) & 4294967295L;
            long j4 = j3 * j3;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j4 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i5 <= 0) {
                long j5 = j2 * j2;
                long j6 = (j5 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[0] = (int) j5;
                int i6 = ((int) (j5 >>> 32)) & 1;
                long j7 = ((long) iArr[1]) & 4294967295L;
                long j8 = ((long) iArr2[2]) & 4294967295L;
                long j9 = (j7 * j2) + j6;
                int i7 = (int) j9;
                iArr2[1] = i6 | (i7 << 1);
                long j10 = ((long) iArr[2]) & 4294967295L;
                long j11 = ((long) iArr2[3]) & 4294967295L;
                long j12 = ((long) iArr2[4]) & 4294967295L;
                long j13 = (j10 * j2) + j8 + (j9 >>> 32);
                int i8 = (int) j13;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long jQ = ck1.q(j10, j7, j13 >>> 32, j11);
                long j14 = j12 + (jQ >>> 32);
                long j15 = ((long) iArr[3]) & 4294967295L;
                long j16 = (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
                long j17 = j14 & 4294967295L;
                long j18 = (((long) iArr2[6]) & 4294967295L) + (j16 >>> 32);
                long j19 = j16 & 4294967295L;
                long j20 = (j15 * j2) + (jQ & 4294967295L);
                int i9 = (int) j20;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long jQ2 = ck1.q(j15, j7, j20 >>> 32, j17);
                long jQ3 = ck1.q(j15, j10, jQ2 >>> 32, j19);
                long j21 = j18 + (jQ3 >>> 32);
                long j22 = jQ3 & 4294967295L;
                long j23 = ((long) iArr[4]) & 4294967295L;
                long j24 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j25 = (((long) iArr2[8]) & 4294967295L) + (j24 >>> 32);
                long j26 = j24 & 4294967295L;
                long j27 = (j23 * j2) + (jQ2 & 4294967295L);
                int i11 = (int) j27;
                iArr2[4] = i10 | (i11 << 1);
                long jQ4 = ck1.q(j23, j7, j27 >>> 32, j22);
                long jQ5 = ck1.q(j23, j10, jQ4 >>> 32, j21 & 4294967295L);
                long jQ6 = ck1.q(j23, j15, jQ5 >>> 32, j26);
                long j28 = jQ5 & 4294967295L;
                long j29 = j25 + (jQ6 >>> 32);
                long j30 = jQ6 & 4294967295L;
                long j31 = ((long) iArr[5]) & 4294967295L;
                long j32 = (((long) iArr2[9]) & 4294967295L) + (j29 >>> 32);
                long j33 = (((long) iArr2[10]) & 4294967295L) + (j32 >>> 32);
                long j34 = (j31 * j2) + (jQ4 & 4294967295L);
                int i12 = (int) j34;
                iArr2[5] = (i11 >>> 31) | (i12 << 1);
                int i13 = i12 >>> 31;
                long jQ7 = ck1.q(j31, j7, j34 >>> 32, j28);
                long jQ8 = ck1.q(j31, j10, jQ7 >>> 32, j30);
                long jQ9 = ck1.q(j31, j15, jQ8 >>> 32, j29 & 4294967295L);
                long j35 = jQ8 & 4294967295L;
                long jQ10 = ck1.q(j31, j23, jQ9 >>> 32, j32 & 4294967295L);
                long j36 = jQ9 & 4294967295L;
                long j37 = j33 + (jQ10 >>> 32);
                long j38 = ((long) iArr[6]) & 4294967295L;
                long j39 = (((long) iArr2[11]) & 4294967295L) + (j37 >>> 32);
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j39 >>> 32);
                long j41 = (j38 * j2) + (jQ7 & 4294967295L);
                int i14 = (int) j41;
                iArr2[6] = i13 | (i14 << 1);
                int i15 = i14 >>> 31;
                long jQ11 = ck1.q(j38, j7, j41 >>> 32, j35);
                long jQ12 = ck1.q(j38, j10, jQ11 >>> 32, j36);
                long jQ13 = ck1.q(j38, j15, jQ12 >>> 32, jQ10 & 4294967295L);
                long j42 = jQ12 & 4294967295L;
                long jQ14 = ck1.q(j38, j23, jQ13 >>> 32, j37 & 4294967295L);
                long j43 = jQ13 & 4294967295L;
                long jQ15 = ck1.q(j38, j31, jQ14 >>> 32, j39 & 4294967295L);
                long j44 = j40 + (jQ15 >>> 32);
                long j45 = ((long) iArr[7]) & 4294967295L;
                long j46 = (((long) iArr2[13]) & 4294967295L) + (j44 >>> 32);
                long j47 = (((long) iArr2[14]) & 4294967295L) + (j46 >>> 32);
                long j48 = j46 & 4294967295L;
                long j49 = (j45 * j2) + (jQ11 & 4294967295L);
                int i16 = (int) j49;
                iArr2[7] = (i16 << 1) | i15;
                int i17 = i16 >>> 31;
                long jQ16 = ck1.q(j45, j7, j49 >>> 32, j42);
                long jQ17 = ck1.q(j45, j10, jQ16 >>> 32, j43);
                long jQ18 = ck1.q(j45, j15, jQ17 >>> 32, jQ14 & 4294967295L);
                long jQ19 = ck1.q(j45, j23, jQ18 >>> 32, jQ15 & 4294967295L);
                long jQ20 = ck1.q(j45, j31, jQ19 >>> 32, j44 & 4294967295L);
                long jQ21 = ck1.q(j45, j38, jQ20 >>> 32, j48);
                long j50 = j47 + (jQ21 >>> 32);
                int i18 = (int) jQ16;
                iArr2[8] = (i18 << 1) | i17;
                int i19 = (int) jQ17;
                iArr2[9] = (i18 >>> 31) | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) jQ18;
                iArr2[10] = i20 | (i21 << 1);
                int i22 = i21 >>> 31;
                int i23 = (int) jQ19;
                iArr2[11] = i22 | (i23 << 1);
                int i24 = i23 >>> 31;
                int i25 = (int) jQ20;
                iArr2[12] = i24 | (i25 << 1);
                int i26 = i25 >>> 31;
                int i27 = (int) jQ21;
                iArr2[13] = i26 | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j50;
                iArr2[14] = i28 | (i29 << 1);
                iArr2[15] = ((iArr2[15] + ((int) (j50 >>> 32))) << 1) | (i29 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static void Z(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[5];
        B(jArr, jArr3);
        U(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            B(jArr2, jArr3);
            U(jArr3, jArr2);
        }
    }

    public static Object a(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                return bundle.get(str);
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static final String b(Object[] objArr, int i2, int i3, f1 f1Var) {
        StringBuilder sb = new StringBuilder((i3 * 3) + 2);
        sb.append("[");
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i2 + i4];
            if (obj == f1Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static int b0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        long j6 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j5 >> 32);
        iArr3[4] = (int) j6;
        long j7 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j6 >> 32);
        iArr3[5] = (int) j7;
        long j8 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j7 >> 32);
        iArr3[6] = (int) j8;
        long j9 = ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L)) + (j8 >> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >> 32);
    }

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (j8 >>> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static void c0(int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[i2]) & 4294967295L) - (((long) iArr2[i3]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = ((((long) iArr[i2 + 1]) & 4294967295L) - (((long) iArr2[i3 + 1]) & 4294967295L)) + (j2 >> 32);
        iArr3[1] = (int) j3;
        long j4 = ((((long) iArr[i2 + 2]) & 4294967295L) - (((long) iArr2[i3 + 2]) & 4294967295L)) + (j3 >> 32);
        iArr3[2] = (int) j4;
        long j5 = ((((long) iArr[i2 + 3]) & 4294967295L) - (((long) iArr2[i3 + 3]) & 4294967295L)) + (j4 >> 32);
        iArr3[3] = (int) j5;
        long j6 = ((((long) iArr[i2 + 4]) & 4294967295L) - (((long) iArr2[i3 + 4]) & 4294967295L)) + (j5 >> 32);
        iArr3[4] = (int) j6;
        long j7 = ((((long) iArr[i2 + 5]) & 4294967295L) - (((long) iArr2[i3 + 5]) & 4294967295L)) + (j6 >> 32);
        iArr3[5] = (int) j7;
        long j8 = ((((long) iArr[i2 + 6]) & 4294967295L) - (((long) iArr2[i3 + 6]) & 4294967295L)) + (j7 >> 32);
        iArr3[6] = (int) j8;
        iArr3[7] = (int) (((((long) iArr[i2 + 7]) & 4294967295L) - (((long) iArr2[i3 + 7]) & 4294967295L)) + (j8 >> 32));
    }

    public static void d0(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j4 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j4;
        long j5 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j4 >> 32);
        iArr2[3] = (int) j5;
        long j6 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j5 >> 32);
        iArr2[4] = (int) j6;
        long j7 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j6 >> 32);
        iArr2[5] = (int) j7;
        long j8 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j7 >> 32);
        iArr2[6] = (int) j8;
        iArr2[7] = (int) (((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j8 >> 32));
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j2;
        long j3 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j2 >>> 32);
        iArr3[1] = (int) j3;
        long j4 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j3 >>> 32);
        iArr3[2] = (int) j4;
        long j5 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j4 >>> 32);
        iArr3[3] = (int) j5;
        long j6 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j5 >>> 32);
        iArr3[4] = (int) j6;
        long j7 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j6 >>> 32);
        iArr3[5] = (int) j7;
        long j8 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j7 >>> 32);
        iArr3[6] = (int) j8;
        long j9 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L) + (j8 >>> 32);
        iArr3[7] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static int h(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i3]) & 4294967295L) + (((long) i4) & 4294967295L);
        iArr2[i3] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (((long) iArr[i2 + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L) + (j2 >>> 32);
        iArr2[i5] = (int) j3;
        int i6 = i3 + 2;
        long j4 = (((long) iArr[i2 + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L) + (j3 >>> 32);
        iArr2[i6] = (int) j4;
        int i7 = i3 + 3;
        long j5 = (((long) iArr[i2 + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L) + (j4 >>> 32);
        iArr2[i7] = (int) j5;
        int i8 = i3 + 4;
        long j6 = (((long) iArr[i2 + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L) + (j5 >>> 32);
        iArr2[i8] = (int) j6;
        int i9 = i3 + 5;
        long j7 = (((long) iArr[i2 + 5]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        int i10 = i3 + 6;
        long j8 = (((long) iArr[i2 + 6]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L) + (j7 >>> 32);
        iArr2[i10] = (int) j8;
        int i11 = i3 + 7;
        long j9 = (((long) iArr[i2 + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i11])) + (j8 >>> 32);
        iArr2[i11] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static BigInteger h0(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 8; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                sp0.r(bArr, i3, (7 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static int i(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L);
        int i2 = (int) j2;
        iArr[8] = i2;
        iArr2[16] = i2;
        long j3 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[17]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[9] = i3;
        iArr2[17] = i3;
        long j4 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[18]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[10] = i4;
        iArr2[18] = i4;
        long j5 = (((long) iArr[11]) & 4294967295L) + (((long) iArr2[19]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[11] = i5;
        iArr2[19] = i5;
        long j6 = (((long) iArr[12]) & 4294967295L) + (((long) iArr2[20]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[12] = i6;
        iArr2[20] = i6;
        long j7 = (((long) iArr[13]) & 4294967295L) + (((long) iArr2[21]) & 4294967295L) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[13] = i7;
        iArr2[21] = i7;
        long j8 = (((long) iArr[14]) & 4294967295L) + (((long) iArr2[22]) & 4294967295L) + (j7 >>> 32);
        int i8 = (int) j8;
        iArr[14] = i8;
        iArr2[22] = i8;
        long j9 = (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) iArr2[23])) + (j8 >>> 32);
        int i9 = (int) j9;
        iArr[15] = i9;
        iArr2[23] = i9;
        return (int) (j9 >>> 32);
    }

    public static BigInteger i0(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i2 = 0; i2 < 4; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                sp0.v((3 - i2) << 3, j2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final void j(ob obVar, int i2) {
        obVar.a = new int[i2];
        obVar.b = new Object[i2];
    }

    public static Context j0(Context context, AttributeSet attributeSet, int i2, int i3) {
        return k0(context, attributeSet, i2, i3, new int[0]);
    }

    public static Context k0(Context context, AttributeSet attributeSet, int i2, int i3, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof es) && ((es) context).a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        es esVar = new es(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                esVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            esVar.getTheme().applyStyle(resourceId, true);
        }
        return esVar;
    }

    public static void l(String str, boolean z) {
        if (z) {
            return;
        }
        e.g(str);
    }

    public static void l0(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    public static void m(int i2) {
        if (i2 >= 0) {
            return;
        }
        sm0.a();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0177, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0173, B:76:0x017a, B:77:0x017d, B:78:0x017e, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0079, B:39:0x007f, B:40:0x008b, B:61:0x0157, B:62:0x015a, B:70:0x016a, B:69:0x0167, B:71:0x016b, B:72:0x0170, B:73:0x0171, B:32:0x0069, B:36:0x0070), top: B:83:0x0007, inners: #4 }] */
    public static aa1 m0(Context context) {
        aa1 aa1Var;
        aa1 sc1Var;
        aa1 sc1Var2;
        char c;
        aa1 aa1Var2 = e;
        if (aa1Var2 != null) {
            return aa1Var2;
        }
        synchronized (r93.class) {
            try {
                aa1Var = e;
                if (aa1Var == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    mb mbVar = s93.a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        aa1Var = x.a;
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c2 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                sc1Var = file.exists() ? new sc1(file) : x.a;
                            } catch (RuntimeException e2) {
                                Log.e("HermeticFileOverrides", "no data dir", e2);
                                sc1Var = x.a;
                            }
                            if (sc1Var.b()) {
                                File file2 = (File) sc1Var.a();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        wq1 wq1Var = new wq1(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c2]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                wq1 wq1Var2 = (wq1) wq1Var.get(str3);
                                                if (wq1Var2 == null) {
                                                    c = 0;
                                                    wq1Var2 = new wq1(0);
                                                    wq1Var.put(str3, wq1Var2);
                                                } else {
                                                    c = 0;
                                                }
                                                wq1Var2.put(strDecode, strDecode2);
                                                c2 = c;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        o93 o93Var = new o93(wq1Var);
                                        bufferedReader.close();
                                        sc1Var2 = new sc1(o93Var);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            } else {
                                sc1Var2 = x.a;
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            aa1Var = sc1Var2;
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        aa1Var = x.a;
                    }
                    e = aa1Var;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return aa1Var;
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static String n0(Context context) {
        try {
            return context.getResources().getResourcePackageName(2131886178);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static boolean o(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i2 = 7;
        while (true) {
            z = true;
            if (i2 < 0) {
                break;
            }
            int i3 = iArr[8 + i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                z = false;
                break;
            }
            if (i3 > i4) {
                break;
            }
            i2--;
        }
        if (z) {
            c0(8, 0, iArr, iArr2, iArr3);
            return z;
        }
        c0(0, 8, iArr2, iArr, iArr3);
        return z;
    }

    public static String o0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static byte[] p0(String str) {
        if (str.length() % 2 != 0) {
            e.g("Expected a string of even length");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                e.g("input is not hexadecimal");
                return null;
            }
            bArr[i2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static boolean q(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static String q0(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i2 = b & 255;
            sb.append("0123456789abcdef".charAt(i2 / 16));
            sb.append("0123456789abcdef".charAt(i2 % 16));
        }
        return sb.toString();
    }

    public static boolean r(long[] jArr, long[] jArr2) {
        for (int i2 = 3; i2 >= 0; i2--) {
            if (jArr[i2] != jArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] s(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[8];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static long[] t(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            sm0.a();
            return null;
        }
        long[] jArr = new long[4];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i2] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i2++;
        }
        return jArr;
    }

    public static int u(int[] iArr) {
        return iArr[0] & 1;
    }

    public static Task w(Intent intent) {
        zj0 zj0Var;
        GoogleSignInAccount googleSignInAccount;
        h01 h01Var = qi2.a;
        Status status = Status.i;
        if (intent == null) {
            zj0Var = new zj0(null, status);
        } else {
            Status status2 = (Status) intent.getParcelableExtra("googleSignInStatus");
            GoogleSignInAccount parcelableExtra = intent.getParcelableExtra("googleSignInAccount");
            if (parcelableExtra == null) {
                if (status2 != null) {
                    status = status2;
                }
                zj0Var = new zj0(null, status);
            } else {
                zj0Var = new zj0(parcelableExtra, Status.e);
            }
        }
        Status status3 = zj0Var.a;
        return (!status3.R() || (googleSignInAccount = zj0Var.b) == null) ? Tasks.forException(nj2.y(status3)) : Tasks.forResult(googleSignInAccount);
    }

    public static boolean x(int[] iArr, int[] iArr2) {
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static int y(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        long j2 = jArr[0];
        long j3 = jArr[1];
        long j4 = ((jArr[2] << 40) ^ (j3 >>> 24)) & 17592186044415L;
        long j5 = ((j3 << 20) ^ (j2 >>> 44)) & 17592186044415L;
        long j6 = j2 & 17592186044415L;
        long j7 = jArr2[0];
        long j8 = jArr2[1];
        long j9 = ((j8 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j10 = ((j7 >>> 44) ^ (j8 << 20)) & 17592186044415L;
        long j11 = j7 & 17592186044415L;
        long[] jArr4 = new long[10];
        A(j6, j11, jArr4, 0);
        A(j4, j9, jArr4, 2);
        long j12 = (j6 ^ j5) ^ j4;
        long j13 = (j11 ^ j10) ^ j9;
        A(j12, j13, jArr4, 4);
        long j14 = (j5 << 1) ^ (j4 << 2);
        long j15 = (j10 << 1) ^ (j9 << 2);
        A(j6 ^ j14, j11 ^ j15, jArr4, 6);
        A(j12 ^ j14, j13 ^ j15, jArr4, 8);
        long j16 = jArr4[6];
        long j17 = jArr4[8] ^ j16;
        long j18 = jArr4[7];
        long j19 = j18 ^ jArr4[9];
        long j20 = (j17 << 1) ^ j16;
        long j21 = (j17 ^ (j19 << 1)) ^ j18;
        long j22 = jArr4[0];
        long j23 = jArr4[1];
        long j24 = (j23 ^ j22) ^ jArr4[4];
        long j25 = j23 ^ jArr4[5];
        long j26 = jArr4[2];
        long j27 = ((j20 ^ j22) ^ (j26 << 4)) ^ (j26 << 1);
        long j28 = jArr4[3];
        long j29 = (((j24 ^ j21) ^ (j28 << 4)) ^ (j28 << 1)) ^ (j27 >>> 44);
        long j30 = (j25 ^ j19) ^ (j29 >>> 44);
        long j31 = ((j27 & 17592186044415L) >>> 1) ^ ((j29 & 1) << 43);
        long j32 = j31 ^ (j31 << 1);
        long j33 = j32 ^ (j32 << 2);
        long j34 = j33 ^ (j33 << 4);
        long j35 = j34 ^ (j34 << 8);
        long j36 = j35 ^ (j35 << 16);
        long j37 = (j36 ^ (j36 << 32)) & 17592186044415L;
        long j38 = (((j29 & 17592186044415L) >>> 1) ^ ((j30 & 1) << 43)) ^ (j37 >>> 43);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = 17592186044415L & (j43 ^ (j43 << 32));
        long j45 = (j30 >>> 1) ^ (j44 >>> 43);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = j50 ^ (j50 << 32);
        jArr3[0] = j22;
        long j52 = (j24 ^ j37) ^ j26;
        jArr3[1] = j52;
        long j53 = ((j25 ^ j44) ^ j37) ^ j28;
        jArr3[2] = j53;
        long j54 = j44 ^ j51;
        jArr3[3] = j54;
        long j55 = j51 ^ jArr4[2];
        jArr3[4] = j55;
        long j56 = jArr4[3];
        jArr3[5] = j56;
        jArr3[0] = j22 ^ (j52 << 44);
        jArr3[1] = (j52 >>> 20) ^ (j53 << 24);
        jArr3[2] = ((j53 >>> 40) ^ (j54 << 4)) ^ (j55 << 48);
        jArr3[3] = ((j54 >>> 60) ^ (j56 << 28)) ^ (j55 >>> 16);
        jArr3[4] = j56 >>> 36;
        jArr3[5] = 0;
    }

    public abstract r93 D();

    public boolean F() {
        return k() == 1;
    }

    public boolean I() {
        return g0().signum() == 0;
    }

    public abstract r93 N(r93 r93Var);

    public r93 P(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return N(r93Var).e0(r93Var2.N(r93Var3));
    }

    public r93 Q(r93 r93Var, r93 r93Var2, r93 r93Var3) {
        return N(r93Var).d(r93Var2.N(r93Var3));
    }

    public abstract r93 R();

    public abstract r93 W();

    public abstract r93 X();

    public r93 a0(r93 r93Var, r93 r93Var2) {
        return X().d(r93Var.N(r93Var2));
    }

    public abstract r93 d(r93 r93Var);

    public abstract r93 e0(r93 r93Var);

    public boolean f0() {
        return g0().testBit(0);
    }

    public abstract r93 g();

    public abstract BigInteger g0();

    public int k() {
        return g0().bitLength();
    }

    public abstract r93 p(r93 r93Var);

    public String toString() {
        switch (this.d) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                return g0().toString(16);
            default:
                return super.toString();
        }
    }

    public abstract int v();
}
