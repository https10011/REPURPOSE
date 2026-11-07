package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class op0 implements ls, f2, g60, w10, n90, AppsFlyerRequestListener, na2, m90, hv2, ze3, ff3, g40, ed3, yc3 {
    public final /* synthetic */ int a;
    public static final op0 b = new op0(0);
    public static final op0 c = new op0(1);
    public static final op0 d = new op0(2);
    public static final /* synthetic */ op0 e = new op0(13);
    public static final /* synthetic */ op0 f = new op0(14);
    public static final /* synthetic */ op0 i = new op0(15);
    public static final /* synthetic */ op0 v = new op0(16);
    public static final /* synthetic */ op0 w = new op0(17);
    public static final /* synthetic */ op0 W = new op0(18);

    public /* synthetic */ op0(int i2) {
        this.a = i2;
    }

    public static final boolean n(String str, String str2) {
        HashSet hashSet = t62.e;
        bc1 bc1Var = bc1.a;
        String str3 = null;
        if (!mt.a.contains(bc1.class)) {
            try {
                LinkedHashMap linkedHashMap = bc1.b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th) {
                mt.a(bc1.class, th);
            }
        }
        if (str3 == null) {
            return false;
        }
        if (!Intrinsics.areEqual(str3, "other")) {
            try {
                i90.c().execute(new zs0(7, str3, str2));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static void p(View view, View view2, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        view.getClass();
        str.getClass();
        int iHashCode = view.hashCode();
        HashSet hashSet2 = t62.e;
        HashSet hashSet3 = null;
        if (mt.a.contains(t62.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = t62.e;
            } catch (Throwable th) {
                mt.a(t62.class, th);
                hashSet = null;
            }
        }
        if (hashSet.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        t62 t62Var = new t62(view, view2, str);
        if (!mt.a.contains(g62.class)) {
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    view.setOnClickListener(t62Var);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(view);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj == null) {
                        view.setOnClickListener(t62Var);
                    } else {
                        declaredField2.set(obj, t62Var);
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th2) {
                mt.a(g62.class, th2);
            }
        }
        if (!mt.a.contains(t62.class)) {
            try {
                hashSet3 = t62.e;
            } catch (Throwable th3) {
                mt.a(t62.class, th3);
            }
        }
        hashSet3.add(Integer.valueOf(iHashCode));
    }

    public static hh q(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        int length = bArr[0].length + i3;
        int length2 = bArr.length + i3;
        hh hhVar = new hh(length, length2);
        int[] iArr = hhVar.d;
        int length3 = iArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            iArr[i4] = 0;
        }
        int i5 = (length2 - i2) - 1;
        int i6 = 0;
        while (i6 < bArr.length) {
            byte[] bArr2 = bArr[i6];
            for (int i7 = 0; i7 < bArr[0].length; i7++) {
                if (bArr2[i7] == 1) {
                    hhVar.d(i7 + i2, i5);
                }
            }
            i6++;
            i5--;
        }
        return hhVar;
    }

    public static final void t() {
        if (mt.a.contains(op0.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = i90.a().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            sharedPreferences.edit().clear().apply();
            sharedPreferences2.edit().clear().apply();
            i90.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0).edit().clear().apply();
        } catch (Throwable th) {
            mt.a(op0.class, th);
        }
    }

    public static final void u(ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, boolean z, String str, int i2, boolean z2) {
        Set set = mt.a;
        if (set.contains(op0.class)) {
            return;
        }
        try {
            concurrentHashMap.getClass();
            concurrentHashMap2.getClass();
            str.getClass();
            if (i2 == 0) {
                throw null;
            }
            op0 op0Var = b;
            LinkedHashMap linkedHashMapS = op0Var.s(op0Var.r(concurrentHashMap, z), concurrentHashMap2, str);
            if (set.contains(op0Var)) {
                return;
            }
            try {
                for (Map.Entry entry : linkedHashMapS.entrySet()) {
                    ie.d((String) entry.getKey(), (String) entry.getValue(), z, i2, z2);
                }
            } catch (Throwable th) {
                mt.a(op0Var, th);
            }
        } catch (Throwable th2) {
            mt.a(op0.class, th2);
        }
    }

    public static final void v() {
        if (mt.a.contains(op0.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long jMax = Math.max(Math.max(sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 0L), sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 0L)), 1736528400000L);
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            SharedPreferences sharedPreferences2 = i90.a().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            if (sharedPreferences2.contains("PURCHASE_DETAILS_SET")) {
                Set<String> stringSet = sharedPreferences2.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                copyOnWriteArraySet.addAll(stringSet);
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    try {
                        long j = Long.parseLong((String) StringsKt.B((String) it.next(), new String[]{";"}, 2, 2).get(1)) * 1000;
                        if (Math.abs(String.valueOf(j).length() - 13) < Math.log10(1000.0d)) {
                            jMax = Math.max(jMax, j);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
            sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
            t();
        } catch (Throwable th) {
            mt.a(op0.class, th);
        }
    }

    public static void w(String str, String str2, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        wu1 wu1Var = wu1.a;
        if (mt.a.contains(wu1.class)) {
            zContains = false;
        } else {
            try {
                str.getClass();
                zContains = wu1.c.contains(str);
            } catch (Throwable th) {
                mt.a(wu1.class, th);
                zContains = false;
            }
        }
        if (zContains) {
            pa paVar = new pa(i90.a(), (String) null);
            if (mt.a.contains(paVar)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str2);
                paVar.d(str, bundle);
                return;
            } catch (Throwable th2) {
                mt.a(paVar, th2);
                return;
            }
        }
        if (mt.a.contains(wu1.class)) {
            zContains2 = false;
        } else {
            try {
                str.getClass();
                zContains2 = wu1.d.contains(str);
            } catch (Throwable th3) {
                mt.a(wu1.class, th3);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb = new StringBuilder();
                for (float f2 : fArr) {
                    sb.append(f2);
                    sb.append(",");
                }
                jSONObject.put("dense", sb.toString());
                jSONObject.put("button_text", str2);
                bundle2.putString("metadata", jSONObject.toString());
                String str3 = mk0.j;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                mk0 mk0VarP = vl0.p(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{i90.b()}, 1)), null, null);
                mk0VarP.d = bundle2;
                mk0VarP.c();
            } catch (JSONException unused) {
            }
        }
    }

    public static byte[][] x(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    public static final void y() {
        if (mt.a.contains(op0.class)) {
            return;
        }
        try {
            try {
                i90.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0).edit().putBoolean("APP_HAS_BEEN_LAUNCHED_KEY", true).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            mt.a(op0.class, th);
        }
    }

    public static final void z() {
        if (mt.a.contains(op0.class)) {
            return;
        }
        try {
            y();
            try {
                SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
                long jCurrentTimeMillis = System.currentTimeMillis();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jCurrentTimeMillis).apply();
                sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jCurrentTimeMillis).apply();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            mt.a(op0.class, th);
        }
    }

    @Override // defpackage.g60
    public boolean b(Object obj, File file, da1 da1Var) throws Throwable {
        try {
            kj.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e2);
            return false;
        }
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        vn3VarT.j(uk3.u().b());
        vn3VarT.h(t43.b(((wz2) dx2Var).a));
        return vf3.f((xn3) vn3VarT.d());
    }

    @Override // defpackage.w10
    public File d(hv0 hv0Var) {
        return null;
    }

    @Override // defpackage.g40
    public f40 e(Context context, String str, e40 e40Var) {
        int iB;
        f40 f40Var = new f40();
        int iE = e40Var.e(context, str);
        f40Var.a = iE;
        int i2 = 1;
        int i3 = 0;
        if (iE != 0) {
            iB = e40Var.b(context, str, false);
            f40Var.b = iB;
        } else {
            iB = e40Var.b(context, str, true);
            f40Var.b = iB;
        }
        int i4 = f40Var.a;
        if (i4 == 0) {
            if (iB == 0) {
                i2 = 0;
            }
            f40Var.c = i2;
            return f40Var;
        }
        i3 = i4;
        if (i3 >= iB) {
            i2 = -1;
        }
        f40Var.c = i2;
        return f40Var;
    }

    @Override // defpackage.f2
    public String f() {
        return "refresh_access_token";
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) throws GeneralSecurityException {
        p83 p83Var = (p83) zi0Var;
        gl3 gl3VarY = hl3.y();
        gl3VarY.f();
        ((hl3) gl3VarY.b).zzf = 0;
        kl3 kl3VarC = ha3.c(p83Var.f);
        gl3VarY.f();
        hl3.x((hl3) gl3VarY.b, kl3VarC);
        n83 n83Var = p83Var.f.f;
        if (n83Var.a.equals(j83.e)) {
            byte[] bArrB = ((tr3) p83Var.h.a).b();
            nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
            gl3VarY.f();
            hl3.w((hl3) gl3VarY.b, nr2VarE);
        } else {
            byte[] bArrF = xi0.F(ha3.a(n83Var.a), (BigInteger) p83Var.g.a);
            nr2 nr2VarE2 = jr2.e(bArrF, 0, bArrF.length);
            gl3VarY.f();
            hl3.w((hl3) gl3VarY.b, nr2VarE2);
        }
        return wf3.d("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", ((hl3) gl3VarY.d()).b(), 3, (ip3) ha3.g.E(n83Var.d), p83Var.F());
    }

    @Override // defpackage.yd1
    public Object get() {
        br0 br0Var = new br0(10);
        HashMap map = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            uq1.h("Null flags");
            return null;
        }
        map.put(uc1.a, new de(30000L, 86400000L, set));
        if (set == null) {
            uq1.h("Null flags");
            return null;
        }
        map.put(uc1.c, new de(1000L, 86400000L, set));
        if (set == null) {
            uq1.h("Null flags");
            return null;
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(yl1.b)));
        if (setUnmodifiableSet == null) {
            uq1.h("Null flags");
            return null;
        }
        map.put(uc1.b, new de(86400000L, 86400000L, setUnmodifiableSet));
        if (map.keySet().size() >= uc1.values().length) {
            new HashMap();
            return new ce(br0Var, map);
        }
        uq1.q("Not all priorities have been configured");
        return null;
    }

    @Override // defpackage.ls
    public Object i(Object obj) {
        ((ResponseBody) obj).close();
        return Unit.a;
    }

    @Override // defpackage.n90
    public Object j() {
        return new ArrayList();
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            e.g(ts.j("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            ui3 ui3VarU = ui3.u(xn3Var.A(), wr2.b);
            if (ui3VarU.y().x() != 0) {
                tv2.f("Only version 0 keys are accepted");
                return null;
            }
            qp0 qp0VarB = yy2.b();
            qp0VarB.r(ui3VarU.x().t());
            qp0VarB.u(ui3VarU.y().t());
            qp0VarB.x(ui3VarU.x().y().t());
            qp0VarB.A(ui3VarU.y().A().t());
            qp0VarB.e = h23.b(ui3VarU.y().A().w());
            qp0VarB.f = h23.a(xn3Var.z());
            return qp0VarB.p();
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e2);
        }
    }

    @Override // defpackage.f2
    public String l() {
        return "ig_refresh_token";
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0326  */
    /* JADX WARN: Code duplicated, block: B:219:0x0455 A[LOOP:13: B:218:0x0453->B:219:0x0455, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:222:0x046e  */
    /* JADX WARN: Code duplicated, block: B:223:0x0477  */
    /* JADX WARN: Code duplicated, block: B:27:0x0072  */
    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) throws oa2 {
        int i3;
        em emVar;
        boolean z;
        String str2;
        char c2;
        char c3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        String str3;
        int i11;
        int i12;
        int i13;
        if (i2 != 11) {
            e.g("Can only encode PDF_417, but got ".concat(ts.w(i2)));
            return null;
        }
        c60 c60Var = c60.i;
        boolean zBooleanValue = enumMap.containsKey(c60Var) ? Boolean.valueOf(enumMap.get(c60Var).toString()).booleanValue() : false;
        c60 c60Var2 = c60.v;
        if (enumMap.containsKey(c60Var2)) {
            String string = enumMap.get(c60Var2).toString();
            if (string == null) {
                uq1.h("Name is null");
            } else if (string.equals("AUTO")) {
                i3 = 1;
            } else if (string.equals("TEXT")) {
                i3 = 2;
            } else if (string.equals("BYTE")) {
                i3 = 3;
            } else if (string.equals("NUMERIC")) {
                i3 = 4;
            } else {
                e.g("No enum constant com.google.zxing.pdf417.encoder.Compaction.".concat(string));
            }
            i3 = 0;
        } else {
            i3 = 1;
        }
        c60 c60Var3 = c60.w;
        if (enumMap.containsKey(c60Var3)) {
            enumMap.get(c60Var3).getClass();
            ur.a();
            return null;
        }
        c60 c60Var4 = c60.f;
        int i14 = enumMap.containsKey(c60Var4) ? Integer.parseInt(enumMap.get(c60Var4).toString()) : 30;
        c60 c60Var5 = c60.a;
        int i15 = enumMap.containsKey(c60Var5) ? Integer.parseInt(enumMap.get(c60Var5).toString()) : 2;
        c60 c60Var6 = c60.b;
        Charset charsetForName = enumMap.containsKey(c60Var6) ? Charset.forName(enumMap.get(c60Var6).toString()) : null;
        String str4 = "Error correction level must be between 0 and 8!";
        if (i15 < 0 || i15 > 8) {
            e.g("Error correction level must be between 0 and 8!");
            return null;
        }
        int i16 = 1 << (i15 + 1);
        Charset charset = ka1.e;
        StringBuilder sb = new StringBuilder(str.length());
        if (charsetForName == null) {
            charsetForName = charset;
        } else if (!charset.equals(charsetForName) && (emVar = (em) em.d.get(charsetForName.name())) != null) {
            int i17 = emVar.a[0];
            if (i17 >= 0 && i17 < 900) {
                sb.append((char) 927);
                sb.append((char) i17);
            } else if (i17 < 810900) {
                sb.append((char) 926);
                sb.append((char) ((i17 / 900) - 1));
                sb.append((char) (i17 % 900));
            } else {
                if (i17 >= 811800) {
                    throw new oa2("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i17)));
                }
                sb.append((char) 925);
                sb.append((char) (810900 - i17));
            }
        }
        int length = str.length();
        int iV = ts.v(i3);
        if (iV == 1) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            ka1.c(str, 0, length, sb, 0);
        } else if (iV == 2) {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            byte[] bytes = str.getBytes(charsetForName);
            ka1.a(bytes.length, 1, sb, bytes);
        } else if (iV != 3) {
            int i18 = 0;
            int iC = 0;
            int i19 = 0;
            while (i18 < length) {
                int length2 = str.length();
                char c4 = '0';
                if (i18 < length2) {
                    int i20 = i18;
                    char cCharAt = str.charAt(i18);
                    int i21 = 0;
                    while (cCharAt >= '0' && cCharAt <= '9' && i20 < length2) {
                        i21++;
                        i20++;
                        if (i20 < length2) {
                            cCharAt = str.charAt(i20);
                        }
                    }
                    i10 = i21;
                } else {
                    i10 = 0;
                }
                if (i10 >= 13) {
                    sb.append((char) 902);
                    ka1.b(i18, i10, str, sb);
                    i18 += i10;
                    i19 = 2;
                    iC = 0;
                } else {
                    int length3 = str.length();
                    int i22 = i18;
                    while (true) {
                        if (i22 < length3) {
                            str3 = str4;
                            char cCharAt2 = str.charAt(i22);
                            z3 = zBooleanValue;
                            int i23 = 0;
                            while (i23 < 13 && cCharAt2 >= c4 && cCharAt2 <= '9' && i22 < length3) {
                                i23++;
                                i22++;
                                if (i22 < length3) {
                                    cCharAt2 = str.charAt(i22);
                                }
                                c4 = '0';
                            }
                            if (i23 >= 13) {
                                i11 = (i22 - i18) - i23;
                                break;
                            }
                            if (i23 <= 0) {
                                char cCharAt3 = str.charAt(i22);
                                if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                    i22++;
                                }
                            }
                            zBooleanValue = z3;
                            str4 = str3;
                            c4 = '0';
                        } else {
                            z3 = zBooleanValue;
                            str3 = str4;
                        }
                        i11 = i22 - i18;
                        break;
                    }
                    if (i11 >= 5 || i10 == length) {
                        if (i19 != 0) {
                            sb.append((char) 900);
                            i12 = 0;
                            i19 = 0;
                        } else {
                            i12 = iC;
                        }
                        iC = ka1.c(str, i18, i11, sb, i12);
                        i18 += i11;
                    } else {
                        CharsetEncoder charsetEncoderNewEncoder = charsetForName.newEncoder();
                        int length4 = str.length();
                        int i24 = i18;
                        while (i24 < length4) {
                            char cCharAt4 = str.charAt(i24);
                            int i25 = 0;
                            while (true) {
                                if (i25 >= 13 || cCharAt4 < '0') {
                                    break;
                                }
                                if (cCharAt4 > '9' || (i13 = i24 + (i25 = i25 + 1)) >= length4) {
                                    break;
                                }
                                cCharAt4 = str.charAt(i13);
                            }
                            if (i25 >= 13) {
                                break;
                            }
                            char cCharAt5 = str.charAt(i24);
                            if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                throw new oa2("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                            }
                            i24++;
                        }
                        int i26 = i24 - i18;
                        if (i26 == 0) {
                            i26 = 1;
                        }
                        int i27 = i18 + i26;
                        byte[] bytes2 = str.substring(i18, i27).getBytes(charsetForName);
                        if (bytes2.length == 1 && i19 == 0) {
                            ka1.a(1, 0, sb, bytes2);
                        } else {
                            ka1.a(bytes2.length, i19, sb, bytes2);
                            i19 = 1;
                            iC = 0;
                        }
                        i18 = i27;
                    }
                    zBooleanValue = z3;
                    str4 = str3;
                }
            }
            z = zBooleanValue;
            str2 = str4;
        } else {
            z = zBooleanValue;
            str2 = "Error correction level must be between 0 and 8!";
            sb.append((char) 902);
            ka1.b(0, length, str, sb);
        }
        String string2 = sb.toString();
        int length5 = string2.length();
        float f2 = 0.0f;
        int[] iArr = null;
        for (int i28 = 2; i28 <= 30; i28++) {
            int i29 = length5 + 1 + i16;
            int i30 = i29 / i28;
            int i31 = i30 + 1;
            if (i28 * i31 < i29 + i28) {
                i30 = i31;
            }
            if (i30 < 2) {
                break;
            }
            if (i30 <= 30) {
                float f3 = (((i28 * 17) + 69) * 0.357f) / (i30 * 2.0f);
                if (iArr == null || Math.abs(f3 - 3.0f) <= Math.abs(f2 - 3.0f)) {
                    iArr = new int[]{i28, i30};
                    f2 = f3;
                }
            }
        }
        if (iArr == null) {
            int i32 = length5 + 1 + i16;
            int i33 = i32 / 2;
            int i34 = i33 + 1;
            if (2 * i34 < i32 + 2) {
                i33 = i34;
            }
            if (i33 < 2) {
                c2 = 0;
                c3 = 1;
                iArr = new int[]{2, 2};
            } else {
                c2 = 0;
                c3 = 1;
            }
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (iArr == null) {
            throw new oa2("Unable to fit message in columns");
        }
        int i35 = iArr[c2];
        int i36 = iArr[c3];
        int i37 = (i35 * i36) - i16;
        int i38 = i37 > length5 + 1 ? (i37 - length5) - 1 : 0;
        if (length5 + i16 + 1 > 929) {
            throw new oa2("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i39 = length5 + i38 + 1;
        StringBuilder sb2 = new StringBuilder(i39);
        sb2.append((char) i39);
        sb2.append(string2);
        for (int i40 = 0; i40 < i38; i40++) {
            sb2.append((char) 900);
        }
        String string3 = sb2.toString();
        int[][] iArr2 = ga.e;
        if (i15 < 0 || i15 > 8) {
            e.g(str2);
            return null;
        }
        char[] cArr = new char[i16];
        int length6 = string3.length();
        for (int i41 = 0; i41 < length6; i41++) {
            int i42 = i16 - 1;
            int iCharAt = (string3.charAt(i41) + cArr[i42]) % 929;
            while (i42 > 0) {
                cArr[i42] = (char) ((cArr[i42 - 1] + (929 - ((iArr2[i15][i42] * iCharAt) % 929))) % 929);
                i42--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * iArr2[i15][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(i16);
        for (int i43 = i16 - 1; i43 >= 0; i43--) {
            char c5 = cArr[i43];
            if (c5 != 0) {
                cArr[i43] = (char) (929 - c5);
            }
            sb3.append(cArr[i43]);
        }
        String string4 = sb3.toString();
        we weVar = new we();
        weVar.d = new f6[i36];
        for (int i44 = 0; i44 < i36; i44++) {
            ((f6[]) weVar.d)[i44] = new f6(((i35 + 4) * 17) + 1);
        }
        weVar.c = i35 * 17;
        weVar.b = i36;
        weVar.a = -1;
        String strConcat = string3.concat(string4);
        int[][] iArr3 = ea.b;
        int i45 = 0;
        int i46 = 0;
        while (i45 < i36) {
            int i47 = i45 % 3;
            weVar.a++;
            ea.i(130728, 17, weVar.d());
            if (i47 == 0) {
                i6 = (i45 / 3) * 30;
                i4 = ((i36 - 1) / 3) + i6;
                i7 = i35 - 1;
            } else {
                if (i47 == 1) {
                    i6 = (i45 / 3) * 30;
                    int i48 = i36 - 1;
                    i4 = (i15 * 3) + i6 + (i48 % 3);
                    i7 = i48 / 3;
                } else {
                    int i49 = (i45 / 3) * 30;
                    i4 = (i35 - 1) + i49;
                    i5 = (i15 * 3) + i49 + ((i36 - 1) % 3);
                }
                ea.i(iArr3[i47][i4], 17, weVar.d());
                i8 = i46;
                for (i9 = 0; i9 < i35; i9++) {
                    ea.i(iArr3[i47][strConcat.charAt(i8)], 17, weVar.d());
                    i8++;
                }
                if (z) {
                    ea.i(260649, 1, weVar.d());
                } else {
                    ea.i(iArr3[i47][i5], 17, weVar.d());
                    ea.i(260649, 18, weVar.d());
                }
                i45++;
                i46 = i8;
            }
            i5 = i7 + i6;
            ea.i(iArr3[i47][i4], 17, weVar.d());
            i8 = i46;
            while (i9 < i35) {
                ea.i(iArr3[i47][strConcat.charAt(i8)], 17, weVar.d());
                i8++;
            }
            if (z) {
                ea.i(260649, 1, weVar.d());
            } else {
                ea.i(iArr3[i47][i5], 17, weVar.d());
                ea.i(260649, 18, weVar.d());
            }
            i45++;
            i46 = i8;
        }
        byte[][] bArrF = weVar.f(1, 4);
        if (bArrF[0].length < bArrF.length) {
            bArrF = x(bArrF);
            z2 = true;
        } else {
            z2 = false;
        }
        int length7 = 200 / bArrF[0].length;
        int length8 = 200 / bArrF.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return q(bArrF, i14);
        }
        byte[][] bArrF2 = weVar.f(length7, length7 << 2);
        if (z2) {
            bArrF2 = x(bArrF2);
        }
        return q(bArrF2, i14);
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            e.g("Wrong type URL in call to HmacProtoSerialization.parseKey");
            return null;
        }
        try {
            zl3 zl3VarU = zl3.u((jr2) wf3Var.e, wr2.b);
            if (zl3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ep1 ep1VarB = ah3.b();
            ep1VarB.b = Integer.valueOf(zl3VarU.A().b());
            ep1VarB.c = Integer.valueOf(zl3VarU.z().t());
            ep1VarB.d = (zg3) mh3.b.F(zl3VarU.z().w());
            ep1VarB.e = (yg3) mh3.a.F((ip3) wf3Var.f);
            ah3 ah3VarF = ep1VarB.F();
            u23 u23Var = new u23(10);
            u23Var.c = null;
            u23Var.d = null;
            u23Var.b = ah3VarF;
            u23Var.c = new ox1(tr3.a(zl3VarU.A().o()));
            u23Var.d = (Integer) wf3Var.i;
            return u23Var.h();
        } catch (IllegalArgumentException | ks2 unused) {
            tv2.f("Parsing HmacKey failed");
            return null;
        }
    }

    public void onError(int i2, String str) {
        Log.d("window.Android", "Event failed to be sent:\nError code: " + i2 + "\nError description: " + str);
    }

    public void onSuccess() {
        Log.d("window.Android", "Event sent successfully");
    }

    public HashMap r(Map map, boolean z) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            SharedPreferences sharedPreferences = i90.a().getSharedPreferences("com.facebook.internal.iap.IAP_CACHE_GPBLV2V7", 0);
            long j = z ? sharedPreferences.getLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", 1736528400000L) : sharedPreferences.getLong("TIME_OF_LAST_LOGGED_PURCHASE", 1736528400000L);
            long jMax = 0;
            for (Map.Entry entry : w11.h(map).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken") && jSONObject.has("purchaseTime")) {
                        long j2 = jSONObject.getLong("purchaseTime");
                        if (j2 <= j) {
                            map.remove(str);
                        }
                        jMax = Math.max(jMax, j2);
                    }
                } catch (Exception unused) {
                }
            }
            if (jMax >= j) {
                if (z) {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_SUBSCRIPTION", jMax).apply();
                } else {
                    sharedPreferences.edit().putLong("TIME_OF_LAST_LOGGED_PURCHASE", jMax).apply();
                }
            }
            return new HashMap(map);
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    public LinkedHashMap s(HashMap map, Map map2, String str) {
        if (mt.a.contains(this)) {
            return null;
        }
        try {
            map.getClass();
            map2.getClass();
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                JSONObject jSONObject2 = (JSONObject) map2.get(str2);
                try {
                    jSONObject.put("packageName", str);
                    if (jSONObject2 != null) {
                        String string = jSONObject.toString();
                        string.getClass();
                        String string2 = jSONObject2.toString();
                        string2.getClass();
                        linkedHashMap.put(string, string2);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Throwable th) {
            mt.a(this, th);
            return null;
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 13:
                List list = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.sgtm.batch.retry_max_count", 10L, 42).get()).longValue());
            case 14:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.initial_upload_delay_time", 15000L, 64).get();
            case 15:
                List list3 = h13.a;
                fq2.b.get();
                return Integer.valueOf((int) ((Long) gq2.a.z("measurement.test.int_flag", -2L, 3).get()).longValue());
            case 16:
                List list4 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(13, "measurement.rb.attribution.event_params", "value|currency").get();
            case 17:
                List list5 = h13.a;
                return (Boolean) aq2.a.get();
            default:
                List list6 = h13.a;
                hq2.b.get();
                return (Boolean) iq2.a.r(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
        }
    }

    @Override // defpackage.w10
    public void a(hv0 hv0Var, ac2 ac2Var) {
    }
}
