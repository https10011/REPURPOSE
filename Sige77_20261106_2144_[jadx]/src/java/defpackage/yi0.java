package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.EnumMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Charsets;
import kotlin.text.d;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class yi0 implements na2 {
    public static boolean W;
    public static Class X;
    public static boolean Y;
    public static Field Z;
    public static final vy2 a;
    public static boolean a0;
    public static final vy2 b;
    public static Field b0;
    public static boolean c0;
    public static Method d;
    public static boolean e;
    public static Field w;
    public static final Object c = new Object();
    public static final String[] f = {"openinstall.io", "deepinstall.com"};
    public static final String[] i = {"openinstall.io", "openlink.cc"};
    public static int v = 0;

    static {
        int i2 = 4;
        a = new vy2("UNDEFINED", i2);
        b = new vy2("REUSABLE_CLAIMED", i2);
    }

    public static String A(int i2, int i3, String str) {
        if (i2 < 0) {
            return gb2.L("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return gb2.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        e.g(ck1.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
        return null;
    }

    public static int B(byte[] bArr, int i2, zk2 zk2Var) throws xm2 {
        int iR = r(bArr, i2, zk2Var);
        int i3 = zk2Var.a;
        if (i3 < 0) {
            tv2.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 == 0) {
            zk2Var.c = BuildConfig.FLAVOR;
            return iR;
        }
        zk2Var.c = qo2.d(bArr, iR, i3);
        return iR + i3;
    }

    public static int C(byte[] bArr, int i2, zk2 zk2Var) throws xm2 {
        int iR = r(bArr, i2, zk2Var);
        int i3 = zk2Var.a;
        if (i3 < 0) {
            tv2.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 > bArr.length - iR) {
            tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        if (i3 == 0) {
            zk2Var.c = hl2.b;
            return iR;
        }
        zk2Var.c = hl2.h(bArr, iR, i3);
        return iR + i3;
    }

    public static int D(Object obj, yn2 yn2Var, byte[] bArr, int i2, int i3, zk2 zk2Var) throws xm2 {
        int iU = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iU = u(i4, bArr, iU, zk2Var);
            i4 = zk2Var.a;
        }
        int i5 = iU;
        if (i4 < 0 || i4 > i3 - i5) {
            tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i6 = zk2Var.d + 1;
        zk2Var.d = i6;
        if (i6 >= 100) {
            tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = i5 + i4;
        yn2Var.h(obj, bArr, i5, i7, zk2Var);
        zk2Var.d--;
        zk2Var.c = obj;
        return i7;
    }

    public static int E(Object obj, yn2 yn2Var, byte[] bArr, int i2, int i3, int i4, zk2 zk2Var) throws xm2 {
        on2 on2Var = (on2) yn2Var;
        int i5 = zk2Var.d + 1;
        zk2Var.d = i5;
        if (i5 >= 100) {
            tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iW = on2Var.w(obj, bArr, i2, i3, i4, zk2Var);
        zk2Var.d--;
        zk2Var.c = obj;
        return iW;
    }

    public static int F(int i2, byte[] bArr, int i3, int i4, um2 um2Var, zk2 zk2Var) {
        fm2 fm2Var = (fm2) um2Var;
        int iR = r(bArr, i3, zk2Var);
        fm2Var.zzh(zk2Var.a);
        while (iR < i4) {
            int iR2 = r(bArr, iR, zk2Var);
            if (i2 != zk2Var.a) {
                break;
            }
            iR = r(bArr, iR2, zk2Var);
            fm2Var.zzh(zk2Var.a);
        }
        return iR;
    }

    public static int G(byte[] bArr, int i2, um2 um2Var, zk2 zk2Var) throws xm2 {
        fm2 fm2Var = (fm2) um2Var;
        int iR = r(bArr, i2, zk2Var);
        int i3 = zk2Var.a + iR;
        while (iR < i3) {
            iR = r(bArr, iR, zk2Var);
            fm2Var.zzh(zk2Var.a);
        }
        if (iR == i3) {
            return iR;
        }
        tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int H(yn2 yn2Var, int i2, byte[] bArr, int i3, int i4, um2 um2Var, zk2 zk2Var) throws xm2 {
        dm2 dm2VarZza = yn2Var.zza();
        yn2 yn2Var2 = yn2Var;
        byte[] bArr2 = bArr;
        int i5 = i4;
        zk2 zk2Var2 = zk2Var;
        int iD = D(dm2VarZza, yn2Var2, bArr2, i3, i5, zk2Var2);
        yn2Var2.f(dm2VarZza);
        zk2Var2.c = dm2VarZza;
        um2Var.add(dm2VarZza);
        while (iD < i5) {
            zk2 zk2Var3 = zk2Var2;
            int i6 = i5;
            int iR = r(bArr2, iD, zk2Var3);
            if (i2 != zk2Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            yn2 yn2Var3 = yn2Var2;
            dm2 dm2VarZza2 = yn2Var3.zza();
            iD = D(dm2VarZza2, yn2Var3, bArr3, iR, i6, zk2Var3);
            yn2Var2 = yn2Var3;
            bArr2 = bArr3;
            i5 = i6;
            zk2Var2 = zk2Var3;
            yn2Var2.f(dm2VarZza2);
            zk2Var2.c = dm2VarZza2;
            um2Var.add(dm2VarZza2);
        }
        return iD;
    }

    public static int I(int i2, byte[] bArr, int i3, int i4, ho2 ho2Var, zk2 zk2Var) throws xm2 {
        if ((i2 >>> 3) == 0) {
            tv2.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iW = w(bArr, i3, zk2Var);
            ho2Var.d(i2, Long.valueOf(zk2Var.b));
            return iW;
        }
        if (i5 == 1) {
            ho2Var.d(i2, Long.valueOf(z(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iR = r(bArr, i3, zk2Var);
            int i6 = zk2Var.a;
            if (i6 < 0) {
                tv2.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return 0;
            }
            if (i6 > bArr.length - iR) {
                tv2.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0;
            }
            if (i6 == 0) {
                ho2Var.d(i2, hl2.b);
            } else {
                ho2Var.d(i2, hl2.h(bArr, iR, i6));
            }
            return iR + i6;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                ho2Var.d(i2, Integer.valueOf(x(bArr, i3)));
                return i3 + 4;
            }
            tv2.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i7 = (i2 & (-8)) | 4;
        ho2 ho2VarA = ho2.a();
        int i8 = zk2Var.d + 1;
        zk2Var.d = i8;
        if (i8 >= 100) {
            tv2.i("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i9 = 0;
        while (i3 < i4) {
            int iR2 = r(bArr, i3, zk2Var);
            int i10 = zk2Var.a;
            if (i10 == i7) {
                i9 = i10;
                i3 = iR2;
                break;
            }
            i3 = I(i10, bArr, iR2, i4, ho2VarA, zk2Var);
            i9 = i10;
        }
        zk2Var.d--;
        if (i3 > i4 || i9 != i7) {
            tv2.i("Failed to parse the message.");
            return 0;
        }
        ho2Var.d(i2, ho2VarA);
        return i3;
    }

    public static int J(int i2, byte[] bArr, int i3, int i4, zk2 zk2Var) throws xm2 {
        if ((i2 >>> 3) == 0) {
            tv2.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return w(bArr, i3, zk2Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return r(bArr, i3, zk2Var) + zk2Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            tv2.i("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = r(bArr, i3, zk2Var);
            i7 = zk2Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = J(i7, bArr, i3, i4, zk2Var);
        }
        if (i3 <= i4 && i7 == i6) {
            return i3;
        }
        tv2.i("Failed to parse the message.");
        return 0;
    }

    public static int a(boolean[] zArr, int i2, int[] iArr, boolean z) {
        int i3 = 0;
        for (int i4 : iArr) {
            int i5 = 0;
            while (i5 < i4) {
                zArr[i2] = z;
                i5++;
                i2++;
            }
            i3 += i4;
            z = !z;
        }
        return i3;
    }

    public static final uq0 b(String str, String str2) {
        uq0 uq0Var = new uq0();
        uq0Var.b = sq0.c;
        Context contextA = i90.a();
        String str3 = null;
        if (contextA != null) {
            try {
                PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                if (packageInfo != null) {
                    str3 = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        uq0Var.d = str3;
        uq0Var.e = str;
        uq0Var.f = str2;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        uq0Var.g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        string.getClass();
        uq0Var.a = string;
        return uq0Var;
    }

    public static final uq0 c(Throwable th, sq0 sq0Var) {
        String str;
        String str2;
        uq0 uq0Var = new uq0();
        uq0Var.b = sq0Var;
        Context contextA = i90.a();
        String string = null;
        Throwable th2 = null;
        if (contextA != null) {
            try {
                PackageInfo packageInfo = contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0);
                str = packageInfo == null ? null : packageInfo.versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        uq0Var.d = str;
        uq0Var.e = th == null ? null : th.getCause() == null ? th.toString() : String.valueOf(th.getCause());
        if (th != null) {
            JSONArray jSONArray = new JSONArray();
            while (th != null && th != th2) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                stackTrace.getClass();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th2 = th;
                th = th.getCause();
            }
            string = jSONArray.toString();
        }
        uq0Var.f = string;
        Long lValueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        uq0Var.g = lValueOf;
        StringBuffer stringBuffer = new StringBuffer();
        int iOrdinal = sq0Var.ordinal();
        if (iOrdinal == 1) {
            str2 = "analysis_log_";
        } else if (iOrdinal == 2) {
            str2 = "anr_log_";
        } else if (iOrdinal == 3) {
            str2 = "crash_log_";
        } else if (iOrdinal != 4) {
            str2 = iOrdinal != 5 ? "Unknown" : "thread_check_log_";
        } else {
            str2 = "shield_log_";
        }
        stringBuffer.append(str2);
        stringBuffer.append(String.valueOf(lValueOf));
        stringBuffer.append(".json");
        String string2 = stringBuffer.toString();
        string2.getClass();
        uq0Var.a = string2;
        return uq0Var;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static byte[] e(ArrayDeque arrayDeque, int i2) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i2) {
            return bArr;
        }
        int length = i2 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i2 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            jArr[i2] = iArr[i2];
        }
        return jArr;
    }

    public static d42 g(int i2) {
        if (i2 != 0) {
            return i2 != 1 ? new lk1() : new sv();
        }
        return new lk1();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static h8 h(String str, Bundle bundle) throws zh0 {
        str.getClass();
        bundle.getClass();
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            Object obj = bundle.get("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            obj.getClass();
                            return obj instanceof byte[] ? new dv(new String((byte[]) obj, Charsets.UTF_8), 1, bundle) : new dv((String) obj, 1, bundle);
                        } catch (Exception unused) {
                            throw new tg0();
                        }
                    }
                    throw new tg0();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string == null) {
                            throw new zh0("The device does not contain a restore credential.", 6);
                        }
                        dv dvVar = new dv("androidx.credentials.TYPE_RESTORE_CREDENTIAL", bundle);
                        if (string.length() != 0) {
                            try {
                                new JSONObject(string);
                                return dvVar;
                            } catch (Exception unused2) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new tg0();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                            String string3 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                            string2.getClass();
                            string3.getClass();
                            return new dv(string3, 2, bundle);
                        } catch (Exception unused3) {
                            throw new tg0();
                        }
                    }
                    throw new tg0();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string4 = bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON");
                            string4.getClass();
                            return new dv(string4, 3, bundle);
                        } catch (Exception unused4) {
                            throw new tg0();
                        }
                    }
                    throw new tg0();
                default:
                    throw new tg0();
            }
        } catch (tg0 unused5) {
            return new dv(str, 0, bundle);
        }
    }

    public static String j(qj qjVar) {
        StringBuilder sb = new StringBuilder(qjVar.size());
        for (int i2 = 0; i2 < qjVar.size(); i2++) {
            byte bA = qjVar.a(i2);
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

    public static int l(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        e.g(ck1.r(i2, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static final uq0 n(File file) {
        sq0 sq0Var;
        file.getClass();
        uq0 uq0Var = new uq0();
        String name = file.getName();
        name.getClass();
        uq0Var.a = name;
        if (d.j(name, "crash_log_", false)) {
            sq0Var = sq0.d;
        } else if (d.j(name, "shield_log_", false)) {
            sq0Var = sq0.e;
        } else if (d.j(name, "thread_check_log_", false)) {
            sq0Var = sq0.f;
        } else if (d.j(name, "analysis_log_", false)) {
            sq0Var = sq0.b;
        } else {
            sq0Var = d.j(name, "anr_log_", false) ? sq0.c : sq0.a;
        }
        uq0Var.b = sq0Var;
        JSONObject jSONObjectU = zi0.u(name);
        if (jSONObjectU != null) {
            uq0Var.g = Long.valueOf(jSONObjectU.optLong("timestamp", 0L));
            uq0Var.d = jSONObjectU.optString("app_version", null);
            uq0Var.e = jSONObjectU.optString("reason", null);
            uq0Var.f = jSONObjectU.optString("callstack", null);
            uq0Var.c = jSONObjectU.optJSONArray("feature_names");
        }
        return uq0Var;
    }

    public static final void o(fs fsVar, Object obj) {
        if (!(fsVar instanceof f20)) {
            fsVar.resumeWith(obj);
            return;
        }
        f20 f20Var = (f20) fsVar;
        ys ysVar = f20Var.d;
        gs gsVar = f20Var.e;
        Throwable thA = rj1.a(obj);
        Object vpVar = thA == null ? obj : new vp(thA, false);
        if (ysVar.i(gsVar.getContext())) {
            f20Var.f = vpVar;
            f20Var.c = 1;
            ysVar.e(gsVar.getContext(), f20Var);
            return;
        }
        s70 s70VarA = jx1.a();
        if (s70VarA.c >= 4294967296L) {
            f20Var.f = vpVar;
            f20Var.c = 1;
            fb fbVar = s70VarA.e;
            if (fbVar == null) {
                fbVar = new fb();
                s70VarA.e = fbVar;
            }
            fbVar.addLast(f20Var);
            return;
        }
        s70VarA.m(true);
        try {
            ws0 ws0Var = (ws0) gsVar.getContext().get(k42.c);
            if (ws0Var == null || ws0Var.isActive()) {
                Object obj2 = f20Var.i;
                CoroutineContext context = gsVar.getContext();
                Object objC = ix1.c(context, obj2);
                m22 m22VarC = objC != ix1.a ? vs.c(gsVar, context, objC) : null;
                try {
                    gsVar.resumeWith(obj);
                    Unit unit = Unit.a;
                    if (m22VarC == null || m22VarC.Y()) {
                        ix1.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (m22VarC == null || m22VarC.Y()) {
                        ix1.a(context, objC);
                    }
                    throw th;
                }
            } else {
                f20Var.resumeWith(zi0.i(ws0Var.getCancellationException()));
            }
            while (s70VarA.p()) {
            }
        } catch (Throwable th2) {
            try {
                f20Var.i(th2);
            } finally {
                s70VarA.l(true);
            }
        }
    }

    public static void p(View view, r21 r21Var) {
        z40 z40Var = r21Var.b.c;
        if (z40Var == null || !z40Var.a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        p21 p21Var = r21Var.b;
        if (p21Var.m != elevation) {
            p21Var.m = elevation;
            r21Var.s();
        }
    }

    public static byte[] q(mj mjVar) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i2 = 0;
        while (i2 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i2);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i3 = 0;
            while (i3 < iMin2) {
                int i4 = mjVar.read(bArr, i3, iMin2 - i3);
                if (i4 == -1) {
                    return e(arrayDeque, i2);
                }
                i3 += i4;
                i2 += i4;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (mjVar.read() == -1) {
            return e(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static int r(byte[] bArr, int i2, zk2 zk2Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return u(b2, bArr, i3, zk2Var);
        }
        zk2Var.a = b2;
        return i3;
    }

    public static int u(int i2, byte[] bArr, int i3, zk2 zk2Var) {
        byte b2 = bArr[i3];
        int i4 = i3 + 1;
        int i5 = i2 & 127;
        if (b2 >= 0) {
            zk2Var.a = i5 | (b2 << 7);
            return i4;
        }
        int i6 = i5 | ((b2 & 127) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zk2Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & 127) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            zk2Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & 127) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            zk2Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & 127) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                zk2Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static void v(int i2, int i3) {
        String strL;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strL = gb2.L("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    e.g(ck1.s(i3, "negative size: ", new StringBuilder(String.valueOf(i3).length() + 15)));
                    return;
                }
                strL = gb2.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static int w(byte[] bArr, int i2, zk2 zk2Var) {
        long j = bArr[i2];
        int i3 = i2 + 1;
        if (j >= 0) {
            zk2Var.b = j;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j2 = (j & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j2 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        zk2Var.b = j2;
        return i4;
    }

    public static int x(byte[] bArr, int i2) {
        int i3 = bArr[i2] & 255;
        int i4 = bArr[i2 + 1] & 255;
        int i5 = bArr[i2 + 2] & 255;
        return ((bArr[i2 + 3] & 255) << 24) | (i4 << 8) | i3 | (i5 << 16);
    }

    public static void y(int i2, int i3, int i4) {
        String strA;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strA = A(i2, i4, "start index");
            } else {
                strA = (i3 < 0 || i3 > i4) ? A(i3, i4, "end index") : gb2.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strA);
        }
    }

    public static long z(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    public abstract boolean[] i(String str);

    public int k() {
        return 10;
    }

    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) {
        if (str.isEmpty()) {
            e.g("Found empty contents");
            return null;
        }
        int iK = k();
        c60 c60Var = c60.f;
        if (enumMap.containsKey(c60Var)) {
            iK = Integer.parseInt(enumMap.get(c60Var).toString());
        }
        boolean[] zArrI = i(str);
        int length = zArrI.length;
        int i3 = iK + length;
        int iMax = Math.max(200, i3);
        int iMax2 = Math.max(1, 200);
        int i4 = iMax / i3;
        int i5 = (iMax - (length * i4)) / 2;
        hh hhVar = new hh(iMax, iMax2);
        int i6 = 0;
        while (i6 < length) {
            if (zArrI[i6]) {
                hhVar.f(i5, 0, i4, iMax2);
            }
            i6++;
            i5 += i4;
        }
        return hhVar;
    }

    public Task s(FirebaseAuth firebaseAuth, String str, RecaptchaAction recaptchaAction) {
        qp0 qp0Var;
        boolean z = false;
        wa waVar = new wa(27, z);
        waVar.b = this;
        synchronized (firebaseAuth) {
            qp0Var = firebaseAuth.j;
        }
        if (qp0Var != null) {
            synchronized (qp0Var.a) {
                try {
                    kp2 kp2Var = (kp2) qp0Var.c;
                    if (kp2Var != null && kp2Var.a()) {
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                Task taskO = qp0Var.o(str, Boolean.FALSE, recaptchaAction);
                return taskO.continueWithTask(waVar).continueWithTask(new ep1(11, str, qp0Var, recaptchaAction, waVar));
            }
        }
        Task taskT = t(null);
        ud2 ud2Var = new ud2();
        ud2Var.a = recaptchaAction;
        ud2Var.b = firebaseAuth;
        ud2Var.c = str;
        ud2Var.d = waVar;
        return taskT.continueWithTask(ud2Var);
    }

    public abstract Task t(String str);
}
