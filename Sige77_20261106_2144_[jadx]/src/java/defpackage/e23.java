package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.measurement.internal.zzr;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class e23 extends k13 {
    public final long W;
    public List X;
    public String Y;
    public final String Z;
    public int a0;
    public String b0;
    public String c;
    public String c0;
    public String d;
    public long d0;
    public int e;
    public String e0;
    public String f;
    public String i;
    public long v;
    public final long w;

    public e23(y53 y53Var, long j, long j2, String str) {
        super(y53Var);
        this.d0 = 0L;
        this.e0 = null;
        this.w = j;
        this.W = j2;
        this.Z = str;
    }

    @Override // defpackage.k13
    public final boolean H() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026e A[Catch: NameNotFoundException -> 0x0276, TRY_LEAVE, TryCatch #4 {NameNotFoundException -> 0x0276, blocks: (B:98:0x0268, B:100:0x026e), top: B:136:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0271 A[PHI: r5 r37
      0x0271: PHI (r5v16 int) = (r5v15 int), (r5v17 int) binds: [B:104:0x0276, B:99:0x026c] A[DONT_GENERATE, DONT_INLINE]
      0x0271: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x0276, B:99:0x026c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:118:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:121:0x030f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0152 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0134  */
    /* JADX WARN: Code duplicated, block: B:44:0x0138  */
    /* JADX WARN: Code duplicated, block: B:57:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0205  */
    /* JADX WARN: Code duplicated, block: B:78:0x0208  */
    /* JADX WARN: Code duplicated, block: B:87:0x022f  */
    /* JADX WARN: Code duplicated, block: B:91:0x023c  */
    /* JADX WARN: Code duplicated, block: B:92:0x023e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0259  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final zzr I(String str) {
        String str2;
        long j;
        boolean z;
        long j2;
        boolean zA;
        boolean z2;
        boolean z3;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jA;
        long jMin;
        Boolean boolR;
        boolean z4;
        boolean z5;
        boolean z6;
        String str4;
        Boolean boolR2;
        boolean zBooleanValue;
        y53 y53Var;
        String strK;
        boolean z7;
        int i;
        int i2;
        long j3;
        ApplicationInfo applicationInfoA;
        f13 f13Var;
        long j4;
        int extensionVersion;
        long jB0;
        D();
        String strK2 = K();
        String strL = L();
        F();
        String str5 = this.d;
        F();
        long j5 = this.e;
        F();
        gu2.o(this.f);
        String str6 = this.f;
        y53 y53Var2 = (y53) this.a;
        is2 is2Var = y53Var2.d;
        c33 c33Var = y53Var2.f;
        is2 is2Var2 = y53Var2.d;
        Context context = y53Var2.a;
        qf3 qf3Var = y53Var2.w;
        h43 h43Var = y53Var2.e;
        is2Var.K();
        F();
        D();
        long j6 = this.v;
        if (j6 == 0) {
            y53.j(qf3Var);
            y53 y53Var3 = (y53) qf3Var.a;
            String packageName = context.getPackageName();
            qf3Var.D();
            gu2.l(packageName);
            PackageManager packageManager = context.getPackageManager();
            z = false;
            MessageDigest messageDigestX = qf3.X();
            long jY = -1;
            if (messageDigestX == null) {
                c33 c33Var2 = y53Var3.f;
                y53.l(c33Var2);
                c33Var2.f.a("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (qf3Var.m0(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            jY = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = la2.a(context).b(64, y53Var3.a.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        c33 c33Var3 = y53Var3.f;
                                        y53.l(c33Var3);
                                        c33Var3.w.a("Could not get signatures");
                                    } else {
                                        jY = qf3.Y(messageDigestX.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    c33 c33Var4 = y53Var3.f;
                                    y53.l(c33Var4);
                                    c33Var4.f.b(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                c33 c33Var5 = y53Var3.f;
                                y53.l(c33Var5);
                                c33Var5.f.b(e, "Package name not found");
                                j2 = 0;
                                this.v = j2;
                                zA = y53Var2.a();
                                y53.j(h43Var);
                                z2 = !h43Var.e0;
                                D();
                                if (y53Var2.a()) {
                                    if (is2Var2.P(null, h13.H0)) {
                                        y53.l(c33Var);
                                        c33Var.a0.a("Disabled IID for tests.");
                                        z3 = zA;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z3 = zA;
                                            } else {
                                                z3 = zA;
                                                try {
                                                    Object[] objArr = {context};
                                                    str3 = null;
                                                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            y53.l(c33Var);
                                                            c33Var.X.a("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    y53.l(c33Var);
                                                    c33Var.W.a("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z3 = zA;
                                    str3 = null;
                                }
                                y53.j(h43Var);
                                jA = h43Var.f.a();
                                long j7 = j2;
                                jMin = y53Var2.q0;
                                if (jA != 0) {
                                    jMin = Math.min(jMin, jA);
                                }
                                F();
                                int i3 = this.a0;
                                boolR = is2Var2.R("google_analytics_adid_collection_enabled");
                                if (boolR != null) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                y53.j(h43Var);
                                h43Var.D();
                                long j8 = jMin;
                                boolean z8 = h43Var.I().getBoolean("deferred_analytics_collection", z);
                                if (is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true) != l73.GRANTED) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z5);
                                List list = this.X;
                                String strG = h43Var.L().g();
                                if (this.Y == null) {
                                    y53.j(qf3Var);
                                    this.Y = qf3Var.B0();
                                }
                                String str7 = this.Y;
                                if (h43Var.L().i(n73.ANALYTICS_STORAGE)) {
                                    D();
                                    if (this.d0 == 0) {
                                        z6 = z2;
                                    } else {
                                        y53Var2.X.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.d0;
                                        z6 = z2;
                                        if (this.c0 != null) {
                                            J();
                                        }
                                    }
                                    if (this.c0 == null) {
                                        J();
                                    }
                                    str4 = this.c0;
                                } else {
                                    z6 = z2;
                                    str4 = null;
                                }
                                boolR2 = is2Var2.R("google_analytics_sgtm_upload_enabled");
                                if (boolR2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolR2.booleanValue();
                                }
                                y53.j(qf3Var);
                                y53Var = (y53) qf3Var.a;
                                String str8 = str4;
                                strK = K();
                                boolean z9 = zBooleanValue;
                                if (y53Var.a.getPackageManager() == null) {
                                    z7 = z4;
                                    j3 = 0;
                                } else {
                                    try {
                                        z7 = z4;
                                        i = 0;
                                        try {
                                            applicationInfoA = la2.a(y53Var.a).a(0, strK);
                                            if (applicationInfoA != null) {
                                                i2 = applicationInfoA.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            c33 c33Var6 = y53Var.f;
                                            y53.l(c33Var6);
                                            c33Var6.Y.b(strK, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z7 = z4;
                                        i = 0;
                                    }
                                    j3 = i2;
                                }
                                y53.j(h43Var);
                                int i4 = h43Var.L().b;
                                y53.j(h43Var);
                                h43Var.D();
                                String str9 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).b;
                                hq2.a();
                                f13Var = h13.P0;
                                if (is2Var2.P(null, f13Var)) {
                                    y53.j(qf3Var);
                                    j4 = j3;
                                    if (Build.VERSION.SDK_INT < 30) {
                                    }
                                    hq2.a();
                                    if (is2Var2.P(null, f13Var)) {
                                        y53.j(qf3Var);
                                        jB0 = qf3Var.b0();
                                    } else {
                                        jB0 = 0;
                                    }
                                    String str10 = is2Var2.c;
                                    String strValueOf = String.valueOf(p73.h(is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true)));
                                    long j9 = jB0;
                                    long j10 = y53Var2.q0;
                                    y53.i(y53Var2.h0);
                                    return new zzr(strK2, strL, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.w, list, strG, str7, str8, z9, j4, i4, str9, extensionVersion, j9, str10, strValueOf, j10, ck1.m(y53Var2.h0.J()), is2Var2.P(null, h13.e1) ? y53Var2.r0 : 0L);
                                }
                                j4 = j3;
                                extensionVersion = 0;
                                hq2.a();
                                if (is2Var2.P(null, f13Var)) {
                                    y53.j(qf3Var);
                                    jB0 = qf3Var.b0();
                                } else {
                                    jB0 = 0;
                                }
                                String str11 = is2Var2.c;
                                String strValueOf2 = String.valueOf(p73.h(is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j11 = jB0;
                                long j12 = y53Var2.q0;
                                y53.i(y53Var2.h0);
                                return new zzr(strK2, strL, str2, j, str6, 161000L, j7, str, z3, z6, str3, j8, i3, z7, z8, boolValueOf, this.w, list, strG, str7, str8, z9, j4, i4, str9, extensionVersion, j11, str11, strValueOf2, j12, ck1.m(y53Var2.h0.J()), is2Var2.P(null, h13.e1) ? y53Var2.r0 : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.v = j2;
            }
            j2 = jY;
            this.v = j2;
        } else {
            str2 = str5;
            j = j5;
            z = false;
            j2 = j6;
        }
        zA = y53Var2.a();
        y53.j(h43Var);
        z2 = !h43Var.e0;
        D();
        if (y53Var2.a()) {
            z3 = zA;
            str3 = null;
        } else {
            if (is2Var2.P(null, h13.H0)) {
                y53.l(c33Var);
                c33Var.a0.a("Disabled IID for tests.");
                z3 = zA;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z3 = zA;
                } else {
                    z3 = zA;
                    Object[] objArr2 = {context};
                    str3 = null;
                    objInvoke = clsLoadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        y53.j(h43Var);
        jA = h43Var.f.a();
        long j13 = j2;
        jMin = y53Var2.q0;
        if (jA != 0) {
            jMin = Math.min(jMin, jA);
        }
        F();
        int i5 = this.a0;
        boolR = is2Var2.R("google_analytics_adid_collection_enabled");
        if (boolR != null || boolR.booleanValue()) {
            z4 = true;
        } else {
            z4 = z;
        }
        y53.j(h43Var);
        h43Var.D();
        long j14 = jMin;
        boolean z10 = h43Var.I().getBoolean("deferred_analytics_collection", z);
        if (is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true) != l73.GRANTED) {
            z5 = true;
        } else {
            z5 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z5);
        List list2 = this.X;
        String strG2 = h43Var.L().g();
        if (this.Y == null) {
            y53.j(qf3Var);
            this.Y = qf3Var.B0();
        }
        String str12 = this.Y;
        if (h43Var.L().i(n73.ANALYTICS_STORAGE)) {
            z6 = z2;
            str4 = null;
        } else {
            D();
            if (this.d0 == 0) {
                z6 = z2;
            } else {
                y53Var2.X.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.d0;
                z6 = z2;
                if (this.c0 != null && jCurrentTimeMillis2 > 86400000 && this.e0 == null) {
                    J();
                }
            }
            if (this.c0 == null) {
                J();
            }
            str4 = this.c0;
        }
        boolR2 = is2Var2.R("google_analytics_sgtm_upload_enabled");
        if (boolR2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolR2.booleanValue();
        }
        y53.j(qf3Var);
        y53Var = (y53) qf3Var.a;
        String str13 = str4;
        strK = K();
        boolean z11 = zBooleanValue;
        if (y53Var.a.getPackageManager() == null) {
            z7 = z4;
            j3 = 0;
        } else {
            z7 = z4;
            i = 0;
            applicationInfoA = la2.a(y53Var.a).a(0, strK);
            if (applicationInfoA != null) {
                i2 = applicationInfoA.targetSdkVersion;
            } else {
                i2 = i;
            }
            j3 = i2;
        }
        y53.j(h43Var);
        int i6 = h43Var.L().b;
        y53.j(h43Var);
        h43Var.D();
        String str14 = pu2.b(h43Var.I().getString("dma_consent_settings", null)).b;
        hq2.a();
        f13Var = h13.P0;
        if (is2Var2.P(null, f13Var)) {
            y53.j(qf3Var);
            j4 = j3;
            if (Build.VERSION.SDK_INT < 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
            hq2.a();
            if (is2Var2.P(null, f13Var)) {
                y53.j(qf3Var);
                jB0 = qf3Var.b0();
            } else {
                jB0 = 0;
            }
            String str15 = is2Var2.c;
            String strValueOf3 = String.valueOf(p73.h(is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true)));
            long j15 = jB0;
            long j16 = y53Var2.q0;
            y53.i(y53Var2.h0);
            return new zzr(strK2, strL, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.w, list2, strG2, str12, str13, z11, j4, i6, str14, extensionVersion, j15, str15, strValueOf3, j16, ck1.m(y53Var2.h0.J()), is2Var2.P(null, h13.e1) ? y53Var2.r0 : 0L);
        }
        j4 = j3;
        extensionVersion = 0;
        hq2.a();
        if (is2Var2.P(null, f13Var)) {
            y53.j(qf3Var);
            jB0 = qf3Var.b0();
        } else {
            jB0 = 0;
        }
        String str16 = is2Var2.c;
        String strValueOf4 = String.valueOf(p73.h(is2Var2.U("google_analytics_default_allow_ad_personalization_signals", true)));
        long j17 = jB0;
        long j18 = y53Var2.q0;
        y53.i(y53Var2.h0);
        return new zzr(strK2, strL, str2, j, str6, 161000L, j13, str, z3, z6, str3, j14, i5, z7, z10, boolValueOf2, this.w, list2, strG2, str12, str13, z11, j4, i6, str14, extensionVersion, j17, str16, strValueOf4, j18, ck1.m(y53Var2.h0.J()), is2Var2.P(null, h13.e1) ? y53Var2.r0 : 0L);
    }

    public final void J() {
        String str;
        D();
        y53 y53Var = (y53) this.a;
        h43 h43Var = y53Var.e;
        c33 c33Var = y53Var.f;
        y53.j(h43Var);
        if (h43Var.L().i(n73.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            qf3 qf3Var = y53Var.w;
            y53.j(qf3Var);
            qf3Var.D0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            y53.l(c33Var);
            c33Var.Z.a("Analytics Storage consent is not granted");
            str = null;
        }
        y53.l(c33Var);
        c33Var.Z.a("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.c0 = str;
        y53Var.X.getClass();
        this.d0 = System.currentTimeMillis();
    }

    public final String K() {
        F();
        gu2.o(this.c);
        return this.c;
    }

    public final String L() {
        D();
        F();
        gu2.o(this.b0);
        return this.b0;
    }
}
