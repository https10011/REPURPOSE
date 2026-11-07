package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import com.facebook.login.i;
import com.hjq.toast.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j10 implements na2, vi1, ak, r70, hv2, ze3, ff3, yc3, kr3 {
    public static UUID b;
    public static i d;
    public static j10 f;
    public final /* synthetic */ int a;
    public static final j10 c = new j10(1);
    public static final j10 e = new j10(2);
    public static final /* synthetic */ j10 i = new j10(10);
    public static final /* synthetic */ j10 v = new j10(11);
    public static final /* synthetic */ j10 w = new j10(12);
    public static final /* synthetic */ j10 W = new j10(13);
    public static final /* synthetic */ j10 X = new j10(14);
    public static final /* synthetic */ j10 Y = new j10(15);
    public static final /* synthetic */ j10 Z = new j10(16);
    public static final /* synthetic */ j10 a0 = new j10(18);

    public j10(ContextWrapper contextWrapper) {
        UUID uuidE;
        this.a = 0;
        if (b == null) {
            synchronized (j10.class) {
                try {
                    if (b == null) {
                        SharedPreferences sharedPreferences = contextWrapper.getSharedPreferences("device_stats.xml", 0);
                        String string = sharedPreferences.getString("device_id", null);
                        if (string != null) {
                            uuidE = UUID.fromString(string);
                        } else {
                            String string2 = Settings.Secure.getString(contextWrapper.getContentResolver(), "android_id");
                            if (Intrinsics.areEqual("9774d56d682e549c", string2)) {
                                uuidE = e();
                            } else {
                                string2.getClass();
                                Charset charset = StandardCharsets.UTF_8;
                                charset.getClass();
                                byte[] bytes = string2.getBytes(charset);
                                bytes.getClass();
                                uuidE = UUID.nameUUIDFromBytes(bytes);
                            }
                        }
                        b = uuidE;
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.putString("device_id", String.valueOf(b));
                        editorEdit.apply();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static UUID e() {
        String str = "serial";
        int length = Build.BOARD.length() % 10;
        int length2 = Build.BRAND.length() % 10;
        String[] strArr = Build.SUPPORTED_ABIS;
        strArr.getClass();
        String str2 = strArr.length == 0 ? null : strArr[0];
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        String str3 = "35" + length + length2 + (str2.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
        try {
            String str4 = Build.SERIAL;
            str4.getClass();
            String str5 = str4.length() > 0 ? str4 : null;
            if (str5 != null) {
                str = str5;
            }
        } catch (Exception unused) {
        }
        return new UUID(str3.hashCode(), str.hashCode());
    }

    @Override // defpackage.kr3
    public /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // defpackage.g60
    public boolean b(Object obj, File file, da1 da1Var) throws Throwable {
        try {
            kj.d(((ri0) ((li0) ((pi1) obj).get()).a.b).a.d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e2) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e2);
            return false;
        }
    }

    @Override // defpackage.ff3
    public vf3 c(dx2 dx2Var) {
        oz2 oz2Var = (oz2) dx2Var;
        j33.c(oz2Var);
        vn3 vn3VarT = xn3.t();
        vn3VarT.i("type.googleapis.com/google.crypto.tink.AesGcmKey");
        wj3 wj3VarX = xj3.x();
        int i2 = oz2Var.a;
        wj3VarX.f();
        ((xj3) wj3VarX.b).zze = i2;
        vn3VarT.j(((xj3) wj3VarX.d()).b());
        vn3VarT.h(j33.b(oz2Var.d));
        return vf3.f((xn3) vn3VarT.d());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x000f A[Catch: all -> 0x0008, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:14:0x0013 A[Catch: all -> 0x0008, TryCatch #0 {, blocks: (B:4:0x0003, B:12:0x000f, B:14:0x0013, B:15:0x001e), top: B:20:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000c A[DONT_GENERATE] */
    /* JADX WARN: Instruction removed from duplicated block: B:9:0x000c, please report this as an issue */
    public synchronized i d(Context context) {
        if (context != null) {
            if (context == null) {
                return null;
            }
            if (d == null) {
                d = new i(context, i90.b());
            }
            return d;
        }
        context = i90.a();
        if (context == null) {
            return null;
        }
        if (d == null) {
            d = new i(context, i90.b());
        }
        return d;
        throw th;
    }

    @Override // defpackage.vi1
    public int h(da1 da1Var) {
        return 1;
    }

    @Override // defpackage.ze3
    public dx2 k(vf3 vf3Var) throws GeneralSecurityException {
        switch (this.a) {
            case 17:
                xn3 xn3Var = (xn3) vf3Var.c;
                if (!xn3Var.B().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                    e.g(ts.j("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ", xn3Var.B()));
                    return null;
                }
                try {
                    return new c03(wo3.u(xn3Var.A(), wr2.b).x(), i03.a(xn3Var.z()));
                } catch (ks2 e2) {
                    throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e2);
                }
            default:
                xn3 xn3Var2 = (xn3) vf3Var.c;
                if (!xn3Var2.B().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    e.g(ts.j("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ", xn3Var2.B()));
                    return null;
                }
                try {
                    if (dq3.u(xn3Var2.A(), wr2.b).t() == 0) {
                        return new f23(q63.a(xn3Var2.z()));
                    }
                    tv2.f("Only version 0 parameters are accepted");
                    return null;
                } catch (ks2 e3) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e3);
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // defpackage.na2
    public hh m(String str, int i2, EnumMap enumMap) {
        char c2;
        int i3;
        int i4;
        int i5;
        gh ghVarH;
        int i6;
        int iAbs;
        int i7;
        gh ghVarI;
        int i8;
        int i9;
        int i10;
        LinkedList linkedListA;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        c60 c60Var = c60.b;
        if (enumMap.containsKey(c60Var)) {
            charsetForName = Charset.forName(enumMap.get(c60Var).toString());
        }
        c60 c60Var2 = c60.a;
        int i11 = enumMap.containsKey(c60Var2) ? Integer.parseInt(enumMap.get(c60Var2).toString()) : 33;
        c60 c60Var3 = c60.W;
        int i12 = enumMap.containsKey(c60Var3) ? Integer.parseInt(enumMap.get(c60Var3).toString()) : 0;
        int i13 = 1;
        if (i2 != 1) {
            e.g("Can only encode AZTEC, but got ".concat(ts.w(i2)));
            return null;
        }
        byte[] bytes = str.getBytes(charsetForName);
        int[] iArr = sp0.a;
        List<jt1> listSingletonList = Collections.singletonList(jt1.e);
        int i14 = 0;
        while (true) {
            int i15 = 2;
            int i16 = 4;
            c2 = '\n';
            i3 = 3;
            if (i14 >= bytes.length) {
                break;
            }
            int i17 = i14 + 1;
            byte b2 = i17 < bytes.length ? bytes[i17] : (byte) 0;
            byte b3 = bytes[i14];
            if (b3 != 13) {
                if (b3 != 44) {
                    if (b3 != 46) {
                        if (b3 == 58 && b2 == 32) {
                            i9 = 5;
                        } else {
                            i9 = 0;
                        }
                    } else if (b2 == 32) {
                        i9 = 3;
                    } else {
                        i9 = 0;
                    }
                } else if (b2 == 32) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
            } else if (b2 == 10) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                LinkedList linkedList = new LinkedList();
                for (jt1 jt1Var : listSingletonList) {
                    jt1 jt1VarB = jt1Var.b(i14);
                    linkedList.add(jt1VarB.d(4, i9));
                    if (jt1Var.a != 4) {
                        linkedList.add(jt1VarB.e(4, i9));
                    }
                    if (i9 == 3 || i9 == 4) {
                        linkedList.add(jt1VarB.d(2, 16 - i9).d(2, i13));
                    }
                    if (jt1Var.c > 0) {
                        linkedList.add(jt1Var.a(i14).a(i17));
                    }
                }
                linkedListA = fm0.a(linkedList);
                i10 = i13;
                i14 = i17;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (jt1 jt1Var2 : listSingletonList) {
                    char c3 = (char) (bytes[i14] & 255);
                    int[][] iArr2 = fm0.c;
                    int i18 = jt1Var2.a;
                    int i19 = iArr2[i18][c3] > 0 ? i13 : 0;
                    jt1 jt1VarB2 = null;
                    int i20 = 0;
                    while (i20 <= i16) {
                        int i21 = i13;
                        int i22 = iArr2[i20][c3];
                        if (i22 > 0) {
                            if (jt1VarB2 == null) {
                                jt1VarB2 = jt1Var2.b(i14);
                            }
                            jt1 jt1Var3 = jt1VarB2;
                            if (i19 == 0 || i20 == i18 || i20 == i15) {
                                linkedList2.add(jt1Var3.d(i20, i22));
                            }
                            if (i19 == 0 && fm0.d[i18][i20] >= 0) {
                                linkedList2.add(jt1Var3.e(i20, i22));
                            }
                            jt1VarB2 = jt1Var3;
                        }
                        i20++;
                        i13 = i21;
                        i15 = 2;
                        i16 = 4;
                    }
                    int i23 = i13;
                    if (jt1Var2.c > 0 || iArr2[i18][c3] == 0) {
                        linkedList2.add(jt1Var2.a(i14));
                    }
                    i13 = i23;
                    i15 = 2;
                    i16 = 4;
                }
                i10 = i13;
                linkedListA = fm0.a(linkedList2);
            }
            listSingletonList = linkedListA;
            i14++;
            i13 = i10;
        }
        int i24 = i13;
        jt1 jt1Var4 = (jt1) Collections.min(listSingletonList, new rs(2));
        jt1Var4.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (fy1 fy1Var = jt1Var4.b(bytes.length).b; fy1Var != null; fy1Var = fy1Var.a) {
            linkedList3.addFirst(fy1Var);
        }
        gh ghVar = new gh();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((fy1) it.next()).a(ghVar, bytes);
        }
        int i25 = ghVar.b;
        int i26 = ((i11 * i25) / 100) + 11;
        int i27 = i25 + i26;
        if (i12 != 0) {
            i6 = i12 < 0 ? i24 : 0;
            iAbs = Math.abs(i12);
            if (iAbs > (i6 != 0 ? 4 : 32)) {
                e.g(ts.g(i12, "Illegal value ", " for layers"));
                return null;
            }
            i7 = ((i6 != 0 ? 88 : 112) + (iAbs << 4)) * iAbs;
            i5 = iArr[iAbs];
            int i28 = i7 - (i7 % i5);
            ghVarH = sp0.H(ghVar, i5);
            int i29 = ghVarH.b;
            if (i26 + i29 > i28) {
                e.g("Data to large for user specified layer");
                return null;
            }
            if (i6 != 0 && i29 > (i5 << 6)) {
                e.g("Data to large for user specified layer");
                return null;
            }
        } else {
            gh ghVarH2 = null;
            int i30 = 0;
            int i31 = 0;
            while (true) {
                if (i30 > 32) {
                    e.g("Data too large for an Aztec code");
                    return null;
                }
                int i32 = i30 <= i3 ? i24 : 0;
                int i33 = i32 != 0 ? i30 + 1 : i30;
                int i34 = ((i32 != 0 ? 88 : 112) + (i33 << 4)) * i33;
                if (i27 <= i34) {
                    if (ghVarH2 == null || i31 != iArr[i33]) {
                        i4 = iArr[i33];
                        ghVarH2 = sp0.H(ghVar, i4);
                    } else {
                        i4 = i31;
                    }
                    int i35 = i34 - (i34 % i4);
                    if ((i32 == 0 || ghVarH2.b <= (i4 << 6)) && ghVarH2.b + i26 <= i35) {
                        i5 = i4;
                        ghVarH = ghVarH2;
                        i6 = i32;
                        iAbs = i33;
                        i7 = i34;
                        break;
                    }
                    i31 = i4;
                }
                i30++;
                c2 = c2;
                i3 = 3;
            }
        }
        gh ghVarI2 = sp0.i(ghVarH, i7, i5);
        int i36 = ghVarH.b / i5;
        gh ghVar2 = new gh();
        if (i6 != 0) {
            ghVar2.d(iAbs - 1, 2);
            ghVar2.d(i36 - 1, 6);
            ghVarI = sp0.i(ghVar2, 28, 4);
        } else {
            ghVar2.d(iAbs - 1, 5);
            ghVar2.d(i36 - 1, 11);
            ghVarI = sp0.i(ghVar2, 40, 4);
        }
        int i37 = (i6 == 0 ? 14 : 11) + (iAbs << 2);
        int[] iArr3 = new int[i37];
        if (i6 != 0) {
            for (int i38 = 0; i38 < i37; i38++) {
                iArr3[i38] = i38;
            }
            i8 = i37;
        } else {
            int i39 = i37 / 2;
            i8 = (((i39 - 1) / 15) * 2) + i37 + 1;
            int i40 = i8 / 2;
            for (int i41 = 0; i41 < i39; i41++) {
                int i42 = (i41 / 15) + i41;
                iArr3[(i39 - i41) - 1] = (i40 - i42) - 1;
                iArr3[i39 + i41] = i42 + i40 + 1;
            }
        }
        hh hhVar = new hh(i8, i8);
        int i43 = 0;
        for (int i44 = 0; i44 < iAbs; i44++) {
            int i45 = ((iAbs - i44) << 2) + (i6 != 0 ? 9 : 12);
            for (int i46 = 0; i46 < i45; i46++) {
                int i47 = i46 << 1;
                for (int i48 = 0; i48 < 2; i48++) {
                    if (ghVarI2.g(i43 + i47 + i48)) {
                        int i49 = i44 << 1;
                        hhVar.d(iArr3[i49 + i48], iArr3[i49 + i46]);
                    }
                    if (ghVarI2.g((i45 << 1) + i43 + i47 + i48)) {
                        int i50 = i44 << 1;
                        hhVar.d(iArr3[i50 + i46], iArr3[((i37 - 1) - i50) - i48]);
                    }
                    if (ghVarI2.g((i45 << 2) + i43 + i47 + i48)) {
                        int i51 = (i37 - 1) - (i44 << 1);
                        hhVar.d(iArr3[i51 - i48], iArr3[i51 - i46]);
                    }
                    if (ghVarI2.g((i45 * 6) + i43 + i47 + i48)) {
                        int i52 = i44 << 1;
                        hhVar.d(iArr3[((i37 - 1) - i52) - i46], iArr3[i52 + i48]);
                    }
                }
            }
            i43 += i45 << 3;
        }
        int i53 = i8 / 2;
        if (i6 != 0) {
            for (int i54 = 0; i54 < 7; i54++) {
                int i55 = (i53 - 3) + i54;
                if (ghVarI.g(i54)) {
                    hhVar.d(i55, i53 - 5);
                }
                if (ghVarI.g(i54 + 7)) {
                    hhVar.d(i53 + 5, i55);
                }
                if (ghVarI.g(20 - i54)) {
                    hhVar.d(i55, i53 + 5);
                }
                if (ghVarI.g(27 - i54)) {
                    hhVar.d(i53 - 5, i55);
                }
            }
        } else {
            for (int i56 = 0; i56 < 10; i56++) {
                int i57 = (i56 / 5) + (i53 - 5) + i56;
                if (ghVarI.g(i56)) {
                    hhVar.d(i57, i53 - 7);
                }
                if (ghVarI.g(i56 + 10)) {
                    hhVar.d(i53 + 7, i57);
                }
                if (ghVarI.g(29 - i56)) {
                    hhVar.d(i57, i53 + 7);
                }
                if (ghVarI.g(39 - i56)) {
                    hhVar.d(i53 - 7, i57);
                }
            }
        }
        if (i6 != 0) {
            sp0.g(hhVar, i53, 5);
        } else {
            sp0.g(hhVar, i53, 7);
            int i58 = 0;
            int i59 = 0;
            while (i58 < (i37 / 2) - 1) {
                for (int i60 = i53 & 1; i60 < i8; i60 += 2) {
                    int i61 = i53 - i59;
                    hhVar.d(i61, i60);
                    int i62 = i53 + i59;
                    hhVar.d(i62, i60);
                    hhVar.d(i60, i61);
                    hhVar.d(i60, i62);
                }
                i58 += 15;
                i59 += 16;
            }
        }
        int i63 = hhVar.a;
        int iMax = Math.max(200, i63);
        int i64 = hhVar.b;
        int iMax2 = Math.max(200, i64);
        int iMin = Math.min(iMax / i63, iMax2 / i64);
        int i65 = (iMax - (i63 * iMin)) / 2;
        int i66 = (iMax2 - (i64 * iMin)) / 2;
        hh hhVar2 = new hh(iMax, iMax2);
        int i67 = 0;
        while (i67 < i64) {
            int i68 = i65;
            int i69 = 0;
            while (i69 < i63) {
                if (hhVar.c(i69, i67)) {
                    hhVar2.f(i68, i66, iMin, iMin);
                }
                i69++;
                i68 += iMin;
            }
            i67++;
            i66 += iMin;
        }
        return hhVar2;
    }

    @Override // defpackage.ak
    public void n(wj wjVar, gj1 gj1Var) {
        kv.F("log submit: {}", Boolean.valueOf(gj1Var.a.d0));
    }

    @Override // defpackage.yc3
    public zi0 o(wf3 wf3Var) throws GeneralSecurityException {
        String str = (String) wf3Var.c;
        if (!str.equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            e.g(ts.j("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: ", str));
            return null;
        }
        try {
            gn3 gn3VarU = gn3.u((jr2) wf3Var.e, wr2.b);
            if (gn3VarU.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            ln3 ln3VarZ = gn3VarU.z();
            if (ln3VarZ.t() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            v83 v83VarA = y83.a((ip3) wf3Var.f, ln3VarZ.y());
            t83 t83Var = v83VarA.a;
            return x83.I(d93.I(v83VarA, y83.c(t83Var, ln3VarZ.B().o()), (Integer) wf3Var.i), new ox1(tr3.a(xi0.F(lb3.a(t83Var), xi0.E(gn3VarU.A().o())))));
        } catch (ks2 unused) {
            tv2.f("Parsing HpkePrivateKey failed");
            return null;
        }
    }

    @Override // defpackage.ak
    public void r(wj wjVar, Throwable th) {
        kv.F("log submit: {}", th.getLocalizedMessage());
    }

    @Override // defpackage.hv2
    /* JADX INFO: renamed from: zza */
    public Object mo5zza() {
        switch (this.a) {
            case 11:
                return new Boolean(((Boolean) np2.a.get()).booleanValue());
            case 12:
                List list = h13.a;
                vo2.b.get();
                return (String) xo2.a.E(45, "measurement.sgtm.upload.backoff_http_codes", "404,429,503,504").get();
            case 13:
                List list2 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.upload.interval", 3600000L, 65).get();
            case 14:
                List list3 = h13.a;
                vo2.b.get();
                return (Long) xo2.a.z("measurement.service_client.idle_disconnect_millis", 5000L, 36).get();
            case 15:
                List list4 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.dma_consent.max_daily_dcu_realtime_events", 1L, 18).get()).longValue());
            case 16:
                List list5 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.rb.attribution.notify_app_delay_millis", 3000L, 30).get()).longValue());
            default:
                List list6 = h13.a;
                vo2.b.get();
                return Integer.valueOf((int) ((Long) xo2.a.z("measurement.upload.max_events_per_day", 100000L, 71).get()).longValue());
        }
    }

    public /* synthetic */ j10(int i2) {
        this.a = i2;
    }
}
