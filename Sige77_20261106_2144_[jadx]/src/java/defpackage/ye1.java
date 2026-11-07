package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class ye1 {
    public static final iz2 a = new iz2(4);
    public static final iz2 b = new iz2(5);
    public static final int[] c = {-1, -1, -2, -1, -1, -1};
    public static final int[] d = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] e = {-1, -1, -3, -1, -2, -1, 1, 0, 2};
    public static final r41 f = new r41(14);
    public static String g = "";
    public static nk1 h;

    public static void A(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        yv2.N(iArr, iArr3);
        u(iArr3, iArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            yv2.N(iArr2, iArr3);
            u(iArr3, iArr2);
        }
    }

    public static void B(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        p(jArr, jArr3);
        v(jArr3, jArr2);
        while (true) {
            i--;
            if (i <= 0) {
                return;
            }
            p(jArr2, jArr3);
            v(jArr3, jArr2);
        }
    }

    public static void C(int[] iArr, int[] iArr2, int[] iArr3) {
        if (yv2.Q(iArr, iArr2, iArr3) != 0) {
            long j = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                long j3 = j2 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j3;
                j2 = j3 >> 32;
            }
            long j4 = ((4294967295L & ((long) iArr3[2])) - 1) + j2;
            iArr3[2] = (int) j4;
            if ((j4 >> 32) != 0) {
                kv.m(6, 3, iArr3);
            }
        }
    }

    public static int D(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void E(bo3 bo3Var) {
        if (G(bo3Var) || ((gm3) bo3Var).a == null) {
            Trace.beginSection(((gm3) bo3Var).c);
            H(bo3Var);
        } else {
            E(((gm3) bo3Var).a);
            H(bo3Var);
        }
    }

    public static void F(bo3 bo3Var) {
        if (G(bo3Var) || ((gm3) bo3Var).a == null) {
            Trace.endSection();
            Trace.endSection();
        } else {
            Trace.endSection();
            F(((gm3) bo3Var).a);
        }
    }

    public static boolean G(bo3 bo3Var) {
        return ((gm3) bo3Var).e != Thread.currentThread();
    }

    public static void H(bo3 bo3Var) {
        String strSubstring = ((gm3) bo3Var).d;
        AtomicReference atomicReference = vm3.a;
        if (strSubstring.length() > 127) {
            strSubstring = strSubstring.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    public static boolean I(byte b2) {
        return b2 > -65;
    }

    public static vc2 a(FileChannel fileChannel) throws IOException {
        int i;
        td2 td2Var;
        int i2;
        byte[] bArr = new byte[128];
        long size = fileChannel.size();
        if (size < 22) {
            td2Var = null;
            break;
        }
        long jMax = Math.max(0L, (size > 65557 ? size - 65557 : 0L) - 106);
        long j = size - 128;
        loop3: while (true) {
            if (j < jMax) {
                td2Var = null;
                break;
            }
            if (j < 0) {
                int i3 = (int) (-j);
                Arrays.fill(bArr, 0, i3, (byte) 0);
                i = i3;
            } else {
                i = 0;
            }
            long j2 = j;
            c(fileChannel, j < 0 ? 0L : j, bArr, i, 128 - i);
            for (int i4 = 106; i4 >= 0; i4--) {
                if (bArr[i4] == 80 && bArr[i4 + 1] == 75 && bArr[i4 + 2] == 5 && bArr[i4 + 3] == 6) {
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    int iE = gb2.e(bArr, i4 + 20) & 65535;
                    long j3 = j2 + ((long) i4);
                    if (j3 + 22 + ((long) iE) == size) {
                        td2Var = new td2();
                        td2Var.i = td2.w;
                        td2Var.v = j3;
                        td2Var.a = gb2.e(bArr, i4 + 4) & 65535;
                        td2Var.b = gb2.e(bArr, i4 + 6) & 65535;
                        td2Var.c = gb2.e(bArr, i4 + 8) & 65535;
                        td2Var.d = gb2.e(bArr, i4 + 10) & 65535;
                        td2Var.e = ((long) gb2.c(bArr, i4 + 12)) & 4294967295L;
                        td2Var.f = ((long) gb2.c(bArr, i4 + 16)) & 4294967295L;
                        if (iE <= 0) {
                            break loop3;
                        }
                        byte[] bArr2 = new byte[iE];
                        td2Var.i = bArr2;
                        c(fileChannel, td2Var.v + 22, bArr2, 0, iE);
                        break loop3;
                    }
                }
            }
            j = j2 - 106;
        }
        if (td2Var == null) {
            return null;
        }
        long j4 = td2Var.f;
        if (j4 < 32) {
            return new vc2(null, td2Var);
        }
        byte[] bArr3 = new byte[24];
        c(fileChannel, j4 - 24, bArr3, 0, 24);
        ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
        long jH = gb2.h(bArr3, 0);
        long jH2 = gb2.h(bArr3, 8);
        long jH3 = gb2.h(bArr3, 16);
        if (jH2 != 2334950737559900225L || jH3 != 3617552046287187010L) {
            return new vc2(null, td2Var);
        }
        int i5 = (int) (8 + jH);
        long j5 = i5;
        long j6 = td2Var.f - j5;
        if (i5 < 32 || j6 < 0) {
            return new vc2(null, td2Var);
        }
        if (j5 > 20971520) {
            return new vc2(null, td2Var);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i5 - 24);
        byteBufferAllocate.order(byteOrder2);
        long j7 = j6;
        int i6 = 0;
        while (byteBufferAllocate.hasRemaining() && (i2 = fileChannel.read(byteBufferAllocate, j7)) != -1) {
            j7 += (long) i2;
            i6 += i2;
        }
        if (i6 != byteBufferAllocate.capacity() || ((ByteBuffer) byteBufferAllocate.flip()).getLong() != jH) {
            return new vc2(null, td2Var);
        }
        xc2 xc2Var = new xc2(j6);
        while (byteBufferAllocate.remaining() >= 12) {
            long j8 = byteBufferAllocate.getLong();
            int i7 = byteBufferAllocate.getInt();
            int i8 = (int) (j8 - 4);
            if (i8 < 0 || i8 > byteBufferAllocate.remaining()) {
                break;
            }
            byte[] bArr4 = new byte[i8];
            byteBufferAllocate.get(bArr4, 0, i8);
            int length = bArr4.length;
            byte[] bArr5 = new byte[length + 12];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr5).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putLong(length + 4).putInt(i7);
            byteBufferOrder.put(bArr4);
            Integer numValueOf = Integer.valueOf(i7);
            pv2 pv2Var = new pv2();
            pv2Var.a = bArr5;
            wc2 wc2Var = new wc2(numValueOf, pv2Var);
            ArrayList arrayList = xc2Var.b;
            ListIterator listIterator = arrayList.listIterator();
            while (true) {
                if (!listIterator.hasNext()) {
                    arrayList.add(wc2Var);
                    break;
                }
                if (((wc2) listIterator.next()).a.intValue() == i7) {
                    listIterator.set(wc2Var);
                    break;
                }
            }
        }
        return new vc2(xc2Var, td2Var);
    }

    public static void b(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            FileChannel channel = fileInputStream.getChannel();
            FileChannel channel2 = fileOutputStream.getChannel();
            vc2 vc2VarA = a(channel);
            channel.position(0L);
            if (vc2VarA == null) {
                d(channel, channel2, 0L, channel.size());
                fileInputStream.close();
                fileOutputStream.close();
                return;
            }
            td2 td2Var = vc2VarA.a;
            xc2 xc2Var = vc2VarA.b;
            if (xc2Var != null) {
                Iterator it = xc2Var.b.iterator();
                while (it.hasNext()) {
                    if (((wc2) it.next()).a.intValue() == 987894612) {
                        it.remove();
                    }
                }
            } else {
                td2Var.getClass();
                td2Var.i = td2.w;
            }
            if (xc2Var != null) {
                d(channel, channel2, 0L, xc2Var.a);
                for (ByteBuffer byteBuffer : xc2Var.d()) {
                    while (byteBuffer.hasRemaining()) {
                        channel2.write(byteBuffer);
                    }
                }
                long j = td2Var.f;
                d(channel, channel2, j, td2Var.v - j);
            } else {
                d(channel, channel2, 0L, td2Var.v);
            }
            ByteBuffer byteBufferC = td2Var.c(xc2Var != null ? xc2Var.c() + xc2Var.a : td2Var.f);
            while (byteBufferC.hasRemaining()) {
                channel2.write(byteBufferC);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (Throwable th) {
            fileInputStream.close();
            fileOutputStream.close();
            throw th;
        }
    }

    public static void c(FileChannel fileChannel, long j, byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = fileChannel.read(byteBufferWrap, ((long) i3) + j);
            if (i4 == -1) {
                return;
            } else {
                i3 += i4;
            }
        }
    }

    public static void d(FileChannel fileChannel, FileChannel fileChannel2, long j, long j2) throws IOException {
        while (j2 > 0) {
            long j3 = j2;
            FileChannel fileChannel3 = fileChannel2;
            long j4 = j;
            long jTransferTo = fileChannel.transferTo(j4, j3, fileChannel3);
            long j5 = j4 + jTransferTo;
            fileChannel2 = fileChannel3;
            j2 = j3 - jTransferTo;
            j = j5;
        }
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void f(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = (4294967295L & ((long) iArr[2])) + 1 + j2;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            kv.K(6, 3, iArr);
        }
    }

    public static i51 g(JSONObject jSONObject) {
        float[] fArr;
        float[] fArr2;
        if (jSONObject == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("use_case");
            String string2 = jSONObject.getString("asset_uri");
            String strOptString = jSONObject.optString("rules_uri", null);
            int i = jSONObject.getInt("version_id");
            j51 j51Var = j51.a;
            JSONArray jSONArray = jSONObject.getJSONArray("thresholds");
            Set set = mt.a;
            if (set.contains(j51.class)) {
                fArr2 = null;
            } else {
                try {
                    if (set.contains(j51Var) || jSONArray == null) {
                        fArr = null;
                        fArr2 = fArr;
                    } else {
                        try {
                            fArr = new float[jSONArray.length()];
                            int length = jSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                try {
                                    String string3 = jSONArray.getString(i2);
                                    string3.getClass();
                                    fArr[i2] = Float.parseFloat(string3);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            mt.a(j51Var, th);
                            fArr = null;
                        }
                        fArr2 = fArr;
                    }
                } catch (Throwable th2) {
                    mt.a(j51.class, th2);
                    fArr2 = null;
                }
            }
            string.getClass();
            string2.getClass();
            return new i51(string, string2, strOptString, i, fArr2);
        } catch (Exception unused2) {
            return null;
        }
    }

    public static final void h(CoroutineContext coroutineContext) {
        ws0 ws0Var = (ws0) coroutineContext.get(k42.c);
        if (ws0Var != null && !ws0Var.isActive()) {
            throw ws0Var.getCancellationException();
        }
    }

    public static void i(i51 i51Var, ArrayList arrayList) {
        File[] fileArrListFiles;
        String str = i51Var.a;
        int i = i51Var.d;
        File fileH = k42.h();
        if (fileH != null && (fileArrListFiles = fileH.listFiles()) != null && fileArrListFiles.length != 0) {
            String str2 = str + '_' + i;
            for (File file : fileArrListFiles) {
                String name = file.getName();
                name.getClass();
                if (d.j(name, str, false) && !d.j(name, str2, false)) {
                    file.delete();
                }
            }
        }
        String str3 = str + '_' + i;
        String str4 = i51Var.b;
        h51 h51Var = new h51(arrayList);
        File file2 = new File(k42.h(), str3);
        if (str4 == null || file2.exists()) {
            h51Var.e(file2);
        } else {
            new va0(str4, file2, h51Var).execute(new String[0]);
        }
    }

    public static q8 j(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        q8 q8VarD;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new q8(null, null, typedValue.data);
            }
            try {
                q8VarD = q8.d(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                q8VarD = null;
            }
            if (q8VarD != null) {
                return q8VarD;
            }
        }
        return new q8(null, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0027  */
    public static byte[] k(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo packageInfoB = la2.a(context).b(64, str);
        Signature[] signatureArr = packageInfoB.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfoB.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfoB.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static void m(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void n(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        m(jArr, jArr4);
        m(jArr2, jArr5);
        o(jArr4[0], jArr5[0], jArr3, 0);
        o(jArr4[1], jArr5[1], jArr3, 1);
        o(jArr4[2], jArr5[2], jArr3, 2);
        o(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        o(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        o(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        o(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        o(j, j3, jArr6, 0);
        o(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = (j5 ^ j6) ^ jArr3[3];
        jArr3[3] = j9;
        long j10 = (j6 ^ j7) ^ jArr3[4];
        jArr3[4] = j10;
        long j11 = j7 ^ jArr3[5];
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void o(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9)) ^ (jArr2[(i4 >>> 12) & 7] << 12);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void p(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
        bj0.k(4, jArr[2], jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static final n20 q(ws0 ws0Var, boolean z, bt0 bt0Var) {
        return ws0Var instanceof lt0 ? ((lt0) ws0Var).B(z, bt0Var) : ws0Var.invokeOnCompletion(bt0Var.q(), z, new at0(1, bt0Var, bt0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0));
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[12];
        yv2.H(iArr, iArr2, iArr4);
        u(iArr4, iArr3);
    }

    public static void s(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        n(jArr, jArr2, jArr4);
        v(jArr4, jArr3);
    }

    public static TypedArray t(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void u(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = ((long) iArr[9]) & 4294967295L;
        long j5 = (((long) iArr[10]) & 4294967295L) + j;
        long j6 = (((long) iArr[11]) & 4294967295L) + j2;
        long j7 = (((long) iArr[0]) & 4294967295L) + j5;
        int i = (int) j7;
        long j8 = (((long) iArr[1]) & 4294967295L) + j6 + (j7 >> 32);
        int i2 = (int) j8;
        iArr2[1] = i2;
        long j9 = j5 + j3;
        long j10 = j6 + j4;
        long j11 = (((long) iArr[2]) & 4294967295L) + j9 + (j8 >> 32);
        long j12 = j11 & 4294967295L;
        long j13 = (((long) iArr[3]) & 4294967295L) + j10 + (j11 >> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (j9 - j) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (j10 - j2) + (j14 >> 32);
        iArr2[5] = (int) j15;
        long j16 = j15 >> 32;
        long j17 = j12 + j16;
        long j18 = j16 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j18;
        long j19 = j18 >> 32;
        if (j19 != 0) {
            long j20 = j19 + (((long) i2) & 4294967295L);
            iArr2[1] = (int) j20;
            j17 += j20 >> 32;
        }
        iArr2[2] = (int) j17;
        if (((j17 >> 32) == 0 || kv.K(6, 3, iArr2) == 0) && !(iArr2[5] == -1 && yv2.B(iArr2, c))) {
            return;
        }
        f(iArr2);
    }

    public static void v(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j9 >>> 50) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static void w(int[] iArr, int i) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = (4294967295L & ((long) iArr[2])) + j2 + j4;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j == 0 || kv.K(6, 3, iArr) == 0) && !(iArr[5] == -1 && yv2.B(iArr, c))) {
            return;
        }
        f(iArr);
    }

    public static ot x(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return u2.a(intent);
        }
        int i = ot.a;
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
        if (bundleExtra == null) {
            return null;
        }
        String string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
        if (string != null) {
            return dw0.B(bundleExtra.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string);
        }
        e.g("Bundle was missing exception type.");
        return null;
    }

    public static qt y(String str, Intent intent) {
        String string;
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 34) {
            return u2.b(str, intent);
        }
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
        if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
            return null;
        }
        return jw.h(string, bundle);
    }

    public static void z(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[12];
        yv2.N(iArr, iArr3);
        u(iArr3, iArr2);
    }
}
