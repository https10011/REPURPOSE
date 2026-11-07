package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.d;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dw0 {
    public static final vy2 c = new vy2("NO_OWNER", 4);
    public static final long[] d = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};
    public static final byte[] e = new byte[0];
    public static String f;
    public static int g;
    public static Boolean h;
    public static final /* synthetic */ int i = 0;
    public final /* synthetic */ int a;
    public final SideSheetBehavior b;

    public /* synthetic */ dw0(SideSheetBehavior sideSheetBehavior, int i2) {
        this.a = i2;
        this.b = sideSheetBehavior;
    }

    public static void A(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        o(jArr, jArr3);
        w(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            o(jArr2, jArr3);
            w(jArr3, jArr2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ot B(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new nt(charSequence, 0);
                }
                break;
            case -1166690414:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new nt(charSequence, "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION");
                }
                break;
            case -580283253:
                if (str.equals("androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new nt(charSequence, 4);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new nt(charSequence, 5);
                }
                break;
            case 2092588512:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_INTERRUPTED")) {
                    return new nt(charSequence, 2);
                }
                break;
            case 2131915191:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS")) {
                    return new nt(charSequence, "android.credentials.CreateCredentialException.TYPE_NO_CREATE_OPTIONS");
                }
                break;
        }
        if (!d.j(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new nt(charSequence, str);
        }
        int i2 = yt.c;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!StringsKt.t(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION")) {
                throw new tg0();
            }
            int i3 = yt.c;
            return xi0.f(str, string);
        } catch (tg0 unused) {
            return new nt(string, str);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final di0 C(CharSequence charSequence, String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new zh0(charSequence, 4);
                }
                break;
            case -408155724:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    return new zh0(charSequence, 5);
                }
                break;
            case -45448328:
                if (str.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    return new zh0(charSequence, 2);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new zh0(charSequence, 0);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new zh0(charSequence, 6);
                }
                break;
            case 1594095913:
                if (str.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    return new zh0(charSequence, 3);
                }
                break;
        }
        if (!d.j(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
            return new zh0(charSequence, str);
        }
        int i2 = ii0.b;
        String string = charSequence != null ? charSequence.toString() : null;
        try {
            if (!d.j(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                throw new tg0();
            }
            int i3 = ii0.b;
            return yv2.q(str, string);
        } catch (tg0 unused) {
            return new zh0(string, str);
        }
    }

    public static boolean D(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static long E(byte[] bArr, int i2) {
        return ((long) (((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16))) & 4294967295L;
    }

    public static String F(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return str.substring(19);
        }
        e.g("key URI must start with android-keystore://");
        return null;
    }

    public static ea3 G(n83 n83Var) throws GeneralSecurityException {
        dx2 dx2Var = n83Var.e;
        if (dx2Var instanceof oz2) {
            return new jf2((oz2) dx2Var);
        }
        if (dx2Var instanceof yy2) {
            return new f6((yy2) dx2Var);
        }
        if (dx2Var instanceof r73) {
            return new f6((r73) dx2Var);
        }
        throw new GeneralSecurityException("Unsupported DEM parameters: ".concat(String.valueOf(dx2Var)));
    }

    public static void H(int i2) throws InvalidAlgorithmParameterException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 << 3)));
        }
    }

    public static void I(int i2, long j, byte[] bArr) {
        int i3 = 0;
        while (i3 < 4) {
            bArr[i2 + i3] = (byte) (255 & j);
            i3++;
            j >>= 8;
        }
    }

    public static boolean J(byte b) {
        return b > -65;
    }

    public static byte[] K(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            e.g("The key length in bytes must be 32.");
            return null;
        }
        long jE = E(bArr, 0) & 67108863;
        int i2 = 3;
        long jE2 = (E(bArr, 3) >> 2) & 67108611;
        long jE3 = (E(bArr, 6) >> 4) & 67092735;
        long jE4 = (E(bArr, 9) >> 6) & 66076671;
        long jE5 = (E(bArr, 12) >> 8) & 1048575;
        long j = jE2 * 5;
        long j2 = jE3 * 5;
        long j3 = jE4 * 5;
        long j4 = jE5 * 5;
        byte[] bArr3 = new byte[17];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        int i3 = 0;
        while (i3 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i3);
            System.arraycopy(bArr2, i3, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, 17, (byte) 0);
            }
            long jE6 = j9 + (E(bArr3, 0) & 67108863);
            long jE7 = j5 + ((E(bArr3, i2) >> 2) & 67108863);
            long jE8 = j6 + ((E(bArr3, 6) >> 4) & 67108863);
            long jE9 = j7 + ((E(bArr3, 9) >> 6) & 67108863);
            long j10 = jE2;
            long jE10 = j8 + (((E(bArr3, 12) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
            long j11 = (jE10 * j) + (jE9 * j2) + (jE8 * j3) + (jE7 * j4) + (jE6 * jE);
            long j12 = (jE10 * j2) + (jE9 * j3) + (jE8 * j4) + (jE7 * jE) + (jE6 * j10);
            long j13 = (jE10 * j3) + (jE9 * j4) + (jE8 * jE) + (jE7 * j10) + (jE6 * jE3);
            long j14 = (jE10 * j4) + (jE9 * jE) + (jE8 * j10) + (jE7 * jE3) + (jE6 * jE4);
            long j15 = jE9 * j10;
            long j16 = jE10 * jE;
            long j17 = j12 + (j11 >> 26);
            long j18 = j13 + (j17 >> 26);
            long j19 = j14 + (j18 >> 26);
            long j20 = j16 + j15 + (jE8 * jE3) + (jE7 * jE4) + (jE6 * jE5) + (j19 >> 26);
            long j21 = j20 >> 26;
            j8 = j20 & 67108863;
            long j22 = (j21 * 5) + (j11 & 67108863);
            i3 += 16;
            j6 = j18 & 67108863;
            j7 = j19 & 67108863;
            j9 = j22 & 67108863;
            j5 = (j17 & 67108863) + (j22 >> 26);
            jE2 = j10;
            i2 = 3;
        }
        long j23 = j6 + (j5 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j7 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j8 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = ((j27 >> 26) * 5) + j9;
        long j30 = j29 >> 26;
        long j31 = j29 & 67108863;
        long j32 = (j5 & 67108863) + j30;
        long j33 = j31 + 5;
        long j34 = j33 & 67108863;
        long j35 = j32 + (j33 >> 26);
        long j36 = j24 + (j35 >> 26);
        long j37 = j26 + (j36 >> 26);
        long j38 = j37 & 67108863;
        long j39 = (j28 + (j37 >> 26)) - 67108864;
        long j40 = j39 >> 63;
        long j41 = j31 & j40;
        long j42 = j32 & j40;
        long j43 = j24 & j40;
        long j44 = j26 & j40;
        long j45 = j28 & j40;
        long j46 = ~j40;
        long j47 = j42 | (j35 & 67108863 & j46);
        long j48 = j43 | (j36 & 67108863 & j46);
        long j49 = j44 | (j38 & j46);
        long j50 = (j41 | (j34 & j46) | (j47 << 26)) & 4294967295L;
        long j51 = ((j47 >> 6) | (j48 << 20)) & 4294967295L;
        long j52 = ((j48 >> 12) | (j49 << 14)) & 4294967295L;
        long j53 = ((j49 >> 18) | ((j45 | (j39 & j46)) << 8)) & 4294967295L;
        long jE11 = E(bArr, 16) + j50;
        long j54 = jE11 & 4294967295L;
        long jE12 = E(bArr, 20) + j51 + (jE11 >> 32);
        long jE13 = E(bArr, 24) + j52 + (jE12 >> 32);
        long jE14 = (E(bArr, 28) + j53 + (jE13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        I(0, j54, bArr4);
        I(4, jE12 & 4294967295L, bArr4);
        I(8, jE13 & 4294967295L, bArr4);
        I(12, jE14, bArr4);
        return bArr4;
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ye2 ye2Var = (ye2) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", ye2Var.a);
            bundle.putLong("event_timestamp", ye2Var.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void c(String str) {
        Log.d("AthenaAttr", str);
    }

    public static k82 d(qr qrVar, int i2, ArrayList arrayList, k82 k82Var) {
        int i3;
        int i4 = i2 == 0 ? qrVar.m0 : qrVar.n0;
        if (i4 != -1 && (k82Var == null || i4 != k82Var.b)) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                k82 k82Var2 = (k82) arrayList.get(i5);
                if (k82Var2.b == i4) {
                    if (k82Var != null) {
                        k82Var.c(i2, k82Var2);
                        arrayList.remove(k82Var);
                    }
                    k82Var = k82Var2;
                    break;
                }
            }
        } else if (i4 != -1) {
            return k82Var;
        }
        if (k82Var == null) {
            if (qrVar instanceof bm0) {
                bm0 bm0Var = (bm0) qrVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= bm0Var.q0) {
                        i3 = -1;
                        break;
                    }
                    qr qrVar2 = bm0Var.p0[i6];
                    if ((i2 == 0 && (i3 = qrVar2.m0) != -1) || (i2 == 1 && (i3 = qrVar2.n0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        k82 k82Var3 = (k82) arrayList.get(i7);
                        if (k82Var3.b == i3) {
                            k82Var = k82Var3;
                            break;
                        }
                    }
                }
            }
            if (k82Var == null) {
                k82Var = new k82();
                k82Var.a = new ArrayList();
                k82Var.d = null;
                k82Var.e = -1;
                int i8 = k82.f;
                k82.f = i8 + 1;
                k82Var.b = i8;
                k82Var.c = i2;
            }
            arrayList.add(k82Var);
        }
        ArrayList arrayList2 = k82Var.a;
        if (arrayList2.contains(qrVar)) {
            return k82Var;
        }
        arrayList2.add(qrVar);
        if (qrVar instanceof cl0) {
            cl0 cl0Var = (cl0) qrVar;
            cl0Var.s0.c(cl0Var.t0 == 0 ? 1 : 0, k82Var, arrayList);
        }
        int i9 = k82Var.b;
        if (i2 == 0) {
            qrVar.m0 = i9;
            qrVar.H.c(i2, k82Var, arrayList);
            qrVar.J.c(i2, k82Var, arrayList);
        } else {
            qrVar.n0 = i9;
            qrVar.I.c(i2, k82Var, arrayList);
            qrVar.L.c(i2, k82Var, arrayList);
            qrVar.K.c(i2, k82Var, arrayList);
        }
        qrVar.O.c(i2, k82Var, arrayList);
        return k82Var;
    }

    public static float e(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return v40.b(edgeEffect);
        }
        return 0.0f;
    }

    public static String h() throws Throwable {
        BufferedReader bufferedReader;
        if (f == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f = Application.getProcessName();
            } else {
                int iMyPid = g;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    g = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                strTrim = null;
                try {
                    if (iMyPid > 0) {
                        try {
                            StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                            sb.append("/proc/");
                            sb.append(iMyPid);
                            sb.append("/cmdline");
                            String string = sb.toString();
                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                            try {
                                bufferedReader = new BufferedReader(new FileReader(string));
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                try {
                                    String line = bufferedReader.readLine();
                                    gu2.o(line);
                                    strTrim = line.trim();
                                    bufferedReader.close();
                                } catch (IOException unused) {
                                    if (bufferedReader != null) {
                                        bufferedReader.close();
                                    }
                                    f = strTrim;
                                    return f;
                                } catch (Throwable th) {
                                    th = th;
                                    bufferedReader2 = bufferedReader;
                                    if (bufferedReader2 != null) {
                                        try {
                                            bufferedReader2.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th2;
                            }
                        } catch (IOException unused3) {
                            bufferedReader = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (IOException unused4) {
                }
                f = strTrim;
            }
        }
        return f;
    }

    public static final boolean j(Context context, String str) {
        List<ResolveInfo> listQueryIntentActivities;
        context.getClass();
        str.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            listQueryIntentActivities = packageManager.queryIntentActivities(intent, 64);
        } else {
            listQueryIntentActivities = null;
        }
        if (listQueryIntentActivities == null) {
            return false;
        }
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (!Intrinsics.areEqual(activityInfo.name, "com.facebook.CustomTabActivity") || !Intrinsics.areEqual(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static final void k(Context context) {
        ActivityInfo activityInfo;
        context.getClass();
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
                activityInfo = null;
            }
        } else {
            activityInfo = null;
        }
        if (activityInfo == null) {
            Log.w("dw0", "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
        }
    }

    public static void l(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void m(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        l(jArr, jArr4);
        l(jArr2, jArr5);
        long[] jArr6 = new long[26];
        n(jArr4[0], jArr5[0], jArr6, 0);
        n(jArr4[1], jArr5[1], jArr6, 2);
        n(jArr4[2], jArr5[2], jArr6, 4);
        n(jArr4[3], jArr5[3], jArr6, 6);
        n(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        n(j6 ^ j13, j8 ^ j15, jArr6, 18);
        n(j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        long j19 = j17 ^ jArr4[2];
        long j20 = jArr5[2] ^ j18;
        n(j17, j18, jArr6, 22);
        n(j19, j20, jArr6, 24);
        n(j2, j4, jArr6, 10);
        n(j6, j8, jArr6, 12);
        n(j10, j12, jArr6, 14);
        n(j14, j16, jArr6, 16);
        long j21 = jArr6[0];
        jArr3[0] = j21;
        long j22 = jArr6[9];
        jArr3[9] = j22;
        long j23 = jArr6[0];
        long j24 = j23 ^ jArr6[1];
        long j25 = j24 ^ jArr6[2];
        long j26 = j25 ^ jArr6[10];
        jArr3[1] = j26;
        long j27 = jArr6[3] ^ jArr6[4];
        long j28 = j25 ^ (j27 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j28;
        long j29 = j24 ^ j27;
        long j30 = jArr6[5] ^ jArr6[6];
        long j31 = jArr6[8];
        long j32 = (j29 ^ j30) ^ j31;
        long j33 = jArr6[13] ^ jArr6[14];
        long j34 = jArr6[18];
        long j35 = jArr6[22];
        long j36 = jArr6[24];
        long j37 = (j32 ^ j33) ^ ((j34 ^ j35) ^ j36);
        jArr3[3] = j37;
        long j38 = jArr6[7] ^ j31;
        long j39 = jArr6[9];
        long j40 = j38 ^ j39;
        long j41 = j40 ^ jArr6[17];
        jArr3[8] = j41;
        long j42 = (j40 ^ j30) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j42;
        long j43 = jArr6[19] ^ jArr6[20];
        long j44 = jArr6[25];
        long j45 = jArr6[23];
        long j46 = j43 ^ (j44 ^ j36);
        long j47 = (j46 ^ (j34 ^ j45)) ^ (j42 ^ j26);
        jArr3[4] = j47;
        long j48 = jArr6[21];
        long j49 = (j46 ^ (j28 ^ j41)) ^ (j48 ^ j35);
        jArr3[5] = j49;
        long j50 = (((((j32 ^ j23) ^ j39) ^ j33) ^ j48) ^ j45) ^ j44;
        jArr3[6] = j50;
        jArr3[0] = j21 ^ (j26 << 57);
        jArr3[1] = (j26 >>> 7) ^ (j28 << 50);
        jArr3[2] = (j28 >>> 14) ^ (j37 << 43);
        jArr3[3] = (j37 >>> 21) ^ (j47 << 36);
        jArr3[4] = (j47 >>> 28) ^ (j49 << 29);
        jArr3[5] = (j49 >>> 35) ^ (j50 << 22);
        jArr3[6] = (j50 >>> 42) ^ (j42 << 15);
        jArr3[7] = (j42 >>> 49) ^ (j41 << 8);
        jArr3[8] = (j41 >>> 56) ^ (j22 << 1);
        jArr3[9] = j22 >>> 63;
    }

    public static void n(long j, long j2, long[] jArr, int i2) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i3 = 48;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6);
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 9;
        } while (i3 > 0);
        jArr[i2] = 144115188075855871L & j7;
        jArr[i2 + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void o(long[] jArr, long[] jArr2) {
        for (int i2 = 0; i2 < 4; i2++) {
            bj0.k(i2 << 1, jArr[i2], jArr2);
        }
        jArr2[8] = bj0.j((int) jArr[4]);
    }

    public static boolean p(long[] jArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            if (jArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void q(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        m(jArr, jArr2, jArr4);
        w(jArr4, jArr3);
    }

    public static final void r(String str, String str2) {
        str.getClass();
        if (str.length() > 0) {
            return;
        }
        e.d(ts.k("Argument '", str2, "' cannot be empty"));
    }

    public static final void s(ok0 ok0Var) {
        ok0Var.getClass();
        Iterator it = ok0Var.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                uq1.h("Container 'requests' cannot contain null values");
                return;
            }
        }
        if (ok0Var.isEmpty()) {
            e.d("Container 'requests' cannot be empty");
        }
    }

    public static final void t(String str, String str2) {
        if (str == null || str.length() <= 0) {
            e.d(ts.k("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static float u(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return v40.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static void v(Exception exc) {
        Log.e("AthenaAttr", Log.getStackTraceString(exc));
    }

    public static void w(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static List x(List list) {
        if (list instanceof ro0) {
            return ((ro0) list).m();
        }
        if (list instanceof bz0) {
            return ((bz0) list).a;
        }
        return list instanceof RandomAccess ? new zy0(list) : new bz0(list);
    }

    public static final void y() {
        if (!i90.q.get()) {
            throw new z80("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static void z(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        o(jArr, jArr3);
        w(jArr3, jArr2);
    }

    public final int f() {
        int i2 = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int g() {
        int i2 = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int i(View view) {
        int i2 = this.a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }
}
