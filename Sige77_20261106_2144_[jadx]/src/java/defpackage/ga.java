package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.facebook.AccessToken;
import com.hjq.toast.BuildConfig;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import kotlin.ranges.a;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ga {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final int[][] e = {new int[]{27, 917}, new int[]{522, 568, 723, 809}, new int[]{237, 308, 436, 284, 646, 653, 428, 379}, new int[]{274, 562, 232, 755, 599, 524, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{361, 575, 922, 525, 176, 586, 640, 321, 536, 742, 677, 742, 687, 284, 193, 517, 273, 494, 263, 147, 593, 800, 571, 320, 803, 133, 231, 390, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, 376, 511, 400, 672, 762, 283, 184, 440, 35, 519, 31, 460, 594, 225, 535, 517, 352, 605, 158, 651, 201, 488, 502, 648, 733, 717, 83, 404, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{521, 310, 864, 547, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, 217, 208, 928, 244, 583, 620, 246, 148, 447, 631, 292, 908, 490, 704, 516, 258, 457, 907, 594, 723, 674, 292, 272, 96, 684, 432, 686, 606, 860, 569, 193, 219, 129, 186, 236, 287, 192, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, 336, 89, 614, 87, 432, 670, 616, 157, 374, 242, 726, 600, 269, 375, 898, 845, 454, 354, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, 517, 834, 315, 550, 86, 801, 4, 108, 539}, new int[]{524, 894, 75, 766, 882, 857, 74, 204, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, 311, 913, 275, 190, 375, 850, 438, 733, 194, 280, 201, 280, 828, 757, 710, 814, 919, 89, 68, 569, 11, 204, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, 592, 668, 353, 859, 370, 694, 325, 240, 216, 257, 284, 549, 209, 884, 315, 70, 329, 793, 490, 274, 877, 162, 749, 812, 684, 461, 334, 376, 849, 521, 307, 291, 803, 712, 19, 358, 399, 908, 103, 511, 51, 8, 517, 225, 289, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, 290, 743, 199, 655, 903, 329, 49, 802, 580, 355, 588, 188, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, 374, 601, 192, 605, 142, 673, 687, 234, 722, 384, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, 544, 261, 852, 655, 309, 697, 755, 756, 60, 231, 773, 434, 421, 726, 528, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, 566, 319, 9, 647, 550, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, 532, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, 404, 251, 688, 95, 497, 555, 642, 543, 307, 159, 924, 558, 648, 55, 497, 10}, new int[]{352, 77, 373, 504, 35, 599, 428, 207, 409, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, 306, 88, 87, 193, 352, 781, 846, 75, 327, 520, 435, 543, 203, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, 408, 390, 644, 102, 476, 499, 290, 632, 545, 37, 858, 916, 552, 41, 542, 289, 122, 272, 383, 800, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, 290, 204, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, 593, 913, 142, 808, 684, 287, 536, 561, 76, 653, 899, 729, 567, 744, 390, 513, 192, 516, 258, 240, 518, 794, 395, 768, 848, 51, 610, 384, 168, 190, 826, 328, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, 531, 207, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, 358, 785, 288, 357, 850, 836, 827, 736, 707, 94, 8, 494, 114, 521, 2, 499, 851, 543, 152, 729, 771, 95, 248, 361, 578, 323, 856, 797, 289, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, 552, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, 283, 711, 472, 420, 245, 288, 594, 394, 511, 327, 589, 777, 699, 688, 43, 408, 842, 383, 721, 521, 560, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, 563, 564, 343, 693, 109, 608, 563, 365, 181, 772, 677, 310, 248, 353, 708, 410, 579, 870, 617, 841, 632, 860, 289, 536, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, 369, 54, 492, 228, 613, 830, 922, 437, 519, 644, 905, 789, 420, 305, 441, 207, 300, 892, 827, 141, 537, 381, 662, 513, 56, 252, 341, 242, 797, 838, 837, 720, 224, 307, 631, 61, 87, 560, 310, 756, 665, 397, 808, 851, 309, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, 216, 548, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, 308, 155, 422, 907, 817, 187, 62, 16, 425, 535, 336, 286, 437, 375, 273, 610, 296, 183, 923, 116, 667, 751, 353, 62, 366, 691, 379, 687, 842, 37, 357, 720, 742, 330, 5, 39, 923, 311, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, 576, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, 531, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, 111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, 600, 325, 498, 655, 357, 752, 768, 223, 849, 647, 63, 310, 863, 251, 366, 304, 282, 738, 675, 410, 389, 244, 31, 121, 303, 263}};
    public static final int[] f = {2130968865};
    public static final int[] i = {2130968872};
    public static final byte[][] v = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    public static float A() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void B(int i2, long[] jArr, long[] jArr2) {
        int i3 = -i2;
        for (int i4 = 0; i4 < 10; i4++) {
            int i5 = (int) jArr[i4];
            int i6 = (((int) jArr2[i4]) ^ i5) & i3;
            jArr[i4] = i5 ^ i6;
            jArr2[i4] = ((int) jArr2[i4]) ^ i6;
        }
    }

    public static final void C(StringBuilder sb, Iterator it, sh1 sh1Var) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(sh1.i(entry.getKey()));
            sb.append(" : ");
            sb.append(sh1.i(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(sh1.i(entry2.getKey()));
                sb.append(" : ");
                sb.append(sh1.i(entry2.getValue()));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x003d A[Catch: IOException -> 0x0040, TRY_LEAVE, TryCatch #5 {IOException -> 0x0040, blocks: (B:24:0x0038, B:26:0x003d), top: B:39:0x0038 }] */
    public static void a(File file, String str, boolean z) throws Throwable {
        FileWriter fileWriter;
        try {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        } catch (Exception unused) {
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                fileWriter = new FileWriter(file, z);
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
                    try {
                        bufferedWriter2.write(str);
                        bufferedWriter2.flush();
                        bufferedWriter2.close();
                    } catch (IOException unused2) {
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                        if (fileWriter == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                                if (fileWriter != null) {
                                    fileWriter.close();
                                }
                            } catch (IOException unused3) {
                                throw th;
                            }
                        } else if (fileWriter != null) {
                            fileWriter.close();
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException unused5) {
                return;
            }
        } catch (IOException unused6) {
            fileWriter = null;
        } catch (Throwable th3) {
            th = th3;
            fileWriter = null;
        }
        fileWriter.close();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0037 A[Catch: IOException -> 0x003a, TRY_LEAVE, TryCatch #1 {IOException -> 0x003a, blocks: (B:22:0x0032, B:24:0x0037), top: B:35:0x0032 }] */
    public static String b(File file) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            try {
                FileReader fileReader2 = new FileReader(file);
                try {
                    bufferedReader = new BufferedReader(fileReader2);
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                        } catch (IOException unused) {
                            fileReader = fileReader2;
                            if (fileReader != null) {
                                fileReader.close();
                            }
                            if (bufferedReader != null) {
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            fileReader = fileReader2;
                            if (fileReader != null) {
                                try {
                                    fileReader.close();
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                } catch (IOException unused2) {
                                    throw th;
                                }
                            } else if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    fileReader2.close();
                } catch (IOException unused3) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (IOException unused4) {
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
        bufferedReader.close();
        return sb.toString();
    }

    public static mk0 c(String str, AccessToken accessToken, String str2) {
        String str3;
        if (str == null) {
            return null;
        }
        String str4 = mk0.j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        mk0 mk0VarP = vl0.p(accessToken, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = mk0VarP.d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context contextA = i90.a();
        try {
            str3 = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).versionName;
            str3.getClass();
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = BuildConfig.FLAVOR;
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        if (Intrinsics.areEqual("app_indexing", "app_indexing")) {
            bundle.putString("device_session_id", zn.a());
        }
        mk0VarP.d = bundle;
        mk0VarP.j(new ha(2));
        return mk0VarP;
    }

    public static void d(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ue1.H, i2, i3);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(2130969236, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                g(context, i, "Theme.MaterialComponents");
            }
        }
        g(context, f, "Theme.AppCompat");
    }

    public static void e(int i2, Object[] objArr) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i3);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void f(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ue1.H, i2, i3);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            int length = iArr2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    typedArrayObtainStyledAttributes2.recycle();
                    z = true;
                    break;
                } else {
                    if (typedArrayObtainStyledAttributes2.getResourceId(iArr2[i4], -1) == -1) {
                        typedArrayObtainStyledAttributes2.recycle();
                        break;
                    }
                    i4++;
                }
            }
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
            break;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            return;
        }
        e.g("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
    }

    public static void g(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                e.g(ts.k("The style on this component requires your app theme to be ", str, " (or a descendant)."));
                return;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static byte[] h(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }

    public static int j(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < 6; i3++) {
            int iCeil = (int) Math.ceil(fArr[i3]);
            iArr[i3] = iCeil;
            if (i2 > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i2 = iCeil;
            }
            if (i2 == iCeil) {
                bArr[i3] = (byte) (bArr[i3] + 1);
            }
        }
        return i2;
    }

    public static final View k(Activity activity) {
        if (mt.a.contains(ga.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            mt.a(ga.class, th);
            return null;
        }
    }

    public static final void l(Throwable th, CoroutineContext coroutineContext) {
        Throwable runtimeException;
        Iterator it = at.a.iterator();
        while (it.hasNext()) {
            try {
                ((q6) ((zs) it.next())).e(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    a80.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            a80.a(th, new l10(coroutineContext));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void m(char c2) {
        String hexString = Integer.toHexString(c2);
        throw new IllegalArgumentException("Illegal character: " + c2 + " (0x" + "0000".substring(0, 4 - hexString.length()).concat(hexString) + ')');
    }

    public static int n(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return so.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean o(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    public static final boolean p() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (d.j(str, "generic", false) || d.j(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.t(str2, "google_sdk") || StringsKt.t(str2, "Emulator") || StringsKt.t(str2, "Android SDK built for x86")) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.t(str3, "Genymotion")) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (d.j(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (d.j(str5, "generic", false)) {
                return true;
            }
        }
        return Intrinsics.areEqual("google_sdk", Build.PRODUCT);
    }

    public static boolean q(char c2) {
        return c2 >= 128 && c2 <= 255;
    }

    public static boolean r(char c2) {
        if (c2 == '\r' || c2 == '*' || c2 == '>' || c2 == ' ') {
            return true;
        }
        if (c2 < '0' || c2 > '9') {
            return c2 >= 'A' && c2 <= 'Z';
        }
        return true;
    }

    public static String s(String str, Object... objArr) {
        int iIndexOf;
        String string;
        int i2 = 0;
        for (int i3 = 0; i3 < objArr.length; i3++) {
            Object obj = objArr[i3];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + name.length() + 1);
                    sb.append(name);
                    sb.append('@');
                    sb.append(hexString);
                    String string2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb2 = new StringBuilder(name2.length() + string2.length() + 9);
                    sb2.append("<");
                    sb2.append(string2);
                    sb2.append(" threw ");
                    sb2.append(name2);
                    sb2.append(">");
                    string = sb2.toString();
                }
            }
            objArr[i3] = string;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i4 = 0;
        while (i2 < objArr.length && (iIndexOf = str.indexOf("%s", i4)) != -1) {
            sb3.append((CharSequence) str, i4, iIndexOf);
            sb3.append(objArr[i2]);
            i4 = iIndexOf + 2;
            i2++;
        }
        sb3.append((CharSequence) str, i4, str.length());
        if (i2 < objArr.length) {
            sb3.append(" [");
            sb3.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb3.append(", ");
                sb3.append(objArr[i5]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }

    public static float t(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x01f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:72:0x0123  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    /* JADX WARN: Code duplicated, block: B:75:0x0130  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:81:0x014f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0155  */
    /* JADX WARN: Code duplicated, block: B:84:0x015d  */
    /* JADX WARN: Code duplicated, block: B:87:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177 A[LOOP:1: B:88:0x0175->B:89:0x0177, LOOP_END] */
    public static int u(CharSequence charSequence, int i2, int i3) {
        float[] fArr;
        int i4;
        int[] iArr;
        byte[] bArr;
        int i5;
        int i6;
        int i7;
        int i8;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        int i9;
        if (i2 >= charSequence.length()) {
            return i3;
        }
        float f2 = 2.0f;
        int i10 = 5;
        float f3 = 1.0f;
        int i11 = 2;
        if (i3 == 0) {
            fArr = new float[]{0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[6];
            fArr[0] = 1.0f;
            fArr[1] = 2.0f;
            fArr[2] = 2.0f;
            fArr[3] = 2.0f;
            fArr[4] = 2.0f;
            fArr[5] = 2.25f;
            fArr[i3] = 0.0f;
        }
        int i12 = 0;
        while (true) {
            int i13 = i2 + i12;
            if (i13 == charSequence.length()) {
                byte[] bArr2 = new byte[6];
                int[] iArr2 = new int[6];
                int iJ = j(fArr, iArr2, bArr2);
                int i14 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    i14 += bArr2[i15];
                }
                if (iArr2[0] == iJ) {
                    break;
                }
                if (i14 == 1 && bArr2[i10] > 0) {
                    return i10;
                }
                if (i14 != 1 || bArr2[4] <= 0) {
                    if (i14 != 1 || bArr2[i11] <= 0) {
                        return (i14 != 1 || bArr2[3] <= 0) ? 1 : 3;
                    }
                    return i11;
                }
                return 4;
            }
            char cCharAt = charSequence.charAt(i13);
            i12++;
            if (o(cCharAt)) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (q(cCharAt)) {
                float fCeil = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil;
                fArr[0] = fCeil + f2;
            } else {
                float fCeil2 = (float) Math.ceil(fArr[0]);
                fArr[0] = fCeil2;
                fArr[0] = fCeil2 + f3;
            }
            int i16 = i10;
            float f4 = f3;
            if (cCharAt == ' ' || (cCharAt >= '0' && cCharAt <= '9')) {
                i4 = i11;
            } else {
                i4 = i11;
                if (cCharAt < 'A' || cCharAt > 'Z') {
                    if (q(cCharAt)) {
                        fArr[1] = fArr[1] + 2.6666667f;
                    } else {
                        fArr[1] = fArr[1] + 1.3333334f;
                    }
                }
                if (cCharAt != ' ' || ((cCharAt >= '0' && cCharAt <= '9') || (cCharAt >= 'a' && cCharAt <= 'z'))) {
                    fArr[i4] = fArr[i4] + 0.6666667f;
                } else if (q(cCharAt)) {
                    fArr[i4] = fArr[i4] + 2.6666667f;
                } else {
                    fArr[i4] = fArr[i4] + 1.3333334f;
                }
                if (r(cCharAt)) {
                    fArr[3] = fArr[3] + 0.6666667f;
                } else if (q(cCharAt)) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
                if (cCharAt < ' ' && cCharAt <= '^') {
                    fArr[4] = fArr[4] + 0.75f;
                } else if (q(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
                fArr[i16] = fArr[i16] + f4;
                if (i12 >= 4) {
                    iArr = new int[6];
                    bArr = new byte[6];
                    j(fArr, iArr, bArr);
                    i6 = 0;
                    for (i5 = 0; i5 < 6; i5++) {
                        i6 += bArr[i5];
                    }
                    i7 = iArr[0];
                    i8 = iArr[i16];
                    if (i7 >= i8 && i7 < iArr[1] && i7 < iArr[i4] && i7 < iArr[3] && i7 < iArr[4]) {
                        break;
                    }
                    if (i8 >= i7) {
                        return i16;
                    }
                    b2 = bArr[1];
                    b3 = bArr[i4];
                    b4 = bArr[3];
                    b5 = bArr[4];
                    if (b2 + b3 + b4 + b5 == 0) {
                        return i16;
                    }
                    if (i6 != 1 && b5 > 0) {
                        return 4;
                    }
                    if (i6 != 1 && b3 > 0) {
                        return i4;
                    }
                    if (i6 == 1 || b4 <= 0) {
                        int i17 = iArr[1];
                        i9 = i17 + 1;
                        if (i9 < i7 && i9 < i8 && i9 < iArr[4] && i9 < iArr[i4]) {
                            int i18 = iArr[3];
                            if (i17 >= i18) {
                                if (i17 == i18) {
                                    for (int i19 = i2 + i12 + 1; i19 < charSequence.length(); i19++) {
                                        char cCharAt2 = charSequence.charAt(i19);
                                        if (cCharAt2 == '\r' || cCharAt2 == '*' || cCharAt2 == '>') {
                                            return 3;
                                        }
                                        if (!r(cCharAt2)) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i10 = i16;
                f3 = f4;
                i11 = i4;
                f2 = 2.0f;
            }
            fArr[1] = fArr[1] + 0.6666667f;
            if (cCharAt != ' ') {
                fArr[i4] = fArr[i4] + 0.6666667f;
            } else {
                fArr[i4] = fArr[i4] + 0.6666667f;
            }
            if (r(cCharAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (q(cCharAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (cCharAt < ' ') {
                if (q(cCharAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            } else if (q(cCharAt)) {
                fArr[4] = fArr[4] + 4.25f;
            } else {
                fArr[4] = fArr[4] + 3.25f;
            }
            fArr[i16] = fArr[i16] + f4;
            if (i12 >= 4) {
                iArr = new int[6];
                bArr = new byte[6];
                j(fArr, iArr, bArr);
                i6 = 0;
                while (i5 < 6) {
                    i6 += bArr[i5];
                }
                i7 = iArr[0];
                i8 = iArr[i16];
                if (i7 >= i8) {
                }
                if (i8 >= i7) {
                    return i16;
                }
                b2 = bArr[1];
                b3 = bArr[i4];
                b4 = bArr[3];
                b5 = bArr[4];
                if (b2 + b3 + b4 + b5 == 0) {
                    return i16;
                }
                if (i6 != 1) {
                }
                if (i6 != 1) {
                }
                if (i6 == 1) {
                }
                int i110 = iArr[1];
                i9 = i110 + 1;
                if (i9 < i7) {
                    continue;
                }
            }
            i10 = i16;
            f3 = f4;
            i11 = i4;
            f2 = 2.0f;
        }
        return 0;
    }

    public static String v(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b2 : bArrDigest) {
                String hexString = Integer.toHexString(b2 & 255);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return BuildConfig.FLAVOR;
        }
    }

    public static final int w(cf1 cf1Var, IntRange intRange) {
        cf1Var.getClass();
        if (intRange.isEmpty()) {
            ur.g(intRange, "Cannot get random in empty range: ");
            return 0;
        }
        int i2 = ((a) intRange).b;
        int i3 = ((a) intRange).a;
        if (i2 < Integer.MAX_VALUE) {
            return df1.b.c(i3, i2 + 1);
        }
        if (i3 <= Integer.MIN_VALUE) {
            return df1.b.b();
        }
        return df1.b.c(i3 - 1, i2) + 1;
    }

    public static TypedArray x(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        d(context, attributeSet, i2, i3);
        f(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    public static OkHttpGlideModule y(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) objNewInstance;
                }
                sm0.u(objNewInstance, "Expected instanceof GlideModule, but found: ");
                return null;
            } catch (IllegalAccessException e2) {
                z(cls, e2);
                throw null;
            } catch (InstantiationException e3) {
                z(cls, e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                z(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                z(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static void z(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, reflectiveOperationException);
    }
}
