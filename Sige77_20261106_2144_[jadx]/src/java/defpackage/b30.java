package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.a;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class b30 {
    public static final z91 f = z91.a(gy.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final z91 g = new z91("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, z91.e);
    public static final z91 h;
    public static final z91 i;
    public static final c11 j;
    public static final ArrayDeque k;
    public final mh a;
    public final DisplayMetrics b;
    public final v01 c;
    public final ArrayList d;
    public final ml0 e = ml0.a();

    static {
        y20 y20Var = y20.b;
        Boolean bool = Boolean.FALSE;
        h = z91.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = z91.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        j = new c11(5);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        k = new ArrayDeque(0);
    }

    public b30(ArrayList arrayList, DisplayMetrics displayMetrics, mh mhVar, v01 v01Var) {
        this.d = arrayList;
        am2.p(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        am2.p(mhVar, "Argument must not be null");
        this.a = mhVar;
        am2.p(v01Var, "Argument must not be null");
        this.c = v01Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(defpackage.ac2 r5, android.graphics.BitmapFactory.Options r6, defpackage.a30 r7, defpackage.mh r8) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r6.inJustDecodeBounds
            if (r1 != 0) goto L22
            r7.f()
            int r1 = r5.a
            switch(r1) {
                case 25: goto L22;
                case 26: goto Lf;
                default: goto Le;
            }
        Le:
            goto L22
        Lf:
            java.lang.Object r1 = r5.b
            wa r1 = (defpackage.wa) r1
            java.lang.Object r1 = r1.b
            nf1 r1 = (defpackage.nf1) r1
            monitor-enter(r1)
            byte[] r2 = r1.a     // Catch: java.lang.Throwable -> L1f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L1f
            r1.c = r2     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)
            goto L22
        L1f:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r5
        L22:
            int r1 = r6.outWidth
            int r2 = r6.outHeight
            java.lang.String r3 = r6.outMimeType
            java.util.concurrent.locks.Lock r4 = defpackage.hz1.b
            r4.lock()
            android.graphics.Bitmap r5 = r5.s(r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.Throwable -> L5c
            r4.unlock()
            return r5
        L35:
            r4 = move-exception
            java.io.IOException r1 = e(r4, r1, r2, r3, r6)     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r2)     // Catch: java.lang.Throwable -> L5c
            if (r2 == 0) goto L46
            java.lang.String r2 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r2, r1)     // Catch: java.lang.Throwable -> L5c
        L46:
            android.graphics.Bitmap r0 = r6.inBitmap     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L5b
            r8.c(r0)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            r0 = 0
            r6.inBitmap = r0     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            android.graphics.Bitmap r5 = c(r5, r6, r7, r8)     // Catch: java.io.IOException -> L5a java.lang.Throwable -> L5c
            java.util.concurrent.locks.Lock r6 = defpackage.hz1.b
            r6.unlock()
            return r5
        L5a:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5b:
            throw r1     // Catch: java.lang.Throwable -> L5c
        L5c:
            r5 = move-exception
            java.util.concurrent.locks.Lock r6 = defpackage.hz1.b
            r6.unlock()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b30.c(ac2, android.graphics.BitmapFactory$Options, a30, mh):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static IOException e(IllegalArgumentException illegalArgumentException, int i2, int i3, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + d(options.inBitmap), illegalArgumentException);
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final nh a(ac2 ac2Var, int i2, int i3, da1 da1Var, a30 a30Var) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.c.c(65536, byte[].class);
        synchronized (b30.class) {
            arrayDeque = k;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
        }
        options.inTempStorage = bArr;
        gy gyVar = (gy) da1Var.c(f);
        pc1 pc1Var = (pc1) da1Var.c(g);
        y20 y20Var = (y20) da1Var.c(y20.g);
        boolean zBooleanValue = ((Boolean) da1Var.c(h)).booleanValue();
        z91 z91Var = i;
        try {
            nh nhVarC = nh.c(this.a, b(ac2Var, options, y20Var, gyVar, pc1Var, da1Var.c(z91Var) != null && ((Boolean) da1Var.c(z91Var)).booleanValue(), i2, i3, zBooleanValue, a30Var));
            f(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            return nhVarC;
        } finally {
            f(options);
            ArrayDeque arrayDeque2 = k;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.c.g(bArr);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0366  */
    /* JADX WARN: Code duplicated, block: B:146:0x0395  */
    /* JADX WARN: Code duplicated, block: B:147:0x039f  */
    /* JADX WARN: Code duplicated, block: B:150:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:160:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:161:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:164:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:165:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:172:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:176:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:179:0x041f  */
    /* JADX WARN: Code duplicated, block: B:183:0x046c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x048f  */
    /* JADX WARN: Code duplicated, block: B:196:0x0493  */
    /* JADX WARN: Code duplicated, block: B:198:0x0499  */
    /* JADX WARN: Code duplicated, block: B:200:0x049f  */
    /* JADX WARN: Code duplicated, block: B:205:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:208:0x04c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:212:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:214:0x0562  */
    /* JADX WARN: Code duplicated, block: B:216:0x056c  */
    /* JADX WARN: Code duplicated, block: B:217:0x056e  */
    /* JADX WARN: Code duplicated, block: B:220:0x057f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0583  */
    /* JADX WARN: Code duplicated, block: B:222:0x058c  */
    /* JADX WARN: Code duplicated, block: B:223:0x0590  */
    /* JADX WARN: Code duplicated, block: B:224:0x0599  */
    /* JADX WARN: Code duplicated, block: B:225:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:226:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:230:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:235:0x03a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x010d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0110  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0117  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:54:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x013c  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0155 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x0157  */
    /* JADX WARN: Instruction removed from duplicated block: B:143:0x0366, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:179:0x041f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:212:0x04dd, please report this as an issue */
    public final Bitmap b(ac2 ac2Var, BitmapFactory.Options options, y20 y20Var, gy gyVar, pc1 pc1Var, boolean z, int i2, int i3, boolean z2, a30 a30Var) throws Throwable {
        long j2;
        String str;
        int iD;
        int iL;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ImageHeaderParser.ImageType imageTypeC;
        int i8;
        String str2;
        mh mhVar;
        String str3;
        int i9;
        boolean zC;
        boolean z4;
        int i10;
        float f2;
        int i11;
        int iRound;
        int iRound2;
        int i12;
        mh mhVar2;
        Bitmap bitmapC;
        Matrix matrix;
        Bitmap bitmap;
        int i13;
        ColorSpace.Named named;
        Bitmap.Config config;
        boolean zHasAlpha;
        Bitmap.Config config2;
        int i14;
        int i15;
        int iFloor;
        int iFloor2;
        int iRound3;
        int i16 = e01.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        options.inJustDecodeBounds = true;
        mh mhVar3 = this.a;
        c(ac2Var, options, a30Var, mhVar3);
        options.inJustDecodeBounds = false;
        int[] iArr = {options.outWidth, options.outHeight};
        int i17 = iArr[0];
        int i18 = iArr[1];
        String str4 = options.outMimeType;
        boolean z5 = (i17 == -1 || i18 == -1) ? false : z;
        nf1 nf1Var = null;
        switch (ac2Var.a) {
            case 25:
                j2 = jElapsedRealtimeNanos;
                str = str4;
                List list = (List) ac2Var.c;
                ByteBuffer byteBufferC = kj.c((ByteBuffer) ac2Var.b);
                v01 v01Var = (v01) ac2Var.d;
                if (byteBufferC != null) {
                    int size = list.size();
                    int i19 = 0;
                    while (true) {
                        if (i19 < size) {
                            List list2 = list;
                            try {
                                iD = ((rn0) list.get(i19)).d(byteBufferC, v01Var);
                                v01 v01Var2 = v01Var;
                                if (iD != -1) {
                                    iL = iD;
                                    switch (iL) {
                                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                                            i4 = 180;
                                            break;
                                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                            i4 = 90;
                                            break;
                                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                            i4 = 270;
                                            break;
                                        default:
                                            i4 = 0;
                                            break;
                                    }
                                    switch (iL) {
                                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                            z3 = true;
                                            break;
                                        default:
                                            z3 = false;
                                            break;
                                    }
                                    if (i2 == Integer.MIN_VALUE) {
                                        if (i4 != 90) {
                                            i5 = 270;
                                            if (i4 == 270) {
                                                i6 = i17;
                                            }
                                        } else {
                                            i5 = 270;
                                        }
                                        i6 = i18;
                                    } else {
                                        i5 = 270;
                                        i6 = i2;
                                    }
                                    if (i3 == Integer.MIN_VALUE) {
                                        i7 = i3;
                                    } else if (i4 != 90 || i4 == i5) {
                                        i7 = i17;
                                    } else {
                                        i7 = i18;
                                    }
                                    imageTypeC = ac2Var.C();
                                    i8 = iL;
                                    boolean z6 = z3;
                                    if (i17 > 0 || i18 <= 0) {
                                        str2 = ", density: ";
                                        mhVar = mhVar3;
                                        str3 = ", target density: ";
                                        i9 = i6;
                                        if (Log.isLoggable("Downsampler", 3)) {
                                            Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                                        }
                                    } else {
                                        if (i4 == 90 || i4 == 270) {
                                            i14 = i18;
                                            i15 = i17;
                                        } else {
                                            i15 = i18;
                                            i14 = i17;
                                        }
                                        i9 = i6;
                                        float fB = y20Var.b(i14, i15, i9, i7);
                                        if (fB <= 0.0f) {
                                            throw new IllegalArgumentException("Cannot scale with factor: " + fB + " from: " + y20Var + ", source: [" + i17 + "x" + i18 + "], target: [" + i9 + "x" + i7 + "]");
                                        }
                                        int iA = y20Var.a(i14, i15, i9, i7);
                                        if (iA == 0) {
                                            e.g("Cannot round with null rounding");
                                            return null;
                                        }
                                        int i20 = i4;
                                        float f3 = i14;
                                        int i21 = i14;
                                        float f4 = i15;
                                        int i22 = i15;
                                        int i23 = (int) (((double) (fB * f4)) + 0.5d);
                                        int i24 = i21 / ((int) (((double) (fB * f3)) + 0.5d));
                                        int i25 = i22 / i23;
                                        int iMax = Math.max(1, Integer.highestOneBit(iA == 1 ? Math.max(i24, i25) : Math.min(i24, i25)));
                                        if (iA == 1 && iMax < 1.0f / fB) {
                                            iMax <<= 1;
                                        }
                                        options.inSampleSize = iMax;
                                        if (imageTypeC == ImageHeaderParser.ImageType.JPEG) {
                                            float fMin = Math.min(iMax, 8);
                                            iFloor = (int) Math.ceil(f3 / fMin);
                                            iFloor2 = (int) Math.ceil(f4 / fMin);
                                            int i26 = iMax / 8;
                                            if (i26 > 0) {
                                                iFloor2 /= i26;
                                                iRound3 = iFloor / i26;
                                            } else {
                                                iRound3 = iFloor;
                                            }
                                        } else {
                                            if (imageTypeC == ImageHeaderParser.ImageType.PNG || imageTypeC == ImageHeaderParser.ImageType.PNG_A) {
                                                float f5 = iMax;
                                                iFloor = (int) Math.floor(f3 / f5);
                                                iFloor2 = (int) Math.floor(f4 / f5);
                                            } else if (imageTypeC.isWebp()) {
                                                float f6 = iMax;
                                                iRound3 = Math.round(f3 / f6);
                                                iFloor2 = Math.round(f4 / f6);
                                            } else if (i21 % iMax == 0 && i22 % iMax == 0) {
                                                iRound3 = i21 / iMax;
                                                iFloor2 = i22 / iMax;
                                            } else {
                                                options.inJustDecodeBounds = true;
                                                c(ac2Var, options, a30Var, mhVar3);
                                                options.inJustDecodeBounds = false;
                                                int[] iArr2 = {options.outWidth, options.outHeight};
                                                iFloor = iArr2[0];
                                                iFloor2 = iArr2[1];
                                            }
                                            iRound3 = iFloor;
                                        }
                                        double dB = y20Var.b(iRound3, iFloor2, i9, i7);
                                        int iRound4 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                                        mhVar = mhVar3;
                                        int i27 = (int) ((((double) iRound4) * dB) + 0.5d);
                                        float f7 = i27 / iRound4;
                                        int i28 = iMax;
                                        options.inTargetDensity = (int) (((dB / ((double) f7)) * ((double) i27)) + 0.5d);
                                        int iRound5 = (int) Math.round((dB <= 1.0d ? dB : 1.0d / dB) * 2.147483647E9d);
                                        options.inDensity = iRound5;
                                        int i29 = options.inTargetDensity;
                                        if (i29 <= 0 || iRound5 <= 0 || i29 == iRound5) {
                                            options.inTargetDensity = 0;
                                            options.inDensity = 0;
                                        } else {
                                            options.inScaled = true;
                                        }
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            StringBuilder sb = new StringBuilder("Calculate scaling, source: [");
                                            sb.append(i17);
                                            sb.append("x");
                                            sb.append(i18);
                                            sb.append("], degreesToRotate: ");
                                            sb.append(i20);
                                            sb.append(", target: [");
                                            sb.append(i9);
                                            sb.append("x");
                                            sb.append(i7);
                                            sb.append("], power of two scaled: [");
                                            sb.append(iRound3);
                                            sb.append("x");
                                            sb.append(iFloor2);
                                            sb.append("], exact scale factor: ");
                                            sb.append(fB);
                                            sb.append(", power of 2 sample size: ");
                                            sb.append(i28);
                                            sb.append(", adjusted scale factor: ");
                                            sb.append(dB);
                                            str3 = ", target density: ";
                                            sb.append(str3);
                                            sb.append(options.inTargetDensity);
                                            str2 = ", density: ";
                                            sb.append(str2);
                                            sb.append(options.inDensity);
                                            Log.v("Downsampler", sb.toString());
                                        } else {
                                            str2 = r7;
                                            str3 = ", target density: ";
                                        }
                                    }
                                    zC = this.e.c(i9, i7, z5, z6);
                                    if (zC) {
                                        options.inPreferredConfig = Bitmap.Config.HARDWARE;
                                        z4 = false;
                                        options.inMutable = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (!zC) {
                                        if (gyVar != gy.a) {
                                            try {
                                                zHasAlpha = ac2Var.C().hasAlpha();
                                            } catch (IOException e) {
                                                if (Log.isLoggable("Downsampler", 3)) {
                                                    Log.d("Downsampler", "Cannot determine whether the image has alpha or not from header, format " + gyVar, e);
                                                }
                                                zHasAlpha = z4;
                                            }
                                            if (zHasAlpha) {
                                                config2 = Bitmap.Config.ARGB_8888;
                                            } else {
                                                config2 = Bitmap.Config.RGB_565;
                                            }
                                            options.inPreferredConfig = config2;
                                            if (config2 == Bitmap.Config.RGB_565) {
                                                options.inDither = true;
                                            }
                                        } else {
                                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        }
                                        break;
                                    }
                                    if (i17 >= 0 || i18 < 0 || !z2) {
                                        i10 = options.inTargetDensity;
                                        if (i10 > 0 || (i12 = options.inDensity) <= 0 || i10 == i12) {
                                            f2 = 1.0f;
                                        } else {
                                            f2 = i10 / i12;
                                        }
                                        i11 = options.inSampleSize;
                                        float f8 = i11;
                                        int iCeil = (int) Math.ceil(i17 / f8);
                                        int iCeil2 = (int) Math.ceil(i18 / f8);
                                        iRound = Math.round(iCeil * f2);
                                        iRound2 = Math.round(iCeil2 * f2);
                                        if (Log.isLoggable("Downsampler", 2)) {
                                            Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                                        }
                                        i9 = iRound;
                                        i7 = iRound2;
                                    }
                                    if (i9 > 0 || i7 <= 0) {
                                        mhVar2 = mhVar;
                                    } else {
                                        if (Build.VERSION.SDK_INT < 26) {
                                            config = null;
                                        } else if (options.inPreferredConfig == Bitmap.Config.HARDWARE) {
                                            mhVar2 = mhVar;
                                        } else {
                                            config = options.outConfig;
                                        }
                                        if (config == null) {
                                            config = options.inPreferredConfig;
                                        }
                                        mhVar2 = mhVar;
                                        options.inBitmap = mhVar2.a(i9, i7, config);
                                    }
                                    if (pc1Var != null) {
                                        i13 = Build.VERSION.SDK_INT;
                                        if (i13 >= 28) {
                                            if (pc1Var == pc1.a || options.outColorSpace == null || !options.outColorSpace.isWideGamut()) {
                                                named = ColorSpace.Named.SRGB;
                                            } else {
                                                named = ColorSpace.Named.DISPLAY_P3;
                                            }
                                            options.inPreferredColorSpace = ColorSpace.get(named);
                                        } else if (i13 >= 26) {
                                            ColorSpace.Named unused = ColorSpace.Named.SRGB;
                                            options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                                        }
                                    }
                                    bitmapC = c(ac2Var, options, a30Var, mhVar2);
                                    a30Var.c(mhVar2, bitmapC);
                                    if (Log.isLoggable("Downsampler", 2)) {
                                        Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i17 + "x" + i18 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + e01.a(j2));
                                    }
                                    if (bitmapC != null) {
                                        return null;
                                    }
                                    bitmapC.setDensity(this.b.densityDpi);
                                    switch (i8) {
                                        case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                        case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                        case oc1.LONG_FIELD_NUMBER /* 4 */:
                                        case oc1.STRING_FIELD_NUMBER /* 5 */:
                                        case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                        case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                        case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                            matrix = new Matrix();
                                            switch (i8) {
                                                case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                                    matrix.setScale(-1.0f, 1.0f);
                                                    break;
                                                case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                                    matrix.setRotate(180.0f);
                                                    break;
                                                case oc1.LONG_FIELD_NUMBER /* 4 */:
                                                    matrix.setRotate(180.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case oc1.STRING_FIELD_NUMBER /* 5 */:
                                                    matrix.setRotate(90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                                    matrix.setRotate(90.0f);
                                                    break;
                                                case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                                    matrix.setRotate(-90.0f);
                                                    matrix.postScale(-1.0f, 1.0f);
                                                    break;
                                                case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                                    matrix.setRotate(-90.0f);
                                                    break;
                                            }
                                            bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                                            bitmap = bitmapC;
                                            break;
                                        default:
                                            bitmap = bitmapC;
                                            break;
                                    }
                                    if (!bitmap.equals(bitmapC)) {
                                        mhVar2.c(bitmap);
                                    }
                                    return bitmapC;
                                }
                                i19++;
                                list = list2;
                                v01Var = v01Var2;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }
                iL = -1;
                switch (iL) {
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 180;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i4 = 90;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i4 = 270;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                switch (iL) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i2 == Integer.MIN_VALUE) {
                    if (i4 != 90) {
                        i5 = 270;
                        if (i4 == 270) {
                            i6 = i17;
                        }
                    } else {
                        i5 = 270;
                    }
                    i6 = i18;
                } else {
                    i5 = 270;
                    i6 = i2;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i7 = i3;
                } else if (i4 != 90) {
                    i7 = i17;
                } else {
                    i7 = i17;
                }
                imageTypeC = ac2Var.C();
                i8 = iL;
                boolean z7 = z3;
                if (i17 > 0) {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                }
                zC = this.e.c(i9, i7, z5, z7);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zC) {
                    if (gyVar != gy.a) {
                        zHasAlpha = ac2Var.C().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i17 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f9 = i11;
                    int iCeil3 = (int) Math.ceil(i17 / f9);
                    int iCeil4 = (int) Math.ceil(i18 / f9);
                    iRound = Math.round(iCeil3 * f2);
                    iRound2 = Math.round(iCeil4 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f10 = i11;
                    int iCeil5 = (int) Math.ceil(i17 / f10);
                    int iCeil6 = (int) Math.ceil(i18 / f10);
                    iRound = Math.round(iCeil5 * f2);
                    iRound2 = Math.round(iCeil6 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                }
                if (i9 > 0) {
                    mhVar2 = mhVar;
                } else {
                    mhVar2 = mhVar;
                }
                if (pc1Var != null) {
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 28) {
                        if (pc1Var == pc1.a) {
                            named = ColorSpace.Named.SRGB;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i13 >= 26) {
                        ColorSpace.Named unused2 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(ac2Var, options, a30Var, mhVar2);
                a30Var.c(mhVar2, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i17 + "x" + i18 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + e01.a(j2));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.b.densityDpi);
                switch (i8) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        matrix = new Matrix();
                        switch (i8) {
                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                matrix.setRotate(180.0f);
                                break;
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                matrix.setRotate(90.0f);
                                break;
                            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                        bitmap = bitmapC;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (!bitmap.equals(bitmapC)) {
                    mhVar2.c(bitmap);
                }
                return bitmapC;
            case 26:
                j2 = jElapsedRealtimeNanos;
                str = str4;
                List list3 = (List) ac2Var.d;
                nf1 nf1Var2 = (nf1) ((wa) ac2Var.b).b;
                nf1Var2.reset();
                iL = qt.l(list3, nf1Var2, (v01) ac2Var.c);
                switch (iL) {
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 180;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i4 = 90;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i4 = 270;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                switch (iL) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i2 == Integer.MIN_VALUE) {
                    if (i4 != 90) {
                        i5 = 270;
                        if (i4 == 270) {
                            i6 = i17;
                        }
                    } else {
                        i5 = 270;
                    }
                    i6 = i18;
                } else {
                    i5 = 270;
                    i6 = i2;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i7 = i3;
                } else if (i4 != 90) {
                    i7 = i17;
                } else {
                    i7 = i17;
                }
                imageTypeC = ac2Var.C();
                i8 = iL;
                boolean z8 = z3;
                if (i17 > 0) {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                }
                zC = this.e.c(i9, i7, z5, z8);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zC) {
                    if (gyVar != gy.a) {
                        zHasAlpha = ac2Var.C().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i17 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f11 = i11;
                    int iCeil7 = (int) Math.ceil(i17 / f11);
                    int iCeil8 = (int) Math.ceil(i18 / f11);
                    iRound = Math.round(iCeil7 * f2);
                    iRound2 = Math.round(iCeil8 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f12 = i11;
                    int iCeil9 = (int) Math.ceil(i17 / f12);
                    int iCeil10 = (int) Math.ceil(i18 / f12);
                    iRound = Math.round(iCeil9 * f2);
                    iRound2 = Math.round(iCeil10 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                }
                if (i9 > 0) {
                    mhVar2 = mhVar;
                } else {
                    mhVar2 = mhVar;
                }
                if (pc1Var != null) {
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 28) {
                        if (pc1Var == pc1.a) {
                            named = ColorSpace.Named.SRGB;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i13 >= 26) {
                        ColorSpace.Named unused3 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(ac2Var, options, a30Var, mhVar2);
                a30Var.c(mhVar2, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i17 + "x" + i18 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + e01.a(j2));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.b.densityDpi);
                switch (i8) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        matrix = new Matrix();
                        switch (i8) {
                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                matrix.setRotate(180.0f);
                                break;
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                matrix.setRotate(90.0f);
                                break;
                            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                        bitmap = bitmapC;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (!bitmap.equals(bitmapC)) {
                    mhVar2.c(bitmap);
                }
                return bitmapC;
            default:
                List list4 = (List) ac2Var.c;
                j2 = jElapsedRealtimeNanos;
                a aVar = (a) ac2Var.d;
                v01 v01Var3 = (v01) ac2Var.b;
                int size2 = list4.size();
                str = str4;
                int i30 = 0;
                while (true) {
                    if (i30 < size2) {
                        int i31 = size2;
                        rn0 rn0Var = (rn0) list4.get(i30);
                        int i32 = i30;
                        try {
                            List list5 = list4;
                            nf1 nf1Var3 = new nf1(new FileInputStream(aVar.a().getFileDescriptor()), v01Var3);
                            try {
                                iD = rn0Var.b(nf1Var3, v01Var3);
                                nf1Var3.b();
                                aVar.a();
                                if (iD != -1) {
                                    iL = iD;
                                } else {
                                    i30 = i32 + 1;
                                    size2 = i31;
                                    list4 = list5;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                nf1Var = nf1Var3;
                                if (nf1Var != null) {
                                    nf1Var.b();
                                }
                                aVar.a();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        iL = -1;
                    }
                }
                switch (iL) {
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        i4 = 180;
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        i4 = 90;
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        i4 = 270;
                        break;
                    default:
                        i4 = 0;
                        break;
                }
                switch (iL) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        z3 = true;
                        break;
                    default:
                        z3 = false;
                        break;
                }
                if (i2 == Integer.MIN_VALUE) {
                    if (i4 != 90) {
                        i5 = 270;
                        if (i4 == 270) {
                            i6 = i17;
                        }
                    } else {
                        i5 = 270;
                    }
                    i6 = i18;
                } else {
                    i5 = 270;
                    i6 = i2;
                }
                if (i3 == Integer.MIN_VALUE) {
                    i7 = i3;
                } else if (i4 != 90) {
                    i7 = i17;
                } else {
                    i7 = i17;
                }
                imageTypeC = ac2Var.C();
                i8 = iL;
                boolean z9 = z3;
                if (i17 > 0) {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                } else {
                    str2 = ", density: ";
                    mhVar = mhVar3;
                    str3 = ", target density: ";
                    i9 = i6;
                    if (Log.isLoggable("Downsampler", 3)) {
                        Log.d("Downsampler", "Unable to determine dimensions for: " + imageTypeC + " with target [" + i9 + "x" + i7 + "]");
                    }
                }
                zC = this.e.c(i9, i7, z5, z9);
                if (zC) {
                    options.inPreferredConfig = Bitmap.Config.HARDWARE;
                    z4 = false;
                    options.inMutable = false;
                } else {
                    z4 = false;
                }
                if (!zC) {
                    if (gyVar != gy.a) {
                        zHasAlpha = ac2Var.C().hasAlpha();
                        if (zHasAlpha) {
                            config2 = Bitmap.Config.ARGB_8888;
                        } else {
                            config2 = Bitmap.Config.RGB_565;
                        }
                        options.inPreferredConfig = config2;
                        if (config2 == Bitmap.Config.RGB_565) {
                            options.inDither = true;
                        }
                    } else {
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    }
                }
                if (i17 >= 0) {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f13 = i11;
                    int iCeil11 = (int) Math.ceil(i17 / f13);
                    int iCeil12 = (int) Math.ceil(i18 / f13);
                    iRound = Math.round(iCeil11 * f2);
                    iRound2 = Math.round(iCeil12 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                } else {
                    i10 = options.inTargetDensity;
                    if (i10 > 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    i11 = options.inSampleSize;
                    float f14 = i11;
                    int iCeil13 = (int) Math.ceil(i17 / f14);
                    int iCeil14 = (int) Math.ceil(i18 / f14);
                    iRound = Math.round(iCeil13 * f2);
                    iRound2 = Math.round(iCeil14 * f2);
                    if (Log.isLoggable("Downsampler", 2)) {
                        Log.v("Downsampler", "Calculated target [" + iRound + "x" + iRound2 + "] for source [" + i17 + "x" + i18 + "], sampleSize: " + i11 + ", targetDensity: " + options.inTargetDensity + str2 + options.inDensity + ", density multiplier: " + f2);
                    }
                    i9 = iRound;
                    i7 = iRound2;
                }
                if (i9 > 0) {
                    mhVar2 = mhVar;
                } else {
                    mhVar2 = mhVar;
                }
                if (pc1Var != null) {
                    i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 28) {
                        if (pc1Var == pc1.a) {
                            named = ColorSpace.Named.SRGB;
                        } else {
                            named = ColorSpace.Named.SRGB;
                        }
                        options.inPreferredColorSpace = ColorSpace.get(named);
                    } else if (i13 >= 26) {
                        ColorSpace.Named unused4 = ColorSpace.Named.SRGB;
                        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                }
                bitmapC = c(ac2Var, options, a30Var, mhVar2);
                a30Var.c(mhVar2, bitmapC);
                if (Log.isLoggable("Downsampler", 2)) {
                    Log.v("Downsampler", "Decoded " + d(bitmapC) + " from [" + i17 + "x" + i18 + "] " + str + " with inBitmap " + d(options.inBitmap) + " for [" + i2 + "x" + i3 + "], sample size: " + options.inSampleSize + str2 + options.inDensity + str3 + options.inTargetDensity + ", thread: " + Thread.currentThread().getName() + ", duration: " + e01.a(j2));
                }
                if (bitmapC != null) {
                    return null;
                }
                bitmapC.setDensity(this.b.densityDpi);
                switch (i8) {
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        matrix = new Matrix();
                        switch (i8) {
                            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                                matrix.setScale(-1.0f, 1.0f);
                                break;
                            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                                matrix.setRotate(180.0f);
                                break;
                            case oc1.LONG_FIELD_NUMBER /* 4 */:
                                matrix.setRotate(180.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_FIELD_NUMBER /* 5 */:
                                matrix.setRotate(90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                                matrix.setRotate(90.0f);
                                break;
                            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                                matrix.setRotate(-90.0f);
                                matrix.postScale(-1.0f, 1.0f);
                                break;
                            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                                matrix.setRotate(-90.0f);
                                break;
                        }
                        bitmapC = Bitmap.createBitmap(bitmapC, 0, 0, bitmapC.getWidth(), bitmapC.getHeight(), matrix, true);
                        bitmap = bitmapC;
                        break;
                    default:
                        bitmap = bitmapC;
                        break;
                }
                if (!bitmap.equals(bitmapC)) {
                    mhVar2.c(bitmap);
                }
                return bitmapC;
        }
    }
}
