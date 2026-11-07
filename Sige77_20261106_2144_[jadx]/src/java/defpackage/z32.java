package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z32 implements uh3 {
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
    public static final long[] f = {-5270498306774157648L, 5270498306774195053L, 19634136210L};
    public static final w40 i = new w40(21);
    public static Context v;
    public final /* synthetic */ int a;

    public /* synthetic */ z32(int i2) {
        this.a = i2;
    }

    public static yn0 A(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return lo0.d;
        }
        if (length == 1) {
            return new bo0(objArr[0]);
        }
        if (length == 2) {
            return new bo0(objArr[0], objArr[1]);
        }
        boolean z = lo0.b;
        Object[] objArr2 = new Object[objArr.length];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            Object obj = objArr[i2];
            obj.getClass();
            objArr2[i2] = obj;
        }
        return new do0(objArr2, false);
    }

    public static void B(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j9 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j10 = (j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36))) ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j11 = j8 >>> 35;
        jArr2[0] = (((j9 ^ j11) ^ (j11 << 3)) ^ (j11 << 6)) ^ (j11 << 7);
        jArr2[1] = j10;
        jArr2[2] = 34359738367L & j8;
    }

    public static void C(int[] iArr, int[] iArr2) {
        yv2.N(iArr, iArr2);
        long j = 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        int i2 = 5;
        int i3 = 12;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            long j3 = ((long) iArr[i2 + 6]) & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i3 + 11] = ((int) (j4 >>> 33)) | (i4 << 31);
            int i6 = i3 - 2;
            iArr2[i3 + 10] = (int) (j4 >>> 1);
            i4 = (int) j4;
            if (i5 <= 0) {
                long j6 = j2 * j2;
                iArr2[12] = (int) j6;
                long j7 = ((long) iArr[7]) & j5;
                long j8 = ((long) iArr2[14]) & j5;
                long j9 = (j7 * j2) + ((((long) (i4 << 31)) & j5) | (j6 >>> 33));
                int i7 = (int) j9;
                iArr2[13] = (i7 << 1) | (((int) (j6 >>> 32)) & 1);
                long j10 = ((long) iArr[8]) & j5;
                long j11 = ((long) iArr2[15]) & j5;
                long j12 = ((long) iArr2[16]) & j5;
                long j13 = (j10 * j2) + j8 + (j9 >>> 32);
                int i8 = (int) j13;
                iArr2[14] = (i8 << 1) | (i7 >>> 31);
                long jQ = ck1.q(j10, j7, j13 >>> 32, j11);
                long j14 = j12 + (jQ >>> 32);
                long j15 = ((long) iArr[9]) & j5;
                long j16 = (((long) iArr2[17]) & j5) + (j14 >>> 32);
                long j17 = (((long) iArr2[18]) & j5) + (j16 >>> 32);
                long j18 = (j15 * j2) + (jQ & j5);
                int i9 = (int) j18;
                iArr2[15] = (i8 >>> 31) | (i9 << 1);
                long jQ2 = ck1.q(j15, j7, j18 >>> 32, j14 & j5);
                long jQ3 = ck1.q(j15, j10, jQ2 >>> 32, j16 & j5);
                long j19 = j17 + (jQ3 >>> 32);
                long j20 = jQ3 & j5;
                long j21 = ((long) iArr[10]) & j5;
                long j22 = (((long) iArr2[19]) & j5) + (j19 >>> 32);
                long j23 = j19 & j5;
                long j24 = (((long) iArr2[20]) & j5) + (j22 >>> 32);
                long j25 = j22 & j5;
                long j26 = (j21 * j2) + (jQ2 & j5);
                int i10 = (int) j26;
                iArr2[16] = (i10 << 1) | (i9 >>> 31);
                long jQ4 = ck1.q(j21, j7, j26 >>> 32, j20);
                long jQ5 = ck1.q(j21, j10, jQ4 >>> 32, j23);
                long jQ6 = ck1.q(j21, j15, jQ5 >>> 32, j25);
                long j27 = jQ5 & j5;
                long j28 = j24 + (jQ6 >>> 32);
                long j29 = jQ6 & j5;
                long j30 = ((long) iArr[11]) & j5;
                long j31 = (((long) iArr2[21]) & j5) + (j28 >>> 32);
                long j32 = j28 & j5;
                long j33 = (((long) iArr2[22]) & j5) + (j31 >>> 32);
                long j34 = j31 & j5;
                long j35 = (j30 * j2) + (jQ4 & j5);
                int i11 = (int) j35;
                iArr2[17] = (i10 >>> 31) | (i11 << 1);
                int i12 = i11 >>> 31;
                long jQ7 = ck1.q(j30, j7, j35 >>> 32, j27);
                long jQ8 = ck1.q(j30, j10, jQ7 >>> 32, j29);
                long jQ9 = ck1.q(j30, j15, jQ8 >>> 32, j32);
                long jQ10 = ck1.q(j30, j21, jQ9 >>> 32, j34);
                long j36 = j33 + (jQ10 >>> 32);
                int i13 = (int) jQ7;
                iArr2[18] = i12 | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) jQ8;
                iArr2[19] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) jQ9;
                iArr2[20] = i16 | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) jQ10;
                iArr2[21] = i18 | (i19 << 1);
                int i20 = i19 >>> 31;
                int i21 = (int) j36;
                iArr2[22] = i20 | (i21 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j36 >>> 32))) << 1) | (i21 >>> 31);
                int iF = yv2.f(iArr2, iArr2);
                int iE = yv2.e(18, 12, yv2.e(0, 6, 0, iArr2, iArr2) + iF, iArr2, iArr2) + iF;
                int[] iArr3 = new int[6];
                yv2.r(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                yv2.N(iArr3, iArr4);
                kv.i(24, kv.h0(12, 6, iArr4, iArr2) + iE, 18, iArr2);
                return;
            }
            i3 = i6;
            i2 = i5;
            j = j5;
        }
    }

    public static void D(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[6];
        v(jArr, jArr3);
        B(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            v(jArr2, jArr3);
            B(jArr3, jArr2);
        }
    }

    public static Class E(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }

    public static int F(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (i2 < length) {
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                try {
                    int length2 = str.length();
                    int i4 = 0;
                    while (i2 < length2) {
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 < 2048) {
                            i4 += (127 - cCharAt2) >>> 31;
                        } else {
                            i4 += 2;
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                                if (Character.codePointAt(str, i2) < 65536) {
                                    throw new ot2("Unpaired surrogate at index " + i2 + " of " + length2);
                                }
                                i2++;
                            }
                        }
                        i2++;
                    }
                    i3 += i4;
                    break;
                } catch (ot2 unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 >= length) {
            return i3;
        }
        e.g(ck1.t("UTF-8 length does not fit in int: ", ((long) i3) + 4294967296L));
        return 0;
    }

    public static int G(String str, byte[] bArr, int i2, int i3) {
        int i4;
        int length;
        int i5;
        char cCharAt;
        int length2 = str.length();
        int i6 = i2 + i3;
        int i7 = 0;
        while (i7 < length2 && (i5 = i7 + i2) < i6 && (cCharAt = str.charAt(i7)) < 128) {
            bArr[i5] = (byte) cCharAt;
            i7++;
        }
        if (i7 == length2) {
            return i2 + length2;
        }
        int i8 = i2 + i7;
        while (i7 < length2) {
            char cCharAt2 = str.charAt(i7);
            if (cCharAt2 < 128 && i8 < i6) {
                bArr[i8] = (byte) cCharAt2;
                i8++;
            } else if (cCharAt2 < 2048 && i8 <= i6 - 2) {
                int i9 = i8 + 1;
                bArr[i8] = (byte) ((cCharAt2 >>> 6) | 960);
                i8 += 2;
                bArr[i9] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i8 > i6 - 3) {
                    if (i8 <= i6 - 4) {
                        i7++;
                        if (i7 != str.length()) {
                            char cCharAt3 = str.charAt(i7);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i8] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i8 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i10 = i8 + 3;
                                bArr[i8 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i8 += 4;
                                bArr[i10] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes.length - i2 > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i2, bytes.length);
                        length = bytes.length;
                    } else {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i4 = i7 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i4)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length - i2 > i3) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i2, bytes2.length);
                        length = bytes2.length;
                    }
                    return i2 + length;
                }
                bArr[i8] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i8 + 2;
                bArr[i8 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i8 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i7++;
        }
        return i8;
    }

    public static String H(byte[] bArr, int i2, int i3) throws ks2 {
        if (i3 == 0) {
            return BuildConfig.FLAVOR;
        }
        if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                break;
            }
            i2++;
            cArr[i5] = (char) b2;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (b3 >= 0) {
                int i7 = i5 + 1;
                cArr[i5] = (char) b3;
                while (i6 < i4) {
                    byte b4 = bArr[i6];
                    if (b4 < 0) {
                        break;
                    }
                    i6++;
                    cArr[i7] = (char) b4;
                    i7++;
                }
                i5 = i7;
                i2 = i6;
            } else if (b3 < -32) {
                if (i6 >= i4) {
                    throw ks2.c();
                }
                i2 += 2;
                byte b5 = bArr[i6];
                int i8 = i5 + 1;
                if (b3 < -62 || dw0.J(b5)) {
                    throw ks2.c();
                }
                cArr[i5] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                i5 = i8;
            } else {
                if (b3 >= -16) {
                    if (i6 >= i4 - 2) {
                        throw ks2.c();
                    }
                    byte b6 = bArr[i6];
                    int i9 = i2 + 3;
                    byte b7 = bArr[i2 + 2];
                    i2 += 4;
                    byte b8 = bArr[i9];
                    int i10 = i5 + 1;
                    if (!dw0.J(b6)) {
                        if ((((b6 + 112) + (b3 << 28)) >> 30) == 0 && !dw0.J(b7) && !dw0.J(b8)) {
                            int i11 = ((b6 & 63) << 12) | ((b3 & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                            cArr[i5] = (char) ((i11 >>> 10) + 55232);
                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                            i5 += 2;
                        }
                    }
                    throw ks2.c();
                }
                if (i6 >= i4 - 1) {
                    throw ks2.c();
                }
                int i12 = i2 + 2;
                byte b9 = bArr[i6];
                i2 += 3;
                byte b10 = bArr[i12];
                int i13 = i5 + 1;
                if (dw0.J(b9) || ((b3 == -32 && b9 < -96) || ((b3 == -19 && b9 >= -96) || dw0.J(b10)))) {
                    throw ks2.c();
                }
                cArr[i5] = (char) (((b9 & 63) << 6) | ((b3 & 15) << 12) | (b10 & 63));
                i5 = i13;
            }
        }
        return new String(cArr, 0, i5);
    }

    public static qt2 I(Object obj) {
        if (obj == null) {
            return qt2.P;
        }
        if (obj instanceof String) {
            return new vt2((String) obj);
        }
        if (obj instanceof Double) {
            return new ep2((Double) obj);
        }
        if (obj instanceof Long) {
            return new ep2(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new ep2(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new jn2((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                e.g("Invalid value type");
                return null;
            }
            lm2 lm2Var = new lm2();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                lm2Var.l(lm2Var.i(), I(it.next()));
            }
            return lm2Var;
        }
        hs2 hs2Var = new hs2();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            qt2 qt2VarI = I(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                hs2Var.a((String) string, qt2VarI);
            }
        }
        return hs2Var;
    }

    public static uh3 J(th3 th3Var) {
        ox1 ox1Var = th3Var.g;
        wh3 wh3Var = new wh3(((tr3) ox1Var.a).b());
        try {
            Provider providerB = ea.B();
            if (providerB == null) {
                throw new GeneralSecurityException("Conscrypt not available");
            }
            Mac.getInstance("AESCMAC", providerB);
            return new f91(14, wh3Var, new rc2(((tr3) ox1Var.a).b(), providerB), false);
        } catch (GeneralSecurityException unused) {
            return wh3Var;
        }
    }

    public static qt2 K(h73 h73Var) {
        if (h73Var == null) {
            return qt2.O;
        }
        int iB = h73Var.B() - 1;
        if (iB == 1) {
            return h73Var.v() ? new vt2(h73Var.w()) : qt2.V;
        }
        if (iB == 2) {
            return h73Var.z() ? new ep2(Double.valueOf(h73Var.A())) : new ep2(null);
        }
        if (iB == 3) {
            return h73Var.x() ? new jn2(Boolean.valueOf(h73Var.y())) : new jn2(null);
        }
        if (iB != 4) {
            e.g("Unknown type found. Cannot convert entity");
            return null;
        }
        List listT = h73Var.t();
        ArrayList arrayList = new ArrayList();
        Iterator it = listT.iterator();
        while (it.hasNext()) {
            arrayList.add(K((h73) it.next()));
        }
        return new rt2(arrayList, h73Var.u());
    }

    public static boolean L(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return true;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                i2 = i4;
            } else if (b2 < -32) {
                if (i4 >= i3 || b2 < -62) {
                    return false;
                }
                i2 += 2;
                if (bArr[i4] > -65) {
                    return false;
                }
            } else if (b2 < -16) {
                if (i4 >= i3 - 1) {
                    return false;
                }
                int i5 = i2 + 2;
                byte b3 = bArr[i4];
                if (b3 > -65) {
                    return false;
                }
                if (b2 == -32 && b3 < -96) {
                    return false;
                }
                if (b2 == -19 && b3 >= -96) {
                    return false;
                }
                i2 += 3;
                if (bArr[i5] > -65) {
                    return false;
                }
            } else {
                if (i4 >= i3 - 2) {
                    return false;
                }
                int i6 = i2 + 2;
                byte b4 = bArr[i4];
                if (b4 > -65) {
                    return false;
                }
                if ((((b4 + 112) + (b2 << 28)) >> 30) != 0) {
                    return false;
                }
                int i7 = i2 + 3;
                if (bArr[i6] > -65) {
                    return false;
                }
                i2 += 4;
                if (bArr[i7] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public static void c(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 != bArr.length; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 != iArr.length; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0248  */
    public static void f(gh ghVar, int i2, a52 a52Var, int i3, jj jjVar) throws oa2 {
        int i4;
        int i5;
        boolean zG;
        int i6;
        int i7;
        byte[][] bArr = (byte[][]) jjVar.d;
        int i8 = jjVar.b;
        int i9 = jjVar.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = b[0].length;
        m(0, 0, jjVar);
        int i10 = i8 - length;
        m(i10, 0, jjVar);
        m(0, i10, jjVar);
        l(0, 7, jjVar);
        int i11 = i8 - 8;
        l(i11, 7, jjVar);
        l(0, i11, jjVar);
        n(7, 0, jjVar);
        int i12 = i9 - 8;
        n(i12, 0, jjVar);
        int i13 = i9 - 7;
        n(7, i13, jjVar);
        if (jjVar.a(8, i12) == 0) {
            throw new oa2();
        }
        jjVar.b(8, i12, 1);
        int i14 = a52Var.a;
        if (i14 < 2) {
            i4 = 0;
        } else {
            i4 = 0;
            int[] iArr = d[i14 - 1];
            int length2 = iArr.length;
            int i15 = 0;
            while (i15 < length2) {
                int i16 = iArr[i15];
                if (i16 >= 0) {
                    int length3 = iArr.length;
                    int i17 = 0;
                    while (i17 < length3) {
                        int i18 = iArr[i17];
                        if (i18 >= 0 && w(jjVar.a(i18, i16))) {
                            int i19 = i18 - 2;
                            int i20 = i16 - 2;
                            int i21 = 0;
                            while (true) {
                                if (i21 >= 5) {
                                    break;
                                }
                                int[] iArr2 = c[i21];
                                int i22 = i21;
                                int i23 = 0;
                                for (int i24 = 5; i23 < i24; i24 = 5) {
                                    int i25 = i23;
                                    jjVar.b(i19 + i23, i20 + i22, iArr2[i25]);
                                    i23 = i25 + 1;
                                    iArr = iArr;
                                }
                                i21 = i22 + 1;
                            }
                        }
                        i17++;
                        i15 = i15;
                        i8 = i8;
                        iArr = iArr;
                    }
                }
                i15++;
                i8 = i8;
                iArr = iArr;
            }
        }
        int i26 = i8;
        int i27 = 8;
        while (i27 < i11) {
            int i28 = i27 + 1;
            int i29 = i28 % 2;
            if (w(jjVar.a(i27, 6))) {
                jjVar.b(i27, 6, i29);
            }
            if (w(jjVar.a(6, i27))) {
                jjVar.b(6, i27, i29);
            }
            i27 = i28;
        }
        gh ghVar2 = new gh();
        if (i3 < 0 || i3 >= 8) {
            throw new oa2("Invalid mask pattern");
        }
        if (i2 == 1) {
            i5 = 1;
        } else if (i2 == 2) {
            i5 = i4;
        } else if (i2 == 3) {
            i5 = 3;
        } else {
            if (i2 != 4) {
                throw null;
            }
            i5 = 2;
        }
        int i30 = (i5 << 3) | i3;
        ghVar2.d(i30, 5);
        ghVar2.d(g(i30, 1335), 10);
        gh ghVar3 = new gh();
        ghVar3.d(21522, 15);
        if (ghVar2.b != ghVar3.b) {
            e.g("Sizes don't match");
            return;
        }
        int i31 = i4;
        while (true) {
            int[] iArr3 = ghVar2.a;
            if (i31 >= iArr3.length) {
                break;
            }
            iArr3[i31] = iArr3[i31] ^ ghVar3.a[i31];
            i31++;
        }
        if (ghVar2.b != 15) {
            throw new oa2("should not happen but we got: " + ghVar2.b);
        }
        int i32 = i4;
        while (true) {
            int i33 = ghVar2.b;
            if (i32 >= i33) {
                break;
            }
            boolean zG2 = ghVar2.g((i33 - 1) - i32);
            int[] iArr4 = e[i32];
            jjVar.c(iArr4[i4], iArr4[1], zG2);
            if (i32 < 8) {
                jjVar.c((i26 - i32) - 1, 8, zG2);
            } else {
                jjVar.c(8, (i32 - 8) + i13, zG2);
            }
            i32++;
        }
        if (i14 >= 7) {
            gh ghVar4 = new gh();
            ghVar4.d(i14, 6);
            ghVar4.d(g(i14, 7973), 12);
            if (ghVar4.b != 18) {
                throw new oa2("should not happen but we got: " + ghVar4.b);
            }
            int i34 = 17;
            for (int i35 = i4; i35 < 6; i35++) {
                for (int i36 = i4; i36 < 3; i36++) {
                    boolean zG3 = ghVar4.g(i34);
                    i34--;
                    int i37 = (i9 - 11) + i36;
                    jjVar.c(i35, i37, zG3);
                    jjVar.c(i37, i35, zG3);
                }
            }
        }
        int i38 = i26 - 1;
        int i39 = i9 - 1;
        int i40 = i4;
        int i41 = -1;
        while (i38 > 0) {
            if (i38 == 6) {
                i38--;
            }
            while (i39 >= 0 && i39 < i9) {
                for (int i42 = i4; i42 < 2; i42++) {
                    int i43 = i38 - i42;
                    if (w(jjVar.a(i43, i39))) {
                        if (i40 < ghVar.b) {
                            zG = ghVar.g(i40);
                            i40++;
                        } else {
                            zG = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i6 = i39 + i43;
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case 1:
                                    i7 = i39 & 1;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                    i7 = i43 % 3;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                    i7 = (i39 + i43) % 3;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.LONG_FIELD_NUMBER /* 4 */:
                                    i7 = ((i43 / 3) + (i39 / 2)) & 1;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.STRING_FIELD_NUMBER /* 5 */:
                                    int i44 = i39 * i43;
                                    i7 = (i44 % 3) + (i44 & 1);
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                    int i45 = i39 * i43;
                                    i7 = ((i45 % 3) + (i45 & 1)) & 1;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                    i6 = ((i39 * i43) % 3) + ((i39 + i43) & 1);
                                    i7 = i6 & 1;
                                    if (i7 == 0) {
                                        zG = !zG;
                                    }
                                    break;
                                default:
                                    e.g("Invalid mask pattern: ".concat(String.valueOf(i3)));
                                    return;
                            }
                        }
                        jjVar.c(i43, i39, zG);
                    }
                }
                i39 += i41;
            }
            i41 = -i41;
            i39 += i41;
            i38 -= 2;
        }
        if (i40 == ghVar.b) {
            return;
        }
        throw new oa2("Not all bits consumed: " + i40 + '/' + ghVar.b);
    }

    public static int g(int i2, int i3) {
        if (i3 == 0) {
            e.g("0 polynomial");
            return 0;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i2 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i4) {
            iNumberOfLeadingZeros2 ^= i3 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i4);
        }
        return iNumberOfLeadingZeros2;
    }

    public static ArrayList h(AbstractList abstractList, HttpURLConnection httpURLConnection, d90 d90Var) {
        abstractList.getClass();
        ArrayList arrayList = new ArrayList(ko.h(abstractList));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(new pk0((mk0) it.next(), httpURLConnection, new FacebookRequestError(d90Var)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fb A[Catch: JSONException -> 0x0113, TryCatch #0 {JSONException -> 0x0113, blocks: (B:5:0x0017, B:7:0x001d, B:9:0x0027, B:11:0x002b, B:14:0x0038, B:16:0x0042, B:19:0x004c, B:22:0x0056, B:25:0x005e, B:27:0x0064, B:30:0x006e, B:33:0x0078, B:46:0x00df, B:35:0x008a, B:38:0x0097, B:40:0x00a0, B:44:0x00b7, B:52:0x00f3, B:54:0x00fb, B:55:0x0101), top: B:93:0x0017 }] */
    public static pk0 i(mk0 mk0Var, HttpURLConnection httpURLConnection, Object obj, Object obj2) throws JSONException {
        FacebookRequestError facebookRequestError;
        AccessToken accessToken;
        AccessToken accessToken2;
        int iOptInt;
        String strOptString;
        String strOptString2;
        boolean zOptBoolean;
        int iOptInt2;
        boolean z;
        String str;
        String str2;
        Object obj3 = obj;
        if (obj3 instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj3;
            try {
                if (jSONObject.has("code")) {
                    int i2 = jSONObject.getInt("code");
                    Object objR = h42.r(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
                    if (objR != null && (objR instanceof JSONObject)) {
                        if (((JSONObject) objR).has("error")) {
                            JSONObject jSONObject2 = (JSONObject) h42.r((JSONObject) objR, "error", null);
                            String strOptString3 = jSONObject2 != null ? jSONObject2.optString("type", null) : null;
                            String strOptString4 = jSONObject2 != null ? jSONObject2.optString("message", null) : null;
                            int iOptInt3 = jSONObject2 != null ? jSONObject2.optInt("code", -1) : -1;
                            int iOptInt4 = jSONObject2 != null ? jSONObject2.optInt("error_subcode", -1) : -1;
                            strOptString2 = jSONObject2 != null ? jSONObject2.optString("error_user_msg", null) : null;
                            strOptString = jSONObject2 != null ? jSONObject2.optString("error_user_title", null) : null;
                            zOptBoolean = jSONObject2 != null ? jSONObject2.optBoolean("is_transient", false) : false;
                            iOptInt2 = iOptInt4;
                            z = true;
                            str = strOptString3;
                            iOptInt = iOptInt3;
                            str2 = strOptString4;
                        } else if (((JSONObject) objR).has("error_code") || ((JSONObject) objR).has("error_msg") || ((JSONObject) objR).has("error_reason")) {
                            String strOptString5 = ((JSONObject) objR).optString("error_reason", null);
                            String strOptString6 = ((JSONObject) objR).optString("error_msg", null);
                            iOptInt = ((JSONObject) objR).optInt("error_code", -1);
                            strOptString = null;
                            strOptString2 = null;
                            zOptBoolean = false;
                            iOptInt2 = ((JSONObject) objR).optInt("error_subcode", -1);
                            z = true;
                            str = strOptString5;
                            str2 = strOptString6;
                        } else {
                            strOptString = null;
                            strOptString2 = null;
                            z = false;
                            zOptBoolean = false;
                            iOptInt2 = -1;
                            iOptInt = -1;
                            str = null;
                            str2 = null;
                        }
                        if (z) {
                            facebookRequestError = new FacebookRequestError(i2, iOptInt, iOptInt2, str, str2, strOptString, strOptString2, obj2, (d90) null, zOptBoolean);
                        } else {
                            if (i2 <= 299) {
                            }
                            if (jSONObject.has("body")) {
                            }
                            facebookRequestError = new FacebookRequestError(i2, -1, -1, (String) null, (String) null, (String) null, (String) null, obj2, (d90) null, false);
                        }
                    } else if (i2 <= 299 || 200 > i2) {
                        if (jSONObject.has("body")) {
                        }
                        facebookRequestError = new FacebookRequestError(i2, -1, -1, (String) null, (String) null, (String) null, (String) null, obj2, (d90) null, false);
                    } else {
                        facebookRequestError = null;
                    }
                } else {
                    facebookRequestError = null;
                }
            } catch (JSONException unused) {
            }
            if (facebookRequestError != null) {
                Log.e("pk0", facebookRequestError.toString());
                if (facebookRequestError.b == 190 && (accessToken = mk0Var.a) != null) {
                    Date date = AccessToken.Y;
                    if (Intrinsics.areEqual(accessToken, aj0.t())) {
                        if (facebookRequestError.c != 493) {
                            aj0.N(null);
                        } else {
                            AccessToken accessTokenT = aj0.t();
                            if (accessTokenT != null && !new Date().after(accessTokenT.a) && (accessToken2 = (AccessToken) co.v.n().c) != null) {
                                aj0.N(new AccessToken(accessToken2.e, accessToken2.v, accessToken2.w, accessToken2.b, accessToken2.c, accessToken2.d, accessToken2.f, new Date(), new Date(), accessToken2.W));
                            }
                        }
                    }
                }
                return new pk0(mk0Var, httpURLConnection, facebookRequestError);
            }
            Object objR2 = h42.r(jSONObject, "body", "FACEBOOK_NON_JSON_RESULT");
            if (objR2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) objR2;
                return new pk0(mk0Var, httpURLConnection, jSONObject3.toString(), jSONObject3);
            }
            if (objR2 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objR2;
                String string = jSONArray.toString();
                mk0Var.getClass();
                string.getClass();
                return new pk0(mk0Var, httpURLConnection, null, jSONArray, null);
            }
            obj3 = JSONObject.NULL;
            obj3.getClass();
        }
        if (obj3 == JSONObject.NULL) {
            return new pk0(mk0Var, httpURLConnection, obj3.toString(), null);
        }
        throw new d90("Got unexpected object type in response, class: ".concat(obj3.getClass().getSimpleName()));
    }

    public static ArrayList j(InputStream inputStream, HttpURLConnection httpURLConnection, ok0 ok0Var) throws JSONException, IOException {
        Object obj;
        ok0Var.getClass();
        String strF = h42.F(inputStream);
        gp1 gp1Var = i01.c;
        synchronized (i90.b) {
        }
        Object objNextValue = new JSONTokener(strF).nextValue();
        objNextValue.getClass();
        int size = ok0Var.c.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            mk0 mk0Var = (mk0) ok0Var.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e2) {
                arrayList.add(new pk0(mk0Var, httpURLConnection, new FacebookRequestError(e2)));
                obj = objNextValue;
            } catch (JSONException e3) {
                arrayList.add(new pk0(mk0Var, httpURLConnection, new FacebookRequestError(e3)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                int length = jSONArray2.length();
                for (int i2 = 0; i2 < length; i2++) {
                    mk0 mk0Var2 = (mk0) ok0Var.get(i2);
                    try {
                        Object obj2 = ((JSONArray) obj).get(i2);
                        obj2.getClass();
                        arrayList.add(i(mk0Var2, httpURLConnection, obj2, objNextValue));
                    } catch (d90 e4) {
                        arrayList.add(new pk0(mk0Var2, httpURLConnection, new FacebookRequestError(e4)));
                    } catch (JSONException e5) {
                        arrayList.add(new pk0(mk0Var2, httpURLConnection, new FacebookRequestError(e5)));
                    }
                }
                gp1 gp1Var2 = i01.c;
                synchronized (i90.b) {
                }
                return arrayList;
            }
        }
        throw new d90("Unexpected number of results");
    }

    public static void l(int i2, int i3, jj jjVar) throws oa2 {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!w(jjVar.a(i5, i3))) {
                throw new oa2();
            }
            jjVar.b(i5, i3, 0);
        }
    }

    public static void m(int i2, int i3, jj jjVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = b[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                jjVar.b(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static void n(int i2, int i3, jj jjVar) throws oa2 {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!w(jjVar.a(i2, i5))) {
                throw new oa2();
            }
            jjVar.b(i2, i5, 0);
        }
    }

    public static Context p() {
        Context context = v;
        if (context != null) {
            return context;
        }
        uq1.h("u should init first");
        return null;
    }

    public static r40 q(String str) {
        wa2 wa2Var;
        wa2 wa2Var2;
        wa2 wa2Var3;
        wa2 wa2Var4;
        wa2 wa2Var5;
        wa2 wa2Var6;
        t40 t40Var;
        wa2 wa2Var7 = (wa2) hv.a.get(ju1.a(str));
        va2 va2VarB = wa2Var7 == null ? null : wa2Var7.b();
        if (va2VarB == null) {
            try {
                wa2 wa2Var8 = (wa2) hv.c.get(new q(str));
                va2VarB = wa2Var8 == null ? null : wa2Var8.b();
            } catch (IllegalArgumentException unused) {
            }
            if (va2VarB == null) {
                q qVar = (q) ta2.a.get(ju1.a(str));
                va2VarB = (qVar == null || (wa2Var6 = (wa2) ta2.b.get(qVar)) == null) ? null : wa2Var6.b();
                if (va2VarB == null) {
                    q qVar2 = (q) sk1.a.get(ju1.a(str));
                    va2VarB = (qVar2 == null || (wa2Var5 = (wa2) sk1.b.get(qVar2)) == null) ? null : wa2Var5.b();
                }
                if (va2VarB == null) {
                    Hashtable hashtable = i61.a;
                    char[] charArray = str.toCharArray();
                    boolean z = false;
                    for (int i2 = 0; i2 != charArray.length; i2++) {
                        char c2 = charArray[i2];
                        if ('a' <= c2 && 'z' >= c2) {
                            charArray[i2] = (char) (c2 - ' ');
                            z = true;
                        }
                    }
                    q qVar3 = (q) hashtable.get(z ? new String(charArray) : str);
                    va2VarB = (qVar3 == null || (wa2Var4 = (wa2) sk1.b.get(qVar3)) == null) ? null : wa2Var4.b();
                }
                if (va2VarB == null) {
                    q qVar4 = (q) qw1.a.get(ju1.a(str));
                    va2VarB = (qVar4 == null || (wa2Var3 = (wa2) qw1.b.get(qVar4)) == null) ? null : wa2Var3.b();
                }
                if (va2VarB == null) {
                    q qVar5 = (q) m.a.get(ju1.a(str));
                    va2VarB = (qVar5 == null || (wa2Var2 = (wa2) m.b.get(qVar5)) == null) ? null : wa2Var2.b();
                }
                if (va2VarB == null) {
                    q qVar6 = (q) gh0.a.get(ju1.a(str));
                    va2VarB = (qVar6 == null || (wa2Var = (wa2) gh0.b.get(qVar6)) == null) ? null : wa2Var.b();
                }
                if (va2VarB == null) {
                    try {
                        q qVar7 = new q(str);
                        wa2 wa2Var9 = (wa2) ta2.b.get(qVar7);
                        va2 va2VarB2 = wa2Var9 != null ? wa2Var9.b() : null;
                        if (va2VarB2 == null) {
                            wa2 wa2Var10 = (wa2) sk1.b.get(qVar7);
                            va2VarB2 = wa2Var10 == null ? null : wa2Var10.b();
                        }
                        if (va2VarB2 == null) {
                            wa2 wa2Var11 = (wa2) qw1.b.get(qVar7);
                            va2VarB2 = wa2Var11 != null ? wa2Var11.b() : null;
                        }
                        if (va2VarB2 == null) {
                            wa2 wa2Var12 = (wa2) m.b.get(qVar7);
                            va2VarB2 = wa2Var12 == null ? null : wa2Var12.b();
                        }
                        if (va2VarB2 == null) {
                            wa2 wa2Var13 = (wa2) gh0.b.get(qVar7);
                            va2VarB2 = wa2Var13 == null ? null : wa2Var13.b();
                        }
                        va2VarB = va2VarB2;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
        if (va2VarB == null) {
            return null;
        }
        m40 m40Var = va2VarB.b;
        ua2 ua2Var = va2VarB.c;
        synchronized (ua2Var) {
            try {
                if (((t40) ua2Var.d) == null) {
                    ua2Var.d = ua2Var.b.d(((zv) ua2Var.c).a).i();
                }
                t40Var = (t40) ua2Var.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        BigInteger bigInteger = va2VarB.d;
        r40 r40Var = new r40();
        r40Var.a = m40Var;
        r40Var.b = t40Var.i();
        r40Var.c = bigInteger;
        return r40Var;
    }

    public static int r(int[] iArr, int i2) {
        if (iArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ iArr[i2];
        }
    }

    public static int s(long[] jArr, int i2) {
        if (jArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            long j = jArr[i2];
            i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static void t(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (j2 >>> 46) ^ (jArr[2] << 18);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & 36028797018963967L;
        long j5 = j & 36028797018963967L;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & 36028797018963967L;
        long j10 = j6 & 36028797018963967L;
        long[] jArr4 = new long[10];
        u(j5, j10, jArr4, 0);
        u(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        u(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        u(j5 ^ j13, j10 ^ j14, jArr4, 6);
        u(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6];
        long j16 = jArr4[8] ^ j15;
        long j17 = jArr4[7];
        long j18 = j17 ^ jArr4[9];
        long j19 = (j16 << 1) ^ j15;
        long j20 = (j16 ^ (j18 << 1)) ^ j17;
        long j21 = jArr4[0];
        long j22 = jArr4[1];
        long j23 = (j22 ^ j21) ^ jArr4[4];
        long j24 = j22 ^ jArr4[5];
        long j25 = jArr4[2];
        long j26 = ((j19 ^ j21) ^ (j25 << 4)) ^ (j25 << 1);
        long j27 = jArr4[3];
        long j28 = (((j23 ^ j20) ^ (j27 << 4)) ^ (j27 << 1)) ^ (j26 >>> 55);
        long j29 = (j24 ^ j18) ^ (j28 >>> 55);
        long j30 = ((j26 & 36028797018963967L) >>> 1) ^ ((j28 & 1) << 54);
        long j31 = j30 ^ (j30 << 1);
        long j32 = j31 ^ (j31 << 2);
        long j33 = j32 ^ (j32 << 4);
        long j34 = j33 ^ (j33 << 8);
        long j35 = j34 ^ (j34 << 16);
        long j36 = (j35 ^ (j35 << 32)) & 36028797018963967L;
        long j37 = (((j28 & 36028797018963967L) >>> 1) ^ ((j29 & 1) << 54)) ^ (j36 >>> 54);
        long j38 = j37 ^ (j37 << 1);
        long j39 = j38 ^ (j38 << 2);
        long j40 = j39 ^ (j39 << 4);
        long j41 = j40 ^ (j40 << 8);
        long j42 = j41 ^ (j41 << 16);
        long j43 = 36028797018963967L & (j42 ^ (j42 << 32));
        long j44 = (j29 >>> 1) ^ (j43 >>> 54);
        long j45 = j44 ^ (j44 << 1);
        long j46 = j45 ^ (j45 << 2);
        long j47 = j46 ^ (j46 << 4);
        long j48 = j47 ^ (j47 << 8);
        long j49 = j48 ^ (j48 << 16);
        long j50 = j49 ^ (j49 << 32);
        jArr3[0] = j21;
        long j51 = (j23 ^ j36) ^ j25;
        jArr3[1] = j51;
        long j52 = ((j24 ^ j43) ^ j36) ^ j27;
        jArr3[2] = j52;
        long j53 = j43 ^ j50;
        jArr3[3] = j53;
        long j54 = j50 ^ jArr4[2];
        jArr3[4] = j54;
        long j55 = jArr4[3];
        jArr3[5] = j55;
        jArr3[0] = j21 ^ (j51 << 55);
        jArr3[1] = (j51 >>> 9) ^ (j52 << 46);
        jArr3[2] = (j52 >>> 18) ^ (j53 << 37);
        jArr3[3] = (j53 >>> 27) ^ (j54 << 28);
        jArr3[4] = (j54 >>> 36) ^ (j55 << 19);
        jArr3[5] = j55 >>> 45;
    }

    public static void u(long j, long j2, long[] jArr, int i2) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 3];
        long j8 = 0;
        int i3 = 47;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr[i2] = 36028797018963967L & j7;
        jArr[i2 + 1] = (j7 >>> 55) ^ (j8 << 9);
    }

    public static void v(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
        long j = jArr[2];
        jArr2[4] = bj0.j((int) j);
        jArr2[5] = ((long) bj0.l((int) (j >>> 32))) & 4294967295L;
    }

    public static boolean w(int i2) {
        return i2 == -1;
    }

    public static void x(int[] iArr, int[] iArr2, int[] iArr3) {
        yv2.H(iArr, iArr2, iArr3);
        long j = ((long) iArr2[6]) & 4294967295L;
        long j2 = ((long) iArr2[7]) & 4294967295L;
        long j3 = ((long) iArr2[8]) & 4294967295L;
        long j4 = ((long) iArr2[9]) & 4294967295L;
        long j5 = ((long) iArr2[10]) & 4294967295L;
        long j6 = ((long) iArr2[11]) & 4294967295L;
        long j7 = ((long) iArr[6]) & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i2 = 12;
        int i3 = 1;
        while (i3 < 6) {
            int i4 = i2 + 1;
            int i5 = i3;
            long j14 = ((long) iArr[6 + i3]) & 4294967295L;
            long j15 = j3;
            long j16 = (j14 * j) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j16;
            int i6 = i2 + 2;
            long j17 = (j14 * j2) + (((long) iArr3[i6]) & 4294967295L) + (j16 >>> 32);
            iArr3[i6] = (int) j17;
            int i7 = i2 + 3;
            long j18 = (j14 * j15) + (((long) iArr3[i7]) & 4294967295L) + (j17 >>> 32);
            iArr3[i7] = (int) j18;
            int i8 = i2 + 4;
            long j19 = (j14 * j4) + (((long) iArr3[i8]) & 4294967295L) + (j18 >>> 32);
            iArr3[i8] = (int) j19;
            int i9 = i2 + 5;
            long j20 = (j14 * j5) + (((long) iArr3[i9]) & 4294967295L) + (j19 >>> 32);
            iArr3[i9] = (int) j20;
            int i10 = i2 + 6;
            long j21 = (j14 * j6) + (((long) iArr3[i10]) & 4294967295L) + (j20 >>> 32);
            iArr3[i10] = (int) j21;
            iArr3[i2 + 7] = (int) (j21 >>> 32);
            i3 = i5 + 1;
            i2 = i4;
            j3 = j15;
        }
        int iF = yv2.f(iArr3, iArr3);
        int iE = yv2.e(18, 12, yv2.e(0, 6, 0, iArr3, iArr3) + iF, iArr3, iArr3) + iF;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = yv2.r(iArr, iArr, iArr4) != yv2.r(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        yv2.H(iArr4, iArr5, iArr6);
        kv.i(24, iE + (z ? kv.g(12, 6, iArr6, iArr3) : kv.h0(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static void y(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[6];
        t(jArr, jArr2, jArr4);
        B(jArr4, jArr3);
    }

    public static final mk0 z(AccessToken accessToken, Uri uri, z72 z72Var) {
        uri.getClass();
        String path = uri.getPath();
        boolean zEqualsIgnoreCase = "file".equalsIgnoreCase(uri.getScheme());
        nm0 nm0Var = nm0.b;
        if (zEqualsIgnoreCase && path != null) {
            Parcelable parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", parcelableResourceWithMimeType);
            return new mk0(accessToken, "me/staging_resources", bundle, nm0Var, z72Var);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new d90("The image Uri must be either a file:// or content:// Uri");
        }
        Parcelable parcelableResourceWithMimeType2 = new GraphRequest.ParcelableResourceWithMimeType(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", parcelableResourceWithMimeType2);
        return new mk0(accessToken, "me/staging_resources", bundle2, nm0Var, z72Var);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[LOOP:2: B:23:0x0055->B:26:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:81:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x012d A[SYNTHETIC] */
    public final String k(byte[] bArr, int i2, int i3) throws ur0 {
        int i4;
        byte b2;
        int i5;
        byte b3;
        byte b4;
        byte b5;
        switch (this.a) {
            case 0:
                if ((i2 | i3 | ((bArr.length - i2) - i3)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                int i6 = i2 + i3;
                char[] cArr = new char[i3];
                int i7 = 0;
                while (i2 < i6) {
                    byte b6 = bArr[i2];
                    if (b6 < 0) {
                        while (i2 < i6) {
                            i4 = i2 + 1;
                            b2 = bArr[i2];
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                cArr[i7] = (char) b2;
                                while (i4 < i6) {
                                    b3 = bArr[i4];
                                    if (b3 >= 0) {
                                        i4++;
                                        cArr[i5] = (char) b3;
                                        i5++;
                                    } else {
                                        i7 = i5;
                                        i2 = i4;
                                    }
                                }
                                i7 = i5;
                                i2 = i4;
                            } else if (b2 < -32) {
                                if (i4 < i6) {
                                    throw ur0.a();
                                }
                                i2 += 2;
                                byte b7 = bArr[i4];
                                int i8 = i7 + 1;
                                if (b2 >= -62 || r93.E(b7)) {
                                    throw ur0.a();
                                }
                                cArr[i7] = (char) ((b7 & 63) | ((b2 & 31) << 6));
                                i7 = i8;
                            } else {
                                if (b2 >= -16) {
                                    if (i4 < i6 - 2) {
                                        throw ur0.a();
                                    }
                                    b5 = bArr[i4];
                                    int i9 = i2 + 3;
                                    byte b8 = bArr[i2 + 2];
                                    i2 += 4;
                                    byte b9 = bArr[i9];
                                    int i10 = i7 + 1;
                                    if (!r93.E(b5)) {
                                        if ((((b5 + 112) + (b2 << 28)) >> 30) != 0 && !r93.E(b8) && !r93.E(b9)) {
                                            int i11 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b8 & 63) << 6) | (b9 & 63);
                                            cArr[i7] = (char) ((i11 >>> 10) + 55232);
                                            cArr[i10] = (char) ((i11 & 1023) + 56320);
                                            i7 += 2;
                                        }
                                    }
                                    throw ur0.a();
                                }
                                if (i4 < i6 - 1) {
                                    throw ur0.a();
                                }
                                int i12 = i2 + 2;
                                b4 = bArr[i4];
                                i2 += 3;
                                byte b10 = bArr[i12];
                                int i13 = i7 + 1;
                                if (!r93.E(b4) || ((b2 == -32 && b4 < -96) || ((b2 == -19 && b4 >= -96) || r93.E(b10)))) {
                                    throw ur0.a();
                                }
                                cArr[i7] = (char) (((b4 & 63) << 6) | ((b2 & 15) << 12) | (b10 & 63));
                                i7 = i13;
                            }
                        }
                        return new String(cArr, 0, i7);
                    }
                    i2++;
                    cArr[i7] = (char) b6;
                    i7++;
                }
                while (i2 < i6) {
                    i4 = i2 + 1;
                    b2 = bArr[i2];
                    if (b2 < 0) {
                        if (b2 < -32) {
                            if (i4 < i6) {
                                throw ur0.a();
                            }
                            i2 += 2;
                            byte b11 = bArr[i4];
                            int i14 = i7 + 1;
                            if (b2 >= -62) {
                            }
                            throw ur0.a();
                        }
                        if (b2 >= -16) {
                            if (i4 < i6 - 1) {
                                throw ur0.a();
                            }
                            int i15 = i2 + 2;
                            b4 = bArr[i4];
                            i2 += 3;
                            byte b12 = bArr[i15];
                            int i16 = i7 + 1;
                            if (r93.E(b4)) {
                            }
                            throw ur0.a();
                        }
                        if (i4 < i6 - 2) {
                            throw ur0.a();
                        }
                        b5 = bArr[i4];
                        int i17 = i2 + 3;
                        byte b13 = bArr[i2 + 2];
                        i2 += 4;
                        byte b14 = bArr[i17];
                        int i18 = i7 + 1;
                        if (!r93.E(b5)) {
                            if ((((b5 + 112) + (b2 << 28)) >> 30) != 0) {
                            }
                        }
                        throw ur0.a();
                    }
                    i5 = i7 + 1;
                    cArr[i7] = (char) b2;
                    while (i4 < i6) {
                        b3 = bArr[i4];
                        if (b3 >= 0) {
                            i4++;
                            cArr[i5] = (char) b3;
                            i5++;
                        } else {
                            i7 = i5;
                            i2 = i4;
                        }
                    }
                    i7 = i5;
                    i2 = i4;
                }
                return new String(cArr, 0, i7);
            default:
                Charset charset = dr0.a;
                String str = new String(bArr, i2, i3, charset);
                if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i2, i3 + i2))) {
                    throw ur0.a();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:71:0x0184  */
    /* JADX WARN: Code duplicated, block: B:73:0x0187  */
    /* JADX WARN: Code duplicated, block: B:77:0x0199  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01bd  */
    public final int o(String str, byte[] bArr, int i2, int i3) {
        int i4;
        char cCharAt;
        int i5;
        char cCharAt2;
        int i6;
        char cCharAt3;
        char c2 = 2048;
        char c3 = 55296;
        switch (this.a) {
            case 0:
                int length = str.length();
                int i7 = i3 + i2;
                int i8 = 0;
                while (i8 < length) {
                    int i9 = i8 + i2;
                    if (i9 >= i7 || (cCharAt2 = str.charAt(i8)) >= 128) {
                        if (i8 == length) {
                            return i2 + length;
                        }
                        i4 = i2 + i8;
                        while (i8 < length) {
                            cCharAt = str.charAt(i8);
                            if (cCharAt >= 128 && i4 < i7) {
                                bArr[i4] = (byte) cCharAt;
                                i4++;
                            } else if (cCharAt >= 2048 && i4 <= i7 - 2) {
                                int i10 = i4 + 1;
                                bArr[i4] = (byte) ((cCharAt >>> 6) | 960);
                                i4 += 2;
                                bArr[i10] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i4 > i7 - 3) {
                                    if (i4 > i7 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i5 = i8 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i5)))) {
                                            throw new a42(i8, length);
                                        }
                                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt + " at index " + i4);
                                    }
                                    int i11 = i8 + 1;
                                    if (i11 != str.length()) {
                                        char cCharAt4 = str.charAt(i11);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i4] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i4 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i12 = i4 + 3;
                                            bArr[i4 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i4 += 4;
                                            bArr[i12] = (byte) ((codePoint & 63) | 128);
                                            i8 = i11;
                                        } else {
                                            i8 = i11;
                                        }
                                    }
                                    throw new a42(i8 - 1, length);
                                }
                                bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i4 + 2;
                                bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i4 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            }
                            i8++;
                        }
                        return i4;
                    }
                    bArr[i9] = (byte) cCharAt2;
                    i8++;
                }
                if (i8 == length) {
                    return i2 + length;
                }
                i4 = i2 + i8;
                while (i8 < length) {
                    cCharAt = str.charAt(i8);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i4 + 2;
                                bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i4 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                                int i15 = i4 + 2;
                                bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i4 += 3;
                                bArr[i15] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i4 + 2;
                            bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i4 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i4 + 2;
                            bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i4 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i4 + 2;
                            bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i4 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                            int i19 = i4 + 2;
                            bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i4 += 3;
                            bArr[i19] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i4 + 2;
                        bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i4 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i4] = (byte) ((cCharAt >>> '\f') | 480);
                        int i111 = i4 + 2;
                        bArr[i4 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i4 += 3;
                        bArr[i111] = (byte) ((cCharAt & '?') | 128);
                    }
                    i8++;
                }
                return i4;
            default:
                long j = i2;
                long j2 = ((long) i3) + j;
                int length2 = str.length();
                if (length2 > i3 || bArr.length - i3 < i2) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length2 - 1) + " at index " + (i2 + i3));
                }
                int i20 = 0;
                while (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                    i32.j(bArr, j, (byte) cCharAt3);
                    i20++;
                    j++;
                }
                if (i20 != length2) {
                    while (i20 < length2) {
                        char cCharAt5 = str.charAt(i20);
                        if (cCharAt5 < 128 && j < j2) {
                            i32.j(bArr, j, (byte) cCharAt5);
                            j++;
                        } else if (cCharAt5 >= c2 || j > j2 - 2) {
                            int i21 = i20;
                            if ((cCharAt5 >= c3 && 57343 >= cCharAt5) || j > j2 - 3) {
                                if (j > j2 - 4) {
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i6 = i21 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i6)))) {
                                        throw new a42(i21, length2);
                                    }
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt5 + " at index " + j);
                                }
                                i20 = i21 + 1;
                                if (i20 != length2) {
                                    char cCharAt6 = str.charAt(i20);
                                    if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                        int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                        i32.j(bArr, j, (byte) ((codePoint2 >>> 18) | 240));
                                        i32.j(bArr, j + 1, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                        long j3 = j + 3;
                                        i32.j(bArr, j + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                        j += 4;
                                        i32.j(bArr, j3, (byte) ((codePoint2 & 63) | 128));
                                    }
                                } else {
                                    i20 = i21;
                                }
                                throw new a42(i20 - 1, length2);
                            }
                            i32.j(bArr, j, (byte) ((cCharAt5 >>> '\f') | 480));
                            long j4 = j + 2;
                            i32.j(bArr, j + 1, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                            j += 3;
                            i32.j(bArr, j4, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i21;
                        } else {
                            long j5 = j + 1;
                            i32.j(bArr, j, (byte) ((cCharAt5 >>> 6) | 960));
                            j += 2;
                            i32.j(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                            i20 = i20;
                        }
                        i20++;
                        c2 = 2048;
                        c3 = 55296;
                    }
                }
                return (int) j;
        }
    }
}
