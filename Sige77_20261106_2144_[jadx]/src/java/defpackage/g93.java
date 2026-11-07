package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Gainmap;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;
import com.hjq.toast.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class g93 {
    public static UserManager a = null;
    public static volatile boolean b = false;
    public static final Object c = new Object();
    public static final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};
    public static final String[] e = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] f = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] g = {"items"};
    public static final String[] h = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static boolean i = true;

    public static ao0 A(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return lo0.f;
        }
        if (length != 1) {
            return length != 2 ? new jo0(objArr) : new io0(objArr[0], objArr[1]);
        }
        return new io0(objArr[0]);
    }

    public static void B(int[] iArr, int[] iArr2) {
        int i2 = iArr[32];
        int i3 = i2;
        int i4 = 16;
        while (true) {
            int i5 = i4 - 1;
            if (i5 < 0) {
                break;
            }
            int i6 = iArr[i4 + 15];
            iArr2[i5] = (i3 << (-9)) | (i6 >>> 9);
            i3 = i6;
            i4 = i5;
        }
        int iH = kv.h(16, iArr, iArr2) + ((i3 << (-9)) >>> 23) + (i2 >>> 9);
        if (iH > 511 || (iH == 511 && kv.p(16, iArr2, d))) {
            iH = (kv.J(iArr2) + iH) & 511;
        }
        iArr2[16] = iH;
    }

    public static void C(int[] iArr) {
        int i2 = iArr[16];
        int iJ = kv.j(16, i2 >>> 9, iArr) + (i2 & 511);
        if (iJ > 511 || (iJ == 511 && kv.p(16, iArr, d))) {
            iJ = (kv.J(iArr) + iJ) & 511;
        }
        iArr[16] = iJ;
    }

    public static Bitmap D(Bitmap bitmap) {
        Gainmap gainmap = bitmap.getGainmap();
        if (gainmap != null) {
            Bitmap.Config config = gainmap.getGainmapContents().getConfig();
            Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
            if (config == config2) {
                ColorMatrixColorFilter colorMatrixColorFilter = wi0.a;
                Bitmap gainmapContents = gainmap.getGainmapContents();
                if (gainmapContents.getConfig() == config2) {
                    am2.n(BuildConfig.FLAVOR, gainmapContents.getConfig() == config2);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gainmapContents.getWidth(), gainmapContents.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    Paint paint = new Paint();
                    paint.setColorFilter(wi0.a);
                    canvas.drawBitmap(gainmapContents, 0.0f, 0.0f, paint);
                    canvas.setBitmap(null);
                    Gainmap gainmapX = nu.x(bitmapCreateBitmap);
                    float[] ratioMin = gainmap.getRatioMin();
                    gainmapX.setRatioMin(ratioMin[0], ratioMin[1], ratioMin[2]);
                    float[] ratioMax = gainmap.getRatioMax();
                    gainmapX.setRatioMax(ratioMax[0], ratioMax[1], ratioMax[2]);
                    float[] gamma = gainmap.getGamma();
                    gainmapX.setGamma(gamma[0], gamma[1], gamma[2]);
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    gainmapX.setEpsilonSdr(epsilonSdr[0], epsilonSdr[1], epsilonSdr[2]);
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    gainmapX.setEpsilonHdr(epsilonHdr[0], epsilonHdr[1], epsilonHdr[2]);
                    gainmapX.setDisplayRatioForFullHdr(gainmap.getDisplayRatioForFullHdr());
                    gainmapX.setMinDisplayRatioForHdrTransition(gainmap.getMinDisplayRatioForHdrTransition());
                    gainmap = gainmapX;
                }
                bitmap.setGainmap(gainmap);
            }
        }
        return bitmap.copy(Bitmap.Config.HARDWARE, false);
    }

    public static void E(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[33];
        t(iArr, iArr3);
        B(iArr3, iArr2);
    }

    public static void F(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i2 = 14;
        int i3 = 0;
        int i4 = 6;
        while (true) {
            int i5 = i4 - 1;
            long j2 = ((long) iArr[i4]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i2 - 1] = (i3 << 31) | ((int) (j3 >>> 33));
            i2 -= 2;
            iArr2[i2] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i5 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i3 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i6 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i7 = (int) j8;
                iArr2[1] = i6 | (i7 << 1);
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[2] = (i8 << 1) | (i7 >>> 31);
                long jQ = ck1.q(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jQ >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = j13 & 4294967295L;
                long j17 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j18 = j15 & 4294967295L;
                long j19 = (j14 * j) + (jQ & 4294967295L);
                int i9 = (int) j19;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                int i10 = i9 >>> 31;
                long jQ2 = ck1.q(j14, j6, j19 >>> 32, j16);
                long jQ3 = ck1.q(j14, j9, jQ2 >>> 32, j18);
                long j20 = j17 + (jQ3 >>> 32);
                long j21 = ((long) iArr[4]) & 4294967295L;
                long j22 = (((long) iArr2[7]) & 4294967295L) + (j20 >>> 32);
                long j23 = j20 & 4294967295L;
                long j24 = (((long) iArr2[8]) & 4294967295L) + (j22 >>> 32);
                long j25 = j22 & 4294967295L;
                long j26 = (j21 * j) + (jQ2 & 4294967295L);
                int i11 = (int) j26;
                iArr2[4] = i10 | (i11 << 1);
                int i12 = i11 >>> 31;
                long jQ4 = ck1.q(j21, j6, j26 >>> 32, jQ3 & 4294967295L);
                long jQ5 = ck1.q(j21, j9, jQ4 >>> 32, j23);
                long jQ6 = ck1.q(j21, j14, jQ5 >>> 32, j25);
                long j27 = j24 + (jQ6 >>> 32);
                long j28 = ((long) iArr[5]) & 4294967295L;
                long j29 = (((long) iArr2[9]) & 4294967295L) + (j27 >>> 32);
                long j30 = j27 & 4294967295L;
                long j31 = (((long) iArr2[10]) & 4294967295L) + (j29 >>> 32);
                long j32 = j29 & 4294967295L;
                long j33 = (j28 * j) + (jQ4 & 4294967295L);
                int i13 = (int) j33;
                iArr2[5] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                long jQ7 = ck1.q(j28, j6, j33 >>> 32, jQ5 & 4294967295L);
                long jQ8 = ck1.q(j28, j9, jQ7 >>> 32, jQ6 & 4294967295L);
                long jQ9 = ck1.q(j28, j14, jQ8 >>> 32, j30);
                long j34 = jQ8 & 4294967295L;
                long jQ10 = ck1.q(j28, j21, jQ9 >>> 32, j32);
                long j35 = j31 + (jQ10 >>> 32);
                long j36 = jQ10 & 4294967295L;
                long j37 = ((long) iArr[6]) & 4294967295L;
                long j38 = (((long) iArr2[11]) & 4294967295L) + (j35 >>> 32);
                long j39 = j35 & 4294967295L;
                long j40 = (((long) iArr2[12]) & 4294967295L) + (j38 >>> 32);
                long j41 = j38 & 4294967295L;
                long j42 = (j37 * j) + (jQ7 & 4294967295L);
                int i15 = (int) j42;
                iArr2[6] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                long jQ11 = ck1.q(j37, j6, j42 >>> 32, j34);
                long jQ12 = ck1.q(j37, j9, jQ11 >>> 32, jQ9 & 4294967295L);
                long jQ13 = ck1.q(j37, j14, jQ12 >>> 32, j36);
                long jQ14 = ck1.q(j37, j21, jQ13 >>> 32, j39);
                long jQ15 = ck1.q(j37, j28, jQ14 >>> 32, j41);
                long j43 = j40 + (jQ15 >>> 32);
                int i17 = (int) jQ11;
                iArr2[7] = (i17 << 1) | i16;
                int i18 = (int) jQ12;
                iArr2[8] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) jQ13;
                iArr2[9] = i19 | (i20 << 1);
                int i21 = i20 >>> 31;
                int i22 = (int) jQ14;
                iArr2[10] = i21 | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) jQ15;
                iArr2[11] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j43;
                iArr2[12] = i25 | (i26 << 1);
                iArr2[13] = ((iArr2[13] + ((int) (j43 >>> 32))) << 1) | (i26 >>> 31);
                return;
            }
            i4 = i5;
        }
    }

    public static int G(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        long j5 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j4 >> 32);
        iArr3[4] = (int) j5;
        long j6 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j5 >> 32);
        iArr3[5] = (int) j6;
        long j7 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j6 >> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >> 32);
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        int iF0 = (kv.f0(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iF0 < 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 16) {
                    i2 = -1;
                    break;
                }
                int i4 = iArr3[i3] - 1;
                iArr3[i3] = i4;
                if (i4 != -1) {
                    break;
                } else {
                    i3++;
                }
            }
            iF0 = (iF0 + i2) & 511;
        }
        iArr3[16] = iF0;
    }

    public static BigInteger I(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i2 = 0; i2 < 7; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                sp0.r(bArr, i3, (6 - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static qs2 K(Object obj, Object obj2) {
        qs2 qs2VarD = (qs2) obj;
        qs2 qs2Var = (qs2) obj2;
        if (!qs2Var.isEmpty()) {
            if (!qs2VarD.a) {
                qs2VarD = qs2VarD.d();
            }
            qs2VarD.f();
            if (!qs2Var.isEmpty()) {
                qs2VarD.putAll(qs2Var);
            }
        }
        return qs2VarD;
    }

    public static final y43 L(e53 e53Var) throws k43 {
        try {
            c53 c53VarI = e53Var.i();
            if (c53VarI == null) {
                throw new k43("Parser being asked to parse an empty input stream");
            }
            try {
                byte b2 = c53VarI.b;
                byte b3 = c53VarI.a;
                int i2 = 0;
                if (b3 == -128) {
                    long jA = e53Var.a();
                    if (jA > 1000) {
                        throw new k43("Parser being asked to read a large CBOR array");
                    }
                    O(b2, jA);
                    y43[] y43VarArr = new y43[(int) jA];
                    while (i2 < jA) {
                        y43VarArr[i2] = L(e53Var);
                        i2++;
                    }
                    return new f43(kw2.o(y43VarArr));
                }
                try {
                    if (b3 != -96) {
                        if (b3 == -64) {
                            throw new k43("Tags are currently unsupported");
                        }
                        if (b3 == -32) {
                            return new i43(e53Var.j());
                        }
                        if (b3 == 0 || b3 == 32) {
                            long jB = e53Var.b();
                            O(b2, jB > 0 ? jB : ~jB);
                            return new m43(jB);
                        }
                        if (b3 == 64) {
                            e53Var.n((byte) 64);
                            byte[] bArrQ = e53Var.q();
                            int length = bArrQ.length;
                            O(b2, length);
                            return new j43(d33.h(bArrQ, length));
                        }
                        if (b3 != 96) {
                            throw new k43("Unidentifiable major type: " + ((b3 >> 5) & 7));
                        }
                        e53Var.n((byte) 96);
                        String str = new String(e53Var.q(), StandardCharsets.UTF_8);
                        O(b2, str.length());
                        return new s43(str);
                    }
                    long jE = e53Var.e();
                    if (jE > 1000) {
                        throw new k43("Parser being asked to read a large CBOR map");
                    }
                    O(b2, jE);
                    int i3 = (int) jE;
                    hs1[] hs1VarArr = new hs1[i3];
                    y43 y43Var = null;
                    int i4 = 0;
                    while (i4 < jE) {
                        y43 y43VarL = L(e53Var);
                        if (y43Var != null && y43VarL.compareTo(y43Var) <= 0) {
                            throw new tn("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: " + y43Var.toString() + "\nCurrent key: " + y43VarL.toString());
                        }
                        hs1VarArr[i4] = new hs1(11, y43VarL, L(e53Var));
                        i4++;
                        y43Var = y43VarL;
                    }
                    TreeMap treeMap = new TreeMap();
                    while (i2 < i3) {
                        hs1 hs1Var = hs1VarArr[i2];
                        if (treeMap.containsKey((y43) hs1Var.b)) {
                            throw new tn("Attempted to add duplicate key to canonical CBOR Map.");
                        }
                        treeMap.put((y43) hs1Var.b, (y43) hs1Var.c);
                        i2++;
                    }
                    return new r43(uw2.b(treeMap));
                } catch (RuntimeException e2) {
                    e = e2;
                    throw new k43(e);
                }
            } catch (IOException | RuntimeException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            throw new k43(e4);
        }
    }

    public static final void O(byte b2, long j) throws tn {
        switch (b2) {
            case 24:
                if (j < 24) {
                    tv2.e(" after add info could have been represented in 0 additional bytes, but used 1", j);
                    break;
                }
                break;
            case 25:
                if (j < 256) {
                    tv2.e(" after add info could have been represented in 0-1 additional bytes, but used 2", j);
                    break;
                }
                break;
            case 26:
                if (j < 65536) {
                    tv2.e(" after add info could have been represented in 0-2 additional bytes, but used 4", j);
                    break;
                }
                break;
            case 27:
                if (j < 4294967296L) {
                    tv2.e(" after add info could have been represented in 0-4 additional bytes, but used 8", j);
                    break;
                }
                break;
        }
    }

    public static v0 P(Context context, Callable callable, Executor executor) {
        ri2 ri2Var = new ri2(callable);
        if (S(context)) {
            h02 h02Var = new h02();
            h02Var.w = new g02(h02Var, ri2Var);
            executor.execute(h02Var);
            return h02Var;
        }
        mp1 mp1Var = new mp1();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        e93 e93Var = new e93(atomicBoolean, context, mp1Var, ri2Var, executor);
        context.registerReceiver(e93Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!S(context) || !atomicBoolean.compareAndSet(false, true)) {
            mp1Var.a(new yk(mp1Var, atomicBoolean, context, e93Var, 5, false), t10.a);
            return mp1Var;
        }
        try {
            context.unregisterReceiver(e93Var);
        } catch (IllegalArgumentException e2) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e2);
        }
        h02 h02Var2 = new h02();
        h02Var2.w = new g02(h02Var2, ri2Var);
        executor.execute(h02Var2);
        mp1Var.n(h02Var2);
        return mp1Var;
    }

    public static void R(Object obj) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    public static boolean S(Context context) {
        if (b) {
            return true;
        }
        synchronized (g93.class) {
            try {
                if (b) {
                    return true;
                }
                int i2 = 1;
                while (true) {
                    boolean z = false;
                    if (i2 <= 2) {
                        if (a == null) {
                            a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e2) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e2);
                                a = null;
                                i2++;
                            }
                        }
                        if (z) {
                            b = true;
                        }
                        return z;
                    }
                    if (z) {
                        a = null;
                    }
                    if (z) {
                        b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static cp a() {
        cp cpVar = new cp(true);
        cpVar.A(null);
        return cpVar;
    }

    public static void b(String str, Object... objArr) {
        Log.d("OpenInstall", String.format(str, objArr));
    }

    public static int c(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void d(int[] iArr, int[] iArr2, int[] iArr3) {
        int iB = kv.b(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iB > 511 || (iB == 511 && kv.p(16, iArr3, d))) {
            iB = (kv.J(iArr3) + iB) & 511;
        }
        iArr3[16] = iB;
    }

    public static int e(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        long j5 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j4 >>> 32);
        iArr3[4] = (int) j5;
        long j6 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j5 >>> 32);
        iArr3[5] = (int) j6;
        long j7 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j6 >>> 32);
        iArr3[6] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static void f(Uri.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static void g(String str, Object... objArr) {
        Log.w("OpenInstall", String.format(str, objArr));
    }

    public static LinkedHashMap h(String... strArr) {
        if (strArr.length % 2 != 0) {
            e.g("Odd number of key and Value");
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            linkedHashMap.put(strArr[i2], strArr[i2 + 1]);
        }
        return linkedHashMap;
    }

    public static Uri i(Uri uri, String... strArr) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        for (String str : strArr) {
            builderBuildUpon.appendEncodedPath(str);
        }
        return builderBuildUpon.build();
    }

    public static void j(String str, Object... objArr) {
        Log.e("OpenInstall", String.format(str, objArr));
    }

    public static void k(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static final void l(int i2) {
        if (i2 >= 1) {
            return;
        }
        e.d(ck1.r(i2, "Expected positive parallelism level, but got "));
    }

    public static void m(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static Bitmap n(InputStream inputStream, BitmapFactory.Options options, ac2 ac2Var) throws Throwable {
        Bitmap bitmap = null;
        if (Build.VERSION.SDK_INT != 34 || !nj2.g(options) || !u(ac2Var)) {
            return BitmapFactory.decodeStream(inputStream, null, options);
        }
        am2.n(BuildConfig.FLAVOR, options.inPreferredConfig == Bitmap.Config.HARDWARE);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (bitmapDecodeStream == null) {
                if (bitmapDecodeStream != null) {
                    bitmapDecodeStream.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return null;
            }
            try {
                Bitmap bitmapD = D(bitmapDecodeStream);
                bitmapDecodeStream.recycle();
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                return bitmapD;
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapDecodeStream;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                options.inPreferredConfig = Bitmap.Config.HARDWARE;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean o(int[] iArr, int[] iArr2) {
        for (int i2 = 6; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] p(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            sm0.a();
            return null;
        }
        int[] iArr = new int[7];
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return iArr;
    }

    public static int q(int[] iArr) {
        return iArr[0] & 1;
    }

    public static ColorStateList r(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !n2.t(drawable)) {
            return null;
        }
        return n2.d(drawable).getColorStateList();
    }

    public static boolean s(int[] iArr, int[] iArr2) {
        for (int i2 = 6; i2 >= 0; i2--) {
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

    public static void t(int[] iArr, int[] iArr2) {
        long j;
        r93.Y(iArr, iArr2);
        long j2 = 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        int i2 = 7;
        int i3 = 16;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            long j4 = ((long) iArr[i2 + 8]) & j2;
            long j5 = j4 * j4;
            j = j2;
            iArr2[i3 + 15] = ((int) (j5 >>> 33)) | (i4 << 31);
            int i6 = i3 - 2;
            iArr2[i3 + 14] = (int) (j5 >>> 1);
            i4 = (int) j5;
            if (i5 <= 0) {
                break;
            }
            i3 = i6;
            i2 = i5;
            j2 = j;
        }
        long j6 = j3 * j3;
        long j7 = (((long) (i4 << 31)) & j) | (j6 >>> 33);
        iArr2[16] = (int) j6;
        int i7 = ((int) (j6 >>> 32)) & 1;
        long j8 = ((long) iArr[9]) & j;
        long j9 = ((long) iArr2[18]) & j;
        long j10 = (j8 * j3) + j7;
        int i8 = (int) j10;
        iArr2[17] = (i8 << 1) | i7;
        int i9 = i8 >>> 31;
        long j11 = j9 + (j10 >>> 32);
        long j12 = ((long) iArr[10]) & j;
        long j13 = ((long) iArr2[19]) & j;
        long j14 = ((long) iArr2[20]) & j;
        long j15 = (j12 * j3) + j11;
        int i10 = (int) j15;
        iArr2[18] = (i10 << 1) | i9;
        long jQ = ck1.q(j12, j8, j15 >>> 32, j13);
        long j16 = j14 + (jQ >>> 32);
        long j17 = ((long) iArr[11]) & j;
        long j18 = (((long) iArr2[21]) & j) + (j16 >>> 32);
        long j19 = (((long) iArr2[22]) & j) + (j18 >>> 32);
        long j20 = j18 & j;
        long j21 = (j17 * j3) + (jQ & j);
        int i11 = (int) j21;
        iArr2[19] = (i10 >>> 31) | (i11 << 1);
        long jQ2 = ck1.q(j17, j8, j21 >>> 32, j16 & j);
        long jQ3 = ck1.q(j17, j12, jQ2 >>> 32, j20);
        long j22 = j19 + (jQ3 >>> 32);
        long j23 = jQ3 & j;
        long j24 = ((long) iArr[12]) & j;
        long j25 = (((long) iArr2[23]) & j) + (j22 >>> 32);
        long j26 = (((long) iArr2[24]) & j) + (j25 >>> 32);
        long j27 = j25 & j;
        long j28 = (j24 * j3) + (jQ2 & j);
        int i12 = (int) j28;
        iArr2[20] = (i11 >>> 31) | (i12 << 1);
        long jQ4 = ck1.q(j24, j8, j28 >>> 32, j23);
        long jQ5 = ck1.q(j24, j12, jQ4 >>> 32, j22 & j);
        long jQ6 = ck1.q(j24, j17, jQ5 >>> 32, j27);
        long j29 = jQ5 & j;
        long j30 = j26 + (jQ6 >>> 32);
        long j31 = ((long) iArr[13]) & j;
        long j32 = (((long) iArr2[25]) & j) + (j30 >>> 32);
        long j33 = j30 & j;
        long j34 = (((long) iArr2[26]) & j) + (j32 >>> 32);
        long j35 = j32 & j;
        long j36 = (j31 * j3) + (jQ4 & j);
        int i13 = (int) j36;
        iArr2[21] = (i12 >>> 31) | (i13 << 1);
        int i14 = i13 >>> 31;
        long jQ7 = ck1.q(j31, j8, j36 >>> 32, j29);
        long jQ8 = ck1.q(j31, j12, jQ7 >>> 32, jQ6 & j);
        long jQ9 = ck1.q(j31, j17, jQ8 >>> 32, j33);
        long j37 = jQ8 & j;
        long jQ10 = ck1.q(j31, j24, jQ9 >>> 32, j35);
        long j38 = j34 + (jQ10 >>> 32);
        long j39 = jQ10 & j;
        long j40 = ((long) iArr[14]) & j;
        long j41 = (((long) iArr2[27]) & j) + (j38 >>> 32);
        long j42 = j38 & j;
        long j43 = (((long) iArr2[28]) & j) + (j41 >>> 32);
        long j44 = (j40 * j3) + (jQ7 & j);
        int i15 = (int) j44;
        iArr2[22] = (i15 << 1) | i14;
        long jQ11 = ck1.q(j40, j8, j44 >>> 32, j37);
        long jQ12 = ck1.q(j40, j12, jQ11 >>> 32, jQ9 & j);
        long jQ13 = ck1.q(j40, j17, jQ12 >>> 32, j39);
        long j45 = jQ12 & j;
        long jQ14 = ck1.q(j40, j24, jQ13 >>> 32, j42);
        long jQ15 = ck1.q(j40, j31, jQ14 >>> 32, j41 & j);
        long j46 = jQ14 & j;
        long j47 = j43 + (jQ15 >>> 32);
        long j48 = jQ15 & j;
        long j49 = ((long) iArr[15]) & j;
        long j50 = (((long) iArr2[29]) & j) + (j47 >>> 32);
        long j51 = (((long) iArr2[30]) & j) + (j50 >>> 32);
        long j52 = (j49 * j3) + (jQ11 & j);
        int i16 = (int) j52;
        iArr2[23] = (i15 >>> 31) | (i16 << 1);
        int i17 = i16 >>> 31;
        long jQ16 = ck1.q(j49, j8, j52 >>> 32, j45);
        long jQ17 = ck1.q(j49, j12, jQ16 >>> 32, jQ13 & j);
        long jQ18 = ck1.q(j49, j17, jQ17 >>> 32, j46);
        long jQ19 = ck1.q(j49, j24, jQ18 >>> 32, j48);
        long jQ20 = ck1.q(j49, j31, jQ19 >>> 32, j47 & j);
        long jQ21 = ck1.q(j49, j40, jQ20 >>> 32, j50 & j);
        long j53 = j51 + (jQ21 >>> 32);
        int i18 = (int) jQ16;
        iArr2[24] = (i18 << 1) | i17;
        int i19 = (int) jQ17;
        iArr2[25] = (i18 >>> 31) | (i19 << 1);
        int i20 = (int) jQ18;
        iArr2[26] = (i20 << 1) | (i19 >>> 31);
        int i21 = (int) jQ19;
        iArr2[27] = (i20 >>> 31) | (i21 << 1);
        int i22 = i21 >>> 31;
        int i23 = (int) jQ20;
        iArr2[28] = i22 | (i23 << 1);
        int i24 = i23 >>> 31;
        int i25 = (int) jQ21;
        iArr2[29] = i24 | (i25 << 1);
        int i26 = i25 >>> 31;
        int i27 = (int) j53;
        iArr2[30] = i26 | (i27 << 1);
        iArr2[31] = (i27 >>> 31) | ((iArr2[31] + ((int) (j53 >>> 32))) << 1);
        int i28 = r93.i(iArr2, iArr2);
        int i29 = 0;
        int iH = r93.h(24, 16, r93.h(0, 8, 0, iArr2, iArr2) + i28, iArr2, iArr2) + i28;
        int[] iArr3 = new int[8];
        r93.o(iArr, iArr, iArr3);
        int[] iArr4 = new int[16];
        r93.Y(iArr3, iArr4);
        kv.i(32, kv.h0(16, 8, iArr4, iArr2) + iH, 24, iArr2);
        int i30 = iArr[16];
        long j54 = ((long) (i30 << 1)) & j;
        long j55 = 0;
        do {
            int i31 = 16 + i29;
            long j56 = ((((long) iArr[i29]) & j) * j54) + (((long) iArr2[i31]) & j) + j55;
            iArr2[i31] = (int) j56;
            j55 = j56 >>> 32;
            i29++;
        } while (i29 < 16);
        iArr2[32] = (i30 * i30) + ((int) j55);
    }

    public static boolean u(ac2 ac2Var) {
        try {
            boolean zJ = ac2Var.J();
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return zJ;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap=" + zJ);
            return zJ;
        } catch (IOException e2) {
            if (!Log.isLoggable("GlideBitmapFactory", 2)) {
                return false;
            }
            Log.v("GlideBitmapFactory", "isLikelyToContainGainmap failed", e2);
            return false;
        }
    }

    public static boolean v(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < 7; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean w(int[] iArr) {
        for (int i2 = 0; i2 < 7; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr[0]) & 4294967295L;
        long j9 = j8 * j;
        iArr3[0] = (int) j9;
        long j10 = (j8 * j2) + (j9 >>> 32);
        iArr3[1] = (int) j10;
        long j11 = (j8 * j3) + (j10 >>> 32);
        iArr3[2] = (int) j11;
        long j12 = (j8 * j4) + (j11 >>> 32);
        iArr3[3] = (int) j12;
        long j13 = (j8 * j5) + (j12 >>> 32);
        iArr3[4] = (int) j13;
        long j14 = (j8 * j6) + (j13 >>> 32);
        iArr3[5] = (int) j14;
        long j15 = (j8 * j7) + (j14 >>> 32);
        iArr3[6] = (int) j15;
        iArr3[7] = (int) (j15 >>> 32);
        int i2 = 1;
        for (int i3 = 7; i2 < i3; i3 = 7) {
            long j16 = ((long) iArr[i2]) & 4294967295L;
            long j17 = (j16 * j) + (((long) iArr3[i2]) & 4294967295L);
            iArr3[i2] = (int) j17;
            int i4 = i2 + 1;
            long j18 = j5;
            long j19 = (j16 * j2) + (((long) iArr3[i4]) & 4294967295L) + (j17 >>> 32);
            iArr3[i4] = (int) j19;
            int i5 = i2 + 2;
            long j20 = (j16 * j3) + (((long) iArr3[i5]) & 4294967295L) + (j19 >>> 32);
            iArr3[i5] = (int) j20;
            int i6 = i2 + 3;
            long j21 = (j16 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j20 >>> 32);
            iArr3[i6] = (int) j21;
            int i7 = i2 + 4;
            long j22 = (j16 * j18) + (((long) iArr3[i7]) & 4294967295L) + (j21 >>> 32);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 5;
            long j23 = (j16 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j22 >>> 32);
            iArr3[i8] = (int) j23;
            int i9 = i2 + 6;
            long j24 = (j16 * j7) + (((long) iArr3[i9]) & 4294967295L) + (j23 >>> 32);
            iArr3[i9] = (int) j24;
            iArr3[i2 + 7] = (int) (j24 >>> 32);
            i2 = i4;
            j5 = j18;
        }
    }

    public static int y(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = 0;
        int i2 = 0;
        while (i2 < 7) {
            long j9 = j7;
            long j10 = ((long) iArr[i2]) & 4294967295L;
            long j11 = (((long) iArr3[i2]) & 4294967295L) + (j10 * j);
            iArr3[i2] = (int) j11;
            int i3 = i2 + 1;
            long j12 = (j10 * j2) + (((long) iArr3[i3]) & 4294967295L) + (j11 >>> 32);
            iArr3[i3] = (int) j12;
            int i4 = i2 + 2;
            long j13 = (j10 * j3) + (((long) iArr3[i4]) & 4294967295L) + (j12 >>> 32);
            int i5 = i2;
            iArr3[i4] = (int) j13;
            int i6 = i5 + 3;
            long j14 = (j10 * j4) + (((long) iArr3[i6]) & 4294967295L) + (j13 >>> 32);
            iArr3[i6] = (int) j14;
            int i7 = i5 + 4;
            long j15 = (j10 * j5) + (((long) iArr3[i7]) & 4294967295L) + (j14 >>> 32);
            iArr3[i7] = (int) j15;
            int i8 = i5 + 5;
            long j16 = (j10 * j6) + (((long) iArr3[i8]) & 4294967295L) + (j15 >>> 32);
            iArr3[i8] = (int) j16;
            int i9 = i5 + 6;
            long j17 = (j10 * j9) + (((long) iArr3[i9]) & 4294967295L) + (j16 >>> 32);
            iArr3[i9] = (int) j17;
            int i10 = i5 + 7;
            long j18 = j8 + (((long) iArr3[i10]) & 4294967295L) + (j17 >>> 32);
            iArr3[i10] = (int) j18;
            j8 = j18 >>> 32;
            i2 = i3;
            j7 = j9;
        }
        return (int) j8;
    }

    public static void z(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[33];
        r93.L(iArr, iArr2, iArr4);
        long j = ((long) iArr2[8]) & 4294967295L;
        long j2 = ((long) iArr2[9]) & 4294967295L;
        long j3 = ((long) iArr2[10]) & 4294967295L;
        long j4 = ((long) iArr2[11]) & 4294967295L;
        long j5 = ((long) iArr2[12]) & 4294967295L;
        long j6 = ((long) iArr2[13]) & 4294967295L;
        long j7 = ((long) iArr2[14]) & 4294967295L;
        long j8 = ((long) iArr2[15]) & 4294967295L;
        long j9 = ((long) iArr[8]) & 4294967295L;
        long j10 = j9 * j;
        iArr4[16] = (int) j10;
        int i2 = 32;
        long j11 = (j9 * j2) + (j10 >>> 32);
        iArr4[17] = (int) j11;
        long j12 = (j9 * j3) + (j11 >>> 32);
        iArr4[18] = (int) j12;
        long j13 = (j9 * j4) + (j12 >>> 32);
        iArr4[19] = (int) j13;
        long j14 = (j9 * j5) + (j13 >>> 32);
        iArr4[20] = (int) j14;
        long j15 = (j9 * j6) + (j14 >>> 32);
        iArr4[21] = (int) j15;
        long j16 = (j9 * j7) + (j15 >>> 32);
        iArr4[22] = (int) j16;
        long j17 = (j9 * j8) + (j16 >>> 32);
        iArr4[23] = (int) j17;
        iArr4[24] = (int) (j17 >>> 32);
        int i3 = 16;
        int i4 = 1;
        while (i4 < 8) {
            int i5 = i3 + 1;
            int i6 = i4;
            long j18 = j5;
            int i7 = i2;
            long j19 = ((long) iArr[8 + i4]) & 4294967295L;
            long j20 = j6;
            long j21 = (j19 * j) + (((long) iArr4[i5]) & 4294967295L);
            iArr4[i5] = (int) j21;
            int i8 = i3 + 2;
            long j22 = (j19 * j2) + (((long) iArr4[i8]) & 4294967295L) + (j21 >>> i7);
            iArr4[i8] = (int) j22;
            int i9 = i3 + 3;
            long j23 = (j19 * j3) + (((long) iArr4[i9]) & 4294967295L) + (j22 >>> i7);
            iArr4[i9] = (int) j23;
            int i10 = i3 + 4;
            long j24 = (j19 * j4) + (((long) iArr4[i10]) & 4294967295L) + (j23 >>> i7);
            iArr4[i10] = (int) j24;
            int i11 = i3 + 5;
            long j25 = (j19 * j18) + (((long) iArr4[i11]) & 4294967295L) + (j24 >>> i7);
            iArr4[i11] = (int) j25;
            int i12 = i3 + 6;
            long j26 = (j19 * j20) + (((long) iArr4[i12]) & 4294967295L) + (j25 >>> i7);
            iArr4[i12] = (int) j26;
            int i13 = i3 + 7;
            long j27 = (j19 * j7) + (((long) iArr4[i13]) & 4294967295L) + (j26 >>> i7);
            iArr4[i13] = (int) j27;
            int i14 = i3 + 8;
            long j28 = (j19 * j8) + (((long) iArr4[i14]) & 4294967295L) + (j27 >>> i7);
            iArr4[i14] = (int) j28;
            iArr4[i3 + 9] = (int) (j28 >>> i7);
            i4 = i6 + 1;
            i3 = i5;
            i2 = i7;
            j5 = j18;
            j3 = j3;
            j6 = j20;
        }
        int i15 = i2;
        int i16 = r93.i(iArr4, iArr4);
        int i17 = 0;
        int iH = r93.h(24, 16, r93.h(0, 8, 0, iArr4, iArr4) + i16, iArr4, iArr4) + i16;
        int[] iArr5 = new int[8];
        int[] iArr6 = new int[8];
        boolean z = r93.o(iArr, iArr, iArr5) != r93.o(iArr2, iArr2, iArr6);
        int[] iArr7 = new int[16];
        r93.L(iArr5, iArr6, iArr7);
        kv.i(i15, iH + (z ? kv.g(16, 8, iArr7, iArr4) : kv.h0(16, 8, iArr7, iArr4)), 24, iArr4);
        int i18 = iArr[16];
        int i19 = iArr2[16];
        long j29 = ((long) i18) & 4294967295L;
        long j30 = ((long) i19) & 4294967295L;
        long j31 = 0;
        while (true) {
            long j32 = j29;
            int i20 = 16 + i17;
            long j33 = ((((long) iArr[i17]) & 4294967295L) * j30) + (j32 * (((long) iArr2[i17]) & 4294967295L)) + (((long) iArr4[i20]) & 4294967295L) + j31;
            iArr4[i20] = (int) j33;
            long j34 = j33 >>> 32;
            i17++;
            if (i17 >= 16) {
                iArr4[32] = (i18 * i19) + ((int) j34);
                B(iArr4, iArr3);
                return;
            } else {
                j31 = j34;
                j29 = j32;
            }
        }
    }

    public abstract int J();

    public abstract pq3 M(int i2);

    public abstract Object N(int i2);

    public abstract Object Q(pq3 pq3Var);
}
