package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.core.text.PrecomputedTextCompat;
import com.google.firebase.components.ComponentRegistrar;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.crypto.Mac;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class gp1 implements ji1, na2, rb2, hv2, ed3, ze3, ff3, kr3 {
    public final /* synthetic */ int a;
    public static final gp1 b = new gp1(0);
    public static final long[] c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    public static final gp1 d = new gp1(1);
    public static final gp1 e = new gp1(2);
    public static final /* synthetic */ gp1 f = new gp1(11);
    public static final /* synthetic */ gp1 i = new gp1(12);
    public static final /* synthetic */ gp1 v = new gp1(13);
    public static final /* synthetic */ gp1 w = new gp1(14);
    public static final /* synthetic */ gp1 W = new gp1(15);
    public static final /* synthetic */ gp1 X = new gp1(16);
    public static final /* synthetic */ gp1 Y = new gp1(18);

    public /* synthetic */ gp1(int i2) {
        this.a = i2;
    }

    public static final void e(ec ecVar) {
        f6 f6Var = ec.h;
        if (ec.i == null) {
            ec.i = new ec();
            dc dcVar = new dc("Okio Watchdog");
            dcVar.setDaemon(true);
            dcVar.start();
        }
        long jNanoTime = System.nanoTime();
        long j = ecVar.c;
        boolean z = ecVar.a;
        if (j != 0 && z) {
            ecVar.g = Math.min(j, ecVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            ecVar.g = jNanoTime + j;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            ecVar.g = ecVar.c();
        }
        f6 f6Var2 = ec.h;
        int i2 = f6Var2.b + 1;
        f6Var2.b = i2;
        ec[] ecVarArr = (ec[]) f6Var2.c;
        if (i2 == ecVarArr.length) {
            ec[] ecVarArr2 = new ec[i2 * 2];
            ub.e(0, 0, 14, ecVarArr, ecVarArr2);
            f6Var2.c = ecVarArr2;
        }
        f6Var2.b(i2, ecVar);
        if (ecVar.f == 1) {
            ec.k.signal();
        }
    }

    public static ec f() throws InterruptedException {
        f6 f6Var = ec.h;
        ec ecVar = ((ec[]) f6Var.c)[1];
        if (ecVar == null) {
            long jNanoTime = System.nanoTime();
            ec.k.await(ec.l, TimeUnit.MILLISECONDS);
            if (((ec[]) f6Var.c)[1] != null || System.nanoTime() - jNanoTime < ec.m) {
                return null;
            }
            return ec.i;
        }
        long jNanoTime2 = ecVar.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            ec.k.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        f6Var.d(ecVar);
        ecVar.e = 2;
        return ecVar;
    }

    public static void i(j01 j01Var, String str, String str2, Object... objArr) {
        str.getClass();
        synchronized (i90.b) {
        }
    }

    public static final void j(Context context, String str, String str2) {
        Set set = mt.a;
        if (set.contains(gp1.class)) {
            return;
        }
        try {
            context.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            pa paVar = new pa(str, str2);
            i90 i90Var = i90.a;
            if (x32.c()) {
                paVar.d("fb_mobile_activate_app", bundle);
            }
            String str3 = pa.c;
            if (qh1.p() == 2 || set.contains(paVar)) {
                return;
            }
            try {
                da.c(1);
            } catch (Throwable th) {
                mt.a(paVar, th);
            }
        } catch (Throwable th2) {
            mt.a(gp1.class, th2);
        }
    }

    public static final void n(String str, wf3 wf3Var, String str2) {
        Long l;
        Set set = mt.a;
        if (set.contains(gp1.class) || wf3Var == null) {
            return;
        }
        try {
            Long l2 = (Long) wf3Var.f;
            if (l2 == null) {
                l2 = 0L;
            }
            long jLongValue = l2.longValue();
            gp1 gp1Var = b;
            if (jLongValue < 0) {
                gp1Var.l();
                jLongValue = 0;
            }
            Long l3 = (Long) wf3Var.c;
            long jLongValue2 = (l3 == null || (l = (Long) wf3Var.d) == null) ? 0L : l.longValue() - l3.longValue();
            if (jLongValue2 < 0) {
                gp1Var.l();
                jLongValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", wf3Var.b);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.ROOT;
            int i2 = 0;
            if (!set.contains(gp1.class)) {
                int i3 = 0;
                while (true) {
                    try {
                        long[] jArr = c;
                        if (i3 >= 19 || jArr[i3] >= jLongValue) {
                            break;
                        } else {
                            i3++;
                        }
                    } catch (Throwable th) {
                        mt.a(gp1.class, th);
                    }
                }
                i2 = i3;
            }
            bundle.putString("fb_mobile_time_between_sessions", String.format(locale, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)));
            es1 es1Var = (es1) wf3Var.i;
            bundle.putString("fb_mobile_launch_source", es1Var != null ? es1Var.toString() : "Unclassified");
            Long l4 = (Long) wf3Var.d;
            bundle.putLong("_logTime", (l4 != null ? l4.longValue() : 0L) / 1000);
            pa paVar = new pa(str, str2);
            double d2 = jLongValue2 / 1000.0d;
            i90 i90Var = i90.a;
            if (!x32.c() || mt.a.contains(paVar)) {
                return;
            }
            try {
                pa.f(paVar, "fb_mobile_deactivate_app", Double.valueOf(d2), bundle, false, e5.b());
            } catch (Throwable th2) {
                mt.a(paVar, th2);
            }
        } catch (Throwable th3) {
            mt.a(gp1.class, th3);
        }
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    @Override // defpackage.rb2
    public String b(String str) {
        return null;
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        vn3VarT.j(dq3.v().b());
        vn3VarT.h(q63.b(((f23) dx2Var).a));
        return vf3.f((xn3) vn3VarT.d());
    }

    @Override // defpackage.ed3
    public wf3 g(zi0 zi0Var) throws GeneralSecurityException {
        ip3 ip3Var;
        switch (this.a) {
            case 17:
                a03 a03Var = (a03) zi0Var;
                no3 no3VarW = po3.w();
                vo3 vo3VarT = wo3.t();
                String str = a03Var.f.a;
                vo3VarT.f();
                wo3.v((wo3) vo3VarT.b, str);
                wo3 wo3Var = (wo3) vo3VarT.d();
                no3VarW.f();
                po3.v((po3) no3VarW.b, wo3Var);
                nr2 nr2VarB = ((po3) no3VarW.d()).b();
                vy2 vy2Var = a03Var.f.b;
                if (vy2.f == vy2Var) {
                    ip3Var = ip3.TINK;
                } else {
                    if (vy2.i != vy2Var) {
                        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(vy2Var)));
                    }
                    ip3Var = ip3.RAW;
                }
                return wf3.d("type.googleapis.com/google.crypto.tink.KmsAeadKey", nr2VarB, 5, ip3Var, a03Var.h);
            case 21:
                x83 x83Var = (x83) zi0Var;
                en3 en3VarY = gn3.y();
                en3VarY.f();
                ((gn3) en3VarY.b).zzf = 0;
                ln3 ln3VarB = y83.b(x83Var.f);
                en3VarY.f();
                gn3.x((gn3) en3VarY.b, ln3VarB);
                byte[] bArrB = ((tr3) x83Var.g.a).b();
                nr2 nr2VarE = jr2.e(bArrB, 0, bArrB.length);
                en3VarY.f();
                gn3.w((gn3) en3VarY.b, nr2VarE);
                return wf3.d("type.googleapis.com/google.crypto.tink.HpkePrivateKey", ((gn3) en3VarY.d()).b(), 3, (ip3) y83.g.E(x83Var.f.f.d), x83Var.F());
            default:
                wf3 wf3Var = ((qd3) zi0Var).f;
                int i2 = ud3.b[ts.v(wf3Var.b)];
                return wf3Var;
        }
    }

    public boolean h(CharSequence charSequence) {
        return charSequence instanceof PrecomputedTextCompat;
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        xn3 xn3Var = (xn3) vf3Var.c;
        if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            e.g(ts.j("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ", xn3Var.B()));
            return null;
        }
        try {
            xj3 xj3VarU = xj3.u(xn3Var.A(), wr2.b);
            if (xj3VarU.w() != 0) {
                tv2.f("Only version 0 parameters are accepted");
                return null;
            }
            ep1 ep1VarB = oz2.b();
            ep1VarB.J(xj3VarU.t());
            ep1VarB.G();
            ep1VarB.L();
            ep1VarB.e = j33.a(xn3Var.z());
            return ep1VarB.D();
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e2);
        }
    }

    public void l() {
        if (mt.a.contains(this)) {
            return;
        }
        try {
            gp1 gp1Var = i01.c;
            synchronized (i90.b) {
            }
        } catch (Throwable th) {
            mt.a(this, th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:363:0x0672  */
    /* JADX WARN: Code duplicated, block: B:390:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:445:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e8 A[EDGE_INSN: B:70:0x00e8->B:73:0x00ef BREAK  A[LOOP:0: B:54:0x00c4->B:67:0x00e1]] */
    /* JADX WARN: Code duplicated, block: B:71:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ed A[EDGE_INSN: B:72:0x00ed->B:73:0x00ef BREAK  A[LOOP:0: B:54:0x00c4->B:67:0x00e1]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) throws oa2 {
        int i3;
        z41 z41Var;
        int i4;
        a52 a52VarA;
        int i5;
        int i6;
        int i7;
        char c2;
        int i8;
        em emVar;
        int i9;
        boolean z;
        boolean z2;
        char cCharAt;
        int i10;
        int[] iArr = rq0.c;
        if (str.isEmpty()) {
            e.g("Found empty contents");
            return null;
        }
        if (i2 != 12) {
            e.g("Can only encode QR_CODE, but got ".concat(ts.w(i2)));
            return null;
        }
        c60 c60Var = c60.a;
        if (enumMap.containsKey(c60Var)) {
            String string = enumMap.get(c60Var).toString();
            if (string == null) {
                uq1.h("Name is null");
            } else if (string.equals("L")) {
                i3 = 1;
            } else if (string.equals("M")) {
                i3 = 2;
            } else if (string.equals("Q")) {
                i3 = 3;
            } else if (string.equals("H")) {
                i3 = 4;
            } else {
                e.g("No enum constant com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.".concat(string));
            }
            i3 = 0;
        } else {
            i3 = 1;
        }
        c60 c60Var2 = c60.f;
        int i11 = enumMap.containsKey(c60Var2) ? Integer.parseInt(enumMap.get(c60Var2).toString()) : 4;
        c60 c60Var3 = c60.b;
        boolean zContainsKey = enumMap.containsKey(c60Var3);
        String string2 = zContainsKey ? enumMap.get(c60Var3).toString() : "ISO-8859-1";
        boolean zEquals = "Shift_JIS".equals(string2);
        int i12 = 0;
        z41 z41Var2 = z41.BYTE;
        if (!zEquals) {
            i9 = 0;
            z = false;
            z2 = false;
            while (true) {
                if (i9 < str.length()) {
                    cCharAt = str.charAt(i9);
                    if (cCharAt >= '0') {
                        if (cCharAt < '`') {
                            i10 = iArr[cCharAt];
                        } else {
                            i10 = -1;
                        }
                        if (i10 != -1) {
                            z = true;
                        }
                    } else {
                        if (cCharAt < '`') {
                            i10 = iArr[cCharAt];
                        } else {
                            i10 = -1;
                        }
                        if (i10 != -1) {
                            z = true;
                        }
                    }
                    i9++;
                } else {
                    if (z) {
                        z41Var = z41.ALPHANUMERIC;
                        break;
                    }
                    if (z2) {
                        z41Var = z41.NUMERIC;
                        break;
                    }
                }
                z41Var = z41Var2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                i9 = 0;
                z = false;
                z2 = false;
                while (true) {
                    if (i9 < str.length()) {
                        cCharAt = str.charAt(i9);
                        if (cCharAt >= '0' || cCharAt > '9') {
                            if (cCharAt < '`') {
                                i10 = iArr[cCharAt];
                            } else {
                                i10 = -1;
                            }
                            if (i10 != -1) {
                                z = true;
                            }
                        } else {
                            z2 = true;
                        }
                        i9++;
                    } else {
                        if (z) {
                            z41Var = z41.ALPHANUMERIC;
                            break;
                        }
                        if (z2) {
                            z41Var = z41.NUMERIC;
                            break;
                        }
                    }
                    z41Var = z41Var2;
                    break;
                }
            }
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    z41Var = z41.KANJI;
                } else {
                    int i14 = bytes[i13] & 255;
                    if ((i14 < 129 || i14 > 159) && (i14 < 224 || i14 > 235)) {
                        i9 = 0;
                        z = false;
                        z2 = false;
                        while (true) {
                            if (i9 < str.length()) {
                                cCharAt = str.charAt(i9);
                                if (cCharAt >= '0') {
                                    if (cCharAt < '`') {
                                        i10 = iArr[cCharAt];
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 != -1) {
                                        z = true;
                                    }
                                } else {
                                    if (cCharAt < '`') {
                                        i10 = iArr[cCharAt];
                                    } else {
                                        i10 = -1;
                                    }
                                    if (i10 != -1) {
                                        z = true;
                                    }
                                }
                                i9++;
                            } else {
                                if (z) {
                                    z41Var = z41.ALPHANUMERIC;
                                    break;
                                }
                                if (z2) {
                                    z41Var = z41.NUMERIC;
                                    break;
                                }
                            }
                            z41Var = z41Var2;
                            break;
                        }
                    }
                    i13 += 2;
                }
            }
        } catch (UnsupportedEncodingException unused) {
        }
        int[] iArr2 = z41Var.a;
        gh ghVar = new gh();
        if (z41Var == z41Var2 && zContainsKey && (emVar = (em) em.d.get(string2)) != null) {
            ghVar.d(7, 4);
            ghVar.d(emVar.a[0], 8);
        }
        c60 c60Var4 = c60.Y;
        if (enumMap.containsKey(c60Var4) && Boolean.valueOf(enumMap.get(c60Var4).toString()).booleanValue()) {
            i4 = 4;
            ghVar.d(5, 4);
        } else {
            i4 = 4;
        }
        ghVar.d(z41Var.b, i4);
        gh ghVar2 = new gh();
        int iOrdinal = z41Var.ordinal();
        int i15 = 10;
        if (iOrdinal != 1) {
            int i16 = 8;
            if (iOrdinal == 2) {
                int length2 = str.length();
                int i17 = 0;
                while (i17 < length2) {
                    char cCharAt2 = str.charAt(i17);
                    int i18 = cCharAt2 < '`' ? iArr[cCharAt2] : -1;
                    if (i18 == -1) {
                        throw new oa2();
                    }
                    int i19 = i17 + 1;
                    if (i19 < length2) {
                        char cCharAt3 = str.charAt(i19);
                        int i20 = cCharAt3 < '`' ? iArr[cCharAt3] : -1;
                        if (i20 == -1) {
                            throw new oa2();
                        }
                        ghVar2.d((i18 * 45) + i20, 11);
                        i17 += 2;
                    } else {
                        ghVar2.d(i18, 6);
                        i17 = i19;
                    }
                }
            } else if (iOrdinal == i4) {
                try {
                    byte[] bytes2 = str.getBytes(string2);
                    int length3 = bytes2.length;
                    int i21 = 0;
                    while (i21 < length3) {
                        ghVar2.d(bytes2[i21], i16);
                        i21++;
                        i16 = 8;
                    }
                } catch (UnsupportedEncodingException e2) {
                    throw new oa2(e2);
                }
            } else {
                if (iOrdinal != 6) {
                    throw new oa2("Invalid mode: ".concat(String.valueOf(z41Var)));
                }
                try {
                    byte[] bytes3 = str.getBytes("Shift_JIS");
                    int length4 = bytes3.length;
                    for (int i22 = 0; i22 < length4; i22 += 2) {
                        int i23 = ((bytes3[i22] & 255) << 8) | (bytes3[i22 + 1] & 255);
                        int i24 = 33088;
                        if (i23 >= 33088 && i23 <= 40956) {
                            i8 = i23 - i24;
                        } else if (i23 < 57408 || i23 > 60351) {
                            i8 = -1;
                        } else {
                            i24 = 49472;
                            i8 = i23 - i24;
                        }
                        if (i8 == -1) {
                            throw new oa2("Invalid byte sequence");
                        }
                        ghVar2.d(((i8 >> 8) * 192) + (i8 & 255), 13);
                    }
                } catch (UnsupportedEncodingException e3) {
                    throw new oa2(e3);
                }
            }
        } else {
            int length5 = str.length();
            int i25 = 0;
            while (i25 < length5) {
                int iCharAt = str.charAt(i25) - '0';
                int i26 = i25 + 2;
                if (i26 < length5) {
                    ghVar2.d(((str.charAt(i25 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i26) - '0'), i15);
                    i25 += 3;
                } else {
                    i25++;
                    if (i25 < length5) {
                        ghVar2.d((iCharAt * 10) + (str.charAt(i25) - '0'), 7);
                        i25 = i26;
                    } else {
                        ghVar2.d(iCharAt, 4);
                    }
                }
                i15 = 10;
            }
        }
        c60 c60Var5 = c60.X;
        if (enumMap.containsKey(c60Var5)) {
            a52VarA = a52.a(Integer.parseInt(enumMap.get(c60Var5).toString()));
            int i27 = ghVar.b;
            int i28 = a52VarA.a;
            int i29 = iArr2[i28 <= 9 ? (char) 0 : i28 <= 26 ? (char) 1 : (char) 2] + i27 + ghVar2.b;
            int i30 = a52VarA.c;
            f6 f6Var = a52VarA.b[ts.v(i3)];
            int i31 = f6Var.b;
            int i32 = 0;
            for (u61 u61Var : (u61[]) f6Var.c) {
                i32 += u61Var.a;
            }
            if (i30 - (i32 * i31) < (i29 + 7) / 8) {
                throw new oa2("Data too big for requested version");
            }
        } else {
            a52 a52VarA2 = a52.a(1);
            int i33 = ghVar.b;
            int i34 = a52VarA2.a;
            int i35 = iArr2[i34 <= 9 ? (char) 0 : i34 <= 26 ? (char) 1 : (char) 2] + i33 + ghVar2.b;
            int i36 = 1;
            while (true) {
                if (i36 > 40) {
                    throw new oa2("Data too big");
                }
                a52 a52VarA3 = a52.a(i36);
                int i37 = a52VarA3.c;
                f6 f6Var2 = a52VarA3.b[ts.v(i3)];
                int i38 = f6Var2.b;
                u61[] u61VarArr = (u61[]) f6Var2.c;
                int length6 = u61VarArr.length;
                int i39 = i12;
                int i40 = i39;
                while (i39 < length6) {
                    int i41 = i39;
                    i40 += u61VarArr[i41].a;
                    i39 = i41 + 1;
                }
                if (i37 - (i40 * i38) >= (i35 + 7) / 8) {
                    int i42 = ghVar.b;
                    int i43 = a52VarA3.a;
                    int i44 = iArr2[i43 <= 9 ? i12 : i43 <= 26 ? 1 : 2] + i42 + ghVar2.b;
                    int i45 = 1;
                    while (true) {
                        if (i45 > 40) {
                            throw new oa2("Data too big");
                        }
                        a52 a52VarA4 = a52.a(i45);
                        int i46 = a52VarA4.c;
                        f6 f6Var3 = a52VarA4.b[ts.v(i3)];
                        int i47 = f6Var3.b;
                        u61[] u61VarArr2 = (u61[]) f6Var3.c;
                        int length7 = u61VarArr2.length;
                        int i48 = i12;
                        int i49 = i48;
                        while (i48 < length7) {
                            int i50 = i48;
                            i49 += u61VarArr2[i50].a;
                            i48 = i50 + 1;
                        }
                        if (i46 - (i49 * i47) >= (i44 + 7) / 8) {
                            a52VarA = a52VarA4;
                            break;
                        }
                        i45++;
                        i12 = 0;
                    }
                } else {
                    i36++;
                    i12 = 0;
                }
            }
        }
        int i51 = a52VarA.a;
        int i52 = a52VarA.c;
        gh ghVar3 = new gh();
        int i53 = ghVar.b;
        ghVar3.f(i53);
        for (int i54 = i12; i54 < i53; i54++) {
            ghVar3.c(ghVar.g(i54));
        }
        int iH = z41Var == z41Var2 ? ghVar2.h() : str.length();
        int i55 = iArr2[i51 <= 9 ? i12 : i51 <= 26 ? 1 : 2];
        int i56 = 1 << i55;
        if (iH >= i56) {
            StringBuilder sb = new StringBuilder();
            sb.append(iH);
            sb.append(" is bigger than ");
            sb.append(i56 - 1);
            throw new oa2(sb.toString());
        }
        ghVar3.d(iH, i55);
        int i57 = ghVar2.b;
        ghVar3.f(ghVar3.b + i57);
        for (int i58 = i12; i58 < i57; i58++) {
            ghVar3.c(ghVar2.g(i58));
        }
        f6 f6Var4 = a52VarA.b[ts.v(i3)];
        int i59 = f6Var4.b;
        u61[] u61VarArr3 = (u61[]) f6Var4.c;
        int length8 = u61VarArr3.length;
        int i60 = i12;
        int i61 = i60;
        while (i60 < length8) {
            i61 += u61VarArr3[i60].a;
            i60++;
        }
        int i62 = i52 - (i61 * i59);
        int i63 = i62 << 3;
        if (ghVar3.b > i63) {
            throw new oa2("data bits cannot fit in the QR Code" + ghVar3.b + " > " + i63);
        }
        for (int i64 = i12; i64 < 4 && ghVar3.b < i63; i64++) {
            ghVar3.c(i12);
        }
        boolean z3 = i12;
        int i65 = ghVar3.b & 7;
        if (i65 > 0) {
            while (i65 < 8) {
                ghVar3.c(z3);
                i65++;
                z3 = 0;
            }
        }
        int iH2 = i62 - ghVar3.h();
        for (int i66 = 0; i66 < iH2; i66++) {
            ghVar3.d((i66 & 1) == 0 ? 236 : 17, 8);
        }
        if (ghVar3.b != i63) {
            throw new oa2("Bits size does not equal capacity");
        }
        int i67 = 0;
        for (u61 u61Var2 : u61VarArr3) {
            i67 += u61Var2.a;
        }
        if (ghVar3.h() != i62) {
            throw new oa2("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i67);
        int i68 = 0;
        int i69 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i68 < i67) {
            int[] iArr3 = new int[1];
            int[] iArr4 = new int[1];
            if (i68 >= i67) {
                throw new oa2("Block ID too large");
            }
            int i70 = i52 % i67;
            int i71 = i51;
            int i72 = i67 - i70;
            int i73 = i52 / i67;
            int i74 = i62 / i67;
            int i75 = i74 + 1;
            int i76 = i11;
            int i77 = i73 - i74;
            int i78 = (i73 + 1) - i75;
            if (i77 != i78) {
                throw new oa2("EC bytes mismatch");
            }
            if (i67 != i72 + i70) {
                throw new oa2("RS blocks mismatch");
            }
            if (i52 != ((i75 + i78) * i70) + ((i74 + i77) * i72)) {
                throw new oa2("Total bytes mismatch");
            }
            if (i68 < i72) {
                c2 = 0;
                iArr3[0] = i74;
                iArr4[0] = i77;
            } else {
                c2 = 0;
                iArr3[0] = i75;
                iArr4[0] = i78;
            }
            int i79 = iArr3[c2];
            byte[] bArr = new byte[i79];
            int i80 = i69 << 3;
            int i81 = 0;
            while (i81 < i79) {
                int i82 = i68;
                int i83 = i67;
                int i84 = i81;
                int i85 = i80;
                int i86 = 0;
                for (int i87 = 0; i87 < 8; i87++) {
                    if (ghVar3.g(i85)) {
                        i86 |= 1 << (7 - i87);
                    }
                    i85++;
                }
                bArr[i84] = (byte) i86;
                i81 = i84 + 1;
                i80 = i85;
                i68 = i82;
                i67 = i83;
            }
            int i88 = i68;
            int i89 = i67;
            int i90 = iArr4[0];
            int[] iArr5 = new int[i79 + i90];
            for (int i91 = 0; i91 < i79; i91++) {
                iArr5[i91] = bArr[i91] & 255;
            }
            new md2(uh0.k).e(iArr5, i90);
            byte[] bArr2 = new byte[i90];
            int i92 = 0;
            while (i92 < i90) {
                int[] iArr6 = iArr5;
                bArr2[i92] = (byte) iArr6[i79 + i92];
                i92++;
                iArr5 = iArr6;
            }
            arrayList.add(new qh(bArr, bArr2));
            iMax = Math.max(iMax, i79);
            iMax2 = Math.max(iMax2, i90);
            i69 += iArr3[0];
            i68 = i88 + 1;
            i67 = i89;
            i51 = i71;
            i11 = i76;
        }
        int i93 = i51;
        int i94 = i11;
        if (i62 != i69) {
            throw new oa2("Data bytes does not match offset");
        }
        gh ghVar4 = new gh();
        for (int i95 = 0; i95 < iMax; i95++) {
            int size = arrayList.size();
            int i96 = 0;
            while (i96 < size) {
                Object obj = arrayList.get(i96);
                i96++;
                byte[] bArr3 = ((qh) obj).a;
                if (i95 < bArr3.length) {
                    ghVar4.d(bArr3[i95], 8);
                }
            }
        }
        for (int i97 = 0; i97 < iMax2; i97++) {
            int size2 = arrayList.size();
            int i98 = 0;
            while (i98 < size2) {
                Object obj2 = arrayList.get(i98);
                i98++;
                byte[] bArr4 = ((qh) obj2).b;
                if (i97 < bArr4.length) {
                    ghVar4.d(bArr4[i97], 8);
                }
            }
        }
        if (i52 != ghVar4.h()) {
            StringBuilder sbU = ck1.u(i52, "Interleaving error: ", " and ");
            sbU.append(ghVar4.h());
            sbU.append(" differ.");
            throw new oa2(sbU.toString());
        }
        int i99 = (i93 * 4) + 17;
        jj jjVar = new jj(i99, i99);
        int i100 = jjVar.c;
        int i101 = jjVar.b;
        int i102 = Integer.MAX_VALUE;
        int i103 = 0;
        int i104 = -1;
        while (i103 < 8) {
            z32.f(ghVar4, i3, a52VarA, i103, jjVar);
            int iB = ta.b(jjVar, false) + ta.b(jjVar, true);
            byte[][] bArr5 = (byte[][]) jjVar.d;
            int i105 = 0;
            int i106 = 0;
            while (i105 < i100 - 1) {
                byte[] bArr6 = bArr5[i105];
                int i107 = i106;
                int i108 = 0;
                while (i108 < i101 - 1) {
                    byte b2 = bArr6[i108];
                    int i109 = i108 + 1;
                    int i110 = i105;
                    if (b2 == bArr6[i109]) {
                        byte[] bArr7 = bArr5[i110 + 1];
                        if (b2 == bArr7[i108] && b2 == bArr7[i109]) {
                            i107++;
                        }
                    }
                    i108 = i109;
                    i105 = i110;
                }
                i105++;
                i106 = i107;
            }
            int i111 = (i106 * 3) + iB;
            int i112 = 0;
            int i113 = 0;
            while (i112 < i100) {
                int i114 = 0;
                while (i114 < i101) {
                    byte[] bArr8 = bArr5[i112];
                    int i115 = i114 + 6;
                    int i116 = i113;
                    if (i115 < i101) {
                        i5 = i103;
                        byte b3 = 1;
                        if (bArr8[i114] == 1 && bArr8[i114 + 1] == 0 && bArr8[i114 + 2] == 1 && bArr8[i114 + 3] == 1 && bArr8[i114 + 4] == 1 && bArr8[i114 + 5] == 0 && bArr8[i115] == 1) {
                            int iMax3 = Math.max(i114 - 4, 0);
                            int iMin = Math.min(i114, bArr8.length);
                            while (true) {
                                if (iMax3 < iMin) {
                                    int i117 = iMax3;
                                    if (bArr8[i117] == b3) {
                                        int iMax4 = Math.max(i114 + 7, 0);
                                        int iMin2 = Math.min(i114 + 11, bArr8.length);
                                        while (true) {
                                            if (iMax4 < iMin2) {
                                                int i118 = iMax4;
                                                if (bArr8[iMax4] != 1) {
                                                    iMax4 = i118 + 1;
                                                }
                                            }
                                        }
                                    } else {
                                        iMax3 = i117 + 1;
                                        b3 = 1;
                                    }
                                }
                                i113 = i116 + 1;
                            }
                        }
                        i6 = i112 + 6;
                        if (i6 < i100) {
                            byte b4 = 1;
                            if (bArr5[i112][i114] != 1 && bArr5[i112 + 1][i114] == 0 && bArr5[i112 + 2][i114] == 1 && bArr5[i112 + 3][i114] == 1 && bArr5[i112 + 4][i114] == 1 && bArr5[i112 + 5][i114] == 0 && bArr5[i6][i114] == 1) {
                                int iMax5 = Math.max(i112 - 4, 0);
                                int iMin3 = Math.min(i112, bArr5.length);
                                while (true) {
                                    if (iMax5 < iMin3) {
                                        i7 = i112;
                                        if (bArr5[iMax5][i114] == b4) {
                                            int iMax6 = Math.max(i7 + 7, 0);
                                            int iMin4 = Math.min(i7 + 11, bArr5.length);
                                            while (true) {
                                                if (iMax6 < iMin4) {
                                                    if (bArr5[iMax6][i114] == 1) {
                                                        break;
                                                    }
                                                    iMax6++;
                                                }
                                            }
                                        } else {
                                            iMax5++;
                                            i112 = i7;
                                            b4 = 1;
                                        }
                                    } else {
                                        i7 = i112;
                                    }
                                    i113++;
                                    break;
                                }
                            } else {
                                i7 = i112;
                            }
                        } else {
                            i7 = i112;
                        }
                        i114++;
                        i103 = i5;
                        i112 = i7;
                    } else {
                        i5 = i103;
                    }
                    i113 = i116;
                    i6 = i112 + 6;
                    if (i6 < i100) {
                        byte b5 = 1;
                        if (bArr5[i112][i114] != 1) {
                            i7 = i112;
                        } else {
                            i7 = i112;
                        }
                    } else {
                        i7 = i112;
                    }
                    i114++;
                    i103 = i5;
                    i112 = i7;
                }
                i112++;
            }
            int i119 = i103;
            int i120 = (i113 * 40) + i111;
            int i121 = 0;
            for (int i122 = 0; i122 < i100; i122++) {
                byte[] bArr9 = bArr5[i122];
                for (int i123 = 0; i123 < i101; i123++) {
                    if (bArr9[i123] == 1) {
                        i121++;
                    }
                }
            }
            int i124 = i100 * i101;
            int iAbs = (((Math.abs((i121 << 1) - i124) * 10) / i124) * 10) + i120;
            if (iAbs < i102) {
                i102 = iAbs;
                i104 = i119;
            }
            i103 = i119 + 1;
        }
        z32.f(ghVar4, i3, a52VarA, i104, jjVar);
        int i125 = i94 << 1;
        int i126 = i101 + i125;
        int i127 = i125 + i100;
        int iMax7 = Math.max(200, i126);
        int iMax8 = Math.max(200, i127);
        int iMin5 = Math.min(iMax7 / i126, iMax8 / i127);
        int i128 = (iMax7 - (i101 * iMin5)) / 2;
        int i129 = (iMax8 - (i100 * iMin5)) / 2;
        hh hhVar = new hh(iMax7, iMax8);
        int i130 = 0;
        while (i130 < i100) {
            int i131 = i128;
            int i132 = 0;
            while (i132 < i101) {
                if (jjVar.a(i132, i130) == 1) {
                    hhVar.f(i131, i129, iMin5, iMin5);
                }
                i132++;
                i131 += iMin5;
            }
            i130++;
            i129 += iMin5;
        }
        return hhVar;
    }

    public List o(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (aq aqVar : componentRegistrar.getComponents()) {
            String str = aqVar.a;
            if (str != null) {
                aqVar = new aq(str, aqVar.b, aqVar.c, aqVar.d, aqVar.e, new eg(3, str, aqVar), aqVar.g);
            }
            arrayList.add(aqVar);
        }
        return arrayList;
    }

    public synchronized void p(String str) {
        str.getClass();
        synchronized (i90.b) {
        }
        synchronized (this) {
            str.getClass();
            i01.d.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                return new Boolean(((Boolean) gp2.b.get()).booleanValue());
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(16, "measurement.sgtm.google_signal.url", "https://app-measurement.com/s/d").get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.backoff_period", 43200000L, 63).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.lifetimevalue.max_currency_tracked", 4L, 17).get()).longValue());
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_bundles", 100L, 67).get()).longValue());
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return (Boolean) xo2.a.r(2, "measurement.config.bundle_for_all_apps_on_backgrounded", true).get();
            default:
                List list6 = h13.a;
                return (Boolean) oq2.a.get();
        }
    }

    @Override // defpackage.rb2
    public void d(String str, String str2) {
    }
}
