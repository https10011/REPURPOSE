package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.Feature;
import com.google.common.util.concurrent.ListenableFuture;
import io.jsonwebtoken.JwtParser;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class yv2 {
    public static final vy2 a;
    public static final vy2 b;
    public static final vy2 c;
    public static final vy2 d;
    public static final vy2 e;
    public static final u50 f = new u50(false);
    public static final u50 g = new u50(true);
    public static final int[] h = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] i = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};
    public static final int[] j = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};
    public static final Feature k;
    public static final Feature l;
    public static final Feature m;
    public static final Feature[] n;
    public static volatile boolean o = true;

    static {
        int i2 = 4;
        a = new vy2("COMPLETING_ALREADY", i2);
        b = new vy2("COMPLETING_WAITING_CHILDREN", i2);
        c = new vy2("COMPLETING_RETRY", i2);
        d = new vy2("TOO_LATE_TO_CANCEL", i2);
        e = new vy2("SEALED", i2);
        Feature feature = new Feature("commit_to_configuration_v2_api", -1, 1L, true);
        k = feature;
        Feature feature2 = new Feature("get_serving_version_api", -1, 1L, true);
        Feature feature3 = new Feature("get_experiment_tokens_api", -1, 1L, true);
        Feature feature4 = new Feature("register_flag_update_listener_api", -1, 2L, true);
        l = feature4;
        Feature feature5 = new Feature("sync_after_api", -1, 1L, true);
        Feature feature6 = new Feature("sync_after_for_application_api", -1, 1L, true);
        Feature feature7 = new Feature("set_app_wide_properties_api", -1, 1L, true);
        Feature feature8 = new Feature("set_runtime_properties_api", -1, 1L, true);
        Feature feature9 = new Feature("get_storage_info_api", -1, 1L, true);
        m = feature9;
        n = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }

    public static final String A() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{i90.r}, 1));
    }

    public static boolean B(int[] iArr, int[] iArr2) {
        for (int i2 = 5; i2 >= 0; i2--) {
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

    public static boolean C(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 6; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean D(int[] iArr) {
        for (int i2 = 0; i2 < 6; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean E(long[] jArr) {
        for (int i2 = 0; i2 < 3; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static List F(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    public static Drawable G(Context context, int i2, Resources.Theme theme) {
        if (theme != null) {
            es esVar = new es(context);
            esVar.b = theme;
            esVar.a(theme.getResources().getConfiguration());
            context = esVar;
        }
        return gu2.u(context, i2);
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        int i2 = 1;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j2;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j3) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j4) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j5) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j6) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j7) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        int i3 = 6;
        iArr3[6] = (int) (j14 >>> 32);
        while (true) {
            int i4 = i2;
            if (i4 >= i3) {
                return;
            }
            long j15 = ((long) iArr[i4]) & 4294967295L;
            long j16 = (j15 * j2) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j16;
            i2 = i4 + 1;
            long j17 = j6;
            long j18 = (j15 * j3) + (((long) iArr3[i2]) & 4294967295L) + (j16 >>> 32);
            iArr3[i2] = (int) j18;
            int i5 = i4 + 2;
            long j19 = (j15 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j18 >>> 32);
            iArr3[i5] = (int) j19;
            int i6 = i4 + 3;
            long j20 = (j15 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j19 >>> 32);
            iArr3[i6] = (int) j20;
            int i7 = i4 + 4;
            long j21 = (j15 * j17) + (((long) iArr3[i7]) & 4294967295L) + (j20 >>> 32);
            iArr3[i7] = (int) j21;
            int i8 = i4 + 5;
            long j22 = (j15 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j21 >>> 32);
            iArr3[i8] = (int) j22;
            iArr3[i4 + 6] = (int) (j22 >>> 32);
            j6 = j17;
            i3 = 6;
        }
    }

    public static int I(int[] iArr, int[] iArr2, int[] iArr3) {
        int i2 = 0;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = 0;
        while (i2 < 6) {
            long j9 = j2;
            int i3 = i2;
            long j10 = ((long) iArr[i2]) & 4294967295L;
            long j11 = (((long) iArr3[i3]) & 4294967295L) + (j10 * j9);
            iArr3[i3] = (int) j11;
            int i4 = i3 + 1;
            long j12 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j11 >>> 32);
            iArr3[i4] = (int) j12;
            int i5 = i3 + 2;
            long j13 = (j10 * j4) + (((long) iArr3[i5]) & 4294967295L) + (j12 >>> 32);
            iArr3[i5] = (int) j13;
            int i6 = i3 + 3;
            long j14 = (j10 * j5) + (((long) iArr3[i6]) & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i3 + 4;
            long j15 = (j10 * j6) + (((long) iArr3[i7]) & 4294967295L) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i3 + 5;
            long j16 = (j10 * j7) + (((long) iArr3[i8]) & 4294967295L) + (j15 >>> 32);
            iArr3[i8] = (int) j16;
            int i9 = i3 + 6;
            long j17 = j8 + (((long) iArr3[i9]) & 4294967295L) + (j16 >>> 32);
            iArr3[i9] = (int) j17;
            j8 = j17 >>> 32;
            i2 = i4;
            j2 = j9;
        }
        return (int) j8;
    }

    public static void J(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[24];
        z32.x(iArr, iArr2, iArr4);
        K(iArr4, iArr3);
    }

    public static void K(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[16]) & 4294967295L;
        long j3 = ((long) iArr[17]) & 4294967295L;
        long j4 = ((long) iArr[18]) & 4294967295L;
        long j5 = ((long) iArr[19]) & 4294967295L;
        long j6 = ((long) iArr[20]) & 4294967295L;
        long j7 = ((long) iArr[21]) & 4294967295L;
        long j8 = ((long) iArr[22]) & 4294967295L;
        long j9 = ((long) iArr[23]) & 4294967295L;
        long j10 = ((((long) iArr[12]) & 4294967295L) + j6) - 1;
        long j11 = (((long) iArr[13]) & 4294967295L) + j8;
        long j12 = (((long) iArr[14]) & 4294967295L) + j8 + j9;
        long j13 = (((long) iArr[15]) & 4294967295L) + j9;
        long j14 = j3 + j7;
        long j15 = j7 - j9;
        long j16 = j8 - j9;
        long j17 = j10 + j15;
        long j18 = (((long) iArr[0]) & 4294967295L) + j17;
        iArr2[0] = (int) j18;
        long j19 = (((((long) iArr[1]) & 4294967295L) + j9) - j10) + j11 + (j18 >> 32);
        iArr2[1] = (int) j19;
        long j20 = (((((long) iArr[2]) & 4294967295L) - j7) - j11) + j12 + (j19 >> 32);
        iArr2[2] = (int) j20;
        long j21 = ((((long) iArr[3]) & 4294967295L) - j12) + j13 + j17 + (j20 >> 32);
        iArr2[3] = (int) j21;
        long j22 = (((((((long) iArr[4]) & 4294967295L) + j2) + j7) + j11) - j13) + j17 + (j21 >> 32);
        iArr2[4] = (int) j22;
        long j23 = ((((long) iArr[5]) & 4294967295L) - j2) + j11 + j12 + j14 + (j22 >> 32);
        iArr2[5] = (int) j23;
        long j24 = (((((long) iArr[6]) & 4294967295L) + j4) - j3) + j12 + j13 + (j23 >> 32);
        iArr2[6] = (int) j24;
        long j25 = ((((((long) iArr[7]) & 4294967295L) + j2) + j5) - j4) + j13 + (j24 >> 32);
        iArr2[7] = (int) j25;
        long j26 = (((((((long) iArr[8]) & 4294967295L) + j2) + j3) + j6) - j5) + (j25 >> 32);
        iArr2[8] = (int) j26;
        long j27 = (((((long) iArr[9]) & 4294967295L) + j4) - j6) + j14 + (j26 >> 32);
        iArr2[9] = (int) j27;
        long j28 = ((((((long) iArr[10]) & 4294967295L) + j4) + j5) - j15) + j16 + (j27 >> 32);
        iArr2[10] = (int) j28;
        long j29 = ((((((long) iArr[11]) & 4294967295L) + j5) + j6) - j16) + (j28 >> 32);
        iArr2[11] = (int) j29;
        L(iArr2, (int) ((j29 >> 32) + 1));
    }

    public static void L(int[] iArr, int i2) {
        long j2;
        if (i2 != 0) {
            long j3 = ((long) i2) & 4294967295L;
            long j4 = (((long) iArr[0]) & 4294967295L) + j3;
            iArr[0] = (int) j4;
            long j5 = ((((long) iArr[1]) & 4294967295L) - j3) + (j4 >> 32);
            iArr[1] = (int) j5;
            long j6 = j5 >> 32;
            if (j6 != 0) {
                long j7 = j6 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j7;
                j6 = j7 >> 32;
            }
            long j8 = (((long) iArr[3]) & 4294967295L) + j3 + j6;
            iArr[3] = (int) j8;
            long j9 = (4294967295L & ((long) iArr[4])) + j3 + (j8 >> 32);
            iArr[4] = (int) j9;
            j2 = j9 >> 32;
        } else {
            j2 = 0;
        }
        if ((j2 == 0 || kv.K(12, 5, iArr) == 0) && !(iArr[11] == -1 && kv.C(12, iArr, h))) {
            return;
        }
        d(iArr);
    }

    public static void M(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        z32.C(iArr, iArr3);
        K(iArr3, iArr2);
    }

    public static void N(int[] iArr, int[] iArr2) {
        long j2 = ((long) iArr[0]) & 4294967295L;
        int i2 = 12;
        int i3 = 0;
        int i4 = 5;
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
                long j26 = j23 & 4294967295L;
                long j27 = (j22 * j2) + (jQ2 & 4294967295L);
                int i11 = (int) j27;
                iArr2[4] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long jQ4 = ck1.q(j22, j7, j27 >>> 32, jQ3 & 4294967295L);
                long jQ5 = ck1.q(j22, j10, jQ4 >>> 32, j24);
                long jQ6 = ck1.q(j22, j15, jQ5 >>> 32, j26);
                long j28 = j25 + (jQ6 >>> 32);
                long j29 = ((long) iArr[5]) & 4294967295L;
                long j30 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j31 = j28 & 4294967295L;
                long j32 = (((long) iArr2[10]) & 4294967295L) + (j30 >>> 32);
                long j33 = j30 & 4294967295L;
                long j34 = (j29 * j2) + (jQ4 & 4294967295L);
                int i13 = (int) j34;
                iArr2[5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jQ7 = ck1.q(j29, j7, j34 >>> 32, jQ5 & 4294967295L);
                long jQ8 = ck1.q(j29, j10, jQ7 >>> 32, jQ6 & 4294967295L);
                long jQ9 = ck1.q(j29, j15, jQ8 >>> 32, j31);
                long jQ10 = ck1.q(j29, j22, jQ9 >>> 32, j33);
                long j35 = j32 + (jQ10 >>> 32);
                int i15 = (int) jQ7;
                iArr2[6] = (i15 << 1) | i14;
                int i16 = (int) jQ8;
                iArr2[7] = (i15 >>> 31) | (i16 << 1);
                int i17 = i16 >>> 31;
                int i18 = (int) jQ9;
                iArr2[8] = i17 | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jQ10;
                iArr2[9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) j35;
                iArr2[10] = i21 | (i22 << 1);
                iArr2[11] = ((iArr2[11] + ((int) (j35 >>> 32))) << 1) | (i22 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static void O(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[24];
        z32.C(iArr, iArr3);
        K(iArr3, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            z32.C(iArr2, iArr3);
            K(iArr3, iArr2);
        }
    }

    public static final Object P(em1 em1Var, em1 em1Var2, Function2 function2) throws Throwable {
        Object vpVar;
        Object objE;
        try {
            vpVar = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(em1Var2, em1Var);
        } catch (Throwable th) {
            vpVar = new vp(th, false);
        }
        ft ftVar = ft.a;
        if (vpVar == ftVar || (objE = em1Var.E(vpVar)) == b) {
            return ftVar;
        }
        if (objE instanceof vp) {
            throw ((vp) objE).a;
        }
        return W(objE);
    }

    public static int Q(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >> 32);
    }

    public static void R(int i2, int i3, int[] iArr, int[] iArr2, int[] iArr3) {
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
        iArr3[5] = (int) (((((long) iArr[i2 + 5]) & 4294967295L) - (((long) iArr2[i3 + 5]) & 4294967295L)) + (j6 >> 32));
    }

    public static void S(int[] iArr, int[] iArr2) {
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
        iArr2[5] = (int) (((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5]))) + (j6 >> 32));
    }

    public static void T(int[] iArr, int[] iArr2, int[] iArr3) {
        if (kv.f0(12, iArr, iArr2, iArr3) != 0) {
            long j2 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j2;
            long j3 = (((long) iArr3[1]) & 4294967295L) + 1 + (j2 >> 32);
            iArr3[1] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = ((((long) iArr3[3]) & 4294967295L) - 1) + j4;
            iArr3[3] = (int) j6;
            long j7 = ((4294967295L & ((long) iArr3[4])) - 1) + (j6 >> 32);
            iArr3[4] = (int) j7;
            if ((j7 >> 32) != 0) {
                kv.m(12, 5, iArr3);
            }
        }
    }

    public static BigInteger U(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                sp0.r(bArr, i3, (5 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger V(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i2 = 0; i2 < 3; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                sp0.v((2 - i2) << 3, j2, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final Object W(Object obj) {
        up0 up0Var;
        vp0 vp0Var = obj instanceof vp0 ? (vp0) obj : null;
        return (vp0Var == null || (up0Var = vp0Var.a) == null) ? obj : up0Var;
    }

    public static String X(d33 d33Var) {
        StringBuilder sb = new StringBuilder(d33Var.d());
        for (int i2 = 0; i2 < d33Var.d(); i2++) {
            byte bA = d33Var.a(i2);
            if (bA == 34) {
                sb.append("\\\"");
            } else if (bA == 39) {
                sb.append("\\'");
            } else if (bA != 92) {
                switch (bA) {
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
                        if (bA < 32 || bA > 126) {
                            sb.append('\\');
                            sb.append((char) (((bA >>> 6) & 3) + 48));
                            sb.append((char) (((bA >>> 3) & 7) + 48));
                            sb.append((char) ((bA & 7) + 48));
                        } else {
                            sb.append((char) bA);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static js2 Y(Object obj, long j2) {
        js2 js2Var = (js2) nt2.m(obj, j2);
        if (((zq2) js2Var).a) {
            return js2Var;
        }
        int size = js2Var.size();
        zs2 zs2VarB = ((zs2) js2Var).b(size == 0 ? 10 : size << 1);
        nt2.d(obj, j2, zs2VarB);
        return zs2VarB;
    }

    public static /* synthetic */ boolean Z(int i2, iq3 iq3Var, StringBuilder sb) {
        if (i2 - 1 != 0 || iq3Var == iq3.a) {
            return false;
        }
        sb.append(iq3Var.a());
        sb.append(JwtParser.SEPARATOR_CHAR);
        sb.append(iq3Var.b());
        sb.append(':');
        sb.append(iq3Var.c());
        return true;
    }

    public static String a(String str) {
        try {
            return new String(tb2.d.a(str), vb2.a);
        } catch (Exception unused) {
            return str;
        }
    }

    public static int b(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >>> 32);
    }

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j7 >>> 32);
    }

    public static void d(int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j2;
        long j3 = ((((long) iArr[1]) & 4294967295L) - 1) + (j2 >> 32);
        iArr[1] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            long j5 = j4 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j5;
            j4 = j5 >> 32;
        }
        long j6 = (((long) iArr[3]) & 4294967295L) + 1 + j4;
        iArr[3] = (int) j6;
        long j7 = (4294967295L & ((long) iArr[4])) + 1 + (j6 >> 32);
        iArr[4] = (int) j7;
        if ((j7 >> 32) != 0) {
            kv.K(12, 5, iArr);
        }
    }

    public static int e(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
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
        long j7 = (((long) iArr[i2 + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i9])) + (j6 >>> 32);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int f(int[] iArr, int[] iArr2) {
        long j2 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L);
        int i2 = (int) j2;
        iArr[6] = i2;
        iArr2[12] = i2;
        long j3 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j3;
        iArr[7] = i3;
        iArr2[13] = i3;
        long j4 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j3 >>> 32);
        int i4 = (int) j4;
        iArr[8] = i4;
        iArr2[14] = i4;
        long j5 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j4 >>> 32);
        int i5 = (int) j5;
        iArr[9] = i5;
        iArr2[15] = i5;
        long j6 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j5 >>> 32);
        int i6 = (int) j6;
        iArr[10] = i6;
        iArr2[16] = i6;
        long j7 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j6 >>> 32);
        int i7 = (int) j7;
        iArr[11] = i7;
        iArr2[17] = i7;
        return (int) (j7 >>> 32);
    }

    public static String g(int i2, int i3, String str) {
        if (i2 < 0) {
            return ga.s("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ga.s("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void h(boolean z) {
        if (z) {
            return;
        }
        sm0.a();
    }

    public static void i(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        e.g(ga.s(str, obj));
    }

    public static void j(int i2, int i3) {
        String strS;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strS = ga.s("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i3);
                    throw new IllegalArgumentException(sb.toString());
                }
                strS = ga.s("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strS);
        }
    }

    public static void k(ListenableFuture listenableFuture, String str, Object obj) {
        if (listenableFuture != null) {
            return;
        }
        uq1.h(ga.s(str, obj));
    }

    public static void l(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static void m(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            e.c(g(i2, i3, "index"));
        }
    }

    public static void n(int i2, int i3, int i4) {
        String strG;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strG = g(i2, i4, "start index");
            } else {
                strG = (i3 < 0 || i3 > i4) ? g(i3, i4, "end index") : ga.s("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strG);
        }
    }

    public static void o(String str, boolean z) {
        if (z) {
            return;
        }
        uq1.q(str);
    }

    public static aq p(String str, String str2) {
        td tdVar = new td(str, str2);
        zp zpVarB = aq.b(td.class);
        zpVarB.e = 1;
        zpVarB.f = new yp(tdVar, 0);
        return zpVarB.b();
    }

    public static di0 q(String str, String str2) {
        Exception excB;
        str.getClass();
        try {
            ii0 ii0Var = new ii0(new t(26), null);
            if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                excB = gu2.b(new t(0), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                excB = gu2.b(new t(1), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                excB = gu2.b(new t(2), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                excB = gu2.b(new t(3), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                excB = gu2.b(new t(4), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                excB = gu2.b(new t(5), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                excB = gu2.b(new t(6), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                excB = gu2.b(new t(7), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                excB = gu2.b(new t(8), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                excB = gu2.b(new t(9), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                excB = gu2.b(new t(10), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                excB = gu2.b(new t(11), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                excB = gu2.b(new t(12), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                excB = gu2.b(new t(13), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                excB = gu2.b(new t(14), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                excB = gu2.b(new t(15), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                excB = gu2.b(new t(16), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                excB = gu2.b(new t(17), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                excB = gu2.b(new t(18), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                excB = gu2.b(new t(19), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                excB = gu2.b(new t(20), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                excB = gu2.b(new t(21), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                excB = gu2.b(new t(22), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                excB = gu2.b(new t(23), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                excB = gu2.b(new t(24), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                excB = gu2.b(new t(25), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                excB = gu2.b(new t(26), str2, ii0Var);
            } else if (Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                excB = gu2.b(new t(27), str2, ii0Var);
            } else {
                if (!Intrinsics.areEqual(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    throw new tg0();
                }
                excB = gu2.b(new t(28), str2, ii0Var);
            }
            return (di0) excB;
        } catch (tg0 unused) {
            return new zh0(str2, str);
        }
    }

    public static boolean r(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z;
        int i2 = 5;
        while (true) {
            z = true;
            if (i2 < 0) {
                break;
            }
            int i3 = iArr[6 + i2] ^ Integer.MIN_VALUE;
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
            R(6, 0, iArr, iArr2, iArr3);
            return z;
        }
        R(0, 6, iArr2, iArr, iArr3);
        return z;
    }

    public static boolean s(int[] iArr, int[] iArr2) {
        for (int i2 = 5; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] t(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[6];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static long[] u(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            sm0.a();
            return null;
        }
        long[] jArr = new long[3];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i2] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i2++;
        }
        return jArr;
    }

    public static aq v(String str, ur urVar) {
        zp zpVarB = aq.b(td.class);
        zpVarB.e = 1;
        zpVarB.a(u00.a(Context.class));
        zpVarB.f = new eg(8, str, urVar);
        return zpVarB.b();
    }

    public static String w(Context context) {
        context.getClass();
        if (pa.a() == null) {
            synchronized (pa.c()) {
                try {
                    if (pa.a() == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        if (!mt.a.contains(pa.class)) {
                            try {
                                pa.f = string;
                            } catch (Throwable th) {
                                mt.a(pa.class, th);
                            }
                        }
                        if (pa.a() == null) {
                            String str = "XZ" + UUID.randomUUID();
                            if (!mt.a.contains(pa.class)) {
                                try {
                                    pa.f = str;
                                } catch (Throwable th2) {
                                    mt.a(pa.class, th2);
                                }
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", pa.a()).apply();
                        }
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        String strA = pa.a();
        if (strA != null) {
            return strA;
        }
        uq1.q("Required value was null.");
        return null;
    }

    public static int x(int[] iArr) {
        return iArr[0] & 1;
    }

    public static final String y() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("m.%s", Arrays.copyOf(new Object[]{i90.s}, 1));
    }

    public static Drawable z(Context context, Context context2, int i2, Resources.Theme theme) {
        try {
            if (o) {
                return G(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return context2.getDrawable(i2);
        } catch (NoClassDefFoundError unused2) {
            o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = ej1.a;
        return resources.getDrawable(i2, theme);
    }
}
