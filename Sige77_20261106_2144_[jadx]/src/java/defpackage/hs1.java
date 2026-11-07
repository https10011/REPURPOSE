package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.animation.Animation;
import com.google.android.gms.internal.firebase-auth-api.zzahd;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class hs1 implements vi1, a30, mn2, OnFailureListener, cv1 {
    public static hs1 d;
    public static hs1 e;
    public static final Object f = new Object();
    public static hs1 i;
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public hs1(int i2) {
        this.a = i2;
        int i3 = 0;
        switch (i2) {
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                this.b = new HashMap();
                this.c = new z10(0);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                this.b = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.c = bArr;
                for (int i4 = 0; i4 < 128; i4++) {
                    bArr[i4] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.b;
                    if (i3 >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                    } else {
                        bArr[bArr2[i3]] = (byte) i3;
                        i3++;
                    }
                    break;
                }
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                HashMap map = new HashMap();
                this.b = map;
                this.c = new byte[]{-4, 110, 4, -38, -91, 80, -53, 111, 30, -30, -48, -69, -66, 0, 67, -63, -48, -79, 83, -104, 75, 58, -36, 127, -37, -82, -69, -22, -10, 70, 19, 83, 112, 43, 124, -73, 85, 79, -123, -87, -19, -26, -66, 101, -42, 64, 112, -60, 67, -25, -14, -63, -53, -62, 21, -105, -128, -8, -62, -64, 44, -69, 21, -23};
                map.put("cF", "opof");
                map.put("aI", "ihse");
                map.put("pbR", "jgkf");
                map.put("pbH", "pwcf");
                map.put("pbT", "aviw");
                map.put("gR", "nosw");
                map.put("Pk", "jpaw");
                map.put("ul", "qpxs");
                map.put("ts", "qmvzs");
                map.put("iI", "f3ef");
                map.put("mA", "dajg");
                map.put("sN", "kfgf");
                map.put("andI", "mthe");
                map.put("md", "ntrh");
                map.put("bI", "regh");
                map.put("bd", "krtn");
                map.put("buiD", "mrth");
                map.put("ver", "kjfe");
                map.put("verI", "hwef");
                map.put("apV", "fefb");
                map.put("im", "xefb");
                map.put("oa", "effj");
                map.put("ga", "feem");
                map.put("loI", "fuqd");
                map.put("im2", "bwfx");
                map.put("si", "bnwp");
                map.put("waU", "wpxk");
                map.put("verS", "vsna");
                map.put("sU", "iewb");
                map.put("sP", "ncbd");
                map.put("cC", "gpde");
                break;
            default:
                this.b = new StringBuilder();
                this.c = new String[]{"dmJveA==", "Z29sZGZpc2g=", "X3g4Ng==", "YW9zcA==", "c2RrX2dwaG9uZQ==", "c2RrX3Bob25l"};
                break;
        }
    }

    public static hs1 a() {
        if (e == null) {
            synchronized (f) {
                try {
                    if (e == null) {
                        e = new hs1(1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public static synchronized hs1 j(Context context) {
        try {
            if (d == null) {
                d = new hs1(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return d;
    }

    public static boolean l(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    public static hs1 o(Context context, String str) {
        hs1 hs1Var = i;
        if (hs1Var == null || !((String) hs1Var.b).equals(str)) {
            i = new hs1(context, str);
        }
        return i;
    }

    @Override // defpackage.g60
    public boolean b(Object obj, File file, da1 da1Var) {
        return ((jh) this.c).b(new nh((mh) this.b, ((BitmapDrawable) ((pi1) obj).get()).getBitmap()), file, da1Var);
    }

    @Override // defpackage.a30
    public void c(mh mhVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((z70) this.c).b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            mhVar.c(bitmap);
            throw iOException;
        }
    }

    public boolean d(Context context) {
        int i2;
        String str;
        ((StringBuilder) this.b).setLength(0);
        String[] strArr = {"cm8uYnVpbGQuZmxhdm9y", "cm8uYm9hcmQucGxhdGZvcm0=", "cm8uaGFyZHdhcmU="};
        String[] strArr2 = (String[]) this.c;
        for (int i3 = 0; i3 < strArr2.length; i3++) {
            strArr2[i3] = yv2.a(strArr2[i3]);
        }
        int i4 = 0;
        loop1: while (true) {
            if (i4 >= 3) {
                i2 = 0;
                break;
            }
            try {
                Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, yv2.a(strArr[i4]));
                str = objInvoke != null ? (String) objInvoke : null;
            } catch (Exception unused) {
            }
            String str2 = TextUtils.isEmpty(str) ? null : str;
            if (str2 != null) {
                String lowerCase = str2.toLowerCase();
                for (String str3 : strArr2) {
                    if (lowerCase.contains(str3)) {
                        i2 = 5;
                        break loop1;
                    }
                }
            }
            i4++;
        }
        if (!context.getPackageManager().hasSystemFeature(yv2.a("YW5kcm9pZC5oYXJkd2FyZS5ibHVldG9vdGg="))) {
            i2 += 5;
        }
        if (!context.getPackageManager().hasSystemFeature(yv2.a("YW5kcm9pZC5oYXJkd2FyZS5jYW1lcmEuZmxhc2g="))) {
            i2 += 5;
        }
        String[] strArr3 = {"L3N5c3RlbS9mcmFtZXdvcmsveDg2", "L3N5c3RlbS9mcmFtZXdvcmsveDg2XzY0", "L3N5c3RlbS9saWIvbGliY2xjb3JlX3g4Ni5iYw==", "L3N5c3RlbS9saWI2NC9saWJjbGNvcmVfeDg2LmJj", "L3N5c3RlbS9iaW4vbm94LXByb3A=", "L3N5c3RlbS9iaW4vZHJvaWQ0eC1wcm9w", "L3N5c3RlbS9iaW4vdHRWTS1wcm9w", "L3N5c3RlbS9iaW4vbWljcm92aXJ0LXByb3A=", "L3N5c3RlbS9iaW4vbmVtdVZNLXByb3A=", "L3N5c3RlbS9iaW4vYW5kcm9WTS1wcm9w", "L3N5c3RlbS9iaW4vZ2VueW1vdGlvbi12Ym94LXNm", "L3N5c3RlbS9ldGMvaW5pdC5hbmRyb1ZNLnNo", "L3N5c3RlbS9ldGMvbXVtdS1jb25maWdz", "L3N5c3RlbS9hcHAvS2V5Q2hhaW4vb2F0L3g4Ng==", "L3N5c3RlbS9hcHAvS2V5Q2hhaW4vb2F0L3g4Nl82NA==", "L3N5c3RlbS9mcmFtZXdvcmsvb2F0L3g4Ng==", "L3N5c3RlbS9mcmFtZXdvcmsvb2F0L3g4Nl82NA=="};
        for (int i5 = 0; i5 < 17; i5++) {
            if (new File(yv2.a(strArr3[i5])).exists()) {
                i2 += 10;
                break;
            }
        }
        if (new File(yv2.a(new String[]{"L3N5c3RlbS9ldGMvZXhjbHVkZWQtaW5wdXQtZGV2aWNlcy54bWw="}[0])).exists()) {
            i2 = Build.VERSION.SDK_INT < 26 ? i2 + 5 : i2 + 3;
        }
        String[] strArr4 = {"L3N5c3RlbS9mcmFtZXdvcmsvYXJt", "L3N5c3RlbS9mcmFtZXdvcmsvYXJtNjQ="};
        int i6 = 0;
        while (true) {
            if (i6 >= 2) {
                i2 += 7;
                break;
            }
            if (new File(yv2.a(strArr4[i6])).exists()) {
                break;
            }
            i6++;
        }
        return i2 >= 10;
    }

    public void e(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.b).add(y00.l(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override // defpackage.a30
    public void f() {
        nf1 nf1Var = (nf1) this.b;
        synchronized (nf1Var) {
            nf1Var.c = nf1Var.a.length;
        }
    }

    public String g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        byte[] bytes = str.getBytes(vb2.a);
        for (int i2 = 0; i2 < bytes.length; i2++) {
            byte b = bytes[i2];
            byte[] bArr = (byte[]) this.c;
            bytes[i2] = (byte) (b ^ bArr[i2 % bArr.length]);
        }
        byte[] bArrA = new ub2(true, false).a(bytes);
        return new String(bArrA, 0, 0, bArrA.length);
    }

    @Override // defpackage.cv1
    public /* synthetic */ Object get() {
        return ((cf) ((u23) this.b).b).a(((hl2) this.c).k());
    }

    @Override // defpackage.vi1
    public int h(da1 da1Var) {
        return 2;
    }

    public void i(String str, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = (byte[]) this.c;
        int length = str.length();
        while (length > 0 && l(str.charAt(length - 1))) {
            length--;
        }
        int i2 = 0;
        while (i2 < length) {
            while (i2 < length && l(str.charAt(i2))) {
                i2++;
            }
            int i3 = i2 + 1;
            byte b = bArr[str.charAt(i2)];
            while (i3 < length && l(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = bArr[str.charAt(i3)];
            if ((b | b2) < 0) {
                uq1.o("invalid characters encountered in Hex string");
                return;
            } else {
                byteArrayOutputStream.write((b << 4) | b2);
                i2 = i4;
            }
        }
    }

    public String k(String str) {
        SharedPreferences sharedPreferences;
        Context context = (Context) this.c;
        if (context != null) {
            if (((SharedPreferences) this.b) == null) {
                try {
                    sharedPreferences = context.getSharedPreferences("tcrypto", 0);
                    this.b = sharedPreferences;
                } catch (Exception unused) {
                    sharedPreferences = null;
                }
                this.b = sharedPreferences;
            }
            SharedPreferences sharedPreferences2 = (SharedPreferences) this.b;
            if (sharedPreferences2 != null) {
                try {
                    return sharedPreferences2.getString(str, BuildConfig.FLAVOR);
                } catch (Exception unused2) {
                    return BuildConfig.FLAVOR;
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    public void m(String str) {
        y10 y10Var;
        synchronized (this) {
            try {
                y10Var = (y10) ((HashMap) this.b).get(str);
                am2.p(y10Var, "Argument must not be null");
                int i2 = y10Var.b;
                if (i2 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + y10Var.b);
                }
                int i3 = i2 - 1;
                y10Var.b = i3;
                if (i3 == 0) {
                    y10 y10Var2 = (y10) ((HashMap) this.b).remove(str);
                    if (!y10Var2.equals(y10Var)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + y10Var + ", but actually removed: " + y10Var2 + ", safeKey: " + str);
                    }
                    z10 z10Var = (z10) this.c;
                    synchronized (z10Var.a) {
                        try {
                            if (z10Var.a.size() < 10) {
                                z10Var.a.offer(y10Var2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        y10Var.a.unlock();
    }

    public void n(String str, String str2) {
        SharedPreferences sharedPreferences;
        Context context = (Context) this.c;
        if (context == null) {
            return;
        }
        if (((SharedPreferences) this.b) == null) {
            try {
                sharedPreferences = context.getSharedPreferences("tcrypto", 0);
                this.b = sharedPreferences;
            } catch (Exception unused) {
                sharedPreferences = null;
            }
            this.b = sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = (SharedPreferences) this.b;
        if (sharedPreferences2 == null) {
            return;
        }
        try {
            sharedPreferences2.edit().putString(str, str2).apply();
        } catch (Exception unused2) {
        }
    }

    public void onFailure(Exception exc) {
        ((TaskCompletionSource) this.b).setException(exc);
        ci.e((Context) this.c);
    }

    public String p() {
        if (((ox1) this.c) == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ri2 ri2Var = new ri2(byteArrayOutputStream);
        try {
            synchronized (((ox1) this.c)) {
                ((ox1) this.c).t().y().w(ri2Var);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e2) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n" + e2.getMessage());
            return null;
        }
    }

    public String q(String str) {
        String str2;
        ox1 ox1Var = (ox1) this.c;
        if (ox1Var == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (ox1Var) {
                yd2 yd2VarT = ((ox1) this.c).t();
                try {
                    if (f73.a()) {
                        throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
                    }
                    str2 = new String(((mv2) yd2VarT.p(z32.i, mv2.class)).zza(Base64.decode(str, 8)), StandardCharsets.UTF_8);
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            }
            return str2;
        } catch (GeneralSecurityException e3) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n" + e3.getMessage());
            return null;
        }
    }

    @Override // defpackage.mn2
    public void s(an2 an2Var) {
        rd2 rd2Var = (rd2) this.b;
        qq2 qq2Var = (qq2) an2Var;
        if (!TextUtils.isEmpty(qq2Var.e)) {
            rd2Var.z(new p11(qq2Var.e, qq2Var.d, (Object) null, 15));
        } else {
            ((ox1) this.c).z(new zzahd(qq2Var.b, qq2Var.a, Long.valueOf(qq2Var.c)), null, null, Boolean.FALSE, null, rd2Var, this);
        }
    }

    public String toString() {
        switch (this.a) {
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                StringBuilder sb = new StringBuilder(100);
                sb.append(this.c.getClass().getSimpleName());
                sb.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    sb.append((String) arrayList.get(i2));
                    if (i2 < size - 1) {
                        sb.append(", ");
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mn2
    public void zza(String str) {
        ((rd2) this.b).a(kv.m0(str));
    }

    public /* synthetic */ hs1(int i2, Object obj, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    public hs1(ci ciVar, TaskCompletionSource taskCompletionSource, Context context) {
        this.a = 10;
        this.b = taskCompletionSource;
        this.c = context;
        Objects.requireNonNull(ciVar);
    }

    public hs1(ox1 ox1Var, rd2 rd2Var) {
        this.a = 9;
        this.b = rd2Var;
        Objects.requireNonNull(ox1Var);
        this.c = ox1Var;
    }

    public /* synthetic */ hs1(Object obj) {
        this.a = 6;
        this.c = obj;
        this.b = new ArrayList();
    }

    public hs1(Context context) {
        this.a = 0;
        this.c = context.getApplicationContext();
    }

    public hs1(Context context, String str) {
        ox1 ox1VarA;
        this.a = 13;
        this.b = str;
        try {
            f93.a();
            vj vjVar = new vj();
            String strConcat = "com.google.firebase.auth.api.crypto.".concat(str);
            if (context != null) {
                vjVar.a = context;
                vjVar.b = "GenericIdpKeyset";
                vjVar.c = strConcat;
                vjVar.g = q93.a;
                String strConcat2 = "android-keystore://firebear_master_key_id.".concat(str);
                if (strConcat2.startsWith("android-keystore://")) {
                    vjVar.d = strConcat2;
                    ox1VarA = vjVar.a();
                    this.c = ox1VarA;
                    return;
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("need an Android context");
        } catch (IOException e2) {
            e = e2;
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
            ox1VarA = null;
        } catch (GeneralSecurityException e3) {
            e = e3;
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n" + e.getMessage());
            ox1VarA = null;
        }
    }

    public hs1(Animation animation) {
        this.a = 4;
        this.b = animation;
        this.c = null;
    }

    public hs1(Animator animator) {
        this.a = 4;
        this.b = null;
        this.c = animator;
    }
}
