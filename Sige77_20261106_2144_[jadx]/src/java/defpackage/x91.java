package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.system.Os;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class x91 {
    public static final w40 a = new w40(5);
    public static final int[] b = {-4553, -2, -1, -1, -1, -1};
    public static final int[] c = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};
    public static final int[] d = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void A(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (kv.Q(iArr2, length)) {
            e.g("'x' cannot be 0");
            return;
        }
        if (kv.P(iArr2, length)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArr4 = new int[length];
        System.arraycopy(iArr2, 0, iArr4, 0, length);
        int[] iArr5 = new int[length];
        iArr5[0] = 1;
        int iZ = (1 & iArr4[0]) == 0 ? z(length, 0, iArr, iArr4, iArr5) : 0;
        if (kv.P(iArr4, length)) {
            if (iZ < 0) {
                kv.b(iArr.length, iArr5, iArr, iArr3);
                return;
            } else {
                System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                return;
            }
        }
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        int[] iArr7 = new int[length];
        int i = length;
        int iZ2 = 0;
        while (true) {
            int i2 = i - 1;
            if (iArr4[i2] == 0 && iArr6[i2] == 0) {
                i--;
            } else if (kv.C(i, iArr4, iArr6)) {
                kv.i0(i, iArr6, iArr4);
                iZ = z(i, (kv.i0(length, iArr7, iArr5) - iZ2) + iZ, iArr, iArr4, iArr5);
                if (kv.P(iArr4, i)) {
                    if (iZ < 0) {
                        kv.b(iArr.length, iArr5, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            } else {
                kv.i0(i, iArr4, iArr6);
                iZ2 = z(i, (kv.i0(length, iArr5, iArr7) - iZ) + iZ2, iArr, iArr6, iArr7);
                if (kv.P(iArr6, i)) {
                    if (iZ2 < 0) {
                        kv.b(iArr.length, iArr7, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr7, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            }
        }
    }

    public static final d11 B(d11 d11Var, int i) {
        d11 d11Var2;
        d11 d11Var3 = null;
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            d11Var.getClass();
            int[] iArr = d11Var.a;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = (i4 - i) + 1;
            d11 d11Var4 = new d11(new int[]{i3, i6, i5});
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var4.c;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i2;
                while (i8 < i5) {
                    int i9 = i2;
                    while (i9 < i6) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        int i13 = i2;
                        while (i13 < i) {
                            d11Var2 = d11Var3;
                            try {
                                fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                                i13++;
                                d11Var3 = d11Var2;
                            } catch (Throwable th) {
                                th = th;
                                mt.a(x91.class, th);
                                return d11Var2;
                            }
                        }
                        i9++;
                        i2 = 0;
                    }
                    i8++;
                    i2 = 0;
                }
                i7++;
                i2 = 0;
            }
            return d11Var4;
        } catch (Throwable th2) {
            th = th2;
            d11Var2 = d11Var3;
        }
    }

    public static final d11 C(d11 d11Var, d11 d11Var2) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            d11Var.getClass();
            d11Var2.getClass();
            int i = d11Var.a[0];
            int[] iArr = d11Var2.a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            d11 d11Var3 = new d11(new int[]{i, i3});
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var2.c;
            float[] fArr3 = d11Var3.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return d11Var3;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static void D(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        yv2.H(iArr, iArr2, iArr4);
        H(iArr4, iArr3);
    }

    public static void E(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        w(jArr, jArr2, jArr4);
        I(jArr4, jArr3);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    public static ie0 F(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        int i2;
        ?? r4;
        long j;
        Throwable th;
        ?? r5;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            L(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), re1.b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), re1.c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            L(xmlResourceParser);
                        }
                        arrayList.add(new ke0(i5, i7, resourceId2, string7, string6, z));
                    } else {
                        L(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new je0((ke0[]) arrayList.toArray(new ke0[0]));
        }
        List listG = G(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), re1.d);
                    int i9 = integer;
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(i3);
                        String string9 = typedArrayObtainAttributes3.getString(1);
                        String string10 = typedArrayObtainAttributes3.getString(i);
                        if (string8 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                L(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r4 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                be0 be0Var = new be0(string, string2, string8, listG, string9, string10);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r4;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(be0Var);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r5 = r4;
                            if (r5 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r5 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r5).close();
                                    throw th;
                                }
                                if (r5 instanceof ExecutorService) {
                                    r5.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r5;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r5 = r4;
                    if (r5 != 0) {
                        throw th;
                    }
                    if (!(r5 instanceof AutoCloseable)) {
                        ((AutoCloseable) r5).close();
                        throw th;
                    }
                    if (r5 instanceof ExecutorService) {
                        r5.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r5;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                L(xmlResourceParser);
                integer = i2;
                integer2 = integer2;
                string5 = string5;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer2;
        String str = string5;
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new le0(arrayList2, i11, i10, str);
        }
        if (string3 == null) {
            e.g("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new be0(string, string2, string3, listG, null, null));
        if (string4 != null) {
            arrayList2.add(new be0(string, string2, string4, listG, null, null));
        }
        return new le0(arrayList2, i11, i10, str);
    }

    public static List G(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static void H(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        int i = (int) j2;
        iArr2[0] = i;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = (4553 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i2 = (int) j4;
        iArr2[1] = i2;
        long j5 = ((long) iArr[8]) & 4294967295L;
        long j6 = (4553 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i3 = (int) j6;
        iArr2[2] = i3;
        long j7 = ((long) iArr[9]) & 4294967295L;
        long j8 = (4553 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i4 = (int) j8;
        iArr2[3] = i4;
        long j9 = ((long) iArr[10]) & 4294967295L;
        long j10 = (4553 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[11]) & 4294967295L;
        long j12 = (4553 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = (j12 >>> 32) + j11;
        long j14 = j13 & 4294967295L;
        long j15 = (4553 * j14) + (((long) i) & 4294967295L);
        iArr2[0] = (int) j15;
        long j16 = j13 >>> 32;
        long j17 = (4553 * j16) + j14 + (((long) i2) & 4294967295L) + (j15 >>> 32);
        iArr2[1] = (int) j17;
        long j18 = j16 + (((long) i3) & 4294967295L) + (j17 >>> 32);
        iArr2[2] = (int) j18;
        long j19 = (j18 >>> 32) + (((long) i4) & 4294967295L);
        iArr2[3] = (int) j19;
        if (((j19 >>> 32) == 0 ? 0 : kv.L(6, 4, iArr2)) != 0 || (iArr2[5] == -1 && yv2.B(iArr2, b))) {
            kv.d(6, 4553, iArr2);
        }
    }

    public static void I(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void J(int[] iArr, int i) {
        if (i == 0) {
            if (iArr[5] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i) & 4294967295L;
        long j2 = (4553 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? kv.L(6, 3, iArr) : 0) == 0) {
            if (iArr[5] == -1 || !yv2.B(iArr, b)) {
                return;
            }
        }
        kv.d(6, 4553, iArr);
    }

    public static final void K(d11 d11Var) {
        if (mt.a.contains(x91.class)) {
            return;
        }
        try {
            d11Var.getClass();
            float[] fArr = d11Var.c;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < 0.0f) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            mt.a(x91.class, th);
        }
    }

    public static void L(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final void M(d11 d11Var) {
        if (mt.a.contains(x91.class)) {
            return;
        }
        try {
            d11Var.getClass();
            int[] iArr = d11Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr = d11Var.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f = Float.MIN_VALUE;
                for (int i6 = i4; i6 < i5; i6++) {
                    float f2 = fArr[i6];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i7 = i4; i7 < i5; i7++) {
                    float fExp = (float) Math.exp(fArr[i7] - f);
                    fArr[i7] = fExp;
                    f3 += fExp;
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f3;
                    i4++;
                }
            }
        } catch (Throwable th) {
            mt.a(x91.class, th);
        }
    }

    public static void N(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        yv2.N(iArr, iArr3);
        H(iArr3, iArr2);
    }

    public static void O(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        yv2.N(iArr, iArr3);
        H(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            yv2.N(iArr2, iArr3);
            H(iArr3, iArr2);
        }
    }

    public static void P(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        y(jArr, jArr3);
        I(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            y(jArr2, jArr3);
            I(jArr3, jArr2);
        }
    }

    public static void Q(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yv2.Q(iArr, iArr2, iArr3) != 0) {
            kv.g0(6, 4553, iArr3);
        }
    }

    public static final d11 R(d11 d11Var) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            int[] iArr = d11Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            d11 d11Var2 = new d11(new int[]{i2, i});
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var2.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return d11Var2;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static final d11 S(d11 d11Var) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            int[] iArr = d11Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            d11 d11Var2 = new d11(new int[]{i3, i2, i});
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var2.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i5 * i) + (i6 * i * i2) + i4] = fArr[(i5 * i3) + (i4 * i2 * i3) + i6];
                    }
                }
            }
            return d11Var2;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static IOException T(nh3 nh3Var, Uri uri, IOException iOException, String str) {
        try {
            pi3 pi3Var = new pi3();
            pi3Var.a = true;
            File file = (File) nh3Var.a(uri, pi3Var);
            if (!file.exists()) {
                return Z(file, iOException, str);
            }
            if (file.isFile()) {
                if (file.canRead()) {
                    return file.canWrite() ? Z(file, iOException, str) : Z(file, iOException, str);
                }
                return file.canWrite() ? Z(file, iOException, str) : Z(file, iOException, str);
            }
            if (file.canRead()) {
                return file.canWrite() ? Z(file, iOException, str) : Z(file, iOException, str);
            }
            return file.canWrite() ? Z(file, iOException, str) : Z(file, iOException, str);
        } catch (IOException unused) {
            return new IOException(iOException);
        }
    }

    public static String U(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
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
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void V(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof hr2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.g(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3++;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.a(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:17)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:3)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:14)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:101)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:74)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:21)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.a(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:1)
    	at pw0.apply(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:44)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(r8-map-id-aad343ec47fab9fa63afc8805acf596533df8b907855dbc73f6099ef88603c1a:32)
     */
    public static void W(Object obj, Object obj2) {
        cs2 cs2Var = (cs2) obj;
        jt2 jt2Var = cs2Var.zzb;
        jt2 jt2Var2 = ((cs2) obj2).zzb;
        jt2 jt2Var3 = jt2.f;
        if (!jt2Var3.equals(jt2Var2)) {
            if (jt2Var3.equals(jt2Var)) {
                int i = jt2Var.a + jt2Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(jt2Var.b, i);
                System.arraycopy(jt2Var2.b, 0, iArrCopyOf, jt2Var.a, jt2Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(jt2Var.c, i);
                System.arraycopy(jt2Var2.c, 0, objArrCopyOf, jt2Var.a, jt2Var2.a);
                jt2Var = new jt2(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                jt2Var.getClass();
                if (!jt2Var2.equals(jt2Var3)) {
                    if (!jt2Var.e) {
                        uq1.k();
                        return;
                    }
                    int i2 = jt2Var.a + jt2Var2.a;
                    jt2Var.b(i2);
                    System.arraycopy(jt2Var2.b, 0, jt2Var.b, jt2Var.a, jt2Var2.a);
                    System.arraycopy(jt2Var2.c, 0, jt2Var.c, jt2Var.a, jt2Var2.a);
                    jt2Var.a = i2;
                }
            }
        }
        cs2Var.zzb = jt2Var;
    }

    public static boolean X(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int Y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof es2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += tr2.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static IOException Z(File file, IOException iOException, String str) {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            return b0(file, iOException, str);
        }
        if (!parentFile.exists()) {
            return b0(file, iOException, str);
        }
        if (parentFile.isDirectory()) {
            if (parentFile.canRead()) {
                return parentFile.canWrite() ? b0(file, iOException, str) : b0(file, iOException, str);
            }
            return parentFile.canWrite() ? b0(file, iOException, str) : b0(file, iOException, str);
        }
        if (parentFile.canRead()) {
            return parentFile.canWrite() ? b0(file, iOException, str) : b0(file, iOException, str);
        }
        return parentFile.canWrite() ? b0(file, iOException, str) : b0(file, iOException, str);
    }

    public static mi a(int i, ki kiVar, int i2) {
        if ((i2 & 2) != 0) {
            kiVar = ki.a;
        }
        if (i == -2) {
            if (kiVar != ki.a) {
                return new wq(1, kiVar);
            }
            nl.h.getClass();
            return new mi(ml.b);
        }
        if (i == -1) {
            if (kiVar == ki.a) {
                return new wq(1, ki.b);
            }
            e.g("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return kiVar == ki.a ? new mi(0) : new wq(1, kiVar);
        }
        if (i != Integer.MAX_VALUE) {
            return kiVar == ki.a ? new mi(i) : new wq(i, kiVar);
        }
        return new mi(Integer.MAX_VALUE);
    }

    public static void a0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof vr2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                tr2Var.getClass();
                tr2Var.d(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 8;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.h(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[SYNTHETIC] */
    public static String b(File file, byte[] bArr) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        Exception e;
        if (!file.exists() || !file.isFile()) {
            return BuildConfig.FLAVOR;
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[1024];
                        while (true) {
                            int i = fileInputStream2.read(bArr2);
                            if (i == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, i);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (byteArray.length == 0) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e2) {
                                cc2.c(e2.getMessage());
                            }
                            try {
                                byteArrayOutputStream.close();
                                return BuildConfig.FLAVOR;
                            } catch (IOException e3) {
                                cc2.c(e3.getMessage());
                                return BuildConfig.FLAVOR;
                            }
                        }
                        String str = new String(f(bArr, byteArray));
                        try {
                            fileInputStream2.close();
                        } catch (IOException e4) {
                            cc2.c(e4.getMessage());
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (IOException e5) {
                            cc2.c(e5.getMessage());
                        }
                        return str;
                    } catch (Exception e6) {
                        e = e6;
                        cc2.c(Log.getStackTraceString(e));
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException e7) {
                                cc2.c(e7.getMessage());
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (IOException e8) {
                            cc2.c(e8.getMessage());
                            throw th;
                        }
                    }
                } catch (Exception e9) {
                    e = e9;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            if (byteArrayOutputStream != null) {
                throw th;
            }
            byteArrayOutputStream.close();
            throw th;
        }
    }

    public static IOException b0(File file, IOException iOException, String str) {
        String strConcat;
        try {
            Locale locale = Locale.US;
            String str2 = " canonical[" + file.getCanonicalPath() + "] freeSpace[" + file.getFreeSpace() + "] protoName[" + str + "]";
            StringBuilder sb = new StringBuilder(str2.length() + 16);
            sb.append("Inoperable file:");
            sb.append(str2);
            strConcat = sb.toString();
            try {
                String str3 = " mode[" + Os.stat(file.getCanonicalPath()).st_mode + "]";
                StringBuilder sb2 = new StringBuilder(strConcat.length() + str3.length());
                sb2.append(strConcat);
                sb2.append(str3);
                strConcat = sb2.toString();
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            strConcat = "Inoperable file:".concat(" failed");
        }
        return new IOException(strConcat, iOException);
    }

    public static String c(byte[] bArr, String str) {
        try {
            if (bArr != null) {
                return new String(Base64.encode(e(bArr, str), 2));
            }
            cc2.c("encryptEventData password is null");
            return null;
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }

    public static void c0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += tr2.r(((Integer) list.get(i3)).intValue());
        }
        tr2Var.o(iR);
        while (i2 < list.size()) {
            tr2Var.j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void d(File file, String str, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                byte[] bArrE = e(bArr, str);
                if (bArrE == null || bArrE.length == 0) {
                    throw new Exception("encode failed p = " + rq0.o(bArr) + ", m = " + str.length());
                }
                if (!file.exists() && !file.createNewFile()) {
                    throw new IOException("createNewFile failed");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                FileOutputStream fileOutputStream3 = fileOutputStream2;
                fileOutputStream3.write(bArrE);
                fileOutputStream3.flush();
                try {
                    fileOutputStream3.close();
                } catch (IOException unused) {
                }
            } catch (Exception e) {
                cc2.c(Log.getStackTraceString(e));
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static void d0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 4;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.b(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static byte[] e(byte[] bArr, String str) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKeySpec, new IvParameterSpec(ze2.n));
        try {
            return cipher.doFinal(str.getBytes("UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static int e0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof es2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += tr2.r(((Integer) list.get(i)).intValue());
        }
        return iR;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretKeySpec, new IvParameterSpec(ze2.n));
        try {
            return cipher.doFinal(bArr2);
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            throw e;
        }
    }

    public static void f0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof os2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 8;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.h(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static String g(byte[] bArr, String str) {
        try {
            if (bArr != null) {
                return new String(f(bArr, Base64.decode(str, 2)));
            }
            cc2.c("decryptEventData password is null");
            return null;
        } catch (Exception e) {
            cc2.c(Log.getStackTraceString(e));
            return null;
        }
    }

    public static int g0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof os2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += tr2.r(((Long) list.get(i)).longValue());
        }
        return iR;
    }

    public static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void h0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof zr2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                tr2Var.getClass();
                tr2Var.c(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 4;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.b(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static final void i(d11 d11Var, d11 d11Var2) {
        if (mt.a.contains(x91.class)) {
            return;
        }
        try {
            d11Var.getClass();
            d11Var2.getClass();
            int[] iArr = d11Var.a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var2.c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = (i5 * i3) + (i4 * i2 * i3) + i6;
                        fArr[i7] = fArr[i7] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            mt.a(x91.class, th);
        }
    }

    public static int i0(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof es2)) {
                int iT = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iT += tr2.t((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iT;
            }
            y00.n(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static void j0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.k(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += tr2.r(((Integer) list.get(i3)).intValue());
        }
        tr2Var.o(iR);
        while (i2 < list.size()) {
            tr2Var.j(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static final d11 k(d11[] d11VarArr) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            int i = d11VarArr[0].a[0];
            int i2 = 0;
            for (d11 d11Var : d11VarArr) {
                i2 += d11Var.a[1];
            }
            d11 d11Var2 = new d11(new int[]{i, i2});
            float[] fArr = d11Var2.c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (d11 d11Var3 : d11VarArr) {
                    float[] fArr2 = d11Var3.c;
                    int i5 = d11Var3.a[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return d11Var2;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static int k0(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof os2)) {
                int iR = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iR += tr2.r((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iR;
            }
            y00.n(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static final d11 l(d11 d11Var, d11 d11Var2) {
        d11 d11Var3;
        d11 d11Var4 = null;
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            d11Var.getClass();
            d11Var2.getClass();
            int[] iArr = d11Var.a;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = d11Var2.a;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            d11 d11Var5 = new d11(new int[]{i2, i6, i7});
            float[] fArr = d11Var.c;
            float[] fArr2 = d11Var5.c;
            float[] fArr3 = d11Var2.c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f = 0.0f;
                        d11Var3 = d11Var4;
                        int i11 = i;
                        while (i11 < i5) {
                            while (i < i4) {
                                try {
                                    f = (fArr[((i11 + i10) * i4) + (i3 * i4 * i8) + i] * fArr3[(((i11 * i4) + i) * i7) + i9]) + f;
                                    i++;
                                } catch (Throwable th) {
                                    th = th;
                                    mt.a(x91.class, th);
                                    return d11Var3;
                                }
                            }
                            i11++;
                            i = 0;
                        }
                        fArr2[(i10 * i7) + (i6 * i7 * i8) + i9] = f;
                        i10++;
                        d11Var4 = d11Var3;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return d11Var5;
        } catch (Throwable th2) {
            th = th2;
            d11Var3 = null;
        }
    }

    public static void l0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof os2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += tr2.r(((Long) list.get(i3)).longValue());
        }
        tr2Var.o(iR);
        while (i2 < list.size()) {
            tr2Var.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static float[] m(float[] fArr, int i) {
        if (i < 0) {
            sm0.a();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static int m0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof es2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iT = 0;
        for (int i = 0; i < size; i++) {
            iT += tr2.t(((Integer) list.get(i)).intValue());
        }
        return iT;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static lb1[] n(String str) {
        int i;
        String strTrim;
        float[] fArrM;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrM = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrM = m(fArr, i5);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    sm0.m(ts.k("error in parsing \"", strTrim, "\""), e);
                                    return null;
                                }
                            }
                            arrayList.add(new lb1(strTrim.charAt(i2), fArrM));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrM = new float[i2];
                } else {
                    fArrM = new float[i2];
                }
                arrayList.add(new lb1(strTrim.charAt(i2), fArrM));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new lb1(str.charAt(i3), new float[0]));
        }
        return (lb1[]) arrayList.toArray(new lb1[i]);
    }

    public static void n0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.c(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 4;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.b(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int o0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof os2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iR = 0;
        for (int i = 0; i < size; i++) {
            iR += tr2.r(((Long) list.get(i)).longValue());
        }
        return iR;
    }

    public static final Object p(long j, gs gsVar) {
        if (j <= 0) {
            return Unit.a;
        }
        pk pkVar = new pk(1, sr0.b(gsVar));
        pkVar.u();
        if (j < Long.MAX_VALUE) {
            u(pkVar.e).a(j, pkVar);
        }
        Object objS = pkVar.s();
        return objS == ft.a ? objS : Unit.a;
    }

    public static void p0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof os2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            boolean z2 = tr2.b;
            i3 += 8;
        }
        tr2Var.o(i3);
        while (i2 < list.size()) {
            tr2Var.h(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static final d11 q(d11 d11Var, d11 d11Var2, d11 d11Var3) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            d11Var.getClass();
            d11Var2.getClass();
            d11Var3.getClass();
            int i = d11Var.a[0];
            int i2 = d11Var3.a[0];
            d11 d11VarC = C(d11Var, d11Var2);
            float[] fArr = d11Var3.c;
            float[] fArr2 = d11VarC.c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return d11VarC;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static void q0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                tr2Var.q(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iT = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iT += tr2.t((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        tr2Var.o(iT);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            tr2Var.o((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static final d11 r(String[] strArr, d11 d11Var) {
        if (mt.a.contains(x91.class)) {
            return null;
        }
        try {
            d11Var.getClass();
            int length = strArr.length;
            int i = d11Var.a[1];
            d11 d11Var2 = new d11(new int[]{length, 128, i});
            float[] fArr = d11Var2.c;
            float[] fArr2 = d11Var.c;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArrM = k42.b.m(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, iArrM[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return d11Var2;
        } catch (Throwable th) {
            mt.a(x91.class, th);
            return null;
        }
    }

    public static void r0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof os2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                tr2Var.l(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iR += tr2.r((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        tr2Var.o(iR);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            tr2Var.m((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    public static final void s(d11 d11Var) {
        boolean z;
        int i;
        if (mt.a.contains(x91.class)) {
            return;
        }
        try {
            d11Var.getClass();
            int[] iArr = d11Var.a;
            int i2 = 1;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i3 = 1;
            for (int i4 = 1; i4 < length; i4++) {
                i3 *= d11Var.a[i4];
            }
            int i5 = d11Var.a[0];
            int[] iArr2 = {i5, i3};
            d11Var.a = iArr2;
            IntRange intRange = new IntRange(1, 1, 1);
            int i6 = ((a) intRange).b;
            int i7 = ((a) intRange).c;
            if (i7 > 0) {
                if (1 <= i6) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (1 >= i6) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = i6;
            }
            while (z) {
                if (i2 != i6) {
                    i = i2 + i7;
                } else {
                    if (!z) {
                        throw new NoSuchElementException();
                    }
                    i = i2;
                    z = false;
                }
                i5 *= iArr2[i2];
                i2 = i;
            }
            float[] fArr = new float[i5];
            System.arraycopy(d11Var.c, 0, fArr, 0, Math.min(d11Var.b, i5));
            d11Var.c = fArr;
            d11Var.b = i5;
        } catch (Throwable th) {
            mt.a(x91.class, th);
        }
    }

    public static void s0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof es2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.q(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iT = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT += tr2.t(((Integer) list.get(i3)).intValue());
        }
        tr2Var.o(iT);
        while (i2 < list.size()) {
            tr2Var.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static Object t(Class cls, String str) throws Exception {
        try {
            return new rc2().i(cls, str);
        } catch (Exception unused) {
            throw new Exception("error json:".concat(str));
        }
    }

    public static void t0(int i, List list, pv2 pv2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        tr2 tr2Var = (tr2) pv2Var.a;
        if (list instanceof os2) {
            ur.a();
            return;
        }
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                tr2Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        tr2Var.p(i, 2);
        int iR = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR += tr2.r(((Long) list.get(i3)).longValue());
        }
        tr2Var.o(iR);
        while (i2 < list.size()) {
            tr2Var.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static final h00 u(CoroutineContext coroutineContext) {
        h00 h00Var = coroutineContext.get(d.M);
        h00 h00Var2 = h00Var instanceof h00 ? h00Var : null;
        return h00Var2 == null ? wy.a : h00Var2;
    }

    public static final Object v(d61 d61Var, fc1 fc1Var, Serializable serializable) {
        d61Var.getClass();
        fc1Var.getClass();
        Object objCopyOf = d61Var.a.get(fc1Var);
        if (objCopyOf instanceof byte[]) {
            byte[] bArr = (byte[]) objCopyOf;
            objCopyOf = Arrays.copyOf(bArr, bArr.length);
        }
        return objCopyOf == null ? serializable : objCopyOf;
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = j4 & 144115188075855871L;
        long[] jArr4 = new long[6];
        x(j3, j6, jArr4, 0);
        x(j2, j5, jArr4, 2);
        x(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void x(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3)) ^ (jArr2[(i3 >>> 6) & 7] << 6);
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void y(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
    }

    public static int z(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        int i3;
        int length = iArr.length;
        int i4 = 0;
        while (true) {
            i3 = iArr2[0];
            if (i3 != 0) {
                break;
            }
            int i5 = i;
            int i6 = 0;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    int i7 = iArr2[i5];
                    iArr2[i5] = i6;
                    i6 = i7;
                }
            }
            i4 += 32;
        }
        int i8 = 0;
        while ((i3 & 1) == 0) {
            i3 >>>= 1;
            i8++;
        }
        if (i8 > 0) {
            int i9 = 0;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                int i10 = iArr2[i];
                iArr2[i] = (i9 << (-i8)) | (i10 >>> i8);
                i9 = i10;
            }
            i4 += i8;
        }
        for (int i11 = 0; i11 < i4; i11++) {
            if ((iArr3[0] & 1) != 0) {
                i2 = (i2 < 0 ? kv.h(length, iArr, iArr3) : kv.i0(length, iArr, iArr3)) + i2;
            }
            int i12 = i2;
            int i13 = length;
            while (true) {
                i13--;
                if (i13 >= 0) {
                    int i14 = iArr3[i13];
                    iArr3[i13] = (i12 << 31) | (i14 >>> 1);
                    i12 = i14;
                }
            }
        }
        return i2;
    }

    public abstract void j(yo yoVar, Set set);

    public abstract int o(yo yoVar);
}
