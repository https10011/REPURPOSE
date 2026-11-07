package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.appsflyer.internal.d;
import com.hjq.toast.BuildConfig;
import com.transsion.infra.gateway.core.bean.GatewayResponse;
import com.transsion.infra.gateway.core.bean.GatewaySignKey;
import com.transsion.infra.gateway.core.bean.RequestBean;
import com.transsion.infra.gateway.core.bean.TimeBean;
import com.transsion.sdk.oneid.data.IdChangeInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class am2 {
    public static final Type[] a = new Type[0];
    public static final int[] b = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int[] c = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int[] d = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};
    public static final s43 e = new s43("id");
    public static final s43 f = new s43("type");
    public static b81 g;

    public static Type A(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return Q(type, cls, x(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static boolean B(int[] iArr, int[] iArr2) {
        for (int i = 3; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static void C(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void D(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 7;
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        C(jArr, jArr4);
        C(jArr2, jArr5);
        int i2 = 0;
        while (i2 < i) {
            long j = jArr5[i2];
            long[] jArr6 = new long[8];
            jArr6[1] = j;
            long j2 = j << 1;
            jArr6[2] = j2;
            long j3 = j2 ^ j;
            jArr6[3] = j3;
            long j4 = j << 2;
            jArr6[4] = j4;
            jArr6[5] = j4 ^ j;
            long j5 = j3 << 1;
            jArr6[6] = j5;
            jArr6[i] = j5 ^ j;
            int i3 = 0;
            while (i3 < i) {
                int i4 = i;
                long[] jArr7 = jArr4;
                long j6 = jArr7[i3];
                int i5 = (int) j6;
                long j7 = jArr6[i5 & 7] ^ (jArr6[(i5 >>> 3) & 7] << 3);
                int i6 = i2;
                int i7 = 54;
                long j8 = 0;
                do {
                    int i8 = (int) (j6 >>> i7);
                    long j9 = jArr6[i8 & 7] ^ (jArr6[(i8 >>> 3) & 7] << 3);
                    j7 ^= j9 << i7;
                    j8 ^= j9 >>> (-i7);
                    i7 -= 6;
                } while (i7 > 0);
                int i9 = i6 + i3;
                jArr3[i9] = jArr3[i9] ^ (j7 & 576460752303423487L);
                int i10 = i9 + 1;
                jArr3[i10] = jArr3[i10] ^ ((j7 >>> 59) ^ (j8 << 5));
                i3++;
                i2 = i6;
                i = i4;
                jArr4 = jArr7;
            }
            i2++;
        }
        int i11 = i;
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = jArr3[4];
        long j15 = jArr3[5];
        long j16 = jArr3[6];
        long j17 = jArr3[i11];
        long j18 = jArr3[8];
        long j19 = jArr3[9];
        long j20 = jArr3[10];
        long j21 = jArr3[11];
        long j22 = jArr3[12];
        long j23 = jArr3[13];
        jArr3[0] = j10 ^ (j11 << 59);
        jArr3[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr3[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr3[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr3[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr3[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr3[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr3[i11] = (j17 >>> 35) ^ (j18 << 24);
        jArr3[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr3[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr3[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr3[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr3[12] = (j22 >>> 60) ^ (j23 >>> 1);
        jArr3[13] = 0;
    }

    public static void E(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            bj0.k(i << 1, jArr[i], jArr2);
        }
        jArr2[12] = bj0.j((int) jArr[6]);
    }

    public static boolean F(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean G(int[] iArr) {
        for (int i = 0; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static Typeface H(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, zi0.f(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static void I(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        int i = 1;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr[0]) & 4294967295L;
        long j7 = j6 * j2;
        iArr3[0] = (int) j7;
        long j8 = (j6 * j3) + (j7 >>> 32);
        iArr3[1] = (int) j8;
        long j9 = (j6 * j4) + (j8 >>> 32);
        iArr3[2] = (int) j9;
        long j10 = (j6 * j5) + (j9 >>> 32);
        iArr3[3] = (int) j10;
        iArr3[4] = (int) (j10 >>> 32);
        for (int i2 = 4; i < i2; i2 = 4) {
            long j11 = ((long) iArr[i]) & j;
            long j12 = (j11 * j2) + (((long) iArr3[i]) & j);
            iArr3[i] = (int) j12;
            int i3 = i + 1;
            long j13 = j;
            long j14 = (j11 * j3) + (((long) iArr3[i3]) & j13) + (j12 >>> 32);
            iArr3[i3] = (int) j14;
            int i4 = i + 2;
            long j15 = (j11 * j4) + (((long) iArr3[i4]) & j13) + (j14 >>> 32);
            iArr3[i4] = (int) j15;
            long j16 = j15 >>> 32;
            int i5 = i + 3;
            long j17 = (j11 * j5) + (((long) iArr3[i5]) & j13) + j16;
            iArr3[i5] = (int) j17;
            iArr3[i + 4] = (int) (j17 >>> 32);
            i = i3;
            j = j13;
        }
    }

    public static void J(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        r93.L(iArr, iArr2, iArr4);
        N(iArr4, iArr3);
    }

    public static void K(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[14];
        D(jArr, jArr2, jArr4);
        O(jArr4, jArr3);
    }

    public static boolean L(int i, String str, GatewaySignKey gatewaySignKey) {
        SharedPreferences sharedPreferences;
        if (i != 200 && !TextUtils.isEmpty(str)) {
            try {
                a81 a81Var = nh0.a;
                a81Var.a("response".concat(str));
                GatewayResponse gatewayResponse = (GatewayResponse) x91.t(GatewayResponse.class, str);
                if ("GW.4410".equals(gatewayResponse.errorCode)) {
                    a81Var.a("verify sign failed, retrying update time");
                    TimeBean timeBean = (TimeBean) x91.t(TimeBean.class, zi0.j(gatewayResponse.errorMsg, gatewaySignKey.getKey()));
                    if (timeBean.time > 0) {
                        nl1 nl1VarG = nl1.g(z32.p());
                        long jCurrentTimeMillis = timeBean.time - System.currentTimeMillis();
                        Context context = (Context) nl1VarG.a;
                        if (context == null) {
                            return true;
                        }
                        if (((SharedPreferences) nl1VarG.b) == null) {
                            try {
                                sharedPreferences = context.getSharedPreferences("gateway_core", 0);
                                nl1VarG.b = sharedPreferences;
                            } catch (Exception unused) {
                                sharedPreferences = null;
                            }
                            nl1VarG.b = sharedPreferences;
                        }
                        SharedPreferences sharedPreferences2 = (SharedPreferences) nl1VarG.b;
                        if (sharedPreferences2 == null) {
                            return true;
                        }
                        try {
                            sharedPreferences2.edit().putLong("time_offset", jCurrentTimeMillis).apply();
                            return true;
                        } catch (Exception unused2) {
                            return true;
                        }
                    }
                }
            } catch (Exception e2) {
                a81 a81Var2 = nh0.a;
                a81Var2.b(a81Var2.a.a, 6, e2);
            }
        }
        return false;
    }

    public static void M(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void N(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = (977 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[9]) & 4294967295L;
        long j4 = (977 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[10]) & 4294967295L;
        long j6 = (977 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[11]) & 4294967295L;
        long j8 = (977 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[12]) & 4294967295L;
        long j10 = (977 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[13]) & 4294967295L;
        long j12 = (977 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = ((long) iArr[14]) & 4294967295L;
        long j14 = (977 * j13) + j11 + (((long) iArr[6]) & 4294967295L) + (j12 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = ((long) iArr[15]) & 4294967295L;
        long j16 = (977 * j15) + j13 + (((long) iArr[7]) & 4294967295L) + (j14 >>> 32);
        iArr2[7] = (int) j16;
        long j17 = (j16 >>> 32) + j15;
        long j18 = j17 & 4294967295L;
        long j19 = (977 * j18) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j19;
        long j20 = j17 >>> 32;
        long j21 = (977 * j20) + j18 + (((long) i2) & 4294967295L) + (j19 >>> 32);
        iArr2[1] = (int) j21;
        long j22 = j20 + (((long) i3) & 4294967295L) + (j21 >>> 32);
        iArr2[2] = (int) j22;
        long j23 = (j22 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j23;
        if (((j23 >>> 32) == 0 ? 0 : kv.L(8, 4, iArr2)) != 0 || (iArr2[7] == -1 && r93.x(iArr2, b))) {
            kv.d(8, 977, iArr2);
        }
    }

    public static void O(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[12];
        long j10 = j6 ^ (j9 << 39);
        long j11 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j12 = j8 ^ (j9 >>> 2);
        long j13 = jArr[11];
        long j14 = j5 ^ (j13 << 39);
        long j15 = j10 ^ ((j13 >>> 25) ^ (j13 << 62));
        long j16 = j11 ^ (j13 >>> 2);
        long j17 = jArr[10];
        long j18 = j4 ^ (j17 << 39);
        long j19 = j14 ^ ((j17 >>> 25) ^ (j17 << 62));
        long j20 = j15 ^ (j17 >>> 2);
        long j21 = jArr[9];
        long j22 = j3 ^ (j21 << 39);
        long j23 = j18 ^ ((j21 >>> 25) ^ (j21 << 62));
        long j24 = j19 ^ (j21 >>> 2);
        long j25 = jArr[8];
        long j26 = j ^ (j12 << 39);
        long j27 = (j2 ^ (j25 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j28 = (j22 ^ ((j25 >>> 25) ^ (j25 << 62))) ^ (j12 >>> 2);
        long j29 = j16 >>> 25;
        jArr2[0] = j26 ^ j29;
        jArr2[1] = (j29 << 23) ^ j27;
        jArr2[2] = j28;
        jArr2[3] = j23 ^ (j25 >>> 2);
        jArr2[4] = j24;
        jArr2[5] = j20;
        jArr2[6] = j16 & 33554431;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003d  */
    public static void P(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[7] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (977 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? kv.L(8, 3, iArr) : 0) == 0) {
            if (iArr[7] == -1 || !r93.x(iArr, b)) {
                return;
            }
        }
        kv.d(8, 977, iArr);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:68:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b  */
    /* JADX WARN: Code duplicated, block: B:77:0x012c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0133  */
    /* JADX WARN: Code duplicated, block: B:93:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [al0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [al0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static Type Q(Type type, Class cls, Type type2, HashMap map) {
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeQ;
        Type[] upperBounds2;
        Type typeQ2;
        Type[] lowerBounds2;
        boolean zEquals;
        int length;
        Type[] typeArr;
        boolean z;
        Type zk0Var;
        Type typeQ3;
        Type genericComponentType;
        Type typeQ4;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            int i = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                if (typeQ instanceof WildcardType) {
                                    upperBounds2 = ((WildcardType) typeQ).getUpperBounds();
                                } else {
                                    upperBounds2 = new Type[]{typeQ};
                                }
                                type2 = new al0(upperBounds2, a, 0);
                                break;
                            }
                            typeQ2 = Q(type, cls, lowerBounds[0], map);
                            if (typeQ2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeQ2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeQ2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeQ2};
                            }
                            type2 = new al0(new Type[]{Object.class}, lowerBounds2, 0);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        Type typeQ5 = Q(type, cls, ownerType, map);
                        zEquals = Objects.equals(typeQ5, ownerType);
                        Type[] actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        typeArr = actualTypeArguments;
                        z = false;
                        while (i < length) {
                            typeQ3 = Q(type, cls, typeArr[i], map);
                            if (Objects.equals(typeQ3, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = typeQ3;
                            }
                            i++;
                        }
                        if (!zEquals) {
                        }
                        zk0Var = new zk0(typeQ5, (Class) type2.getRawType(), typeArr);
                        type2 = zk0Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeQ4 = Q(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeQ4)) {
                        zk0Var = new yk0(0, typeQ4);
                        type2 = zk0Var;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            type2 = (WildcardType) type2;
                            lowerBounds = type2.getLowerBounds();
                            upperBounds = type2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeQ = Q(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    if (typeQ instanceof WildcardType) {
                                        upperBounds2 = ((WildcardType) typeQ).getUpperBounds();
                                    } else {
                                        upperBounds2 = new Type[]{typeQ};
                                    }
                                    type2 = new al0(upperBounds2, a, 0);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeQ2 = Q(type, cls, lowerBounds[0], map);
                            if (typeQ2 != lowerBounds[0]) {
                                break;
                            }
                            if (typeQ2 instanceof WildcardType) {
                                lowerBounds2 = ((WildcardType) typeQ2).getLowerBounds();
                            } else {
                                lowerBounds2 = new Type[]{typeQ2};
                            }
                            type2 = new al0(new Type[]{Object.class}, lowerBounds2, 0);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        Type typeQ6 = Q(type, cls, ownerType2, map);
                        zEquals = Objects.equals(typeQ6, ownerType2);
                        Type[] actualTypeArguments2 = type2.getActualTypeArguments();
                        length = actualTypeArguments2.length;
                        typeArr = actualTypeArguments2;
                        z = false;
                        while (i < length) {
                            typeQ3 = Q(type, cls, typeArr[i], map);
                            if (Objects.equals(typeQ3, typeArr[i])) {
                                if (!z) {
                                    typeArr = (Type[]) typeArr.clone();
                                    z = true;
                                }
                                typeArr[i] = typeQ3;
                            }
                            i++;
                        }
                        if (!zEquals && !z) {
                            break;
                        }
                        zk0Var = new zk0(typeQ6, (Class) type2.getRawType(), typeArr);
                        type2 = zk0Var;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeQ4 = Q(type, cls, genericComponentType, map);
                    if (Objects.equals(genericComponentType, typeQ4)) {
                        break;
                    }
                    zk0Var = new yk0(0, typeQ4);
                    type2 = zk0Var;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeQ7 = Q(type, cls, componentType, map);
                if (!Objects.equals(componentType, typeQ7)) {
                    zk0Var = new yk0(0, typeQ7);
                    type2 = zk0Var;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type3 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type3 != null) {
                return type3 == cls3 ? type2 : type3;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls4 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls4 == null) {
                type2 = typeVariable;
            } else {
                Type typeX = x(type, cls, cls4);
                if (typeX instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls4.getTypeParameters();
                    int length2 = typeParameters.length;
                    while (true) {
                        if (i >= length2) {
                            uq1.a();
                            return null;
                        }
                        if (typeVariable.equals(typeParameters[i])) {
                            type2 = ((ParameterizedType) typeX).getActualTypeArguments()[i];
                            break;
                        }
                        i++;
                    }
                } else {
                    type2 = typeVariable;
                }
            }
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static void R(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        N(iArr3, iArr2);
    }

    public static void S(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 8;
        int i2 = 0;
        int i3 = 3;
        while (true) {
            int i4 = i3 - 1;
            long j2 = ((long) iArr[i3]) & 4294967295L;
            long j3 = j2 * j2;
            iArr2[i - 1] = (i2 << 31) | ((int) (j3 >>> 33));
            i -= 2;
            iArr2[i] = (int) (j3 >>> 1);
            i2 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                long j5 = (j4 >>> 33) | (((long) (i2 << 31)) & 4294967295L);
                iArr2[0] = (int) j4;
                int i5 = ((int) (j4 >>> 32)) & 1;
                long j6 = ((long) iArr[1]) & 4294967295L;
                long j7 = ((long) iArr2[2]) & 4294967295L;
                long j8 = (j6 * j) + j5;
                int i6 = (int) j8;
                iArr2[1] = i5 | (i6 << 1);
                int i7 = i6 >>> 31;
                long j9 = ((long) iArr[2]) & 4294967295L;
                long j10 = ((long) iArr2[3]) & 4294967295L;
                long j11 = ((long) iArr2[4]) & 4294967295L;
                long j12 = (j9 * j) + j7 + (j8 >>> 32);
                int i8 = (int) j12;
                iArr2[2] = i7 | (i8 << 1);
                long jQ = ck1.q(j9, j6, j12 >>> 32, j10);
                long j13 = j11 + (jQ >>> 32);
                long j14 = ((long) iArr[3]) & 4294967295L;
                long j15 = (((long) iArr2[5]) & 4294967295L) + (j13 >>> 32);
                long j16 = (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
                long j17 = (j * j14) + (jQ & 4294967295L);
                int i9 = (int) j17;
                iArr2[3] = (i8 >>> 31) | (i9 << 1);
                long jQ2 = ck1.q(j14, j6, j17 >>> 32, j13 & 4294967295L);
                long jQ3 = ck1.q(j14, j9, jQ2 >>> 32, j15 & 4294967295L);
                long j18 = j16 + (jQ3 >>> 32);
                int i10 = (int) jQ2;
                iArr2[4] = (i9 >>> 31) | (i10 << 1);
                int i11 = i10 >>> 31;
                int i12 = (int) (jQ3 & 4294967295L);
                iArr2[5] = i11 | (i12 << 1);
                int i13 = i12 >>> 31;
                int i14 = (int) j18;
                iArr2[6] = i13 | (i14 << 1);
                iArr2[7] = (i14 >>> 31) | ((iArr2[7] + ((int) (j18 >>> 32))) << 1);
                return;
            }
            i3 = i4;
        }
    }

    public static void T(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        r93.Y(iArr, iArr3);
        N(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            r93.Y(iArr2, iArr3);
            N(iArr3, iArr2);
        }
    }

    public static void U(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[13];
        E(jArr, jArr3);
        O(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            E(jArr2, jArr3);
            O(jArr3, jArr2);
        }
    }

    public static int V(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j >> 32);
        iArr3[1] = (int) j2;
        long j3 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j2 >> 32);
        iArr3[2] = (int) j3;
        long j4 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j3 >> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >> 32);
    }

    public static void W(int[] iArr, int[] iArr2, int[] iArr3) {
        if (r93.b0(iArr, iArr2, iArr3) != 0) {
            kv.g0(8, 977, iArr3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void X(Throwable th, fs fsVar) {
        mv0 mv0Var;
        if (fsVar instanceof mv0) {
            mv0Var = (mv0) fsVar;
            int i = mv0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mv0Var.b = i - Integer.MIN_VALUE;
            } else {
                mv0Var = new mv0(fsVar);
            }
        } else {
            mv0Var = new mv0(fsVar);
        }
        Object obj = mv0Var.a;
        ft ftVar = ft.a;
        int i2 = mv0Var.b;
        if (i2 == 0) {
            zi0.B(obj);
            mv0Var.b = 1;
            i20.a.e(mv0Var.getContext(), new bh0(10, mv0Var, th));
        } else if (i2 != 1) {
            uq1.q("call to 'resume' before 'invoke' with coroutine");
        } else {
            zi0.B(obj);
            throw new ov0();
        }
    }

    public static String Y(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static int Z(EllipticCurve ellipticCurve) {
        return (jc3.a(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static String a(long j) {
        try {
            if (j >= 1073741824) {
                return String.format(Locale.ENGLISH, "%.1fGB", Float.valueOf(j / 1.0737418E9f));
            }
            if (j >= 1048576) {
                float f2 = j / 1048576.0f;
                return String.format(Locale.ENGLISH, f2 > 100.0f ? "%.0fMB" : "%.1fMB", Float.valueOf(f2));
            }
            if (j >= 1024) {
                float f3 = j / 1024.0f;
                return String.format(Locale.ENGLISH, f3 > 100.0f ? "%.0fKB" : "%.1fKB", Float.valueOf(f3));
            }
            Locale locale = Locale.ENGLISH;
            return j + "B";
        } catch (Throwable unused) {
            return "0";
        }
    }

    public static BigInteger a0(BigInteger bigInteger, boolean z, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigIntegerA = jc3.a(ellipticCurve);
        BigInteger bigIntegerMod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(bigIntegerA);
        if (bigIntegerA.signum() != 1) {
            throw new InvalidAlgorithmParameterException("p must be positive");
        }
        BigInteger bigIntegerMod2 = bigIntegerMod.mod(bigIntegerA);
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        if (!bigIntegerMod2.equals(bigIntegerAdd)) {
            if (bigIntegerA.testBit(0) && bigIntegerA.testBit(1)) {
                bigIntegerAdd = bigIntegerMod2.modPow(bigIntegerA.add(BigInteger.ONE).shiftRight(2), bigIntegerA);
            } else if (!bigIntegerA.testBit(0) || bigIntegerA.testBit(1)) {
                bigIntegerAdd = null;
            } else {
                bigIntegerAdd = BigInteger.ONE;
                BigInteger bigIntegerShiftRight = bigIntegerA.subtract(bigIntegerAdd).shiftRight(1);
                int i = 0;
                while (true) {
                    BigInteger bigIntegerMod3 = bigIntegerAdd.multiply(bigIntegerAdd).subtract(bigIntegerMod2).mod(bigIntegerA);
                    if (!bigIntegerMod3.equals(BigInteger.ZERO)) {
                        BigInteger bigIntegerModPow = bigIntegerMod3.modPow(bigIntegerShiftRight, bigIntegerA);
                        BigInteger bigIntegerMod4 = BigInteger.ONE;
                        if (bigIntegerModPow.add(bigIntegerMod4).equals(bigIntegerA)) {
                            BigInteger bigIntegerShiftRight2 = bigIntegerA.add(bigIntegerMod4).shiftRight(1);
                            BigInteger bigIntegerMod5 = bigIntegerAdd;
                            for (int iBitLength = bigIntegerShiftRight2.bitLength() - 2; iBitLength >= 0; iBitLength--) {
                                BigInteger bigIntegerMultiply = bigIntegerMod5.multiply(bigIntegerMod4);
                                bigIntegerMod5 = bigIntegerMod5.multiply(bigIntegerMod5).add(bigIntegerMod4.multiply(bigIntegerMod4).mod(bigIntegerA).multiply(bigIntegerMod3)).mod(bigIntegerA);
                                BigInteger bigIntegerMod6 = bigIntegerMultiply.add(bigIntegerMultiply).mod(bigIntegerA);
                                if (bigIntegerShiftRight2.testBit(iBitLength)) {
                                    BigInteger bigIntegerMod7 = bigIntegerMod5.multiply(bigIntegerAdd).add(bigIntegerMod6.multiply(bigIntegerMod3)).mod(bigIntegerA);
                                    bigIntegerMod4 = bigIntegerAdd.multiply(bigIntegerMod6).add(bigIntegerMod5).mod(bigIntegerA);
                                    bigIntegerMod5 = bigIntegerMod7;
                                } else {
                                    bigIntegerMod4 = bigIntegerMod6;
                                }
                            }
                            bigIntegerAdd = bigIntegerMod5;
                        } else {
                            if (!bigIntegerModPow.equals(bigIntegerMod4)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigIntegerAdd = bigIntegerAdd.add(bigIntegerMod4);
                            i++;
                            if (i == 128 && !bigIntegerA.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        }
                    }
                }
            }
            if (bigIntegerAdd != null && bigIntegerAdd.multiply(bigIntegerAdd).mod(bigIntegerA).compareTo(bigIntegerMod2) != 0) {
                tv2.f("Could not find a modular square root");
                return null;
            }
        }
        return z != bigIntegerAdd.testBit(0) ? bigIntegerA.subtract(bigIntegerAdd).mod(bigIntegerA) : bigIntegerAdd;
    }

    public static String b(Context context, Handler.Callback callback) {
        Cursor cursorQuery = null;
        try {
            try {
                if (callback == null) {
                    cursorQuery = context.getContentResolver().query(Uri.parse("content://com.transsion.dataservice.provider/property"), null, "prop_key = ?", new String[]{"oneid"}, null);
                    if (cursorQuery != null && cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(0);
                        cursorQuery.close();
                        return string;
                    }
                } else {
                    new te2(context, callback).a();
                }
                if (cursorQuery == null) {
                    return BuildConfig.FLAVOR;
                }
                cursorQuery.close();
                return BuildConfig.FLAVOR;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    public static ECParameterSpec b0(wq3 wq3Var) throws NoSuchAlgorithmException {
        int iOrdinal = wq3Var.ordinal();
        if (iOrdinal == 0) {
            return jc3.a;
        }
        if (iOrdinal == 1) {
            return jc3.b;
        }
        if (iOrdinal == 2) {
            return jc3.c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(String.valueOf(wq3Var)));
    }

    public static String c(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.os.SystemProperties");
            return (String) clsLoadClass.getMethod("get", String.class).invoke(clsLoadClass, new String(str));
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Exception unused) {
            return BuildConfig.FLAVOR;
        }
    }

    public static ECPoint c0(EllipticCurve ellipticCurve, zq3 zq3Var, byte[] bArr) throws GeneralSecurityException {
        int iZ = Z(ellipticCurve);
        int iOrdinal = zq3Var.ordinal();
        boolean z = false;
        if (iOrdinal == 0) {
            if (bArr.length != (iZ * 2) + 1) {
                tv2.f("invalid point size");
                return null;
            }
            if (bArr[0] != 4) {
                tv2.f("invalid point format");
                return null;
            }
            int i = iZ + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i)), new BigInteger(1, Arrays.copyOfRange(bArr, i, bArr.length)));
            jc3.g(eCPoint, ellipticCurve);
            return eCPoint;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new GeneralSecurityException("invalid format:".concat(String.valueOf(zq3Var)));
            }
            if (bArr.length != iZ * 2) {
                tv2.f("invalid point size");
                return null;
            }
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOf(bArr, iZ)), new BigInteger(1, Arrays.copyOfRange(bArr, iZ, bArr.length)));
            jc3.g(eCPoint2, ellipticCurve);
            return eCPoint2;
        }
        BigInteger bigIntegerA = jc3.a(ellipticCurve);
        if (bArr.length != iZ + 1) {
            tv2.f("compressed point has wrong length");
            return null;
        }
        byte b2 = bArr[0];
        if (b2 != 2) {
            if (b2 != 3) {
                tv2.f("invalid format");
                return null;
            }
            z = true;
        }
        BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
        if (bigInteger.signum() != -1 && bigInteger.compareTo(bigIntegerA) < 0) {
            return new ECPoint(bigInteger, a0(bigInteger, z, ellipticCurve));
        }
        tv2.f("x is out of range");
        return null;
    }

    public static String d(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            int i = fileInputStream.read(bArr);
            String str = i > 0 ? new String(bArr, 0, i) : null;
            fileInputStream.close();
            return str;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static sk2 d0(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder sbB = d.b("Failed to parse ", str, " for string [", str2, "] with exception: ");
        sbB.append(message);
        Log.e(str, sbB.toString());
        return new sk2(d.a("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static String e(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return String.valueOf(str.hashCode());
        }
    }

    public static void e0(JSONObject jSONObject, String str, String str2) throws JSONException {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    public static void f(Context context, CopyOnWriteArrayList copyOnWriteArrayList) {
        try {
            Iterator it = copyOnWriteArrayList.iterator();
            JSONObject jSONObject = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (it.hasNext()) {
                IdChangeInfo idChangeInfo = (IdChangeInfo) it.next();
                String str5 = idChangeInfo.id_type;
                int iHashCode = str5.hashCode();
                if (iHashCode != 3403373) {
                    if (iHashCode != 3417788) {
                        if (iHashCode != 3569626) {
                            if (iHashCode == 3611910 && str5.equals("vaid")) {
                                str3 = idChangeInfo.new_id;
                            }
                        } else if (str5.equals("tsid")) {
                            str = idChangeInfo.new_id;
                        }
                    } else if (str5.equals("opid")) {
                        str4 = idChangeInfo.new_id;
                    }
                } else if (str5.equals("oaid")) {
                    str2 = idChangeInfo.new_id;
                }
            }
            yd2 yd2VarA = yd2.a(context);
            if (!TextUtils.isEmpty(str)) {
                int iIntValue = Long.valueOf(System.currentTimeMillis() / 1000).intValue();
                try {
                    yd2VarA.c("oneid", str);
                    yd2VarA.b(iIntValue, "oneid_time");
                    g("sync tsid success");
                } catch (Exception unused) {
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    yd2VarA.f("oaid", str2);
                    g("sync oaid success");
                } catch (Exception unused2) {
                }
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3)) {
                return;
            }
            File file = new File(aj0.a());
            if (context.checkCallingOrSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0 && context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                if (file.exists()) {
                    String strD = d(file);
                    if (strD != null && strD.length() > 0) {
                        jSONObject = new JSONObject(strD);
                    }
                } else {
                    File file2 = new File(Environment.getExternalStorageDirectory(), Environment.DIRECTORY_DOCUMENTS);
                    if ((file2.exists() || file2.mkdirs()) && file.createNewFile()) {
                        g("createNewFile success");
                    }
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                String strOptString = jSONObject.optString("opid", BuildConfig.FLAVOR);
                if (TextUtils.isEmpty(strOptString)) {
                    jSONObject.put("opid", str4);
                    g("sync opid success");
                } else if (!TextUtils.equals(strOptString, str4)) {
                    yd2.a(context).c("opid", strOptString);
                    g("cover opid success");
                }
                if (!TextUtils.isEmpty(str3)) {
                    jSONObject.put(context.getPackageName(), str3);
                    g("sync vaid success");
                }
                String string = jSONObject.toString();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fileOutputStream.write(string.getBytes());
                        fileOutputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        } catch (Exception e3) {
            l(e3.getMessage());
        }
    }

    public static byte[] f0(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        try {
            if (!jc3.h(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            jc3.g(w, eCPrivateKey.getParams().getCurve());
            PublicKey publicKeyGeneratePublic = ((KeyFactory) cr3.f.a.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) cr3.d.a.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(publicKeyGeneratePublic, true);
                byte[] bArrGenerateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger = new BigInteger(1, bArrGenerateSecret);
                if (bigInteger.signum() == -1 || bigInteger.compareTo(jc3.a(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                a0(bigInteger, true, curve);
                return bArrGenerateSecret;
            } catch (IllegalStateException e2) {
                throw new GeneralSecurityException(e2);
            }
        } catch (IllegalArgumentException | NullPointerException e3) {
            throw new GeneralSecurityException(e3);
        }
    }

    public static void g(String str) {
        b81 b81Var = g;
        if (b81Var != null) {
            b81Var.a(str);
        }
    }

    public static byte[] g0(byte[]... bArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            length += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }

    public static int h(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j;
        long j2 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j >>> 32);
        iArr3[1] = (int) j2;
        long j3 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j2 >>> 32);
        iArr3[2] = (int) j3;
        long j4 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j3 >>> 32);
        iArr3[3] = (int) j4;
        return (int) (j4 >>> 32);
    }

    public static vl2 h0() {
        ClassLoader classLoader = am2.class.getClassLoader();
        if (vl2.class.equals(vl2.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new am2[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e3) {
                    Logger.getLogger(tl2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(vl2.class.getSimpleName()), (Throwable) e3);
                }
            }
            if (arrayList.size() == 1) {
                return (vl2) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (vl2) vl2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    public static final Object i(wj wjVar, fs fsVar) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        pkVar.w(new lv0(wjVar, 0));
        wjVar.w(new pv2(pkVar));
        Object objS = pkVar.s();
        ft ftVar = ft.a;
        return objS;
    }

    public static final Object j(wj wjVar, fs fsVar) {
        pk pkVar = new pk(1, sr0.b(fsVar));
        pkVar.u();
        pkVar.w(new lv0(wjVar, 1));
        wjVar.w(new wa(pkVar, 14));
        Object objS = pkVar.s();
        ft ftVar = ft.a;
        return objS;
    }

    public static String k(Context context) {
        String processName = null;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                processName = Application.getProcessName();
            } else {
                int iMyPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == iMyPid) {
                            processName = runningAppProcessInfo.processName;
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return TextUtils.isEmpty(processName) ? context.getPackageName() : processName;
    }

    public static void l(Serializable serializable) {
        b81 b81Var = g;
        if (b81Var != null) {
            b81Var.b(serializable);
        }
    }

    public static Type m(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new yk0(0, m(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new zk0(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new yk0(0, ((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new al0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds(), 0);
    }

    public static void n(String str, boolean z) {
        if (z) {
            return;
        }
        e.g(str);
    }

    public static void o(Object obj) {
        p(obj, "Argument must not be null");
    }

    public static void p(Object obj, String str) {
        if (obj != null) {
            return;
        }
        uq1.h(str);
    }

    public static void q(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            e.g("Primitive type is not allowed");
        }
    }

    public static boolean r(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager == null) {
            return false;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(4) || networkCapabilities.hasTransport(3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static String s(RequestBean requestBean) {
        String str;
        long length;
        String strV;
        long j;
        String string;
        String string2;
        SharedPreferences sharedPreferences;
        a81 a81Var = nh0.a;
        a81Var.a("requestBean" + requestBean.toString());
        if (requestBean.getMethod() == null) {
            a81Var.a("request method is null");
            return null;
        }
        if (TextUtils.isEmpty(requestBean.getUrl())) {
            a81Var.a("request url is null");
            return null;
        }
        if (requestBean.getKey() == null) {
            a81Var.a("request key is null");
            return null;
        }
        if (requestBean.getKey().getKey() == null) {
            a81Var.a("request key is null");
            return null;
        }
        nl1 nl1VarG = nl1.g(z32.p());
        Context context = (Context) nl1VarG.a;
        long j2 = -1;
        if (context != null) {
            if (((SharedPreferences) nl1VarG.b) == null) {
                try {
                    sharedPreferences = context.getSharedPreferences("gateway_core", 0);
                    nl1VarG.b = sharedPreferences;
                } catch (Exception unused) {
                    sharedPreferences = null;
                }
                nl1VarG.b = sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = (SharedPreferences) nl1VarG.b;
            if (sharedPreferences2 != null) {
                try {
                    j2 = sharedPreferences2.getLong("time_offset", 0L);
                } catch (Exception unused2) {
                }
            }
        }
        long jCurrentTimeMillis = j2 + System.currentTimeMillis();
        String key = requestBean.getKey().getKey();
        String method = requestBean.getMethod();
        String accept = requestBean.getAccept();
        String contentType = requestBean.getContentType();
        String url = requestBean.getUrl();
        String body = requestBean.getBody();
        qq1 algorithm = requestBean.getKey().getAlgorithm();
        StringBuilder sb = new StringBuilder();
        boolean zIsEmpty = TextUtils.isEmpty(body);
        String strEncodeToString = BuildConfig.FLAVOR;
        if (zIsEmpty) {
            str = method;
            nh0.a.a("request body is null");
            strV = BuildConfig.FLAVOR;
            j = 0;
        } else {
            try {
                str = method;
                length = body.length();
                try {
                    System.currentTimeMillis();
                    try {
                        strV = body.length() > 102400 ? ga.v(body.substring(0, 102400)) : ga.v(body);
                        j = length;
                    } catch (Exception e2) {
                        e = e2;
                        length = length;
                        a81 a81Var2 = nh0.a;
                        a81Var2.b(a81Var2.a.a, 6, "generateContent exception" + e.toString());
                        strV = BuildConfig.FLAVOR;
                        j = length;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            } catch (Exception e4) {
                e = e4;
                str = method;
                length = 0;
            }
        }
        sb.append(str.toUpperCase());
        sb.append("\n");
        if (accept == null) {
            accept = BuildConfig.FLAVOR;
        }
        sb.append(accept);
        sb.append("\n");
        if (contentType == null) {
            contentType = BuildConfig.FLAVOR;
        }
        sb.append(contentType);
        sb.append("\n");
        sb.append(j == 0 ? BuildConfig.FLAVOR : Long.valueOf(j));
        sb.append("\n");
        sb.append(jCurrentTimeMillis);
        sb.append("\n");
        if (TextUtils.isEmpty(strV)) {
            strV = BuildConfig.FLAVOR;
        }
        sb.append(strV);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder();
        try {
            URI uri = new URI(url);
            sb2.append(uri.getPath());
            if (!TextUtils.isEmpty(uri.getQuery())) {
                String query = uri.getQuery();
                HashMap map = new HashMap();
                String[] strArrSplit = query.split("&");
                int length2 = strArrSplit.length;
                int i = 0;
                while (i < length2) {
                    String str2 = strArrSplit[i];
                    int iIndexOf = str2.indexOf("=");
                    String[] strArr = strArrSplit;
                    try {
                        map.put(URLDecoder.decode(str2.substring(0, iIndexOf), "UTF-8"), URLDecoder.decode(str2.substring(iIndexOf + 1), "UTF-8"));
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    i++;
                    strArrSplit = strArr;
                }
                int i2 = 0;
                try {
                    ArrayList arrayList = new ArrayList(map.entrySet());
                    Collections.sort(arrayList, new rs(3));
                    StringBuilder sb3 = new StringBuilder();
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        Map.Entry entry = (Map.Entry) obj;
                        if (!BuildConfig.FLAVOR.equals(entry.getKey())) {
                            String str3 = (String) entry.getKey();
                            String str4 = (String) entry.getValue();
                            sb3.append(str3);
                            sb3.append("=");
                            sb3.append(str4);
                            sb3.append("&");
                        }
                    }
                    if (sb3.length() > 0) {
                        sb3.deleteCharAt(sb3.length() - 1);
                    }
                    string2 = sb3.toString();
                } catch (Exception unused3) {
                    string2 = null;
                }
                if (!TextUtils.isEmpty(string2)) {
                    sb2.append("?");
                    sb2.append(string2);
                }
            }
            string = sb2.toString();
        } catch (URISyntaxException e6) {
            e6.printStackTrace();
            string = BuildConfig.FLAVOR;
        }
        sb.append(string);
        nh0.a.a(sb.toString());
        String string3 = sb.toString();
        try {
            Mac mac = Mac.getInstance(algorithm.name());
            mac.init(new SecretKeySpec(Base64.decode(key, 2), algorithm.name()));
            strEncodeToString = Base64.encodeToString(mac.doFinal(string3.getBytes(Charset.forName("UTF-8"))), 2);
        } catch (Exception e7) {
            e7.printStackTrace();
            a81 a81Var3 = nh0.a;
            a81Var3.b(a81Var3.a.a, 6, e7);
        }
        String str5 = jCurrentTimeMillis + "|" + requestBean.getKey().getKeyVersion() + "|" + strEncodeToString;
        nh0.a.a("x-tr-signature: ".concat(str5));
        return str5;
    }

    public static boolean t(Context context) {
        try {
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            return powerManager != null && powerManager.isScreenOn();
        } catch (Exception unused) {
        }
    }

    public static boolean u(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return u(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00df  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0125  */
    /* JADX WARN: Code duplicated, block: B:55:0x012d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:62:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0173, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r1) == false) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList v(android.view.View r8, java.util.List r9, int r10, int r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am2.v(android.view.View, java.util.List, int, int, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList w(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    public static Type x(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return x(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return x(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class y(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) y(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return y(((WildcardType) type).getUpperBounds()[0]);
        }
        uq1.i("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static kk1 z(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        e.g(ck1.r(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new kk1(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }
}
