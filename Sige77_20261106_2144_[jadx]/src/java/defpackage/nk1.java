package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import com.fm.openinstall.model.Error;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import javax.security.auth.x500.X500Principal;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class nk1 implements f60, mh, na2, n90, hv2, yc3, ze3, g40, cv1 {
    public static final /* synthetic */ nk1 b = new nk1(11);
    public static final /* synthetic */ nk1 c = new nk1(13);
    public static final /* synthetic */ nk1 d = new nk1(14);
    public static final /* synthetic */ nk1 e = new nk1(15);
    public static final /* synthetic */ nk1 f = new nk1(16);
    public static final /* synthetic */ nk1 i = new nk1(18);
    public static final /* synthetic */ nk1 v = new nk1(21);
    public final /* synthetic */ int a;

    public /* synthetic */ nk1(int i2) {
        this.a = i2;
    }

    public static d61 h(FileInputStream fileInputStream) throws kt {
        byte[] bArr;
        try {
            kc1 kc1VarO = kc1.o(fileInputStream);
            d61 d61Var = new d61(false);
            gc1[] gc1VarArr = (gc1[]) Arrays.copyOf(new gc1[0], 0);
            d61Var.b();
            if (gc1VarArr.length > 0) {
                gc1 gc1Var = gc1VarArr[0];
                throw null;
            }
            Map mapM = kc1VarO.m();
            mapM.getClass();
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                oc1 oc1Var = (oc1) entry.getValue();
                str.getClass();
                oc1Var.getClass();
                int iC = oc1Var.C();
                switch (iC == 0 ? -1 : hc1.a[ts.v(iC)]) {
                    case Error.REQUEST_FAIL /* -1 */:
                        throw new kt("Value case is null.", null);
                    case 0:
                    default:
                        throw new e71();
                    case 1:
                        d61Var.d(new fc1(str), Boolean.valueOf(oc1Var.t()));
                        break;
                    case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                        d61Var.d(new fc1(str), Float.valueOf(oc1Var.x()));
                        break;
                    case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                        d61Var.d(new fc1(str), Double.valueOf(oc1Var.w()));
                        break;
                    case oc1.LONG_FIELD_NUMBER /* 4 */:
                        d61Var.d(new fc1(str), Integer.valueOf(oc1Var.y()));
                        break;
                    case oc1.STRING_FIELD_NUMBER /* 5 */:
                        d61Var.d(new fc1(str), Long.valueOf(oc1Var.z()));
                        break;
                    case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                        fc1 fc1Var = new fc1(str);
                        String strA = oc1Var.A();
                        strA.getClass();
                        d61Var.d(fc1Var, strA);
                        break;
                    case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                        fc1 fc1Var2 = new fc1(str);
                        cr0 cr0VarN = oc1Var.B().n();
                        cr0VarN.getClass();
                        d61Var.d(fc1Var2, CollectionsKt.F(cr0VarN));
                        break;
                    case oc1.BYTES_FIELD_NUMBER /* 8 */:
                        fc1 fc1Var3 = new fc1(str);
                        qj qjVarU = oc1Var.u();
                        int size = qjVarU.size();
                        if (size == 0) {
                            bArr = dr0.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            qjVarU.d(bArr2, size);
                            bArr = bArr2;
                        }
                        bArr.getClass();
                        d61Var.d(fc1Var3, bArr);
                        break;
                    case 9:
                        throw new kt("Value not set.", null);
                }
            }
            return new d61(new LinkedHashMap(d61Var.a()), true);
        } catch (ur0 e2) {
            throw new kt("Unable to parse preferences proto.", e2);
        }
    }

    public static Unit l(Object obj, ii iiVar) {
        sh0 sh0VarC;
        Map mapA = ((d61) obj).a();
        ic1 ic1VarN = kc1.n();
        for (Map.Entry entry : mapA.entrySet()) {
            fc1 fc1Var = (fc1) entry.getKey();
            Object value = entry.getValue();
            String str = fc1Var.a;
            if (value instanceof Boolean) {
                nc1 nc1VarD = oc1.D();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                nc1VarD.f();
                oc1.q((oc1) nc1VarD.b, zBooleanValue);
                sh0VarC = nc1VarD.c();
            } else if (value instanceof Float) {
                nc1 nc1VarD2 = oc1.D();
                float fFloatValue = ((Number) value).floatValue();
                nc1VarD2.f();
                oc1.r((oc1) nc1VarD2.b, fFloatValue);
                sh0VarC = nc1VarD2.c();
            } else if (value instanceof Double) {
                nc1 nc1VarD3 = oc1.D();
                double dDoubleValue = ((Number) value).doubleValue();
                nc1VarD3.f();
                oc1.o((oc1) nc1VarD3.b, dDoubleValue);
                sh0VarC = nc1VarD3.c();
            } else if (value instanceof Integer) {
                nc1 nc1VarD4 = oc1.D();
                int iIntValue = ((Number) value).intValue();
                nc1VarD4.f();
                oc1.s((oc1) nc1VarD4.b, iIntValue);
                sh0VarC = nc1VarD4.c();
            } else if (value instanceof Long) {
                nc1 nc1VarD5 = oc1.D();
                long jLongValue = ((Number) value).longValue();
                nc1VarD5.f();
                oc1.l((oc1) nc1VarD5.b, jLongValue);
                sh0VarC = nc1VarD5.c();
            } else if (value instanceof String) {
                nc1 nc1VarD6 = oc1.D();
                nc1VarD6.f();
                oc1.m((oc1) nc1VarD6.b, (String) value);
                sh0VarC = nc1VarD6.c();
            } else if (value instanceof Set) {
                nc1 nc1VarD7 = oc1.D();
                lc1 lc1VarO = mc1.o();
                lc1VarO.f();
                mc1.l((mc1) lc1VarO.b, (Set) value);
                nc1VarD7.f();
                oc1.n((oc1) nc1VarD7.b, (mc1) lc1VarO.c());
                sh0VarC = nc1VarD7.c();
            } else {
                if (!(value instanceof byte[])) {
                    uq1.q("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                nc1 nc1VarD8 = oc1.D();
                byte[] bArr = (byte[]) value;
                qj qjVarC = qj.c(bArr, 0, bArr.length);
                nc1VarD8.f();
                oc1.p((oc1) nc1VarD8.b, qjVarC);
                sh0VarC = nc1VarD8.c();
            }
            ic1VarN.getClass();
            str.getClass();
            ic1VarN.f();
            kc1.l((kc1) ic1VarN.b).put(str, (oc1) sh0VarC);
        }
        kc1 kc1Var = (kc1) ic1VarN.c();
        int iA = kc1Var.a(null);
        Logger logger = un.f;
        if (iA > 4096) {
            iA = 4096;
        }
        un unVar = new un(iiVar, iA);
        kc1Var.b(unVar);
        if (unVar.d > 0) {
            unVar.k();
        }
        return Unit.a;
    }

    public static final boolean n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    @Override // defpackage.mh
    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    @Override // defpackage.mh
    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // defpackage.g40
    public f40 e(Context context, String str, e40 e40Var) {
        f40 f40Var = new f40();
        f40Var.a = e40Var.e(context, str);
        int i2 = 1;
        int iB = e40Var.b(context, str, true);
        f40Var.b = iB;
        int i3 = f40Var.a;
        if (i3 == 0) {
            i3 = 0;
            if (iB == 0) {
                i2 = 0;
            } else if (i3 >= iB) {
                i2 = -1;
            }
        } else if (i3 >= iB) {
            i2 = -1;
        }
        f40Var.c = i2;
        return f40Var;
    }

    public synchronized boolean g() {
        synchronized (this) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.getEntry("crypto", null) instanceof KeyStore.PrivateKeyEntry) {
                    return true;
                }
            } catch (Exception unused) {
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
            gregorianCalendar2.add(1, 100);
            try {
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("crypto", 3);
                builder.setCertificateSubject(new X500Principal("CN=crypto")).setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1337L)).setCertificateNotBefore(gregorianCalendar.getTime()).setCertificateNotAfter(gregorianCalendar2.getTime());
                keyPairGenerator.initialize(builder.build());
                keyPairGenerator.generateKeyPair();
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    @Override // defpackage.cv1
    public Object get() {
        Object obj = y93.j;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(h4.b);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor instanceof q51 ? (q51) scheduledExecutorServiceNewSingleThreadScheduledExecutor : new q51(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
    }

    @Override // defpackage.f60
    public void i(i60 i60Var) {
        int i2;
        String str = i60Var.a;
        int i3 = i60Var.d;
        int length = str.length();
        if (i3 < length) {
            char cCharAt = str.charAt(i3);
            i2 = 0;
            while (ga.o(cCharAt) && i3 < length) {
                i2++;
                i3++;
                if (i3 < length) {
                    cCharAt = str.charAt(i3);
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 >= 2) {
            char cCharAt2 = str.charAt(i60Var.d);
            char cCharAt3 = str.charAt(i60Var.d + 1);
            if (ga.o(cCharAt2) && ga.o(cCharAt3)) {
                i60Var.d((char) ((cCharAt3 - '0') + ((cCharAt2 - '0') * 10) + 130));
                i60Var.d += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt2 + cCharAt3);
            }
        }
        char cA = i60Var.a();
        int iU = ga.u(str, i60Var.d, 0);
        if (iU == 0) {
            if (!ga.q(cA)) {
                i60Var.d((char) (cA + 1));
                i60Var.d++;
                return;
            } else {
                i60Var.d((char) 235);
                i60Var.d((char) (cA - 127));
                i60Var.d++;
                return;
            }
        }
        if (iU == 1) {
            i60Var.d((char) 230);
            i60Var.e = 1;
            return;
        }
        if (iU == 2) {
            i60Var.d((char) 239);
            i60Var.e = 2;
            return;
        }
        if (iU == 3) {
            i60Var.d((char) 238);
            i60Var.e = 3;
        } else if (iU == 4) {
            i60Var.d((char) 240);
            i60Var.e = 4;
        } else if (iU != 5) {
            uq1.q("Illegal mode: ".concat(String.valueOf(iU)));
        } else {
            i60Var.d((char) 231);
            i60Var.e = 5;
        }
    }

    @Override // defpackage.n90
    public Object j() {
        try {
            return new ll1(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e2) {
            sm0.n(e2);
            return null;
        }
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 19:
                xn3 xn3Var = (xn3) vf3Var.c;
                if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    e.g(ts.j("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ", xn3Var.B()));
                    return null;
                }
                try {
                    ek3 ek3VarU = ek3.u(xn3Var.A(), wr2.b);
                    if (ek3VarU.w() != 0) {
                        tv2.f("Only version 0 parameters are accepted");
                        return null;
                    }
                    nl1 nl1VarB = sz2.b();
                    nl1VarB.o(ek3VarU.t());
                    nl1VarB.a = c43.a(xn3Var.z());
                    return nl1VarB.n();
                } catch (ks2 e2) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e2);
                }
            default:
                xn3 xn3Var2 = (xn3) vf3Var.c;
                if (!xn3Var2.B().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    e.g(ts.j("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ", xn3Var2.B()));
                    return null;
                }
                try {
                    fi3 fi3VarU = fi3.u(xn3Var2.A(), wr2.b);
                    u23 u23VarB = pg3.b();
                    u23VarB.i(fi3VarU.t());
                    u23VarB.k(fi3VarU.y().t());
                    u23VarB.d = hh3.a(xn3Var2.z());
                    return u23VarB.g();
                } catch (ks2 e3) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e3);
                }
        }
    }

    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) {
        na2 j10Var;
        int i3 = 3;
        int i4 = 1;
        int i5 = 0;
        int i6 = 8;
        int i7 = 2;
        switch (ts.v(i2)) {
            case 0:
                j10Var = new j10(i3);
                break;
            case 1:
                j10Var = new pn();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                j10Var = new ln0(i7);
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                j10Var = new ln0(i3);
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                j10Var = new ln0(i4);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                j10Var = new w40(4);
                break;
            case oc1.STRING_SET_FIELD_NUMBER /* 6 */:
                j10Var = new j40(i4);
                break;
            case oc1.DOUBLE_FIELD_NUMBER /* 7 */:
                j10Var = new j40(i5);
                break;
            case oc1.BYTES_FIELD_NUMBER /* 8 */:
                j10Var = new ln0(i5);
                break;
            case 9:
            case 12:
            case 13:
            default:
                e.g("No encoder available for format ".concat(ts.w(i2)));
                return null;
            case 10:
                j10Var = new op0(i6);
                break;
            case 11:
                j10Var = new gp1(i6);
                break;
            case 14:
                j10Var = new pv2(21);
                break;
            case 15:
                j10Var = new j40(i7);
                break;
        }
        return j10Var.m(str, i2, enumMap);
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        if (!((String) wf3Var.c).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            e.g("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
            return null;
        }
        try {
            po3 po3VarU = po3.u((jr2) wf3Var.e, wr2.b);
            if (po3VarU.t() == 0) {
                return a03.I(new c03(po3VarU.x().x(), i03.a((ip3) wf3Var.f)), (Integer) wf3Var.i);
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(po3VarU)));
        } catch (ks2 e2) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e2);
        }
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(4, "measurement.gbraid_campaign.campaign_params_triggering_info_update", "gclid,gbraid,gad_campaignid").get();
            case 12:
            default:
                return new Boolean(((Boolean) xp2.b.get()).booleanValue());
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.minimum_delay", 500L, 28).get();
            case 14:
                List list3 = h13.a;
                fq2.b.get();
                return (String) gq2.a.E(5, "measurement.test.string_flag", "---").get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_bundle_size", 65536L, 66).get()).longValue());
        }
    }

    @Override // defpackage.mh
    public void f() {
    }

    @Override // defpackage.mh
    public void d(int i2) {
    }
}
