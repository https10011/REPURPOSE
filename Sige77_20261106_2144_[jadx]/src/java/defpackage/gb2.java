package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.common.Feature;
import java.io.File;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class gb2 {
    public static Boolean W;
    public static final ba0 a = new ba0(6);
    public static final int[] b = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] c = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] d = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
    public static final Feature e;
    public static final Feature[] f;
    public static Boolean i;
    public static Boolean v;
    public static Boolean w;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        e = feature;
        f = new Feature[]{feature, new Feature("CREDENTIAL_REGISTRY", 1L), new Feature("CLEAR_REGISTRY", 2L), new Feature("CLEAR_CREATION_OPTIONS", 1L), new Feature("CLEAR_CREDENTIAL_STATE", 1L), new Feature("CREATE_CREDENTIAL", 3L), new Feature("REGISTER_CREATION_OPTIONS", 1L), new Feature("REGISTER_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS", 1L), new Feature("SIGNAL_CREDENTIAL_STATE", 1L), new Feature("CLEAR_EXPORT", 1L), new Feature("IMPORT_CREDENTIALS_FOR_DEVICE_SETUP", 3L), new Feature("EXPORT_CREDENTIALS_TO_DEVICE_SETUP", 3L), new Feature("GET_CREDENTIAL_TRANSFER_CAPABILITIES", 3L)};
    }

    public gb2() {
        new ConcurrentHashMap();
    }

    public static void A(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j6 ^ (j8 >>> 31);
        long j10 = (j5 ^ ((j8 >>> 41) ^ (j8 << 33))) ^ (j7 >>> 31);
        long j11 = ((j4 ^ (j8 << 23)) ^ ((j7 >>> 41) ^ (j7 << 33))) ^ (j9 >>> 31);
        long j12 = j ^ (j10 << 23);
        long j13 = (j2 ^ (j9 << 23)) ^ ((j10 >>> 41) ^ (j10 << 33));
        long j14 = ((j3 ^ (j7 << 23)) ^ ((j9 >>> 41) ^ (j9 << 33))) ^ (j10 >>> 31);
        long j15 = j11 >>> 41;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = (j15 << 10) ^ j13;
        jArr2[2] = j14;
        jArr2[3] = 2199023255551L & j11;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003c  */
    public static void B(int[] iArr, int i2) {
        if (i2 == 0) {
            if (iArr[6] == -1) {
                return;
            } else {
                return;
            }
        }
        long j = ((long) i2) & 4294967295L;
        long j2 = (6803 * j) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j4;
        if (((j4 >>> 32) != 0 ? kv.L(7, 3, iArr) : 0) == 0) {
            if (iArr[6] == -1 || !g93.s(iArr, b)) {
                return;
            }
        }
        kv.d(7, 6803, iArr);
    }

    public static Executor C(Executor executor, vd0 vd0Var) {
        executor.getClass();
        return executor == t10.a ? executor : new n51(executor, vd0Var);
    }

    public static void D(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        g93.F(iArr, iArr3);
        z(iArr3, iArr2);
    }

    public static void E(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        t(jArr, jArr3);
        A(jArr3, jArr2);
    }

    public static void F(int i2, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        g93.F(iArr, iArr3);
        z(iArr3, iArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            g93.F(iArr2, iArr3);
            z(iArr3, iArr2);
        }
    }

    public static void G(int i2, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        t(jArr, jArr3);
        A(jArr3, jArr2);
        while (true) {
            i2--;
            if (i2 <= 0) {
                return;
            }
            t(jArr2, jArr3);
            A(jArr3, jArr2);
        }
    }

    public static void H(int[] iArr, int[] iArr2, int[] iArr3) {
        if (g93.G(iArr, iArr2, iArr3) != 0) {
            kv.g0(7, 6803, iArr3);
        }
    }

    public static ac2 I(int i2, n90 n90Var) {
        return new ac2(new ac1(i2), n90Var, a);
    }

    public static int J(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 != 3) {
            return i2 != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int K(int i2, int i3) {
        if (i3 < 0) {
            e.g("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i3 <= i2) {
            return i2;
        }
        int iHighestOneBit = i2 + (i2 >> 1) + 1;
        if (iHighestOneBit < i3) {
            iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public static String L(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(M(objArr[i2]));
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(M(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String M(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strL = y00.l(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(strL.length() + 8 + name2.length() + 1);
            ts.r(sb, "<", strL, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static int b(byte b2, byte b3, byte b4, byte b5) {
        return ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8) | (b5 & 255);
    }

    public static int c(byte[] bArr, int i2) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        return b(bArr[i2 + 3], bArr[i2 + 2], bArr[i2 + 1], bArr[i2]);
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static short e(byte[] bArr, int i2) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte b2 = bArr[i2 + 1];
        return (short) ((bArr[i2] & 255) | (b2 << 8));
    }

    public static long h(byte[] bArr, int i2) {
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byte b2 = bArr[i2 + 7];
        byte b3 = bArr[i2 + 6];
        byte b4 = bArr[i2 + 5];
        byte b5 = bArr[i2 + 4];
        byte b6 = bArr[i2 + 3];
        byte b7 = bArr[i2 + 2];
        byte b8 = bArr[i2 + 1];
        byte b9 = bArr[i2];
        return ((long) b(b6, b7, b8, b9)) | (((long) b(b2, b3, b4, b5)) << 32);
    }

    public static int i(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, za.a(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static ac2 n(String str) {
        str.getClass();
        List listB = StringsKt.B(str, new String[]{";"}, 0, 6);
        if (listB.size() != 3) {
            sm0.c(str, 96, "Failed to split encrypted text `");
            return null;
        }
        byte[] bArrDecode = Base64.decode((String) listB.get(0), 2);
        bArrDecode.getClass();
        byte[] bArrDecode2 = Base64.decode((String) listB.get(1), 2);
        bArrDecode2.getClass();
        byte[] bArrDecode3 = Base64.decode((String) listB.get(2), 2);
        bArrDecode3.getClass();
        return new ac2(bArrDecode, bArrDecode2, bArrDecode3, 12);
    }

    public static me0 o(me0[] me0VarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        me0 me0Var = null;
        int i4 = Integer.MAX_VALUE;
        for (me0 me0Var2 : me0VarArr) {
            int iAbs = (Math.abs(me0Var2.c - i3) * 2) + (me0Var2.d == z ? 0 : 1);
            if (me0Var == null || i4 > iAbs) {
                me0Var = me0Var2;
                i4 = iAbs;
            }
        }
        return me0Var;
    }

    public static final Class p(ju0 ju0Var) {
        ju0Var.getClass();
        Class jClass = ((ClassBasedDeclarationContainer) ju0Var).getJClass();
        if (!jClass.isPrimitive()) {
            return jClass;
        }
        String name = jClass.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? jClass : Double.class;
            case 104431:
                return !name.equals("int") ? jClass : Integer.class;
            case 3039496:
                return !name.equals("byte") ? jClass : Byte.class;
            case 3052374:
                return !name.equals("char") ? jClass : Character.class;
            case 3327612:
                return !name.equals("long") ? jClass : Long.class;
            case 3625364:
                return !name.equals("void") ? jClass : Void.class;
            case 64711720:
                return !name.equals("boolean") ? jClass : Boolean.class;
            case 97526364:
                return !name.equals("float") ? jClass : Float.class;
            case 109413500:
                return !name.equals("short") ? jClass : Short.class;
            default:
                return jClass;
        }
    }

    public static void q(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = (j3 >>> 49) ^ (j4 << 15);
    }

    public static void r(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        q(jArr, jArr4);
        q(jArr2, jArr5);
        s(jArr4[0], jArr5[0], jArr3, 0);
        s(jArr4[1], jArr5[1], jArr3, 1);
        s(jArr4[2], jArr5[2], jArr3, 2);
        s(jArr4[3], jArr5[3], jArr3, 3);
        for (int i2 = 5; i2 > 0; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 1];
        }
        s(jArr4[1] ^ jArr4[0], jArr5[1] ^ jArr5[0], jArr3, 1);
        s(jArr4[3] ^ jArr4[2], jArr5[3] ^ jArr5[2], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[3] ^ jArr5[1];
        s(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        s(j, j3, jArr6, 0);
        s(j2, j4, jArr6, 1);
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
        jArr3[0] = j12 ^ (j13 << 59);
        jArr3[1] = (j13 >>> 5) ^ (j8 << 54);
        jArr3[2] = (j8 >>> 10) ^ (j9 << 49);
        jArr3[3] = (j9 >>> 15) ^ (j10 << 44);
        jArr3[4] = (j10 >>> 20) ^ (j11 << 39);
        jArr3[5] = (j11 >>> 25) ^ (j14 << 34);
        jArr3[6] = (j14 >>> 30) ^ (j15 << 29);
        jArr3[7] = j15 >>> 35;
    }

    public static void s(long j, long j2, long[] jArr, int i2) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j2 << 2;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i3 = (int) j;
        long j7 = (jArr2[(i3 >>> 3) & 7] << 3) ^ jArr2[i3 & 7];
        long j8 = 0;
        int i4 = 54;
        do {
            int i5 = (int) (j >>> i4);
            long j9 = jArr2[i5 & 7] ^ (jArr2[(i5 >>> 3) & 7] << 3);
            j7 ^= j9 << i4;
            j8 ^= j9 >>> (-i4);
            i4 -= 6;
        } while (i4 > 0);
        jArr[i2] = jArr[i2] ^ (576460752303423487L & j7);
        int i6 = i2 + 1;
        jArr[i6] = jArr[i6] ^ ((j7 >>> 59) ^ (j8 << 5));
    }

    public static void t(long[] jArr, long[] jArr2) {
        bj0.k(0, jArr[0], jArr2);
        bj0.k(2, jArr[1], jArr2);
        bj0.k(4, jArr[2], jArr2);
        long j = jArr[3];
        jArr2[6] = bj0.j((int) j);
        jArr2[7] = ((long) bj0.i((int) (j >>> 32))) & 4294967295L;
    }

    public static boolean u(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (i == null) {
            i = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        i.booleanValue();
        if (v == null) {
            v = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (v.booleanValue()) {
            return !nj2.H() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static void v(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        g93.x(iArr, iArr2, iArr4);
        z(iArr4, iArr3);
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        r(jArr, jArr2, jArr4);
        A(jArr4, jArr3);
    }

    public static void z(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[7]) & 4294967295L;
        long j2 = (6803 * j) + (((long) iArr[0]) & 4294967295L);
        int i2 = (int) j2;
        iArr2[0] = i2;
        long j3 = ((long) iArr[8]) & 4294967295L;
        long j4 = (6803 * j3) + j + (((long) iArr[1]) & 4294967295L) + (j2 >>> 32);
        int i3 = (int) j4;
        iArr2[1] = i3;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (6803 * j5) + j3 + (((long) iArr[2]) & 4294967295L) + (j4 >>> 32);
        int i4 = (int) j6;
        iArr2[2] = i4;
        long j7 = ((long) iArr[10]) & 4294967295L;
        long j8 = (6803 * j7) + j5 + (((long) iArr[3]) & 4294967295L) + (j6 >>> 32);
        int i5 = (int) j8;
        iArr2[3] = i5;
        long j9 = ((long) iArr[11]) & 4294967295L;
        long j10 = (6803 * j9) + j7 + (((long) iArr[4]) & 4294967295L) + (j8 >>> 32);
        iArr2[4] = (int) j10;
        long j11 = ((long) iArr[12]) & 4294967295L;
        long j12 = (6803 * j11) + j9 + (((long) iArr[5]) & 4294967295L) + (j10 >>> 32);
        iArr2[5] = (int) j12;
        long j13 = ((long) iArr[13]) & 4294967295L;
        long j14 = (6803 * j13) + j11 + (((long) iArr[6]) & 4294967295L) + (j12 >>> 32);
        iArr2[6] = (int) j14;
        long j15 = (j14 >>> 32) + j13;
        long j16 = j15 & 4294967295L;
        long j17 = (6803 * j16) + (((long) i2) & 4294967295L);
        iArr2[0] = (int) j17;
        long j18 = j15 >>> 32;
        long j19 = (6803 * j18) + j16 + (((long) i3) & 4294967295L) + (j17 >>> 32);
        iArr2[1] = (int) j19;
        long j20 = j18 + (((long) i4) & 4294967295L) + (j19 >>> 32);
        iArr2[2] = (int) j20;
        long j21 = (j20 >>> 32) + (((long) i5) & 4294967295L);
        iArr2[3] = (int) j21;
        if (((j21 >>> 32) == 0 ? 0 : kv.L(7, 4, iArr2)) != 0 || (iArr2[6] == -1 && g93.s(iArr2, b))) {
            kv.d(7, 6803, iArr2);
        }
    }

    public nj0 f(Context context, Looper looper, uy1 uy1Var, Object obj, sj0 sj0Var, tj0 tj0Var) {
        return g(context, looper, uy1Var, obj, (rg2) sj0Var, (rg2) tj0Var);
    }

    public nj0 g(Context context, Looper looper, uy1 uy1Var, Object obj, rg2 rg2Var, rg2 rg2Var2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract Typeface j(Context context, je0 je0Var, Resources resources, int i2);

    public abstract Typeface k(Context context, me0[] me0VarArr, int i2);

    public Typeface l(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface m(Context context, Resources resources, int i2, String str, int i3) {
        File fileA = nj2.A(context);
        if (fileA == null) {
            return null;
        }
        try {
            if (nj2.r(fileA, resources, i2)) {
                return Typeface.createFromFile(fileA.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileA.delete();
        }
    }

    public abstract View x(int i2);

    public abstract boolean y();
}
