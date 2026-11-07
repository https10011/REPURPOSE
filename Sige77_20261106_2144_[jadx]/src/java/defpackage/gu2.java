package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.a;
import com.hjq.toast.BuildConfig;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import javax.crypto.KeyGenerator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gu2 {
    public static ClassLoader a;
    public static Thread b;
    public static final char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final int[] e = {-1, -1, -1, 0, 0, 0, 1, -1};
    public static final int[] f = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};
    public static final String[] g = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] h = {"ad_impression"};
    public static final String[] i = {"ad_impression", "in_app_purchase"};
    public static final String[] j = {"ad_impression"};
    public static final String[] k = {"ad_impression", "in_app_purchase"};
    public static final String[] l = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] m = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static boolean A(int[] iArr) {
        for (int i2 = 0; i2 < 5; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void B(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        int i2 = 1;
        long j8 = j7 * j2;
        iArr3[0] = (int) j8;
        char c2 = ' ';
        long j9 = (j8 >>> 32) + (j7 * j3);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j4);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j5);
        iArr3[3] = (int) j11;
        long j12 = (j7 * j6) + (j11 >>> 32);
        iArr3[4] = (int) j12;
        int i3 = 5;
        iArr3[5] = (int) (j12 >>> 32);
        while (true) {
            int i4 = i2;
            if (i4 >= i3) {
                return;
            }
            long j13 = ((long) iArr[i4]) & 4294967295L;
            long j14 = (j13 * j2) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j14;
            i2 = i4 + 1;
            char c3 = c2;
            long j15 = (j13 * j3) + (((long) iArr3[i2]) & 4294967295L) + (j14 >>> c2);
            iArr3[i2] = (int) j15;
            int i5 = i4 + 2;
            long j16 = j6;
            long j17 = (j13 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j15 >>> c3);
            iArr3[i5] = (int) j17;
            long j18 = j17 >>> c3;
            int i6 = i4 + 3;
            long j19 = (j13 * j5) + (((long) iArr3[i6]) & 4294967295L) + j18;
            iArr3[i6] = (int) j19;
            long j20 = j19 >>> c3;
            int i7 = i4 + 4;
            long j21 = (j13 * j16) + (((long) iArr3[i7]) & 4294967295L) + j20;
            iArr3[i7] = (int) j21;
            iArr3[i4 + 5] = (int) (j21 >>> c3);
            c2 = c3;
            j6 = j16;
            i3 = 5;
        }
    }

    public static int C(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = 4294967295L;
        long j3 = ((long) iArr2[0]) & 4294967295L;
        long j4 = ((long) iArr2[1]) & 4294967295L;
        long j5 = ((long) iArr2[2]) & 4294967295L;
        long j6 = ((long) iArr2[3]) & 4294967295L;
        long j7 = ((long) iArr2[4]) & 4294967295L;
        long j8 = 0;
        while (i2 < 5) {
            long j9 = j2;
            long j10 = ((long) iArr[i2]) & j9;
            int i3 = i2;
            long j11 = (j10 * j3) + (((long) iArr3[i2]) & j9);
            iArr3[i3] = (int) j11;
            int i4 = i3 + 1;
            long j12 = (j10 * j4) + (((long) iArr3[i4]) & j9) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i3 + 2;
            long j13 = (j10 * j5) + (((long) iArr3[i5]) & j9) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i3 + 3;
            long j14 = (j10 * j6) + (((long) iArr3[i6]) & j9) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i3 + 4;
            long j15 = (j10 * j7) + (((long) iArr3[i7]) & j9) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i3 + 5;
            long j16 = j8 + (((long) iArr3[i8]) & j9) + (j15 >>> 32);
            iArr3[i8] = (int) j16;
            j8 = j16 >>> 32;
            j2 = j9;
            j3 = j3;
            i2 = i4;
        }
        return (int) j8;
    }

    public static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        r93.L(iArr, iArr2, iArr4);
        E(iArr4, iArr3);
    }

    public static void E(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[8]) & 4294967295L;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = ((long) iArr[10]) & 4294967295L;
        long j5 = ((long) iArr[11]) & 4294967295L;
        long j6 = ((long) iArr[12]) & 4294967295L;
        long j7 = ((long) iArr[13]) & 4294967295L;
        long j8 = ((long) iArr[14]) & 4294967295L;
        long j9 = ((long) iArr[15]) & 4294967295L;
        long j10 = j2 - 6;
        long j11 = j10 + j3;
        long j12 = j3 + j4;
        long j13 = (j4 + j5) - j9;
        long j14 = j5 + j6;
        long j15 = j6 + j7;
        long j16 = j7 + j8;
        long j17 = j8 + j9;
        long j18 = j16 - j11;
        long j19 = ((((long) iArr[0]) & 4294967295L) - j14) - j18;
        iArr2[0] = (int) j19;
        long j20 = ((((((long) iArr[1]) & 4294967295L) + j12) - j15) - j17) + (j19 >> 32);
        iArr2[1] = (int) j20;
        long j21 = (((((long) iArr[2]) & 4294967295L) + j13) - j16) + (j20 >> 32);
        iArr2[2] = (int) j21;
        long j22 = ((((((long) iArr[3]) & 4294967295L) + (j14 << 1)) + j18) - j17) + (j21 >> 32);
        iArr2[3] = (int) j22;
        long j23 = ((((((long) iArr[4]) & 4294967295L) + (j15 << 1)) + j8) - j12) + (j22 >> 32);
        iArr2[4] = (int) j23;
        long j24 = (((((long) iArr[5]) & 4294967295L) + (j16 << 1)) - j13) + (j23 >> 32);
        iArr2[5] = (int) j24;
        long j25 = (((long) iArr[6]) & 4294967295L) + (j17 << 1) + j18 + (j24 >> 32);
        iArr2[6] = (int) j25;
        long j26 = (((((((long) iArr[7]) & 4294967295L) + (j9 << 1)) + j10) - j13) - j15) + (j25 >> 32);
        iArr2[7] = (int) j26;
        F(iArr2, (int) ((j26 >> 32) + 6));
    }

    public static void F(int[] iArr, int i2) {
        long j2;
        if (i2 != 0) {
            long j3 = ((long) i2) & 4294967295L;
            long j4 = (((long) iArr[0]) & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = j4 >> 32;
            if (j5 != 0) {
                long j6 = j5 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j6;
                long j7 = (j6 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j5 = j7 >> 32;
            }
            long j8 = ((((long) iArr[3]) & 4294967295L) - j3) + j5;
            iArr[3] = (int) j8;
            long j9 = j8 >> 32;
            if (j9 != 0) {
                long j10 = j9 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j11;
                j9 = j11 >> 32;
            }
            long j12 = ((((long) iArr[6]) & 4294967295L) - j3) + j9;
            iArr[6] = (int) j12;
            long j13 = (4294967295L & ((long) iArr[7])) + j3 + (j12 >> 32);
            iArr[7] = (int) j13;
            j2 = j13 >> 32;
        } else {
            j2 = 0;
        }
        if (j2 != 0 || (iArr[7] == -1 && r93.x(iArr, e))) {
            e(iArr);
        }
    }

    public static void G(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        E(iArr3, iArr2);
    }

    public static void H(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i2 = 10;
        int i3 = 0;
        int i4 = 4;
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
                long j22 = ((long) iArr[4]) & 4294967295L;
                long j23 = (((long) iArr2[7]) & 4294967295L) + (j21 >>> 32);
                long j24 = j21 & 4294967295L;
                long j25 = (((long) iArr2[8]) & 4294967295L) + (j23 >>> 32);
                long j26 = (j22 * j2) + (jQ2 & 4294967295L);
                int i11 = (int) j26;
                iArr2[4] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long jQ4 = ck1.q(j22, j7, j26 >>> 32, jQ3 & 4294967295L);
                long jQ5 = ck1.q(j22, j10, jQ4 >>> 32, j24);
                long jQ6 = ck1.q(j22, j15, jQ5 >>> 32, j23 & 4294967295L);
                long j27 = j25 + (jQ6 >>> 32);
                int i13 = (int) jQ4;
                iArr2[5] = (i13 << 1) | i12;
                int i14 = (int) jQ5;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = i14 >>> 31;
                int i16 = (int) jQ6;
                iArr2[7] = i15 | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) j27;
                iArr2[8] = i17 | (i18 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j27 >>> 32))) << 1) | (i18 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static void I(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        E(iArr3, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            r93.Y(iArr2, iArr3);
            E(iArr3, iArr2);
        }
    }

    public static int J(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >> 32);
    }

    public static void K(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j2;
        long j3 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j2 >> 32);
        iArr2[1] = (int) j3;
        long j4 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j3 >> 32);
        iArr2[2] = (int) j4;
        long j5 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j4 >> 32);
        iArr2[3] = (int) j5;
        iArr2[4] = (int) (((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j5 >> 32));
    }

    public static void L(int[] iArr, int[] iArr2, int[] iArr3) {
        if (r93.b0(iArr, iArr2, iArr3) != 0) {
            long j2 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = (((long) iArr3[3]) & 4294967295L) + 1 + j3;
            iArr3[3] = (int) j6;
            long j7 = j6 >> 32;
            if (j7 != 0) {
                long j8 = j7 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j8;
                long j9 = (j8 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j9;
                j7 = j9 >> 32;
            }
            long j10 = (((long) iArr3[6]) & 4294967295L) + 1 + j7;
            iArr3[6] = (int) j10;
            iArr3[7] = (int) (((((long) iArr3[7]) & 4294967295L) - 1) + (j10 >> 32));
        }
    }

    public static BigInteger M(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                sp0.r(bArr, i3, (4 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static boolean N(int i2, Context context, String str) {
        na1 na1VarA = la2.a(context);
        na1VarA.getClass();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) na1VarA.b.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i2, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int O(int i2) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = iArr[i3];
            int i5 = i4 - 1;
            if (i4 == 0) {
                throw null;
            }
            if (i5 == i2) {
                return i4;
            }
        }
        return 1;
    }

    public static int P(int i2, byte[] bArr, int i3, int i4, jt2 jt2Var, zk2 zk2Var) throws ks2 {
        if ((i2 >>> 3) == 0) {
            throw ks2.b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iC0 = c0(bArr, i3, zk2Var);
            jt2Var.c(i2, Long.valueOf(zk2Var.b));
            return iC0;
        }
        if (i5 == 1) {
            jt2Var.c(i2, Long.valueOf(d0(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iA0 = a0(bArr, i3, zk2Var);
            int i6 = zk2Var.a;
            if (i6 < 0) {
                throw ks2.e();
            }
            if (i6 > bArr.length - iA0) {
                throw ks2.g();
            }
            if (i6 == 0) {
                jt2Var.c(i2, jr2.b);
            } else {
                jt2Var.c(i2, jr2.e(bArr, iA0, i6));
            }
            return iA0 + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw ks2.b();
            }
            jt2Var.c(i2, Integer.valueOf(Z(bArr, i3)));
            return i3 + 4;
        }
        jt2 jt2VarE = jt2.e();
        int i7 = (i2 & (-8)) | 4;
        int i8 = zk2Var.d + 1;
        zk2Var.d = i8;
        if (i8 >= 100) {
            throw new ks2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (i3 < i4) {
            int iA1 = a0(bArr, i3, zk2Var);
            i9 = zk2Var.a;
            if (i9 == i7) {
                i3 = iA1;
                break;
            }
            i3 = P(i9, bArr, iA1, i4, jt2VarE, zk2Var);
        }
        zk2Var.d--;
        if (i3 > i4 || i9 != i7) {
            throw ks2.f();
        }
        jt2Var.c(i2, jt2VarE);
        return i3;
    }

    public static int Q(int i2, byte[] bArr, int i3, zk2 zk2Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zk2Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            zk2Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zk2Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zk2Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zk2Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int R(Object obj, ct2 ct2Var, byte[] bArr, int i2, int i3, int i4, zk2 zk2Var) throws ks2 {
        vs2 vs2Var = (vs2) ct2Var;
        int i5 = zk2Var.d + 1;
        zk2Var.d = i5;
        if (i5 >= 100) {
            throw new ks2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iK = vs2Var.k(obj, bArr, i2, i3, i4, zk2Var);
        zk2Var.d--;
        zk2Var.c = obj;
        return iK;
    }

    public static int S(Object obj, ct2 ct2Var, byte[] bArr, int i2, int i3, zk2 zk2Var) throws ks2 {
        int iQ = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iQ = Q(i4, bArr, iQ, zk2Var);
            i4 = zk2Var.a;
        }
        int i5 = iQ;
        if (i4 < 0 || i4 > i3 - i5) {
            throw ks2.g();
        }
        int i6 = zk2Var.d + 1;
        zk2Var.d = i6;
        if (i6 >= 100) {
            throw new ks2("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i7 = i5 + i4;
        ct2Var.i(obj, bArr, i5, i7, zk2Var);
        zk2Var.d--;
        zk2Var.c = obj;
        return i7;
    }

    public static int T(byte[] bArr, int i2, zk2 zk2Var) throws ks2 {
        int iA0 = a0(bArr, i2, zk2Var);
        int i3 = zk2Var.a;
        if (i3 < 0) {
            throw ks2.e();
        }
        if (i3 > bArr.length - iA0) {
            throw ks2.g();
        }
        if (i3 == 0) {
            zk2Var.c = jr2.b;
            return iA0;
        }
        zk2Var.c = jr2.e(bArr, iA0, i3);
        return iA0 + i3;
    }

    public static final Bundle U(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00b7 A[Catch: all -> 0x00b3, PHI: r2
      0x00b7: PHI (r2v1 java.lang.Thread) = (r2v0 java.lang.Thread), (r2v11 java.lang.Thread) binds: [B:7:0x000c, B:47:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000e, B:46:0x00ae, B:61:0x00e5, B:12:0x0023, B:52:0x00b6, B:53:0x00b7, B:64:0x00e9, B:65:0x00ea, B:13:0x0024, B:15:0x0031, B:25:0x004b, B:26:0x0052, B:28:0x005d, B:34:0x0072, B:35:0x0079, B:43:0x008a, B:44:0x00ac, B:18:0x0040, B:54:0x00b8, B:60:0x00e4, B:59:0x00c2), top: B:76:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static synchronized ClassLoader V() {
        SecurityException e2;
        Thread thread;
        ThreadGroup threadGroup;
        if (a == null) {
            Thread thread2 = b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = b.getContextClassLoader();
                    } catch (SecurityException e3) {
                        String message = e3.getMessage();
                        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 41);
                        sb.append("Failed to get thread context classloader ");
                        sb.append(message);
                        Log.w("DynamiteLoaderV2CL", sb.toString());
                    }
                }
                a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i2 = 0;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i3];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i2 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i2];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i2++;
                                }
                                if (thread == null) {
                                    try {
                                        fj0 fj0Var = new fj0(threadGroup, "GmsDynamite");
                                        try {
                                            fj0Var.setContextClassLoader(null);
                                            fj0Var.start();
                                            thread = fj0Var;
                                        } catch (SecurityException e4) {
                                            e2 = e4;
                                            thread = fj0Var;
                                            String message2 = e2.getMessage();
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(message2).length() + 39);
                                            sb2.append("Failed to enumerate thread/threadgroup ");
                                            sb2.append(message2);
                                            Log.w("DynamiteLoaderV2CL", sb2.toString());
                                        }
                                    } catch (SecurityException e5) {
                                        e2 = e5;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (SecurityException e6) {
                            e2 = e6;
                            thread = null;
                        }
                    }
                    thread2 = thread;
                }
                b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = b.getContextClassLoader();
                    }
                }
                a = contextClassLoader;
            }
        }
        return a;
    }

    public static void W(String str, List list, int i2) {
        if (list.size() == i2) {
            return;
        }
        tv2.d(str, i2, list.size(), " operation requires ");
    }

    public static int X(ct2 ct2Var, int i2, byte[] bArr, int i3, int i4, js2 js2Var, zk2 zk2Var) throws ks2 {
        cs2 cs2VarZza = ct2Var.zza();
        ct2 ct2Var2 = ct2Var;
        byte[] bArr2 = bArr;
        int i5 = i4;
        zk2 zk2Var2 = zk2Var;
        int iS = S(cs2VarZza, ct2Var2, bArr2, i3, i5, zk2Var2);
        ct2Var2.f(cs2VarZza);
        zk2Var2.c = cs2VarZza;
        js2Var.add(cs2VarZza);
        while (iS < i5) {
            zk2 zk2Var3 = zk2Var2;
            int i6 = i5;
            int iA0 = a0(bArr2, iS, zk2Var3);
            if (i2 != zk2Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            ct2 ct2Var3 = ct2Var2;
            cs2 cs2VarZza2 = ct2Var3.zza();
            iS = S(cs2VarZza2, ct2Var3, bArr3, iA0, i6, zk2Var3);
            ct2Var2 = ct2Var3;
            bArr2 = bArr3;
            i5 = i6;
            zk2Var2 = zk2Var3;
            ct2Var2.f(cs2VarZza2);
            zk2Var2.c = cs2VarZza2;
            js2Var.add(cs2VarZza2);
        }
        return iS;
    }

    public static void Y(String str, List list, int i2) {
        if (list.size() >= i2) {
            return;
        }
        tv2.d(str, i2, list.size(), " operation requires at least ");
    }

    public static int Z(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static String a() throws NoSuchAlgorithmException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        byte[] encoded = keyGenerator.generateKey().getEncoded();
        if (encoded == null) {
            return BuildConfig.FLAVOR;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b2 : encoded) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(hexString);
            }
            stringBuffer.append(hexString.toUpperCase());
        }
        return stringBuffer.toString();
    }

    public static int a0(byte[] bArr, int i2, zk2 zk2Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return Q(b2, bArr, i3, zk2Var);
        }
        zk2Var.a = b2;
        return i3;
    }

    public static final Exception b(t tVar, String str, Exception exc) throws tg0 {
        if (exc instanceof yt) {
            return new yt(tVar, str);
        }
        if (exc instanceof ii0) {
            return new ii0(tVar, str);
        }
        throw new tg0();
    }

    public static void b0(int i2, String str, ArrayList arrayList) {
        if (arrayList.size() <= i2) {
            return;
        }
        tv2.d(str, i2, arrayList.size(), " operation requires at most ");
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
        return (int) (j6 >>> 32);
    }

    public static int c0(byte[] bArr, int i2, zk2 zk2Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            zk2Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        zk2Var.b = j3;
        return i4;
    }

    public static int d(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j6 >>> 32);
    }

    public static long d0(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static void e(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = j2 >> 32;
        if (j3 != 0) {
            long j4 = j3 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j4;
            long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j3 = j5 >> 32;
        }
        long j6 = ((((long) iArr[3]) & 4294967295L) - 1) + j3;
        iArr[3] = (int) j6;
        long j7 = j6 >> 32;
        if (j7 != 0) {
            long j8 = j7 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j9;
            j7 = j9 >> 32;
        }
        long j10 = ((((long) iArr[6]) & 4294967295L) - 1) + j7;
        iArr[6] = (int) j10;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j10 >> 32));
    }

    public static boolean e0(qt2 qt2Var) {
        if (qt2Var == null) {
            return false;
        }
        Double dZzd = qt2Var.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static final void f(l62 l62Var, ul1 ul1Var, nw0 nw0Var) {
        Object obj;
        l62Var.getClass();
        ul1Var.getClass();
        nw0Var.getClass();
        HashMap map = l62Var.a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = l62Var.a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.c) {
            return;
        }
        savedStateHandleController.b(nw0Var, ul1Var);
        lw0 lw0Var = ((a) nw0Var).c;
        if (lw0Var == lw0.b || lw0Var.compareTo(lw0.d) >= 0) {
            ul1Var.d();
        } else {
            nw0Var.a(new LegacySavedStateHandleController.tryToAddRecreator.1(nw0Var, ul1Var));
        }
    }

    public static av2 f0(String str) {
        av2 av2Var;
        if (str == null || str.isEmpty()) {
            av2Var = null;
        } else {
            av2Var = (av2) av2.Y0.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (av2Var != null) {
            return av2Var;
        }
        e.g(ts.j("Unsupported commandId ", str));
        return null;
    }

    public static String g(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = (bArr[i2] & 240) >>> 4;
            char[] cArr = c;
            sb.append(cArr[i3]);
            sb.append(cArr[bArr[i2] & 15]);
        }
        return sb.toString();
    }

    public static boolean g0(qt2 qt2Var, qt2 qt2Var2) {
        if (!qt2Var.getClass().equals(qt2Var2.getClass())) {
            return false;
        }
        if ((qt2Var instanceof xt2) || (qt2Var instanceof ss2)) {
            return true;
        }
        if (qt2Var instanceof ep2) {
            if (Double.isNaN(qt2Var.zzd().doubleValue()) || Double.isNaN(qt2Var2.zzd().doubleValue())) {
                return false;
            }
            return qt2Var.zzd().equals(qt2Var2.zzd());
        }
        if (qt2Var instanceof vt2) {
            return qt2Var.zzc().equals(qt2Var2.zzc());
        }
        if (qt2Var instanceof jn2) {
            return qt2Var.zze().equals(qt2Var2.zze());
        }
        return qt2Var == qt2Var2;
    }

    public static void h(String str, boolean z) {
        if (z) {
            return;
        }
        e.g(str);
    }

    public static int h0(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2) || d2 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2))) % 4.294967296E9d);
    }

    public static void i(boolean z) {
        if (z) {
            return;
        }
        sm0.a();
    }

    public static double i0(double d2) {
        if (Double.isNaN(d2)) {
            return 0.0d;
        }
        if (Double.isInfinite(d2) || d2 == 0.0d || d2 == 0.0d) {
            return d2;
        }
        return ((double) (d2 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d2));
    }

    public static void j(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            String name2 = handler.getLooper().getThread().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + String.valueOf(name2).length() + 35 + 1);
            ts.r(sb, "Must be called on ", name2, " thread, but got ", name);
            sb.append(".");
            throw new IllegalStateException(sb.toString());
        }
    }

    public static Object j0(qt2 qt2Var) {
        if (qt2.P.equals(qt2Var)) {
            return null;
        }
        if (qt2.O.equals(qt2Var)) {
            return BuildConfig.FLAVOR;
        }
        if (qt2Var instanceof hs2) {
            return k0((hs2) qt2Var);
        }
        if (!(qt2Var instanceof lm2)) {
            return !qt2Var.zzd().isNaN() ? qt2Var.zzd() : qt2Var.zzc();
        }
        ArrayList arrayList = new ArrayList();
        lm2 lm2Var = (lm2) qt2Var;
        int i2 = 0;
        while (i2 < lm2Var.i()) {
            if (i2 >= lm2Var.i()) {
                throw new NoSuchElementException(ck1.s(i2, "Out of bounds index: ", new StringBuilder(String.valueOf(i2).length() + 21)));
            }
            int i3 = i2 + 1;
            Object objJ0 = j0(lm2Var.k(i2));
            if (objJ0 != null) {
                arrayList.add(objJ0);
            }
            i2 = i3;
        }
        return arrayList;
    }

    public static void k(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static HashMap k0(hs2 hs2Var) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList(hs2Var.a.keySet());
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            Object objJ0 = j0(hs2Var.d(str));
            if (objJ0 != null) {
                map.put(str, objJ0);
            }
        }
        return map;
    }

    public static void l(String str) {
        if (TextUtils.isEmpty(str)) {
            e.g("Given String is empty or null");
        }
    }

    public static void l0(ep1 ep1Var) {
        int iH0 = h0(ep1Var.Q("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iH0 <= 1000000) {
            ep1Var.O("runtime.counter", new ep2(Double.valueOf(iH0)));
        } else {
            uq1.q("Instructions allowed exceeded");
        }
    }

    public static void m(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            e.g(str2);
        }
    }

    public static void n(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        uq1.q(str);
    }

    public static void o(Object obj) {
        if (obj != null) {
            return;
        }
        uq1.h("null reference");
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static void q(String str, boolean z) {
        if (z) {
            return;
        }
        uq1.q(str);
    }

    public static boolean r(int[] iArr, int[] iArr2) {
        for (int i2 = 4; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] s(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[5];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static int t(int[] iArr) {
        return iArr[0] & 1;
    }

    public static Drawable u(Context context, int i2) {
        return aj1.b().c(context, i2);
    }

    public static final zn1 v(Object obj) {
        if (obj != tq.a) {
            return (zn1) obj;
        }
        uq1.q("Does not contain segment");
        return null;
    }

    public static boolean w(int[] iArr, int[] iArr2) {
        for (int i2 = 4; i2 >= 0; i2--) {
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

    public static final boolean x(Object obj) {
        return obj == tq.a;
    }

    public static boolean y(Context context, int i2) {
        if (N(i2, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                bk0 bk0VarB = bk0.b(context);
                bk0VarB.getClass();
                if (packageInfo != null) {
                    if (!bk0.e(packageInfo, false)) {
                        if (bk0.e(packageInfo, true)) {
                            if (!xj0.a((Context) bk0VarB.a)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                            }
                        }
                    }
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static boolean z(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }
}
