package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.TypedValue;
import com.bumptech.glide.a;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.android.material.appbar.AppBarLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zzc;
import com.hjq.toast.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class jw implements a72 {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];
    public static final byte[] c = {112, 114, 111, 0};
    public static final byte[] d = {112, 114, 109, 0};
    public static final int[] e = {R.attr.stateListAnimator};
    public static final or3 f;
    public static final pr3 g;

    static {
        int i = 1;
        f = new or3(i);
        g = new pr3(i);
    }

    public static void A(ByteArrayOutputStream byteArrayOutputStream, k10 k10Var) {
        int i = 0;
        for (Map.Entry entry : k10Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                ta.J(byteArrayOutputStream, iIntValue - i);
                ta.J(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static ep1 B(Set set) {
        ep1 ep1Var = new ep1(2);
        ep1Var.e = g;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            pq3 pq3Var = (pq3) it.next();
            HashMap map = (HashMap) ep1Var.c;
            HashMap map2 = (HashMap) ep1Var.b;
            qt.J(pq3Var, "key");
            boolean z = pq3Var.c;
            if (z) {
                pr3 pr3Var = ep1.W;
                if (!z) {
                    e.g("key must be repeating");
                    return null;
                }
                map2.remove(pq3Var);
                map.put(pq3Var, pr3Var);
            } else {
                or3 or3Var = ep1.w;
                map.remove(pq3Var);
                map2.put(pq3Var, or3Var);
            }
        }
        return ep1Var;
    }

    public static zzaij C(AuthCredential authCredential, String str) {
        gu2.o(authCredential);
        if (authCredential instanceof GoogleAuthCredential) {
            GoogleAuthCredential googleAuthCredential = (GoogleAuthCredential) authCredential;
            return new zzaij(googleAuthCredential.a, googleAuthCredential.b, "google.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (authCredential instanceof FacebookAuthCredential) {
            return new zzaij((String) null, ((FacebookAuthCredential) authCredential).a, "facebook.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (authCredential instanceof TwitterAuthCredential) {
            TwitterAuthCredential twitterAuthCredential = (TwitterAuthCredential) authCredential;
            return new zzaij((String) null, twitterAuthCredential.a, "twitter.com", twitterAuthCredential.b, (String) null, str, (String) null, (String) null);
        }
        if (authCredential instanceof GithubAuthCredential) {
            return new zzaij((String) null, ((GithubAuthCredential) authCredential).a, "github.com", (String) null, (String) null, str, (String) null, (String) null);
        }
        if (authCredential instanceof PlayGamesAuthCredential) {
            return new zzaij((String) null, (String) null, "playgames.google.com", (String) null, ((PlayGamesAuthCredential) authCredential).a, str, (String) null, (String) null);
        }
        if (!(authCredential instanceof zzc)) {
            e.g("Unsupported credential type.");
            return null;
        }
        zzc zzcVar = (zzc) authCredential;
        zzaij zzaijVar = zzcVar.d;
        return zzaijVar != null ? zzaijVar : new zzaij(zzcVar.b, zzcVar.c, zzcVar.a, zzcVar.f, (String) null, str, zzcVar.e, zzcVar.i);
    }

    public static String D(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char cCharAt = str.charAt(length);
                if (cCharAt == '.' || cCharAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String strConcat = BuildConfig.FLAVOR.concat(str);
        return strConcat.substring(0, Math.min(strConcat.length(), 23));
    }

    public static boolean E(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int F(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (iIntValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (iIntValue >= Level.INFO.intValue()) {
            return 4;
        }
        return iIntValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static final int d(int i, int i2, int[] iArr) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int e(int i, long j, long[] jArr) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static fh1 f(a aVar, ArrayList arrayList) {
        si1 ihVar;
        si1 ejVar;
        byte b2;
        Class cls;
        int i;
        mh mhVar = aVar.a;
        v01 v01Var = aVar.d;
        cj0 cj0Var = aVar.c;
        Context applicationContext = cj0Var.getApplicationContext();
        kj0 kj0Var = cj0Var.h;
        fh1 fh1Var = new fh1();
        ez ezVar = new ez();
        ri2 ri2Var = fh1Var.g;
        synchronized (ri2Var) {
            ((ArrayList) ri2Var.a).add(ezVar);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            p80 p80Var = new p80();
            ri2 ri2Var2 = fh1Var.g;
            synchronized (ri2Var2) {
                ((ArrayList) ri2Var2.a).add(p80Var);
            }
        }
        Resources resources = applicationContext.getResources();
        ArrayList arrayListE = fh1Var.e();
        gj gjVar = new gj(applicationContext, arrayListE, mhVar, v01Var);
        h52 h52Var = new h52(mhVar, new vi(10));
        b30 b30Var = new b30(fh1Var.e(), resources.getDisplayMetrics(), mhVar, v01Var);
        if (i2 < 28 || !((Map) kj0Var.b).containsKey(xi0.class)) {
            dj djVar = new dj(b30Var, 0);
            ihVar = new ih(2, b30Var, v01Var);
            ejVar = djVar;
        } else {
            ej ejVar2 = new ej(1);
            ejVar = new ej(0);
            ihVar = ejVar2;
        }
        if (i2 >= 28) {
            int i3 = 1;
            fh1Var.d("Animation", InputStream.class, Drawable.class, new v6(new hd2(i3, arrayListE, v01Var), i3));
            hd2 hd2Var = new hd2(i3, arrayListE, v01Var);
            b2 = 0;
            fh1Var.d("Animation", ByteBuffer.class, Drawable.class, new v6(hd2Var, b2));
        } else {
            b2 = 0;
        }
        ui1 ui1Var = new ui1(applicationContext);
        jh jhVar = new jh(v01Var);
        f6 f6Var = new f6(2, b2);
        k42 k42Var = new k42(6);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        fh1Var.a(ByteBuffer.class, new op0(4));
        fh1Var.a(InputStream.class, new gk1(v01Var, 18));
        fh1Var.d("Bitmap", ByteBuffer.class, Bitmap.class, ejVar);
        fh1Var.d("Bitmap", InputStream.class, Bitmap.class, ihVar);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            cls = ParcelFileDescriptor.class;
        } else {
            cls = ParcelFileDescriptor.class;
            fh1Var.d("Bitmap", cls, Bitmap.class, new dj(b30Var, 1));
        }
        fh1Var.d("Bitmap", AssetFileDescriptor.class, Bitmap.class, new h52(mhVar, new w40(9)));
        fh1Var.d("Bitmap", cls, Bitmap.class, h52Var);
        q22 q22Var = q22.b;
        fh1Var.c(Bitmap.class, Bitmap.class, q22Var);
        fh1Var.d("Bitmap", Bitmap.class, Bitmap.class, new sa0(1));
        fh1Var.b(Bitmap.class, jhVar);
        fh1Var.d("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new ih(resources, ejVar));
        fh1Var.d("BitmapDrawable", InputStream.class, BitmapDrawable.class, new ih(resources, ihVar));
        fh1Var.d("BitmapDrawable", cls, BitmapDrawable.class, new ih(resources, h52Var));
        fh1Var.b(BitmapDrawable.class, new hs1(2, mhVar, jhVar));
        fh1Var.d("Animation", InputStream.class, li0.class, new au1(arrayListE, gjVar, v01Var));
        fh1Var.d("Animation", ByteBuffer.class, li0.class, gjVar);
        fh1Var.b(li0.class, new j10(6));
        fh1Var.c(gt1.class, gt1.class, q22Var);
        fh1Var.d("Bitmap", gt1.class, Bitmap.class, new kh(mhVar));
        fh1Var.d("legacy_append", Uri.class, Drawable.class, ui1Var);
        fh1Var.d("legacy_append", Uri.class, Bitmap.class, new ih(1, ui1Var, mhVar));
        fh1Var.h(new hj(0));
        fh1Var.c(File.class, ByteBuffer.class, new q22(3));
        int i4 = 6;
        fh1Var.c(File.class, InputStream.class, new xa0(new r41(i4)));
        fh1Var.d("legacy_append", File.class, File.class, new sa0(0));
        fh1Var.c(File.class, cls, new xa0(new c11(i4)));
        fh1Var.c(File.class, File.class, q22Var);
        fh1Var.h(new kq0(v01Var));
        if ("robolectric".equals(str)) {
            i = 2;
        } else {
            i = 2;
            fh1Var.h(new hj(i));
        }
        u10 u10Var = new u10(applicationContext, i);
        u10 u10Var2 = new u10(applicationContext, 0);
        u10 u10Var3 = new u10(applicationContext, 1);
        Class cls2 = Integer.TYPE;
        fh1Var.c(cls2, InputStream.class, u10Var);
        fh1Var.c(Integer.class, InputStream.class, u10Var);
        fh1Var.c(cls2, AssetFileDescriptor.class, u10Var2);
        fh1Var.c(Integer.class, AssetFileDescriptor.class, u10Var2);
        fh1Var.c(cls2, Drawable.class, u10Var3);
        fh1Var.c(Integer.class, Drawable.class, u10Var3);
        fh1Var.c(Uri.class, InputStream.class, new u10(applicationContext, 7));
        fh1Var.c(Uri.class, AssetFileDescriptor.class, new u10(applicationContext, 6));
        yi1 yi1Var = new yi1(resources, 2);
        yi1 yi1Var2 = new yi1(resources, 0);
        yi1 yi1Var3 = new yi1(resources, 1);
        fh1Var.c(Integer.class, Uri.class, yi1Var);
        fh1Var.c(cls2, Uri.class, yi1Var);
        fh1Var.c(Integer.class, AssetFileDescriptor.class, yi1Var2);
        fh1Var.c(cls2, AssetFileDescriptor.class, yi1Var2);
        fh1Var.c(Integer.class, InputStream.class, yi1Var3);
        fh1Var.c(cls2, InputStream.class, yi1Var3);
        fh1Var.c(String.class, InputStream.class, new zx(0));
        fh1Var.c(Uri.class, InputStream.class, new zx(0));
        fh1Var.c(String.class, InputStream.class, new q22(6));
        int i5 = 5;
        fh1Var.c(String.class, cls, new q22(i5));
        int i6 = 4;
        fh1Var.c(String.class, AssetFileDescriptor.class, new q22(i6));
        fh1Var.c(Uri.class, InputStream.class, new yb(applicationContext.getAssets(), 1));
        fh1Var.c(Uri.class, AssetFileDescriptor.class, new yb(applicationContext.getAssets(), 0));
        fh1Var.c(Uri.class, InputStream.class, new u10(applicationContext, i6));
        fh1Var.c(Uri.class, InputStream.class, new u10(applicationContext, i5));
        if (i2 >= 29) {
            fh1Var.c(Uri.class, InputStream.class, new ee1(applicationContext, InputStream.class));
            fh1Var.c(Uri.class, cls, new ee1(applicationContext, cls));
        }
        boolean zContainsKey = ((Map) kj0Var.b).containsKey(bj0.class);
        fh1Var.c(Uri.class, InputStream.class, new p32(contentResolver, zContainsKey, 2));
        fh1Var.c(Uri.class, cls, new p32(contentResolver, zContainsKey, 1));
        int i7 = 0;
        fh1Var.c(Uri.class, AssetFileDescriptor.class, new p32(contentResolver, zContainsKey, i7));
        fh1Var.c(Uri.class, InputStream.class, new q22(8));
        fh1Var.c(URL.class, InputStream.class, new q22(7));
        fh1Var.c(Uri.class, File.class, new u10(applicationContext, 3));
        fh1Var.c(jj0.class, InputStream.class, new zx(1));
        fh1Var.c(byte[].class, ByteBuffer.class, new q22(1));
        int i8 = 2;
        fh1Var.c(byte[].class, InputStream.class, new q22(i8));
        fh1Var.c(Uri.class, Uri.class, q22Var);
        fh1Var.c(Drawable.class, Drawable.class, q22Var);
        fh1Var.d("legacy_append", Drawable.class, Drawable.class, new sa0(i8));
        fh1Var.i(Bitmap.class, BitmapDrawable.class, new wa(resources, 6));
        fh1Var.i(Bitmap.class, byte[].class, f6Var);
        fh1Var.i(Drawable.class, byte[].class, new ac2(mhVar, f6Var, k42Var, 20));
        fh1Var.i(li0.class, byte[].class, k42Var);
        h52 h52Var2 = new h52(mhVar, new vl0(9));
        fh1Var.d("legacy_append", ByteBuffer.class, Bitmap.class, h52Var2);
        fh1Var.d("legacy_append", ByteBuffer.class, BitmapDrawable.class, new ih(resources, h52Var2));
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            OkHttpGlideModule okHttpGlideModule = (OkHttpGlideModule) obj;
            try {
                okHttpGlideModule.a(fh1Var);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(okHttpGlideModule.getClass().getName()), e2);
            }
        }
        return fh1Var;
    }

    public static byte[] g(k10[] k10VarArr, byte[] bArr) throws IOException {
        int length = 0;
        for (k10 k10Var : k10VarArr) {
            length += ((((k10Var.g * 2) + 7) & (-8)) / 8) + (k10Var.e * 2) + k(k10Var.a, k10Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + k10Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, qt.e)) {
            for (k10 k10Var2 : k10VarArr) {
                y(byteArrayOutputStream, k10Var2, k(k10Var2.a, k10Var2.b, bArr));
                A(byteArrayOutputStream, k10Var2);
                int[] iArr = k10Var2.h;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    ta.J(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                z(byteArrayOutputStream, k10Var2);
            }
        } else {
            for (k10 k10Var3 : k10VarArr) {
                y(byteArrayOutputStream, k10Var3, k(k10Var3.a, k10Var3.b, bArr));
            }
            for (k10 k10Var4 : k10VarArr) {
                A(byteArrayOutputStream, k10Var4);
                int[] iArr2 = k10Var4.h;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    ta.J(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                z(byteArrayOutputStream, k10Var4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static qt h(String str, Bundle bundle) {
        str.getClass();
        bundle.getClass();
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1678407252) {
                if (iHashCode != -543568185) {
                    if (iHashCode == -95037569 && str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                            string.getClass();
                            return new qt(string, bundle);
                        } catch (Exception unused) {
                            throw new tg0();
                        }
                    }
                } else if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return new qt("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, false);
                }
            } else if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                try {
                    String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON");
                    string2.getClass();
                    new Bundle().putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", string2);
                    qt qtVar = new qt();
                    if (string2.length() != 0) {
                        try {
                            new JSONObject(string2);
                            return qtVar;
                        } catch (Exception unused2) {
                        }
                    }
                    throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
                } catch (Exception unused3) {
                    throw new tg0();
                }
            }
            throw new tg0();
        } catch (tg0 unused4) {
            qt qtVar2 = new qt();
            if (str.length() > 0) {
                return qtVar2;
            }
            e.g("type should not be empty");
            return null;
        }
    }

    public static final b70 i(Enum[] enumArr) {
        enumArr.getClass();
        return new b70(enumArr);
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String k(String str, String str2, byte[] bArr) {
        byte[] bArr2 = qt.f;
        byte[] bArr3 = qt.g;
        Object obj = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return ts.l(ts.m(str), (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static void l(Context context) {
        context.getClass();
        if (xh.a() != null) {
            xh.a();
            return;
        }
        xh xhVar = new xh(context);
        Set set = mt.a;
        if (!set.contains(xh.class)) {
            try {
                if (!set.contains(xhVar)) {
                    try {
                        co coVarX = co.x((Context) xhVar.b);
                        coVarX.getClass();
                        coVarX.E(xhVar, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        mt.a(xhVar, th);
                    }
                }
            } catch (Throwable th2) {
                mt.a(xh.class, th2);
            }
        }
        if (!mt.a.contains(xh.class)) {
            try {
                xh.c = xhVar;
            } catch (Throwable th3) {
                mt.a(xh.class, th3);
            }
        }
        xh.a();
    }

    public static yh2 m(Context context) {
        gu2.o(context);
        return new yh2(context, new ui2());
    }

    public static int[] n(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iZ = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iZ += (int) ta.z(byteArrayInputStream, 2);
            iArr[i2] = iZ;
        }
        return iArr;
    }

    public static k10[] o(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, k10[] k10VarArr) throws IOException {
        byte[] bArr3 = qt.h;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, qt.i)) {
                uq1.q("Unsupported meta version");
                return null;
            }
            int iZ = (int) ta.z(fileInputStream, 2);
            byte[] bArrY = ta.y(fileInputStream, (int) ta.z(fileInputStream, 4), (int) ta.z(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                uq1.q("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrY);
            try {
                k10[] k10VarArrQ = q(byteArrayInputStream, bArr2, iZ, k10VarArr);
                byteArrayInputStream.close();
                return k10VarArrQ;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(qt.c, bArr2)) {
            uq1.q("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            uq1.q("Unsupported meta version");
            return null;
        }
        int iZ2 = (int) ta.z(fileInputStream, 1);
        byte[] bArrY2 = ta.y(fileInputStream, (int) ta.z(fileInputStream, 4), (int) ta.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            uq1.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrY2);
        try {
            k10[] k10VarArrP = p(byteArrayInputStream2, iZ2, k10VarArr);
            byteArrayInputStream2.close();
            return k10VarArrP;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static k10[] p(ByteArrayInputStream byteArrayInputStream, int i, k10[] k10VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new k10[0];
        }
        if (i != k10VarArr.length) {
            uq1.q("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iZ = (int) ta.z(byteArrayInputStream, 2);
            iArr[i2] = (int) ta.z(byteArrayInputStream, 2);
            strArr[i2] = new String(ta.x(byteArrayInputStream, iZ), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            k10 k10Var = k10VarArr[i3];
            if (!k10Var.b.equals(strArr[i3])) {
                uq1.q("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            k10Var.e = i4;
            k10Var.h = n(byteArrayInputStream, i4);
        }
        return k10VarArr;
    }

    public static k10[] q(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, k10[] k10VarArr) {
        k10 k10Var;
        if (byteArrayInputStream.available() == 0) {
            return new k10[0];
        }
        if (i != k10VarArr.length) {
            uq1.q("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ta.z(byteArrayInputStream, 2);
            String str = new String(ta.x(byteArrayInputStream, (int) ta.z(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jZ = ta.z(byteArrayInputStream, 4);
            int iZ = (int) ta.z(byteArrayInputStream, 2);
            if (k10VarArr.length <= 0) {
                k10Var = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= k10VarArr.length) {
                    k10Var = null;
                    break;
                }
                if (k10VarArr[i3].b.equals(strSubstring)) {
                    k10Var = k10VarArr[i3];
                    break;
                }
                i3++;
            }
            if (k10Var == null) {
                uq1.q("Missing profile key: ".concat(str));
                return null;
            }
            k10Var.d = jZ;
            int[] iArrN = n(byteArrayInputStream, iZ);
            if (Arrays.equals(bArr, qt.g)) {
                k10Var.e = iZ;
                k10Var.h = iArrN;
            }
        }
        return k10VarArr;
    }

    public static k10[] r(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, qt.d)) {
            uq1.q("Unsupported version");
            return null;
        }
        int iZ = (int) ta.z(fileInputStream, 1);
        byte[] bArrY = ta.y(fileInputStream, (int) ta.z(fileInputStream, 4), (int) ta.z(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            uq1.q("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrY);
        try {
            k10[] k10VarArrS = s(byteArrayInputStream, str, iZ);
            byteArrayInputStream.close();
            return k10VarArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static k10[] s(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new k10[0];
        }
        k10[] k10VarArr = new k10[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iZ = (int) ta.z(byteArrayInputStream, 2);
            int iZ2 = (int) ta.z(byteArrayInputStream, 2);
            k10VarArr[i3] = new k10(str, new String(ta.x(byteArrayInputStream, iZ), StandardCharsets.UTF_8), ta.z(byteArrayInputStream, 4), iZ2, (int) ta.z(byteArrayInputStream, 4), (int) ta.z(byteArrayInputStream, 4), new int[iZ2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            k10 k10Var = k10VarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = k10Var.f;
            int i6 = k10Var.g;
            TreeMap treeMap = k10Var.i;
            int i7 = iAvailable - i5;
            int iZ3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iZ3 += (int) ta.z(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iZ3), 1);
                int iZ4 = (int) ta.z(byteArrayInputStream, 2);
                while (iZ4 > 0) {
                    ta.z(byteArrayInputStream, 2);
                    int iZ5 = (int) ta.z(byteArrayInputStream, 1);
                    if (iZ5 != 6 && iZ5 != 7) {
                        while (iZ5 > 0) {
                            ta.z(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iZ6 = (int) ta.z(byteArrayInputStream, 1); iZ6 > 0; iZ6--) {
                                ta.z(byteArrayInputStream, 2);
                            }
                            iZ5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iZ4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                uq1.q("Read too much data during profile line parse");
                return null;
            }
            k10Var.h = n(byteArrayInputStream, k10Var.e);
            BitSet bitSetValueOf = BitSet.valueOf(ta.x(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return k10VarArr;
    }

    public static TypedValue t(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean u(Context context, int i, boolean z) {
        TypedValue typedValueT = t(context, i);
        if (typedValueT == null || typedValueT.type != 18) {
            return z;
        }
        return typedValueT.data != 0;
    }

    public static TypedValue v(int i, Context context, String str) {
        TypedValue typedValueT = t(context, i);
        if (typedValueT != null) {
            return typedValueT;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void w(AppBarLayout appBarLayout, float f2) {
        int integer = appBarLayout.getResources().getInteger(2131361794);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, 2130969714, -2130969715}, ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(appBarLayout, "elevation", f2).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(appBarLayout, "elevation", 0.0f).setDuration(0L));
        appBarLayout.setStateListAnimator(stateListAnimator);
    }

    public static boolean x(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, k10[] k10VarArr) throws IOException {
        int i;
        long j;
        int length;
        byte[] bArr2 = qt.g;
        byte[] bArr3 = qt.f;
        byte[] bArr4 = qt.c;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = qt.d;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrG = g(k10VarArr, bArr5);
                ta.I(byteArrayOutputStream, k10VarArr.length, 1);
                ta.I(byteArrayOutputStream, bArrG.length, 4);
                byte[] bArrD = ta.d(bArrG);
                ta.I(byteArrayOutputStream, bArrD.length, 4);
                byteArrayOutputStream.write(bArrD);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                ta.I(byteArrayOutputStream, k10VarArr.length, 1);
                for (k10 k10Var : k10VarArr) {
                    int size = k10Var.i.size() * 4;
                    String strK = k(k10Var.a, k10Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    ta.J(byteArrayOutputStream, strK.getBytes(charset).length);
                    ta.J(byteArrayOutputStream, k10Var.h.length);
                    ta.I(byteArrayOutputStream, size, 4);
                    ta.I(byteArrayOutputStream, k10Var.c, 4);
                    byteArrayOutputStream.write(strK.getBytes(charset));
                    Iterator it = k10Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        ta.J(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        ta.J(byteArrayOutputStream, 0);
                    }
                    for (int i3 : k10Var.h) {
                        ta.J(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = qt.e;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrG2 = g(k10VarArr, bArr6);
                ta.I(byteArrayOutputStream, k10VarArr.length, 1);
                ta.I(byteArrayOutputStream, bArrG2.length, 4);
                byte[] bArrD2 = ta.d(bArrG2);
                ta.I(byteArrayOutputStream, bArrD2.length, 4);
                byteArrayOutputStream.write(bArrD2);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            ta.J(byteArrayOutputStream, k10VarArr.length);
            for (k10 k10Var2 : k10VarArr) {
                String str = k10Var2.a;
                TreeMap treeMap = k10Var2.i;
                String strK2 = k(str, k10Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                ta.J(byteArrayOutputStream, strK2.getBytes(charset2).length);
                ta.J(byteArrayOutputStream, treeMap.size());
                ta.J(byteArrayOutputStream, k10Var2.h.length);
                ta.I(byteArrayOutputStream, k10Var2.c, 4);
                byteArrayOutputStream.write(strK2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    ta.J(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : k10Var2.h) {
                    ta.J(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            ta.J(byteArrayOutputStream2, k10VarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (k10 k10Var3 : k10VarArr) {
                ta.I(byteArrayOutputStream2, k10Var3.c, 4);
                ta.I(byteArrayOutputStream2, k10Var3.d, 4);
                ta.I(byteArrayOutputStream2, k10Var3.g, 4);
                String strK3 = k(k10Var3.a, k10Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strK3.getBytes(charset3).length;
                ta.J(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strK3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ma2 ma2Var = new ma2(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(ma2Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < k10VarArr.length) {
                try {
                    k10 k10Var4 = k10VarArr[i7];
                    ta.J(byteArrayOutputStream3, i7);
                    ta.J(byteArrayOutputStream3, k10Var4.e);
                    i8 = i8 + 4 + (k10Var4.e * i5);
                    int[] iArr = k10Var4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        ta.J(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ma2 ma2Var2 = new ma2(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(ma2Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < k10VarArr.length; i13++) {
                try {
                    k10 k10Var5 = k10VarArr[i13];
                    Iterator it3 = k10Var5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        z(byteArrayOutputStream5, k10Var5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            A(byteArrayOutputStream6, k10Var5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            ta.J(byteArrayOutputStream4, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            ta.I(byteArrayOutputStream4, length4, 4);
                            ta.J(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i14 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            ma2 ma2Var3 = new ma2(4, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(ma2Var3);
            long size2 = 12 + ((long) (arrayList.size() * 16));
            ta.I(byteArrayOutputStream, arrayList.size(), 4);
            int i15 = 0;
            while (i15 < arrayList.size()) {
                ma2 ma2Var4 = (ma2) arrayList.get(i15);
                int i16 = ma2Var4.a;
                byte[] bArr7 = ma2Var4.b;
                if (i16 != 1) {
                    i = i11;
                    if (i16 == i) {
                        j = 1;
                    } else if (i16 == 3) {
                        j = 2;
                    } else if (i16 == 4) {
                        j = 3;
                    } else {
                        if (i16 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                ta.I(byteArrayOutputStream, j, 4);
                ta.I(byteArrayOutputStream, size2, 4);
                if (ma2Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrD3 = ta.d(bArr7);
                    arrayList2.add(bArrD3);
                    ta.I(byteArrayOutputStream, bArrD3.length, 4);
                    ta.I(byteArrayOutputStream, length5, 4);
                    length = bArrD3.length;
                } else {
                    arrayList2.add(bArr7);
                    ta.I(byteArrayOutputStream, bArr7.length, 4);
                    ta.I(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                i11 = i;
            }
            for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i17));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static void y(ByteArrayOutputStream byteArrayOutputStream, k10 k10Var, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        ta.J(byteArrayOutputStream, str.getBytes(charset).length);
        ta.J(byteArrayOutputStream, k10Var.e);
        ta.I(byteArrayOutputStream, k10Var.f, 4);
        ta.I(byteArrayOutputStream, k10Var.c, 4);
        ta.I(byteArrayOutputStream, k10Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void z(ByteArrayOutputStream byteArrayOutputStream, k10 k10Var) throws IOException {
        byte[] bArr = new byte[(((k10Var.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : k10Var.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + k10Var.g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    @Override // defpackage.a72
    public void b() {
    }

    @Override // defpackage.a72
    public void c() {
    }
}
